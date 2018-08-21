<%@page import="java.sql.*"%>

<%           String username=session.getAttribute("un").toString();
            String songname=request.getParameter("sn");
            String genre=request.getParameter("gen");
            String subgenre=request.getParameter("subgen");
            String date=request.getParameter("date");
           
              Class.forName("com.mysql.jdbc.Driver");
              Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
              Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
              ResultSet rs = stmt.executeQuery("select * from songs");
              //if (rs.next())
              
                  rs.moveToInsertRow();
                rs.updateString("songname",songname);
                rs.updateString("genre",genre);
                rs.updateString("subgenre",subgenre);
                rs.updateString("username",username);
                rs.updateString("date",date);
                 rs.insertRow();
                

              %>
        

<!DOCTYPE html>
<html>
    <head>
        <script>
            function go()
            {
                var name = document.getElementById("file1").value;
                if (name.lastIndexOf(".mp3") != -1)
                {
                    return true;
                }
                else
                {
                    alert("upload mp3 files");
                    return false;
                }
            }

        </script>
    </head>
    <body>
                            <%@include file="userheader.jsp" %>
    <center>
        <form action="useraddsong3.jsp" enctype="multipart/form-data" name="form1" method="post" onsubmit="return go()">
     
            <input type="file" name="upload" id="fileinput" style="padding-top: 100px;" />
            <br>
            <br>
            <input type="submit" name="submit" value="submit" style="border-radius: 5px;color: orangered;width: 65px;" />
       
        </form>
    </center>
                                           <%@include file="Footer.jsp" %>    
    </body>
</html>
