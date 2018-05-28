<%-- 
    Document   : challenge5-3
    Created on : 2018/05/28, 15:13:55
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
            char ltr;
            ltr = 'I';
            
            switch (ltr){
                case 'A' :out.print("英語");
                break;
                case 'あ':out.print("日本語");
                break;
            }
            
         %>
    </body>
</html>
