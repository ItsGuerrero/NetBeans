/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damas;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Damas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] tablero = new char [5][5];
        int turnos = 0;
        int posx;
        int posy;
        rellenar (tablero);
       
        
        do {
            System.out.println("Juegan las Negras");
            mostrar(tablero);
            System.out.println("Elige la pieza que quieres mover");
            do {
                posx = sc.nextInt();
                posy = sc.nextInt();           
            } 
            while (tablero[posx][posy] != 'N');
            if((posx < 4) && (tablero[posx + 1] [posy] == '*')){
                tablero[posx + 1][posy] = tablero[posx][posy];
                tablero[posx][posy] = '*';
            } else if ((posy < 0) && (tablero[posx + 1] [posy] == 'B')){
                System.out.println("NO SE PUEDE MOVER");
            } else if((posy < 4) && (tablero[posx + 1] [posy - 1] == 'B')){
                tablero [posx + 1] [posy - 1] = tablero[posx] [posy];
                tablero [posx] [posy] = '*';
            } else if((posy < 4) && (tablero[posx + 1] [posy + 1] == 'B')){
                tablero [posx + 1] [posy + 1] = tablero[posx] [posy];
                tablero [posx] [posy] = '*';
            }
            System.out.println("Juegan las blancas");
            mostrar(tablero);
            System.out.println("Elige la pieza que quieres mover");
            do {
                posx = sc.nextInt();
                posy = sc.nextInt();           
            } 
            while (tablero[posx][posy] != 'B');
            if((posy > 0) && (tablero[posx - 1] [posy + 1] == 'N')){
                tablero [posx - 1] [posy + 1] = tablero[posx] [posy];
                tablero [posx] [posy] = '*';
                    
                    
            } else if ((posy > 4) && (tablero[posx - 1] [posy] == 'N')){
                System.out.println("NO SE PUEDE MOVER");
            } else if((posy >0) && (tablero[posx - 1] [posy - 1] == 'N')){
                tablero [posx - 1] [posy -1] = tablero[posx] [posy];
                tablero [posx] [posy] = '*';
            } else if ((posx >1) && (tablero[posx - 1] [posy] == '*')){
                tablero[posx - 1][posy] = tablero[posx][posy];
                tablero[posx][posy] = '*';
            }
            turnos++;
        }
        while (turnos <= 10);
    }//main

    private static void rellenar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[0][i] = 'N';
            tablero[4][i] = 'B';
            tablero[1][i] = '*';
            tablero[2][i] = '*';
            tablero[3][i] = '*';
        }
    }

    private static void mostrar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
    
}
