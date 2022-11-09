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
public class Trabajador extends Persona {
    
    private Integer salario;

    public Trabajador() {
    }

    public Trabajador(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Integer salario) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero);
        this.salario=salario;
    }

  

   

    public Integer getSalario() {
        return salario;
    }

    public void setSalario(Integer salario) {
        this.salario = salario;
    }
    public void mostrarDatos(){
    
        System.out.println("Trabajador(a){" + "nombre=" +getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" +getFechaNacimiento() + ", genero=" + getGenero() + ", salario="+ salario);
    
    }

  // @Override
 //  public String toString() {
       
    //   return "Trabajador{" + "nombre=" + getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" + getFechaNacimiento() + ", genero=" + getGenero() +  ", salario="+ salario+'}';
  // }

   

   
    
    
}
