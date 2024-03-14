/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package constructor_copia;

/**
 *
 * @author Medac
 */
public class Constructor_copia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1 = new Persona ("Antonio", 17);
        Persona p2 = new Persona (p1);
        p1.setNombre("Pepe");
        
        System.out.println(p2.getNombre());
        
    }
    
}
