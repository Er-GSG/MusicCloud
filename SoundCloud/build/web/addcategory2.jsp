<%@page import="java.sql.*"%>

<%
    String category = request.getParameter("cname");
    String description = request.getParameter("description");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from category where category ='" + category + "'");

    if (rs.next()) {

        response.sendRedirect("addcategory1.jsp?msg= category already exist");
    } else {
        rs.moveToInsertRow();
        rs.updateString("category", category);
        rs.updateString("description", description);
        rs.insertRow();
        response.sendRedirect("addcategory1.jsp?msg= Category add sucessfully");
    }


%>