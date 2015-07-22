/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clases;

import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author familia
 */
public class Hilo implements Runnable{
    public static DataBase db; 
    public static String alias;
    public static int id;
    @Override
    public void run() {
        while(true){
            try {
                this.wait(15);
                db.informe(alias, id);
            } catch (InterruptedException ex) {
                Logger.getLogger(Hilo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
