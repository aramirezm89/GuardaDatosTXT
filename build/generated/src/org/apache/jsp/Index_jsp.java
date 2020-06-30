package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css\"/>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("        <title>Captura de Datos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("         <div class=\"row\">\n");
      out.write("            <div class=\"col s6 offset-s3\" >\n");
      out.write("                <div class=\"card-panel z-depth-5\" >\n");
      out.write("        \n");
      out.write("     \n");
      out.write("     \n");
      out.write("        \n");
      out.write("        <form action=\"paginaDestino.jsp\" method=\"post\">\n");
      out.write("            <table cellspacing=\"3\" cellpadding=\"5\" border=\"1\">\n");
      out.write("                <font color=\"green\"> <h4><b>Introduce la informacon del alumno:</b></h4></font>\n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\"> <font color=\"green\"><b>Nombre alumno:</b></font></td>\n");
      out.write("                    <td><input type=\"text\" name=\"nombre\" placeholder=\"Ingrese sus nombres\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td align=\"right\"> <font color=\"green\"><b>Apellidos alumno:</b></font></td>\n");
      out.write("                   <td><input type=\"text\" name=\"apellidos\" placeholder=\"Ingrese sus apellidos\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>  \n");
      out.write("                    \n");
      out.write("                       <td align=\"right\"> <font color=\"green\"><b>Sexo alumno:</b></font></td>\n");
      out.write("                    \n");
      out.write("                    \n");
      out.write("                    <td>\n");
      out.write("                            <label>\n");
      out.write("                            <input type=\"radio\" name=\"sexo\"\n");
      out.write("                                   value=\"Hombre\" checked><span>Hombre</span>\n");
      out.write("                            </label>\n");
      out.write("                            \n");
      out.write("                            <label>\n");
      out.write("                            <input type=\"radio\" name=\"sexo\"\n");
      out.write("                                   value=\"Mujer\" ><span>Mujer</span> <br>\n");
      out.write("                             </label>\n");
      out.write("                      </td>                 \n");
      out.write("                </tr>  \n");
      out.write("                  <tr>\n");
      out.write("                 <td align=\"right\"> <font color=\"green\"><b>Promedio alumno:</b></font></td>\n");
      out.write("                   <td><input type=\"tel\" name=\"promedio\"  maxlength=\"3\" placeholder=\"Ingrese Numeros\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write(" \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            \n");
      out.write("                <input type=\"reset\" value=\"Borrar\"class=\"waves-effect waves-light btn\">\n");
      out.write("                <input type=\"submit\" value=\"Enviar\" name=\"g\" class=\"waves-effect waves-light btn\">\n");
      out.write("               \n");
      out.write("        </form>\n");
      out.write("                 <a href=\"MostrarDatos.jsp\" class=\"waves-effect waves-light btn\"> Base de Datos</a>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                </div>\n");
      out.write("                </div>\n");
      out.write("             </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
