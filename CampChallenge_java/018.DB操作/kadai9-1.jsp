<%-- 
    Document   : kadai9-1
    Created on : 2018/07/20, 15:54:05
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
        <form action="./kadai9" method="post">
            
            <label>①プロフィールID</label><br>
            <input type="text" name="profilesID"><br><br>
            
            <label>②名前</label><br>
            <input type="text" name="name"><br><br>
            
            <label>③電話番号</label><br>
            <input type="text" name="tel"><br><br>
            
            <label>④年齢</label><br>
            <input type="text" name="age"><br><br>
            
            <label>⑤生年月日</label><br>
            <input type="text" name="birthday"><br><br>
            
            <input type="submit" name="submit" value="送信">
        </form>
    </body>
</html>
