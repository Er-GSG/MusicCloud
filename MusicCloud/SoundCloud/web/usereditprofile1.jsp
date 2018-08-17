<%@page import="java.sql.*"%>      
<%
    String username = (String) session.getAttribute("un");
    String email = "";
    String phone = "";
    String secq = "";
    String seca = "";
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from user where username ='" + username + "'");

    if (rs.next()) {
        email = rs.getString("email");
        phone = rs.getString("phone no");
        secq = rs.getString("security question");
        seca = rs.getString("security answer");

    }
%>

<body>
    <%@include file="userheader.jsp" %>
<center>

  <form action="usereditprofile2.jsp" method="post">
      <table    cellspacing="10" cellpadding="10" style="padding-top: 70px" >
    <tr>
        <td> User Name</td>
        <td> <input type="text" name="uname" disabled value="<%=username%>"/> </td>
    </tr>
    <tr>
        <td> Email</td>
        <td> <input type="text" name="email" value="<%=email%>"/> </td>
    </tr>
    <tr>
        <td>Phone no </td>
        <td> <input type="text" name="phn" value="<%=phone%>" /> </td>
    </tr>
    <tr>
        <td>Security Question</td>
        <td> <input type="text" name="quest" value="<%=secq%>"/> </td>
    </tr>
    <tr>

        <td>security Answer</td>
        <td> <input type="text" name="ans" value="<%=seca%>"/></td>
    </tr>
    <tr>
        <td></td>
           <td> <input type="submit" value="Edit" style="border-radius: 5px;color: orangered;width: 65px" /></td>
                </tr>

</table>
  </form>
</center>
                                       <%@include file="Footer.jsp" %>    

</body>

</html>

