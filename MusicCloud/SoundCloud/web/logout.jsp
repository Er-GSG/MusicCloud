<%
    if(session.getAttribute("un")==null)
    {
        response.sendRedirect("userlogin1.jsp");
    }
       else
    {
           session.setAttribute("un", null);
            response.sendRedirect("userlogin1.jsp");
            
            }







%>