package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class test1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\" />\t\r\n");
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
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        <!--        <h1>Hello World!</h1>\r\n");
      out.write("                <div class=\"alert alert-success alert-dismissible\">\r\n");
      out.write("                    <a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a>\r\n");
      out.write("                    <strong>Success!</strong> Indicates a successful or positive action.\r\n");
      out.write("                </div>\r\n");
      out.write("                <form onsubmit=\"return confirm('Do you really want to confirm ?');\">\r\n");
      out.write("                    Test : <input type=\"text\" name=\"txt\"/>\r\n");
      out.write("                    <br/>\r\n");
      out.write("                    <button type=\"submit\" name=\"Add\">Submit</button>\r\n");
      out.write("                </form>-->\r\n");
      out.write("        <form>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"inputEmail4\">Email</label>\r\n");
      out.write("                    <input type=\"email\" class=\"form-control\" id=\"inputEmail4\" placeholder=\"Email\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"inputPassword4\">Password</label>\r\n");
      out.write("                    <input type=\"password\" class=\"form-control\" id=\"inputPassword4\" placeholder=\"Password\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputAddress\">Address</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputAddress\" placeholder=\"1234 Main St\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <label for=\"inputAddress2\">Address 2</label>\r\n");
      out.write("                <input type=\"text\" class=\"form-control\" id=\"inputAddress2\" placeholder=\"Apartment, studio, or floor\">\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-row\">\r\n");
      out.write("                <div class=\"form-group col-md-6\">\r\n");
      out.write("                    <label for=\"inputCity\">City</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"inputCity\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group col-md-4\">\r\n");
      out.write("                    <label for=\"inputState\">State</label>\r\n");
      out.write("                    <select id=\"inputState\" class=\"form-control\">\r\n");
      out.write("                        <option selected>Choose...</option>\r\n");
      out.write("                        <option>...</option>\r\n");
      out.write("                    </select>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group col-md-2\">\r\n");
      out.write("                    <label for=\"inputZip\">Zip</label>\r\n");
      out.write("                    <input type=\"text\" class=\"form-control\" id=\"inputZip\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"form-group\">\r\n");
      out.write("                <div class=\"form-check\">\r\n");
      out.write("                    <input class=\"form-check-input\" type=\"checkbox\" id=\"gridCheck\">\r\n");
      out.write("                    <label class=\"form-check-label\" for=\"gridCheck\">\r\n");
      out.write("                        Check me out\r\n");
      out.write("                    </label>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <button type=\"submit\" class=\"btn btn-primary\">Sign in</button>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
