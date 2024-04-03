/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioclave;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class EjercicioClave {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap <String, String> map = new HashMap<>();
        map.put("ADMIN", "ADMIN");
        map.put("USER", "USER");
        
        boolean correcto = false;
        int intentos = 0;
        
        while(!correcto && intentos < 3){
            System.out.println("Usuario: ");
            String usuario = sc.next();
            System.out.println("Contrasenia: ");
            String contrasenia = sc.next();
            if(map.containsKey(usuario) && map.get(usuario).equals(contrasenia)){
                correcto = true;
                System.out.println("Contraseña correcta");
            } else{
                System.out.println("Datos incorrectos, intentelo de nuevo");
                intentos++;
            } 
        } if(!correcto){
            System.out.println("Has excedido el numero de intentos");
        }
    }
    
}
