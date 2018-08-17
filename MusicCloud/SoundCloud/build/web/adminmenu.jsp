
    <link type="text/css" href="menu.css" rel="stylesheet" />
    <script type="text/javascript" src="jquery.js"></script>
    <script type="text/javascript" src="menu.js"></script>

<div id="copyright" style="display: none">
    Copyright &copy; 2014
    <a href="http://apycom.com/">Apycom jQuery Menus</a></div>

<div id="menu">
    <ul class="menu">
        
        <%
if(session.getAttribute("admin")==null)
{
%>
       
        <li><a href="adminlogin1.jsp" class="parent"><span>Login</span></a>
            
        </li>
        
        <%
    
}
else{
%>     

        
        
        
         <li><a href="#" class="parent"><span>Category</span></a>
        
                            <ul>
                                <li><a href="addcategory1.jsp"><span>Add Category</span></a></li>
                                <li><a href="viewcategory1.jsp"><span>view Category</span></a></li>
                                <li><a href="addsubcategory1.jsp"><span>Add Sub-Category</span></a></li>
                                <li><a href="viewsubcategory1.jsp"><span>View Category</span></a></li>
                            </ul>
                        </li>
         <li><a href="changepassword1.jsp" class="parent"><span>Change Password</span></a>
        
                        </li>
         <li><a href="adminlogout.jsp" class="parent"><span>Logout</span></a>
        
                        </li>
                        <%
}
                        %>
        
    </ul>
</div>
