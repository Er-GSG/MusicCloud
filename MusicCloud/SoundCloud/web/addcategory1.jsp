<!DOCTYPE html>
<html>
    <head>
        <title> Add Category</title>

    </head>
    <body>
                                                            <%@include file="adminheader.jsp" %>
    <center>

        <form action="addcategory2.jsp" method="post" >
            <table cellspacing="8" cellpadding="8" style="padding-top: 30px;">

                <tr><td> Category Name</td>
                    <td> <input type="text" required="" name="cname" style="width: 169px;" > </td></tr>

                <tr><td>Description</td> <br>

                <td><textarea rows="5" cols="19" name="description"></textarea> </td></tr>
              
                <tr>
                    <td></td>
                    <td><br><input type="submit" value="Add Category" style="border-radius: 5px;color: orangered;"></td></tr>
            </table>
        </form>
                                                            <br>
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
