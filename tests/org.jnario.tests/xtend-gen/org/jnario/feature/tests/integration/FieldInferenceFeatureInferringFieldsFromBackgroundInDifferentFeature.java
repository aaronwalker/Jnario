package org.jnario.feature.tests.integration;

import com.google.inject.Inject;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.jnario.test.util.FeatureTestCreator;
import org.jnario.jnario.test.util.ResultMatchers;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.runner.CreateWith;
import org.jnario.runner.Extension;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Inferring Fields from Background in different Feature")
@CreateWith(value = FeatureTestCreator.class)
@SuppressWarnings("all")
public class FieldInferenceFeatureInferringFieldsFromBackgroundInDifferentFeature {
  @Test
  @Order(0)
  @Named("When I have a feature")
  public void whenIHaveAFeature() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\tFeature: Feature 1\n\t\t\t\tBackground:\n\t\t\t\t\tString myString\n\t\t\t\t\n\t\t\t\tScenario: My Scenario\n\t\t\t\t\tGiven a string \"value\"\n\t\t\t\t\t\tmyString = args.first\n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      this.feature1 = _first;
  }
  
  @Test
  @Order(1)
  @Named("And another feature")
  public void andAnotherFeature() {
      StepArguments _stepArguments = new StepArguments("\n\t\t\tFeature: Feature 2\n\t\t\t\tScenario: My Scenario 2\n\t\t\t\t\tGiven a string \"test\"\n\t\t\t\t\tThen my string is \"test\"\n\t\t\t\t\t\tmyString => args.first   \n\t\t\t");
      final StepArguments args = _stepArguments;
      String _first = JnarioIterableExtensions.<String>first(args);
      this.feature2 = _first;
  }
  
  @Test
  @Order(2)
  @Named("Then both should execute successfully")
  public void thenBothShouldExecuteSuccessfully() {
      Result _execute = runner.execute(feature1);
      Matcher<Result> _isSuccessful = ResultMatchers.isSuccessful();
      boolean _doubleArrow = Should.operator_doubleArrow(_execute, _isSuccessful);
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(_execute).toString() + "\n", _doubleArrow);
      
      Result _execute_1 = runner.execute(feature2);
      Matcher<Result> _isSuccessful_1 = ResultMatchers.isSuccessful();
      boolean _doubleArrow_1 = Should.operator_doubleArrow(_execute_1, _isSuccessful_1);
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(_execute_1).toString() + "\n", _doubleArrow_1);
      
  }
  
  @Inject
  @Extension
  public FeatureExecutor _featureExecutor;
  
  @Inject
  FeatureExecutor runner;
  
  CharSequence feature1;
  
  CharSequence feature2;
}
