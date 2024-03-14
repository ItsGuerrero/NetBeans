/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carrera;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Carrera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String cartaobj1 = "Camion primero, moto segunda";
        String cartaobj2 = "Camion segundo, coche primero";
        String cartaobj3 = "Camion tercero, moto primera";
        
        String [] cartaobj = {cartaobj1, cartaobj2, cartaobj3};
        
        Coche coche = new Coche();
        Moto moto = new Moto();
        Camion camion = new Camion();
        
        Vehiculo [][] vehiculos = new Vehiculo [3][10];
        
        vehiculos [0][0] = coche;
        vehiculos [1][0] = moto;
        vehiculos [2][0] = camion;
        
        int random = (int) (Math.random() * 10);
        
        Carta [] mazo = new Carta[10];                
        
        mostrar(vehiculos);
        do {
            
            System.out.println("El objetivo del camion es: Camion primero y Moto segundo");
            System.out.println("El objetivo de la moto es: Camion segundo y coche primero");
            System.out.println("El objetivo del coche es: Camion tercero y moto primero");
            
            for (int i = 0; i < 3; i++) {
                System.out.println("Camion coge carta");
            System.out.println("¿Quien quieres que avance? 1.Camion 2.moto 3.coche");
            int resp = sc.nextInt();
            
            switch(resp){
                case 1:
                    if (mazo[random].getEstado()%2==0){
                       camion.avanzar();
                       }
                    break;
                case 2:
                    if (mazo[random].getEstado()%2==0){
                       moto.avanzar();
                       }
                    break;
                case 3:
                    if (mazo[random].getEstado()%2==0){
                       coche.avanzar();
                       }
            }
            
            System.out.println("Quien quieres que retroceda? 1.Camion 2.moto 3.coche");
            
            switch(resp){
                case 1:
                    if (mazo[random].getEstado()%2!=0){
                       camion.retroceder();
                       }
                    break;
                case 2:
                    if (mazo[random].getEstado()%2!=0){
                       moto.retroceder();
                       }
                    break;
                case 3:
                    if (mazo[random].getEstado()%2!=0){
                       coche.retroceder();
                       }
                    break;
            }
            }
          
            
            
            
            
        } while(vehiculos[0][9] != null || vehiculos[1][9] != null || vehiculos[2][9] != null);
        
        
        
    }

    

    private static void mostrar(Vehiculo[][] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < 10; j++) {
               if(vehiculos[i][j] == null){
                   System.out.print("_ ");
               } 
               else{
                   System.out.print(vehiculos[i][j].getNombre());
               }
            } System.out.println(" ");
        } 
    }

    private static void actualizar(Vehiculo[][] vehiculos) {
        for (int i = 0; i < vehiculos.length; i++) {
            for (int j = 0; j < 10; j++) {
               if(vehiculos[i][j] == null){
                   System.out.print("_ ");
               } 
               else{
                   System.out.print(vehiculos[i][j].getNombre());
               }
            } System.out.println(" ");
        } 
    }
    
}
