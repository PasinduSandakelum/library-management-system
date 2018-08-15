package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class AddMainClass_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("        <title>Add Main Classifications</title>\n");
      out.write("\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\t\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("        <script src=\"js/jquery.js\"></script>\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("        <script src=\"js/validator.js\"></script>\n");
      out.write("        <script src=\"js/validator.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\t\t\n");
      out.write("            <nav class=\"navbar navbar-default navbar-fixed-top\" role=\"navigation\">\n");
      out.write("                <div class=\"navigation\">\n");
      out.write("                    <div class=\"container\">\t\t\t\t\t\n");
      out.write("                        <div class=\"navbar-header\">\n");
      out.write("                            <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse.collapse\">\n");
      out.write("                                <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                                <span class=\"icon-bar\"></span>\n");
      out.write("                            </button>\n");
      out.write("                            <div class=\"navbar-brand\">\n");
      out.write("                                <a href=\"index.html\"><h1><span>Library</span>System</h1></a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"navbar-collapse collapse\">\t\t\t\t\t\t\t\n");
      out.write("                            <div class=\"menu\">\n");
      out.write("                                <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("                                    <li class=\"dropdown\">\n");
      out.write("                                        <a id=\"dLabel\" role=\"button\" class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\" href=\"index.html\">\n");
      out.write("                                            <span class=\"glyphicon glyphicon-home\">&nbsp;Home</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"dropdown\">\n");
      out.write("                                        <a id=\"dLabel\" role=\"button\" class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\" href=\"book.html\">\n");
      out.write("                                            Books<span class=\"caret\"></span>\n");
      out.write("                                        </a>\n");
      out.write("                                        <ul class=\"dropdown-menu\">\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"AddBook.jsp\">Add Books</a></li>\n");
      out.write("                                            <li><a tabindex=\"-1\" href=\"SearchBook.jsp\">Search Books</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li class=\"dropdown\">\n");
      out.write("                                        <a id=\"dLabel\" role=\"button\" class=\"btn btn-primary dropdown-toggle\" type=\"button\" data-toggle=\"dropdown\" href=\"classification.html\">\n");
      out.write("                                            Classifications<span class=\"caret\"></span>\n");
      out.write("                                        </a>\n");
      out.write("                                        <ul class=\"dropdown-menu multi-level\" role=\"menu\" aria-labelledby=\"dropdownMenu\">\n");
      out.write("\n");
      out.write("                                            <li class=\"dropdown-submenu\">\n");
      out.write("                                                <a class=\"test\" tabindex=\"-1\" href=\"#\">Main Classification</a>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a tabindex=\"-1\" href=\"AddMainClass.jsp\">Add Main</a></li>\n");
      out.write("                                                    <li><a tabindex=\"-1\" href=\"SearchMainClassification.jsp\">Search Main</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                            <li class=\"divider\"></li>\n");
      out.write("                                            <li class=\"dropdown-submenu\">\n");
      out.write("                                                <a class=\"test\" tabindex=\"-1\" href=\"#\">Sub Classification</a>\n");
      out.write("                                                <ul class=\"dropdown-menu\">\n");
      out.write("                                                    <li><a tabindex=\"-1\" href=\"AddSubClass.jsp\">Add Sub</a></li>\n");
      out.write("                                                    <li><a tabindex=\"-1\" href=\"SearchSubClassification.jsp\">Search Sub</a></li>\n");
      out.write("                                                </ul>\n");
      out.write("                                            </li>\n");
      out.write("                                        </ul>\n");
      out.write("\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\t\t\t\t\t\t\n");
      out.write("                    </div>\n");
      out.write("                </div>\t\n");
      out.write("            </nav>\t\t\n");
      out.write("        </header>\t\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"breadcrumb\">\n");
      out.write("            <div class=\"container\">\t\n");
      out.write("                <div class=\"breadcrumb\">\t\t\t\t\t\t\t\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"book.html\">Books</a></li>\t\t\n");
      out.write("                    <li>AddBook</li>\t\n");
      out.write("                </div>\t\t\n");
      out.write("            </div>\t\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style=\"color: #33334d\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-8 col-sm-offset-2\">\n");
      out.write("\n");
      out.write("                    <div class=\"panel panel-default\">\n");
      out.write("                        <div class=\"panel-heading\">\n");
      out.write("                            <h3 class=\"panel-title\">Add Main Classifications</h3>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("                            <form id=\"addForm\" method=\"get\" class=\"form-horizontal\" action=\"AddMain\">\n");
      out.write("\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-4 control-label\" for=\"mainId\">Main ID :</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Main Classification ID\" name=\"mainId\" id=\"mainId\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <label class=\"col-sm-4 control-label\" for=\"mainClassificaton\">Main Classification :</label>\n");
      out.write("                                    <div class=\"col-sm-5\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter Main Classification Name\" id=\"mainClassificaton\" name=\"mainClassification\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-9 col-sm-offset-4\">\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" name=\"Add\" value=\"Add\">Add</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group\">\n");
      out.write("                                    <div class=\"col-sm-6 col-sm-offset-4\">\n");
      out.write("                                        ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" \n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
