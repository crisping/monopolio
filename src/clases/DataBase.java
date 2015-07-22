/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author soul
 */
public class DataBase {
    //Atributos
    private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;
    private String sql = null;
    //Metodos
    public boolean conexion(){
        if (connection != null) {
            return false;
        }

        String url = "jdbc:postgresql://localhost:5432/monopolio";
        String password = "uneg";
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, "proyecto", password);

            if (connection != null) {
                System.out.println("Conectando a Base de Datos...");
                s= connection.createStatement();
            }
        } catch (Exception e) {
            System.out.println("Problemas de Conexión: "+e.getMessage());
            return false;
        }
        return true;
    }
    public boolean desconexion(){
        if (connection != null) {
            try {
                connection.close();
            }
            catch(Exception e){
                System.out.println("Problemas de Desconexión");
                return false;
            }
            return true;
        }
        return false;      
    }
    
    public boolean autenticarUsuario(String alias, String contraseña){
        if (connection != null) {
            try {
                sql = "SELECT 1 FROM usuarios WHERE alias='"+alias+"' AND contraseña='"+contraseña+"'";
                
                rs = s.executeQuery(sql);
                
                return rs.next();
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;      
    }
    
    public boolean registrarUsuario(String alias, String contraseña){
        if (connection != null) {
            try {
                sql = "INSERT INTO usuarios VALUES ('"+alias+"','"+contraseña+"',TRUE)";
                
                return s.executeUpdate(sql)>0;
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;      
    }

    public boolean setCambiarContraseña(String alias, String clave) {
        if (connection != null) {
            try {
                sql = "UPDATE usuarios "
                    + "SET contraseña='"+clave+"' "
                    + "WHERE alias='"+alias+"'";
                
                return s.executeUpdate(sql)>0;
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;
    }

    public ArrayList<PartidaGuardada> getPartidasGuardadas(String alias) {
        
        try {
            ArrayList<PartidaGuardada> partidaGuardadas = new ArrayList<PartidaGuardada>();
            sql = "SELECT ";
            
            while(rs.next()){

                //partidaGuardadas.add(new PartidaGuardada(rs.getString(0), rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getBoolean(0));

                
            }
            
            if(partidaGuardadas.size()==0)
                return null;
            else
                return partidaGuardadas;
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return null;
        }
    
    
    }
    
    
}
