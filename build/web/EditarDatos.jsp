<%-- 
    Document   : EditarDatos
    Created on : 29-06-2020, 20:37:16
    Author     : Antonio
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Editar Datos</title>
    </head>
    <body>
        <%
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

        %>
        <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >


                    <form action="" method="post">

                        <table cellspacing="3" cellpadding="5" border="1">
                           
                             <font color="green"> <h4><b>Ingresa los datos a editar:</b></h4></font>
                            <tr>
                                <td align="right">ID:</td>
                                <td><input type="text" readonly="" value=<%=rs.getString(1)%>></td>

                            </tr>

                            <tr>
                                <td align="right">Nombres:</td>
                                <td><input type="text" name="nombre1" value=<%=rs.getString(2)%>></td>

                            </tr>

                            <tr>
                                <td align="right">Apellidos:</td>
                                <td><input type="text" name="apellido1" value=<%=rs.getString(3)%>></td>

                            </tr>


                            <tr>
                                <td align="right">Sexo:</td>
                                <td><input type="text" name="sexo1" value=<%=rs.getString(4)%>></td>

                            </tr>
                            <tr>
                                <td align="right">Promedio:</td>
                                <td><input type="text" name="promedio1" value=<%=rs.getString(5)%>></td>

                            </tr>

                            <tr>
                                <th>

                                    <input type="submit" value="Guardar" class="btn btn-primary btn-lg"/>

                                </th>
                            </tr>


                        </table>


                    </form>


                    <%}%>    


                </div>   
            </div> 
        </div>






    </body>
</html>
<%

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

%>
