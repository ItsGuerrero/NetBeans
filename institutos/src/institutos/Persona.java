/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package institutos;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public abstract class Persona {
    //Atributos
   protected String nombre;
   protected double[] notas;
   boolean suspenso = false;
   
   //Constructor
   public Persona(String nombre){
       this.nombre = nombre;
       notas = new double[6];
   }
   
   //Métodos
   Scanner sc = new Scanner(System.in);
   public void insertarNotas(){
       String [] nombre = {"Programacion", "LLMM", "BBDD", "FOL", "Entornos", "Sistemas"};
       for (int i = 0; i < notas.length; i++) {
           System.out.println("¿Cual es la nota de " + nombre[i] + "?");
          notas[i] = sc.nextDouble();
       }
   }
   
   public void esteAprobado(){
       for (int i = 0; i < notas.length; i++) {
           if (notas[i] < 5) {
               suspenso = true;
           }
       }
   }
   
   @Override
   public String toString(){
       String respuesta = "";
       for (int i = 0; i < notas.length; i++) {
           respuesta = respuesta + " " + notas[i] + "||";
       }
       return nombre + respuesta;
   }

    public String getNombre() {
        return nombre;
    }

    public double[] getNotas() {
        return notas;
    }

    public boolean isSuspenso() {
        return suspenso;
    }

    public Scanner getSc() {
        return sc;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void setSuspenso(boolean suspenso) {
        this.suspenso = suspenso;
    }

    public void setSc(Scanner sc) {
        this.sc = sc;
    }
   
}
