/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package goldenaxe;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class GoldenAxe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Cuantos jugadores sois");
        int players = sc.nextInt();
        int turnos = 8;
        int vidaCthulhu = 20 + players * 2;
        Cthulhu cthulhu = new Cthulhu(vidaCthulhu);
        Jugador jugadores[] = new Jugador[players];
        for (int i = 0; i < players; i++) {
            System.out.println("Seleccionar jugador: 1. enano, 2. guerrero, 3. amazona");
            int nombre = sc.nextInt();
            switch(nombre){
                case 1:
                    Enano enano = new Enano();
                    jugadores[i] = enano;
                    break;
                case 2:
                    jugadores[i] = new Guerrero();
                    break;
                case 3:
                    jugadores [i] = new Amazona();
                    break;
            }
        }
        
    }
    
}
