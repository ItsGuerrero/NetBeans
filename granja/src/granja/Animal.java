/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public abstract class Animal {
    int patas;
    String nombre;
    
    public Animal(){
        patas = 4;
        nombre = "no name";
    }
    
    public abstract void comer();
    public abstract void dormir();
    public void prueba(){
        System.out.println("Hola");
    }
}
