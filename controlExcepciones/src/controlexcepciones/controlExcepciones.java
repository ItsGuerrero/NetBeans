/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlexcepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class controlExcepciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int a = 5;
//        int b = 0;
//        
//        try{
//            System.out.println(a/b);
//            System.out.println("Entrando por el final del try");
//        }
//        catch(Exception e){
//            System.out.println("No se puede dividir entre cero");
//        }
//        System.out.println("Saliendo del programa");
          
          int num;
          int[]array = {2, 3, 7};
          System.out.println("introduce un numero");
          
          try{
          division(array);
          }
          catch(ArithmeticException e){
              System.out.println("Por dividir");
          }
          catch(ArrayIndexOutfBoundException e){
              System.out.println("Error por array");
          }
//          catch(ArithmeticException e1){
//              System.out.println("Error por dividir entre cero");
//          }
//          catch(ArrayIndexOutOfBoundsException e2){
//              System.out.println("Error tamaño array");
//          }
//          catch(InputMismatchException e3){
//              System.out.println(e3.toString());
//          }
//          finally{
//              System.out.println("Entrando en el finally");
//          }
                  
    }

    public static void division(int[] array ) throws ArrayIndexOutfBoundException {
        Scanner sc = new Scanner (System.in);
        
        int num = sc.nextInt();
        System.out.println(array[num]/num);
        System.out.println("final del try");
        if(num < 3){
            throw new ArrayIndexOutfBoundException();
        }
        
    }
    
}
