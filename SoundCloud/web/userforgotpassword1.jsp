

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Userlogin forgot password</title>
    </head>
    <body>
    <center>
            <%@include file="header.jsp" %>

        <form action="userforgotpassword2.jsp" method="post">
            
            <table cellspacing="8" cellpadding="8" style="padding-top: 30px;">
                <tr>
                    <td> User Name</td>
                    <td> <input type="text" name="uname" required /> </td>
                    
                </tr>
                 <tr>
                    
                    <td></td>
                    <td> <input type="submit" value="Submit" style="border-radius: 5px;color: orangered;width:65px " /></td>
                </tr>
                
            </table>
            
            
        </form>
         <%
            String msg1= request.getParameter("msg");
            if(msg1!=null)
            {
                %>
                <h3> <%=msg1%></h3>
                
                <%
            }
            %>
            
                            <%@include file="userfooter.jsp" %>    
            </center>  

    </body>
</html>
