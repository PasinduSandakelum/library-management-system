package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class EditBook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_c_if_test.release();
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
      out.write("        <title>Update Books</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("        <link href=\"css/bootstrap-datepicker3.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\r\n");
      out.write("        <!--<script type=\"text/javascript\" src=\"js/bootstrap-datepicker.min.js\"></script>-->\r\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("        <script src=\"js/jquery.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/validator.js\"></script>\r\n");
      out.write("        <script src=\"js/validator.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("            function changeSub(form) {\r\n");
      out.write("                form.action = \"ChangeSub\";\r\n");
      out.write("                form.submit();\r\n");
      out.write("            }\r\n");
      out.write("        </script>\r\n");
      out.write("        \r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div id=\"breadcrumb\">\r\n");
      out.write("            <div class=\"container\">\t\r\n");
      out.write("                <div class=\"breadcrumb\">\t\t\t\t\t\t\t\r\n");
      out.write("                    <li><a href=\"index.html\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"book.html\">Books</a></li>\t\t\r\n");
      out.write("                    <li>Update Books</li>\t\r\n");
      out.write("                </div>\t\t\r\n");
      out.write("            </div>\t\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\" style=\"color: #33334d\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 col-sm-offset-2\">\r\n");
      out.write("                    ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${error}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 col-sm-offset-2\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"panel panel-default\">\r\n");
      out.write("                        <div class=\"panel-heading\">\r\n");
      out.write("                            <h3 class=\"panel-title\">Book details</h3>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"panel-body\">\r\n");
      out.write("                            <form id=\"addForm\" method=\"get\" class=\"\" action=\"GetUpdate\">\r\n");
      out.write("                                <input type=\"hidden\" name=\"type\" value=\"update\"/>\r\n");
      out.write("                                <div class=\"form-row\">\r\n");
      out.write("                                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                                        <label for=\"bookId\">Book ID : </label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter book ID\" name=\"bookId\" id=\"bookId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${bookIdEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                                        <label for=\"yearOfPrint\">Year of Printed:</label>\r\n");
      out.write("\r\n");
      out.write("                                        <div class='input-group date' id='datepicker1'>\r\n");
      out.write("                                            <input type='text' class=\"form-control\" name=\"yearOfPrint\" id=\"yearOfPrint\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${yearOfPrintEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                                            <span class=\"input-group-addon\">\r\n");
      out.write("                                                <span class=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-4\">\r\n");
      out.write("                                        <label for=\"lastPrintYear\">Last Printed Year:</label>\r\n");
      out.write("                                        <div class='input-group date' id='datepicker2'>\r\n");
      out.write("                                            <input type='text' class=\"form-control\" name=\"lastPrintYear\" id=\"lastPrintYear\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lastPrintYearEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("                                            <span class=\"input-group-addon\">\r\n");
      out.write("                                                <span class=\"glyphicon glyphicon-calendar\"></span>\r\n");
      out.write("                                            </span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-row\">\r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <label for=\"title\">Title:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter book title\" id=\"title\" name=\"title\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${titleEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <label for=\"author\">Author:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter book author\" name=\"author\" id=\"author\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${authorEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-row\">\r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <label for=\"mainId\">Main Classification:</label>\r\n");
      out.write("                                        <div>             \r\n");
      out.write("                                            <select name=\"mainId\" class=\"form-control\" id=\"mainId\" onchange=\"changeSub(this.form);\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>  \r\n");
      out.write("                                                <option value=\"\">Select</option>  \r\n");
      out.write("                                                <!--<option>Engineering</option>-->  \r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <label for=\"subClassificationId\">Sub Classification:</label>\r\n");
      out.write("                                        <div> \r\n");
      out.write("                                            <select name=\"subClassificationId\" class=\"form-control\" id=\"subClassificationId\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subId}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required>  \r\n");
      out.write("                                                <option value=\"\">Select</option>\r\n");
      out.write("                                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                            </select>         \r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>       \r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-row\">\r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <label for=\"isbnNo\">ISBN No:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter ISBN number\" name=\"isbnNo\" id=\"isbnNo\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${isbnNoEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" required/>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"form-group col-md-6\">\r\n");
      out.write("                                        <label for=\"noOfPages\">No of Pages:</label>\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" placeholder=\"Enter number of pages\" name=\"noOfPages\" id=\"noOfPages\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${noOfPagesEdit}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" min=\"0\" pattern=\"[0-9]+\" title=\"Enter + Numbers Only\" required/>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <div class=\"form-row\">\r\n");
      out.write("                                    <div class=\"form-group\">\r\n");
      out.write("                                        <button type=\"submit\" class=\"btn btn-primary\" name=\"update\" value=\"update\" style=\"float: right;\">Update</button>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("     \r\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write("        <script>\r\n");
      out.write("                                            $(function () {\r\n");
      out.write("                                                $('#datepicker1').datepicker({\r\n");
      out.write("                                                    format: \"yyyy\",\r\n");
      out.write("                                                    autoclose: true,\r\n");
      out.write("                                                    viewMode: \"years\",\r\n");
      out.write("                                                    minViewMode: \"years\",\r\n");
      out.write("                                                    todayHighlight: true,\r\n");
      out.write("                                                    showOtherMonths: true,\r\n");
      out.write("                                                    selectOtherMonths: true,\r\n");
      out.write("                                                    autoclose: true,\r\n");
      out.write("                                                    changeMonth: false,\r\n");
      out.write("                                                    changeYear: true,\r\n");
      out.write("                                                    orientation: \"button\"\r\n");
      out.write("                                                }).on('changeYear', function (e) {\r\n");
      out.write("\r\n");
      out.write("                                                });\r\n");
      out.write("                                                $('#datepicker2').datepicker({\r\n");
      out.write("                                                    format: \"yyyy\",\r\n");
      out.write("                                                    autoclose: true,\r\n");
      out.write("                                                    viewMode: \"years\",\r\n");
      out.write("                                                    minViewMode: \"years\",\r\n");
      out.write("                                                    todayHighlight: true,\r\n");
      out.write("                                                    showOtherMonths: true,\r\n");
      out.write("                                                    selectOtherMonths: true,\r\n");
      out.write("                                                    autoclose: true,\r\n");
      out.write("                                                    changeMonth: false,\r\n");
      out.write("                                                    changeYear: true,\r\n");
      out.write("                                                    orientation: \"button\"\r\n");
      out.write("                                                }).on('changeYear', function (e) {\r\n");
      out.write("\r\n");
      out.write("                                                });\r\n");
      out.write("                                            });\r\n");
      out.write("        </script>\r\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("item");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${mainClassifications}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMid() eq mainId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Selected=\"true\"");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setVar("item");
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${subClassifications}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getSid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write('>');
          out.write(' ');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getSname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\r\n");
          out.write("                                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getSid() eq subId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("Selected=\"true\"");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }
}
