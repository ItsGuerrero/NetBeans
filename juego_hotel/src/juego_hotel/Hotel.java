/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_hotel;

/**
 *
 * @author Medac
 */
public abstract class Hotel {
    //Atributos
    protected String nombre;
    protected int precio;
    protected boolean estado;
    //Constructor
    public Hotel(){
        nombre = null;
        precio = 0;
        estado = false;
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public abstract void prueba();

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    @Override
    public String toString() {
        return "Hotel{" + "nombre=" + nombre + ", precio=" + precio + ", estado=" + estado + '}';
    }

    
    
    
}
