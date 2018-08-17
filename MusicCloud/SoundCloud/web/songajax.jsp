<%@page import="java.sql.*"%>
<select name="subgen">
        <%
            String category=request.getParameter("category");
                          
                                  String subcategory="";
                                  
                                Class.forName("com.mysql.jdbc.Driver");
                                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                                ResultSet rs = stmt.executeQuery("select * from subcategory where category='"+category+"'");

                                while (rs.next())
                                {   
                                    subcategory = rs.getString("subcategory");
                                    
              %>
              <option><%= subcategory %></option>
              <%
                                }
            %>
</select>
