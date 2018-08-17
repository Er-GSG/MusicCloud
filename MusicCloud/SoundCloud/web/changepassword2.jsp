<%@page import="java.sql.*"%>

<%
    String username = (String) session.getAttribute("un");
    String op = request.getParameter("op");
    String np = request.getParameter("np");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from admin where username ='" + username + "' and password= '" + op + "'");

    if (rs.next()) {

        rs.updateString("password", np);
        rs.updateRow();
        response.sendRedirect("adminhome.jsp?msg= Password Changed Successfully");
    } else {
        response.sendRedirect("changepassword1.jsp?msg=invalid old password");
    }


%>