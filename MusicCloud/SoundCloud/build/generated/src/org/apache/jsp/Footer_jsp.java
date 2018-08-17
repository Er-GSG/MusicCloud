package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Footer_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            body{ color:#666;\n");
      out.write("                  font-size: medium;\n");
      out.write("                  font-family: sans-serif;\n");
      out.write("                  text-decoration: none;\n");
      out.write("                  color: #666;\n");
      out.write("                  margin: 0;\n");
      out.write("                  line-height: 14px;\n");
      out.write("                  font-weight: 700;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            h3{\n");
      out.write("                \n");
      out.write("                text-decoration: none;\n");
      out.write("                color: #666;\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: sans-serif;font-size: 18px;\n");
      out.write("                line-height: 14px;\n");
      out.write("                font-weight: 700}\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            a{text-decoration: none;\n");
      out.write("              font-family: sans-serif;\n");
      out.write("              font-size:  small;\n");
      out.write("              color: #303030;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("                    <div class=\"footerstyle\"> \n");
      out.write("\n");
      out.write("        <div class=\"Footer\">\n");
      out.write("\n");
      out.write("            <table style=\" width: 100%;  height: 19px; border-bottom: 1px solid #d4d4d4;border-radius: 5px; \">\n");
      out.write("                <tr><th> <table>\n");
      out.write("                <tr>\n");
      out.write("                    <th style=\"min-width: 50px\">\n");
      out.write("                                                           \n");
      out.write("\n");
      out.write("                        <table  cellpadding=\"5\" style=\"width: 35px; height: 19px; border-right: 1px solid #d4d4d4; border-radius:5px ; \">\n");
      out.write("                            <tr> <th><img src=\"volume.jpg\" alt=\"click on image\" style=\"width:20px;height:17px\">\n");
      out.write("                                </th>\n");
      out.write("                            </tr>\n");
      out.write("                        </table>\n");
      out.write("                                                                                        \n");
      out.write("\n");
      out.write("                    </th>\n");
      out.write("                    <th>\n");
      out.write("                    <h3 style=\"color: orangered\">Music Cloud</h3>\n");
      out.write("                    </th>\n");
      out.write("                \n");
      out.write("                </tr>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </th>\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            <table style=\"width: 100%\" cellpadding=\"5\">\n");
      out.write("                <tr>\n");
      out.write("                    <th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </th>\n");
      out.write("\n");
      out.write("                    <th></th>\t\t\n");
      out.write("                    <th></th>\n");
      out.write("                    <th></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <th><a href=\"home.jsp\"  >Home </a></th>\n");
      out.write("                    <th><a href=\"contact.jsp\" >Contact </a></th>\n");
      out.write("\n");
      out.write("                    <th><a href=\"signupform1.jsp\">Sign up</a></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <th> <a href=\"userlogin1.jsp\" >Login </a></th>\t\t\n");
      out.write("\n");
      out.write("                    <th><a href=\"help.jsp\" >Help Center </a>\n");
      out.write("                    <th><a href=\"aboutus.jsp\" >About Us </a></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table style=\"width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <a href=\"https://www.facebook.com\">\n");
      out.write("                <img src=\"fb.jpg\" alt=\"click on image\" style=\"width:20px;height:18px;border:0\"></a>\n");
      out.write("            <a href=\"https://www.twitter.com\">\n");
      out.write("                <img src=\"tw.jpg\" alt=\"click on image\" style=\"width:20px;height:18px;border:0\"></a>\n");
      out.write("           \n");
      out.write("\n");
      out.write("        </div>\n");
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
