/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colecciones;

/**
 *
 * @author Medac
 */
public class Persona implements Comparable <Persona> {
    String nombre;
    int edad;
    
    Persona(){
        
    }
    
    Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
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

    @Override
    public String toString() {
        return "nombre= " + nombre  +  " edad= " + edad;
    }

    @Override
    public int compareTo(Persona p) {
        return(edad - p.edad);
    }
    
}
