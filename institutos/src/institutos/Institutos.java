/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package institutos;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Institutos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resp;
        int pos = 0;
        Persona [] alumnxs = new Persona[100];
        do {
            System.out.println("1. Insertar alumno, 2. Mostrar alumnos, 3. mostrar alumnas, 4. mostrar suspensos, 5. mostrar estadistica, 6. salir");
            resp = sc.nextInt();
            switch(resp){
            case 1:
            System.out.println("1. Alumno, 2. alumna");
            int res = sc.nextInt();
                System.out.println("Di el nombre");
            if(res == 1){ //Alumno
                alumnxs[pos] = new Alumno(sc.next());
                alumnxs[pos].insertarNotas();
            } else{ //Alumna
                alumnxs[pos] = new Alumna(sc.next());
                alumnxs[pos].insertarNotas();
            } 
            
            alumnxs[pos].esteAprobado();
            
            pos++;           
            break;
            case 2:
                for (int i = 0; i < alumnxs.length; i++) {
                    if (alumnxs[i] instanceof Alumno) {
                        System.out.println(alumnxs[i]);
                    }
                }
                break;
            case 3:
                for (int i = 0; i < alumnxs.length; i++) {
                    if (alumnxs[i] instanceof Alumna) {
                        System.out.println(alumnxs[i]);
                    }
                }
                break;
            case 4:
                System.out.println("1.Alumnos, 2.Alumnas");
                resp = sc.nextInt();
                for (int i = 0; i < pos; i++) {
                    if (resp == 1) {
                        if (alumnxs[i] instanceof Alumno && alumnxs[i].isSuspenso()) {
                            System.out.println(alumnxs[i]);
                        }
                    } else{
                        if (alumnxs[i] instanceof Alumna && alumnxs[i].isSuspenso()) {
                            System.out.println(alumnxs[i]);
                        }
                    }
                }
                break;
            case 5:
                int contMasculino = 0;
                int contFemenino = 0;
                for (int i = 0; i < pos; i++) {
                    if (alumnxs[i].isSuspenso() && alumnxs[i] instanceof Alumno) {
                        contMasculino++;
                    }
                    elseif(alumnxs[i].isSuspenso() && alumnxs[i] instanceof Alumna){
                }
                System.out.println("Alumnos chicos " + contMasculino/pos + "Alumnas chicas " + contFemenino/pos);
        }
        } while (resp != 6);
    }
    
}
