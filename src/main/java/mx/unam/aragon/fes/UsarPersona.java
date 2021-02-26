/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.unam.aragon.fes;

/**
 *
 * @author ryzen 5
 */
public class UsarPersona {
    public static void main(String[] args) {
        System.out.println("Programa usar persona");
        
        int edad = 0;
        // edad = 1 en python 
        
        Persona per1=new Persona(); // Llamada al constructor
        Persona per2=new Persona();
        
        System.out.println(per1.getNombre());
        
        per2.setNombre("Joshua");
        System.out.println(per2.getNombre());
        
        System.out.println(per2.toString());
        per2.setEdad(19);
        System.out.println(per2.toString());
        
    }
}
