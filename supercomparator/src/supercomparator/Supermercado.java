/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supercomparator;

/**
 *
 * @author Medac
 */
public class Supermercado {
    //Atributos
    String nombre;
    Producto [] lista;
    
    //Constructor
    public Supermercado(String nombre, Producto [] lista){
        this.nombre = nombre;
        this.lista = lista;
    }
    
    //Métodos

    public String getNombre() {
        return nombre;
    }

    public Producto[] getLista() {
        return lista;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLista(Producto[] lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Supermercado{" + "nombre=" + nombre + ", lista=" + lista + '}';
    }
    
    
}
