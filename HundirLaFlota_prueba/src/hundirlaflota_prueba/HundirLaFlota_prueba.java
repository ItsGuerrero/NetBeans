/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hundirlaflota_prueba;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class HundirLaFlota_prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] tablero = new char [10] [10];
        boolean salir;
        do{
        rellenar(tablero);
        //mostrar(tablero);
        insertarBarco(tablero, 5, 'A');
        insertarBarco(tablero, 3, 'B');
        insertarBarco(tablero, 1, 'C');
        //mostrar(tablero);
        char [][] tablero_copia = new char[10][10];
        rellenar(tablero_copia);
        jugar(tablero, tablero_copia);
        System.out.println("Quieres salir del juego?");
        salir=sc.nextBoolean();
        }while(!salir);
    }

    public static void rellenar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], 'x');
        }
    }

    public static void mostrar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            System.out.println(Arrays.toString(tablero[i]));
        }
    }

    public static void insertarBarco(char[][] tablero, int tam, char letra) {
        int posx, posy;
        boolean condicion;
        do {
            condicion = false;
            posx = (int)(Math.random() * 10);
            posy = (int)(Math.random() * 10);
            //No sale del tablero
            if (posy + tam < 10){
                condicion=(true);
            //No haya barco
                for (int i = 0; i < tam; i++) {
                    if (tablero[posx][posy + i] != 'x'){
                        condicion = false;
                    }
                }
                if(condicion){
                    for (int i = 0; i < tam; i++) {
                        tablero[posx][posy + i] = letra;
                    }
                }
            }
        } while (!condicion);
    }

    private static void jugar(char[][] tablero, char[][] tablero_copia) {
        Scanner sc = new Scanner(System.in);
        int fallos = 0;
        char letra;
        int contA=5, contB=3, contC=1;
        int cordx, cordy;
        boolean salir = true;
 
            mostrar(tablero_copia);
            fallos=0;
         while ((fallos < 5) && !(contA == 1 & contB == 1 & contC == 1)){
        System.out.println("Introduce la posicion de la fila");
        cordx = sc.nextInt();
        System.out.println("Introduce la posicion de la columna");
        cordy = sc.nextInt();
        letra = tablero[cordx][cordy];
        switch(letra){
            case 'A': 
                contA--;
                if (contA == 1){
                    System.out.println("TOCADO Y HUNDIDO");
                } else {
                    System.out.println("TOCADO!");
                }
                tablero[cordx][cordy] = 'x';
                tablero_copia [cordx] [cordy] = 'A';
                break;
            case 'B':
                contB--;
                if (contB == 1){
                    System.out.println("TOCADO Y HUNDIDO");
                } else {
                    System.out.println("TOCADO!");
                }
                tablero[cordx][cordy] = 'x';
                tablero_copia [cordx] [cordy] = 'B';
                break;
            case 'C':
                contC--;
                if (contC == 1){
                    System.out.println("TOCADO Y HUNDIDO");
                } else {
                    System.out.println("TOCADO!");
                }
                tablero[cordx][cordy] = 'x';
                tablero_copia [cordx] [cordy] = 'B';
                break;
            default:
                System.out.println("AGUA");
                fallos++;
                break;
        } 
       mostrar (tablero_copia);
     
        }
    }
}
