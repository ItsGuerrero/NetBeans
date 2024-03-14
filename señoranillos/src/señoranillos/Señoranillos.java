/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package señoranillos;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Señoranillos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aragorn aragorn = new Aragorn();
        Legolas legolas = new Legolas();
        Gimli gimli = new Gimli();
        Orco orco = new Orco();
        Jugador[] jugadores = {aragorn, legolas, gimli};

        Carta[] mazo = new Carta[10];

        for (int i = 0; i < mazo.length; i++) {  //Rellenar mazo
            int ataque = (int) (Math.random() * 10);
            int vida = (int) (Math.random() * 10);
            mazo[i] = new Carta(ataque, vida);
        }

        do {
            for (int i = 0; i < jugadores.length; i++) {
                int random = (int) Math.random() * 10;
                jugadores[i].robarCarta(mazo[random]); //(mazo[random]) es una carta ("Carta carta en la clase jugador, metodo robarCarta")
                System.out.println(jugadores[i].getNombre());
                jugadores[i].verCartas();
                System.out.println("1. Usar Carta 2. Atacar 3. Comprobar estado");
                int resp = sc.nextInt();
                switch (resp) {
                    //Usar carta
                    case 1:
                        System.out.println("¿Que posicion quieres usar?");
                        int respuesta = sc.nextInt();
                        jugadores[i].usarCarta(respuesta);
                        break;

                    case 2:
                        orco.setVida(orco.getVida() - jugadores[i].getAtaque());
                        System.out.println(orco.toString());
                        System.out.println("Has hecho " + jugadores[i].getAtaque() + "puntos de daño");
                        break;
                    case 3:
                        System.out.println(jugadores[i].toString());
                }
                
            }
            //Orco
            int rand = (int) (Math.random() * 3);
            jugadores[rand].setVida(jugadores[rand].getVida() - orco.getAtaque());
        } while (jugadores[0].getVida() > 0 || jugadores[1].getVida() > 0 || jugadores[2].getVida() > 0 || orco.getVida() > 0);
    }

}
