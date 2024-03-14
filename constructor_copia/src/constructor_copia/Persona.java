/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constructor_copia;

/**
 *
 * @author Medac
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //Constructor copia
    public Persona(Persona persona){
        nombre = persona.nombre;
        edad = persona.edad;
        
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
