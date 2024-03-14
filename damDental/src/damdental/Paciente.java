/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package damdental;

/**
 *
 * @author Medac
 */
public class Paciente {
    int id;
    String nombre;
    String apellido;
    int edad;
    
    public Paciente(int id, String nombre, String apellido, int edad){
        id = 1;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "ID: " + id + '\n' +  " NOMBRE Y APELLIDO: " + nombre + " " + apellido;
    }
    
}
