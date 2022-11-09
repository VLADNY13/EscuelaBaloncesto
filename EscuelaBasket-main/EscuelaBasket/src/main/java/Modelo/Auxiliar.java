/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Calendar;

/**
 *
 * @author Bayron Vargas
 */
public class Auxiliar extends Trabajador{

    public Auxiliar() {
    }

    public Auxiliar(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Integer salario) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero, salario);
    }

   

  

    @Override
    public int calcularEdad() {
        return super.calcularEdad(); //To change body of generated methods, choose Tools | Templates.
    }



    
    
    
    public void mostrarDatos(){
    
        System.out.println("Auxiliar;" + "nombre=" +getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" +getFechaNacimiento() + ", genero=" + getGenero() + ", salario="+ getSalario());
    
    }
    
   // @Override
  //  public String toString() {
    //    Persona p = new Persona();
      //Trabajador t = new Trabajador();
   //      return "Auxiliar{" + "nombre=" +getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getApellido() + ", telefono=" + getTelefono() + ", fechaNacimiento=" +getFechaNacimiento() + ", genero=" + getGenero() + ", salario="+ getSalario()+ '}';
   // }

    public void validarCondiciones(){
    
   if(calcularEdad() >= 25 && getGenero().equals("Mujer") ){
       System.out.println("Promovida a Administradora");
   }
   else{
       System.out.println("Sigue como Auxiliar");
   }
    
    }
    
    
}
