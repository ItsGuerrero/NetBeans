/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Medac
 */
public class Articulo {
    private String nombre;
    private int unidad;
    
    public Articulo(String nombre, int unidad){
        this.nombre = nombre;
        this.unidad = unidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getUnidad() {
        return unidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setUnidad(int unidad) {
        this.unidad = unidad;
    }

    @Override
    public String toString() {
        return "Articulo{" + "nombre=" + nombre + ", unidad=" + unidad + '}';
    }
    
}
