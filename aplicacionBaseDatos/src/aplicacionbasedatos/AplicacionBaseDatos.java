/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aplicacionbasedatos;


import java.util.Calendar;
import java.util.TimeZone;
import java.sql.*;

/**
 *
 * @author Medac
 */
public class AplicacionBaseDatos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String BD = "persona";
        String USUARIO = "root";
        String PASS = " ";
        String HOST = "localhost";
        
        //Cargar o registrar driver
        
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //Inicia la conexion
        
        Calendar now = Calendar.getInstance();
        TimeZone zonaHoraria = now.getTimeZone();
        Connection connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user="+ USUARIO + "&password=" + PASS + "&useLegacyDatetimeCode=false&serverTimezone=" + zonaHoraria.getID());
        
        
//        //Crear tabla
//        
//        PreparedStatement st = null;
//        try{
//            st = connection.prepareStatement("CREATE TABLE paises (pais varchar(50) NOT NULL, acronimo CHAR(3), poblacion INT(20))");
//            st.execute();
//            st.close();
//        }
//        catch(SQLException sqle){
//            System.out.println("Error" + sqle.getMessage());
//        }
        
        String consulta = "INSERT INTO paises (pais, acronimo, poblacion) VALUES ('Spain', 'S', 5)";
        try{
            Statement stmt = connection.createStatement();
            stmt.executeUpdate(consulta);
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        
        consulta = "SELECT * FROM paises ORDER BY pais";
        Statement stmt = connection.createStatement();
        ResultSet rset = stmt.executeQuery(consulta);
        while(rset.next()){
            String nombre = rset.getString("Pais");
            int pob = rset.getInt("poblacion");
            System.out.println(nombre + " " + pob);
            
        }
        connection.close();
    }
    
}
