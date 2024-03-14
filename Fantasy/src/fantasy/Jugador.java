/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fantasy;

/**
 *
 * @author Medac
 */
public class Jugador {
    //Atributos
    private String nombre;
    private String posicion;
    private int precio;
    
    
    //Constructores
    
    public Jugador(String nombre, String posicion, int precio){
        this.nombre = nombre;
        this.posicion = posicion;
        this.precio = precio;
    }
    
    //Metodos

    public String getNombre() {
        return nombre;
    }

    public String getPosicion() {
        return posicion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", posicion=" + posicion + ", precio=" + precio + '}';
    }
    
    
    }
        
    
    
    

