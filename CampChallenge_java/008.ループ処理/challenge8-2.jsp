<%-- 
    Document   : challenge8-2
    Created on : 2018/05/30, 15:32:53
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
            String key ="";
            
            
            for(int i=0; i<30; i++){
                key = key+"A";
            }
            out.print(key);

        
        %>
    </body>
</html>
