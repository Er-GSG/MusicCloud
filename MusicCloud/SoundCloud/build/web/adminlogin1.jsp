<!DOCTYPE html>

<html>
    <head>

        <title> Admin Login</title>

    </head>

    <body>
                                            <%@include file="adminheader.jsp" %>
    <center>


        <form action="adminlogin2.jsp" method="post">
           
            <table style="padding-top: 50px"><tr><th>
                        <label style="color: orangered;font-family: sans-serif;font-size: 23px">Admin Login</label></th></tr></table>
            <table cellspacing="8" cellpadding="8" style="padding-top: 20px;">
                <tr>
                    <td> User Name</td>
                    <td> <input type="text" name="uname" required /> </td>
                </tr>
                <tr>
                    <td> Password </td>
                    <td> <input type="password" name="password" required /> </td>
                </tr>
                <tr>

                    <td></td>
                    <td> <input type="submit" value="Login" style="border-radius: 5px;color: orangered;width: 65px" /></td>
                </tr>

            </table>
            <br>
            <a href="adminforgotpassword1.jsp" > Forgot password </a>  

        </form>

        <%
            String msg1 = request.getParameter("msg");
            if (msg1 != null) {
        %>
        <h3> <%=msg1%></h3>

        <%
            }
        %>
        <%
            String msg2 = request.getParameter("msg1");
            if (msg2 != null) {
        %>
        <h3> <%=msg2%></h3>

        <%
            }
        %>


             <%@include file="adminfooter.jsp" %>                    
    </center>
    </body>

</html>
