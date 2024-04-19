
import java.util.HashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Jugador {
    String nombre;
    HashMap<Integer, Integer> puntuacion = new HashMap<>();
    
    public Jugador(String nombre){
        this.nombre = nombre;
        for (int i = 15; i < 21; i++) {
            puntuacion.put(i,0);
        }
        puntuacion.put(25, 0);
    }

    public String getNombre() {
        return nombre;
    }

    public HashMap<Integer, Integer> getPuntuacion() {
        return puntuacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuntuacion(HashMap<Integer, Integer> puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", puntuacion=" + puntuacion + '}';
    }
    
    
}
