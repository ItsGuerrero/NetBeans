/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package señoranillos;

/**
 *
 * @author Medac
 */
public class Orco {
    int vida;
    int ataque;
    
    public Orco(){
        vida = 40;
        ataque = 2;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    @Override
    public String toString() {
        return "Orco{" + "vida=" + vida + ", ataque=" + ataque + '}';
    }
    
    
}
