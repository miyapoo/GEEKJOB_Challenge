<%-- 
    Document   : sessionkadai2
    Created on : 2018/07/06, 15:44:42
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
            
            HttpSession hs=request.getSession();
            
            String n=request.getParameter("name");
            String g=request.getParameter("gender");
            String h=request.getParameter("hobby");

            out.println("【1】名前："+ n);
            hs.setAttribute("n1", n);
            
            if(g.equals("男性")){
                hs.setAttribute("g1", g);
                out.print("【2】性別：男性");
            }
            else if(g.equals("女性")){
                hs.setAttribute("g1",g);
                out.print("【2】性別：女性");
            }
            
            out.print("【3】趣味："+h);
            hs.setAttribute("h1",h);
            
            String name=(String)hs.getAttribute("n1");
            String gender=(String)hs.getAttribute("g1");
            String hobby=(String)hs.getAttribute("h1");

            
                
        %>
    </body>
</html>
