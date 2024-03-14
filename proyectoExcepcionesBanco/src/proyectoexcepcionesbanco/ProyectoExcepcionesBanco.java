/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoexcepcionesbanco;

/**
 *
 * @author Medac
 */
public class ProyectoExcepcionesBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c;
        String [] valores = {"kjhg", "873", "-100"};
        
        try{
            c = new Cuenta("Antonio", 25, +1000);
            System.out.println(c);
            procesarMovimiento(c, valores);
            System.out.println(c);
        }
        catch(NumberFormatException e3){
            System.out.println(e3.getMessage());
        }
        catch(SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    private static void procesarMovimiento(Cuenta c, String[] movs) throws SaldoInsuficienteException {
        for (int i = 0; i < movs.length; i++) {
            c.movimiento(Double.parseDouble(movs[i]));
        }
    }
    
}
