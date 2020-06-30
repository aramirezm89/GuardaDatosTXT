/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio;

/**
 *
 * @author Antonio
 */
public class Alumno {
   

   
      private String nombre;
      private String apellidos;
      private String sexo;

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
      private Double promedio;

         public Alumno(String nombre, String apellidos,String sexo,String promedio){
    
       this.nombre= nombre;
       this.apellidos = apellidos;
       this.sexo = sexo;
       this.promedio = Double.parseDouble(promedio);
       
      }
      
      
      
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
      
      
   
      
      
      
      
    
}
