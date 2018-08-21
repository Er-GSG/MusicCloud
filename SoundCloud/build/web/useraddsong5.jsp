 <%@page import="vmm.*" %>
<%@page import="java.sql.*"%>

        <%  String albumart="";
            String name=session.getAttribute("id").toString();
            try
             {
                 String absolutepath=getServletContext().getRealPath("/albumart");
                 
                vmm.FileUploader.savefile(request,absolutepath,name+".jpg");
               
                  albumart="./albumart/"+name+".jpg";  
             //   vmm.FileUploader.savefile(request, absolutepath,saveFile);
             Class.forName("com.mysql.jdbc.Driver");
        Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
        Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select * from songs where idsongs ='" + name+ "'");
          if (rs.next())
              
        { 
            rs.updateString("albumart",albumart);
            rs.updateRow();
            response.sendRedirect("userhome.jsp?msg=Album art and song upload sucessfully");
        }
           
             }
           catch(Exception ex)
             {
                ex.printStackTrace();
             }
            
            %>