/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package traductor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

/**
 *
 * @author Medac
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // Declaración y creación de objetos File para los archivos "frase.txt" y "diccionario.txt"
        File frase = new File("frase.txt");
        File diccionario = new File("diccionario.txt");

        // Declaración de una matriz para almacenar el diccionario y un array para almacenar la frase
        String[][] matriz = new String[10][2]; // Matriz para el diccionario
        String[] arrayFrase = null; // Array para la frase

        try {
            // Abrir y leer la frase del archivo "frase.txt"
            FileReader filereader = new FileReader(frase);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String fraseBase = bufferedreader.readLine(); // Leer la frase completa
            System.out.println(fraseBase); // Mostrar la frase original al usuario

            // Dividir la frase en palabras y almacenarlas en un array
            arrayFrase = fraseBase.split(" ");

            // Leer y separar el diccionario del archivo "diccionario.txt"
            FileReader filereader2 = new FileReader(diccionario);
            BufferedReader bufferedreader2 = new BufferedReader(filereader2);
            String linea;
            int i = 0;
            String[] arrayLinea;

            linea = bufferedreader2.readLine();
            while (linea != null) {
                // Dividir cada línea del diccionario en dos partes: palabra y su reemplazo
                arrayLinea = linea.split(";");

                // Almacenar cada par de palabras en la matriz
                matriz[i][0] = arrayLinea[0]; // Palabra original
                matriz[i][1] = arrayLinea[1]; // Palabra reemplazo

                i++;

                // Leer la siguiente línea del diccionario
                linea = bufferedreader2.readLine();
            }

        } catch (IOException e) {
            System.out.println("No se puede acceder al archivo");
        } catch (NullPointerException e2) {
            System.out.println("Archivo vacío");
        }

        try {
            // Abrir el archivo "frase.txt" para escribir la frase modificada
            FileWriter filewriter = new FileWriter(frase, false); // 'false' para sustituir el contenido
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter);

            // Iterar sobre las palabras de la frase
            for (int j = 0; j < arrayFrase.length; j++) {
                // Iterar sobre las filas de la matriz (diccionario)
                for (int k = 0; k < matriz.length; k++) {
                    // Verificar si la palabra actual coincide con una palabra del diccionario
                    if (arrayFrase[j].equalsIgnoreCase(matriz[k][0])) {
                        // Si coincide, reemplazar la palabra en el array de la frase
                        arrayFrase[j] = matriz[k][1];
                    }
                }
            }

            // Construir la frase modificada a partir del array de palabras
            String aux = " ";
            for (int j = 0; j < arrayFrase.length; j++) {
                aux = aux + arrayFrase[j] + " ";
            }

            // Mostrar la frase modificada por consola
            System.out.println(aux);

            // Escribir la frase modificada en el archivo "frase.txt"
            bufferedwriter.write(aux);
            bufferedwriter.close(); // Cerrar el archivo después de escribir

        } catch (NullPointerException e2) {
            System.out.println("No se puede sobrescribir porque el archivo está vacío");
        }
    }

    // Método para mostrar una matriz de Strings
    public static void mostrar(String[][] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
        }
    }

    // Método para mostrar un array de Strings
    public static void mostrarArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
    }
}
