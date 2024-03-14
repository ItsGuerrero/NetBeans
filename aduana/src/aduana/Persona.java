/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aduana;

/**
 *
 * @author Medac
 */
public class Persona {
      //Atributos
    private String nombre;
    private String dni;
    //Constructores
    public Persona(String nombre, String dni){
    this.nombre=nombre;
    this.dni=dni;
    }
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", dni=" + dni + '}';
    }
}

