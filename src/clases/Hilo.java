/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author familia
 */
public class Hilo implements Runnable{
    public static DataBase db; 
    public static String alias;
    public static String aliasJ1;
    public static String aliasJ2;
    public static String aliasJ3;
    public static String aliasJ4;
    public static int id;
    
    @Override
    public void run() {
        while(true){
            db.informe(aliasJ1, id);
            db.informe(aliasJ2, id);
            db.informe(aliasJ3, id);
            db.informe(aliasJ4, id);
            try {
                Thread.sleep(15);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
