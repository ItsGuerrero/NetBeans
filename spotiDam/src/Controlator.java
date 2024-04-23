
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Medac
 */
public class Controlator {
    LinkedList<Song> songs = new LinkedList<>();
    
    public Controlator(){

}
    
    public LinkedList <Song> DataGet(){
        File f = new File("songs.txt");
        
        try{
            BufferedReader br = new BufferedReader(new FileReader(f));
            String texto = br.readLine();
            while(texto != null){
                String[]array = texto.split("_");
                songs.add(new Song(array[0], array[1]));
                texto = br.readLine();
            }
            br.close();
        }catch(FileNotFoundException e3){
            System.out.println("Archivo no encontrado");
        }
        catch(IOException e){
            System.out.println("No se puede leer");
        }
        
        return songs;
    }
    

}


