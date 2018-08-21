
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <script>
        function go()
        {
            var name=document.getElementById("file1").value;
            if(name.lastIndexOf(".jpg")!=-1)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        
    </script>
    </head>
    <body>
            <%@include file="userheader.jsp" %>
    <center>

        
        <form action="usereditprofile4.jsp" enctype="multipart/form-data" name="form1" method="post" onsubmit="return go()">
            <input type="file" name="upload" value="browse" id="file1" style="padding-top: 100px;"/>
      <br>
      <br>
   
    <input type="submit" name="submit" value="submit" style="border-radius: 5px;color: orangered;"/>
   </form>     
    </center>
        <%@include file="Footer.jsp" %>    
    </body>
</html>
