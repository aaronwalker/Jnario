package org.jnario.jnario.test.util;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.jnario.jnario.test.util.Features;
import org.jnario.spec.spec.Example;
import org.jnario.spec.spec.ExampleGroup;
import org.jnario.spec.spec.SpecFactory;

@SuppressWarnings("all")
public class Specs {
  private final static SpecFactory factory = SpecFactory.eINSTANCE;
  
  public static Example pendingExample() {
    Example _example = Specs.example("pending");
    return _example;
  }
  
  public static Example implementedExample() {
    Example _xblockexpression = null;
    {
      final Example example = Specs.example("with implementation");
      XBlockExpression _implementation = Features.implementation();
      example.setExpr(_implementation);
      _xblockexpression = (example);
    }
    return _xblockexpression;
  }
  
  public static Example example(final String name) {
    Example _xblockexpression = null;
    {
      final Example example = Specs.factory.createExample();
      example.setName(name);
      _xblockexpression = (example);
    }
    return _xblockexpression;
  }
  
  public static ExampleGroup exampleGroupWith(final Example... examples) {
    ExampleGroup _xblockexpression = null;
    {
      final ExampleGroup group = Specs.exampleGroup("with examples");
      EList<XtendMember> _members = group.getMembers();
      _members.addAll(((Collection<? extends XtendMember>)Conversions.doWrapArray(examples)));
      _xblockexpression = (group);
    }
    return _xblockexpression;
  }
  
  public static ExampleGroup exampleGroup(final String name) {
    ExampleGroup _xblockexpression = null;
    {
      final ExampleGroup group = Specs.factory.createExampleGroup();
      group.setName(name);
      _xblockexpression = (group);
    }
    return _xblockexpression;
  }
}
