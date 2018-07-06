<%-- 
    Document   : sessionkadai2_input
    Created on : 2018/07/06, 16:33:25
    Author     : miyuki
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String n="";
    String g="";
    String h="";
    
    if((String)session.getAttribute("n1")!=null){
        n=(String)session.getAttribute("n1");}
    if((String)session.getAttribute("g1")!=null){
        g=(String)session.getAttribute("g1");}
    if((String)session.getAttribute("h1")!=null){
        h=(String)session.getAttribute("h1");
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="./sessionkadai2.jsp" method="GET">
            <label>【1】名前</label><br>
            <input type="text" name="name" value= <% if(n !=null){
                out.print(n);}%>><br><br>
            <label>【2】性別</label><br>
            <input type="radio" name="gender" value="男性"<% if(g.equals("男性")){
                out.print("checked");}%>>
            <label>男性</label>
            <input type="radio" name="gender" value="女性"<% if(g.equals("女性")){
                out.print("checked"); }%>>
            <label>女性</label><br><br>
            <label>【3】趣味</label><br>
            <textarea name="hobby"><% if(h !=null){
                out.print(h);}%></textarea><br><br>
            
            <input type="submit" name="Submit" value="フォームに送信">
            
            </form>
        
 
    </body>
</html>
