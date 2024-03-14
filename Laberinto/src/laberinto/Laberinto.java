/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laberinto;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Laberinto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char [][] tablero = new char [10][10];
        rellenar1(tablero);
        rellenar2(tablero);
        rellenar3(tablero);
        rellenar4(tablero);
        rellenar5(tablero);
        tablero[0][0]='o';
        mostrar(tablero);
        jugar(tablero);
        
    }

    private static void rellenar1(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], 'x');
        }
    }

    private static void mostrar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    private static void rellenar2(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            tablero[0][i]= ' ';
        }
    }

    private static void rellenar3(char[][] tablero) {
        for (int i = 0; i < 9; i++) {
            tablero[i][2]= ' ';
        }
    }

    private static void rellenar4(char[][] tablero) {
        for (int i = 3; i < 7; i++) {
            tablero[8][i]= ' ';
        }
    }

    private static void rellenar5(char[][] tablero) {
        for (int i = 6; i < tablero.length; i++) {
            tablero[9][i]= ' ';
        }
    }

    private static void jugar(char[][] tablero) {
        Scanner sc = new Scanner (System.in);
        int fallos = 0;
        boolean condicion;
        int posx, posy;
        int jugador;
        while(fallos < 3){
            System.out.println("Introduce la posicion a la que te quieres mover: 1.Derecha 2.Izquierda 3.arriba 4.Abajo");
            jugador = sc.nextInt();
            switch(jugador){
                case 1:
                    tablero [0][1] = 'o';
                    tablero[0][0] = ' ';
                    mostrar(tablero);
                    break;
                case 2:
                    tablero [0][2] = 'o';
                    tablero[0][1] = ' ';
                    mostrar(tablero);
                    break;
                case 3:
                    tablero [1][2] = 'o';
                    tablero[0][2] = ' ';
                    mostrar(tablero);
                    break;
                case 4:
                    tablero [2][2] = 'o';
                    tablero[1][2] = ' ';
                    mostrar(tablero);
                    break;
                default:
                    System.out.println("Numero incorrecto, intentalo de nuevo introduciendo un numero del 1 al 4");
                  
                
            }
        }
    }
    
}
