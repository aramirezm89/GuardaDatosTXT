<%-- 
    Document   : EliminarDatos
    Created on : 30-06-2020, 13:40:00
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
        <title>Eliminar Datos</title>
    </head>
    <body>
       
        
          <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >
        
         <form action="" method="post">
      
                    <table cellspacing="3" cellpadding="5" border="1">
                         <tr>
                            <td align="right">Ingrese la ID del alumno que quiere eliminar:</td>
                            <td><input type="text" name="id" placeholder="Ingrese ID"></td>

                        </tr>

                       
                    </table>
               <input type="submit" value="Eliminar" class="btn btn-primary btn-lg"/>
         </form>
               
                </div> 
                 </div> 
               </div> 
                    
                    
    </body>
     
              
</html>
 <% PreparedStatement ps;
           ResultSet rs;
          Connection cnn;
          String id=request.getParameter("id"); 
          
          try {         
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           cnn=DriverManager.getConnection("jdbc:sqlserver://localhost:1433;DatabaseName=JAVA_1", "sa", "123");
        
           if (id!=null) {
                   
               
           ps = cnn.prepareStatement("DELETE FROM JAVA_1_Alumno WHERE id=?");
           ps.setInt(1, Integer.parseInt(id));
           ps.executeUpdate();
          response.sendRedirect("MostrarDatos.jsp");
           }
          } catch (Exception e) {
                                  
              e.printStackTrace();
}                  
         %>