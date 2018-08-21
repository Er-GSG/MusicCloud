<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html>

    <head>
        <title>sub category</title>
    </head>
    <body>
                                                            <%@include file="adminheader.jsp" %>
    <center>

        <form action="addsubcategory2.jsp" method="post">
            <table cellspacing="8" cellpadding="8" style="padding-top: 30px;">
                <tr>
                    <td>Select Category Name</td>
                    <td> <select name="cat2">
                            <%
                                String name = "";
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from category ");

                                while (rs.next()) {
                                    name = rs.getString("category");


                            %>
                            <option><%=name%></option>
                            <%
                                }
                            %>                     
                        </select><td>

                <tr>
                    <td> Sub Category Name </td>
                    <td> <input type="text" required="" name="sname" /> </td>
                </tr>

                <tr>
                    <td>Description </td>
                    <td> <textarea rows="6" cols="30" required="" name="des"></textarea> </td>
                </tr>

                <tr>

                    <td></td>
                    <td> <input type="submit" value="Add" style="border-radius: 5px;color: orangered;width: 65px" /></td>
                </tr>

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
