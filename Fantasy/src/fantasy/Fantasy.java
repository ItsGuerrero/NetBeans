/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fantasy;

import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class Fantasy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
     
        
        Jugador jug1 = new Jugador("Ter Stegen", "Portero", 33000000);
        Jugador jug2 = new Jugador("Balde", "Defensa", 15000000);
        Jugador jug3 = new Jugador("Kounde", "Defensa", 20000000);
        Jugador jug4 = new Jugador("Araujo", "Defensa", 35000000);
        Jugador jug5 = new Jugador("Cancelo", "Defensa", 22000000);
        Jugador jug6 = new Jugador("Gavi", "Centrocampista", 38000000);
        Jugador jug7 = new Jugador("Fermin", "Centrocampista", 15000000);
        Jugador jug8 = new Jugador("De Jong", "Centrocampista", 30000000);
        Jugador jug9 = new Jugador("Lewandowski", "Delantero", 45000000);
        Jugador jug10 = new Jugador("Ferran", "Delantero", 20000000);
        Jugador jug11 = new Jugador("Messi", "Delantero", 100000000);
        Jugador jug12 = new Jugador("Dembele", "Delantero", 8000000);
        Jugador jug13 = new Jugador("Alaba", "Defensa", 18000000);
        Jugador jug14 = new Jugador("Isco", "Centrocampista", 22000000);
        Jugador jug15 = new Jugador("Kameni", "Portero", 10000000);
        Jugador jug16 = new Jugador("Joaquin", "Centrocampista", 5000000);
        Jugador jug17 = new Jugador("Griezmann", "Delantero", 40000000);
        Jugador jug18 = new Jugador("Ronaldo", "Delantero", 3000000);
        Jugador jug19 = new Jugador("Puyol", "Defensa", 13000000);
        Jugador jug20 = new Jugador("Oblak", "Portero", 21000000);
        Jugador jug21 = new Jugador("Neymar", "Delantero", 33000000);
        Jugador jug22 = new Jugador("Iago Aspas", "Delantero", 58000000);
        
           Jugador [] jug = {jug1,jug2,jug3, jug4, jug5, jug6, jug7, jug8, jug9, jug10, jug11, jug12, jug13, jug13, jug14, jug15, jug16, jug17, jug18, jug19, jug20, jug21, jug22};
        
        Jugador [] plantilla = new Jugador[11];
        
        rellenar(jug, plantilla);
        
        boolean jugar = true;
        
        do {
            System.out.println("1.Mostrar plantilla, 2. Cambiar Jugador, 3. Mostrar valor del equipo, 4. Salir");
            int opcion = sc.nextInt();
            
            switch(opcion){
                case 1: 
                    mostrar(plantilla);
                    break;
                case 2:
                    System.out.println("Los jugadores son: ");
                    mostrar(jug);
                    System.out.println("Tu plantilla es: ");
                    mostrar(plantilla);
                    System.out.println("Dime la posicion de jugadores");
                    int posJug = sc.nextInt();
                    System.out.println("Dime la posicion de la plantilla");
                    int posPlantilla = sc.nextInt();
                    Jugador jaux;
                    jaux = jug[posJug];
                    jug[posJug] = plantilla[posPlantilla];
                    plantilla[posPlantilla] = jaux;
                    break;
                case 3:
                    int sumar = 0;
                    for (int i = 0; i < plantilla.length; i++) {
                        sumar = sumar + plantilla[i].getPrecio();
                    }
                    System.out.println("el valor de la plantilla es de " + sumar);
                    break;
                case 4:
                    jugar = false;
            }
            
        } while (jugar);
        
             
    }

    private static void rellenar(Jugador[] jug, Jugador[] plantilla) {
       
        for (int i = 0; i < plantilla.length; i++) {
            int random = (int) (Math.random() * 22);
            if (jug[random] != null) {
                plantilla[i] = jug[random];
                jug[random] = null;
            } else {
                i--;
            }
        }
    }

    private static void mostrar(Jugador[] array) {
        for (int i = 0; i < array.length; i++) {
            if(array[i] != null){
                System.out.println(array[i] + "pos" + i);
            }
        }
    }
    
}
