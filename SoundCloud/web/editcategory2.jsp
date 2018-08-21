<%@page import="java.sql.*"%>

<%
    String category = request.getParameter("category");
    String desc = request.getParameter("desc");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from category where category ='" + category + "'");

    if (rs.next()) {
        rs.updateString("description", desc);
        rs.updateString("category", category);
        rs.updateRow();
        response.sendRedirect("viewcategory1.jsp?msg=Category Updated");
    } else {
        response.sendRedirect("viewcategory1.jsp?msg=Record Not Available");
    }


%>
