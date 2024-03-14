/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorDigital {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SintonizadorFM radio = new SintonizadorFM();
        
        radio.bajar();
        radio.bajar();
        radio.bajar();
        
        radio.mostrar();
    }
    
}
