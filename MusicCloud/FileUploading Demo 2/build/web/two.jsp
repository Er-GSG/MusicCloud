<%-- 
    Document   : two
    Created on : Mar 14, 2012, 10:42:28 AM
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
        <%@page import="vmm.*" %>
         <%
            String savefile="";
            try
             {
                 String absolutepath=getServletContext().getRealPath("/uploads");

                 String upname=vmm.FileUploader.savefile(request,absolutepath);
             //   vmm.FileUploader.savefile(request, absolutepath,saveFile);
             }
           catch(Exception ex)
             {
                ex.printStackTrace();
             }
 %>
    <h2>Photo Uploaded Successfully...</h2><br/>

    </body>
</html>
