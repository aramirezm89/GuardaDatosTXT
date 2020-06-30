<%-- 
    Document   : Index
    Created on : 27-06-2020, 15:27:28
    Author     : Antonio
--%>
<%@page contentType="text/html" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Captura de Datos</title>
    </head>
    <body>
       
         <div class="row">
            <div class="col s6 offset-s3" >
                <div class="card-panel z-depth-5" >
        
     
     
        
        <form action="paginaDestino.jsp" method="post">
            <table cellspacing="3" cellpadding="5" border="1">
                <font color="green"> <h4><b>Introduce la informacon del alumno:</b></h4></font>
                <tr>
                    <td align="right"> <font color="green"><b>Nombre alumno:</b></font></td>
                    <td><input type="text" name="nombre" placeholder="Ingrese sus nombres"></td>
                </tr>
                
                <tr>
                    <td align="right"> <font color="green"><b>Apellidos alumno:</b></font></td>
                   <td><input type="text" name="apellidos" placeholder="Ingrese sus apellidos"></td>
                </tr>
                
                <tr>  
                    
                       <td align="right"> <font color="green"><b>Sexo alumno:</b></font></td>
                    
                    
                    <td>
                            <label>
                            <input type="radio" name="sexo"
                                   value="Hombre" checked><span>Hombre</span>
                            </label>
                            
                            <label>
                            <input type="radio" name="sexo"
                                   value="Mujer" ><span>Mujer</span> <br>
                             </label>
                      </td>                 
                </tr>  
                  <tr>
                 <td align="right"> <font color="green"><b>Promedio alumno:</b></font></td>
                   <td><input type="tel" name="promedio"  maxlength="3" placeholder="Ingrese Numeros"></td>
                </tr>
                
 
                
            </table>
            
                <input type="reset" value="Borrar"class="waves-effect waves-light btn">
                <input type="submit" value="Enviar" name="g" class="waves-effect waves-light btn">
               
        </form>
                 <a href="MostrarDatos.jsp" class="waves-effect waves-light btn"> Base de Datos</a>
                
                
                </div>
                </div>
             </div>
    </body>
</html>