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
@Named("Scenario: Referencing variables that contain a value from args")
@SuppressWarnings("all")
public class StepParametersFeatureReferencingVariablesThatContainAValueFromArgs {
  @Test
  @Order(0)
  @Named("When I have a scenario that references a step with arguments")
  public void whenIHaveAScenarioThatReferencesAStepWithArguments() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\t\tpackage bootstrap \n\t\t\t\tFeature: Test feature\n\t\t\t\t\tScenario: using fields in step definitions\n\t\t\t\t\t\tString x\n\t\t\t\t\t\tString y \n\t\t\t\t\t\tGiven the value \"hello\"\n\t\t\t\t\t\t\tx = args.first\n\t\t\t\t\t\tWhen I add \" world\"\n\t\t\t\t\t\t\ty = x + args.first\n\t\t\t\t\t\tThen it should be \"hello world\"\n\t\t\t\t\t\t\ty should be args.first\n\t\t\t\t\t\t\t\n\t\t\t");
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
