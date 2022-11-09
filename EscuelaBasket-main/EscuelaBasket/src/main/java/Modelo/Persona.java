/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Bayron Vargas
 */
import java.util.*;
public class Persona {
    
    private String nombre, apellido, id, direccion, telefono;
    private String fechaNacimiento ;
    private String genero;
    

    public Persona() {
        
        
        
    }

    public Persona(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

  
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public int calcularEdad(){
        
        Integer INTfechaNacimiento,aAct=2022;
         String ano = fechaNacimiento.substring(6, 10);
       
        INTfechaNacimiento=Integer.parseInt(ano);
       Integer edad =aAct-INTfechaNacimiento;
        
      //   Calendar ahora = Calendar.getInstance(); 
     // long edadEnDias = (ahora.getTimeInMillis() - fechaNacimiento.getTimeInMillis())
     //                   / 1000 / 60 / 60 / 24;

    //  int anos = Double.valueOf(edadEnDias / 365.25d).intValue();
    //  int dias = Double.valueOf(edadEnDias % 365.25d).intValue();

     return edad;
       
        
        
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", direccion=" + direccion + ", telefono=" + telefono + ", fechaNacimiento=" + fechaNacimiento + ", genero=" + genero + '}';
    }
    
    
}
