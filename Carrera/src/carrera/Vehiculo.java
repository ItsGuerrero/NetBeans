/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carrera;

/**
 *
 * @author Medac
 */
public abstract class Vehiculo {
    //Atributos
    protected int movimiento;
    protected String nombre;
    protected int posx;
    protected int posy;
    protected Carta[]cartas;
    
    //Constructor
    public Vehiculo(){
        cartas = new Carta[100];
    }
    
    //Metodos
    
    public void avanzar(){
        posx = posx + movimiento;
    }
    
    public void retroceder(){
        posx = posx - movimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosx() {
        return posx;
    }

    public int getPosy() {
        return posy;
    }

    public Carta[] getCartas() {
        return cartas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPosx(int posx) {
        this.posx = posx;
    }

    public void setPosy(int posy) {
        this.posy = posy;
    }

    public void setCartas(Carta[] cartas) {
        this.cartas = cartas;
    }

    public int getMovimiento() {
        return movimiento;
    }

    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "nombre=" + nombre + ", posx=" + posx + ", posy=" + posy + ", cartas=" + cartas + '}';
    }
    
}
