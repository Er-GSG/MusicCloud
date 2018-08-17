 


<%@page import="java.sql.*"%>
<%


    String username = request.getParameter("uname");
    String password = request.getParameter("password");
    
            Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
            Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
 ResultSet rs = stmt.executeQuery("select * from admin where username ='"+username+"' and password= '"+password+"'");
    
    if(rs.next())
    
    {
        session.setAttribute("admin", username);
        response.sendRedirect("adminhome.jsp");
        
    }
    
    else
    
    {
        response.sendRedirect
        ("adminlogin1.jsp?msg=invalid username/password");
    }
    %>