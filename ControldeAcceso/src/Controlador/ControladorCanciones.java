

package Controlador;

import Modelo.Cancion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class ControladorCanciones {
    private ConexionMySql conexion;
    public ControladorCanciones(ConexionMySql conexion){
        this.conexion=conexion;
    }
    
       public ArrayList <Cancion> ObtenTodasCanciones() throws SQLException{
            ArrayList<Cancion>lista=new ArrayList<>();
            String consulta="SELECT * FROM canciones";
            ResultSet rset=conexion.ejecutarSelect(consulta);
            while(rset.next()){
                String titulo=rset.getString("titulo");
                String album=rset.getString("album");
                String artista=rset.getString("artista");
                String duracion=rset.getString("duracion");
                lista.add(new Cancion(titulo,album,artista,duracion));
            }
            return lista;
    }
}
