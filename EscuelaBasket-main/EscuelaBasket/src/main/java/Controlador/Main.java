/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Bayron Vargas
 */

import Modelo.*;

public class Main {
    
    public static void main(String[] args) {
       // Persona p = new Persona();
      //  p.getFechaNacimiento = new GregorianCalendar(2000,01,01);
      
        
     // Calendar fechaNacimiento1=new GregorianCalendar(2003,9,26);
     
        Persona p = new Persona("bayron","vargas","1005029200","av1","322","06/01/2001","Hombre");
        
       System.out.println(""+p.toString());
       System.out.println(""+p.calcularEdad());
       
       
         
        
      Auxiliar ax = new Auxiliar("nataly","vargas","1004029200","av1","322","15/06/1997","Mujer",2000000);
        
       ax.mostrarDatos();
       System.out.println("Edad: "+ ax.calcularEdad());
       ax.validarCondiciones();
       
       
       
       Auxiliar ax1 = new Auxiliar("nataly","vargas","1004029200","av1","322","15/06/2000","Mujer",2000000);
        
       ax1.mostrarDatos();
       System.out.println("Edad: "+ ax1.calcularEdad());
       ax1.validarCondiciones();
      
      
      Trabajador t = new Trabajador ("nataly","vargas","1004029200","av1","322","15/06/2003","Mujer",2000000);
        
   
       t.mostrarDatos();
       System.out.println("Edad: "+ t.calcularEdad());
      
       
       
      Profesor pr = new Profesor("sandra","gomez","1003029200","av1","322","15/06/1993","Mujer",2500000,"Matematica Aplicada");
       pr.mostrarDatos();
      System.out.println("Edad: "+ pr.calcularEdad());
       
       Seguro s = new Seguro("10050","NuevaEps.SAS","gran colombia","579","Nueva EPS");
       Estudiante e = new Estudiante("bayron","vargas","1005029200","av1","322","06/01/2014","Hombre",s); 
       
      e.mostrarDatos();
      System.out.println("Edad: "+e.calcularEdad()); 
       e.categoria();
       
      Partido pa = new Partido("3-0","camilo","panteras",14000); 
      Campeonato c = new Campeonato(1,"25/09/2022","1:40 pm","10 pm","Ufps",pa);
      
        System.out.println(""+c.toString());
       
       
               
       
       
       
       
       
    }
    
}
