/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;

/**
 *
 * @author Medac
 */
public class Teoria2tema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
		//System.out.println("hola mundo");
                float a=5;
                float b=2;
                System.out.println(a);
                System.out.println(b);
                float suma=a/b;
                System.out.println(suma);
                System.out.println("la suma es:"+suma);
                System.out.println("-----------------------------------------");
                //calculo de temperatura faren a celsius FORMA 1//
                
            float c=40;
            float f;
            f=(c*1.8f+32);
                System.out.println("el resultado es:" +f);
                System.out.println("-----------------------------------------");
            //calculo de temperatura faren a celsius FORMA 2//
            float celsius=40;
            float faren=(celsius*9/5+32);
                System.out.println("el resultado es:" +faren);
                System.out.println("-----------------------------------------");
                //dato alfanumerico//
            char letra1='d';
                System.out.println ("la letra es: " +letra1);
                System.out.println("-----------------------------------------");
                //datos booleanos//
            boolean respuesta=true;
                System.out.println("la respuesta es: " +respuesta);
                
            
            boolean booleano1=true;
            boolean booleano2=false;
            boolean resultado;
                System.out.println( resultado = booleano1&&booleano2);
                System.out.println( resultado = booleano1||booleano2);
                System.out.println( resultado = !booleano2);
                System.out.println("-----------------------------------------");
                
                //operadores relacionales//
            int num1= 5;
            int num2= 8;
                System.out.println("es igual " + (num1==num2));
            char letra3='a';
            char letra4='a';
                System.out.println("es igual " + (letra3==letra4));
                System.out.println("-----------------------------------------");
                //resto de operaciones//
                System.out.println(Math.sqrt(25)); 
                System.out.println("-----------------------------------------");
                //casting//
                //numero real a entero//
            double num=8.3;
            int resul = (int)num;
                System.out.println(resul);
                System.out.println("-----------------------------------------");
                //de INT  a CHAR//
            int variable2=20;
            char variable3=(char)variable2;
            System.out.println("la respuesta es: " +(variable3));

	}

}
    
    

