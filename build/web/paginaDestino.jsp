<%-- 
    Document   : paginaDestino
    Created on : 27-06-2020, 15:29:57
    Author     : Antonio
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="datos.EscribeArchivo"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<%@page import="Negocio.Alumno"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>

        <% 
           
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

       %>



        <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >

                    <h2>La informacion del alumno es la siguiente</h2>


                    <table cellspacing="3" cellpadding="5" border="1">
                       
                        
                        <tr>
                            <td align="right"> <font color="green"><b>Nombre alumno:</b></font></td>
                            <td><%=nombre%></td>

                        </tr>
                        <tr>
                           <td align="right"> <font color="green"><b>Apellidos del alumno:</b></font></td>
                            <td><%=apellido%></td>

                        </tr>
                          <tr>
                          <td align="right"> <font color="green"><b>Sexo del alumno:</b></font></td>
                            <td><%=sexo%></td>

                        </tr>
                        <tr>
                           <td align="right"> <font color="green"><b>Promedio del alumno:</b></font></td>
                            <td><%=promedio%></td>

                        </tr>

                        <tr>                
                            <td align="right">  <%

                                    registro = ps.executeUpdate();
                                    if (registro >= 1) {
                                        out.println("<font size = 4 color='green'> <b>Registrado con exito </b> </font>");
                                    } else {
                                        out.println("<font size=4 color='green'> <b>no se pudo insertar el registro </b>");
                                    }
                                } catch (Exception e) {
                                    e.printStackTrace();
                                }


                                %>


                            </td>       


                        </tr>       
                    </table>


                 
          <a href="Index.jsp" class="waves-effect waves-light btn"> Nuevo registro </a>
          <a href="MostrarDatos.jsp" class="waves-effect waves-light btn"> Base de Datos</a>
         
                     
                                
                    </body>

                </div>
            </div>
        </div>
</html>
