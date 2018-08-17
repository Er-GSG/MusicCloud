<%@page import="java.sql.*"%>    

<%

    String category = request.getParameter("category");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from category where category ='" + category + "'");

    if (rs.next()) {
        rs.deleteRow();
        response.sendRedirect("viewcategory1.jsp?msg=Category Deleted");

    } else {
        response.sendRedirect("viewcategory1.jsp?msg=Category Not Available");
    }
%>