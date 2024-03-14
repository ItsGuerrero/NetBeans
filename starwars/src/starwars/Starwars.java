/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class Starwars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DarthVader dv = new DarthVader ();
        Luke luke = new Luke();
        Leia leia = new Leia();
        Kyloren ky = new Kyloren();
        
        
        luke.hablar();
        dv.hablar();
        leia.volar_espacio();
        ky.hablar();
    }
    
}
