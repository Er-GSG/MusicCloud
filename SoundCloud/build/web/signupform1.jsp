<!DOCTYPE html>
<html>
    <head>
        <title> User Sign Up Form</title>
        <script>
            function check()
            {
                var np =document.getElementById("pass1").value;
                var cp =document.getElementById("pass2").value;
                var tel=document.getElementById("telephone").value;
                
                if (np===cp)
                {
                    if(tel.length===10)
                    {
                       
                    return true;
                }
                else
                {
                    alert("enter a valid phone number");
                    return false;
                }
                }

                else
                {
                    alert("New Password and Confirm Password Do not match");
                    return false;
                }
            }
         </script>
    </head>
    <body>
    <center>     
        <%@include file="header.jsp" %>

        <form action="signupform2.jsp" method="post" onsubmit="return check()">
            <table cellspacing="5" cellpadding="5" style="padding-left: 200px">
                <caption style="color:orangered;font-family: sans-serif;font-size: 21px;margin-bottom: 20px;padding-top: 70px;">WELCOME USER</caption>
              
                <tr><td style="width:160px" > Username</td>
                    <td> <input type="text" required="" name="uname"> </td></tr>
                <tr><td>New Password</td>
                    <td><input type="password" required="" name="np" id="pass1"></td>
                </tr>
                <tr><td> Confirm Password</td>
                    <td><input type="password" required="" name="cp" id="pass2"></td>
                </tr>
                <tr>
                    <td>Email</td>
                    <td><input type="email" required="" name="email"></td>
                </tr>
                <tr><td>Phone No.</td>
                    <td><input type="tel" required="" name="pho no" id="telephone"></td></tr>
                <tr><td>Security Question</td>
                    <td><select name="security quest">
                            <option value="What is the name of your favorite childhood teacher?">What is the name of your favorite childhood teacher?</option>
                            <option value="What is the country of your ultimate dream vacation?">What is the country of your ultimate dream vacation?</option>
                            <option value="What is your favorite color?">What is your favorite color?</option>
                            <option value="What was the name of your elementary / primary school?">What was the name of your elementary / primary school?</option>
                            <option value="What was the make and model of your first car?">What was the make and model of your first car?</option>
                            <option value="What was your maternal grandfather?s first name?">What was your maternal grandfather?s first name?</option>
                            <option value="In what city or town does your nearest sibling live?">In what city or town does your nearest sibling live?</option>
                            <option value="What time of the day were you born? (hh:mm)">What time of the day were you born? (hh:mm)</option>
                        </select></td></tr>
                <tr><td>Security Answer</td>
                    <td><input type="text" required="" name="security ans"/> </td></tr>
                <tr>
                    <td style="padding-left: 95px;"><br><input type="submit" value="signup" style="background-color: orangered;width: 70px;height: 25px;border-radius: 5px;border: 1px"></td></tr>
            </table>
        </form>
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
