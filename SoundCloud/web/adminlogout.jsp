<%
    if(session.getAttribute("admin")==null)
    {
        response.sendRedirect("adminlogin1.jsp");
    }
       else
    {
           session.setAttribute("admin", null);
            response.sendRedirect("adminlogin1.jsp");
            
            }







%>