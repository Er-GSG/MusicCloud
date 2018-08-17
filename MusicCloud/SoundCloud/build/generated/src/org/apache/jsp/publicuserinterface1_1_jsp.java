package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class publicuserinterface1_1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title>Public interface</title>\n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            body {background-color:tomato}\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div id=\"content\">\n");
      out.write("            <form action=\"publicuserinterface1.jsp\" method=\"post\">\n");
      out.write("                <table>\n");
      out.write("                    <td>Category</td>\n");
      out.write("                    <td> <select name=\"category\" id=\"category\" >\n");
      out.write("                            <option>Select category</option>\n");
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
      out.write("                        </select></td><td><input type=\"submit\" name=\"submit\" value=\"Show\" onclick=\"go()\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("\n");
      out.write("                </table>\n");
      out.write("<!--                <div id=\"content\">\n");
      out.write("                </div>-->\n");
      out.write("            </form>\n");
      out.write("</div> \n");
      out.write("                \n");
      out.write("    </center>\n");
      out.write("                        \n");
      out.write("                       \n");
      out.write("</body>\n");
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
