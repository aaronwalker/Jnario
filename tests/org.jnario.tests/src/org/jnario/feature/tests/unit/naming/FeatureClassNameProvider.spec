/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.jnario.feature.tests.unit.naming
import static org.jnario.jnario.test.util.Features.*
import org.eclipse.emf.ecore.EObject
import org.jnario.feature.feature.FeatureFactory
import org.jnario.feature.naming.FeatureClassNameProvider

import static org.jnario.feature.tests.unit.naming.FeatureClassNameProviderSpec.*

import static extension org.jnario.lib.ExampleTableIterators.*
import static extension org.jnario.lib.Should.*

describe FeatureClassNameProvider {

	static FeatureFactory factory = FeatureFactory::eINSTANCE
	
	context getClassName(Feature){
		def examples{
			| name					| expectedClassName 	|
			| null					| null					|
			| "Sample"				| "SampleFeature"		|
			| ""					| null					|
			| "  Sample"			| "SampleFeature"		|
			| "hello world"			| "HelloWorldFeature"	|
			| "$hello %& world"		| "HelloWorldFeature"	|
		}
		fact "examples work"{
			examples.forEach[
				className(feature(name)) => expectedClassName
			]
		}
	}
	
	context getClassName(Background){
		def examples{
			| name			 	| feature		| expectedClassName 				|
			| "" 		 		| "Sample"		| "SampleFeatureBackground"			|
			| "Stuff"	 		| "Ha ha"		| "HaHaFeatureStuff"	|
			| "Do Stuff"  		| "Sample"		| "SampleFeatureDoStuff" 	|
			| "% Do$% Stuff" 	| "$$Sample"	| "SampleFeatureDoStuff" 	|
		}
		fact "examples work"{
			examples.forEach[
				className(background(name, feature)) => expectedClassName
			]
		}
	}
	
	def className(EObject obj){
		subject.getClassName(obj)
	}
	
	def background(String backgroundName, String featureName){
		val result = factory.createBackground
		result.name = "Background: " + backgroundName
		val feature = feature(featureName)
		feature.background = result
		return result
	}
	
	

}