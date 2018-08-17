<%@page import="java.sql.*"%>

<%      String username = (String) session.getAttribute("un");
        String email = request.getParameter("email");
        String phone = request.getParameter("phn");
        String securityqeust = request.getParameter("quest");
        String securityans = request.getParameter("ans");
        Class.forName("com.mysql.jdbc.Driver");
        Connection soundcloud = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
        Statement stmt = soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        ResultSet rs = stmt.executeQuery("select * from user where username ='" + username+ "'");

        if (rs.next())
        {
            rs.updateString("email", email);
            rs.updateString("phone no",phone);
            rs.updateString("security question",securityqeust);
            rs.updateString("security answer",securityans);
            rs.updateRow();
            
            response.sendRedirect("usereditprofile3.jsp");
           // response.sendRedirect("userhome.jsp?msg=info. Updated");
        }
        
        else
        {
            response.sendRedirect("usereditprofile1.jsp?msg=infomation not updated");
        }
    


%>
