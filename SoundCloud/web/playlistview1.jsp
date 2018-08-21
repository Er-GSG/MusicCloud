
<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html> 
    <head> 
        
    </head>
    <body>
    <center>
                                                                                <%@include file="userheader.jsp" %>



        <%
            String user = (String) session.getAttribute("un");
            Class.forName("com.mysql.jdbc.Driver");
            Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
            Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs = stmt.executeQuery("select * from playlist where username='" + user + "'");
            while (rs.next()) {
                String songid = rs.getString("songid");

                String songname = "";
                String artist = "";
                String album = "";
                String albumart = "";

                Statement stmt1 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs1 = stmt1.executeQuery("select * from songs where idsongs='" + songid + "'");

                while (rs1.next()) {
                    songname = rs1.getString("songname");
                    artist = rs1.getString("artist");
                    album = rs1.getString("album");
                    albumart = rs1.getString("albumart");

        %>
                    <form action="playlistview2.jsp?id=<%=songid%>" method="post">

        <table width="100" cellpadding="10">

                <tr >
                    <td rowspan="9"  >
                        <img src="<%=albumart%>" width="170" height="170"/>
                    </td>
                
                <td  >
                    <table width="300">                           
                          
                           <tr>
                                <td>
                                    <a style="color: orangered;font-family: sans-serif; font-size: 19px" href="publicuserinterface3.jsp?id=<%=songid%>"> <h5><%=songname%></h5></a>

                                </td>
                            </tr>
                            
                           
                            <tr>
                                <td>
                                    <h5><%=album%></h5>

                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    <h5> <%=artist%></h5>
                                </td>
                            </tr>
                            
                            <tr>
                                <td>
                                    <input type="submit" value="Remove From Playlist" style="border-radius: 5px;color: orangered;" /> 
                                </td>
                            </tr >
                           
                        </table>
                            
                            
                </td>
        </tr>
                            
            </table>
                </form>
           

        <%
                }
            }
        %>
           <%@include file="Footer.jsp" %>    

    </center>

</body>

</html>