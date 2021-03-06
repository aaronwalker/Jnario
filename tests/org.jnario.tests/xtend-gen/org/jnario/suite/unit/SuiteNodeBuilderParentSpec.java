package org.jnario.suite.unit;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Extension;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteNodeBuilderParentSpecExamples;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("parent")
public class SuiteNodeBuilderParentSpec extends SuiteNodeBuilderSpec {
  @Inject
  @Extension
  public SuiteNodeBuilder _suiteNodeBuilder;
  
  @Before
  public void _initSuiteNodeBuilderParentSpecExamples() {
    
    List<Suite> _suites = this.suites("#0", "#1");
    List<Suite> _suites_1 = this.suites("#0", "##1");
    List<Suite> _suites_2 = this.suites("#0", "###1");
    List<Suite> _suites_3 = this.suites("#0", "#1", "###2");examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("suites", "position", "parent"), 
      new SuiteNodeBuilderParentSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"#1\")", "0", "null"), _suites, 0, null),
      new SuiteNodeBuilderParentSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"##1\")", "1", "\"#0\""), _suites_1, 1, "#0"),
      new SuiteNodeBuilderParentSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"###1\")", "1", "\"#0\""), _suites_2, 1, "#0"),
      new SuiteNodeBuilderParentSpecExamples(  java.util.Arrays.asList("suites(\"#0\", \"#1\", \"###2\")", "2", "\"#1\""), _suites_3, 2, "#1")
    );
  }
  
  protected ExampleTable<SuiteNodeBuilderParentSpecExamples> examples;
  
  @Test
  @Named("parent is suite with less hashes")
  @Order(99)
  public void parentIsSuiteWithLessHashes() throws Exception {
    final Procedure1<SuiteNodeBuilderParentSpecExamples> _function = new Procedure1<SuiteNodeBuilderParentSpecExamples>() {
        public void apply(final SuiteNodeBuilderParentSpecExamples it) {
          Suite _parent = SuiteNodeBuilderParentSpec.this._suiteNodeBuilder.parent(it.suites, it.position);
          String _name = _parent==null?(String)null:_parent.getName();
          boolean _should_be = Should.should_be(_name, it.parent);
          Assert.assertTrue("\nExpected parent(suites, position)?.name should be parent but"
           + "\n     parent(suites, position)?.name is " + new StringDescription().appendValue(_name).toString()
           + "\n     parent(suites, position) is " + new StringDescription().appendValue(_parent).toString()
           + "\n      is " + new StringDescription().appendValue(SuiteNodeBuilderParentSpec.this._suiteNodeBuilder).toString()
           + "\n     suites is " + new StringDescription().appendValue(it.suites).toString()
           + "\n     position is " + new StringDescription().appendValue(it.position).toString()
           + "\n     parent is " + new StringDescription().appendValue(it.parent).toString() + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<SuiteNodeBuilderParentSpecExamples>forEach(this.examples, _function);
  }
}
