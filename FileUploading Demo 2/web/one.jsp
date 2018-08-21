<%-- 
    Document   : index
    Created on : Mar 14, 2012, 10:41:46 AM
    Author     : vmm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h2> Upload a photo..</h2>
    <form action="two.jsp" enctype="multipart/form-data" method="post">
    <input type="file" name="upload" value="Browse" />
      <br>
      <br>
    <input type="submit" name="submit" value="submit"/>
   </form>

    </body>
</html>
