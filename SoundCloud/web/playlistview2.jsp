<%@page import="java.sql.*"%>


<%
    String username = (String) session.getAttribute("un");
    String songid = request.getParameter("id");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs1 = stmt.executeQuery("select * from playlist where songid='" + songid + "' and username='" + username + "'");

      rs1.next();
            {
              rs1.deleteRow();
              response.sendRedirect("playlistview1.jsp");
    }


%>