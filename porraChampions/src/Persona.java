/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Persona {
    String nombre;
    String resultado;
   
    public Persona(String nombre, String resultado){
        this.nombre = nombre;
        this.resultado = resultado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getResultado() {
        return resultado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", resultado=" + resultado + '}';
    }
    
    
}
