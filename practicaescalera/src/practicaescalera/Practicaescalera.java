/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaescalera;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Practicaescalera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Carta> cartas = new LinkedList<>();
        rellenar(cartas);
        System.out.println("CARTAS BARAJA");
        System.out.println("----------------------------------------");
        mostrar(cartas);
        System.out.println("----------------------------------------");
        Collections.shuffle(cartas);
        LinkedList<Carta> oro = new LinkedList<>();
        LinkedList<Carta> espada = new LinkedList<>();
        LinkedList<Carta> copas = new LinkedList<>();
        LinkedList<Carta> bastos = new LinkedList<>();
        

        do {
            cartas.getFirst();
            cartas.remove();
            if (cartas.get(0).getNumero() == 1) {
                String paloCartas = cartas.get(0).getPalo();
                switch(paloCartas){
                    case "oro":
                        oro.addFirst(cartas.get(0));
                        mostraroro(oro);
                        break;
                    case "espada":
                        espada.addFirst(cartas.get(0));
                        mostrarespada(espada);
                        break;
                    case "copas":
                        copas.addFirst(cartas.get(0));
                        mostrarcopas(copas);
                        break;
                    case "bastos":
                        bastos.addFirst(cartas.get(0));
                        mostrarbastos(bastos);
                        break;
                }
            } else{
                cartas.pollFirst();
            }
        } while (!cartas.isEmpty());
    }

    private static void rellenar(LinkedList<Carta> cartas) {
        for (int i = 1; i < 11; i++) {
            cartas.add(new Carta(i, "oro"));
            cartas.add(new Carta(i, "espada"));
            cartas.add(new Carta(i, "copas"));
            cartas.add(new Carta(i, "bastos"));

        }
    }

    private static void mostrar(LinkedList<Carta> cartas) {
        for (int i = 0; i < cartas.size(); i++) {
            System.out.println(cartas.get(i));
        }
    }

    private static void mostraroro(LinkedList<Carta> oro) {
        for (int i = 0; i < oro.size(); i++) {
            System.out.println("Cartas de oro:" + " [" + oro.get(i) + "]");
        }
    }

    private static void mostrarespada(LinkedList<Carta> espada) {
        for (int i = 0; i < espada.size(); i++) {
            System.out.println("Cartas de espada:" + " [" + espada.get(i) + "]");
        }
    }

    private static void mostrarcopas(LinkedList<Carta> copas) {
        for (int i = 0; i < copas.size(); i++) {
            System.out.println("Cartas de copas:" + " [" + copas.get(i) + "]");
        }
    }

    private static void mostrarbastos(LinkedList<Carta> bastos) {
        for (int i = 0; i < bastos.size(); i++) {
            System.out.println("Cartas de bastos:" + " [" + bastos.get(i) + "]");
        }
    }
}
