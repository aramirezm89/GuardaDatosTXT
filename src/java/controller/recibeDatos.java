/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Negocio.Alumno;
import datos.EscribeArchivo;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Antonio
 */
@WebServlet(name = "recibeDatos", urlPatterns = {"/recibeDatos"})
public class recibeDatos extends HttpServlet {

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
           
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellidos");
            String promedio = request.getParameter("promedio");
            String sexo = request.getParameter("sexo");
            int registro;
            Alumno a = new Alumno(nombre, apellido,sexo, promedio);
            EscribeArchivo.add(a);
            
                                try {
                                    Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                                    Connection cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=JAVA_1", "sa", "123");

                                    PreparedStatement ps = cnn.prepareStatement("INSERT INTO JAVA_1_Alumno(nombre,apellido,sexo,promedio) values (?,?,?,?)");
                                    ps.setString(1, nombre);
                                    ps.setString(2, apellido);
                                    ps.setString(3, sexo);
                                    ps.setString(4, promedio);
                                       registro = ps.executeUpdate();
                                    if (registro >= 1) {
                                        out.println("<font size = 4 color='green'> <b>Registrado con exito </b> </font>");
                                    } else {
                                        out.println("<font size=4 color='green'> <b>no se pudo insertar el registro </b>");
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }
                      request.setAttribute("atribAlumno", a);
                      request.getRequestDispatcher("/paginaDestino.jsp").forward(request, response);

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
