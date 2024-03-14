/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imagen;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import javax.imageio.ImageIO;

/**
 *
 * @author Medac
 */
public class Imagen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int blanco = 255;
        int negro = 0;
        int[][] matriz = new int[300][300];
        rellenar(matriz, negro);
        rellenar2(matriz, blanco);
        rellenar3(matriz, blanco);
        rellenar4(matriz, blanco);
        rellenar5(matriz, blanco);
        mostrar(matriz);
        BufferedImage image = new BufferedImage(matriz.length, matriz[0].length, BufferedImage.TYPE_INT_RGB);
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int gris = matriz[i][j];
                Color color = new Color(gris, gris, gris);
                image.setRGB(i, j, color.getRGB());
            }
        }
        try{
            ImageIO.write(image, "png", new File("image.png"));
        } 
        catch (IOException e) {
            System.out.println("Error");    
        }

    }

    private static void rellenar(int[][] matriz, int negro) {      
        for (int i = 20; i < 50; i++) {
            matriz[0][i] = negro;
        }
    }

    private static void mostrar(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }
    }

    private static void rellenar2(int[][] matriz, int blanco) {
        for (int j = 70; j < 120; j++) {
            matriz[j][60] = blanco;
        }
    }

    private static void rellenar3(int[][] matriz, int blanco) {
        for (int j = 170; j < 220; j++) {
            matriz[j][60] = blanco;
        }
    }

    private static void rellenar4(int[][] matriz, int blanco) {
        for (int j = 100; j < 150; j++) {
            matriz[145][j] = blanco;
        }
    }

    private static void rellenar5(int[][] matriz, int blanco) {
        for (int j = 50; j < 250; j++) {
            matriz[j][200] = blanco;
        }
    }

}
