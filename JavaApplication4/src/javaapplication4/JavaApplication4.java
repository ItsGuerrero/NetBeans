/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int [] tabla=new int [4];
        for(int i=0;i<4;i++){
            System.out.println("Introduce el valor");
            tabla[i]=sc.nextInt();
        }
        for(int i=0;i<tabla.length;i++){
            System.out.print(tabla[i]);
        }
    }
    
}
