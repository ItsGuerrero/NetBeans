/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturaescritura;

import java.io.*;

/**
 *
 * @author Medac
 */
public class LecturaEscritura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        File file = new File("inspector.txt");
        int num;
        String frase = " ";
        String frase2 = " ";
        char letra;

        try {
            FileReader filereader = new FileReader(file);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            frase = bufferedreader.readLine();
            while (frase != null) {
                frase2 = frase2 + frase + '\n';
                frase = bufferedreader.readLine();
            }
            System.out.println(frase2);
            bufferedreader.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
        try{
            FileWriter filewriter = new FileWriter(file, false);
            BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
            bufferedwriter.write("Hola");
            bufferedwriter.newLine();
            bufferedwriter.write("Que tal");
            bufferedwriter.close();
        }
        catch (IOException e) {
            System.out.println("Error");
        }

    }

}
