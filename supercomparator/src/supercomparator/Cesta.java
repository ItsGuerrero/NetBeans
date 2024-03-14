/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supercomparator;

/**
 *
 * @author Medac
 */
public class Cesta {
    Producto producto;
    int unidades;
    
    public Cesta(int unidades){
        this.producto = producto;
        unidades = 0;
    }

    public Producto getProducto() {
        return producto;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Tienes en la cesta: " + producto + "Unidades: " + unidades;
    }
    
}
