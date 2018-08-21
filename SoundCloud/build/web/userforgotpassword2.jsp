<%@page import="java.sql.*"%>
<%
    String username = request.getParameter("uname");
    String quest="";
    Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
            Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
 ResultSet rs = stmt.executeQuery("select * from user where username ='"+username+"'");
 
 if(rs.next())
 {
     quest=rs.getString("security question");
     
    
 }
 %>
  <html>
    <head>

        <title></title>
    </head>
    
    <body>
    <center>
                    <%@include file="header.jsp" %>

    
        <form action="userforgotpassword3.jsp" method="post">
            
            <table cellspacing="8" cellpadding="8" style="padding-top: 30px;">
                <tr>
                    <td> User Name</td>
                    <td> <input type="text" name="uname" value="<%=username%>"/> </td>
                </tr>
                <tr>
                    <td>Security Question </td>
                    <td> <input type="text" name="quest" value="<%=quest%>" /> </td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td> <input type="text" name="ans" /> </td>
                </tr>
                <tr>
                    
                    <td></td>
                    <td> <input type="submit" value="submit" style="border-radius: 5px;color: orangered;width:65px" /></td>
                </tr>
              
            </table>
            
            
        </form>
      
                                       <%@include file="userfooter.jsp" %>    

    </center>
    </body>
    
</html>

