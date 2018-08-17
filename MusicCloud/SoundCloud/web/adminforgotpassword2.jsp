<%@page import="java.sql.*"%>
<%
    String username = request.getParameter("uname");
    String quest = "";
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from admin where username ='" + username + "'");

    if (rs.next()) {
        quest = rs.getString("security question");

    }
%>
<html>
    <head>

        <title></title>
    </head>

    <body>
    <center>
                                                            <%@include file="adminheader.jsp" %>


        <form action="adminforgotpassword3.jsp" method="post">

            <table>
                <tr>
                    <td> User Name</td>
                    <td> <input type="text" name="uname" value="<%=username%>"/> </td>
                </tr>
                <tr>
                    <td>Security Question </td>
                    <td> <input type="text"name="quest" value="<%=quest%>" /> </td>
                </tr>
                <tr>
                    <td>Answer</td>
                    <td> <input type="text" name="ans" /> </td>
                </tr>
                <tr>

                    <td></td>
                    <td> <input type="submit" value="submit" /></td>
                </tr>

            </table>


        </form>


    </center>
    </body>

</html>
