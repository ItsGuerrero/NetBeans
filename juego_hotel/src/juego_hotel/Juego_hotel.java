/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juego_hotel;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Juego_hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        HotelBoom boom = new HotelBoom();
        HotelChinatown chinatown = new HotelChinatown(); 
        HotelPresident president = new HotelPresident();
        HotelWaikiki waikiki = new HotelWaikiki();
        HotelFontaine fontaine = new HotelFontaine();
        HotelBlue blue = new HotelBlue();
        
        int turnos  = 13;
        int dado;
        int dado2;
        
        
        
        Hotel [] array = {boom, chinatown, president, waikiki, fontaine, blue};
        
        Jugador jugador = new Jugador ();
        
        do {
            System.out.println("1. Jugar, 2. Pasar");
            int resp = sc.nextInt();
            // jugar
            dado = (int)(Math.random() * 6);
            if(array[dado].isEstado()){
                jugador.setDinero(jugador.getDinero() - 500000);
            } else {
                System.out.println("1.Jugar, 2.Pasar");
                resp = sc.nextInt();
                if (resp == 1){
                    dado2 = (int) (Math.random() * 4);
                    switch(dado2){
                        case 0: //
                            array[dado].setEstado(true);
                        case 1:
                            array[dado].setEstado(true);
                            jugador.setDinero(jugador.getDinero() - array[dado].getPrecio());
                    }
                } else{
                    System.out.println("Has pasado");
                }
            } turnos++;
            jugador.setDinero(jugador.getDinero() + 500000);
            mostrar(array);
        } while (turnos > 13 || jugador.getDinero() > 0);
        
    }

    private static void mostrar(Hotel[] array) {
        char letra = ' ';
        for (int i = 0; i < array.length; i++) {
            if (array[i].isEstado()) {
                letra = 'x';
            }
            System.out.println(array[i].getNombre() + "["+letra+"]");
        }
    }
    
}
