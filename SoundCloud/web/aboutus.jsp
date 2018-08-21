<%-- 
    Document   : aboutus
    Created on : Nov 17, 2014, 6:35:48 AM
    Author     : GurPreet Goraya
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
                  <%@include file="userheader.jsp" %>
    
        <form action=" signupform1.jsp" method="post">
            <div style="padding-left: 20px">
                <br>
                            <h1 style="color: #FA6111;">About MusicCloud</h1>
            <br>
            <br>

        <p>MusicCloud is the world’s leading social sound platform where anyone can create sounds and share them everywhere.</p>

        <p>Recording and uploading sounds to MusicCloud lets people easily share them privately or publicily with their friends</p>

        <p>It takes just a click to play  a sound or download .</p>

        <p>MusicCloud can be accessed anywhere using the Internet on Pc  or Smart Phone.</p>

<p>Don't have a free account yet?</p>
<br>
<input type="submit" value="SignUp" style="background-color: #FA6111;border-radius: 5px;width: 100px;height: 30px"/>
            </div>
        </form>


                          <%@include file="Footer.jsp" %>    
    </body>
</html>
