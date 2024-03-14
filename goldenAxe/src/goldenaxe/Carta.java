/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public class Carta {
    protected String nombre;
    protected int vida;
    protected int fuerza;
    
    public Carta(String nombre, int vida, int fuerza){
        this.nombre = nombre;
        this.vida = vida;
        this.fuerza = fuerza;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    @Override
    public String toString() {
        return "Carta{" + "nombre=" + nombre + ", vida=" + vida + ", fuerza=" + fuerza + '}';
    }
    
    
}
