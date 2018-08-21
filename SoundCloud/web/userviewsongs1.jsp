<%@page import="java.sql.*"%>

<!DOCTYPE html>

<html>
    <head>
        <title>View Songs</title>
    </head>
    <body>
                                       <%@include file="userheader.jsp" %>
    <center>


        <table border="1px" cellspacing="5px" cellpadding="5px" style="width: 850px;margin-top: 70px">

            <tr>

                <th>Song Id</th>
                <th> Song Name</th>
                <th> Artist</th>
                <th> Album</th>
                <th> Year </th>
                <th> Genre</th>
                <th> Sub Genre</th>
                <th> Date</th>
                <th> Duration</th>
                <th> Delete</th>
                <th> Edit</th>
            </tr>

            <%

                 String username= (String) session.getAttribute("un");
                  
                String songid = "";
                String songname = "";
                String artist = "";
                String album = "";
                String year = "";
                String genre = "";
                String subgenre = "";
                String date = "";
                String duration = "";
                String albumart = "";

                Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from songs");
                while (rs.next()) {

                    songid = rs.getString("idsongs");
                    songname = rs.getString("songname");
                    artist = rs.getString("artist");
                    album = rs.getString("album");
                    year = rs.getString("year");
                    genre = rs.getString("genre");
                    subgenre = rs.getString("subgenre");
                    date = rs.getString("date");
                    duration = rs.getString("duration");
                    albumart=rs.getString("albumart");
            %>            
            <tr>

                <td><%=songid%></td>
                
                <td><%=songname%></td>
                <td><%=artist%></td>
                <td><%=album%></td>
                <td><%=year%></td>
                <td><%=genre%></td>
                <td><%=subgenre%></td>
                <td><%=date%></td>
                <td><%=duration%></td>
                <td><a href="userdeletesongs1.jsp?songid=<%=songid%>" > Delete</a></td>
                <td><a href="usereditsongs1.jsp?songid=<%=songid%>" > Edit</a></td>
                 </tr>
            
            <%
                }
            %>
            
        </table>

    </center>    
                                        <%@include file="Footer.jsp" %>    
</body>
</html>
