/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.suite.unit

import com.google.inject.Inject
import org.jnario.jnario.test.util.ModelStore
import org.jnario.suite.suite.Suite
import org.jnario.suite.suite.SuiteFactory
import org.jnario.suite.jvmmodel.SuiteClassNameProvider
import org.jnario.suite.jvmmodel.SpecResolver
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SuiteTestCreator

@CreateWith(typeof(SuiteTestCreator))
describe SpecResolver {

	@Inject extension ModelStore m
	@Inject extension SuiteClassNameProvider
	
	before{
		parseSpec('''
			package demo
			describe "My Spec"{
				// this should be filtered
				describe "My Internal Spec"{
					
				}
			}
			describe String{
				
			}
		''')
		parseScenario('''
			package demo
			Feature: My Feature
			Scenario My Scenario
				Given nothing
				Then nothing
		''')
	}

	fact "resolves referenced specs"{
		parseSuite('''
			package demo
			import demo.*
			#My Suite
			
			- "My Spec"
			- "My Feature"
		''')
		
		resolvedSpecs(firstSuite) => set("MySpecSpec", "MyFeatureFeature")
	}
	
	describe "evaluates regular expressions"{
		fact "example 1"{
				m.parseSuite('''
				package demo
				import demo.*
				#The Suite
				
				- \demo\.My.*\
			''')
			
			resolvedSpecs(m.firstSuite) => set("MySpecSpec", "MyFeatureFeature")
		}

		fact "example 2"{
			m.parseSuite('''
				package demo
				import demo.*
				#My Suite
				
				- \.*Spec\
			''')
			
			resolvedSpecs(m.firstSuite) => set("MySpecSpec")
		}
		
		fact "returns empty list on null input"{
			subject.resolveSpecs(SuiteFactory::eINSTANCE.createPatternReference) => list()
		}
		
		fact "ignores unresolved elements"{
			m.parseSuite('''
				package demo
				import demo.*
				#My Suite
				
				- \NonExistent\
			''')
			
			resolvedSpecs(m.firstSuite) => set()
		}
		
		fact "ignores containing suite"{
			m.parseSuite('''
				package demo
				import demo.*
				#My Suite
				
				- \.*\
			''')
			
			resolvedSpecs(m.firstSuite) => set("MySpecSpec", "MyFeatureFeature", "StringSpec")
		}
	}
	
	def resolvedSpecs(Suite suite){
		subject.resolveSpecs(suite).map[className].toSet
	}

}