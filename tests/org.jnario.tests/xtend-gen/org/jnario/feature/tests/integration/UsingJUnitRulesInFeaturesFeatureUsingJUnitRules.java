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
@Named("Scenario: Using JUnit Rules")
@SuppressWarnings("all")
public class UsingJUnitRulesInFeaturesFeatureUsingJUnitRules {
  @Test
  @Order(0)
  @Named("When I have a feature with JUnit rules")
  public void whenIHaveAFeatureWithJUnitRules() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\tpackage demo\n\t\t\t\timport org.junit.Rule\n\t\t\t\timport org.junit.rules.TemporaryFolder\n\t\t\t\t\n\t\t\t\tFeature:  JUnit Rules\n\t\t\t\t\n\t\t\t\t\tScenario: Using rules in a Feature\n\t\t\t\t\t\t@Rule public val folder = new TemporaryFolder\n\t\t\t\t\t\n\t\t\t\t\t\tGiven a feature with a rule\n\t\t\t\t\t\tThen the rule should be initialized\n\t\t\t\t\t\t\tfolder.root should not be null\t\n\t\t\t");
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
