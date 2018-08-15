package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class SearchBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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
      out.write("        <title>Company-HTML Bootstrap theme</title>\n");
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
      out.write("\n");
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
      out.write("        <div id=\"breadcrumb\">\n");
      out.write("            <div class=\"container\">\t\n");
      out.write("                <div class=\"breadcrumb\">\t\t\t\t\t\t\t\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\n");
      out.write("                    <li><a href=\"book.html\">Books</a></li>\t\t\n");
      out.write("                    <li>Search Books</li>\t\n");
      out.write("                </div>\t\t\n");
      out.write("            </div>\t\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\" style = \"color:#33334d\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <form action=\"SearchBook\" method=\"get\">\n");
      out.write("                    <div class=\"form-group\">\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <label for=\"sname\">Search : </label>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\">             \n");
      out.write("                            <select name=\"selection\" class=\"form-control\" id=\"selection\">  \n");
      out.write("                                <option>Select</option>        \n");
      out.write("                                <option>bookId</option>        \n");
      out.write("                                <option>title</option>        \n");
      out.write("                                <option>author</option>        \n");
      out.write("                                <option>mainClassification</option>        \n");
      out.write("                                <option>subClassification</option>        \n");
      out.write("                            </select>         \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-4\">\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"sname\" id=\"sname\">\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-sm-2\">\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-md\"><span class=\"glyphicon glyphicon-search\"></span></button>                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <table class=\"table table-striped table-responsive-md \" id=\"bookTable\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>Book ID</th>\n");
      out.write("                            <th>Title</th>\n");
      out.write("                            <th>Author</th>\n");
      out.write("                            <th>Main Classification</th>\n");
      out.write("                            <th>Sub Classification</th>\n");
      out.write("                            <th>Year of printed</th>\n");
      out.write("                            <th>Last printed year</th>\n");
      out.write("                            <th>ISBN No</th>\n");
      out.write("                            <th># pages</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("\n");
      out.write("                        ");
      //  c:forEach
      org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
      _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
      _jspx_th_c_forEach_0.setParent(null);
      _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${books}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
      _jspx_th_c_forEach_0.setVar("b");
      int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("                            <tr>\n");
            out.write("\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getBookId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getAuthor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getMain().getMname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getSub().getSname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getYearOfPrint()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getLastPrintYear()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getIsbnNo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getNoOfPages()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td> \n");
            out.write("                                <td>\n");
            out.write("                                    <a href=\"Edit?type=edit&bookId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getBookId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" value=\"asas\"><span class=\"glyphicon glyphicon-pencil\"></span></a>                                    \n");
            out.write("                                    &nbsp;\n");
            out.write("                                    <a href=\"DeleteBook?bookId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getBookId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&selection=");
            out.print(request.getParameter("selection"));
            out.write("&sname=");
            out.print(request.getParameter("sname"));
            out.write("\" onclick=\"deleteRow(this)\"><span class=\"glyphicon glyphicon-trash\"></span></a>\n");
            out.write("\n");
            out.write("                                </td>\n");
            out.write("                            </tr>\n");
            out.write("                        ");
            int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
      } catch (Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_forEach_0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
        _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
      }
      out.write("\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("</html>");
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