

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>adminlogin forgot password</title>
    </head>
    <body>
    <center>
                                                            <%@include file="adminheader.jsp" %>


        <form action="adminforgotpassword2.jsp" method="post">

            <table>
                <tr>
                    <td> User Name</td>
                    <td> <input type="text" name="uname" required /> </td>

                </tr>
                <tr>

                    <td></td>
                    <td> <input type="submit" value="Submit" /></td>
                </tr>

            </table>


        </form>
        <%
            String msg1 = request.getParameter("msg");
            if (msg1 != null) {
        %>
        <h3> <%=msg1%></h3>

        <%
            }
        %>
    </center>
    </body>
</html>
