/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciocolecciones;

import java.util.HashSet;

/**
 *
 * @author Medac
 */
public class EjercicioColecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashSet <Persona> personas = new HashSet<>();
        personas.add(new Persona("pepe", "777", 18));
        personas.add(new Persona("alex", "111", 0));
        Persona p1 = new Persona("elena", "222", 4);
        personas.add(p1);
        System.out.println(personas);
        
        
    }
    
}
