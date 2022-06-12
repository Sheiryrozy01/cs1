/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class register extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet register</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet register at " + request.getContextPath() + "</h1>");
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
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String Name = null;
        int Age = Integer.parseInt(request.getParameter("staff_age"));
        String valid = null;
        String output = null;
        String msg = null;
        String color = null;

        Name = request.getParameter("staff_name");

        if (Age >= 18 && Age < 25) {
            out.println("<SCRIPT>");
            out.println("alert(' eligible to become a new staff ')");
            out.println("window.location.href =\"StaffInsertData.html\";");
            out.println("</SCRIPT>");
        } else {
            out.println("<SCRIPT>");
            out.println("alert(' not eligible to become a new staff ')");
            out.println("window.location.href =\"loginStaff.html\";");
            out.println("</SCRIPT>");
        }
        out.println("<script>");
            out.println("function confirmBack(){");
            out.println("var remove=confirm(\"Back to Main Menu?\");");
            out.println("if(remove===true){");
            out.println("alert(\"System set back to main menu\");");
            out.println("window.location.href =\"index.html\";");
            out.println("}else{");
            out.println("alert(\"Back function is Canceked\");");
            out.println("return false;");
            out.println("}");
            out.println("}");
            out.println("</script>");

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletOne - Basic Data" + "Validation and Displaying A Pop-Up Message</title>");
            out.println("<style>");
            out.println("td,th{border: opx solid #ddd; text-align: left;}");
            out.println("border-collapse: collapse; width: 24.5%;" + "border-style:solid;border-width: 2px; border-color:" + "appworkspace;");
            out.println(" th, td{padding: 5px;}");
            out.println("</style>");
            out.println("</head>");
            out.println("<body>");
            out.println("<table align=\"center\">");
            out.println("<tr>");
            out.println("<td colspan=\"3\">");
            out.println("<div style=\"font-size: larger; color: blue\"><u>" + "Data You Have Submitted<u></div>");
            out.println("</td>");
            out.println("</tr>");
            out.println("<tr>");

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

    private void header(String location_StaffInsertDatajsp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
