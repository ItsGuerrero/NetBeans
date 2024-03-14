/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioobjetos;



/**
 *
 * @author Medac
 */
public class CuentaCorriente {
    //Atributos
    double saldo;
    double limite;
    Persona persona;
    
    //Constructores
    /*CuentaCorriente(String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
        saldo = 0.0;
        limite = -50.0;
    }*/
    
    /*CuentaCorriente(double saldo){
        this.saldo = saldo;
        limite = -50.0;
        nombre = "NoName";
        dni = "NoDni";
    } */
    
    public CuentaCorriente(Persona persona, double saldo, double limite){
        this.persona = persona;
        this.saldo = saldo;
        this.limite = limite;
    }
    //Metodos
    void ingresar(double ingreso){
        saldo = saldo + ingreso;
    }
    
    void SacarDinero(double Sacado){
        if(saldo - Sacado < limite){
            System.out.println("No se puede");
        } else {
            System.out.println("Saldo sacado");
        }
    }
    
    void mostrar(){
        System.out.println("Tu nombre es: " + persona.nombre);
        System.out.println("Tu dni es: " + persona.dni);
        System.out.println("Tu email es: " + persona.email);
        System.out.println("Tu saldo es: " + saldo);
        System.out.println("Tu limite es: " + limite);
    }
}
