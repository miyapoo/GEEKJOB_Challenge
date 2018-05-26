<%-- 
    Document   : challenge4-1
    Created on : 2018/05/26, 16:13:07
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
        <%-- 変数使用--%>
        <%
            String REC="groove";
            String G="gear";
            
            out.print(REC + "-" + G);
        %>
        
        <%--変数なし--%>
        <%
            out.print("<br>");
       
            out.print("groove" + "-" + "gear");
        %>
            
        
    <body>
</html>
