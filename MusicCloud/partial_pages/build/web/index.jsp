<%-- 
    Document   : index
    Created on : Dec 13, 2013, 10:19:45 AM
    Author     : VMM
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title></title>
        <link href="two.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="all">
            <%@include file="header.jsp" %>
            <%@include file="Sidebar.jsp" %>
            <div id="main">
                <center>
                    <h1>Sign Up Form</h1>
                <table>
                    <tr>
                        <td>Enter name</td>
                        <td><input type="text"></td>
                    </tr>
                    
                    <tr>
                        <td>Enter phone number</td>
                        <td><input type="text"></td>
                    </tr>
                    
                    <tr>
                        <td>Enter email</td>
                        <td><input type="text"></td>
                    </tr>
                                      
                    
                </table>  
                    <input type="Button" value="Submit" />
                    </center>
           </div>
            <%@include file="Footer.jsp"%>
            
        </div>
    </body>
</html>
