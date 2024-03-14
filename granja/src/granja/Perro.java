/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public class Perro extends Animal {

    public Perro (){
        super();
        nombre = "Perro";
    }
    
    
    @Override
    public void comer() {
        System.out.println("Estoy comiendo, soy un perro");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo, soy un perro");
    }
    
}
