/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Tarea;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Medac
 */
public class ControladorTareas {
    private ConexionMySql conexion;
    public ControladorTareas(ConexionMySql conexion){
        this.conexion=conexion;
    }
    
    public ArrayList <Tarea> ObtenTodasTareas() throws SQLException{
            ArrayList<Tarea>lista=new ArrayList<>();
            String consulta="SELECT * FROM tareas";
            ResultSet rset=conexion.ejecutarSelect(consulta);
            while(rset.next()){
                String tareas=rset.getString("tareas");
                int prioridad=rset.getInt("prioridad");
                boolean estado=rset.getBoolean("estado");
                String fechalim=rset.getString("fechalim");
                lista.add(new Tarea(tareas,prioridad,estado,fechalim));
            }
            return lista;
    }
}
