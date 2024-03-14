/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaexamen;

/**
 *
 * @author Medac
 */
public class Articulo {
    String nombre;
    int precio;
    int cantidad;
    
    public Articulo(String nombre, int precio, int cantidad){
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        
        
    }

    @Override
    public String toString() {
        return "nombre: " + nombre + '\n'+ "precio:" + precio + '\n' + "cantidad:" + cantidad + '\n';
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
}
