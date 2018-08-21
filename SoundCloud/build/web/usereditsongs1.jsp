<%@page import="java.sql.*"%>


<%

        String songid = request.getParameter("songid");
        String username=(String)session.getAttribute("un");
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
                ResultSet rs = stmt.executeQuery("select * from songs where  idsongs='"+songid+"'");
                if (rs.next())
                {
                     songid = rs.getString("idsongs");
                    songname = rs.getString("songname");
                    artist = rs.getString("artist");
                    album = rs.getString("album");
                    year = rs.getString("year");
                    subgenre = rs.getString("subgenre");
                    date = rs.getString("date");
                    duration = rs.getString("duration");
                    albumart=rs.getString("albumart");
               
%>


<!DOCTYPE html>
<html>
    <head>
        <title>Song Edit Page</title>
        
        
        <script>
            
            var xmlHttp;
            function go()
            {
                xmlHttp= new XMLHttpRequest();
                var h=document.getElementById("category").value;
                
                xmlHttp.open("GET","songajax.jsp?category="+h, true);
                xmlHttp.send();
                xmlHttp.onreadystatechange=go2;
                
            }
            
            function go2()
            {
               
                if(xmlHttp.readyState == 4 && xmlHttp.status == 200)
                {
                   
                    document.getElementById("content").innerHTML=xmlHttp.responseText;
                }
            }
            
            </script>
    </head>

    <body>
                    <%@include file="userheader.jsp" %>

    <center>

        <form action="usereditsongs2.jsp" method="post">
            <table cellspacing="8" cellpadding="8" style="padding-top: 30px;">
                
                <tr>
                    
                    <td>Song Id</td>
                    <td><input type="text" name="songid" readonly value="<%=songid%>">  </td>
                </tr>
                
                
                <tr>
                    
                    <td>Song Name</td>
                    <td><input type="text" name="songname" value="<%=songname%>"></td>
                </tr>
                
                
                <tr>
                    
                    <td>Artist</td>
                    <td><input type="text" name="artist" value="<%=artist%>"></td>
                </tr>
                
                
                <tr>
                    
                    <td>Album</td>
                    <td><input type="text" name="album" value="<%=artist%>"/></td>
                </tr>
                
                
                <tr>
                    
                    <td>Year</td>
                    <td><input type="text" name="year" value="<%=year%>"/></td>
                </tr>
                
                
                <tr>
                    
                    <td>Genre</td>
                            <td><select name="gen" onchange="go()" id="category">
                                    <%
                                    ResultSet rs1 = stmt.executeQuery("select * from category");
                                  while(rs1.next())
                                  {
                                      genre=rs1.getString("category");
                                    
                                    %>
                                    <option> <%=genre%></option>
                        <%
                                  }
                        %>
                                    
                                </select></td>
                        
                </tr>
                
                
                <tr>
                    
                    <td>Sub genre</td>
                            <td id="content"></td>
                </tr>
                
                
                <tr>
                    
                    <td>Date</td>
                    <td><input type="text" name="date" value="<%=date%>"></td>
                </tr>
                
                
                <tr>
                    
                    <td>Duration</td>
                    <td><input type="text" name="duration" value="<%=duration%>"></td>
                </tr>
                
                
                <tr>
                    
                    <td></td>
                    <td><input type="submit" value="update" style="border-radius: 5px;color: orangered;width: 65px"> </td>
                </tr>
                <%
                }
                %>
                
            </table>
            
            
        </form>

    </center>
                                            <%@include file="Footer.jsp" %>    
    </body>

</html>
