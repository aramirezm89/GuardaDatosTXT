package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class MostrarDatos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Mostrar datos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");

            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=JAVA_1", "sa", "123");
                PreparedStatement ps= cnn.prepareStatement("SELECT * FROM JAVA_1_Alumno");
                ResultSet rs = ps.executeQuery();
       while (rs.next()) {
        
      out.write("\n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"col s6 offset-s3\" >\n");
      out.write("        <div class=\"card-panel z-depth-5\" >\n");
      out.write("        <form action=\"EditarDatos.jsp\" merthod=\"post\">\n");
      out.write("            <table class=\"striped\" cellspacing=\"3\" cellpadding=\"5\" border=\"1\" >\n");
      out.write("            <tr>\n");
      out.write("                <th>ID:</th>\n");
      out.write("                <th>Nombre:</th>\n");
      out.write("                <th>Apellido:</th>\n");
      out.write("                <th>Sexo</th>\n");
      out.write("                <th>Promedio:</th>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("          \n");
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"id\" readonly=\"\" value=\"");
      out.print(rs.getInt("id"));
      out.write("\" </font> </td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"nombre\" readonly=\"\" value=\"");
      out.print(rs.getString("nombre"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"apellido\" readonly=\"\" value=\"");
      out.print(rs.getString("apellido"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"sexo\" readonly=\"\" value=\"");
      out.print(rs.getString("sexo"));
      out.write("\"</font></td>\n");
      out.write("                <td><font color=\"green\"><input type=\"text\" name=\"promedio\" readonly=\"\" value=\"");
      out.print(rs.getString("promedio"));
      out.write("\"</font></td>\n");
      out.write("                <td>\n");
      out.write("                     \n");
      out.write("                <input type=\"submit\" value=\"Editar Registro\" name=\"btnGrabar\" class=\"waves-effect waves-light btn\">\n");
      out.write("                <a href=\"EliminarDatos.jsp\" class=\"waves-effect waves-light btn\"> Eliminar Datos</a>        \n");
      out.write("                              \n");
      out.write("                </td>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("           </form>\n");
      out.write("\n");
      out.write("          <a href=\"Index.jsp\" class=\"btn-floating btn-large waves-effect  waves-light black\">\n");
      out.write("            <i class=\"material-icons\">home</i>\n");
      out.write("          </a>\n");
      out.write("         </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("        ");
 } 
          

      
    

 }catch (Exception e) {
                e.printStackTrace();
            }
        
      out.write("\n");
      out.write("\n");
      out.write("        \n");
      out.write("     \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
