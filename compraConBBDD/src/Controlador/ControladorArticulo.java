/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;
import Modelo.Articulo;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Medac
 */
public class ControladorArticulo {
    private ConexionMySql conexion;
    public ControladorArticulo(ConexionMySql conexion){
        this.conexion = conexion;
    }
    public ArrayList <Articulo> ObtenerTodosArticulos() throws SQLException{
        ArrayList<Articulo>lista = new ArrayList<>();
        String consulta = "SELECT * FROM compra";
        ResultSet rset = conexion.ejecutarSelect(consulta);
        while(rset.next()){
            String nombre = rset.getString("nombre");
            int unidades = rset.getInt("Unidades");
            lista.add(new Articulo(nombre, unidades));
        }
        return lista;
    }
}
