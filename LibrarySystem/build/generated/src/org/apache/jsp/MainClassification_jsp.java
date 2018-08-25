package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class MainClassification_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Main Classification</title>\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("        <div id=\"breadcrumb\">\r\n");
      out.write("            <div class=\"container\">\t\r\n");
      out.write("                <div class=\"breadcrumb\">\t\t\t\t\t\t\t\r\n");
      out.write("                    <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                    <li><a href=\"classification.jsp\">Classification</a></li>\t\t\r\n");
      out.write("                    <li>Main Classification</li>\t\t\r\n");
      out.write("                </div>\t\t\r\n");
      out.write("            </div>\t\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 col-sm-offset-2\">\r\n");
      out.write("                    <div class=\"feature\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <a href=\"AddMainClass.jsp\">\r\n");
      out.write("                                    <div class=\"col-md-3\">\r\n");
      out.write("                                        <div class=\"hi-icon-wrap hi-icon-effect wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"300ms\" >\r\n");
      out.write("                                            <i class=\"fa fa-plus-circle\"></i>\t\r\n");
      out.write("                                            <h2>Add</h2>\r\n");
      out.write("                                            <p>Go Add new main classifications page here...</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a href=\"SearchMainClassification.jsp\">\r\n");
      out.write("                                    <div class=\"col-md-3\">\r\n");
      out.write("                                        <div class=\"hi-icon-wrap hi-icon-effect wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\" >\r\n");
      out.write("                                            <i class=\"fa fa-location-arrow\"></i>\t\r\n");
      out.write("                                            <h2>Search</h2>\r\n");
      out.write("                                            <p>Go search main classifications page here...</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->\r\n");
      out.write("        <script src=\"js/jquery-2.1.1.min.js\"></script>\t\r\n");
      out.write("        <!-- Include all compiled plugins (below), or include individual files as needed -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.prettyPhoto.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery.isotope.min.js\"></script>  \r\n");
      out.write("        <script src=\"js/wow.min.js\"></script>\r\n");
      out.write("        <script src=\"js/functions.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
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
