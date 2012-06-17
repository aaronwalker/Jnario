package org.jnario.jnario.test.util;

import org.jnario.feature.FeatureInjectorProvider;
import org.jnario.feature.FeatureRuntimeModule;
import org.jnario.feature.FeatureStandaloneSetup;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ExtendedFeatureInjectorProvider extends FeatureInjectorProvider {

	protected Injector internalCreateInjector() {
		return new FeatureStandaloneSetup(){
			public Injector createInjector() {
				return Guice.createInjector(new FeatureRuntimeModule(){
					public ClassLoader bindClassLoaderToInstance() {
						return getClass().getClassLoader();
					};
				});
			}
		}.createInjectorAndDoEMFRegistration();
	}
}