/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.*;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.TimeZone;

/**
 *
 * @author Medac
 */
public class ConexionMySql {
    private String BD;
    private String USUARIO;
    private String PASS;
    
    private Connection connection;
    private String HOST;
    private TimeZone zonaHoraria;
    
    public ConexionMySql(String USUARIO, String PASS, String BD){
        this.USUARIO = USUARIO;
        this.PASS = PASS;
        this.BD = BD;
        HOST = "localhost";
        connection = null;
    }
    
    private void registrarDriver() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            throw new SQLException("Error");
        }
    }
    public void conector() throws SQLException{
        if ((connection == null) || connection.isClosed()) {
            registrarDriver();
            Calendar now = Calendar.getInstance();
            zonaHoraria = now.getTimeZone();
            connection = (Connection) DriverManager.getConnection("jdbc:mysql://" + HOST + "/" + BD + "?user="+ USUARIO + "&password=" + PASS + "&useLegacyDatetimeCode=false&serverTimezone=" + zonaHoraria.getID());         
        }
    }
    public void desconectar() throws SQLException{
        if ((connection != null) && !connection.isClosed()) {
            connection.close();
        }
    }
    public ResultSet ejecutarSelect(String consulta) throws SQLException{
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(consulta);
    }
    public int ejecutarInsertDeleteUpdate(String consulta) throws SQLException{
        Statement stmt =connection.createStatement();
        return stmt.executeUpdate(consulta);
        
    }
}
