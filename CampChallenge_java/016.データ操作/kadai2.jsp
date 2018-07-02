<%-- 
    Document   : kadai2
    Created on : 2018/07/02, 16:18:00
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
            out.print(request.getParameter("gender"));
            out.print(request.getParameter("year"));
            out.print(request.getParameter("month"));
            out.print(request.getParameter("day"));
            out.print(request.getParameter("bloodtype"));
            
        
        
        
        
        %>
    </body>
</html>
