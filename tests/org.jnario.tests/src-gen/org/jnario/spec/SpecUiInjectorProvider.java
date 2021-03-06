/*******************************************************************************
 * Copyright (c) 2012 BMW Car IT and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/*
* generated by Xtext
*/
package org.jnario.spec;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class SpecUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return org.jnario.spec.ui.internal.SpecActivator.getInstance().getInjector("org.jnario.spec.Spec");
	}
	
}
