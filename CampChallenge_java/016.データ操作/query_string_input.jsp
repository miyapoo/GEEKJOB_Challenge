<%-- 
    Document   : query_string_input
    Created on : 2018/07/02, 16:46:37
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
        <form action="./query_string_output.jsp"method="GET"> 
            <label>〇購入した商品総額</label><br>
            <input type="text" name="total" value="15000"><br><br>
            <label>〇購入した商品の数量</label><br>
            <input type="text" name="count" value="2"><br><br>
            <label>〇商品</label><br>
            <input type="radio" name="type" value="1">
            <label>1.雑貨</label>
            <input type="radio" name="type" value="2">
            <label>2.生鮮食品</label>
            <input type="radio" name="type" value="3">
            <label>3.その他</label>
            <br><br>
            
            <input type="submit" name="btnSubmit" value="買い物かご">
        </form>
    </body>
</html>
