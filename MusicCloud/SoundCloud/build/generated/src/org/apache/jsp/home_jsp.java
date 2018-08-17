package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/homeheader.jsp");
    _jspx_dependants.add("/homemenu.jsp");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("       <script>\n");
      out.write("                           \n");
      out.write("\n");
      out.write("            function go(value)                \n");
      out.write("                 {   \n");
      out.write("               \n");
      out.write("//                 if(value==null || value==\"\"){\n");
      out.write("//                  alert(value);\n");
      out.write("//                 \n");
      out.write("//                  }\n");
      out.write("//                 else{\n");
      out.write("                   xmlhttp = new XMLHttpRequest();\n");
      out.write("//                var h = document.getElementById(\"value\").value;\n");
      out.write("                xmlhttp.onreadystatechange = go2;\n");
      out.write("                xmlhttp.open(\"GET\", \"homesearch.jsp?value=\" + value, true);\n");
      out.write("                \n");
      out.write("                xmlhttp.send();\n");
      out.write("//    }\n");
      out.write("}\n");
      out.write(" function go2()\n");
      out.write("            {\n");
      out.write("                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"content1\").innerHTML\n");
      out.write("                            = xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            \n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("      \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("                ");
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
      out.write("\n");
      out.write("    <link type=\"text/css\" href=\"homemenu.css\" rel=\"stylesheet\" />\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery.js\"></script>\n");
      out.write("    <script type=\"text/javascript\" src=\"menu.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div id=\"menu\">\n");
      out.write("    <ul class=\"menu\">\n");
      out.write("        <li><a href=\"home.jsp\" class=\"parent\"><span>Home</span></a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"publicuserinterface1.jsp\" class=\"parent\"><span>Explore Music</span></a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"signupform1.jsp\" class=\"parent\"><span>Sign Up</span></a>\n");
      out.write("            \n");
      out.write("        </li>\n");

if(session.getAttribute("un")==null)
{

      out.write("\n");
      out.write("        <li><a href=\"userlogin1.jsp\"><span>Sign in</span></a></li>\n");
      out.write("  ");
 
  }
  else{
       
      out.write(" \n");
      out.write("        <li ><a href=\"logout.jsp\"><span>Logout</span></a></li>\n");

}

      out.write("\n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"home\" style=\"color: orangered;\"> \n");
      out.write("                    \n");
      out.write("                    <form action=\"publicuserinterface1.jsp\" method=\"post\">\n");
      out.write("                        <div><table>\n");
      out.write("                             <tr><td style=\"\">\n");
      out.write("                                     <input type=\"text\" onkeyup=\"go(this.value)\"   placeholder=\"Search For Artist,Album,Songname\"  autocomplete=\"off\"  style=\" background-color: #f5f6f7;width: 518px;height: 21px;background-image: url(sr.png);background-repeat: no-repeat;background-size: 23px;background-position-x: 497px; border-radius: 5px;border-width: thin;margin-top: 5px; \"/>\n");
      out.write("                            <div id=\"content1\">\n");
      out.write("\n");
      out.write("                                </div><tr><td> </td></tr>\n");
      out.write("\n");
      out.write("                         </table></div>\n");
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
      out.write("                                <td style=\"color: orangered;font-family: sans-serif;font-size: 40px;min-width: 940px; \">\n");
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
      out.write("                        \n");
      out.write("                     \n");
      out.write("                       \n");
      out.write("                   \n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("                                 \n");
      out.write("                \n");
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
      out.write("                <a href=\"\"><span>Help</span></a>\n");
      out.write("                <a href=\"aboutus.jsp\"><span>About Us</span></a>\n");
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
      out.write("\n");
      out.write("          \n");
      out.write("    </body>\n");
      out.write("    \n");
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
