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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Company-HTML Bootstrap theme</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\t\r\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"breadcrumb\">\r\n");
      out.write("            <div class=\"container\">\t\r\n");
      out.write("                <div class=\"breadcrumb\">\t\t\t\t\t\t\t\r\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"book.html\">Books</a></li>\t\t\r\n");
      out.write("                    <li>Search Books</li>\t\r\n");
      out.write("                </div>\t\t\r\n");
      out.write("            </div>\t\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\" style = \"color:#33334d\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                <form action=\"SearchBook\" method=\"get\">\r\n");
      out.write("                    <div class=\"form-group\">\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <label for=\"sname\">Search : </label>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-4\">             \r\n");
      out.write("                            <select name=\"selection\" class=\"form-control\" id=\"selection\">  \r\n");
      out.write("                                <option>Select</option>        \r\n");
      out.write("                                <option>bookId</option>        \r\n");
      out.write("                                <option>title</option>        \r\n");
      out.write("                                <option>author</option>        \r\n");
      out.write("                                <option>mainClassification</option>        \r\n");
      out.write("                                <option>subClassification</option>        \r\n");
      out.write("                            </select>         \r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-4\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control\" placeholder=\"Search\" name=\"sname\" id=\"sname\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-sm-2\">\r\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-md\"><span class=\"glyphicon glyphicon-search\"></span></button>                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <table class=\"table table-striped table-responsive-md \" id=\"bookTable\">\r\n");
      out.write("                    <thead>\r\n");
      out.write("                        <tr>\r\n");
      out.write("                            <th>Book ID</th>\r\n");
      out.write("                            <th>Title</th>\r\n");
      out.write("                            <th>Author</th>\r\n");
      out.write("                            <th>Main Classification</th>\r\n");
      out.write("                            <th>Sub Classification</th>\r\n");
      out.write("                            <th>Year of printed</th>\r\n");
      out.write("                            <th>Last printed year</th>\r\n");
      out.write("                            <th>ISBN No</th>\r\n");
      out.write("                            <th># pages</th>\r\n");
      out.write("                        </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\r\n");
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
            out.write("\r\n");
            out.write("                            <tr>\r\n");
            out.write("\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getBookId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getTitle()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getAuthor()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getMain().getMname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getSub().getSname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getYearOfPrint()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getLastPrintYear()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getIsbnNo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td>\r\n");
            out.write("                                <td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getNoOfPages()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("</td> \r\n");
            out.write("                                <td>\r\n");
            out.write("                                    <a href=\"Edit?type=edit&bookId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getBookId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("\" value=\"asas\"><span class=\"glyphicon glyphicon-pencil\"></span></a>                                    \r\n");
            out.write("                                    &nbsp;\r\n");
            out.write("                                    <a href=\"DeleteBook?bookId=");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${b.getBook().getBookId()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
            out.write("&selection=");
            out.print(request.getParameter("selection"));
            out.write("&sname=");
            out.print(request.getParameter("sname"));
            out.write("\" onclick=\"deleteRow(this)\"><span class=\"glyphicon glyphicon-trash\"></span></a>\r\n");
            out.write("\r\n");
            out.write("                                </td>\r\n");
            out.write("                            </tr>\r\n");
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
      out.write("\r\n");
      out.write("                    </tbody>\r\n");
      out.write("                </table>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        \r\n");
      out.write("    </body>\r\n");
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
