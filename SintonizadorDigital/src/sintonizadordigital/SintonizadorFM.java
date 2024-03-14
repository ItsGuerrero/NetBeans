/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sintonizadordigital;

/**
 *
 * @author Medac
 */
public class SintonizadorFM {
    //Atributos
    private double frecuencia;
   
    
    //Constructores
    public SintonizadorFM(){
        this.frecuencia = frecuencia;
        
    }
    
    //Metodos
    public void subir(){
        frecuencia = frecuencia + 0.5;
        if(frecuencia > 108){
            frecuencia = 80;
        }
    }
    
    public void bajar(){
        frecuencia = frecuencia - 0.5;
        if(frecuencia < 80){
            frecuencia = 180;
        }
    }
    
    public void mostrar(){
        System.out.println(frecuencia);
    }
}
