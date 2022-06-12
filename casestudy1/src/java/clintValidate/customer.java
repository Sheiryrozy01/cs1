/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clintValidate;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class customer extends HttpServlet {

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
            out.println("<title>Servlet customer</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet customer at " + request.getContextPath() + "</h1>");
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
        
        

        String customer_name = request.getParameter("customer_name");
        String customer_age = request.getParameter("customer_age");
        String customer_quantity = request.getParameter("customer_quantity");
        String customer_item = request.getParameter("customer_item");
        String customer_address = request.getParameter("customer_address");
        String customer_phone = request.getParameter("customer_phone");
        
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
        out.println("<div style=\"font-size: larger; color: blue\"><u>" + "Data You Hvae Submitted<u></div>");
        out.println("</td>");
        out.println("</tr>");
        out.println("<tr>");
        
        out.println("<td>Name</td>");
        out.println("<td>:</td>");
        out.println("<td>" + customer_name + "</td>");
        out.println("</tr>");
        out.println("<tr>");

        out.println("<td>Age</td>");
        out.println("<td>:</td>");
        out.println("<td>" + customer_age + "</td>");
        out.println("</tr>");
        out.println("<tr>");

        out.println("<td>Quantity Items</td>");
        out.println("<td>:</td>");
        out.println("<td>" + customer_quantity + "</td>");
        out.println("</tr>");
        out.println("<tr>");

        out.println("<td>The Item</td>");
        out.println("<td>:</td>");
        out.println("<td>" + customer_item + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        
         out.println("<td>Address</td>");
        out.println("<td>:</td>");
        out.println("<td>" + customer_address + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        
         out.println("<td>Phone Number</td>");
        out.println("<td>:</td>");
        out.println("<td>" + customer_phone + "</td>");
        out.println("</tr>");
        out.println("<tr>");

        out.println("<td colspan=\"3\">");
        out.println("<SCRIPT>");
        out.println("alert('Data have benn submitted:" + customer_name + "(" + customer_address + "). You Data Have been insert')");
        out.println("</SCRIPT>");
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
