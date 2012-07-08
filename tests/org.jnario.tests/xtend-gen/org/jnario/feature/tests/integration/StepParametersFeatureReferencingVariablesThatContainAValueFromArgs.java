package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
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
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap \r\n\t\t\t\tFeature: Test feature\r\n\t\t\t\t\tScenario: using fields in step definitions\r\n\t\t\t\t\t\tString x\r\n\t\t\t\t\t\tString y \r\n\t\t\t\t\t\tGiven the value \"hello\"\r\n\t\t\t\t\t\t\tx = args.first\r\n\t\t\t\t\t\tWhen I add \" world\"\r\n\t\t\t\t\t\t\ty = x + args.first\r\n\t\t\t\t\t\tThen it should be \"hello world\"\r\n\t\t\t\t\t\t\ty should be args.first\r\n\t\t\t\t\t\t\t\r\n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = args.first();
      this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.executesSuccessfully(jnarioFile);
  }
  
  CharSequence jnarioFile;
}
