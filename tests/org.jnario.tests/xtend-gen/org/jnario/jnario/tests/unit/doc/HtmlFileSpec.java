package org.jnario.jnario.tests.unit.doc;

import org.eclipse.xtend2.lib.StringConcatenation;
import org.hamcrest.StringDescription;
import org.jnario.doc.HtmlFile;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("HtmlFile")
public class HtmlFileSpec {
  @Subject
  public HtmlFile subject;
  
  @Test
  @Named("ddd")
  @Order(99)
  public void ddd() throws Exception {
    this.subject.setContent("My Content");
    this.subject.setName("MyFile.html");
    this.subject.setRootFolder("../");
    this.subject.setTitle("My Title");
    CharSequence _text = this.subject.toText();
    String _string = _text.toString();
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<!DOCTYPE html>");
    _builder.newLine();
    _builder.append("<html lang=\"en\">");
    _builder.newLine();
    _builder.append("<head>");
    _builder.newLine();
    _builder.append("<meta charset=\"utf-8\">");
    _builder.newLine();
    _builder.append("<title>My Title</title>");
    _builder.newLine();
    _builder.append("<meta name=\"description\" content=\"\">");
    _builder.newLine();
    _builder.append("<meta name=\"author\" content=\"Jnario\">");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->");
    _builder.newLine();
    _builder.append("<!--[if lt IE 9]>");
    _builder.newLine();
    _builder.append("      ");
    _builder.append("<script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>");
    _builder.newLine();
    _builder.append("    ");
    _builder.append("<![endif]-->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<!-- Le styles -->");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"../css/bootstrap-responsive.min.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"../css/custom.css\">");
    _builder.newLine();
    _builder.append("<link rel=\"stylesheet\" href=\"../css/prettify.css\">");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\" src=\"../js/prettify.js\"></script>");
    _builder.newLine();
    _builder.append("<script type=\"text/javascript\" src=\"../js/lang-jnario.js\"></script>");
    _builder.newLine();
    _builder.append("</head>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("<body onload=\"prettyPrint()\">");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<div class=\"container\">");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<div class=\"content\">");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"page-header\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<h1>My Title</h1>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<div class=\"row\">");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("<div class=\"span12\">");
    _builder.newLine();
    _builder.append("My Content");
    _builder.newLine();
    _builder.append("\t\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</div> <!-- /content -->");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("<footer>");
    _builder.newLine();
    _builder.append("\t\t\t");
    _builder.append("<p><small>Generated by <a href=\"http://www.jnario.org\">Jnario</a>.</small></p>");
    _builder.newLine();
    _builder.append("\t\t");
    _builder.append("</footer>");
    _builder.newLine();
    _builder.newLine();
    _builder.append("\t");
    _builder.append("</div>");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("<!-- /container -->");
    _builder.newLine();
    _builder.newLine();
    _builder.append("</body>");
    _builder.newLine();
    _builder.append("</html>");
    _builder.newLine();
    String _string_1 = _builder.toString();
    boolean _doubleArrow = Should.operator_doubleArrow(_string, _string_1);
    Assert.assertTrue("\nExpected subject.toText.toString => \'\'\'\n\t\t\t\t<!DOCTYPE html>\n\t\t\t\t<html lang=\"en\">\n\t\t\t\t<head>\n\t\t\t\t<meta charset=\"utf-8\">\n\t\t\t\t<title>My Title</title>\n\t\t\t\t<meta name=\"description\" content=\"\">\n\t\t\t\t<meta name=\"author\" content=\"Jnario\">\n\t\t\t\t\n\t\t\t\t<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->\n\t\t\t\t<!--[if lt IE 9]>\n\t\t\t\t      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n\t\t\t\t    <![endif]-->\n\t\t\t\t\n\t\t\t\t<!-- Le styles -->\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap-responsive.min.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/custom.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/prettify.css\">\n\t\t\t\t<script type=\"text/javascript\" src=\"../js/prettify.js\"></script>\n\t\t\t\t<script type=\"text/javascript\" src=\"../js/lang-jnario.js\"></script>\n\t\t\t\t</head>\n\t\t\t\t\n\t\t\t\t<body onload=\"prettyPrint()\">\n\t\t\t\t\t<div class=\"container\">\n\t\t\t\t\t\t<div class=\"content\">\n\t\t\t\t\t\t\t<div class=\"page-header\">\n\t\t\t\t\t\t\t\t<h1>My Title</h1>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t\t\t<div class=\"span12\">\n\t\t\t\tMy Content\n\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div> <!-- /content -->\n\t\t\t\t\t\t<footer>\n\t\t\t\t\t\t\t<p><small>Generated by <a href=\"http://www.jnario.org\">Jnario</a>.</small></p>\n\t\t\t\t\t\t</footer>\n\t\t\t\t\n\t\t\t\t\t</div>\n\t\t\t\t\t<!-- /container -->\n\t\t\t\t\n\t\t\t\t</body>\n\t\t\t\t</html>\n\t\t\'\'\'.toString but"
     + "\n     subject.toText.toString is " + new StringDescription().appendValue(_string).toString()
     + "\n     subject.toText is " + new StringDescription().appendValue(_text).toString()
     + "\n     subject is " + new StringDescription().appendValue(this.subject).toString()
     + "\n     \'\'\'\n\t\t\t\t<!DOCTYPE html>\n\t\t\t\t<html lang=\"en\">\n\t\t\t\t<head>\n\t\t\t\t<meta charset=\"utf-8\">\n\t\t\t\t<title>My Title</title>\n\t\t\t\t<meta name=\"description\" content=\"\">\n\t\t\t\t<meta name=\"author\" content=\"Jnario\">\n\t\t\t\t\n\t\t\t\t<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->\n\t\t\t\t<!--[if lt IE 9]>\n\t\t\t\t      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n\t\t\t\t    <![endif]-->\n\t\t\t\t\n\t\t\t\t<!-- Le styles -->\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap-responsive.min.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/custom.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/prettify.css\">\n\t\t\t\t<script type=\"text/javascript\" src=\"../js/prettify.js\"></script>\n\t\t\t\t<script type=\"text/javascript\" src=\"../js/lang-jnario.js\"></script>\n\t\t\t\t</head>\n\t\t\t\t\n\t\t\t\t<body onload=\"prettyPrint()\">\n\t\t\t\t\t<div class=\"container\">\n\t\t\t\t\t\t<div class=\"content\">\n\t\t\t\t\t\t\t<div class=\"page-header\">\n\t\t\t\t\t\t\t\t<h1>My Title</h1>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t\t\t<div class=\"span12\">\n\t\t\t\tMy Content\n\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div> <!-- /content -->\n\t\t\t\t\t\t<footer>\n\t\t\t\t\t\t\t<p><small>Generated by <a href=\"http://www.jnario.org\">Jnario</a>.</small></p>\n\t\t\t\t\t\t</footer>\n\t\t\t\t\n\t\t\t\t\t</div>\n\t\t\t\t\t<!-- /container -->\n\t\t\t\t\n\t\t\t\t</body>\n\t\t\t\t</html>\n\t\t\'\'\'.toString is " + new StringDescription().appendValue(_string_1).toString()
     + "\n     \'\'\'\n\t\t\t\t<!DOCTYPE html>\n\t\t\t\t<html lang=\"en\">\n\t\t\t\t<head>\n\t\t\t\t<meta charset=\"utf-8\">\n\t\t\t\t<title>My Title</title>\n\t\t\t\t<meta name=\"description\" content=\"\">\n\t\t\t\t<meta name=\"author\" content=\"Jnario\">\n\t\t\t\t\n\t\t\t\t<!-- Le HTML5 shim, for IE6-8 support of HTML elements -->\n\t\t\t\t<!--[if lt IE 9]>\n\t\t\t\t      <script src=\"http://html5shim.googlecode.com/svn/trunk/html5.js\"></script>\n\t\t\t\t    <![endif]-->\n\t\t\t\t\n\t\t\t\t<!-- Le styles -->\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap.min.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/bootstrap-responsive.min.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/custom.css\">\n\t\t\t\t<link rel=\"stylesheet\" href=\"../css/prettify.css\">\n\t\t\t\t<script type=\"text/javascript\" src=\"../js/prettify.js\"></script>\n\t\t\t\t<script type=\"text/javascript\" src=\"../js/lang-jnario.js\"></script>\n\t\t\t\t</head>\n\t\t\t\t\n\t\t\t\t<body onload=\"prettyPrint()\">\n\t\t\t\t\t<div class=\"container\">\n\t\t\t\t\t\t<div class=\"content\">\n\t\t\t\t\t\t\t<div class=\"page-header\">\n\t\t\t\t\t\t\t\t<h1>My Title</h1>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t<div class=\"row\">\n\t\t\t\t\t\t\t\t<div class=\"span12\">\n\t\t\t\tMy Content\n\t\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t\t</div>\n\t\t\t\t\t\t</div> <!-- /content -->\n\t\t\t\t\t\t<footer>\n\t\t\t\t\t\t\t<p><small>Generated by <a href=\"http://www.jnario.org\">Jnario</a>.</small></p>\n\t\t\t\t\t\t</footer>\n\t\t\t\t\n\t\t\t\t\t</div>\n\t\t\t\t\t<!-- /container -->\n\t\t\t\t\n\t\t\t\t</body>\n\t\t\t\t</html>\n\t\t\'\'\' is " + new StringDescription().appendValue(_builder).toString() + "\n", _doubleArrow);
    
  }
}
