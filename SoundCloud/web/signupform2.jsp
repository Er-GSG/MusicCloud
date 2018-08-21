<%@page import="java.sql.*"%>


<%

    String username =request.getParameter("uname");
    String  password =request.getParameter("np");
    String email=request.getParameter("email");
    String pho=request.getParameter("pho no");
    String secq=request.getParameter("security quest");
    String seca=request.getParameter("security ans");

    Class.forName("com.mysql.jdbc.Driver");
    Connection soundcloud =DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/soundcloud", "root", "guri");
    Statement stmt =soundcloud.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
    ResultSet rs =stmt.executeQuery("select * from user");
    
    if (rs.next()) 
    {
        rs.moveToInsertRow();
        rs.updateString("username", username);
        rs.updateString("password",password);
        rs.updateString("email",email);
        rs.updateString("phone no",pho);
        rs.updateString("security question",secq);
        rs.updateString("security answer",seca);
        rs.insertRow();
        response.sendRedirect("signupform1.jsp?msg=User Account Created Successfully");
    }
    else
    {
           response.sendRedirect("signupform1.jsp?msg=invalid old password");
    }

%>