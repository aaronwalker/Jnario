/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.ui.launching;

import java.util.Set;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendFile;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.common.types.JvmIdentifiableElement;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelAssociations;
import org.eclipse.xtext.xbase.ui.launching.JavaElementDelegateJunitLaunch;

import com.google.inject.Inject;

/**
 * @author Sebastian Benz - Initial contribution and API
 */
@SuppressWarnings("restriction")
public class SuiteJavaElementDelegate extends JavaElementDelegateJunitLaunch {

	@Inject
	private IJvmModelAssociations associations;

	@Override
	protected boolean containsElementsSearchedFor(IFile file) {
		return true;
	}
	
	@Override
	protected JvmIdentifiableElement findAssociatedJvmElement(EObject element) {
		if (element == null)
			return null;
		if (element instanceof XtendFile) {
			XtendFile specFile = (XtendFile) element;
			if(!specFile.getXtendClasses().isEmpty()){
				element = specFile.getXtendClasses().get(0);
			}
		}else{
			element = EcoreUtil2.getContainerOfType(element, XtendClass.class);
		}
		Set<EObject> elements = associations.getJvmElements(element);
		if (elements.isEmpty()) {
			return findAssociatedJvmElement(element.eContainer());
		}
		return super.findAssociatedJvmElement(element);
	}
}
