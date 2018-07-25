<%@page import="javax.servlet.http.HttpSession" %>
<%@page import="jums.JumsHelper"%>
<%@page import="jums.UserDataBeans"%>
<%
    HttpSession hs = request.getSession();
    
    UserDataBeans udb=(UserDataBeans)hs.getAttribute("UDB");
    
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JUMS登録確認画面</title>
    </head>
    <body>
        <% if(!udb.getname().equals("")&&!udb.getyear().equals("")&&!udb.getmonth().equals("")&&!udb.getday().equals("")&&!udb.gettype().equals("")&&!udb.gettell().equals("")&&!udb.getcomment().equals("")){ %>
        <h1>登録確認</h1>
        名前:<%= udb.getname()%><br>
        生年月日:<%= udb.getyear()+"年"+udb.getmonth()+"月"+udb.getday()+"日"%><br>
        職種:<%= udb.gettype()%><br>
        電話番号:<%= udb.gettell()%><br>
        自己紹介:<%= udb.getcomment()%><br>
        上記の内容で登録します。よろしいですか？
        <form action="insertresult" method="POST">
            <input type="hidden" name="ac" value="<%=hs.getAttribute("ac")%>">
            <input type="submit" name="yes" value="はい">
        </form>
    <% } else{ %>
        <h1>入力が不完全です</h1>
        <%if(udb.getname().equals("")){%>
            <%out.print("名前が未入力です<br>");%>
            <%}%>
        <%if(udb.getmonth().equals("")){%>
            <%out.print("年が未入力です<br>");%>
            <%}%>
        <%if(udb.getday().equals("")){%>
            <%out.print("日が未入力です<br>");%>
            <%}%>
        <%if(udb.gettype().equals("")){%>
            <%out.print("職種が未入力です<br>");%>
            <%}%>
        <%if(udb.gettell().equals("")){%>
            <%out.print("電話番号が未入力です<br>");%>
            <%}%>
        <%if(udb.getcomment().equals("")){%>
            <%out.print("自己紹介文が未入力です<br>");%>
            <%}%>
    <% } %>
        <form action="insert" method="POST">
            <input type="submit" name="no" value="登録画面に戻る">
            <%=JumsHelper.getInstance().home()%>
        </form>
    </body>
</html>
