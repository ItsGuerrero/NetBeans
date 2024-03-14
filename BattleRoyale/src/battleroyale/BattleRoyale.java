/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package battleroyale;

/**
 *
 * @author Medac
 */
public class BattleRoyale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugador1 = new Jugador("Messi");
        Jugador jugador2 = new Jugador("Cristiano");
        
        do{
            int a = (int)(Math.random() * 2);
            if(a == 0){ //Jugador 1 le pega a Jugador 2
                jugador1.luchar(jugador2);
            } else { //Jugador 2 le pega a Jugador 1
                jugador2.luchar(jugador1);
            }
            System.out.println("La vida del jugador 1 es: " + jugador1.getVida() + " La vida del jugador 2 es: " + jugador2.getVida());
        } while (jugador1.getVida() > 0 && jugador2.getVida() > 0);
        
        if(jugador1.getVida() == 0){
            System.out.println("Ha ganado: " + jugador2.toString());
            System.out.println("Ha perdido: " + jugador1.toString());
        } else {
            System.out.println("Ha ganado: " + jugador1.toString());
            System.out.println("Ha perdido: " + jugador2.toString());
        }
        
        
    } 
    
}
