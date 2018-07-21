<%-- 
    Document   : kadai12-1
    Created on : 2018/07/21, 10:45:12
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
        <form action="./kadai12" method="post">
            
            
            <label>【名前】</label>
            <input type="text" name="name"><br><br>
            <label>【年齢】</label>
            <input type="text" name="age"><br><br>
            <label>【生年月日】</label>
            <input type="text" name="birthday"><br><br>
            
            <input type="submit" name="search" value="検索"><br>
        </form>
            
    </body>
</html>
