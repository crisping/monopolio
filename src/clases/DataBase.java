/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author soul
 */
public class DataBase {
    //Atributos
    private Connection connection = null;
    private ResultSet rs = null;
    private Statement s = null;
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
            }
        } catch (Exception e) {
            System.out.println("Problemas de Conexión");
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
    
}
