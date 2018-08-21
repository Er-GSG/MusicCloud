package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class adminheader_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/adminmenu.jsp");
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
      out.write("            <link rel=\"stylesheet\" href=\"style.css\">\n");
      out.write("            <div class=\"style1\"> \n");
      out.write("\n");
      out.write("                    \n");
      out.write("               \n");
      out.write(" <div class=\"wrapper\">\n");
      out.write("    <div class=\"banner\"></div>\n");
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
      out.write("        \n");
      out.write("        ");

if(session.getAttribute("admin")==null)
{

      out.write("\n");
      out.write("        <li><a href=\"publicuserinterface1.jsp\" class=\"parent\"><span>Explore Music</span></a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        <li><a href=\"adminlogin1.jsp\" class=\"parent\"><span>Login</span></a>\n");
      out.write("            \n");
      out.write("        </li>\n");
      out.write("        \n");
      out.write("        ");

    
}
else{

      out.write("     \n");
      out.write("\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("         <li><a href=\"#\" class=\"parent\"><span>Category</span></a>\n");
      out.write("        \n");
      out.write("                            <ul>\n");
      out.write("                                <li><a href=\"addcategory1.jsp\"><span>Add Category</span></a></li>\n");
      out.write("                                <li><a href=\"viewcategory1.jsp\"><span>view Category</span></a></li>\n");
      out.write("                                <li><a href=\"addsubcategory1.jsp\"><span>Add Sub-Category</span></a></li>\n");
      out.write("                                <li><a href=\"viewsubcategory1.jsp\"><span>View Category</span></a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("         <li><a href=\"changepassword1.jsp\" class=\"parent\"><span>Change Password</span></a>\n");
      out.write("        \n");
      out.write("                        </li>\n");
      out.write("         <li><a href=\"adminlogout.jsp\" class=\"parent\"><span>Logout</span></a>\n");
      out.write("        \n");
      out.write("                        </li>\n");
      out.write("                        ");

}
                        
      out.write("\n");
      out.write("        \n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write(" \n");
      out.write("            \n");
      out.write("           \n");
      out.write("            <div class=\"style2\">\n");
      out.write("                \n");
      out.write("            <div class=\"maincontent\">\n");
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
