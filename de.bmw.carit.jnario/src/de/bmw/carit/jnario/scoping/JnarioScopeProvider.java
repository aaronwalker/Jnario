/*
 * generated by Xtext
 */
package de.bmw.carit.jnario.scoping;

import static com.google.common.collect.Iterators.filter;
import static org.eclipse.xtext.EcoreUtil2.getContainerOfType;
import static org.eclipse.xtext.scoping.Scopes.scopeFor;

import java.util.ArrayList;
import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.xbase.XVariableDeclaration;
import org.eclipse.xtext.xbase.scoping.LocalVariableScopeContext;
import org.eclipse.xtext.xtend2.scoping.Xtend2ScopeProvider;

import com.google.common.collect.Iterators;

import de.bmw.carit.jnario.jnario.And;
import de.bmw.carit.jnario.jnario.Background;
import de.bmw.carit.jnario.jnario.Feature;
import de.bmw.carit.jnario.jnario.Given;
import de.bmw.carit.jnario.jnario.Jnario;
import de.bmw.carit.jnario.jnario.Scenario;
import de.bmw.carit.jnario.jnario.Then;
import de.bmw.carit.jnario.jnario.When;

/**
 * This class contains custom scoping description.
 * 
 * see : http://www.eclipse.org/Xtext/documentation/latest/xtext.html#scoping
 * on how and when to use it 
 *
 */
public class JnarioScopeProvider extends Xtend2ScopeProvider {
	
//	@Override
//	protected IScope createLocalVarScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
//		EObject context = scopeContext.getContext();
//		if (context instanceof Given || context instanceof When || context instanceof Then || context instanceof And) {
//			return stepScope(parentScope, scopeContext);
//		}
//		return super.createLocalVarScope(parentScope, scopeContext);
//	}

//	private IScope stepScope(IScope parentScope, LocalVariableScopeContext scopeContext) {
//		EObject context = scopeContext.getContext();
//		Scenario scenario = getContainerOfType(context, Scenario.class);
//		Iterator<EObject> eAllContents;
//		Iterator<XVariableDeclaration> scenarioVariables;
//		ArrayList<XVariableDeclaration> variables = new ArrayList<XVariableDeclaration>();
//		if(scenario != null){
//			eAllContents = scenario.eAllContents();
//			scenarioVariables = filter(eAllContents, XVariableDeclaration.class);
//			Iterators.addAll(variables, scenarioVariables);
//		}
//		Jnario jnario = getContainerOfType(context, Jnario.class);
//		Feature feature = (Feature) jnario.getXtendClass();
//		if(feature.getBackground() != null){
//			Background background = feature.getBackground();
//			eAllContents = background.eAllContents();
//			Iterator<XVariableDeclaration> backgroundVariables = filter(eAllContents, XVariableDeclaration.class);
//			Iterators.addAll(variables, backgroundVariables);
//		}
//		return scopeFor(variables);
//	}
}