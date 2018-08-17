<%@page import="java.sql.*"%>
<%
    String category = request.getParameter("cat2");
    String description = request.getParameter("des");
    String subcategory = request.getParameter("sname");
    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from subcategory where subcategory ='" + subcategory + "'");

    if (rs.next()) {
        response.sendRedirect("addsubcategory1.jsp?msg=Category already Exists");

    } else {
        rs.moveToInsertRow();
        rs.updateString("category", category);
        rs.updateString("description", description);
        rs.updateString("subcategory", subcategory);
        rs.insertRow();
        response.sendRedirect("addsubcategory1.jsp?msg= Category add sucessfully");
    }
%>
