/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class Jugador {
    //Atributos
    private String nombre;
    private int vida;
    //Constructores
    public Jugador(){
       
    }
    
    public Jugador(String nombre){
        this.nombre = nombre;
        vida = 5;
    }
    //Métodos
    public String getNombre(){
        return nombre;
    }
    public int getVida(){
        return vida;
    }
    public void luchar(Jugador jugador){
        int v = jugador.getVida();
        jugador.setVida(v - 1);
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    @Override
    public String toString() {
        return nombre + ", vidas restantes: " + vida;
    }
}
