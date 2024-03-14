/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioobjetos;

/**
 *
 * @author Medac
 */
public class EjercicioObjetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona1 = new Persona("Javi", 19, "7777F", "jkgdhjh@gmail.com");
        CuentaCorriente cuenta = new CuentaCorriente(persona1, 3000, 50.0);
        
        cuenta.mostrar();
        
    }
    
}
