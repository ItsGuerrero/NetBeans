/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaescalera;

/**
 *
 * @author Medac
 */
public class Carta {
    String nombre;
    String palo;
    int numero;
    
    public Carta(int numero, String palo){
        this.numero = numero;
        this.palo = palo;
        if (numero == 8) {
            nombre = "Sota";
        }
        if (numero == 9) {
            nombre = "Caballo";
        }
        if (numero == 10) {
            nombre = "Rey";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getPalo() {
        return palo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        if (numero < 8) {
            return "(" + numero + ":" + palo + ")";
        } else{
            return "(" + nombre +  ":" + palo + ")";
        }
    }
    
    
}
