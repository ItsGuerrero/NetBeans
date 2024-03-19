/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mapas;

import java.util.HashMap;
import java.util.Iterator;

/**
 *
 * @author Medac
 */
public class Mapas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        HashMap<String, String> diccionario = new HashMap<>();
        diccionario.put("Seat", "Ibiza");
        diccionario.put("Ford", "Fiesta");
        diccionario.put("Opel", "Corsa");
        diccionario.put("Peugeot", "206");
        diccionario.put("Fiat", "Punto");
        System.out.println(diccionario);
        System.out.println(diccionario.put("Peugeot", "3008"));
        System.out.println(diccionario);

//        TODOS LOS METODOS DE DICCIONARIO
//        diccionario.size();
//        diccionario.isEmpty();
//        diccionario.put(key, value);
//        diccionario.get(args);
//        diccionario.clear();
//        diccionario.containsKey(args);
//        diccionario.containsValue(args);
//        diccionario.values();
//        diccionario.remove(args);
//        MANERAS DE RECORRER UN DICCIONARIO

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Almeria");
        map.put(2, "Cadiz");
        map.put(3, "Huelva");
        
//        FORMA 1
//        for (HashMap.Entry<Integer, String> ciudades: map.entrySet()) {
//            int clave = ciudades.getKey();
//            String valor = ciudades.getValue();
//            System.out.println("Clave: " + clave + " Valor: " + valor);
//        }
        
//        FORMA 2
//        Iterator<Integer> it = map.keySet().iterator();
//        while(it.hasNext()){
//            int clave = it.next();
//            String valor = map.get(clave);
//            System.out.println("Clave: " + clave + " Valor: " + valor);
//        }

//        FORMA 3
//        for (String ciudad: map.values()) {
//            System.out.println("Ciudad: " + ciudad);
//        }
//        FORMA 4
        map.forEach((clave, valor)  -> {
            System.out.println("Clave: " + clave + " Valor: " + valor);
        });
    }

}
