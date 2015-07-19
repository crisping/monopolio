/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import clases.DataBase;
import interfaz.Login;

/**
 *
 * @author soul
 */
public class Juego {

    /**
     */
    
    //Atributos
    public Login login;
    public DataBase db;
    
    //Metodos
    public Juego(){
        db = new DataBase();
        if (db.conexion()) {
            login = new Login();
            
            db.desconexion();
        }
    }
    
    public static void main(String[] args) {
        Juego juego = new Juego();
    }
    
}
