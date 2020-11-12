/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author Kahilan
 */
public class fie extends HttpServlet {

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
        try (PrintWriter out = response.getWriter()) {
          try
          {
              HttpSession session=request.getSession();
              String s=request.getParameter("gid");
               session.setAttribute("gid",s);
               int mf=Integer.parseInt(request.getParameter("mf"));
               int cc=Integer.parseInt(request.getParameter("cc"));;
               int bp=Integer.parseInt(request.getParameter("bp"));;
               session.setAttribute("mf",mf+"");
               session.setAttribute("cc",cc+"");
               session.setAttribute("bp",bp+"");
                int avg=(mf+bp+cc)/3;
                session.setAttribute("geneid",s+"");
                session.setAttribute("avg",avg+"");
                session.setAttribute("id",s);
                 int k=0;
    if(63<mf&&mf<73)
    {
        k++;
    }
    if(58<cc&&cc<68)
    {
        k++;
    }
    if(65<bp&&bp<75)
    {
        k++;
    }
    if(k<2)
    {
      int i=(cc+mf+bp)/3; 
      if(i<71)
      {
//       JOptionPane.showMessageDialog(null, "Intrinsic GENE");
       request.setAttribute("ge","intrinsic");
        session.setAttribute("ge","intrinsic");
        RequestDispatcher rd=request.getRequestDispatcher("genedisease.jsp");
       rd.forward(request, response);
      }
      else
      {
          JOptionPane.showMessageDialog(null, "Extrinsic GENE"); 
           request.setAttribute("ge","extrinsic");
        session.setAttribute("ge","extrinsic");
       RequestDispatcher rd=request.getRequestDispatcher("genedisease.jsp");
       rd.forward(request, response);
      }
    }
    else
    {
       JOptionPane.showMessageDialog(null, "Your GENE is Normal");
        request.setAttribute("ge","normal");
        session.setAttribute("ge","normal");
       RequestDispatcher rd=request.getRequestDispatcher("genedisease.jsp");
       rd.forward(request, response);
    }
          }
          catch(Exception e)
          {
              JOptionPane.showMessageDialog(null, e);
//               request.setAttribute("ge","normal");
       RequestDispatcher rd=request.getRequestDispatcher("genedisease.jsp");
       rd.forward(request, response);
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
