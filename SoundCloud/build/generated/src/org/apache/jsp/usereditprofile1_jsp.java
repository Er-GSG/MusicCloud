package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class usereditprofile1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/userheader.jsp");
    _jspx_dependants.add("/usermenu.jsp");
    _jspx_dependants.add("/userfooter.jsp");
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

      out.write("      \r\n");

    String username = (String) session.getAttribute("un");
    String email = "";
    String phone = "";
    String secq = "";
    String seca = "";
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from user where username ='" + username + "'");

    if (rs.next()) {
        email = rs.getString("email");
        phone = rs.getString("phone no");
        secq = rs.getString("security question");
        seca = rs.getString("security answer");

    }

      out.write("\r\n");
      out.write("\r\n");
      out.write("<body><center>\r\n");
      out.write("    ");
      out.write("  <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("            <div class=\"style1\"> \n");
      out.write("\n");
      out.write("                    \n");
      out.write("               \n");
      out.write(" <div class=\"wrapper\">\n");
      out.write("   \n");
      out.write("            <div class=\"Menu\">\n");
      out.write("                ");
      out.write("\n");
      out.write("    <link type=\"text/css\" href=\"menu.css\" rel=\"stylesheet\" />\n");
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
      out.write("        <li><a href=\"signupform1.jsp\" class=\"parent\"><span>Song</span></a>\n");
      out.write("        \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"useraddsong1.jsp\"><span>Add Song</span></a></li>\n");
      out.write("                                <li><a href=\"userviewsongs1.jsp\"><span>View Songs</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("       \n");
      out.write("        <li><a href=\"userhome.jsp\"><span>Profile</span></a>\n");
      out.write("         <ul>\n");
      out.write("             <li><a href=\"usereditprofile1.jsp\" ><span>Edit Profile </span></a></li>\n");
      out.write("             <li> <a href=\"userchangepassword1.jsp\" ><span>Change Password </span></a></li>\n");
      out.write("             <li> <a href=\"userforgotpassword1.jsp\" ><span>Forgot Password</span> </a></li>\n");
      out.write("                            </ul>\n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"contact.jsp\"><span>Contacts</span></a></li>\n");
      out.write("        <li><a href=\"#\"><span>Help Center</span></a></li>\n");
      out.write("        <li ><a href=\"aboutus.jsp\"><span>About us</span></a></li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("  <form action=\"usereditprofile2.jsp\" method=\"post\">\r\n");
      out.write("<table    cellspacing=\"5\" cellpadding=\"5\" >\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td> User Name</td>\r\n");
      out.write("        <td> <input type=\"text\" name=\"uname\" disabled value=\"");
      out.print(username);
      out.write("\"/> </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td> Email</td>\r\n");
      out.write("        <td> <input type=\"text\" name=\"email\" value=\"");
      out.print(email);
      out.write("\"/> </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Phone no </td>\r\n");
      out.write("        <td> <input type=\"text\" name=\"phn\" value=\"");
      out.print(phone);
      out.write("\" /> </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td>Security Question</td>\r\n");
      out.write("        <td> <input type=\"text\" name=\"quest\" value=\"");
      out.print(secq);
      out.write("\"/> </td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("\r\n");
      out.write("        <td>security Answer</td>\r\n");
      out.write("        <td> <input type=\"text\" name=\"ans\" value=\"");
      out.print(seca);
      out.write("\"/></td>\r\n");
      out.write("    </tr>\r\n");
      out.write("    <tr>\r\n");
      out.write("        <td></td>\r\n");
      out.write("           <td> <input type=\"submit\" value=\"Edit\" style=\"border-radius: 5px;color: orangered;width: 65px\" /></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("\r\n");
      out.write("</table>\r\n");
      out.write("  </form>\r\n");
      out.write("                                       ");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        \n");
      out.write("    <style>\n");
      out.write("        body{ color:#666;\n");
      out.write("        font-size: medium;\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #666;\n");
      out.write("margin: 0;\n");
      out.write("line-height: 14px;\n");
      out.write("font-weight: 700;\n");
      out.write("       \n");
      out.write("        }\n");
      out.write("      \n");
      out.write("        h3{\n");
      out.write("        color:#666;\n");
      out.write("        font-size: 1em;\n");
      out.write("        text-decoration: none;\n");
      out.write("        color: #666;\n");
      out.write("margin: 0;\n");
      out.write("font-size: 1em;\n");
      out.write("line-height: 14px;\n");
      out.write("font-weight: 700}\n");
      out.write("       a{text-decoration: none; \n");
      out.write("         font-size:  small;\n");
      out.write("       }\n");
      out.write("\n");
      out.write("       \n");
      out.write("     \n");
      out.write("    </style>\n");
      out.write("        </head>\n");
      out.write("\n");
      out.write("        <body>\n");
      out.write("        <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("        <div class=\"Footer\">\n");
      out.write("            <div class=\"style3\">\n");
      out.write("            <table style=\"width: 100%; border-bottom: 1px solid #d4d4d4;border-radius: 5px\">\n");
      out.write("                <tr>\n");
      out.write("                    <td\n");
      out.write("                        ><h3>Music Cloud</h3></td>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("                <table style=\"width: 100%\" cellpadding=\"5\">\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                                         <th> <a href=\"usereditprofile1.jsp\" >Edit Profile </a></th>\t\t\n");
      out.write("\n");
      out.write("                                        <th><a href=\"useraddsong1.jsp\" >Add Song </a></th>\n");
      out.write("\n");
      out.write("                                                                           <th><a href=\"userhome.jsp\" >Home </a></th>\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                     <th> <a href=\"userchangepassword1.jsp\" >Change Password </a></th>\t\t\n");
      out.write("\n");
      out.write("                                       <th><a href=\"userviewsongs1.jsp\" >View Songs </a>\n");
      out.write("                    <th><a href=\"aboutus.jsp\" >About Us </a></th>\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                     <th> <a href=\"userforgotpassword1.jsp\" >Forgot Password </a></th>\t\n");
      out.write("                                     \n");
      out.write("                                        <th><a href=\"help.jsp\" >Help Center </a></th>\n");
      out.write(" <th><a href=\"contact.jsp\">Contact</a></th>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    \n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                </tr>\n");
      out.write("          \n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("           \n");
      out.write("            \n");
      out.write("                <br>\n");
      out.write("                \n");
      out.write("\n");
      out.write("            <table style=\"width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            <a href=\"https://www.facebook.com\">\n");
      out.write("    <img src=\"fb.jpg\" alt=\"click on image\" style=\"width:25px;height:25px;border:0\"></a>\n");
      out.write("            <a href=\"https://www.twitter.com\">\n");
      out.write("    <img src=\"tw.jpg\" alt=\"click on image\" style=\"width:25px;height:25px;border:0\"></a>\n");
      out.write("            <h6>Privacy Policy,Term Condition © 2014 Music Cloud Inc. All rights reserved</h6>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("        </html>");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
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
