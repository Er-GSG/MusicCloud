package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class signupform1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Menu.html");
    _jspx_dependants.add("/Footer.jsp");
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title> User Sign Up Form</title>\n");
      out.write("        <script>\n");
      out.write("            function check()\n");
      out.write("            {\n");
      out.write("                var np =document.getElementById(\"pass1\").value;\n");
      out.write("                var cp =document.getElementById(\"pass2\").value;\n");
      out.write("                var tel=document.getElementById(\"telephone\").value;\n");
      out.write("                \n");
      out.write("                if (np===cp)\n");
      out.write("                {\n");
      out.write("                    if(tel.length===10)\n");
      out.write("                    {\n");
      out.write("                       \n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(\"enter a valid phone number\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                else\n");
      out.write("                {\n");
      out.write("                    alert(\"New Password and Confirm Password Do not match\");\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("         </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>     \n");
      out.write("        ");
      out.write("\n");
      out.write("            <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("            <div class=\"style1\"> \n");
      out.write("\n");
      out.write("                    \n");
      out.write("               \n");
      out.write(" <div class=\"wrapper\">\n");
      out.write("   \n");
      out.write("            <div class=\"Menu\">\n");
      out.write("                ");
      out.write("\r\n");
      out.write("    <link type=\"text/css\" href=\"menu.css\" rel=\"stylesheet\" />\r\n");
      out.write("    <script type=\"text/javascript\" src=\"jquery.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"menu.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div id=\"menu\">\r\n");
      out.write("    <ul class=\"menu\">\r\n");
      out.write("        <li><a href=\"home.jsp\" class=\"parent\"><span>Home</span></a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"signupform1.jsp\" class=\"parent\"><span>Sign Up</span></a>\r\n");
      out.write("            \r\n");
      out.write("        </li>\r\n");
      out.write("        <li><a href=\"userlogin1.jsp\"><span>Login</span></a></li>\r\n");
      out.write("        <li><a href=\"contact.jsp\"><span>Contacts</span></a></li>\r\n");
      out.write("        <li><a href=\"#\"><span>Help Center</span></a></li>\r\n");
      out.write("        <li ><a href=\"aboutus.jsp\"><span>About us</span></a></li>\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write(" \n");
      out.write("            \n");
      out.write("            <div class=\"banner\"></div>\n");
      out.write("            <div class=\"style2\">\n");
      out.write("                \n");
      out.write("            <div class=\"maincontent\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        <form action=\"signupform2.jsp\" method=\"post\" onsubmit=\"return check()\">\n");
      out.write("            <table cellspacing=\"5\" cellpadding=\"5\" style=\"padding-left: 200px\">\n");
      out.write("                <caption style=\"color:orangered;font-family: sans-serif;font-size: 21px;margin-bottom: 20px\">WELCOME USER</caption>\n");
      out.write("              \n");
      out.write("                <tr><td style=\"width:160px\" > Username</td>\n");
      out.write("                    <td> <input type=\"text\" required=\"\" name=\"uname\"> </td></tr>\n");
      out.write("                <tr><td>New Password</td>\n");
      out.write("                    <td><input type=\"password\" required=\"\" name=\"np\" id=\"pass1\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td> Confirm Password</td>\n");
      out.write("                    <td><input type=\"password\" required=\"\" name=\"cp\" id=\"pass2\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>Email</td>\n");
      out.write("                    <td><input type=\"email\" required=\"\" name=\"email\"></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr><td>Phone No.</td>\n");
      out.write("                    <td><input type=\"tel\" required=\"\" name=\"pho no\" id=\"telephone\"></td></tr>\n");
      out.write("                <tr><td>Security Question</td>\n");
      out.write("                    <td><select name=\"security quest\">\n");
      out.write("                            <option value=\"What is the name of your favorite childhood teacher?\">What is the name of your favorite childhood teacher?</option>\n");
      out.write("                            <option value=\"What is the country of your ultimate dream vacation?\">What is the country of your ultimate dream vacation?</option>\n");
      out.write("                            <option value=\"What is your favorite color?\">What is your favorite color?</option>\n");
      out.write("                            <option value=\"What was the name of your elementary / primary school?\">What was the name of your elementary / primary school?</option>\n");
      out.write("                            <option value=\"What was the make and model of your first car?\">What was the make and model of your first car?</option>\n");
      out.write("                            <option value=\"What was your maternal grandfather?s first name?\">What was your maternal grandfather?s first name?</option>\n");
      out.write("                            <option value=\"In what city or town does your nearest sibling live?\">In what city or town does your nearest sibling live?</option>\n");
      out.write("                            <option value=\"What time of the day were you born? (hh:mm)\">What time of the day were you born? (hh:mm)</option>\n");
      out.write("                        </select></td></tr>\n");
      out.write("                <tr><td>Security Answer</td>\n");
      out.write("                    <td><input type=\"text\" required=\"\" name=\"security ans\"/> </td></tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td style=\"padding-left: 95px;\"><br><input type=\"submit\" value=\"signup\" style=\"background-color: orangered;width: 70px;height: 25px;border-radius: 5px;border: 15px\"></td></tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        ");

            String msg1 = request.getParameter("msg");
            if (msg1 != null) {
        
      out.write("\n");
      out.write("        <h3> ");
      out.print(msg1);
      out.write("</h3>\n");
      out.write("\n");
      out.write("        ");

            }
        
      out.write("\n");
      out.write("          ");
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
      out.write("    <body>\n");
      out.write("    <center>\n");
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
      out.write("    </center>\n");
      out.write("    </body>\n");
      out.write("</html>");
      out.write("    \n");
      out.write("    </center>\n");
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
}
