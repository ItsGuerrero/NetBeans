/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package motel;

/**
 *
 * @author Medac
 */
public class Huesped {
    //Atributos
    private String nombre;
    private int numero_noches;
    private int Numero_habitacion;
    
    //Constructores
    
    Huesped(String nombre, int numero_noches, int i){
        this.nombre = nombre;
        this.numero_noches = numero_noches;
        this.Numero_habitacion = i;
    }
    
    //Métodos
    
    @Override
    public String toString(){
        return "La información de este huesped  es " + this.nombre + " y su n de noches es " + this.numero_noches + " y su numero de habitacion es " + this.Numero_habitacion;
    }
   
    public String getnombre(){
        return this.nombre;
    }
    
    public int getNumero_habitacion(){
        return this.Numero_habitacion;
    }
    
    public int getnnumero_noches(){
        return this.numero_noches;
    }
    
    public void calcularnoches(){
        int num = this.numero_noches * 50;
        System.out.println("El precio a pagar por "+ this.nombre + " es de " + num);
    }
    
    
   
    
    
    
    
    
}
