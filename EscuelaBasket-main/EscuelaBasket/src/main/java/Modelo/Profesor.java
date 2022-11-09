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
public class Profesor extends Trabajador{
    
    private String especializacion;

    public Profesor() {
    }

    public Profesor(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, Integer salario, String especializacion) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero, salario);
        this.especializacion = especializacion;
    }

    

  

    

    public void mostrarDatos(){
    
        System.out.println("Profesor(a);" + "nombre=" +getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" +getFechaNacimiento() + ", genero=" + getGenero() + ", salario="+ getSalario()+", especializacon="+especializacion);
    
    }

    @Override
    public int calcularEdad() {
        return super.calcularEdad(); //To change body of generated methods, choose Tools | Templates.
    }


    
    
}
