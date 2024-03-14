/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Persona {
    Scanner sc = new Scanner(System.in);
    int edad;
    String nombre;
    Double dinero;
    Double saldo;
    
    Persona() throws EdadException, SaldoNegativoException {
       edad = sc.nextInt();
       dinero = sc.nextDouble();
    }
    
    public void sacarDinero(double dinero) throws SaldoNegativoException{
        if(saldo < dinero){
            throw new SaldoNegativoException();
        }
    }
    
    public void meterDinero(double dinero){
        
    }
}
