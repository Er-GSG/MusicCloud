 <%@page import="vmm.*" %>
<%@page import="java.sql.*"%>

        <%  String path="";
            String name=session.getAttribute("un").toString();
            
            try
             {
                 String absolutepath=getServletContext().getRealPath("/photos");
                 
                vmm.FileUploader.savefile(request,absolutepath,name+".jpg");
               
                  path="./photos/"+name+".jpg";  
             //   vmm.FileUploader.savefile(request, absolutepath,saveFile);
             Class.forName("com.mysql.jdbc.Driver");
        Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
        Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select * from user where username ='" + name+ "'");
          if (rs.next())
        {     rs.updateString("path",path);
             rs.updateRow();
              response.sendRedirect("userhome.jsp?msg=Picture uploaded");
        }
           
             }
           catch(Exception ex)
             {
                ex.printStackTrace();
             }
            
            %>
  
