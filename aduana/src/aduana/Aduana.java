/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aduana;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Aduana {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int i=0;
        Persona [] arrayper= new Persona[100];
        boolean jugar=true;
        do{
        System.out.println("1.Crear persona 2.Mostrar persona 3.Buscar nombre 4.Buscar dni 5.Salir");
        int opcion= sc.nextInt();
        switch(opcion){
            case 1: //Crear persona
                System.out.println("Introduce nombre");
                String nombre=sc.next();
                System.out.println("Introduce dni");
                String dni=sc.next();
                Persona persona = new Persona(nombre,dni);
                arrayper[i] = persona;
                i++;
                break;
            case 2: //Mostrar persona
                for(int a=0;a<i;a++){
                System.out.println(arrayper[a]);
                }break;
            case 3: //Buscar nombre
                System.out.println("Introduce nombre");
                 nombre=sc.next();
                 for(int a=0;a<i;a++){
                 if(nombre.equals(arrayper[a].getNombre()))
                 System.out.println("La persona con nombre "+ nombre+" es "+arrayper[a]);
                 }break;
            case 4: //Buscar dni
                System.out.println("Introduce dni");
                 dni=sc.next();
                 for(int a=0;a<i;a++){
                 if(dni.equals(arrayper[a].getNombre()))
                 System.out.println("La persona con dni "+ dni+" es "+arrayper[a]);
                 }break;
            case 5:
            jugar=false;
        }
        }while(jugar);

    }
    
}
