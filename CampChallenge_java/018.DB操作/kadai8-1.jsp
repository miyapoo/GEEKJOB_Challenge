<%-- 
    Document   : kadai8-1
    Created on : 2018/07/20, 12:06:35
    Author     : miyuki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <form action="./kadai8" method="post">
            <label>〇検索フォーム</label><br>
            <input type="text" name="txt"><br><br>
            
            <input type="submit" name="submit" value="検索">
            
        </form>
    </body>
</html>
