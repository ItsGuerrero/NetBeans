/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carreratortugas;

import java.util.Scanner;

/**
 *
 * @author jguer
 */
public class Carreratortugas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] tablero = new char[5][5];
        int posx, posy;

        rellenar(tablero);

        do {
            System.out.println("Que tortuga quieres que se mueva?");
            mostrar(tablero);

            int seleccionadaX, seleccionadaY;

            do {
                System.out.println("Ingrese la fila de la tortuga que desea mover:");
                seleccionadaX = sc.nextInt();
                System.out.println("Ingrese la columna de la tortuga que desea mover:");
                seleccionadaY = sc.nextInt();
            } while (tablero[seleccionadaX][seleccionadaY] != 'T');

            posx = seleccionadaX;
            posy = seleccionadaY;

            if (posx < 4) {
                tablero[posx + 1][posy] = tablero[posx][posy];
                tablero[posx][posy] = '*';
            }

        } while (posx < 4);

        
    }

    private static void rellenar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[0][i] = 'T';
            tablero[1][i] = '*';
            tablero[2][i] = '*';
            tablero[3][i] = '*';
            tablero[4][i] = '*';
        }
    }

    private static void mostrar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");
    }
}