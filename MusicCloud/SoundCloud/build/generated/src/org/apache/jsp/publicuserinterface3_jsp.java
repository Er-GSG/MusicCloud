package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class publicuserinterface3_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head> \n");
      out.write("\n");
      out.write("        <style>\n");
      out.write("            table{  font-family: sans-serif;\n");
      out.write("                    font-weight:  normal;\n");
      out.write("                    color: #303030;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </head> \n");
      out.write("    <body>\n");
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
      out.write("    <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div>\n");
      out.write("            ");

                String id = request.getParameter("id");
                String username = (String) session.getAttribute("un");

                String album = "";
                String songname = "";
                String artist = "";
                String subgenre = "";
                String duration = "";
                String size = "";
                String date = "";
                String albumart = "";
                String user = "";
                String path = "";
                String year = "";
                String genre = "";
                Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from songs where idsongs ='" + id + "'");

                if (rs.next()) {
                    artist = rs.getString("artist");
                    year = rs.getString("year");
                    genre = rs.getString("genre");
                    subgenre = rs.getString("subgenre");
                    album = rs.getString("album");
                    albumart = rs.getString("albumart");
                    duration = rs.getString("duration");
                    size = rs.getString("size");
                    user = rs.getString("username");
                    date = rs.getString("date");
                    songname = rs.getString("songname");
                    path = rs.getString("path");

            
      out.write("\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                var xmlhttp;\n");
      out.write("\n");
      out.write("                function playlist()\n");
      out.write("                {\n");
      out.write("                    xmlhttp = new XMLHttpRequest();\n");
      out.write("                    xmlhttp.onreadystatechange = go2;\n");
      out.write("                    xmlhttp.open(\"GET\", \"playlist?id=");
      out.print(id);
      out.write("\", true);\n");
      out.write("                    xmlhttp.send();\n");
      out.write("                }\n");
      out.write("\n");
      out.write("                function go2()\n");
      out.write("                {\n");
      out.write("                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\n");
      out.write("                    {\n");
      out.write("                        value = xmlhttp.responseText;\n");
      out.write("                        if (value == 1)\n");
      out.write("                        {\n");
      out.write("                            window.location.href = \"userlogin1.jsp\";\n");
      out.write("                        }\n");
      out.write("                        else\n");
      out.write("                        {\n");
      out.write("                            document.getElementById(\"favourite\").value = xmlhttp.responseText;\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("\n");
      out.write("            <form action=\"download?path=");
      out.print(id);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td style=\"min-width: 200px\">\n");
      out.write("                            <img src=\"");
      out.print(albumart);
      out.write("\" width=\"183\" height=\"183\"  />\n");
      out.write("                        </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <td > \n");
      out.write("                            <table  cellpadding=\"4\"  >\n");
      out.write("                                <tr>\n");
      out.write("\n");
      out.write("                                    <td style=\"font-family: sans-serif;font-weight:  normal ;color: orangered \">Songname</td>\n");
      out.write("                                    <td style=\"color: orangered\">\n");
      out.write("                                        ");
      out.print(songname);
      out.write("\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Album</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(album);
      out.write("\n");
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Artist</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(artist);
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Year</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(year);
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Date</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(date);
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Duration</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(duration);
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>Size</td>\n");
      out.write("                                    <td>\n");
      out.write("                                        ");
      out.print(size);
      out.write("\n");
      out.write("                                    </td>\n");
      out.write("                                </tr>\n");
      out.write("                                <tr>\n");
      out.write("                                    <td> </td>\n");
      out.write("                               \n");
      out.write("\n");
      out.write("                                </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            </table>\n");
      out.write("                                     <label style=\"font-family: sans-serif;\n");
      out.write("                                        font-weight:  normal;\n");
      out.write("                                        color: #303030;\">\n");
      out.write("                                        Uploaded By ");
      out.print(user);
      out.write("\n");
      out.write("\n");
      out.write("                                    </label>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <audio controls style=\"width:70%;\">\n");
      out.write("            <source src=\"");
      out.print(path);
      out.write("\" type=\"audio/mp3\">\n");
      out.write("        </audio>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        ");


            Statement stmt2 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery("select * from playlist where songid='" + id + "' and username='" + username + "'");
            if (rs2.next()) {

        
      out.write("\n");
      out.write("        <input type=\"button\" value=\"Remove From Favourites\" id=\"favourite\" onclick=\"playlist()\" style=\"font-family: sans-serif;\n");
      out.write("                                        font-weight:  normal;\n");
      out.write("                                        color: #303030;color: orangered;border-radius: 5px\"/>\n");
      out.write("        ");
                 } else {

        
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"button\" value=\"Add as Favourites\" id=\"favourite\" onclick=\"playlist()\" style=\"font-family: sans-serif;\n");
      out.write("                                        font-weight:  normal;\n");
      out.write("                                        color: #303030;color: orangered;border-radius: 5px\"/>\n");
      out.write("        ");
                    }
        
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            int Count;
            Statement stmt3 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs3 = stmt3.executeQuery("select count(*)'count' from download where songid='" + id + "'");
            rs3.next();
            Count = rs3.getInt("count");

        
      out.write("\n");
      out.write("\n");
      out.write("        <input type=\"submit\" value=\"Downloads\" style=\"font-family: sans-serif;\n");
      out.write("                                        font-weight:  normal;\n");
      out.write("                                        color: #303030; color: orangered;border-radius: 5px\" />   ");
      out.print(Count);
      out.write("  Times</center>\n");
      out.write("\n");
      out.write("\n");
      out.write("</form>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<center>\n");
      out.write("\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("    <br>\n");
      out.write("\n");
      out.write("    <div style=\"overflow-x: scroll;overflow-y: hidden;\">\n");
      out.write("        <table>\n");
      out.write("            <th><label style=\"color: orangered;font-family: sans-serif;font-size: 21px;padding-right: 650px;\">Other Song By ");
      out.print(user);
      out.write("</label></th>\n");
      out.write("</table>\n");
      out.write("<br>\n");
      out.write("\n");
      out.write("            <MARQUEE WIDTH=100%  BGColor=#298cd; >\n");
      out.write("\n");
      out.write("        <table>\n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                ");

                    Statement stmt4 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs4 = stmt4.executeQuery("select * from songs where username='" + user + "'");
                    while (rs4.next()) {
                        String p = rs4.getString("albumart");
                        String n = rs4.getString("songname");
                        String id3 = rs4.getString("idsongs");

                
      out.write("\n");
      out.write("                <td>  \n");
      out.write("\n");
      out.write("                    <table style=\"padding-top: 15px\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"");
      out.print(p);
      out.write("\" width=\"170\" height=\"170\"  />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr><th><a href=\"publicuserinterface3.jsp?id=");
      out.print(id3);
      out.write('"');
      out.write('>');
      out.print(n);
      out.write("</a></th>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("</table>\n");
      out.write("                                                                                </MARQUEE>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    ");
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
      out.write("            ");

}
      out.write("\n");
      out.write("            <br>\n");
      out.write("            <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <table style=\"width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            </table>\n");
      out.write("\n");
      out.write("           <h5>Global Institute Of Management & Emerging Technologies, Amritsar</h5>\n");
      out.write("                <h5> Developed By Gurpreet Singh &  Kawaljeet Singh</h5>\n");
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
      out.write("                    \n");
      out.write("</center>\n");
      out.write("\n");
      out.write("</body>\n");
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
