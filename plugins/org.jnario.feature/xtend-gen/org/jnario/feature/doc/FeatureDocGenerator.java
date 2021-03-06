package org.jnario.feature.doc;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import java.util.Arrays;
import java.util.regex.Matcher;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend.core.xtend.XtendClass;
import org.eclipse.xtend.core.xtend.XtendMember;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.jnario.doc.AbstractDocGenerator;
import org.jnario.doc.HtmlFile;
import org.jnario.feature.feature.Background;
import org.jnario.feature.feature.Feature;
import org.jnario.feature.feature.Scenario;
import org.jnario.feature.feature.Step;
import org.jnario.feature.jvmmodel.StepArgumentsProvider;
import org.jnario.feature.naming.FeatureClassNameProvider;
import org.jnario.feature.naming.StepNameProvider;
import org.jnario.util.Strings;

@SuppressWarnings("all")
public class FeatureDocGenerator extends AbstractDocGenerator {
  @Inject
  private FeatureClassNameProvider _featureClassNameProvider;
  
  @Inject
  private StepNameProvider _stepNameProvider;
  
  public HtmlFile createHtmlFile(final XtendClass xtendClass) {
    boolean _not = (!(xtendClass instanceof Feature));
    if (_not) {
      return HtmlFile.EMPTY_FILE;
    }
    final Feature feature = ((Feature) xtendClass);
    final Procedure1<HtmlFile> _function = new Procedure1<HtmlFile>() {
        public void apply(final HtmlFile it) {
          String _className = FeatureDocGenerator.this._featureClassNameProvider.getClassName(feature);
          it.setName(_className);
          String _name = feature.getName();
          it.setTitle(_name);
          CharSequence _generateContent = FeatureDocGenerator.this.generateContent(feature);
          it.setContent(_generateContent);
          String _root = FeatureDocGenerator.this.root(feature);
          it.setRootFolder(_root);
        }
      };
    return HtmlFile.newHtmlFile(_function);
  }
  
  public CharSequence generateContent(final Feature feature) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<p>");
    String _description = feature.getDescription();
    String _markdown2Html = _description==null?(String)null:this.markdown2Html(_description);
    _builder.append(_markdown2Html, "");
    _builder.append("</p>");
    _builder.newLineIfNotEmpty();
    {
      Background _background = feature.getBackground();
      boolean _notEquals = (!Objects.equal(_background, null));
      if (_notEquals) {
        Background _background_1 = feature.getBackground();
        CharSequence _generate = this.generate(_background_1);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<Scenario> _scenarios = feature.getScenarios();
      for(final Scenario scenario : _scenarios) {
        CharSequence _generate_1 = this.generate(scenario);
        _builder.append(_generate_1, "");
        _builder.newLineIfNotEmpty();
      }
    }
    {
      EList<XtendMember> _members = feature.getMembers();
      for(final XtendMember member : _members) {
        CharSequence _generate_2 = this.generate(member);
        _builder.append(_generate_2, "");
        _builder.newLineIfNotEmpty();
      }
    }
    return _builder;
  }
  
  protected CharSequence _generate(final Scenario scenario) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<h3 ");
    String _name = scenario.getName();
    String _id = this.id(_name);
    _builder.append(_id, "");
    _builder.append(">");
    String _name_1 = scenario.getName();
    _builder.append(_name_1, "");
    _builder.append("</h3>");
    _builder.newLineIfNotEmpty();
    EList<Step> _steps = scenario.getSteps();
    Iterable<Step> _filter = Iterables.<Step>filter(_steps, Step.class);
    CharSequence _generate = this.generate(_filter);
    _builder.append(_generate, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  protected CharSequence _generate(final Iterable<Step> steps) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<ul>");
    _builder.newLine();
    {
      for(final Step step : steps) {
        _builder.append("<li>");
        CharSequence _generate = this.generate(step);
        _builder.append(_generate, "");
        _builder.newLineIfNotEmpty();
        EList<Step> _and = step.getAnd();
        Iterable<Step> _filter = Iterables.<Step>filter(_and, Step.class);
        CharSequence _generate_1 = this.generate(_filter);
        _builder.append(_generate_1, "");
        _builder.append("</li>");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("</ul>");
    _builder.newLine();
    return _builder;
  }
  
  protected CharSequence _generate(final Step step) {
    StringConcatenation _builder = new StringConcatenation();
    String _format = this.format(step);
    _builder.append(_format, "");
    _builder.newLineIfNotEmpty();
    return _builder;
  }
  
  private String format(final Step step) {
    String result = this._stepNameProvider.describe(step);
    String _highlighFirstWord = this.highlighFirstWord(result);
    result = _highlighFirstWord;
    String _highlightArguments = this.highlightArguments(result);
    result = _highlightArguments;
    String _markdown2Html = this.markdown2Html(result);
    result = _markdown2Html;
    CharSequence _addCodeBlock = this.addCodeBlock(step);
    String _plus = (result + _addCodeBlock);
    result = _plus;
    return result;
  }
  
  private String highlightArguments(final String s) {
    String _plus = (" " + s);
    Matcher _matcher = StepArgumentsProvider.ARG_PATTERN.matcher(_plus);
    String _replaceAll = _matcher.replaceAll("<code>$0</code>");
    return _replaceAll;
  }
  
  private String highlighFirstWord(final String s) {
    String _firstWord = Strings.getFirstWord(s);
    String _plus = ("(" + _firstWord);
    String _plus_1 = (_plus + ")");
    String _replaceFirst = s.replaceFirst(_plus_1, "<strong>$1</strong>");
    return _replaceFirst;
  }
  
  private CharSequence addCodeBlock(final Step step) {
    final String text = this._stepNameProvider.nameOf(step);
    final int multiLineStart = text.indexOf("\n");
    int _minus = (-1);
    boolean _equals = (multiLineStart == _minus);
    if (_equals) {
      return "";
    }
    String _substring = text.substring(multiLineStart);
    String codeBlock = _substring.trim();
    int _length = StepArgumentsProvider.MULTILINE_STRING.length();
    int _length_1 = codeBlock.length();
    int _length_2 = StepArgumentsProvider.MULTILINE_STRING.length();
    int _minus_1 = (_length_1 - _length_2);
    String _substring_1 = codeBlock.substring(_length, _minus_1);
    codeBlock = _substring_1;
    String _codeToHtml = this.codeToHtml(codeBlock);
    codeBlock = _codeToHtml;
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<pre>");
    _builder.append(codeBlock, "");
    _builder.append("</pre>");
    return _builder;
  }
  
  public CharSequence generate(final Object scenario) {
    if (scenario instanceof Scenario) {
      return _generate((Scenario)scenario);
    } else if (scenario instanceof Step) {
      return _generate((Step)scenario);
    } else if (scenario instanceof Iterable) {
      return _generate((Iterable<Step>)scenario);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(scenario).toString());
    }
  }
}
