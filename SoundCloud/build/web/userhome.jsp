
<%@page import="java.sql.*"%>
<%

    String username = (String) session.getAttribute("un");
    String path = "";

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from user where username ='" + username + "'");

    if (rs.next()) {
        path = rs.getString("path");
    } 
    
    else 
    {
        response.sendRedirect("userlogin1.jsp?msg=invalid username/password");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        
        <title>User Homepage</title>


    </head>

    <body>
            <%@include file="userheader.jsp" %>

    <center>
        <h1 style="color:orangered;font-family: sans-serif;font-size: 23px;padding-top: 70px;"> Welcome <%=username%> </h1>
       
                <br>
                <img src="<%=path%>" height="200" width="200"/>
                <br>
                <br>
                <br>
                <br>
        


        <%
            String msg1 = request.getParameter("msg");
            if (msg1 != null) {
        %>
        <h3> <%=msg1%></h3>

        <%
            }
        %>
                                   <%@include file="Footer.jsp" %>    

    </body>
</center>
</html>
