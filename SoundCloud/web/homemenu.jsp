
    <link type="text/css" href="homemenu.css" rel="stylesheet" />
    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="menu.js"></script>

 <div id="copyright" style="display: none">
    Copyright &copy; 2014
    <a href="http://apycom.com/">Apycom jQuery Menus</a></div>


<div id="menu">
    <ul class="menu">
        <li><a href="home.jsp" class="parent"><span>Home</span></a>
            
        </li>
        
       
<%
if(session.getAttribute("un")==null)
{
%>
        <li><a href="userlogin1.jsp"><span>Sign in</span></a></li>
        <li><a href="signupform1.jsp"><span>Sign up</span></a></li>
  <% 
  }
  else{
       %> 
        <li ><a href="logout.jsp"><span>Logout</span></a></li>
        <%  String username=(String)session.getAttribute("un");%>
        <li><a href="userhome.jsp" class="parent"><span><%=username%></span></a>
            
        </li>
<%
}
%>
        
    </ul>
</div>
