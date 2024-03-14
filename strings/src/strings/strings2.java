/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class strings2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la contraseña");
        String password = sc.nextLine();
        String palabra = null;
        System.out.println("letra:" + password.charAt(0));
        System.out.println("letra final:" + password.charAt(0));
        while(!palabra.equals(password)){
            palabra = sc.nextLine();
        }
    }
    
}
