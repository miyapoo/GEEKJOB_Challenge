<%-- 
    Document   : challenge6-2
    Created on : 2018/05/30, 10:12:46
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
             String [] data= {"10","100","soeda","hayashi","-20","118","END"};
             data[2]="33";
             

             out.print(data [0]);
             out.print("<br>");
             
             out.print(data [1]);
             out.print("<br>");
             
             out.print(data [2]);
             out.print("<br>");
             
             out.print(data [3]);
             out.print("<br>");
             
             out.print(data [4]);
             out.print("<br>");
             
             out.print(data [5]);
             out.print("<br>");
             
             out.print(data [6]);
             
        %>
    </body>
</html>
