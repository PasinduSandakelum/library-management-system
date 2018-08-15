package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class modal_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\" />\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\n");
      out.write("        <link href=\"css/bootstrap-datepicker3.css\" rel=\"stylesheet\" id=\"bootstrap-css\">\n");
      out.write("        <!--<script type=\"text/javascript\" src=\"js/bootstrap-datepicker.min.js\"></script>-->\n");
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
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body style=\"color:black;\">\n");
      out.write("        <p>Click the button to alert the innerHTML of the tr element with id=\"myRow\" in the table.</p>\n");
      out.write("\n");
      out.write("        <table class=\"table table-striped table-responsive-md \" id=\"bookTable\">\n");
      out.write("            \n");
      out.write("                <tr data-val='1' id=\"1\">\n");
      out.write("                    <td>1<td>\n");
      out.write("                    <td>a<td>\n");
      out.write("                    <td>b<td>\n");
      out.write("                    <td>c<td>\n");
      out.write("                    <td>d<td>\n");
      out.write("                    <td>e<td>\n");
      out.write("                    <td>f<td>\n");
      out.write("                    <td>g<td>\n");
      out.write("                    <td>h<td>\n");
      out.write("                        <!--<a href=\"\"</a>-->\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a href=\"\" class=\"btn btn-default btn-rounded mb-4\" data-toggle=\"modal\" data-target=\"#modalLoginForm\" onclick=\"myFunction()\"><span class=\"glyphicon glyphicon-pencil\"></span></a>\n");
      out.write("                        </div>\n");
      out.write("                        <!--<a href=\"\" class=\"btn btn-default btn-rounded mb-4\" data-toggle=\"modal\" data-target=\"#modalLoginForm\" onclick=\"myFunction()\" id\" value=\"\"><span class=\"glyphicon glyphicon-pencil\"></span></a>-->\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr data-val='2' id=\"2\">\n");
      out.write("                    <td>2<td>\n");
      out.write("                    <td>a<td>\n");
      out.write("                    <td>b<td>\n");
      out.write("                    <td>c<td>\n");
      out.write("                    <td>d<td>\n");
      out.write("                    <td>e<td>\n");
      out.write("                    <td>f<td>\n");
      out.write("                    <td>g<td>\n");
      out.write("                    <td>h<td>\n");
      out.write("                        <!--<a href=\"\"</a>-->\n");
      out.write("                        <div class=\"text-center\">\n");
      out.write("                            <a href=\"\"  data-toggle=\"modal\" data-target=\"#modalLoginForm\" onclick=\"myFunction()\"><span class=\"glyphicon glyphicon-pencil\"></span></a>\n");
      out.write("                        </div>\n");
      out.write("                        <!--<a href=\"\" class=\"btn btn-default btn-rounded mb-4\" data-toggle=\"modal\" data-target=\"#modalLoginForm\" onclick=\"myFunction()\" id\" value=\"\"><span class=\"glyphicon glyphicon-pencil\"></span></a>-->\n");
      out.write("\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            \n");
      out.write("        </table>\n");
      out.write("        <br> \n");
      out.write("\n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div id=\"n\" style=\"\">\n");
      out.write("            <div class=\"modal fade\" id=\"modalLoginForm\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModalLabel\" aria-hidden=\"true\">\n");
      out.write("                <div class=\"modal-dialog modal-lg\" role=\"document\">\n");
      out.write("                    <div class=\"modal-content\">\n");
      out.write("                        <div class=\"modal-header text-center\">\n");
      out.write("                            <h4 class=\"modal-title w-100 font-weight-bold\">Sign in</h4>\n");
      out.write("                            <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("                                <span aria-hidden=\"true\">&times;</span>\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"modal-body sm-10\">\n");
      out.write("                            <div class=\"container\" style=\"color: #33334d\">\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-sm-8 \">\n");
      out.write("\n");
      out.write("                                        <div class=\"panel panel-default\">\n");
      out.write("                                            <div class=\"panel-heading\">\n");
      out.write("                                                <h3 class=\"panel-title\">Add Books</h3>\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"panel-body\">\n");
      out.write("                                                <form id=\"addForm\" method=\"get\" class=\"form-horizontal\" action=\"\">\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"bookId\">Book ID : </label>\n");
      out.write("                                                        <div class=\"col-sm-5\">\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter book ID\" name=\"bookId\" id=\"bookId\">\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"title\">Title:</label>\n");
      out.write("                                                        <div class=\"col-sm-5\">\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter book title\" id=\"title\" name=\"title\">\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"author\">Author:</label>\n");
      out.write("                                                        <div class=\"col-sm-5\">\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter book author\" name=\"author\" id=\"author\">\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"mainClassification\">Main Classification:</label>\n");
      out.write("                                                        <div class=\"col-sm-5\">             \n");
      out.write("                                                            <select name=\"mainClassificationId\" class=\"form-control\" id=\"mainClassification\" onChange=\"changeSub(this.form);\">  \n");
      out.write("                                                                <option>Select</option>  \n");
      out.write("                                                                <option>Engineering</option>  \n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </select>\n");
      out.write("\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"subClassification\">Sub Classification:</label>\n");
      out.write("                                                        <div class=\"col-sm-5\"> \n");
      out.write("\n");
      out.write("                                                            <select name=\"subClassification\" class=\"form-control\" id=\"subClassification\">  \n");
      out.write("                                                                <option>Select</option>\n");
      out.write("                                                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                                                            </select>         \n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"yearOfPrint\">Year of Printed:</label>\n");
      out.write("\n");
      out.write("                                                        <div class='input-group date' id='datepicker1' class=\"col-sm-5\">\n");
      out.write("                                                            <input type='text' class=\"form-control\" name=\"yearOfPrint\" id=\"yearOfPrint\"/>\n");
      out.write("                                                            <span class=\"input-group-addon\">\n");
      out.write("                                                                <span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("                                                            </span>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"lastPrintYear\">Last Printed Year:</label>\n");
      out.write("                                                        <div class='input-group date' id='datepicker2' class=\"col-sm-5\">\n");
      out.write("                                                            <input type='text' class=\"form-control\" name=\"lastPrintYear\" id=\"lastPrintYear\"/>\n");
      out.write("                                                            <span class=\"input-group-addon\">\n");
      out.write("                                                                <span class=\"glyphicon glyphicon-calendar\"></span>\n");
      out.write("                                                            </span>\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"isbnNo\">ISBN No:</label>\n");
      out.write("                                                        <div class=\"col-sm-5\">\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter ISBN number\" name=\"isbnNo\" id=\"isbnNo\">\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <label class=\"col-sm-4 control-label\" for=\"noOfPages\">No of Pages:</label>\n");
      out.write("                                                        <div class=\"col-sm-5\">\n");
      out.write("                                                            <input type=\"text\" class=\"form-control\" placeholder=\"Enter number of pages\" name=\"noOfPages\" id=\"noOfPages\">\n");
      out.write("                                                        </div>\n");
      out.write("\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                    <div class=\"form-group\">\n");
      out.write("                                                        <div class=\"col-sm-9 col-sm-offset-4\">\n");
      out.write("                                                            <button type=\"submit\" class=\"btn btn-primary\" name=\"Add\" value=\"Add\">Update</button>\n");
      out.write("                                                        </div>\n");
      out.write("                                                    </div>\n");
      out.write("\n");
      out.write("                                                </form>\n");
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/bootstrap-datepicker.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("                                                                $(function () {\n");
      out.write("                                                                    $('#datepicker1').datepicker({\n");
      out.write("                                                                        format: \"yyyy\",\n");
      out.write("                                                                        autoclose: true,\n");
      out.write("                                                                        viewMode: \"years\",\n");
      out.write("                                                                        minViewMode: \"years\",\n");
      out.write("                                                                        todayHighlight: true,\n");
      out.write("                                                                        showOtherMonths: true,\n");
      out.write("                                                                        selectOtherMonths: true,\n");
      out.write("                                                                        autoclose: true,\n");
      out.write("                                                                        changeMonth: false,\n");
      out.write("                                                                        changeYear: true,\n");
      out.write("                                                                        orientation: \"button\"\n");
      out.write("                                                                    }).on('changeYear', function (e) {\n");
      out.write("\n");
      out.write("                                                                    });\n");
      out.write("                                                                    $('#datepicker2').datepicker({\n");
      out.write("                                                                        format: \"yyyy\",\n");
      out.write("                                                                        autoclose: true,\n");
      out.write("                                                                        viewMode: \"years\",\n");
      out.write("                                                                        minViewMode: \"years\",\n");
      out.write("                                                                        todayHighlight: true,\n");
      out.write("                                                                        showOtherMonths: true,\n");
      out.write("                                                                        selectOtherMonths: true,\n");
      out.write("                                                                        autoclose: true,\n");
      out.write("                                                                        changeMonth: false,\n");
      out.write("                                                                        changeYear: true,\n");
      out.write("                                                                        orientation: \"button\"\n");
      out.write("                                                                    }).on('changeYear', function (e) {\n");
      out.write("\n");
      out.write("                                                                    });\n");
      out.write("                                                                });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("\n");
      out.write("            function myFunction() {\n");
      out.write("                var y;\n");
      out.write("                $('tr').click(function () {\n");
      out.write("                    //alert($(this).data('val'));\n");
      out.write("                    y = $(this).data('val');\n");
      out.write("                    //alert(y);\n");
      out.write("                    var x = document.getElementById(\"bookTable\").rows.namedItem(y).cells[0].innerHTML;\n");
      out.write("                    var x1 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[2].innerHTML;\n");
      out.write("                    var x2 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[4].innerHTML;\n");
      out.write("                    var x3 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[6].innerHTML;\n");
      out.write("                    var x4 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[8].innerHTML;\n");
      out.write("                    var x5 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[10].innerHTML;\n");
      out.write("                    var x6 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[12].innerHTML;\n");
      out.write("                    var x7 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[14].innerHTML;\n");
      out.write("                    var x8 = document.getElementById(\"bookTable\").rows.namedItem(y).cells[16].innerHTML;\n");
      out.write("                    //var x = document.getElementById(\"myTable\").rows.namedItem(\"myRow\").cells[0].innerHTML;\n");
      out.write("                    //document.getElementById(\"bookId\").value = y;\n");
      out.write("                    //alert(x+\" \"+x1+\" \"+x2+\" \"+x3+\" \"+x4+\" \"+x5+\" \"+x6+\" \"+x7+\" \"+x8);\n");
      out.write("                    document.getElementById(\"bookId\").value = x;\n");
      out.write("                    document.getElementById(\"title\").value = x1;\n");
      out.write("                    document.getElementById(\"author\").value = x2;\n");
      out.write("                    //document.getElementById(\"mainClassification\").value = x3;\n");
      out.write("                   // document.getElementById(\"subClassification\").value = x4;\n");
      out.write("                    document.getElementById(\"yearOfPrint\").value = x5;\n");
      out.write("                    document.getElementById(\"lastPrintYear\").value = x6;\n");
      out.write("                    document.getElementById(\"isbnNo\").value = x7;\n");
      out.write("                    document.getElementById(\"noOfPages\").value = x8;\n");
      out.write("                    \n");
      out.write("                });\n");
      out.write("\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
          out.write("\n");
          out.write("                                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write(' ');
          if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                ");
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
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getMid() eq mainClassificationId}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
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
          out.write("\n");
          out.write("                                                                    <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getSid()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\"> ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${item.getSname()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                                ");
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
}
