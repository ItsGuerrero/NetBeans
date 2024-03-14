/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package granja;

/**
 *
 * @author Medac
 */
public class Granja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perro = new Perro();
        
        perro.comer();
        perro.dormir();
        
        Gato gato = new Gato();
        
        gato.comer();
        gato.dormir();
        
        //Polimorfismo
        Animal [] array = {perro, gato}; 
    }
    
}
