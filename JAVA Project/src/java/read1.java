/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author Suresh
 */
public class read1 extends HttpServlet {

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
            String filename=request.getParameter("filename");
            Map<String,String> configParamsMap=new HashMap<String,String>();
        File myFile = new File("D://"+filename); 
        FileInputStream fis = new FileInputStream(myFile);
                XSSFWorkbook myWorkBook = new XSSFWorkbook(fis); 
                XSSFSheet mySheet = myWorkBook.getSheetAt(0); 
                Iterator<Row> rowIterator = mySheet.iterator(); 
                while (rowIterator.hasNext()) {
                    String th="";
                    Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator(); 
                while (cellIterator.hasNext()) { 
                    Cell cell = cellIterator.next(); 
                    switch (cell.getCellType()) 
                    { 
                        case Cell.CELL_TYPE_STRING:
                        String one=(String)cell.getStringCellValue(); 
//                         System.out.print(one);
                         th=th+"zzz"+one;
                        break;
                            
//                    case Cell.CELL_TYPE_NUMERIC:
//                        System.out.print(cell.getNumericCellValue() + "\t"); 
//                        break; 
//                    case Cell.CELL_TYPE_BOOLEAN: 
//                        System.out.print(cell.getBooleanCellValue() + "\t");
//                        break;
                    default : 
                    } 
                } 
//                JOptionPane.showMessageDialog(null, th);
                read2 rr=new read2();
                String[] se=rr.rer(th,filename);
                String s1=se[0];
                String s2=se[1];
//                JOptionPane.showMessageDialog(null, s1+" "+s2);
                configParamsMap.put(s1, s2);
//                System.out.println(th); 
                }    
                 Iterator it = configParamsMap.entrySet().iterator();
    while (it.hasNext()) {
        Map.Entry pair = (Map.Entry)it.next();
        JOptionPane.showMessageDialog(null,pair.getKey() + " = " + pair.getValue());
    }
                RequestDispatcher rd=request.getRequestDispatcher("go1.jsp");	
			request.setAttribute("msg",configParamsMap);
			rd.forward(request, response);
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
