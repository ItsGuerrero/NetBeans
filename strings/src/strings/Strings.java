/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package strings;

/**
 *
 * @author Medac
 */
public class Strings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //String
        String texto4 = "hola";
        String texto1 = "hola";
        String texto2 = "que tal";
        String texto3 = texto1 + texto2;
        System.out.println(texto1);
        System.out.println(texto2);
        System.out.println(texto3);
        
        System.out.println(texto1.equals(texto4));
        System.out.println(texto3.length());
        System.out.println(texto1.indexOf ('h'));
        System.out.println(texto3.indexOf ('a'));
        System.out.println(texto2.charAt(2));
        System.out.println(texto1.substring(0,2));
        System.out.println(texto1.toUpperCase());
    }
    
}
