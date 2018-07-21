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
import java.sql.*;

/**
 *
 * @author miyuki
 */
public class kadai9 extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
            Connection db_con=null;
            PreparedStatement db_st=null;
            ResultSet db_data=null;
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            db_con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Challenge_db?characterEncoding=UTF-8&serverTimezone=JST","miyapoo","thebawpass");
            db_st=db_con.prepareStatement("INSERT INTO profiles VALUES(?,?,?,?,?);");
            
            request.setCharacterEncoding("UTF-8");
            
            String s=request.getParameter("profilesID");
            int id=Integer.parseInt(s);
            String name=request.getParameter("name");
            String tel=request.getParameter("tel");
            String a=request.getParameter("age");
            int age=Integer.parseInt(a);
            String bd=request.getParameter("birthday");
            
            
            db_st.setInt(1,id);
            db_st.setString(2,name);
            db_st.setString(3,tel);
            db_st.setInt(4,age);
            db_st.setDate(5,Date.valueOf(bd));
            db_st.executeUpdate();
            
            db_st=db_con.prepareStatement("SELECT * from profiles;");
            db_data=db_st.executeQuery();
            
            while(db_data.next()){
            out.println("ID:"+db_data.getInt("profilesID")+("<br>"));
            out.println("名前："+db_data.getString("name")+("<br>"));
            out.println("電話番号：" +db_data.getString("tel")+("<br>"));
            out.println("年齢："+db_data.getInt("age")+("<br>"));
            out.println("誕生日："+db_data.getDate("birthday").toString()+("<br>"));
            }
            
            db_st.close();
            db_data.close();
            db_con.close();
            
            
            
            
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet kadai9</title>");            
            out.println("</head>");
            out.println("<body>");
//            out.println("<h1>Servlet kadai9 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        catch (SQLException e_sql) {
                System.out.println("接続時にエラーが発生しました:" + e_sql.toString());
            } 
            catch (Exception e) {
                System.out.println("エラーが発生しました："+e.toString());
            } 
            finally {
                if (db_con != null) {
                    try {
                        db_con.close();
                  } 
                    catch (Exception e_con) {
                        System.out.println(e_con.getMessage());
                  }
                }
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
