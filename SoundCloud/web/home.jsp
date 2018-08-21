

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
       <script>
                           

            function go(value)                
                 {   
               
//                 if(value==null || value==""){
//                  alert(value);
//                 
//                  }
//                 else{
                   xmlhttp = new XMLHttpRequest();
//                var h = document.getElementById("value").value;
                xmlhttp.onreadystatechange = go2;
                xmlhttp.open("GET", "homesearch.jsp?value=" + value, true);
                
                xmlhttp.send();
//    }
}
 function go2()
            {
                if (xmlhttp.readyState == 4 && xmlhttp.status == 200)
                {
                    document.getElementById("content1").innerHTML
                            = xmlhttp.responseText;
                }
            
            }

        </script>
      
    </head>
    <body>
        
                <%@include file="homeheader.jsp" %>
          
    </body>
    
</html>
