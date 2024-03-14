/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package starwars;

/**
 *
 * @author Medac
 */
public class DarthVader {
    boolean lado_oscuro;
    int habilidad_pilotar;
    int habilidad_espadalaser;
    int poder_fuerza;
    int habilidad_convencer;
    
    public DarthVader(){
        lado_oscuro = true;
        habilidad_pilotar = 5;
        habilidad_espadalaser = 5;
        poder_fuerza = 5;
        habilidad_convencer = 4;
    }
    
    public void hablar(){
        System.out.println("Yo soy tu padre");
    }
}
