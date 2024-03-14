/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poo;

/**
 *
 * @author Medac
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    String dni;
    String email;
    
    //Constructores
    
    Persona(){
        System.out.println("Has creado una persona");
    } 
    
    Persona(String nombre, int edad, String dni, String email){
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.email = email;
    }
    
   
    
    //Metodos
    
    void saludar(){
        System.out.println(nombre + " te dice hola");
    }
    void correr(){
        System.out.println("Estoy corriendo");
    }
    int incrementar(int num){
       return edad = edad + num;
    }
    boolean mayorEdad(){
        boolean resp;
        if (edad < 18){
            resp = false;
        } else {
            resp = true;
        }
        return resp;
    } 
    
    void pintar(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("La edad es: " + edad);
        System.out.println("El DNI es: " + dni);
        System.out.println("El email es: " + email);
    }
}
