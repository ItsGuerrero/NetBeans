/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciomapas;

import java.util.HashMap;

/**
 *
 * @author Medac
 */
public class EjercicioMapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap <String, Integer> map = new HashMap<>();
        map.put("Emilio", 6);
        map.put("Sergio", 9);
        map.put("Ivan", 9);
        map.put("Alvaro", 5);
        map.put("Monica", 2);
        map.put("Pepe", 10);
        int sumatotal = 0;
        double media = 0;
        for (int clavenota: map.values()) {
            sumatotal = clavenota + sumatotal;
            media = sumatotal/map.size();
        }
        System.out.println(media);
        System.out.println(sumatotal);
    }
    
}
