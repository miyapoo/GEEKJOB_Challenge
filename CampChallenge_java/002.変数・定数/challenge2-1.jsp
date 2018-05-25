<%-- 
    Document   : challenge2-1
    Created on : 2018/05/25, 13:21:54
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
            String name="私の名前は三宅未有紀です。";
            String hobby="趣味は音楽を聴くことです。";
            
            out.print("こんにちは!<br>");
            
            out.print(name);
            
            out.print(hobby);
           
            
            
            
         %>
    </body>
</html>
