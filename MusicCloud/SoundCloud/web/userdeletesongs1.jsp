<%@page import="java.sql.*"%>


<%

        String songid = request.getParameter("songid");
        String username=(String)session.getAttribute("un");
        
        
                Class.forName("com.mysql.jdbc.Driver");
                Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
                Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
                ResultSet rs = stmt.executeQuery("select * from songs where  idsongs='"+songid+"'");
                if (rs.next())
                {
                    rs.deleteRow();
                    response.sendRedirect("userviewsongs1.jsp");
                }



%>
