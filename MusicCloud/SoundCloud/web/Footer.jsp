<!DOCTYPE html>
<html>
    <head>

        <style>
            body{ color:#666;
                  font-size: medium;
                  font-family: sans-serif;
                  text-decoration: none;
                  color: #666;
                  margin: 0;
                  line-height: 14px;
                  font-weight: 700;

            }

            h3{
                
                text-decoration: none;
                color: #666;
                margin: 0;
                font-family: sans-serif;font-size: 18px;
                line-height: 14px;
                font-weight: 700}
            
            
            a{text-decoration: none;
              font-family: sans-serif;
              font-size:  small;
              color: #303030;
            }



        </style>
    </head>
    <body>
    <center>
        <link rel="stylesheet" href="style.css">
                    <div class="footerstyle"> 

        <div class="Footer">

            <table style=" width: 100%;  height: 19px; border-bottom: 1px solid #d4d4d4;border-radius: 5px; ">
                <tr><th> <table>
                <tr>
                    <th style="min-width: 50px">
                                                           

                        <table  cellpadding="5" style="width: 35px; height: 19px; border-right: 1px solid #d4d4d4; border-radius:5px ; ">
                            <tr> <th><img src="logo.png" alt="click on image" style="width:20px;height:17px">
                                </th>
                            </tr>
                        </table>
                                                                                        

                    </th>
                    <th>
                    <h3 style="color: orangered">Music Cloud</h3>
                    </th>
                
                </tr>
                </table>

            </th>
            </tr>

            </table>
            <table style="width: 100%" cellpadding="5">
                <tr>
                    <th>


                    </th>

                    <th></th>		
                    <th></th>
                    <th></th>

                </tr>
                <%
if(session.getAttribute("un")==null)
{
%>
                <tr>
                    <th><a href="home.jsp"  >Home </a></th>
                    <th><a href="contact.jsp" >Contact Us </a></th>

                    <th><a href="signupform1.jsp">Sign up</a></th>

                </tr>
                <tr>

                    <th> <a href="userlogin1.jsp" >Login </a></th>		

                    <th><a href="help.jsp" >Help Center </a>
                    <th><a href="aboutus.jsp" >About Us </a></th>

                </tr>

 <% 
  }
  else{
       %> 
  
             <tr>
                    <th><a href="home.jsp"  >Home </a></th>
                     <th><a href="help.jsp" >Help </a></th>

                    <th><a href="publicuserinterface1.jsp" >Download </a></th>


                </tr>
                <tr>

                    <th> <a href="logout.jsp" >Log Out </a></th>		
                    <th><a href="contact.jsp" >Contact Us </a></th>

                    <th><a href="aboutus.jsp" >About Us </a></th>

                </tr>
            </table>
       
            <%
}%>
          
<table style="width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px;padding-top: 20px;
"></table>

           <h5>Global Institute Of Management & Emerging Technologies, Amritsar</h5>
                <h6> Developers Gurpreet Singh &  Kawaljeet Singh</h6>
            <a href="https://www.facebook.com">
                <img src="fb.jpg" alt="click on image" style="width:20px;height:18px;border:0"></a>
            <a href="https://www.twitter.com">
                <img src="tw.jpg" alt="click on image" style="width:20px;height:18px;border:0"></a>
           

        </div>
    </center>
    </body>
</html>