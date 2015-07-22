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
        String url = "jdbc:postgresql://192.168.0.103:5432/monopolio";
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
        sql = "select * from informes where id = '"+id+"'";
        ArrayList<InformePartida> inf = new ArrayList<>();
        try {
            rs = st.executeQuery(sql);
            
            while(rs.next()){
                InformePartida nueva = new InformePartida(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
                inf.add(nueva);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        if (inf.isEmpty()) return null;
        return inf;
    }
    
    public void cargarPropiedades( Partida p){
        try {
            sql = "select numero from propiedades where id = '"+p.getId()+"' and alias = '"+p.getAliasJ1()+"'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                p.propiedades[rs.getInt(1)] = 1;
            }
            sql = "select numero from propiedades where id = '"+p.getId()+"' and alias = '"+p.getAliasJ2()+"'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                p.propiedades[rs.getInt(1)] = 2;
            }
            if (Integer.parseInt(p.getCantiadJugadores()) > 2){
                sql = "select numero from propiedades where id = '"+p.getId()+"' and alias = '"+p.getAliasJ3()+"'";
                rs = st.executeQuery(sql);
                while(rs.next()){
                    p.propiedades[rs.getInt(1)] = 3;
                }
            }
            if (Integer.parseInt(p.getCantiadJugadores()) > 3){
                sql = "select numero from propiedades where id = '"+p.getId()+"' and alias = '"+p.getAliasJ4()+"'";
                rs = st.executeQuery(sql);
                while(rs.next()){
                    p.propiedades[rs.getInt(1)] = 3;
                }
            }
        } catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public void guardarPropiedades(Partida p){
        for (int i=0; i<40; i++){
            try{
                if (p.propiedades[i] != 0) {
                    switch (p.propiedades[i]){
                        case 1:
                            sql = "insert into propiedades(id, alias, numero) "+
                            "values('"+p.getId()+"','"+p.getAliasJ1()+"','"+i+"')";
                        break;
                        case 2:
                            sql = "insert into propiedades(id, alias, numero) "+
                            "values('"+p.getId()+"','"+p.getAliasJ2()+"','"+i+"')";
                        break;
                        case 3:
                            sql = "insert into propiedades(id, alias, numero) "+
                            "values('"+p.getId()+"','"+p.getAliasJ3()+"','"+i+"')";
                        break;
                            case 4:
                            sql = "insert into propiedades(id, alias, numero) "+
                            "values('"+p.getId()+"','"+p.getAliasJ4()+"','"+i+"')";
                        break;
                    }
                    rs = st.executeQuery(sql);
                }
            } catch (SQLException ex) {
                //JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }
    
    public void setPartida(Partida p){
        try{
            sql = "update jugadores set dinero = '"+p.getDineroJ1()+"',"+
                    "posicion = '"+p.getCasillaJ1()+"' where alias = '"+p.getAliasJ1()+"'"+
                    " and partida = '"+p.getId()+"'";
            rs = st.executeQuery(sql);
            sql = "update jugadores set dinero = '"+p.getDineroJ2()+"',"+
                    "posicion = '"+p.getCasillaJ2()+"' where alias = '"+p.getAliasJ2()+"'"+
                    " and partida = '"+p.getId()+"'";
            rs = st.executeQuery(sql);
            if (Integer.parseInt(p.getCantiadJugadores()) > 2) {
                sql = "update jugadores set dinero = '"+p.getDineroJ3()+"',"+
                    "posicion = '"+p.getCasillaJ3()+"' where alias = '"+p.getAliasJ3()+"'"+
                    " and partida = '"+p.getId()+"'";
            rs = st.executeQuery(sql);
            }
            if (Integer.parseInt(p.getCantiadJugadores()) > 3) {
                sql = "update jugadores set dinero = '"+p.getDineroJ4()+"',"+
                    "posicion = '"+p.getCasillaJ4()+"' where alias = '"+p.getAliasJ4()+"'"+
                    " and partida = '"+p.getId()+"'";
            rs = st.executeQuery(sql);
            }
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
    }
    
    public Partida getPartida(String id){
        Partida p= new Partida();
        try {
            sql = "select * from partidas where id = '"+id+"'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                p.setId(rs.getString(1));
                p.setDineroPorVuelta(rs.getString(9));
                p.setFianza(rs.getString(12));
            }
            sql = "select count(*) from jugadores where partida = '"+id+"'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                p.setCantiadJugadores(rs.getString(1));
            }
            sql = "select * from jugadores where partida = '"+id+"'";
            rs = st.executeQuery(sql); int i = 1;
            while (rs.next()){
                switch (i) {
                    case 1: p.setAliasJ1(rs.getString(1)); 
                            p.setDineroJ1(rs.getString(6));
                            p.setCasillaJ1(rs.getString(5)); break;
                    case 2: p.setAliasJ2(rs.getString(1));
                            p.setDineroJ2(rs.getString(6));
                            p.setCasillaJ2(rs.getString(5)); break;
                    case 3: p.setAliasJ3(rs.getString(1));
                            p.setDineroJ3(rs.getString(6));
                            p.setCasillaJ3(rs.getString(5)); break;
                    case 4: p.setAliasJ4(rs.getString(1)); 
                            p.setDineroJ4(rs.getString(6));
                            p.setCasillaJ2(rs.getString(4)); break;
                }
                i++;
            }
        }
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex.getMessage());
            return null;
        }
        return p;
    }

    //pendiente
    public boolean informe(String alias, int id) {
        sql = "actualizar_informe('"+alias+"','"+id+"')";
        try {
            rs = st.executeQuery(sql);
            if (!rs.next()) return true;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return false;
    }
    
}