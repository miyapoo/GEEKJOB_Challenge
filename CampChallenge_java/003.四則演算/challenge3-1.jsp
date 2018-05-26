<%-- 
    Document   : challenge3-1
    Created on : 2018/05/26, 14:03:08
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
            int math = 75;
            int eng = 80;
            int chem = 60;
            
            out.print((math+eng+chem)/3); 
            
            out.print("<br>");
            
            int price=6500;
            final float tax=0.08F;
            
            out.print( price*(1 + tax));
            
         %>
    </body>
</html>
