<%@page import="java.sql.*"%>    

<%

    String subcategory = request.getParameter("subcategory");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from subcategory where subcategory ='" + subcategory + "'");

    if (rs.next()) {
        rs.deleteRow();
        response.sendRedirect("viewsubcategory1.jsp?msg=subcategory Deleted");

    } else {
        response.sendRedirect("viewsubcategory1.jsp?msg=subCategory Not Available");
    }
%>