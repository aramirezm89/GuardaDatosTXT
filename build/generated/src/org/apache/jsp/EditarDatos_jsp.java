package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class EditarDatos_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Editar Datos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            PreparedStatement ps;
            ResultSet rs;
            Connection cnn;
            int id = Integer.parseInt(request.getParameter("id"));
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=JAVA_1", "sa", "123");
                ps = cnn.prepareStatement("SELECT * FROM JAVA_1_Alumno where id=" + id);
                rs = ps.executeQuery();
                while (rs.next()) {

        
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col s6 offset-s3\" >\n");
      out.write("                <div class=\"card-panel z-depth-5\" >\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"\" method=\"post\">\n");
      out.write("\n");
      out.write("                        <table cellspacing=\"3\" cellpadding=\"5\" border=\"1\">\n");
      out.write("                           \n");
      out.write("                             <font color=\"green\"> <h4><b>Ingresa los datos a editar:</b></h4></font>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">ID:</td>\n");
      out.write("                                <td><input type=\"text\" readonly=\"\" value=");
      out.print(rs.getString(1));
      out.write("></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">Nombres:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"nombre1\" value=");
      out.print(rs.getString(2));
      out.write("></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">Apellidos:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"apellido1\" value=");
      out.print(rs.getString(3));
      out.write("></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">Sexo:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"sexo1\" value=");
      out.print(rs.getString(4));
      out.write("></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("                            <tr>\n");
      out.write("                                <td align=\"right\">Promedio:</td>\n");
      out.write("                                <td><input type=\"text\" name=\"promedio1\" value=");
      out.print(rs.getString(5));
      out.write("></td>\n");
      out.write("\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("                            <tr>\n");
      out.write("                                <th>\n");
      out.write("\n");
      out.write("                                    <input type=\"submit\" value=\"Guardar\" class=\"btn btn-primary btn-lg\"/>\n");
      out.write("\n");
      out.write("                                </th>\n");
      out.write("                            </tr>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </table>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    ");
}
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>   \n");
      out.write("            </div> \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");


        String nombre = request.getParameter("nombre1");
        String apellido = request.getParameter("apellido1");
        String promedio = request.getParameter("promedio1");
        String sexo = request.getParameter("sexo1");
        if (nombre != null && apellido != null && promedio != null && sexo != null) {
            ps = cnn.prepareStatement("UPDATE JAVA_1_Alumno SET nombre=?,apellido=?,sexo=?,promedio=? where id=" + id);
            ps.setString(1, nombre);
            ps.setString(2, apellido);
            ps.setString(3, sexo);
            ps.setString(4, promedio);
            ps.executeUpdate();

            response.sendRedirect("MostrarDatos.jsp");
        }
    } catch (Exception e) {

        e.printStackTrace();
    }


      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
