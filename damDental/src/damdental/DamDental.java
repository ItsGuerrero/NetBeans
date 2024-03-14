/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package damdental;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Medac
 */
public class DamDental {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File pacientes = new File("pacientes.txt");
        File config = new File("config.txt");

        try {
            FileReader filereader = new FileReader(config);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            String id = bufferedreader.readLine();
            int id_num = Integer.parseInt(id);

            FileReader filereader2 = new FileReader(pacientes);
            BufferedReader bufferedreader2 = new BufferedReader(filereader2);
            int i = 0;

            do {
                Paciente[] arraypaciente = new Paciente[id_num];
                System.out.println("Bienvenidos a la clinica DamDental");
                System.out.println("1.Crear paciente 2. Ver pacientes 3. Sondaje 4. Salir");

                int resp = sc.nextInt();

                switch (resp) {
                    case 1:
                        FileWriter filewriter = new FileWriter(pacientes, true);
                        BufferedWriter bufferedwriter = new BufferedWriter(filewriter);
                        bufferedwriter.write(id_num + " ");
                        System.out.println("Introduce el nombre");
                        String nombre = sc.next();
                        bufferedwriter.write(nombre + " ");
                        System.out.println("Introduce el apellido");
                        String apellido = sc.next();
                        bufferedwriter.write(apellido + " ");
                        System.out.println("Introduce la edad");
                        String edad = sc.next();
                        bufferedwriter.write(edad);
                        int edad_num = Integer.parseInt(edad);
                        
                        bufferedwriter.newLine();
                        i++;
                        bufferedwriter.close();
                        break;

                    case 2:
                        String texto = bufferedreader2.readLine();
                        String [] array = texto.split(" ");
                        String id_nume = array[0];
                        String nombree = array[1];
                        String apellidoo = array[2];
                        String edadd =array[3];
                        int id_num2 = Integer.parseInt(id_nume);
                        int edadd_num = Integer.parseInt(edadd);
                        Paciente paciente = new Paciente(id_num2 , nombree, apellidoo, edadd_num);
                        arraypaciente[i] = paciente;
                        i++;
                        texto = bufferedreader2.readLine();
                        for (int j = 0; j < arraypaciente.length; j++) {
                            if (arraypaciente[j] != null) {
                                System.out.println(arraypaciente[j]);
                            }
                        }
                        
                        break;
                }
                String id_string = String.valueOf(id_num);
                FileWriter filewriter2 = new FileWriter(config, false);
                BufferedWriter bufferedwriter2 = new BufferedWriter(filewriter2);
                bufferedwriter2.write(id_string);

                id_num++;

                bufferedwriter2.close();
            } while (bufferedreader2 != null);

            bufferedreader.close();
            bufferedreader2.close();
        } catch (NullPointerException e2) {
            System.out.println("Archivo vacio");
        } catch (IOException e) {
            System.out.println("No se puede leer el archivo");
        }
    }

}
