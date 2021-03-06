package org.jnario.feature.tests.unit.naming;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.feature.tests.unit.naming.StepNameProviderSpec;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("^describe")
public class StepNameProviderDescribeSpec extends StepNameProviderSpec {
  @Test
  @Named("removes multilines parameters")
  @Order(99)
  public void removesMultilinesParameters() throws Exception {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("Scenario: MyScenario 2");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("Given a step with multiline parameter");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("\"the parameter\"");
    _builder.newLine();
    _builder.append("\t ");
    _builder.append("1 + 1 => 2");
    _builder.newLine();
    this.parseScenario(_builder);
    String _describeStep = this.describeStep();
    boolean _doubleArrow = Should.operator_doubleArrow(_describeStep, "Given a step with multiline parameter");
    Assert.assertTrue("\nExpected describeStep => \'Given a step with multiline parameter\' but"
     + "\n     describeStep is " + new StringDescription().appendValue(_describeStep).toString() + "\n", _doubleArrow);
    
  }
}
