<%-- 
    Document   : kadai
    Created on : 2018/07/02, 13:26:03
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
        request.setCharacterEncoding("UTF-8");
        out.print(request.getParameter("txtName"));
        out.print(request.getParameter("radioSample"));
        out.print(request.getParameter("radioSample2"));
        out.print(request.getParameter("mulText"));
        
        
        %>
    </body>
</html>
