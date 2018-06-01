<%-- 
    Document   : challenge9-1
    Created on : 2018/05/30, 17:22:39
    Author     : miyuki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            int key=1000;
            int count=0;
            
            while(key<100 == false){
                key=key/2;
                count++;
            }
            out.print(key);
            
            
        
        %>
    </body>
</html>
