<%@page import="java.sql.*"%>
       
                <%   
                    
                    String value = request.getParameter("value");
                   if(!value.equals(""))
                   {
//                String    value="j";
                    String songname = "";
                    String album = "";
                    String artist = "";
                    String id = "";
                    String albumart = "";
                    int i=0;
                    Class.forName("com.mysql.jdbc.Driver");
                    Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                    Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                    ResultSet rs = stmt.executeQuery("select * from songs where songname LIKE '"+value+"%' or album LIKE '"+value+"%' or artist LIKE '"+value+"%' ");
                     

                        while(rs.next())
                    { 
             
                        songname = rs.getString("songname");
                        artist = rs.getString("artist");
                          id = rs.getString("idsongs");
                        album = rs.getString("album");
                        albumart = rs.getString("albumart");
                      
                                                                                    
                         if(i<=4){
                           i++;
                %>
                
                <div style="background-color: #f5f6f7;position: absolute;width: 520px;border-radius: 3px; ">

                <table width="100" >
                        <tr>
                            <td style="min-width: 50px;" >
                                <a href="publicuserinterface3.jsp?id=<%=id%>"> <img src="<%=albumart%>" width="40" height="40"  /></a>
                        </td >
                        <td style="font-family: sans-serif;font-size: 13px;color: #303030;min-width: 240px"><%=artist%>,<%=songname%>,<%=album%>
</td>
 
                    </tr>
                                   
                </table>
<table style="width: 100%; border-bottom: 1px solid #d4d4d4;border-radius: 5px">


            </table>
                        

                   
<%
                                                    } 
                         %>

                         
                         <%
                    }
                    ResultSet rs1 = stmt.executeQuery("select * from songs where songname LIKE '"+value+"%' or album LIKE '"+value+"%' or artist LIKE '"+value+"%' ");
                     if (rs1.next()){
                        
%>

                         <table><tr><th style="width: 300px;"> <a href="homesearch2.jsp?value=<%=value%>">SeeMore</a></th></tr></table>

                         <% 
                    }
                   }
                         %>
</div>

