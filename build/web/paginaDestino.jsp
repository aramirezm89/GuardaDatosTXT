<%-- 
    Document   : paginaDestino
    Created on : 27-06-2020, 15:29:57
    Author     : Antonio
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="datos.EscribeArchivo"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="Negocio.Alumno"%>
<!DOCTYPE html>
<html>
    <head>
         <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
    <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <% String nombre = request.getParameter("nombre");
           String apellido = request.getParameter("apellidos");
           String promedio  = request.getParameter("promedio") ;       
           int registro;
        Alumno a = new Alumno(nombre,apellido,promedio);
      EscribeArchivo.add(a);
     
    try{
     Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
   
     Connection cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=JAVA_1","sa","123");
     
     PreparedStatement ps = cnn.prepareStatement("INSERT INTO JAVA_1_Alumno(nombre,apellido,promedio) values (?,?,?)");
     ps.setString(1,nombre);
      ps.setString(2,apellido);
       ps.setString(3,promedio);
       
       registro = ps.executeUpdate();
       if (registro>=1) {
               out.println("<h1> Registrado con exito</h1>");
           }else{
           out.println("<h1> no se pudo insertar el registro</h1>");
       }
    }catch(Exception e){
        e.printStackTrace();
    }




      
         %>
        

       
         <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >
       
                    <h2>La informacion del alumno es la siguiente</h2>
        
        
                  <table cellspacing="3" cellpadding="5" border="1">
                        <tr>
                            <td align="right">Tu nombre es</td>
                            <td><%=nombre%></td>

                        </tr>
                        <tr>
                            <td align="right">Tus apellidos son::</td>
                            <td><%=apellido%></td>

                        </tr>
                         <tr>
                            <td align="right">Tu promedio es::</td>
                            <td><%=promedio%></td>

                        </tr>
                    </table>
        

        <form action="Index.jsp" merthod="post">
                <input type="submit" value="Nuevo registro" class="waves-effect waves-light btn">
                </form>
    </body>
    
                </div>
                </div>
             </div>
</html>
