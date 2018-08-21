            <%@page import="java.sql.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Admin Homepage</title>


    </head>

    <body>
    <center>
                                                    <%@include file="adminheader.jsp" %>


        <%
            String username = (String) session.getAttribute("admin");


    String path = "";

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from admin where username ='" + username + "'");

    if (rs.next()) {
        path = rs.getString("path");
    } 
    
    else 
    {
        response.sendRedirect("userlogin1.jsp?msg=invalid username/password");
    }

   
        %>
        
         <table style="padding-top: 50px"><tr><th>
         <label style="color: orangered;font-family: sans-serif;font-size: 23px">Welcome <%=username%></label></th></tr></table>
         <br>       
         <img src="<%=path%>" height="200" width="200"/>
         <br>

         


        <%
            String msg1 = request.getParameter("msg");
            if (msg1 != null) {
        %>
        <h3> <%=msg1%></h3>

        <%
            }
        %>
                              <%@include file="adminfooter.jsp" %>                    

    </center>
    </body>

</html>
