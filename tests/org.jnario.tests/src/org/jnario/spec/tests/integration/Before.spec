/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
 package org.jnario.spec.tests.integration

import static org.jnario.jnario.test.util.ResultMatchers.*


import static extension org.jnario.jnario.test.util.SpecExecutor.*
import org.jnario.runner.CreateWith
import org.jnario.jnario.test.util.SpecTestCreator
import org.jnario.jnario.test.util.BehaviorExecutor
import com.google.inject.Inject


/**
 * @author Sebastian Benz - Initial contribution and API
 */
@CreateWith(typeof(SpecTestCreator))
describe "Before" {
 	@Inject extension BehaviorExecutor
	fact "should be executed before each test"{
		val spec = '
			package bootstrap
			 
			import org.jnario.runner.Order
			
			describe "Before"{
				
				static int beforeExecutionCount = 0
				
				before{
					beforeExecutionCount = beforeExecutionCount + 1
				}

				fact "should be executed before each test (1)"{
					beforeExecutionCount should be 1
				}	

				fact "should be executed before each test (2)"{
					beforeExecutionCount should be 2
				}	
			}
		'
		spec.executesSuccessfully
	}

}