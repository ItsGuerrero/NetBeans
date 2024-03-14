/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicarecuperacion;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class PracticaRecuperacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        char [][] tablero = new char [8][8];
        boolean salir = true;
        
        rellenar(tablero);
        rellenar1(tablero);
        rellenar2(tablero);
        rellenar3(tablero);
        rellenar4(tablero);
        int posx, posy;
        
        System.out.println("BIENVENIDO AL MANUAL DE AJEDREZ");
        
        do {
            int random;
            int randomRey;
            int randomTorre;
            random = (int) (Math.random() * 7);
            randomRey = (int) (Math.random() * 3);
            randomTorre = (int) (Math.random() * 2);
            
            //Empieza el movimiento de las negras
            System.out.println("Juegan las negras");
            mostrar(tablero);
      
            
            do{
           System.out.println("Introduce la coordenada de la figura que quieres mover (fila y col)");  
            posx = sc.nextInt();
            posy = sc.nextInt();
            } while(((posx > 7)||(posy>7)) || tablero[posx][posy] == '_'); //Contempla que no pongas una posicion fuera del tablero ni una posicion vacia
            
            switch(tablero[posx][posy]){
                //Movimiento del peon negro
                case 'P':
                    
                    tablero[posx + 1] [posy] = tablero[posx][posy];
                    tablero[posx][posy] = '_';
                    break;
                //Movimiento de la torre negra    
                case 'T':
                    switch(randomTorre){ /*Según el numero random que haya salido entre 0 y 1, la torre hara 
                                        un movimiento de casillas aleatorio de sus 2 posibles(Vertical u Horizontal)*/
                        case 0:
                            tablero[posx + (random)][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                        case 1:
                            tablero[posx][posy + (random)] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                    }                   
                //Movimiento del caballo negro
                case 'C':
                    
                    tablero[posx + 2][posy + 1] = tablero[posx][posy];
                    tablero[posx][posy] = '_';
                    break;
                //Movimiento del afil negro
                case 'A':
                    
                    tablero[posx + 2][posy + 2] = tablero[posx][posy];
                    tablero[posx][posy] = '_';
                    break;
                //Movimiento del Rey negro
                case 'R':
                    switch(randomRey){ /*Según el numero random que haya salido entre 0 y 2, el rey hara 
                                        un movimiento de sus 3 posibles(Arriba/Arriba-izquierda/Arriba-derecha)*/
                        case 0:
                            tablero[posx + 1][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                        case 1:
                            tablero[posx + 1][posy + 1] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                        case 2:
                            tablero[posx + 1][posy - 1] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                    }
                //Movimiento de la reina negra
                case 'Q':
                    switch(randomRey){   /*Según el numero random que haya salido entre 0 y 2, la reina hara 
                                        un movimiento de sus 3 posibles(Arriba/Arriba-izquierda/Arriba-derecha)*/
                        case 0:
                            tablero[posx + (random)][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                        case 1: 
                            tablero[posx + (random)][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                        case 2:
                            tablero[posx + 2][posy + 2] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            break;
                    }
            }
            
            //Comienza el movimiento de las fichas blancas
            System.out.println("Juegan las blancas");
            mostrar(tablero);
            do{
           System.out.println("Introduce la coordenada de la figura que quieres mover (fila y col)");  
            posx = sc.nextInt();
            posy = sc.nextInt();
            } while(((posx > 7)||(posy>7)) || tablero[posx][posy] == '_');
            
            switch(tablero[posx][posy]){
                //Movimiento del peon blanco
                case 'P':
                    
                    tablero[posx - 1] [posy] = tablero[posx][posy];
                    tablero[posx][posy] = '_';
                    mostrar(tablero);
                    salir = false;
                    break;
                //Movimiento de la torre blanca   
                case 'T':
                    switch(randomTorre){ /*Según el numero random que haya salido entre 0 y 1, la torre hara 
                                        un movimiento de casillas aleatorio de sus 2 posibles(Vertical u Horizontal)*/
                        case 0:
                            tablero[posx - (random)][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                        case 1:
                            tablero[posx][posy -4] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                    }                   
                //Movimiento del caballo blanco    
                case 'C':
                    
                    tablero[posx - 2][posy - 1] = tablero[posx][posy];
                    tablero[posx][posy] = '_';
                    mostrar(tablero);
                    salir = false;
                    break;
                //Movimiento del alfil blanco
                case 'A':
                    
                    tablero[posx - 2][posy + 2] = tablero[posx][posy];
                    tablero[posx][posy] = '_';
                    mostrar(tablero);
                    salir = false;
                    break;
                //Movimiento del rey blanco
                case 'R':
                    switch(randomRey){  /*Según el numero random que haya salido entre 0 y 2, el rey hara 
                                        un movimiento de sus 3 posibles(Arriba/Arriba-izquierda/Arriba-derecha)*/
                        case 0:
                            tablero[posx - 1][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                        case 1:
                            tablero[posx - 1][posy + 1] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                        case 2:
                            tablero[posx - 1][posy - 1] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                    }
                case 'Q':
                    switch(randomRey){   /*Según el numero random que haya salido entre 0 y 2, la reina hara 
                                        un movimiento de sus 3 posibles(Arriba/Arriba-izquierda/Arriba-derecha)*/
                        case 0:
                            tablero[posx - (random)][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                        case 1: 
                            tablero[posx - (random)][posy] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                        case 2:
                            tablero[posx - 2][posy + 2] = tablero[posx][posy];
                            tablero[posx][posy] = '_';
                            mostrar(tablero);
                            salir = false;
                            break;
                    }
            }
            
        } while (salir);
    }

    private static void rellenar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            Arrays.fill(tablero[i], '_');                    
        }
    }

    private static void rellenar1(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            tablero[0][0] = 'T';
            tablero[0][1] = 'C';
            tablero[0][2] = 'A';
            tablero[0][3] = 'R';
            tablero[0][4] = 'Q';
            tablero[0][5] = 'A';
            tablero[0][6] = 'C';
            tablero[0][7] = 'T';
            
        }
    }

    private static void rellenar2(char[][] tablero) {
            tablero[7][0] = 'T';
            tablero[7][1] = 'C';
            tablero[7][2] = 'A';
            tablero[7][3] = 'R';
            tablero[7][4] = 'Q';
            tablero[7][5] = 'A';
            tablero[7][6] = 'C';
            tablero[7][7] = 'T';
    }

    private static void mostrar(char[][] tablero) {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    private static void rellenar3(char[][] tablero) {
        for (int i = 1; i < 8; i++) {
            Arrays.fill(tablero[1], 'P');
        }
    }

    private static void rellenar4(char[][] tablero) {
        for (int i = 1; i < 8; i++) {
            Arrays.fill(tablero[6], 'P');
        }
    }
    
}
