/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juegouno;

/**
 *
 * @author Medac
 */
public class Carta implements Comparable<Carta> {
    String color;
    int numero;
    
    public Carta(String color, int numero){
        this.numero = numero;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public int getNumero() {
        return numero;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Carta{" + "color=" + color + ", numero=" + numero + '}';
    }

    @Override
    public int compareTo(Carta c) {
       return(numero - c.numero);
    }
    
    
}
