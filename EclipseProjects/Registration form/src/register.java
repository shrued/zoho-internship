/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 *
 * @author johni
 */
@WebServlet(urlPatterns = {"/Register"})
@MultipartConfig
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
            throws ServletException, IOException, ClassNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
            String name = request.getParameter("name");
            String gender = request.getParameter("gender");
            String rollno = request.getParameter("Rollno");
            String department = request.getParameter("department");
            String yearofpassing = request.getParameter("Yearofpass");
            String phone = request.getParameter("phone_number");
            String email = request.getParameter("email_address");
            String currcompany = request.getParameter("currcompany");
            String currdesignation = request.getParameter("currdesignation");
            String country = request.getParameter("country");
            String compname1 = request.getParameter("compname1");
            String designation1 = request.getParameter("designation1");
            String compname2 = request.getParameter("compname2");
            String designation2 = request.getParameter("designation2");
            String compname3 = request.getParameter("compname3");
            String designation3 = request.getParameter("designation3");
            String compname4 = request.getParameter("compname4");
            String designation4 = request.getParameter("designation4");
            String university = request.getParameter("University");
            String Stream = request.getParameter("Stream");
            Part image = request.getPart("image");
            out.println(name+"\n"+gender+"\n"+rollno+"\n"+department+"\n"+yearofpassing+"\n"+phone+"\n"+
                    email+"\n"+currcompany+"\n"+currdesignation+"\n"+country+"\n"+compname1+"\n"+designation1+
                    "\n"+compname2+"\n"+designation2+"\n"+compname3+"\n"+designation3+"\n"+compname4+"\n"+designation4+"\n"
            +university+"\n"+Stream);
            InputStream inputstream = null;
            if(image!=null)
            {
                inputstream = image.getInputStream();
            }
            try
            {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/ALUMNI","app","root");
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO ALUMNI_DETAILS VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ");
            stmt.setString(1, name);
            if(gender.equals("male"))
            {
               stmt.setString(2,"M");
            }
            else if(gender.equals("female"))
            {
                stmt.setString(2,"F");
            }
            else if(gender.equals("others"))
            {
                stmt.setString(2,"O");
            }
            stmt.setString(3,rollno);
            stmt.setString(4,department);
            stmt.setString(5,yearofpassing);
            stmt.setString(6,email);
            stmt.setString(7,currcompany);
            stmt.setString(8,currdesignation);
            stmt.setString(9,country);
            stmt.setString(10,compname1);
            stmt.setString(11,designation1);
            stmt.setString(12, compname2);
            stmt.setString(13,designation2);
            stmt.setString(14,compname3);
            stmt.setString(15,designation3);
            stmt.setString(16,compname4);
            stmt.setString(17,designation4);
            stmt.setString(18,university);
            stmt.setString(19,Stream);
            stmt.setString(20,phone);
            stmt.setBlob(21,inputstream);
            stmt.executeUpdate();
            }
            catch(ClassNotFoundException e)
            {
                out.println("why"+e);
            }
            catch(SQLException f)
            {
                out.println(f);
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        try {
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(register.class.getName()).log(Level.SEVERE, null, ex);
        }
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
