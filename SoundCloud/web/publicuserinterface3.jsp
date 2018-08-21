<%@page import="java.sql.*"%>

<!DOCTYPE html>
<html> 
    <head> 

        <style>
            table{  font-family: sans-serif;
                    font-weight:  normal;
                    color: #303030;
            }
        </style>
        <script>
             var wavesurfer = Object.create(WaveSurfer);
            function go(name)
            {
                alert(name);
               

            wavesurfer.init({
                container: document.querySelector('#wave'),
                waveColor: 'orangered',
                progressColor: 'purple'
            });

            wavesurfer.on('ready', function() {
                wavesurfer.play();
            });

            wavesurfer.load('songs/'+name+'.mp3');
            }
            function stop()
            {
                wavesurfer.pause();
            }
            function playpause()
            {
                wavesurfer.playPause();
            }
            
        </script>
<!--        <link rel="stylesheet" href="example/css/style.css" />
        <link rel="stylesheet" href="example/css/ribbon.css" />-->
        <script src="wave/wavesurfer.js" >
        </script>
        <script src="./wave/webaudio.js"></script>
        <!--<script src="./wave/audioelement.js"></script>-->
        <script src="./wave/drawer.js"></script>
        <script src="./wave/drawer.canvas.js"></script>
        <script src="example/main.js"></script>
        <script src="example/trivia.js"></script>

    </head> 
    <body>
        <%@include file="userheader.jsp" %>
    <center>


        <div>
            <%
                String id = request.getParameter("id");
                String username = (String) session.getAttribute("un");

                String album = "";
                String songname = "";
                String artist = "";
                String subgenre = "";
                String duration = "";
                String size = "";
                String date = "";
                String albumart = "";
                String user = "";
                String path = "";
                String year = "";
                String genre = "";
                Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from songs where idsongs ='" + id + "'");

                if (rs.next()) {
                    artist = rs.getString("artist");
                    year = rs.getString("year");
                    genre = rs.getString("genre");
                    subgenre = rs.getString("subgenre");
                    album = rs.getString("album");
                    albumart = rs.getString("albumart");
                    duration = rs.getString("duration");
                    size = rs.getString("size");
                    user = rs.getString("username");
                    date = rs.getString("date");
                    songname = rs.getString("songname");
                    path = rs.getString("path");

            %>

            <script>
                var xmlhttp;

                function playlist()
                {
                    xmlhttp = new XMLHttpRequest();
                    xmlhttp.onreadystatechange = go2;
                    xmlhttp.open("GET", "playlist?id=<%=id%>", true);
                    xmlhttp.send();
                }

                function go2()
                {
                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                    {
                        value = xmlhttp.responseText;
                        if (value == 1)
                        {
                            window.location.href = "userlogin1.jsp";
                        }
                        else
                        {
                            document.getElementById("favourite").value = xmlhttp.responseText;
                        }

                    }
                }

            </script>

            <form action="download?path=<%=id%>" method="post">


                <table>
                    <tr>
                        <td style="min-width: 200px;padding-top: 40px;">
                            <img src="<%=albumart%>" width="183" height="183"  />
                        </td>


                        <td > 
                            <table  cellpadding="4"  >
                                <tr>

                                    <td style="font-family: sans-serif;font-weight:  normal ;color: orangered;padding-top: 40px; ">Songname</td>
                                    <td style="color: orangered;padding-top: 40px;">
                                        <%=songname%>

                                    </td>
                                </tr>
                                <tr>
                                    <td>Album</td>
                                    <td>
                                        <%=album%>

                                    </td>
                                </tr>

                                <tr>
                                    <td>Artist</td>
                                    <td>
                                        <%=artist%>
                                    </td>
                                </tr>

                                <tr>
                                    <td>Year</td>
                                    <td>
                                        <%=year%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Date</td>
                                    <td>
                                        <%=date%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Duration</td>
                                    <td>
                                        <%=duration%>
                                    </td>
                                </tr>
                                <tr>
                                    <td>Size</td>
                                    <td>
                                        <%=size%>
                                    </td>
                                </tr>
                                <tr>
                                    <td> </td>
                               

                                </tr>


                            </table>
                                     <label style="font-family: sans-serif;
                                        font-weight:  normal;
                                        color: #303030;">
                                        Uploaded By <%=user%>

                                    </label>
                        </td>
                    </tr>
                </table>
                <%
                    }
                %>

        </div>
        <br>
        <br>
        <audio controls style="width:70%;">
            <source src="<%=path%>" type="audio/mp3">
        </audio>
        <br>
        <div id="wave">
                    <div class="progress progress-striped active" id="progress-bar">
                        <div class="progress-bar progress-bar-info"></div>
                    </div>
        </div>
        <input type="button" value="play" onclick="go('<%=id%>')"/>
        <input type="button" value="pause" onclick="stop()"/>
        <input type="button" value="playpause" onclick="playpause()"/>
        <br>
        <br>
        <br>

        <%

            Statement stmt2 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs2 = stmt2.executeQuery("select * from playlist where songid='" + id + "' and username='" + username + "'");
            if (rs2.next()) {

        %>
        <input type="button" value="Remove From Favourites" id="favourite" onclick="playlist()" style="font-family: sans-serif;
                                        font-weight:  normal;
                                        color: #303030;color: orangered;border-radius: 5px"/>
        <%                 } else {

        %>

        <input type="button" value="Add as Favourites" id="favourite" onclick="playlist()" style="font-family: sans-serif;
                                        font-weight:  normal;
                                        color: #303030;color: orangered;border-radius: 5px"/>
        <%                    }
        %>


        <%
            int Count;
            Statement stmt3 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            ResultSet rs3 = stmt3.executeQuery("select count(*)'count' from download where songid='" + id + "'");
            rs3.next();
            Count = rs3.getInt("count");

        %>

        <input type="submit" value="Downloads" style="font-family: sans-serif;
                                        font-weight:  normal;
                                        color: #303030; color: orangered;border-radius: 5px" />   <%=Count%>  Times</center>


</form>




<center>

    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>

    <div style="overflow-x: scroll;overflow-y: hidden;padding-top: 50px;">
        <table>
            <th><label style="color: orangered;font-family: sans-serif;font-size: 21px;padding-right: 650px;">Other Song By <%=user%></label></th>
</table>


            <MARQUEE WIDTH=100%   >

        <table>

            <tr>
                <%
                    Statement stmt4 = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs4 = stmt4.executeQuery("select * from songs where username='" + user + "'");
                    while (rs4.next()) {
                        String p = rs4.getString("albumart");
                        String n = rs4.getString("songname");
                        String id3 = rs4.getString("idsongs");

                %>
                <td>  

                    <table style="padding-top: 15px">
                        <tr>
                            <td>
                                <img src="<%=p%>" width="170" height="170"  />
                            </td>
                        </tr>

                        <tr><th><a href="publicuserinterface3.jsp?id=<%=id3%>"><%=n%></a></th>
                        </tr>
                    </table>

                </td>


                <%
                    }
                %>
            </tr>

</table>
                                                                                </MARQUEE>


    </div>
    <%@include file="Footer.jsp" %>                    
</center>

</body>
</html>