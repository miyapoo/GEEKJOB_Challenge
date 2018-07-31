package jums;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author hayashi-s
 */
public class DeleteResult extends HttpServlet {

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
        //セッションスタート
        HttpSession session=request.getSession();
        
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
            
        try {
            /* TODO output your page here. You may use following sample code. */
            
            //文字コード変更
            request.setCharacterEncoding("UTF-8");
            
//            直リンク防止
            String accesschk = request.getParameter("ac");
            if(accesschk == null || (Integer)session.getAttribute("ac")!=Integer.parseInt(accesschk)){
                throw new Exception("不正なアクセスです");
            }
            
             //フォームの入力を取得してJavaBeansに格納
            UserDataBeans udb=new UserDataBeans();
            udb.setName(request.getParameter("name"));
            udb.setYear(request.getParameter("year"));
            udb.setMonth(request.getParameter("month"));
            udb.setDay(request.getParameter("date"));
            udb.setType(request.getParameter("type"));
            udb.setTell(request.getParameter("tel"));
            udb.setComment(request.getParameter("comment"));
            
            // DBデータ挿入
            UserDataDAO.getInstance().delete(Integer.parseInt(request.getParameter("id")));
            
            //リクエストスコープにセット            
            request.setAttribute("udb",udb);

            request.getRequestDispatcher("/deleteresult.jsp").forward(request, response);
            
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet DeleteResult</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet DeleteResult at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
        }
        catch(Exception e){
            request.setAttribute("error",e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            
        }
        finally {
            out.close();
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
