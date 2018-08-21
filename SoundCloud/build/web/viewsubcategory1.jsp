<%@page import="java.sql.*"%>

<%
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from subcategory ");

    if (rs.next()) {

%>
<body>
                                                        <%@include file="adminheader.jsp" %>
<center>

    <table border="1" cellspacing="5" cellpadding="5" style="margin-top: 30px;width: 600px;
height: 120px;">
        <tr>
            <th>Sub category </th>

            <th>description</th>
            <th>category</th>
            <th colspan="2">Links</th>

        </tr>
        <%         rs.beforeFirst();
            while (rs.next()) {
                String subcategory = rs.getString("subcategory");
                String description = rs.getString("description");
                String category = rs.getString("category");


        %>
        <tr>
            <td><%=subcategory%></td>
            <td><%=description%></td>
            <td><%=category%></td>
            <td><a href="deletesubcategory1.jsp?subcategory=<%=subcategory%>">Delete</a></td>
            <td><a href="editsubcategory1.jsp?subcategory=<%=subcategory%>">Edit</a></td>
        </tr>
        <%
            }
        %>

    </table>


    <%
        } else {
            response.sendRedirect("viewsubcategory1.jsp?");
        }
    %>
    <br>
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