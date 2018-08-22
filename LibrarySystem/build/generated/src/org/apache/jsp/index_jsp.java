package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("        <title>Library Management System</title>\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link href=\"css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <link href=\"css/prettyPhoto.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"css/dropdown.css\" rel=\"stylesheet\" />\r\n");
      out.write("        <link href=\"css/style.css\" rel=\"stylesheet\" />\t\r\n");
      out.write("        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\r\n");
      out.write("        <!--[if lt IE 9]>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("        <![endif]-->\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("    <body>\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Header.jsp", out, false);
      out.write("\r\n");
      out.write("        <section id=\"main-slider\" class=\"no-margin\">\r\n");
      out.write("            <div class=\"carousel slide\">      \r\n");
      out.write("                <div class=\"carousel-inner\">\r\n");
      out.write("                    <div class=\"item active\" style=\"background-image: url(images/slider/bg3.jpg); height: 530px;\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"row slide-margin\">\r\n");
      out.write("                                <div class=\"col-sm-6\">\r\n");
      out.write("                                    <div class=\"carousel-content\">\r\n");
      out.write("\r\n");
      out.write("                                        <h2 class=\"animation animated-item-1\">Welcome <span>Library System</span></h2>\r\n");
      out.write("                                        <p class=\"animation animated-item-2\">This is a online book library with large book stock...</p>\r\n");
      out.write("                                        <a class=\"btn-slide animation animated-item-3\" href=\"#\">Read More</a>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div><!--/.item-->             \r\n");
      out.write("                </div><!--/.carousel-inner-->\r\n");
      out.write("            </div><!--/.carousel-->\r\n");
      out.write("        </section><!--/#main-slider-->\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"row\">\r\n");
      out.write("                <div class=\"col-sm-8 col-sm-offset-2\">\r\n");
      out.write("                    <div class=\"feature\">\r\n");
      out.write("                        <div class=\"container\">\r\n");
      out.write("                            <div class=\"text-center\">\r\n");
      out.write("                                <a href=\"book.jsp\">\r\n");
      out.write("                                    <div class=\"col-md-3\">\r\n");
      out.write("                                        <div class=\"hi-icon-wrap hi-icon-effect wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"300ms\" >\r\n");
      out.write("                                            <i class=\"fa fa-book\"></i>\t\r\n");
      out.write("                                            <h2>Books</h2>\r\n");
      out.write("                                            <p>Add books, Update, Delete and  Search here.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("\r\n");
      out.write("                                <a href=\"classification.jsp\">\r\n");
      out.write("                                    <div class=\"col-md-3\">\r\n");
      out.write("                                        <div class=\"hi-icon-wrap hi-icon-effect wow fadeInDown\" data-wow-duration=\"1000ms\" data-wow-delay=\"600ms\" >\r\n");
      out.write("                                            <i class=\"fa fa-folder-open\"></i>\t\r\n");
      out.write("                                            <h2>Classifications</h2>\r\n");
      out.write("                                            <p>View classifications and add, update, delete and search here.</p>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "Footer.jsp", out, false);
      out.write("\r\n");
      out.write("\r\n");
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
