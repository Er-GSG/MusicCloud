package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(3);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/Sidebar.jsp");
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <link href=\"two.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"all\">\n");
      out.write("            ");
      out.write("<div id=\"header\">\n");
      out.write("    <center>\n");
      out.write("        <h1>Header data</h1>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            ");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<div id=\"sidebar\">\n");
      out.write("    <a href=\"\">Link-1</a><br>\n");
      out.write("    <a href=\"\">Link-2</a><br>\n");
      out.write("    <a href=\"\">Link-3</a><br>\n");
      out.write("    <a href=\"\">Link-4</a><br>\n");
      out.write("    <a href=\"\">Link-5</a><br>\n");
      out.write("    <a href=\"\">Link-6</a><br>\n");
      out.write("    <a href=\"\">Link-7</a><br>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            <div id=\"main\">\n");
      out.write("                <center>\n");
      out.write("                    <h1>Sign Up Form</h1>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter name</td>\n");
      out.write("                        <td><input type=\"text\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter phone number</td>\n");
      out.write("                        <td><input type=\"text\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <td>Enter email</td>\n");
      out.write("                        <td><input type=\"text\"></td>\n");
      out.write("                    </tr>\n");
      out.write("                                      \n");
      out.write("                    \n");
      out.write("                </table>  \n");
      out.write("                    <input type=\"Button\" value=\"Submit\" />\n");
      out.write("                    </center>\n");
      out.write("           </div>\n");
      out.write("            ");
      out.write("<div id=\"footer\">\n");
      out.write("    <center>\n");
      out.write("        <h4>Footer Data</h4><br> \n");
      out.write("        \n");
      out.write("                \n");
      out.write("    </center>\n");
      out.write("</div>");
      out.write("\n");
      out.write("            \n");
      out.write("        </div>\n");
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
