/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.spec.validation;

import static com.google.common.base.Strings.isNullOrEmpty;
import static com.google.common.collect.Maps.newHashMap;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.validation.IssueCodes;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendField;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtend.core.xtend.XtendImport;
import org.eclipse.xtext.CrossReference;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.ComposedChecks;
import org.eclipse.xtext.xbase.XExpression;
import org.jnario.ExampleColumn;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecPackage;
import org.jnario.spec.spec.TestFunction;
import org.jnario.validation.JnarioJavaValidator;

import com.google.inject.Inject;
 
/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
@ComposedChecks(validators={JnarioJavaValidator.class})
public class SpecJavaValidator extends AbstractSpecJavaValidator {
	
	@Inject
	private ExampleNameProvider exampleNameProvider;
	
	@Override
	public void checkLocalUsageOfDeclaredFields(XtendField field) {
		if(!(field instanceof ExampleColumn)){
			super.checkLocalUsageOfDeclaredFields(field);
		}
	}
	
	@Check
	public void checkExamplesHaveNames(TestFunction example){
		String methodName = exampleNameProvider.toMethodName(example);
		if(isNullOrEmpty(methodName)){
			error("Name must not be empty", SpecPackage.Literals.TEST_FUNCTION__NAME);
		}
	}
	
	protected void mustBeJavaStatementExpression(XExpression expr) {
		// disabled as this is the case for example definitions
	}
	
	@Override
	protected void checkNoJavaKeyword(EObject obj, EAttribute attribute) {
		if (obj instanceof ExampleGroup) {
			return;
		}
		super.checkNoJavaKeyword(obj, attribute);
	}
	
	@Check
	public void checkImports(XtendFile file) {
		final Map<JvmType, XtendImport> imports = newHashMap();
		final Map<JvmType, XtendImport> staticImports = newHashMap();
		final Map<String, JvmType> importedNames = newHashMap();
		
		for (XtendImport imp : file.getImports()) {
			if (imp.getImportedNamespace() != null) {
				warning("The use of wildcard imports is deprecated.", imp, null, IssueCodes.IMPORT_WILDCARD_DEPRECATED);
			} else {
				JvmType importedType = imp.getImportedType();
				if (importedType != null && !importedType.eIsProxy()) {
					Map<JvmType, XtendImport> map = imp.isStatic() ? staticImports : imports;
					if (map.containsKey(importedType)) {
						warning("Duplicate import of '" + importedType.getSimpleName() + "'.", imp, null,
								IssueCodes.IMPORT_DUPLICATE);
					} else {
						map.put(importedType, imp);
						if (!imp.isStatic()) {
							JvmType currentType = importedType;
							String currentSuffix = currentType.getSimpleName();
							JvmType collidingImport = importedNames.put(currentSuffix, importedType);
							if(collidingImport != null)
								error("The import '" + importedType.getIdentifier() + "' collides with the import '" 
										+ collidingImport.getIdentifier() + "'.", imp, null, IssueCodes.IMPORT_COLLISION);
							while (currentType.eContainer() instanceof JvmType) {
								currentType = (JvmType) currentType.eContainer();
								currentSuffix = currentType.getSimpleName()+"$"+currentSuffix;
								JvmType collidingImport2 = importedNames.put(currentSuffix, importedType);
								if(collidingImport2 != null)
									error("The import '" + importedType.getIdentifier() + "' collides with the import '" 
											+ collidingImport2.getIdentifier() + "'.", imp, null, IssueCodes.IMPORT_COLLISION);
							}
						}
					}
				}
			}
		}

		for (final XtendClass xtendClass : file.getXtendClasses()) {
			String clazzName = exampleNameProvider.toJavaClassName(xtendClass);
			if(importedNames.containsKey(clazzName)){
				JvmType importedType = importedNames.get(clazzName);
				if(importedType != null){
					XtendImport xtendImport = imports.get(importedType);
					if(xtendImport != null)
						error("The import '" + importedType.getIdentifier() + "' conflicts with a type defined in the same file", xtendImport, null, IssueCodes.IMPORT_CONFLICT );
				}
			}
			ICompositeNode node = NodeModelUtils.findActualNodeFor(xtendClass);
			if (node != null) {
				for (INode n : node.getAsTreeIterable()) {
					if (n.getGrammarElement() instanceof CrossReference) {
						EClassifier classifier = ((CrossReference) n.getGrammarElement()).getType().getClassifier();
						if (classifier instanceof EClass
								&& (TypesPackage.Literals.JVM_TYPE.isSuperTypeOf((EClass) classifier) || TypesPackage.Literals.JVM_CONSTRUCTOR
										.isSuperTypeOf((EClass) classifier))) {
							String simpleName = n.getText().trim();
							// handle StaticQualifier Workaround (see Xbase grammar)
							if (simpleName.endsWith("::"))
								simpleName = simpleName.substring(0, simpleName.length() - 2);
							if (importedNames.containsKey(simpleName)) {
								JvmType type = importedNames.remove(simpleName);
								imports.remove(type);
							} else {
								while (simpleName.contains("$")) {
									simpleName = simpleName.substring(0, simpleName.lastIndexOf('$'));
									if (importedNames.containsKey(simpleName)) {
										imports.remove(importedNames.remove(simpleName));
										break;
									}
								}
							}
						}
					}
				}
			}
		}
		for (XtendImport imp : imports.values()) {
			warning("The import '" + imp.getImportedTypeName() + "' is never used.", imp, null,
					IssueCodes.IMPORT_UNUSED);
		}
	}
}
