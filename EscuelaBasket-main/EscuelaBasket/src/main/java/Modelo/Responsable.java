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
public class Responsable extends Persona{
    
    private String email;

    public Responsable() {
    }

    public Responsable(String nombre, String apellido, String id, String direccion, String telefono, String fechaNacimiento, String genero, String email) {
        super(nombre, apellido, id, direccion, telefono, fechaNacimiento, genero);
        this.email=email;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void mostrarDatos(){
    
        System.out.println("Padre Responsable;" + "nombre=" +getNombre() + ", apellido=" + getApellido() + ", id=" + getId() + ", direccion=" + getDireccion() + ", telefono=" + getTelefono() + ", fechaNacimiento=" +getFechaNacimiento() + ", genero=" + getGenero() + ", email="+ email);
    
    }
    
}
