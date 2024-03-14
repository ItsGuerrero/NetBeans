/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package goldenaxe;

/**
 *
 * @author Medac
 */
public abstract class Jugador {
    //Atributos
    protected int vida;
    protected int fuerza;
    protected boolean estaVivo;
    protected String nombre;
    protected Carta [] carta;
    
    //Consructor
    public Jugador(){
        Carta carta1 = new Carta("Tienes 1 pto de vida", 1, 0);
        Carta carta2 = new Carta("Te quitan 1 pto de vida", -1, 0);
        Carta carta3 = new Carta("Obtienes 1 pto de fuerza", 0, 1);
        Carta carta4 = new Carta("Te quitan 1 pto de fuerza", 0, -1);
        Carta carta5 = new Carta("Obtienes 2 ptos de vida", 2, 0);
        
        Carta [] array = {carta1, carta2, carta3, carta4, carta5};
    }
    
    //Metodos

    public int getVida() {
        return vida;
    }

    public int getFuerza() {
        return fuerza;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public String getNombre() {
        return nombre;
    }

    public Carta[] getCarta() {
        return carta;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCarta(Carta[] carta) {
        this.carta = carta;
    }

    @Override
    public String toString() {
        return "Jugador{" + "vida=" + vida + ", fuerza=" + fuerza + ", estaVivo=" + estaVivo + ", nombre=" + nombre + ", carta=" + carta + '}';
    }
    
}
