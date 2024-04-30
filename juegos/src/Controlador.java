
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Controlador {
    ArrayList <Persona> personas = new ArrayList<>();
    
    public ArrayList<Persona> leerarchivo(){
        File file = new File("ranking.txt");
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            String texto = br.readLine();
            while(texto != null){
                String [] array = texto.split(" ");
                personas.add(new Persona(array[0]));
                texto = br.readLine();
            }
            br.close();
        } catch(FileNotFoundException e2){
            System.out.println("Archivo no encontrado");
        } catch(IOException e3){
            System.out.println("No se puede leer");
        }
        return personas;
    }
    public void escribirarchivo(ArrayList<Persona> personas){
        File f = new File("ranking.txt");
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter(f, false));
            for (int i = 0; i < personas.size(); i++) {
                bw.write(personas.get(i).getNombre() + " " + personas.get(i).getPuntuacion());
                bw.newLine();
            }
            bw.close();
        }
        catch(IOException e4){
            System.out.println("No se puede leer");
        }
    }
}
