package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class homesearch2_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write(" ");
   
                    
//                    String value = request.getParameter("value");
                String    value="j";
                    String songname = "";
                    String album = "";
                    String artist = "";
                                       String id = "";

                    String albumart = "";
                    
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = stmt.executeQuery("select * from songs where songname LIKE '"+value+"%' or album LIKE '"+value+"%' or artist LIKE '"+value+"%' ");

                    while (rs.next())
                            {
                        songname = rs.getString("songname");
                        artist = rs.getString("artist");
                          id = rs.getString("idsongs");
                        album = rs.getString("album");
                        albumart = rs.getString("albumart");
                      
                    

                
      out.write("\n");
      out.write("                \n");
      out.write("              \n");
      out.write("\n");
      out.write("                    <table width=\"100\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td style=\"min-width: 50px;\" >\n");
      out.write("                                <a href=\"publicuserinterface3.jsp?id=");
      out.print(id);
      out.write("\"> <img src=\"");
      out.print(albumart);
      out.write("\" width=\"40\" height=\"40\"  /></a>\n");
      out.write("                        </td >\n");
      out.write("                        <td style=\"font-family: sans-serif;font-size: 13px;color: #303030;min-width: 240px\">");
      out.print(artist);
      out.write(',');
      out.print(songname);
      out.write(',');
      out.print(album);
      out.write("\n");
      out.write("</td>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                                   \n");
      out.write("                </table>\n");
      out.write("\n");

                            }

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
