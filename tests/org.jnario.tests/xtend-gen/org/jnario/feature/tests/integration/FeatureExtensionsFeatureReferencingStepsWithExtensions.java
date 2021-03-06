package org.jnario.feature.tests.integration;

import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.hamcrest.StringDescription;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with extensions")
@SuppressWarnings("all")
public class FeatureExtensionsFeatureReferencingStepsWithExtensions {
  @Test
  @Order(0)
  @Named("Given the number \"12\" as string")
  public void givenTheNumber12AsString() {
      StepArguments _stepArguments = new StepArguments("12");
      final StepArguments args = _stepArguments;
      this.numberString = JnarioIterableExtensions.<String>first(new Function0<Iterable<String>>() {
        public Iterable<String> apply() {
          StepArguments _args = args;
          return _args;
        }
      }.apply());
  }
  
  @Test
  @Order(1)
  @Named("When it is converted to int")
  public void whenItIsConvertedToInt() {
    this.number = StringConversions.toInt(numberString);
  }
  
  @Test
  @Order(2)
  @Named("Then it should be \"12\"")
  public void thenItShouldBe12() {
      StepArguments _stepArguments = new StepArguments("12");
      final StepArguments args = _stepArguments;
      StepArguments _args = args;
      String _first = JnarioIterableExtensions.<String>first(_args);
      int _int = StringConversions.toInt(_first);
      boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(number), Integer.valueOf(_int));
      Assert.assertTrue("\nExpected  but"
       + "\n      is " + new StringDescription().appendValue(Integer.valueOf(_int)).toString() + "\n", _doubleArrow);
      
  }
  
  String numberString;
  
  int number;
}
