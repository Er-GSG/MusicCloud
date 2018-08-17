<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html> 
    <head> 
       
        </head>
        <body>

        <center>

            <div>


                <%
                    String category = request.getParameter("category");

                    String songname = "";
                    String album = "";
                    String artist = "";
                    String subgenre = "";
                    String duration = "";
                    String size = "";
                    String date = "";
                    String albumart = "";
                    String id = "";
                    String path = "";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = stmt.executeQuery("select * from songs where genre ='" + category + "'");

                    while (rs.next()) {
                        songname = rs.getString("songname");
                        id = rs.getString("idsongs");
                        session.setAttribute("id", id);
                        artist = rs.getString("artist");
                        album = rs.getString("album");
                        duration = rs.getString("duration");
                        size = rs.getString("size");
                        date = rs.getString("date");
                        albumart = rs.getString("albumart");
                        path = rs.getString("path");
                %>

         

                    <table width="100">
                        <tr>
                            <td style="min-width: 210px">
                            <img src="<%=albumart%>" width="170" height="170"  />
                        </td >

                        <td colspan="10" >
                            <table width="300" cellpadding="5" >
                                <tr>
                                    <td>
                                        <a style="color: orangered;font-family: sans-serif; font-size: 19px" href="publicuserinterface3.jsp?id=<%=id%>"><%=songname%></a>

                                    </td>
                                </tr>
                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=album%>

                                    </td>
                                </tr>

                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=artist%>
                                    </td>
                                </tr>


                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=date%>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=duration%>
                                    </td>
                                </tr>

                            </table>
                        </td>
                    </tr>
                    <!--                <tr>
                                        <td id="playSong<%=id%>" style="display: none">
                                            <audio src="<%=path%>" controls /> 
                                        </td>
                                    </tr>-->
                </table>

                <table>

                    <tr>
                        <td id="playSong<%=id%>" style="display: none">
                            <audio src="<%=path%>" controls   /> 
                        </td>
                        <td style="font-family: sans-serif;color: #303030;">
                            <input type="button" value="play" onclick="playSong('<%=id%>') " style=" width: 110px; height: 20px;color: orangered;border-radius: 5px"/> 
                        </td>



                    </tr>
                </table>

                       
            <%
                }
            %>

        </div>         
    </center>

</body>
</html>