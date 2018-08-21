

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html>
    <head>

        <title> Sound Cloud(Change Password)</title>

        <script>
            function check()
            {
                var np = document.getElementById("pass1").value;
                var cp = document.getElementById("pass2").value;

                if (np == cp)
                {
                    return true;
                }

                else
                {
                    alert("New Password and Confirm Password Do not match");
                    return false;
                }
            }


        </script>

    </head>

    <body>
                                                            <%@include file="adminheader.jsp" %>
    <center>


        <%
            String username = (String) session.getAttribute("admin");

        %>
         <h1 style="color:orangered;font-family: sans-serif;font-size: 23px;padding-top: 70px;"> Welcome <%=username%> </h1>

        <form action="changepassword2.jsp" method="post" onsubmit="return check()">
            <table cellpadding="5" cellspacing="5" style="padding-top: 50px" >
                <tr>
                    <td>Old Password</td>
                    <td> <input type="password" name="op"/> </td>
                </tr>
                <tr>
                    <td>New Password</td>
                    <td> <input type="password" name="np" id="pass1"/></td>
                </tr>
                <tr>
                    <td>Confirm Password</td>
                    <td> <input type="password" name="cp" id="pass2"/></td>
                </tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Update"/></td>
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
                                              <%@include file="adminfooter.jsp" %>                    
    
</body>
    

</html>
