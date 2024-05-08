/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
    private TimeZone ZonaHoraria;
    
    public ConexionMySql(String usuario, String pass,String bd){
        HOST="localhost";
        this.USUARIO=usuario;
        this.PASS=pass;
        this.BD=bd;
        connection=null;
    }
    
    private void registrarDriver()throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch(ClassNotFoundException e){
            throw new SQLException("ERROR");
        }
    }
    
    public void conector() throws SQLException{
        if((connection==null)||connection.isClosed()){
        registrarDriver();
        Calendar now= Calendar.getInstance();
        ZonaHoraria=now.getTimeZone();
        connection=(Connection) DriverManager.getConnection("jdbc:mysql://"+HOST+"/"+BD+"?user="+USUARIO+"&password="+PASS+"&userLegacyDateTimeCode=false& serverTimeZone="+ZonaHoraria.getID());
            System.out.println("conectado");
    }
    }
    
    public void desconector() throws SQLException{
        if((connection!=null)&&!connection.isClosed()){
        connection.close();
    }
    }
    
    public ResultSet ejecutarSelect (String consulta)throws SQLException{
        Statement stmt=connection.createStatement();
        return stmt.executeQuery(consulta);
    }
    
    public int ejecutarInsertDeleteUpdate(String consulta)throws SQLException{
        Statement stmt=connection.createStatement();
        return stmt.executeUpdate(consulta);
        
}
    
    
}
