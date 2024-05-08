package Controlador;

import Modelo.Cancion;
import Modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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
                String respuesta=rset.getString("respuesta");
                lista.add(new Usuario(usuario,contraseña,respuesta));
            }
            return lista;
    }
 
    
}
