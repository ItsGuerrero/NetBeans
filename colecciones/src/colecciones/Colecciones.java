/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colecciones;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Collections;

/**
 *
 * @author Medac
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lista de numeros

//       ArrayList <Integer> numeros = new ArrayList <>();
//        System.out.println(numeros.size());
//        numeros.add(5);
//        numeros.add(3);
//        numeros.add(8);
//        System.out.println(numeros);
//        System.out.println(numeros.size());
//        numeros.add(1,4);
//        System.out.println(numeros);
//        System.out.println(numeros.get(0));
//        for (int i = 0; i < numeros.size(); i++) {
//            System.out.println(numeros.get(i));
//            
//            System.out.println("----------------------");
//            
//            ArrayList <String> nombres = new ArrayList <>();
//            nombres.add("Messi");
//            nombres.add("Ronaldinho");
//            nombres.add("Henry");
//            nombres.remove(1);
//            System.out.println(nombres);
//            
//            for (String str: nombres) {
//                System.out.println(str);
//            }
//        }
//         LinkedList <String> arraylink = new LinkedList<>();
//         arraylink.add("pepe");
//         arraylink.add("Juan");
//         arraylink.add(1, "Elena");
//         arraylink.remove(0);
//         arraylink.addFirst("Antonio");
//         System.out.println(arraylink);
//        ArrayList<Persona> personas = new ArrayList<>();
//        personas.add(new Persona("Juan", 18));
//        personas.add(new Persona("Pepe", 20));
//        personas.add(new Persona());
//        personas.add(new Persona("Elena", 25));
//
//        for (Persona p : personas) {
//            if (p.getNombre() == null) {
//                p.setNombre("Emilio");
//                p.setEdad(24);
//            }
//        }
//
//        System.out.println(personas);

        ArrayList <Integer> numeros = new ArrayList <>();
        numeros.add(7);
        numeros.add(2);
        numeros.add(3);
        
        System.out.println(numeros);
        
        //Ordenar
        
        Collections.sort(numeros);
        System.out.println(numeros);
        
        //Desordenar
        
        Collections.shuffle(numeros);
        System.out.println(numeros);
    }

}
