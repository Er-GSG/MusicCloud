package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class testinterface_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Public interface</title>\n");
      out.write("        <script type=\"text/javascript\" src=\"./wavesurfer.min.js\"></script>\n");
      out.write("        <script>\n");
      out.write("            function go()\n");
      out.write("            {\n");
      out.write("                xmlhttp = new XMLHttpRequest();\n");
      out.write("                var h = document.g*etElementById(\"category\").value;\n");
      out.write("                xmlhttp.onreadystatechange = go2;\n");
      out.write("                xmlhttp.open(\"GET\", \"publicuserinterface2.jsp?category=\" + h, true);\n");
      out.write("                xmlhttp.send();\n");
      out.write("            }\n");
      out.write("            function go2()\n");
      out.write("            {\n");
      out.write("                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)\n");
      out.write("                {\n");
      out.write("                    document.getElementById(\"content\").innerHTML\n");
      out.write("                            = xmlhttp.responseText;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            function playSong(id)\n");
      out.write("            {\n");
      out.write("\n");
      out.write("                document.getElementById(\"playSong\" + id).style.display = \"block\";\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("\n");
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
      out.write("        <script>\n");
      out.write("            \n");
      out.write("           var wavesurfer = Object.create(WaveSurfer);\n");
      out.write("         \n");
      out.write("           wavesurfer.init({\n");
      out.write("    container: '#wave'\n");
      out.write("});\n");
      out.write("\n");
      out.write("wavesurfer.on('ready', function () {\n");
      out.write("    wavesurfer.play();\n");
      out.write("});\n");
      out.write("wavesurfer.load('./songs/1.mp3');\n");
      out.write("\n");
      out.write("            \n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("    <center>\n");
      out.write("        <div >\n");
      out.write("            <input type=\"search\"/>\n");
      out.write("            <form action=\"publicuserinterface2.jsp\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <td> <select name=\"category\" id=\"category\" style=\"width: 500px;height: 20px;border-radius: 5px\">\n");
      out.write("                            <option>Select Category</option>\n");
      out.write("                            ");

                                String category = "";
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from category");
                                while (rs.next()) {
                                    category = rs.getString("category");

                            
      out.write("\n");
      out.write("\n");
      out.write("                            <option>");
      out.print(category);
      out.write("</option>\n");
      out.write("\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select></td><td><input type=\"button\" name=\"submit\" value=\"Search\" onclick=\"go()\" style=\"width: 120px;height: 20px;border-radius: 5px;color: orangered;\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div id=\"content\"></div>\n");
      out.write("\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        \n");
      out.write("        <table width=\"50\">\n");
      out.write("            <th><label style=\"color: white;font-family: sans-serif;font-size: 20px\">Top Downloads</label></th> \n");
      out.write("            <tr>  \n");
      out.write("                ");

                    int i = 0;
                    int Count;
                    Connection soundcloud1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt1 = soundcloud1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*)'count', SONGID FROM DOWNLOAD GROUP BY SONGID ORDER BY COUNT(*) DESC LIMIT 5");
                    while (rs1.next()) {
                       i++;
                        Count = rs1.getInt("count");
                        int id = rs1.getInt("songid");
                        String songname = "";
                        String albumart = "";
                        Statement stmt2 = soundcloud1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs2 = stmt2.executeQuery("SELECT * from songs where idsongs='" + id + "'");
                        if (rs2.next()) {
                            songname = rs2.getString("songname");
                            albumart = rs2.getString("albumart");

                            if (i == 6) {
                
      out.write("\n");
      out.write("            <tr> <td> <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"");
      out.print(albumart);
      out.write("\" width=\"150\" height=\"150\"  />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr><th>");
      out.print(songname);
      out.write("</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><th>Download Times...");
      out.print(Count);
      out.write("</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                ");


                } else {
                
      out.write("\n");
      out.write("                <td> <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"");
      out.print(albumart);
      out.write("\" width=\"150\" height=\"150\"  />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr><th><a href=\"publicuserinterface3.jsp?id=");
      out.print(id);
      out.write("\" style=\"color: #303030\">");
      out.print(songname);
      out.write("</a></th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                ");

                            }
                        }
                    }
                
      out.write(" \n");
      out.write("            </tr></table>  \n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("\n");
      out.write("        <table width=\"50\">\n");
      out.write("            <th><label style=\"color: orangered;font-family: sans-serif;font-size: 21px\">Top Favourites</label></th>\n");
      out.write("\n");
      out.write("            <tr>   \n");
      out.write("                ");

                    int a = 0;
                    int playlistcount;
                    Connection soundcloud2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt2 = soundcloud2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs2 = stmt2.executeQuery("SELECT COUNT(*)'count', SONGID FROM PLAYLIST GROUP BY SONGID ORDER BY COUNT(*) DESC LIMIT 5");
                    while (rs2.next()) {
                        a++;
                        playlistcount = rs2.getInt("count");
                        int id = rs2.getInt("songid");
                        String songname = "";
                        String albumart = "";
                        Statement stmt3 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs3 = stmt3.executeQuery("SELECT * from songs where idsongs='" + id + "'");
                        if (rs3.next()) {
                            songname = rs3.getString("songname");
                            albumart = rs3.getString("albumart");
                            if (a == 6) {

                
      out.write("\n");
      out.write("            <tr> <td> <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"");
      out.print(albumart);
      out.write("\" width=\"150\" height=\"150\"  />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr><th>");
      out.print(songname);
      out.write("</th>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr><th>Download Times...");
      out.print(playlistcount);
      out.write("</th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                ");


                } else {
                
      out.write("\n");
      out.write("                <td> <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>\n");
      out.write("                                <img src=\"");
      out.print(albumart);
      out.write("\" width=\"150\" height=\"150\"  />\n");
      out.write("                            </td>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("                        <tr><th><a href=\"publicuserinterface3.jsp?id=");
      out.print(id);
      out.write("\" style=\"color: #303030\">");
      out.print(songname);
      out.write("</a></th>\n");
      out.write("                        </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </table>\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                ");

                            }
                        }
                    }
                
      out.write(" \n");
      out.write("            </tr></table> \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");
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
      out.write("           \n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("</html>\n");
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
