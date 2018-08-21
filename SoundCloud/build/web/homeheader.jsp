<html>
    <head>
        <style>
            a{text-decoration: none;
              font-family: sans-serif;
              font-size:  small;
              color: #303030;
              opacity:100;
            }
            h5{text-decoration: none;
               font-family: sans-serif;
               font-size:  small;
               color: #303030;
               opacity:100;
            }

        </style>
    </head>
    <body> 
    <center>
       
        <link rel="stylesheet" href="style.css">
        <div class="style1"> 



            <div class="wrapper">

                <div class="Menu">
                    <%@include file="homemenu.jsp" %>

                </div>
                <div class="home" style="color: orangered;"> 
                    
                    <form action="publicuserinterface1.jsp" method="post">
                        <div><table style="padding-left: 230px;">
                             <tr><td style="">
                                     <input type="text" onkeyup="go(this.value)"   placeholder="Search For Artist,Album,Songname"  autocomplete="off"  style=" background-color: #f5f6f7;width: 518px;height: 21px;background-image: url(sr.png);background-repeat: no-repeat;background-size: 23px;background-position-x: 497px; border-radius: 5px;border-width: thin;margin-top: 5px; "/>
                            <div id="content1">

                                </div><tr><td> </td></tr>

                         </table></div>
                        <table>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr><td></td></tr>
                            <tr>

                                <td style="color:#FA6111;font-family: sans-serif;font-size: 40px;min-width: 940px; ">
                                    Hear the world's sounds</td></tr>
                            <tr><td style="color:#FA6111;ont-family: sans-serif;font-size: 19px ;"> Millions of  artists can share their tracks </td></tr>
                            <tr><td style="color: #FA6111;;font-family: sans-serif;font-size: 19px ">   
                                </td>
                            <tr><td style="color:#FA6111;;font-family: sans-serif;font-size: 40px "> Music Cloud
                                </td>



                            <tr><td><input type="submit" value="Explore Music" style=" border-color:#FA6111;  border-radius: 5px;background-color: #FA6111;;color:white;font-family: sans-serif;"></td></tr>
                            
                        </table>
                        
                     
                       
                   
                    </form>

                </div>
                    
                                 
                
               
                <%@include file="index.html" %>
                <br>
                <table style="width: 50%; border-bottom: 1px solid #d4d4d4;border-radius: 5px">


                </table>
                <h5>Global Institute Of Management & Emerging Technologies, Amritsar</h5>
                <h6> Developers Gurpreet Singh &  Kawaljeet Singh</h6>
                <a href="contact.jsp"><span>Contacts</span></a>
                <a href="help.jsp"><span>Help</span></a>
                <a href="aboutus.jsp"><span>About Us</span></a>
                <br>
                <br>
                <a href="https://www.facebook.com">
                    <img src="fb.jpg" alt="click on image" style="width:20px;height:18px;border:0"></a>
                <a href="https://www.twitter.com">
                    <img src="tw.jpg" alt="click on image" style="width:20px;height:18px;border:0"></a>
                <br>
                <br>

                </center>
                </body>
                </html>









