<!DOCTYPE html>

<html>
    <head>
        
        <title> User Login</title>
 <link href="two.css" rel="stylesheet" type="text/css" />
    </head>
    <body>
    <%@include file="header.jsp" %>
          
    <center>
        
        <form action="userlogin2.jsp" method="post">

          
            <table style="padding-top: 50px"><tr><th>
                        <label style="color: orangered;font-family: sans-serif;font-size: 23px">User Login</label></th></tr></table>


            
            <table cellspacing="8" cellpadding="8" style="padding-top: 30px;">

                <tr>
                    <td> User Name</td>
                    <td > <input type="text" name="uname" required/> </td>
                </tr>
                
                
                <tr>
                    <td> Password </td>
                    <td> <input type="password" name="password" required /> </td>
                </tr>
                <tr>
                    <td></td>
                    <td> <input type="submit" value="Login" style="border-radius: 5px;color: orangered;width: 65px"/></td>
                </tr>

            </table>
        </form>
        <br>
        <a href="signupform1.jsp" >  Create New Account</a>
        <br>
        <br>
        
        <a href="userforgotpassword1.jsp" > Forgot password </a>  
        <br>
        <br>


        <%
            String msg1 = request.getParameter("msg");
            if (msg1 != null) {
        %>
        <h3> <%=msg1%></h3>

        <%
            }
        %>



                                          <%@include file="Footer.jsp" %>    
     
    </center>

      
    </body>
    


</html>
