<%-- 
    Document   : query_string_output
    Created on : 2018/07/02, 16:47:18
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
           
           request.setCharacterEncoding("UTF-8");
           
           if(request.getParameter("type").equals("1")){
               out.print("①商品種別：雑貨");
           }
           else if(request.getParameter("type").equals("2")){
               out.print("①商品種別：生鮮食品");
           }
           else if(request.getParameter("type").equals("3")){
               out.print("①商品種別：その他");
           }
           
           int total=Integer.parseInt(request.getParameter("total"));
           int count=Integer.parseInt(request.getParameter("count"));
           int price=total/count;
           out.print("②総額："+total+"円");
           out.print("③数量："+count+"個");
           out.print("④単価："+price+"円");
           
           double point=0;
           if(total>=3000 && total<5000){
               point=total*0.04;
               
               out.print("⑤ポイント："+point);
           }
           else if(total>=5000){
               point=total*0.05;
               out.print("⑤ポイント："+point);
           }
           else{
               out.print("⑤ポイント取得なし");
           }
           
           
        
        
        
        
        
        %>
        
        
        
    </body>
</html>
