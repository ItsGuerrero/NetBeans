/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public class Gato extends Animal {
    
    public Gato(){
        super();
        nombre = "Gato";
    }

    @Override
    public void comer() {
        System.out.println("Estoy comiendo, soy un gato");
    }

    @Override
    public void dormir() {
        System.out.println("Estoy durmiendo, soy un gato");
    }
    
}
