<%@page import="java.sql.*"%>

<%
    String category = request.getParameter("category");
    String desc = "";
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from category where category='" + category + "'");

    if (rs.next()) {
        category = rs.getString("category");
        desc = rs.getString("description");

    }


%>

<html>

    <head>

        <title>Update Category </title>

    </head>

    <body>
                                                                    <%@include file="adminheader.jsp" %>
    <center>

        <form action="editcategory2.jsp?" method="post">
            <table  cellpadding="8" cellspacing="8" style="padding-top: 40px">
                <tr>
                    <td>Category Name</td>
                    <td> <input type="text" disabled=""  name="category" value="<%=category%>"/></td>
                </tr>

                <tr>
                    <td> Description </td>
                    <td><input type="text" name="desc" value="<%=desc%>"/></td>
                </tr>

                <tr>
                    <td></td>
                    <td> <input type="submit" value="Update" style="border-radius: 5px;color: orangered;"/></td>
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
