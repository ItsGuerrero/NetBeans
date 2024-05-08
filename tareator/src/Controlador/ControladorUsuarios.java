/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Medac
 */
public class ControladorUsuarios {
    private ConexionMySql conexion;
    public ControladorUsuarios(ConexionMySql conexion){
        this.conexion=conexion;
    }
    
    public ArrayList <Usuario> ObtenTodosUsuarios() throws SQLException{
            ArrayList<Usuario>lista=new ArrayList<>();
            String consulta="SELECT * FROM acceso";
            ResultSet rset=conexion.ejecutarSelect(consulta);
            while(rset.next()){
                String usuario=rset.getString("usuario");
                String contraseña=rset.getString("contraseña");
                String email = rset.getString("email");
                
                lista.add(new Usuario(usuario,contraseña, email));
            }
            return lista;
    }
}
