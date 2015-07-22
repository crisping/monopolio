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
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author soul
 */
public class DataBase {
    //Atributos
    private Connection connection = null;
    private ResultSet rs = null;
    private Statement st = null;
    private String sql = null;
    //Metodos
    public boolean conexion(){
        if (connection != null) {
            return false;
        }
        //cambiar 192.168.0.100 por la ip de la pc en la que esta alojada la base de datos
        //o simplemente localhost para que se conecte a la misma pc.
        String url = "jdbc:postgresql://192.198.0.103:5432/monopolio";
        String password = "uneg";
        try {
            Class.forName("org.postgresql.Driver");

            connection = DriverManager.getConnection(url, "proyecto", password);

            if (connection != null) {
                System.out.println("Conectando a Base de Datos...");
                st= connection.createStatement();
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
                
                rs = st.executeQuery(sql);
                
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
                
                return st.executeUpdate(sql)>0;
                
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
                
                return st.executeUpdate(sql)>0;
                
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e.getMessage());
                return false;
            }
        }
        return false;
    }
    
    public ArrayList<PartidaGuardada> getPartidasGuardadas(String alias) {
        String id, ida = "0";
        String aliass;
        boolean activa;
        int i = 0;
        try {
            ArrayList<PartidaGuardada> partidasGuardadas = new ArrayList<PartidaGuardada>();
            
            sql = "SELECT id, alias, activa, orden_t FROM " + 
            "(SELECT * FROM partidas join jugadores " +
            "ON partidas.id = jugadores.partida) AS A JOIN " +
            "(SELECT partida FROM jugadores WHERE alias = '"+alias+"'"+
            ") AS B ON A.id = B.partida order by id;";
            
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                aliass = rs.getString(2);
                id = rs.getString(1);
                activa = rs.getBoolean(3);
                PartidaGuardada nueva = null;
                if (!ida.equals(id)){
                    nueva = new PartidaGuardada();
                    nueva.setId(id);
                    nueva.setPartidaActiva(activa);
                    nueva.setAlias(aliass);
                    i = 1; ida = id;
                    partidasGuardadas.add(nueva);
                }
                else {
                    switch(i){
                        case 1:
                            partidasGuardadas.get(partidasGuardadas.size() - 1).setAliasJ2(aliass);
                            break;
                        case 2:
                            partidasGuardadas.get(partidasGuardadas.size() - 1).setAliasJ3(aliass);
                            break;
                        case 3:
                            partidasGuardadas.get(partidasGuardadas.size() - 1).setAliasJ4(aliass);
                            break;
                    } i += 1;                    
                }
            }
            if (partidasGuardadas.isEmpty()) return null;
            return partidasGuardadas;
        } catch (SQLException e) {
            return null;
        }
    
    
    }

    public boolean addPartida(int casas, int hoteles, int turnosCarcel, int duracion, int dineroInicial, int dineroPorVuelta, int impuestoLujo, int impuestoCapital, int fianza, String admin, String aliasJ1, String aliasJ2, String aliasJ3, String aliasJ4) {
        try {
            sql ="SELECT crear_partida("+casas+","+hoteles+","+ turnosCarcel+","+ duracion+","+ dineroInicial+","+ dineroPorVuelta+","+ impuestoLujo+","+ impuestoCapital+","+ fianza+",'"+ admin+"','"+ aliasJ1+"','"+ aliasJ2+"','"+ aliasJ3+"','"+aliasJ4+"')";
            
            rs = st.executeQuery(sql);
            
            if(rs.next()){
                return true;
            }
            else
                return false;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return false;
        }
    }

    public String getIdNuevaPartida() {
        try {
            sql = "SELECT MAX(id) FROM partidas";
        
        rs = st.executeQuery(sql);
        
        if(rs.next())
            return String.valueOf(rs.getInt(1)+1);
        return "1";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "-1";
        }
        
    }
    
    public String getIdUltimaPartida() {
        try {
            sql = "SELECT MAX(id) FROM partidas";
        
            rs = st.executeQuery(sql);
        
        if(rs.next())
            return String.valueOf(rs.getInt(1));
        return "1";
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return "-1";
        }
        
    }
    
    public ArrayList<Integer> getIdPartidasAdministrador(String administrador){
        ArrayList<Integer> a = new ArrayList<>();
        sql = "select id from partidas where administrador = '"+administrador+"' group by id";
        try {
            rs = st.executeQuery(sql);
            while (rs.next()){
                a.add(rs.getInt(1));
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (a.isEmpty()) return null;
        return a;
    }
    
    public ArrayList<InformePartida> getInformePartidas(String id){
        sql = "select * from informes where partida = '"+id+"'";
        ArrayList<InformePartida> inf = new ArrayList<>();
        try {
            rs = st.executeQuery(sql);
            InformePartida nueva = new InformePartida(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
            inf.add(nueva);
            while(rs.next()){
                
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (inf.isEmpty()) return null;
        return inf;
    }
    
}