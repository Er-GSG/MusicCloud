<%@page import="java.sql.*"%>
                <body><center>        <%@include file="header.jsp" %>

 <%   
                    
                    String value = request.getParameter("value");
//                String    value="j";
                    String songname = "";
                    String album = "";
                    String artist = "";
                                       String id = "";

                    String albumart = "";
                    String date="";
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = stmt.executeQuery("select * from songs where songname LIKE '"+value+"%' or album LIKE '"+value+"%' or artist LIKE '"+value+"%' ");

                    while (rs.next())
                            {
                        songname = rs.getString("songname");
                        artist = rs.getString("artist");
                          id = rs.getString("idsongs");
                        album = rs.getString("album");
                        albumart = rs.getString("albumart");
                       date = rs.getString("date");

                    

                %>
                
              
    <table width="100">
                        <tr>
                            <td style="min-width: 210px;padding-bottom: 20px">
                            <img src="<%=albumart%>" width="150" height="150"  />
                        </td >

                        <td colspan="10" >
                            <table width="300" cellpadding="5" cellspacing="8" style="margin-bottom: 25px;" >
                                <tr>
                                    <td>
                                        <a style="color: orangered;font-family: sans-serif; font-size: 19px" href="publicuserinterface3.jsp?id=<%=id%>"><%=songname%></a>

                                    </td>
                                </tr>
                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=album%>

                                    </td>
                                </tr>

                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=artist%>
                                    </td>
                                </tr>
                                <tr>
                                    <td style="font-family: sans-serif;color: #303030;">
                                        <%=date%>
                                    </td>
                                </tr>


                               
                            </table>
                        </td>
                    </tr>
           
                </table>
<%
                            }
%>
        <%@include file="Footer.jsp" %>    

                </center>
                </body>