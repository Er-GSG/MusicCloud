<%@page import="java.sql.*"%>


<%

    String songid = request.getParameter("songid");
    %>
    <label>
        <%=songid%>
    </label>
    <%
    String username = (String) session.getAttribute("un");
    String songname = request.getParameter("songname");
    String artist = request.getParameter("artist");
    String album = request.getParameter("album");
    String year = request.getParameter("year");
    String genre = request.getParameter("gen");
    String subgenre = request.getParameter("subgen");
    String date = request.getParameter("date");
    String duration = request.getParameter("duration");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs = stmt.executeQuery("select * from songs where idsongs='" + songid + "'");
    if (rs.next()) 
    {
        rs.updateString("songname", songname);
        rs.updateString("artist", artist);
        rs.updateString("album", album);
        rs.updateString("year", year);
        rs.updateString("genre", genre);
        rs.updateString("subgenre", subgenre);
        rs.updateString("date", date);
        rs.updateString("duration", duration);
        rs.updateRow();
        response.sendRedirect("userviewsongs1.jsp");
    }


%>

