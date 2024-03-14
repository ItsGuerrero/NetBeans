/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego_hotel;

/**
 *
 * @author Medac
 */
public class Jugador {
    //Atributos
    private String nombre;
    private int dinero;
    
    //Constructor
    public Jugador(){
        nombre = "Donald Dam";
        dinero = 25000000;
    }
    
    //Metodos

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    @Override
    public String toString() {
        return "Jugador{" + "dinero=" + dinero + '}';
    }
    
    
}
