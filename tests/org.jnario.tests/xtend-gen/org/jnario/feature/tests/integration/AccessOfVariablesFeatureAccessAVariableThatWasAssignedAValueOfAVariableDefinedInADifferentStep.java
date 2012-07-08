package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable that was assigned a value of a variable defined in a different step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableThatWasAssignedAValueOfAVariableDefinedInADifferentStep {
  @Test
  @Order(0)
  @Named("When I have a complex usage of variables")
  public void whenIHaveAComplexUsageOfVariables() {
      StepArguments _stepArguments = new StepArguments("\r\n\t\t\t\tpackage bootstrap3\r\n\t\t\t\tFeature: Variable test\r\n\t\t\t\t\tScenario: Some scenario\r\n\t\t\t\t\t\tint x\r\n\t\t\t\t\t\tint y\r\n\t\t\t\t\t\tGiven a step with a variable\r\n\t\t\t\t\t\t\tx = 3\r\n\t\t\t\t\t\tWhen I assign it a different value\r\n\t\t\t\t\t\t\ty = x\r\n\t\t\t\t\t\tThen y should be 3\r\n\t\t\t\t\t\t\ty => 3\r\n\t\t\t");
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
