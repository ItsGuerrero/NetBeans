/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Leia extends DarthVader {
    int habilidad_diplomacia;
     public Leia(){
         super();
         lado_oscuro = false;
         habilidad_diplomacia = 5;
         habilidad_espadalaser = 1;
         habilidad_pilotar = 3;
     }
     
     @Override
     public void hablar(){
         System.out.println("Hola, soy tu hija");
         
     }
     
     public final void volar_espacio(){
            System.out.println("La mayor cagada de la saga");
     }
}

