<%-- 
    Document   : MostrarDatos
    Created on : 28-06-2020, 20:15:00
    Author     : Antonio
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>

<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Mostrar datos</title>
    </head>
    <body>
        <%
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection cnn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=JAVA_1", "sa", "123");
                PreparedStatement ps= cnn.prepareStatement("SELECT * FROM JAVA_1_Alumno");
                ResultSet rs = ps.executeQuery();
       while (rs.next()) {
        %>
        <div class="row">
        <div class="col s6 offset-s3" >
        <div class="card-panel z-depth-5" >
        <form action="EditarDatos.jsp" merthod="post">
            <table class="striped" cellspacing="3" cellpadding="5" border="1" >
            <tr>
                <th>ID:</th>
                <th>Nombre:</th>
                <th>Apellido:</th>
                <th>Sexo</th>
                <th>Promedio:</th>
               
            </tr>

          

            <tr>
                <td><font color="green"><input type="text" name="id" readonly="" value="<%=rs.getInt("id")%>" </font> </td>
                <td><font color="green"><input type="text" name="nombre" readonly="" value="<%=rs.getString("nombre")%>"</font></td>
                <td><font color="green"><input type="text" name="apellido" readonly="" value="<%=rs.getString("apellido")%>"</font></td>
                <td><font color="green"><input type="text" name="sexo" readonly="" value="<%=rs.getString("sexo")%>"</font></td>
                <td><font color="green"><input type="text" name="promedio" readonly="" value="<%=rs.getString("promedio")%>"</font></td>
                <td>
                     
                <input type="submit" value="Editar Registro" name="btnGrabar" class="waves-effect waves-light btn">
                <a href="EliminarDatos.jsp" class="waves-effect waves-light btn"> Eliminar Datos</a>        
                              
                </td>
                
            </tr>
            

         
        </table>

           </form>

          <a href="Index.jsp" class="btn-floating btn-large waves-effect  waves-light black">
            <i class="material-icons">home</i>
          </a>
         </div>
        </div>
        </div>
        <% } 
          

      
    

 }catch (Exception e) {
                e.printStackTrace();
            }
        %>

        
     
    </body>
</html>
