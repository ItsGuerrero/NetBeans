/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supercomparator;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Supercomparator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = true;

        Producto producto1 = new Producto("Platano", 5);
        Producto producto2 = new Producto("Manzana", 6);
        Producto producto3 = new Producto("Lejia", 4);
        Producto producto4 = new Producto("Pan", 2);
        Producto producto5 = new Producto("Yogurt", 3);
        Producto producto6 = new Producto("Fanta", 2);
        Producto producto7 = new Producto("Galletas", 3);
        Producto producto8 = new Producto("Chicles", 1);
        Producto producto9 = new Producto("Chocolate", 2);
        Producto producto10 = new Producto("Cereales", 5);

        Producto producto11 = new Producto("Platano", 4);
        Producto producto12 = new Producto("Manzana", 4);
        Producto producto13 = new Producto("Lejia", 5);
        Producto producto14 = new Producto("Pan", 3);
        Producto producto15 = new Producto("Yogurt", 2);
        Producto producto16 = new Producto("Fanta", 1);
        Producto producto17 = new Producto("Galletas", 2);
        Producto producto18 = new Producto("Chicles", 2);
        Producto producto19 = new Producto("Chocolate", 3);
        Producto producto20 = new Producto("Cereales", 3);

        Producto[] promercadona = {producto1, producto2, producto3, producto4, producto5, producto6, producto7, producto8, producto9, producto10};
        Producto[] proaldi = {producto11, producto12, producto13, producto14, producto15, producto16, producto17, producto18, producto19, producto20};

        Supermercado mercadona = new Supermercado("Mercadona", promercadona);
        Supermercado aldi = new Supermercado("Aldi", proaldi);

        Cesta[] cesta = new Cesta[20];

        do {

            System.out.println("Bienvenidos a la APP SuperComparator");
            System.out.println("Menu: 1.Comparar 2.Ver cesta de la compra 3.Salir");
            int resp = sc.nextInt();

            switch (resp) {
                case 1:
                    System.out.println("Introduce el nombre del producto");
                    String nombre = sc.next();
                    Producto producto = null;
                    for (int i = 0; i < promercadona.length; i++) {
                        for (int j = 0; j < proaldi.length; j++) {
                            if (nombre.equals(promercadona[i].getNombre()) && (nombre.equals(proaldi[j].getNombre()))) {
                                if (promercadona[i].getPrecio() < proaldi[j].getPrecio()) {
                                    System.out.println("El precio mas barato es el de: " + mercadona.getNombre() + " Su precio es de: " + promercadona[i].getPrecio());
                                    producto = promercadona[i];
                                } else {
                                    System.out.println("El precio mas barato es el de: " + aldi.getNombre() + " Su precio es de: " + proaldi[j].getPrecio());
                                    producto = proaldi[j];
                                }
                            }
                        }

                    }
                    System.out.println("Lo quieres añadir a la cesta? 1.si 2.no");
                    int respuesta = sc.nextInt();

                    switch (respuesta) {
                        case 1:
                            for (int k = 0; k < cesta.length; k++) {
                                if (cesta[k] == null) {
                                    cesta[k] = new Cesta(0);
                                    cesta[k].producto = producto;
                                    cesta[k].unidades++;
                                }
                            }
                            break;
                        case 2:

                            break;

                    }
                    break;
                case 2:
                    System.out.println(Arrays.toString(cesta));
                    break;
                case 3:
                    salir = false;
                    break;
            }

        } while (salir);
    }

}
