<%@page import="java.sql.*"%>
    <html>
    <head>
        <title>add songs</title>
        <script>
             var xmlhttp;
            function go()
            {
                xmlhttp = new XMLHttpRequest();
                var h=document.getElementById("category").value;
                xmlhttp.onreadystatechange = go2; 
                xmlhttp.open("GET", "songajax.jsp?category="+h, true);
                xmlhttp.send();
            }
            function go2()
                {
                    if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                    {
                        document.getElementById("content").innerHTML
                                = xmlhttp.responseText;
                    }
                }
            
        </script>
    </head>
    <body>
            <%@include file="userheader.jsp" %>
    <center>

        <form action="useraddsong2.jsp" method="post">
            <table cellspacing="8" cellpadding="8" style="padding-top: 50px;">
                <tr>
                    <td>song name</td>
                    <td> <input type="text" name="sn" required=""/> </td>
                </tr>
                <tr>
                    <td>Genre</td>
                    <td> <select name="gen" id="category" onchange="go()">
                            <option>Select Genre</option>
                            <%
                                String category ="";
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from category");
                              while (rs.next())
                                {   
                                    category = rs.getString("category");
                                    
                            %>
                            
                            <option><%=category%></option>
                            
                <%
                                }
                            %>
                            </select></td></tr>
                
                <tr>
                    <td>Sub Genre</td>
                    <td id="content" ></td></tr>
                
                   
                            <tr><td>Date</td>
                    <td><input type="date" name="date" required="" /></td></tr>
                           
                <tr><td></td>
                    <td><input type="submit" name="submit" value="Click" style="border-radius: 5px;color: orangered;width: 65px "/></td></tr>
            </table>
        </form>
    </center>
                                       <%@include file="Footer.jsp" %>    
    </body>
</html>


