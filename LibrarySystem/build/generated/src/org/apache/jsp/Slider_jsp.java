package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Slider_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Slider</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">  \n");
      out.write("            <div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("\n");
      out.write("                <!-- Indicators -->\n");
      out.write("                <ol class=\"carousel-indicators\">\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"1\" class=\"active\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"3\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"4\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"5\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"6\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"7\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"8\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"9\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"10\"></li>\n");
      out.write("                    <li data-target=\"#myCarousel\" data-slide-to=\"11\"></li>\n");
      out.write("                </ol>\n");
      out.write("\n");
      out.write("                <!-- Wrapper for slides -->\n");
      out.write("                <div class=\"carousel-inner\">\n");
      out.write("\n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row slide-margin\">\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <div class=\"carousel-content\">\n");
      out.write("\n");
      out.write("                                    <h2 class=\"animation animated-item-1\">Welcome <span>Library System</span></h2>\n");
      out.write("                                    <p class=\"animation animated-item-2\">This is a online book library with large book stock...</p>\n");
      out.write("                                    <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item active\">\n");
      out.write("                        <img src=\"images/slider/img2.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img3.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img4.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img5.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img6.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img7.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img8.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img9.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img10.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img11.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"item\">\n");
      out.write("                        <img src=\"images/slider/img12.jpg\" alt=\"Books\" style=\"width:100%; height: 350px;\">\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <!-- Left and right controls -->\n");
      out.write("                <a class=\"left carousel-control\" href=\"#myCarousel\" data-slide=\"prev\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-left\"></span>\n");
      out.write("                    <span class=\"sr-only\">Previous</span>\n");
      out.write("                </a>\n");
      out.write("                <a class=\"right carousel-control\" href=\"#myCarousel\" data-slide=\"next\">\n");
      out.write("                    <span class=\"glyphicon glyphicon-chevron-right\"></span>\n");
      out.write("                    <span class=\"sr-only\">Next</span>\n");
      out.write("                </a>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</body>\n");
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
