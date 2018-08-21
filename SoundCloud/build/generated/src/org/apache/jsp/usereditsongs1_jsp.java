package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class usereditsongs1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Menu.html");
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

      out.write("\n");
      out.write("\n");
      out.write("\n");


        String songid = request.getParameter("songid");
        String username=(String)session.getAttribute("un");
                String songname = "";
                String artist = "";
                String album = "";
                String year = "";
                String genre = "";
                String subgenre = "";
                String date = "";
                String duration = "";
                String albumart = "";

        
        
                Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from songs where  idsongs='"+songid+"'");
                if (rs.next())
                {
                     songid = rs.getString("idsongs");
                    songname = rs.getString("songname");
                    artist = rs.getString("artist");
                    album = rs.getString("album");
                    year = rs.getString("year");
                    subgenre = rs.getString("subgenre");
                    date = rs.getString("date");
                    duration = rs.getString("duration");
                    albumart=rs.getString("albumart");
               

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Song Edit Page</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            var xmlHttp;\n");
      out.write("            function go()\n");
      out.write("            {\n");
      out.write("                xmlHttp= new XMLHttpRequest();\n");
      out.write("                var h=document.getElementById(\"category\").value;\n");
      out.write("                \n");
      out.write("                xmlHttp.open(\"GET\",\"songajax.jsp?category=\"+h, true);\n");
      out.write("                xmlHttp.send();\n");
      out.write("                xmlHttp.onreadystatechange=go2;\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            function go2()\n");
      out.write("            {\n");
      out.write("               \n");
      out.write("                if(xmlHttp.readyState == 4 && xmlHttp.status == 200)\n");
      out.write("                {\n");
      out.write("                   \n");
      out.write("                    document.getElementById(\"content\").innerHTML=xmlHttp.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("                    ");
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
      out.write("        <form action=\"usereditsongs2.jsp\" method=\"post\">\n");
      out.write("            <table cellspacing=\"8\" cellpadding=\"8\" style=\"padding-top: 30px;\">\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Song Id</td>\n");
      out.write("                    <td><input type=\"text\" name=\"songid\" readonly value=\"");
      out.print(songid);
      out.write("\">  </td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Song Name</td>\n");
      out.write("                    <td><input type=\"text\" name=\"songname\" value=\"");
      out.print(songname);
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Artist</td>\n");
      out.write("                    <td><input type=\"text\" name=\"artist\" value=\"");
      out.print(artist);
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Album</td>\n");
      out.write("                    <td><input type=\"text\" name=\"album\" value=\"");
      out.print(artist);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Year</td>\n");
      out.write("                    <td><input type=\"text\" name=\"year\" value=\"");
      out.print(year);
      out.write("\"/></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Genre</td>\n");
      out.write("                            <td><select name=\"gen\" onchange=\"go()\" id=\"category\">\n");
      out.write("                                    ");

                                    ResultSet rs1 = stmt.executeQuery("select * from category");
                                  while(rs1.next())
                                  {
                                      genre=rs1.getString("category");
                                    
                                    
      out.write("\n");
      out.write("                                    <option> ");
      out.print(genre);
      out.write("</option>\n");
      out.write("                        ");

                                  }
                        
      out.write("\n");
      out.write("                                    \n");
      out.write("                                </select></td>\n");
      out.write("                        \n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Sub genre</td>\n");
      out.write("                            <td id=\"content\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Date</td>\n");
      out.write("                    <td><input type=\"text\" name=\"date\" value=\"");
      out.print(date);
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td>Duration</td>\n");
      out.write("                    <td><input type=\"text\" name=\"duration\" value=\"");
      out.print(duration);
      out.write("\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    \n");
      out.write("                    <td></td>\n");
      out.write("                    <td><input type=\"submit\" value=\"update\" style=\"border-radius: 5px;color: orangered;width: 65px\"> </td>\n");
      out.write("                </tr>\n");
      out.write("                ");

                }
                
      out.write("\n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("                                            ");
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
      out.write("    \n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("    </body>\n");
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
