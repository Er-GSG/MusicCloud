<%@page import="java.sql.*"%>

<% 
        String username = request.getParameter("uname");
        String answer = request.getParameter("ans");
        String password= "";        
        Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
            Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
     ResultSet rs = stmt.executeQuery("select * from user where username ='"+username+"'");
     
    if(rs.next())
    {
        String an=rs.getString("security answer");
        if(an.equals(answer))
        {
        password=rs.getString("password");
        
      response.sendRedirect("userlogin1.jsp?msg= your password is "+password);
        }
      
        else
        {
             response.sendRedirect
        ("userlogin1.jsp?msg=Incorrect Security Answer");
        }
    }
   


%>