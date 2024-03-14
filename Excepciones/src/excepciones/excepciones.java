/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package excepciones;

/**
 *
 * @author Medac
 */
public class excepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("DISCOTECA MEDAC, PEQUES NO, GRACIAS");
        
        Persona p1 = null;
        
        try{
            p1 = new Persona();
        }
        catch(EdadException e){
            System.out.println("Error edad");
        }
        catch(SaldoNegativoException e){
            System.out.println("Error saldo");
        }
    }
    
}
