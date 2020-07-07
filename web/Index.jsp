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
        <link rel="stylesheet" href="css/estilos.css"/>
        <link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Captura de Datos</title>
    </head>

    <body >


        <div class="card-panel z-depth-5" > 

            <header>
                <div class="container">
                    <h1>Ingrese los datos del alumno</h1>
                </div>
            </header>

            <div class="row">

                <form action="recibeDatos" method="post" class="col s6">
                    <div class="row">

                        <div class="input-field col s8" >
                            <i class="material-icons prefix">mode_edit</i>
                            <label class="active" for="nombre" > <font color="green"><b>Nombre:</b></font></label>
                            <input type="text" name="nombre" required="required" placeholder="Ingrese sus nombres" class="validate">

                        </div>

                        <div class="input-field col s8">
                            <i class="material-icons prefix">mode_edit</i>
                            <input type="text" name="apellidos" required="required" placeholder="Ingrese sus apellidos"class="validate">
                            <label class="active" for="apellidos"> <font color="green"><b>Apellido alumno:</b></font></label>

                        </div>



                        

                        <div class="input-field col s8" >
                            <label class="active" for="sexo"> <font color="green"><b>Sexo alumno:</b></font>

                                <label>
                                    <input type="radio" name="sexo"
                                           value="Hombre" checked><span>Hombre</span>
                                </label>
                                <label>
                                    <input type="radio" name="sexo"
                                           value="Mujer" ><span>Mujer</span> <br>
                                </label>
                            </label>
                            <br>
                        </div>
                        
                        
                        

                        <div class="input-field col s6" >
                            <i class="material-icons prefix">mode_edit</i>
                            <label class="active" for="promedio"> <font color="green"><b>Promedio alumno:</b></font></label>
                            <input type="tel" name="promedio"  maxlength="3" required="required" placeholder="Ingrese Numeros"class="validate">
                        </div>
                        <div class="input-field col s6" >

                            <input type="reset" value="Borrar"class="waves-effect waves-light btn">
                            <input type="submit" value="Enviar" name="g" class="waves-effect waves-light btn">
                            <a href="MostrarDatos.jsp" class="waves-effect waves-light btn"> Base de Datos</a>
                        </div>

                    </div>  

                </form>
            </div>
        </div>  
  





</body>
</html>