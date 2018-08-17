package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class homeheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/homemenu.html");
    _jspx_dependants.add("/index.html");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            a{text-decoration: none;\n");
      out.write("              font-family: sans-serif;\n");
      out.write("              font-size:  small;\n");
      out.write("              color: #303030;\n");
      out.write("              opacity:100;\n");
      out.write("            }\n");
      out.write("            h5{text-decoration: none;\n");
      out.write("               font-family: sans-serif;\n");
      out.write("               font-size:  small;\n");
      out.write("               color: #303030;\n");
      out.write("               opacity:100;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("    <center>\n");
      out.write("       \n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <div class=\"style1\"> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"wrapper\">\n");
      out.write("\n");
      out.write("                <div class=\"Menu\">\n");
      out.write("                    ");
      out.write("\r\n");
      out.write("    <link type=\"text/css\" href=\"homemenu.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"menu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"menu\">\r\n");
      out.write("    <ul class=\"menu\">\r\n");
      out.write("        <li><a href=\"homeheader.jsp\" class=\"parent\"><span>Home</span></a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"publicuserinterface1.jsp\" class=\"parent\"><span>Explore Music</span></a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"signupform1.jsp\" class=\"parent\"><span>Sign Up</span></a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"userlogin1.jsp\"><span>Sign in</span></a></li>\r\n");
      out.write("        \r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"home\" style=\"color: orangered;\"> \n");
      out.write("                    <div> <table >\n");
      out.write("                            <tr><td>\n");
      out.write("                            <input type=\"text\"   value=\"Search for Song,Album and Artist\" style=\"width: 520px;height: 20px; border-color: #303030; \n");
      out.write("                                   border-width: 1px; border-radius: 5px;border-top-right-radius: 0px;border-bottom-right-radius: 0px; border-right-color: white;border-right-width: 0px \" onkeyup=\"go(this.value)\"/><img src=\"sr.png\" alt=\"File not  Found \" width=\"22\" height=\"22\"  style=\" position: relative;top: 7px; border-color: #303030;border-width: 1px; border-radius: 5px;border-top-right-radius: 1px; border-top-left-radius: 0px;border-bottom-right-radius: 1px;border-bottom-left-radius: 0px; border-left-color: white;border-left-width: 0px \">\n");
      out.write("                                </td></tr>\n");
      out.write("                        <tr><td > <div id=\"content1\">\n");
      out.write("\n");
      out.write("                                </div></td></tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                   \n");
      out.write("                                 \n");
      out.write("                </div>\n");
      out.write("                    <form action=\"publicuserinterface1.jsp\" method=\"post\">\n");
      out.write("                        \n");
      out.write("                        <table>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr><td></td></tr>\n");
      out.write("                            <tr>\n");
      out.write("\n");
      out.write("                                <td style=\"color: orangered;font-family: sans-serif;font-size: 40px; \">\n");
      out.write("                                    Hear the world's sounds</td></tr>\n");
      out.write("                            <tr><td style=\"color: orangered;font-family: sans-serif;font-size: 19px ;\"> Millions of  artists can share their tracks </td></tr>\n");
      out.write("                            <tr><td style=\"color: orangered;font-family: sans-serif;font-size: 19px \">   \n");
      out.write("                                </td>\n");
      out.write("                            <tr><td style=\"color: orangered;font-family: sans-serif;font-size: 40px \"> Music Cloud\n");
      out.write("                                </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr><td><input type=\"submit\" value=\"Explore Music\" style=\" border-color: orangered;  border-radius: 5px;background-color: orangered;color:white;font-family: sans-serif;\"></td></tr>\n");
      out.write("                            \n");
      out.write("                        </table>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("               \n");
      out.write("                ");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\"\r\n");
      out.write("\t\"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n");
      out.write("<head>\r\n");
      out.write("\t<title></title>\r\n");
      out.write("\t<meta http-equiv=\"content-type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("\t<meta name=\"keywords\" content=\"WOW Slider, Vertical Image Slider, Image Slider Vertical\" />\r\n");
      out.write("\t<meta name=\"description\" content=\"WOWSlider created with WOW Slider, a free wizard program that helps you easily generate beautiful web slideshow\" />\r\n");
      out.write("\t<!-- Start WOWSlider.com HEAD section -->\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"engine1/style.css\" media=\"screen\" />\r\n");
      out.write("\t<style type=\"text/css\">a#vlb{display:none}</style>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine1/jquery.js\"></script>\r\n");
      out.write("\t<!-- End WOWSlider.com HEAD section -->\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color:#ffffff\">\r\n");
      out.write("\t<!-- Start WOWSlider.com BODY section -->\r\n");
      out.write("\t<div id=\"wowslider-container1\">\r\n");
      out.write("\t<div class=\"ws_images\">\r\n");
      out.write("<a href=\"#\"><img src=\"data1/images/2.jpg\" alt=\"2\" title=\"2\" id=\"wows0\"/></a>\r\n");
      out.write("<a href=\"#\"><img src=\"data1/images/3.jpg\" alt=\"3\" title=\"3\" id=\"wows1\"/></a>\r\n");
      out.write("<a href=\"#\"><img src=\"data1/images/5.jpg\" alt=\"5\" title=\"5\" id=\"wows2\"/></a>\r\n");
      out.write("<a href=\"#\"><img src=\"data1/images/trance_music_wallpaper_03_1280x720.jpg\" alt=\"Trance music wallpaper 03 1280x720\" title=\"Trance music wallpaper 03 1280x720\" id=\"wows3\"/></a>\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"ws_bullets\"><div>\r\n");
      out.write("<a href=\"#wows0\" title=\"2\"><img src=\"data1/tooltips/2.jpg\" alt=\"2\"/>1</a>\r\n");
      out.write("<a href=\"#wows1\" title=\"3\"><img src=\"data1/tooltips/3.jpg\" alt=\"3\"/>2</a>\r\n");
      out.write("<a href=\"#wows2\" title=\"5\"><img src=\"data1/tooltips/5.jpg\" alt=\"5\"/>3</a>\r\n");
      out.write("<a href=\"#wows3\" title=\"Trance music wallpaper 03 1280x720\"><img src=\"data1/tooltips/trance_music_wallpaper_03_1280x720.jpg\" alt=\"Trance music wallpaper 03 1280x720\"/>4</a>\r\n");
      out.write("</div></div>\r\n");
      out.write("<a style=\"display:none\" href=\"http://wowslider.com\">Image Slider Ajax by WOWSlider.com v1.7</a>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"engine1/script.js\"></script>\r\n");
      out.write("\t<!-- End WOWSlider.com BODY section -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\n");
      out.write("\n");
      out.write("                <table style=\"width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("                <h5>Global Institute Of Management & Emerging Technologies, Amritsar</h5>\n");
      out.write("                <h5> Gurpreet Singh &  Kawaljeet Singh</h5>\n");
      out.write("                <a href=\"contact.jsp\"><span>Contacts</span></a>\n");
      out.write("                <a href=\"#\"><span>Help</span></a>\n");
      out.write("                <a href=\"aboutus.jsp\"><span>About us</span></a>\n");
      out.write("\n");
      out.write("                <a href=\"https://www.facebook.com\">\n");
      out.write("                    <img src=\"fb.jpg\" alt=\"click on image\" style=\"width:20px;height:18px;border:0\"></a>\n");
      out.write("                <a href=\"https://www.twitter.com\">\n");
      out.write("                    <img src=\"tw.jpg\" alt=\"click on image\" style=\"width:20px;height:18px;border:0\"></a>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                </center>\n");
      out.write("                </body>\n");
      out.write("                </html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
