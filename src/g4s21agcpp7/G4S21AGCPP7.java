/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package g4s21agcpp7;

import Informacion.Datos;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexg
 */
public class G4S21AGCPP7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         List<Datos> listadatos = new ArrayList<Datos>();
        Datos objdatos = new Datos("Alejandro Castillo",19,"alexgabo.c.p@outlook.com");
        listadatos.add(objdatos);
        objdatos = new Datos();
        objdatos.setNombre("Armando Sanchez");
        objdatos.setEdad(34);
        objdatos.setCorreo("armando@gmail.com");
        listadatos.add(objdatos);
        objdatos = new Datos("Wendy Sanchez",22,"wendy@gmail.com");
        listadatos.add(objdatos);
        
        for(Datos datos: listadatos){
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        }
        
        System.out.println("-------------------------------------------");
        System.out.println("usando forEach");
        System.out.println("-------------------------------------------");
        
        listadatos.forEach(datos->{
            System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        });
        
        System.out.println("-------------------------------------------");
        System.out.println("usando stream forEach");
        System.out.println("-------------------------------------------");
        
        listadatos.stream().forEach(datos->{
        System.out.println("nombre " + datos.getNombre());
            System.out.println("edad " + datos.getEdad());
            System.out.println("correo " + datos.getCorreo());
            System.out.println("");
        });
    }
    
    }
    

