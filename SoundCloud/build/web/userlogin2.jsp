<%@page import="java.sql.*"%>


<%

    String password = request.getParameter("password");
    String username = request.getParameter("uname");
    
    System.out.println("select * from user where username='" + username + "' && password='" + password + "'");
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from user where username='" + username + "' and password='" + password + "'");

    if (rs.next()) {
        session.setAttribute("un", username);
        response.sendRedirect("userhome.jsp");

    } else {

         response.sendRedirect("userlogin1.jsp?msg=invalid username/password");
    }
%>