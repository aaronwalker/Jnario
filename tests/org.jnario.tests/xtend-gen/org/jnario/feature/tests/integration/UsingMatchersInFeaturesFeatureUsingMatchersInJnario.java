package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Using Matchers in Jnario")
@SuppressWarnings("all")
public class UsingMatchersInFeaturesFeatureUsingMatchersInJnario {
  @Test
  @Order(0)
  @Named("When I have a scenario which uses the Jnario matchers")
  public void whenIHaveAScenarioWhichUsesTheJnarioMatchers() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\tFeature: Should\n\t\t\t\t\t\n\t\t\t\t\tScenario: Features with should\n\t\t\t\t\t\t\n\t\t\t\t\t\tGiven a Scenario\n\t\t\t\t\t\tThen it should be possible to use \"should\"\n\t\t\t\t\t\t\ttrue should be true\n\t\t\t\t\t\t\t1 + 1 should not be 1\n\t\t\t\t\t\t\t\"something\" should not be null \n\t\t\t\t\t\tAnd the shortcut \"=>\"\n\t\t\t\t\t\t\t1 + 1 => 2 \n\t\t\t\t\t\t\t\"a string\" => typeof(String)\n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
