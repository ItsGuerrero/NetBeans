/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaexamen;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Medac
 */
public class PracticaExamen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        File file = new File ("inventario.txt");
        
        Articulo [] articulos = new Articulo[100];
        int cont = 0;
        try{
            
            FileReader filereader = new FileReader(file);           
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String texto = bufferedreader.readLine();
            while(texto != null){
                if (texto.contains("/")) {
                    throw new ExceptionBarra();
                }
                String[]array = texto.split(":");
                String nombre = array[0];
                String precio = array[1];
                String cantidad = array[2];
                int precio_num = Integer.parseInt(precio);
                int cantidad_num = Integer.parseInt(cantidad);
                Articulo articulo = new Articulo(nombre, precio_num, cantidad_num);
                
                articulos[cont] = articulo;
                cont++;
                texto = bufferedreader.readLine();
                
            }
            bufferedreader.close();
        }
        catch (IOException e) {
            System.out.println("No se puede acceder al archivo");
    }
        catch (ExceptionBarra e3){
            System.out.println(e3);
        }
        catch (NullPointerException e2){
            System.out.println("Archivo vacio");
        }
        for (int i = 0; i < articulos.length; i++) {
            if (articulos[i] != null) {
                System.out.println(articulos[i]);
            }
        }
    
    }
}
