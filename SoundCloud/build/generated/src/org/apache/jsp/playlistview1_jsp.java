package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class playlistview1_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html> \n");
      out.write("    <head> \n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        ");

            String user = (String) session.getAttribute("un");
            Class.forName("com.mysql.jdbc.Driver");
            Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
            Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from playlist where username='" + user + "'");
            while (rs.next()) {
                String songid = rs.getString("songid");

                String songname = "";
                String artist = "";
                String album = "";
                String albumart = "";

                Statement stmt1 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs1 = stmt1.executeQuery("select * from songs where idsongs='" + songid + "'");

                while (rs1.next()) {
                    songname = rs1.getString("songname");
                    artist = rs1.getString("artist");
                    album = rs1.getString("album");
                    albumart = rs1.getString("albumart");

        
      out.write("\n");
      out.write("                    <form action=\"playlistview2.jsp?id=");
      out.print(songid);
      out.write("\" method=\"post\">\n");
      out.write("\n");
      out.write("        <table width=\"100\" cellpadding=\"10\">\n");
      out.write("\n");
      out.write("                <tr >\n");
      out.write("                    <td rowspan=\"9\"  style=\"background-color: white\">\n");
      out.write("                        <img src=\"");
      out.print(albumart);
      out.write("\" width=\"170\" height=\"170\"/>\n");
      out.write("                    </td>\n");
      out.write("                \n");
      out.write("                <td  style=\"background-color: white\">\n");
      out.write("                    <table width=\"300\">                           \n");
      out.write("                          \n");
      out.write("                           <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h5>");
      out.print(songname);
      out.write("</h5>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                           \n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h5>");
      out.print(album);
      out.write("</h5>\n");
      out.write("\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            \n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                                    <h5> ");
      out.print(artist);
      out.write("</h5>\n");
      out.write("                                </td>\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td>\n");
      out.write("                            <input type=\"submit\" value=\"Remove From Playlist\" /> \n");
      out.write("                                </td>\n");
      out.write("                            </tr >\n");
      out.write("                           \n");
      out.write("                        </table>\n");
      out.write("                            \n");
      out.write("                            \n");
      out.write("                </td>\n");
      out.write("        </tr>\n");
      out.write("                            \n");
      out.write("            </table>\n");
      out.write("                </form>\n");
      out.write("           \n");
      out.write("\n");
      out.write("        ");

                }
            }
        
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
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
