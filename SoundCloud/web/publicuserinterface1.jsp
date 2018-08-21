<%@page import="java.sql.*"%>
<html>
    <head>
        <title>Public interface</title>
        <script type="text/javascript" src="./wavesurfer.min.js"></script>
        <script>
            function go()
            {
                xmlhttp = new XMLHttpRequest();
                var h = document.getElementById("category").value;
                xmlhttp.onreadystatechange = go2;
                xmlhttp.open("GET", "publicuserinterface2.jsp?category=" + h, true);
                xmlhttp.send();
            }
            function go2()
            {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                {
                    document.getElementById("content").innerHTML
                            = xmlhttp.responseText;
                }
            }

            function playSong(id)
            {

                document.getElementById("playSong" + id).style.display = "block";
            }


        </script>

    </head>

    <body>
       <%
if(session.getAttribute("un")==null)
{
%>
          <%@include file="header.jsp" %>
          
          <%
}
else
{   
          %>
          <%@include file="userheader.jsp" %>
          <%
}
          %>
        



        <script>
            
           var wavesurfer = Object.create(WaveSurfer);
         
           wavesurfer.init({
    container: '#wave'
});

wavesurfer.on('ready', function () {
    wavesurfer.play();
});
wavesurfer.load('./songs/1.mp3');

            
        </script>
        
    <center>
        <div >
            <form action="publicuserinterface2.jsp" method="post">
                <table>
                    <td> <select name="category" id="category" style="width: 500px;height: 20px;border-radius: 5px;margin-top: 22px">
                            <option>Select Category</option>
                            <%
                                String category = "";
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from category");
                                while (rs.next()) {
                                    category = rs.getString("category");

                            %>

                            <option><%=category%></option>

                            <%
                                }
                            %>
                        </select></td><td><input type="button" name="submit" value="Search" onclick="go()" style="width: 120px;height: 20px;border-radius: 5px;color: orangered;margin-top: 22px" /></td>
                    </tr>
                    <tr>

                </table>

            </form>
        </div>

        <div id="content"></div>

        <br>
        <br>
        
        <table width="50">
            <th><label style="color: orangered;font-family: sans-serif;font-size: 20px">Top Downloads</label></th> 
            <tr>  
                <%
                    int i = 0;
                    int Count;
                    Connection soundcloud1 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt1 = soundcloud1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs1 = stmt1.executeQuery("SELECT COUNT(*)'count', SONGID FROM DOWNLOAD GROUP BY SONGID ORDER BY COUNT(*) DESC LIMIT 5");
                    while (rs1.next()) {
                       i++;
                        Count = rs1.getInt("count");
                        int id = rs1.getInt("songid");
                        String songname = "";
                        String albumart = "";
                        Statement stmt2 = soundcloud1.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs2 = stmt2.executeQuery("SELECT * from songs where idsongs='" + id + "'");
                        if (rs2.next()) {
                            songname = rs2.getString("songname");
                            albumart = rs2.getString("albumart");

                            if (i == 6) {
                %>
            <tr> <td> <table>
                        <tr>
                            <td>
                                <img src="<%=albumart%>" width="150" height="150"  />
                            </td>
                        </tr>

                        <tr><th><%=songname%></th>
                        </tr>
                        <tr><th>Download Times...<%=Count%></th>
                        </tr>

                    </table>
                </td>

                <%

                } else {
                %>
                <td> <table>
                        <tr>
                            <td>
                                <img src="<%=albumart%>" width="150" height="150"  />
                            </td>
                        </tr>

                        <tr><th><a href="publicuserinterface3.jsp?id=<%=id%>" style="color: #303030"><%=songname%></a></th>
                        </tr>


                    </table>
                </td>

                <%
                            }
                        }
                    }
                %> 
            </tr></table>  
        <br>
        <br>

        <table width="50">
            <th><label style="color: orangered;font-family: sans-serif;font-size: 21px">Top Favourites</label></th>

            <tr>   
                <%
                    int a = 0;
                    int playlistcount;
                    Connection soundcloud2 = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt2 = soundcloud2.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs2 = stmt2.executeQuery("SELECT COUNT(*)'count', SONGID FROM PLAYLIST GROUP BY SONGID ORDER BY COUNT(*) DESC LIMIT 5");
                    while (rs2.next()) {
                        a++;
                        playlistcount = rs2.getInt("count");
                        int id = rs2.getInt("songid");
                        String songname = "";
                        String albumart = "";
                        Statement stmt3 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                        ResultSet rs3 = stmt3.executeQuery("SELECT * from songs where idsongs='" + id + "'");
                        if (rs3.next()) {
                            songname = rs3.getString("songname");
                            albumart = rs3.getString("albumart");
                            if (a == 6) {

                %>
            <tr> <td> <table>
                        <tr>
                            <td>
                                <img src="<%=albumart%>" width="150" height="150"  />
                            </td>
                        </tr>

                        <tr><th><%=songname%></th>
                        </tr>
                        <tr><th>Download Times...<%=playlistcount%></th>
                        </tr>

                    </table>
                </td>

                <%

                } else {
                %>
                <td> <table>
                        <tr>
                            <td>
                                <img src="<%=albumart%>" width="150" height="150"  />
                            </td>
                        </tr>

                        <tr><th><a href="publicuserinterface3.jsp?id=<%=id%>" style="color: #303030"><%=songname%></a></th>
                        </tr>


                    </table>
                </td>

                <%
                            }
                        }
                    }
                %> 
            </tr></table> 




            <br>
        <%@include file="Footer.jsp" %>    
           

    </center>

</body>





</html>


