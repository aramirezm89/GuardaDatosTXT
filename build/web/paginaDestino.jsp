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
         <link rel="stylesheet" href="css/estilos.css"/>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>JSP Page</title>
    </head>
    <body>

        <% 
           
            Alumno a = (Alumno) request.getAttribute("atribAlumno"); 
    
       %>



        <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >
                  <header>
                   <div class="container">
                    <h3>La informacion del alumno es la siguiente:</h3>
                   </div>
                  </header>
                    
                    <table cellspacing="3" cellpadding="5" border="1">
                       
                        
                        <tr>
                            <td align="right"> <font color="green"><b>Nombre alumno:</b></font></td>
                            <td><%=a.getNombre()%></td>

                        </tr>
                        <tr>
                           <td align="right"> <font color="green"><b>Apellidos del alumno:</b></font></td>
                            <td><%=a.getApellidos()%></td>

                        </tr>
                          <tr>
                          <td align="right"> <font color="green"><b>Sexo del alumno:</b></font></td>
                            <td><%=a.getSexo()%></td>

                        </tr>
                        <tr>
                           <td align="right"> <font color="green"><b>Promedio del alumno:</b></font></td>
                            <td><%=a.getPromedio()%></td>

                        </tr>

                     
                    </table>


                 
          <a href="Index.jsp" class="waves-effect waves-light btn"> Nuevo registro </a>
          <a href="MostrarDatos.jsp" class="waves-effect waves-light btn"> Base de Datos</a>
         
                     
                                
                    </body>

                </div>
            </div>
        </div>
</html>
