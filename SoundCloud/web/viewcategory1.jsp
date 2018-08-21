<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html> 
    <head> 
    </head>
    <body>
                                                            <%@include file="adminheader.jsp" %>
    <center>

        <table border="1"  cellpadding="5" cellspacing="5"  style="margin-top: 60px; width: 450px;
height: 250px;" >
            <tr>
                <th>category </th>

                <th>description</th>
                <th colspan="2">Links</th>

            </tr>

            <%     String category = "";
                String description = "";
                Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from category ");

                while (rs.next()) {
                    category = rs.getString("category");
                    description = rs.getString("description");

            %>
            <tr>
                <td><%=category%></td>
                <td><%=description%></td>
                <td><a href="deletecategory1.jsp?category=<%=category%>">Delete</a></td>
                <td><a href="editcategory1.jsp?category=<%=category%>">Edit</a></td>
            </tr>

            <%
                }
            %>

        </table>
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

