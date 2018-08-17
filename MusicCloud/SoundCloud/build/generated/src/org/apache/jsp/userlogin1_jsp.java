package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userlogin1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("        <title> User Login</title>\n");
      out.write(" <link href=\"two.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    ");
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
      out.write("    <div id=\"copyright\" style=\"display: none\">\r\n");
      out.write("    Copyright &copy; 2014\r\n");
      out.write("    <a href=\"http://apycom.com/\">Apycom jQuery Menus</a></div>\r\n");
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
      out.write("          \n");
      out.write("    <center>\n");
      out.write("        \n");
      out.write("        <form action=\"userlogin2.jsp\" method=\"post\">\n");
      out.write("\n");
      out.write("          \n");
      out.write("            <table style=\"padding-top: 50px\"><tr><th>\n");
      out.write("                        <label style=\"color: orangered;font-family: sans-serif;font-size: 23px\">User Login</label></th></tr></table>\n");
      out.write("\n");
      out.write("\n");
      out.write("            \n");
      out.write("            <table cellspacing=\"8\" cellpadding=\"8\" style=\"padding-top: 30px;\">\n");
      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <td> User Name</td>\n");
      out.write("                    <td > <input type=\"text\" name=\"uname\" required/> </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td> Password </td>\n");
      out.write("                    <td> <input type=\"password\" name=\"password\" required /> </td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td></td>\n");
      out.write("                    <td> <input type=\"submit\" value=\"Login\" style=\"border-radius: 5px;color: orangered;width: 65px\"/></td>\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("        <br>\n");
      out.write("        <a href=\"signupform1.jsp\" >  Create New Account</a>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <a href=\"userforgotpassword1.jsp\" > Forgot password </a>  \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("\n");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                          ");
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
      out.write("                            <tr> <th><img src=\"logo.png\" alt=\"click on image\" style=\"width:20px;height:17px\">\n");
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
      out.write("                ");

if(session.getAttribute("un")==null)
{

      out.write("\n");
      out.write("                <tr>\n");
      out.write("                    <th><a href=\"home.jsp\"  >Home </a></th>\n");
      out.write("                    <th><a href=\"contact.jsp\" >Contact Us </a></th>\n");
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
      out.write(" ");
 
  }
  else{
       
      out.write(" \n");
      out.write("  \n");
      out.write("             <tr>\n");
      out.write("                    <th><a href=\"home.jsp\"  >Home </a></th>\n");
      out.write("                     <th><a href=\"help.jsp\" >Help </a></th>\n");
      out.write("\n");
      out.write("                    <th><a href=\"publicuserinterface1.jsp\" >Download </a></th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("\n");
      out.write("                    <th> <a href=\"logout.jsp\" >Log Out </a></th>\t\t\n");
      out.write("                    <th><a href=\"contact.jsp\" >Contact Us </a></th>\n");
      out.write("\n");
      out.write("                    <th><a href=\"aboutus.jsp\" >About Us </a></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("       \n");
      out.write("            ");

}
      out.write("\n");
      out.write("          \n");
      out.write("<table style=\"width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px;padding-top: 20px;\n");
      out.write("\"></table>\n");
      out.write("\n");
      out.write("           <h5>Global Institute Of Management & Emerging Technologies, Amritsar</h5>\n");
      out.write("                <h6> Developers Gurpreet Singh &  Kawaljeet Singh</h6>\n");
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
      out.write("     \n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("      \n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
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
