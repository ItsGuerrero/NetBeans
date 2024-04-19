/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author jguer
 */
public class Persona {
    String nombre;
    int porcentaje;
    
    public Persona(String nombre){
        this.nombre = nombre;
        this.porcentaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPorcentaje() {
        return porcentaje;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPorcentaje(int porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", porcentaje=" + porcentaje + '}';
    }
    
}
