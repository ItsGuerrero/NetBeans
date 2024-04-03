/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juegouno;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class JuegoUno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList <Carta> cartas = new LinkedList<>();
        rellenar(cartas);
        Collections.shuffle(cartas);
        LinkedList <Carta> jugador1 = new LinkedList<>(); 
        LinkedList <Carta> jugador2 = new LinkedList<>();
        
        for (int i = 0; i < 7; i++) {
            jugador1.add(cartas.pollFirst());
            jugador2.add(cartas.pollFirst());
        }
        
        LinkedList <Carta> mesa = new LinkedList<>();
        mesa.add(cartas.pollFirst());
        System.out.println("M E S A");
        System.out.println(" ");
        System.out.println(mesa);
        System.out.println(" ");
        System.out.println("-------------------------------------");
        
        do {
            //Jugador1
            mostrar(jugador1);
            System.out.println("1. Robar carta 2. Jugar carta");
            int resp = sc.nextInt();
            switch(resp){
                case 1:
                    jugador1.add(cartas.pollFirst());
                    break;
                case 2:
                    System.out.println(jugador1);
                    System.out.println("Que carta quieres jugar");
                    resp = sc.nextInt();
                    if (jugador1.get(resp).getColor().equals(mesa.getLast().getColor()) || jugador1.get(resp).getNumero() == mesa.getLast().getNumero()) {
                        mesa.add(jugador1.get(resp));
                        jugador1.remove(resp);
                    } else{
                        jugador1.add(cartas.pollFirst());
                    }
            }
        } while (!jugador1.isEmpty() && !jugador2.isEmpty());
    }

    private static void rellenar(LinkedList<Carta> cartas) {
        for (int i = 0; i < 10; i++) {
            cartas.add(new Carta("rojo", i));
            cartas.add(new Carta("amarillo", i));
            cartas.add(new Carta("verde", i));
            cartas.add(new Carta("azul", i));
        }
    }

    private static void mostrar(LinkedList<Carta> jugador1) {
        for (int i = 0; i < jugador1.size(); i++) {
            System.out.println(i + "." + jugador1.get(i));
        }
    }
    
}
