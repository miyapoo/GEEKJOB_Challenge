/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author miyuki
 */
public class kadai3 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
        String[] profile(String key){
                String [][] profile_list={
                    {"ID:367367","東京都練馬区","1993/11/8生まれ"},
                    {"ID:123123",null,"2012/3/14生まれ"},
                    {"ID:713366","神奈川県川崎市","2017/6/17生まれ"} };
                
                for(String[]p:profile_list){
                    if(p[0].equals(key))return p;}
                
                        return null;
        }
   


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai3</title>");            
            out.println("</head>");
            out.println("<body>");
//           
            int limit=2;
             if(limit== 2){
               String [] p=profile("ID:367367");
                for (String p1 : p) {
                 out.print("【1】①"+p[0]+"②住所："+p[1]+"③"+p[2]);
                 out.print("<br>");
                  break;
            }  
               
               String [] m=profile("ID:123123");
                String str=null;
                for (String m1 : m) {
                 if(m1.equals(str)){
                    continue;
               }
                out.print("【2】①"+m[0]+"③"+m[2]);
                out.print("<br>");
                break;
            }
             }
            
             else{ String [] n=profile("ID:713366");
                    for (String n1 : n) {
                    out.print("【3】"+n[0]+"②住所："+n[1]+"③"+n[2]);
                      break;
            }
             }
         
            

            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

