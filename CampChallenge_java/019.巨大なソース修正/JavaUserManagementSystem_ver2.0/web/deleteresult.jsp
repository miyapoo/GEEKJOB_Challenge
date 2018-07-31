<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="jums.JumsHelper"
        import="jums.UserDataBeans"%>

<% JumsHelper jh=JumsHelper.getInstance(); 
    UserDataBeans udb=(UserDataBeans)request.getAttribute("udb");%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>削除結果画面</title>
    </head>
    <body>
    <h1>削除確認</h1>
        
        名前: <%= udb.getName() %><br>
        生年月日: <%= udb.getYear() + "年" + udb.getMonth() + "月" + udb.getDay() + "日" %> <br>
        種別: <%= jh.exTypenum(udb.getType()) %><br>
        電話番号: <%= udb.getTell() %><br>
        自己紹介: <%= udb.getComment() %><br>
        
    削除しました。<br>
    
    <%= jh.home() %>
    </body>
</html>
