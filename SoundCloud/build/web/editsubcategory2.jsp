<%@page import="java.sql.*"%>

<%
    String subcategory = request.getParameter("subcategory");
    String desc = request.getParameter("desc");
    String category = request.getParameter("category");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from subcategory where category ='" + category + "'");

    if (rs.next()) {
        rs.updateString("description", desc);
        rs.updateString("subcategory", subcategory);
        rs.updateRow();
        response.sendRedirect("viewsubcategory1.jsp?msg=SubCategory Updated");
    } else {
        response.sendRedirect("viewsubcategory1.jsp?msg=SubCategory  not updated");
    }


%>
