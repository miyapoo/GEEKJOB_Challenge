<%-- 
    Document   : challenge7-1
    Created on : 2018/05/30, 11:23:53
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
        <%@ page import="java.util.HashMap"%>
        <%
            HashMap <String,String>prof= new HashMap <String,String>();
            
            prof.put("1","AAA");
            prof.put("hello","world");
            prof.put("soeda","33");
            prof.put("20","20");
            
            out.print("1:"+ prof.get("1"));
            out.print("<br>");
            
            out.print("hello:"+ prof.get("hello"));
            out.print("<br>");
            
            out.print("soeda:"+ prof.get("soeda"));
            out.print("<br>");
            
            out.print("20:"+  prof.get("20")) ;
            
          
        
        
        
        
        %>
        
 
    
    
    
    
    </body>
</html>
