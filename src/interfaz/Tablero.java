/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Banca;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author christian
 */
public class Tablero extends javax.swing.JFrame {

    /**
     * Creates new form tablero
     */
    public static String alias;
    
    private int turno = 0;              //Simula al jugador Actual
    private int jugarDado = 0;
    
    private int mover1 = 1;
    private int mover2 = 1;
    private int mover3 = 1;
    private int mover4 = 1;
    
    private int casa = 4;               //Maximo 4 por calle
    private int hotel = 1;              //Maximo 1 por calle
    
    private int dineroJugador1 = 15000;
    private int dineroJugador2 = 15000;
    private int dineroJugador3 = 15000;
    private int dineroJugador4 = 15000;     
    
    private int posicion_ficha1;
    private int posicion_ficha2;
    private int posicion_ficha3;
    private int posicion_ficha4;
    
    private int numCasilla1;
    private int numCasilla2;
    private int numCasilla3;
    private int numCasilla4;
    
    private int esquina = 1;
    private int esquina2 = 1;
    private int esquina3 = 1;
    private int esquina4 = 1;
    
    private int paso;
    private int paso2;
    private int paso3;
    private int paso4;
    
    private String cadena1 = "";
    private String cadena2 = "";
    private String cadena3 = "";
    private String cadena4 = "";
    private String cadenaDinero1;
    private String cadenaDinero2;
    private String cadenaDinero3;
    private String cadenaDinero4;
    
    private int avanzarCasillas;
    private int valorDado1;
    private int valorDado2; 
    
    private int numCalleAñil = 2;       //Maximo numero de calles 2
    private int numCalleCeleste = 3;    //Maximo numero de calles 3
    private int numCalleMorado = 3;     //Maximo numero de calles 3
    private int numCalleNaranja = 3;    //Maximo numero de calles 3
    private int numCalleRojo = 3;       //Maximo numero de calles 3
    private int numCalleAmarillo= 3;    //Maximo numero de calles 3
    private int numCalleVerde = 3;      //Maximo numero de calles 3
    private int numCalleAzul = 3;       //Maximo numero de calles 2
    private int numEstacion = 4;
    private int numCompañia = 2;
    
    private int valorCasaAñil = 100;      
    private int valorCasaCeleste = 300;       
    private int valorCasaMorado = 500;     
    private int valorCasaNaranja = 700;    
    private int valorCasaRojo = 1000;       
    private int valorCasaAmarillo= 1100;    
    private int valorCasaVerde = 1300;      
    private int valorCasaAzul = 2000;
    
    private int valorCasa4Añil =  1600;
    private int valorCasa4Celeste = 4000;
    private int valorCasa4Morado =  6250;
    private int valorCasa4Naranja = 7500;
    private int valorCasa4Rojo =  9250;
    private int valorCasa4Amarillo =  9750;
    private int valorCasa4Verde =  11000;
    private int valorCasa4Azul =  16000;
    
    private int valorHotelAñil = 2500;
    private int valorHotelCeleste = 5500;
    private int valorHotelMorado = 7500;
    private int valorHotelNaranja = 9500;
    private int valorHotelRojo = 11000;
    private int valorHotelAmarillo = 11500;
    private int valorHotelVerde = 12750;
    private int valorHotelAzul = 20000;
    
    private int aumentoValorCasa2 = 3;
    private int aumentoValorCasa3 = 9;
    
    private final int valorCalleAñil = 600;
    private final int valorCalleCeleste = 1100;
    private final int valorCalleMorado = 1500;
    private final int valorCalleNaranja = 1900;
    private final int valorCalleRojo = 2300;
    private final int valorCalleAmarillo = 2700;
    private final int valorCalleVerde = 3100;
    private final int valorCalleAzul = 3750;
    private final int valorEstacion = 2000;
    private final int valorCompañia = 1500;
    
    
    private final int pagarCalleAñil = 20;
    private final int pagarCalleCeleste = 60;
    private final int pagarCalleMorado = 100;
    private final int pagarCalleNaranja = 140;
    private final int pagarCalleRojo = 200;
    private final int pagarCalleAmarillo = 220;
    private final int pagarCalleVerde = 260;
    private final int pagarCalleAzul = 500;
    private final int pagarPorEstacion = 250;
    private final int impuesto = 1000;
     
    private int[] propiedadCompradaPor = new int[40];
    private int[] dineroJugadores = new int[4];
    
    private int numCasilla[] = {0,0,0,0};
    private int xPosFicha, yPosFicha;
    
    public Tablero() {
        
        initComponents();
        
        inicializar(propiedadCompradaPor);
        inicializarDinero(dineroJugadores);
        
        mostrar(propiedadCompradaPor);
        mostrarDinero(dineroJugadores);
        
        PagarActualizar();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelAdorno = new javax.swing.JLabel();
        jLabelFicha1 = new javax.swing.JLabel();
        jLabelFicha3 = new javax.swing.JLabel();
        jLabelFicha2 = new javax.swing.JLabel();
        jLabelFicha4 = new javax.swing.JLabel();
        jLabelTablero = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnJugarDado = new javax.swing.JButton();
        txtDado1 = new javax.swing.JTextField();
        txtDado2 = new javax.swing.JTextField();
        txtAvanzarCasillas = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTurno = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtDineroJugador1 = new javax.swing.JTextField();
        txtDineroJugador2 = new javax.swing.JTextField();
        txtDineroJugador3 = new javax.swing.JTextField();
        txtDineroJugador4 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(571, 0, -1, -1));

        jLabelAdorno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/login.logo.png"))); // NOI18N
        getContentPane().add(jLabelAdorno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 190, -1));

        jLabelFicha1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_rojo.png"))); // NOI18N
        jLabelFicha1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha1MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 610, 30, -1));

        jLabelFicha3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_azul_1.png"))); // NOI18N
        jLabelFicha3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha3MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha3, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 610, -1, -1));

        jLabelFicha2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_naranja_1.png"))); // NOI18N
        jLabelFicha2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha2MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 660, -1, 30));

        jLabelFicha4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/p_verde_1.png"))); // NOI18N
        jLabelFicha4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelFicha4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabelFicha4, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 660, -1, -1));

        jLabelTablero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/tablero.jpg"))); // NOI18N
        jLabelTablero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelTableroMouseClicked(evt);
            }
        });
        jLabelTablero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabelTableroKeyPressed(evt);
            }
        });
        getContentPane().add(jLabelTablero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 230, -1, -1));

        btnJugarDado.setText("Jugar Dado");
        btnJugarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarDadoActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugarDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 60, 100, -1));
        getContentPane().add(txtDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 20, 40, 30));
        getContentPane().add(txtDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, 40, 30));
        getContentPane().add(txtAvanzarCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 40, -1));

        jLabel1.setText("Avanzar Casillas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 50, -1, -1));

        jLabel2.setText("Turno");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, -1));
        getContentPane().add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 20, 50, -1));

        jLabel3.setText("Banco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, -1, -1));

        jLabel4.setText("jugador1");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 190, -1, -1));

        jLabel5.setText("jugador2");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 240, -1, -1));

        jLabel6.setText("jugador3");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 290, -1, -1));

        jLabel7.setText("jugador4");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 340, -1, -1));
        getContentPane().add(txtDineroJugador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 190, 60, -1));
        getContentPane().add(txtDineroJugador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, 60, -1));
        getContentPane().add(txtDineroJugador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 290, 60, -1));
        getContentPane().add(txtDineroJugador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 340, 60, -1));

        jLabel8.setText("Dinero");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelTableroKeyPressed

    }//GEN-LAST:event_jLabelTableroKeyPressed

    private void jLabelTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTableroMouseClicked

    }//GEN-LAST:event_jLabelTableroMouseClicked
   
    private void jLabelFicha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha1MouseClicked
       
    }//GEN-LAST:event_jLabelFicha1MouseClicked

    private void btnJugarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDadoActionPerformed
        
        if (jugarDado >= 4){
            jugarDado = 1;           
        }else{
            jugarDado = jugarDado + 1;
        }
        
        if (turno >= 4){
            turno = 1;
        }else{
            turno = turno +1;
        }
              
        cadena4 = String.valueOf(turno);           
        txtTurno.setText(cadena4);
        
        Random r1 = new Random();
        Random r2 = new Random();
        
        valorDado1 = r1.nextInt(6)+1;
        valorDado2 = r2.nextInt(6)+1;
        
        avanzarCasillas = valorDado1 + valorDado2; 
        
        cadena1 = String.valueOf(valorDado1);
        cadena2 = String.valueOf(valorDado2);       
        cadena3 = String.valueOf(avanzarCasillas);
        
        txtDado1.setText(cadena1);
        txtDado2.setText(cadena2);
        txtAvanzarCasillas.setText(cadena3);
        
        if (turno == 1){
            numCasilla1 = numCasilla1 + avanzarCasillas;
            posicion_ficha1 = posicion_ficha1 + avanzarCasillas;
            System.out.println("turno: " + turno + " avanzar casillas: " + avanzarCasillas);
            
            if (mover1 == 1){
                moverFicha1();
            }else{
                if (mover1 < 1){
                    mover1 = mover1 + 1;
                }               
                if (mover1 >= 1){
                    mover1 = 1;
                    paso=1;
                    esquina=2;
                    posicion_ficha1=10;
                    numCasilla1 = 10;
                }
            }
        }
        
        if (turno == 2){
            numCasilla2 = numCasilla2 + avanzarCasillas;
            posicion_ficha2 = posicion_ficha2 + avanzarCasillas;       
            System.out.println("turno: " + turno + " avanzar casillas " + avanzarCasillas);
            
            if (mover2 == 1){
                moverFicha2();
            }else{
                if (mover2 < 1){
                    mover2 = mover2 + 1;
                }               
                if (mover2 >= 1){
                    mover2 = 1;
                    paso2=1;
                    esquina2=2;
                    posicion_ficha2=10;
                    numCasilla2 = 10;
                }
            }
            
        }
        
        if (turno == 3){
            numCasilla3 = numCasilla3 + avanzarCasillas;
            posicion_ficha3 = posicion_ficha3 + avanzarCasillas;   
            System.out.println("turno: " + turno + " avanzar casillas " + avanzarCasillas);
            
            if (mover3 == 1){
                moverFicha3();
            }else{
                if (mover3 < 1){
                    mover3 = mover3 + 1;
                }               
                if (mover3 >= 1){
                    mover3 = 1;
                    paso3=1;
                    esquina3=2;
                    posicion_ficha3=10;
                    numCasilla3 = 10;
                }
            }
        } 
        
        if (turno == 4){
            numCasilla4 = numCasilla4 + avanzarCasillas;
            posicion_ficha4 = posicion_ficha4 + avanzarCasillas;   
            System.out.println("turno: " + turno + " avanzar casillas " + avanzarCasillas);
            
            if (mover4 == 1){
                moverFicha4();
            }else{
                if (mover4 < 1){
                    mover4 = mover4 + 1;
                }               
                if (mover4 >= 1){
                    mover4 = 1;
                    paso4=1;
                    esquina4=2;
                    posicion_ficha4 = 10;
                    numCasilla4 = 10;
                }
            }
        }
        
        recibeBonus();
        
    }//GEN-LAST:event_btnJugarDadoActionPerformed

    private void jLabelFicha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha2MouseClicked
        
    }//GEN-LAST:event_jLabelFicha2MouseClicked

    private void jLabelFicha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha3MouseClicked
     
    }//GEN-LAST:event_jLabelFicha3MouseClicked

    private void jLabelFicha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha4MouseClicked
            
    }
    
    private void moviendoFicha(JLabel jLabelFicha, int numJugador,int dineroJugador){
        if(xPosFicha!=jLabelFicha.getLocation().x || yPosFicha!=jLabelFicha.getLocation().y){
            numCasilla[numJugador]+=avanzarCasillas;
            //txtDineroJugador1.setText(""+numCasilla[0]);
            if(numCasilla[numJugador]>=40){
                JOptionPane.showMessageDialog(this, "Ha recibido 2000");
                //Llamar a la funcion q le suma 2000
                numCasilla[numJugador]-=40;
                txtDineroJugador1.setText(""+numCasilla[numJugador]);
            }
           // mostrarTarjeta(numCasilla[numJugador],dineroJugador);
        }
    }
    
    

    /*private void jLabelFicha3MouseClicked(java.awt.event.MouseEvent evt) {                                          
        
    }//GEN-LAST:event_jLabelFicha4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tablero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tablero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnJugarDado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabelAdorno;
    private javax.swing.JLabel jLabelFicha1;
    private javax.swing.JLabel jLabelFicha2;
    private javax.swing.JLabel jLabelFicha3;
    private javax.swing.JLabel jLabelFicha4;
    private javax.swing.JLabel jLabelTablero;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtAvanzarCasillas;
    private javax.swing.JTextField txtDado1;
    private javax.swing.JTextField txtDado2;
    private javax.swing.JTextField txtDineroJugador1;
    private javax.swing.JTextField txtDineroJugador2;
    private javax.swing.JTextField txtDineroJugador3;
    private javax.swing.JTextField txtDineroJugador4;
    private javax.swing.JTextField txtTurno;
    // End of variables declaration//GEN-END:variables
   
    private void moverFicha1(){
        xPosFicha=jLabelFicha1.getLocation().x;
        yPosFicha=jLabelFicha1.getLocation().y;
        
        if (turno == 1 && jugarDado == 1){
            if (esquina == 1 || esquina == 5){
                if (paso == 4 || paso == 1){
                    posicion_ficha1 = posicion_ficha1 - 10;
                    paso = 10;   
                }

                if (posicion_ficha1 > 10){
                    esquina = 2;
                    paso = 1;
                }else{
                    jLabelFicha1.setLocation(620-(posicion_ficha1*56),635);
                    mostrarTarjeta(numCasilla1);                   
                }
            }
                                                                                         
            if (esquina == 2){
                if (paso == 1){
                    posicion_ficha1 = posicion_ficha1 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso = 2;
                }

                if (posicion_ficha1 > 10){
                    esquina = 3;
                }else{
                    jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    mostrarTarjeta(numCasilla1);
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina == 3){
                if (paso == 2){
                    posicion_ficha1 = posicion_ficha1 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso = 3;
                }

                if (posicion_ficha1 > 10){
                    esquina = 4;
                }else{
                    jLabelFicha1.setLocation(60+(55*posicion_ficha1),30);
                    mostrarTarjeta(numCasilla1);   
                }
            }

            if(esquina == 4){
                if(paso == 3){
                    posicion_ficha1 = posicion_ficha1 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso = 4;
                }

                if(posicion_ficha1 > 10){
                    esquina = 5;
                }else{
                    jLabelFicha1.setLocation(635, 60+(55*posicion_ficha1));
                    mostrarTarjeta(numCasilla1);
                }         
            }
        }
    }
    
    private void moverFicha2(){
        if (turno == 2 && jugarDado == 2){
            if (esquina2 == 1 || esquina2 == 5){
                if (paso2 == 4 || paso2 == 1){
                    posicion_ficha2 = posicion_ficha2 - 10;
                    paso2 = 10;
                }

                if (posicion_ficha2 > 10){
                    esquina2 = 2;
                    paso2 = 1;
                }else{
                    jLabelFicha2.setLocation(620-(posicion_ficha2*56),635);
                    mostrarTarjeta(numCasilla2);
                }
            }

            if (esquina2 == 2){
                if (paso2 == 1){
                    posicion_ficha2 = posicion_ficha2 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso2 = 2;
                }

                if (posicion_ficha2 > 10){
                    esquina2 = 3;
                }else{
                    jLabelFicha2.setLocation(30,635-(59*posicion_ficha2));
                    mostrarTarjeta(numCasilla2);
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina2 == 3){
                if (paso2 == 2){
                    posicion_ficha2 = posicion_ficha2 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso2 = 3;
                }

                if (posicion_ficha2 > 10){
                    esquina2 = 4;
                }else{
                    jLabelFicha2.setLocation(60+(55*posicion_ficha2),30);
                    mostrarTarjeta(numCasilla2);
                }
            }

            if(esquina2 == 4){
                if(paso2 == 3){
                    posicion_ficha2 = posicion_ficha2 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso2 = 4;
                }

                if(posicion_ficha2 > 10){
                    esquina2 = 5;
                }else{
                    jLabelFicha2.setLocation(635, 60+(55*posicion_ficha2));
                    mostrarTarjeta(numCasilla2);
                }         
            }
        }
    }
    
    private void moverFicha3(){
        if (turno == 3 && jugarDado == 3){
            if (esquina3 == 1 || esquina3 == 5){
                if (paso3 == 4 || paso3 == 1){
                    posicion_ficha3 = posicion_ficha3 - 10;
                    paso = 10;
                }

                if (posicion_ficha3 > 10){
                    esquina3 = 2;
                    paso3 = 1;
                }else{
                    jLabelFicha3.setLocation(620-(posicion_ficha3*56),635);
                    mostrarTarjeta(numCasilla3);
                }
            }

            if (esquina3 == 2){
                if (paso3 == 1){
                    posicion_ficha3 = posicion_ficha3 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso3 = 2;
                }

                if (posicion_ficha3 > 10){
                    esquina3 = 3;
                }else{
                    jLabelFicha3.setLocation(30,635-(59*posicion_ficha3));
                    mostrarTarjeta(numCasilla3);
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina3 == 3){
                if (paso3 == 2){
                    posicion_ficha3 = posicion_ficha3 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso3 = 3;
                }

                if (posicion_ficha3 > 10){
                    esquina3 = 4;
                }else{
                    jLabelFicha3.setLocation(60+(55*posicion_ficha3),30);
                    mostrarTarjeta(numCasilla3);
                }
            }

            if(esquina3 == 4){
                if(paso3 == 3){
                    posicion_ficha3 = posicion_ficha3 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso3 = 4;
                }

                if(posicion_ficha3 > 10){
                    esquina3 = 5;
                }else{
                    jLabelFicha3.setLocation(635, 60+(55*posicion_ficha3));
                    mostrarTarjeta(numCasilla3);
                }         
            }
        }
    }
    
    private void moverFicha4(){
        if (turno == 4 && jugarDado == 4){
            if (esquina4 == 1 || esquina4 == 5){
                if (paso4 == 4 || paso4 == 1){
                    posicion_ficha4 = posicion_ficha4 - 10;
                    paso4 = 10;
                }

                if (posicion_ficha4 > 10){
                    esquina4 = 2;
                    paso4 = 1;
                }else{
                    jLabelFicha4.setLocation(620-(posicion_ficha4*56),635);
                    mostrarTarjeta(numCasilla4);
                }
            }

            if (esquina4 == 2){
                if (paso4 == 1){
                    posicion_ficha4 = posicion_ficha4 - 10;
                    //jLabelFicha1.setLocation(30,635-(59*posicion_ficha1));
                    paso4 = 2;
                }

                if (posicion_ficha4 > 10){
                    esquina4 = 3;
                }else{
                    jLabelFicha4.setLocation(30,635-(59*posicion_ficha4));
                    mostrarTarjeta(numCasilla4);
                }        
                //jLabelFicha1.setLocation(30,635);
            }

            if(esquina4 == 3){
                if (paso4 == 2){
                    posicion_ficha4 = posicion_ficha4 - 10;
                   // jLabelFicha1.setLocation(60,30);
                    paso4 = 3;
                }

                if (posicion_ficha4 > 10){
                    esquina4 = 4;
                }else{
                    jLabelFicha4.setLocation(60+(55*posicion_ficha4),30);
                    mostrarTarjeta(numCasilla4);
                }
            }

            if(esquina4 == 4){
                if(paso4 == 3){
                    posicion_ficha4 = posicion_ficha4 - 10;
                   // jLabelFicha1.setLocation(40, 40);
                    paso4 = 4;
                }

                if(posicion_ficha4 > 10){
                    esquina4 = 5;
                }else{
                    jLabelFicha4.setLocation(635, 60+(55*posicion_ficha4));
                    mostrarTarjeta(numCasilla4);
                }         
            }
        }
    }
    
    private void PagarActualizar(){      
        
        System.out.println("Pagando");
        
        cadenaDinero1 = String.valueOf(dineroJugadores[0]); 
        txtDineroJugador1.setText(cadenaDinero1);
        
        cadenaDinero2 = String.valueOf(dineroJugadores[1]); 
        txtDineroJugador2.setText(cadenaDinero2);
        
        cadenaDinero3 = String.valueOf(dineroJugadores[2]); 
        txtDineroJugador3.setText(cadenaDinero3);
        
        cadenaDinero4 = String.valueOf(dineroJugadores[3]); 
        txtDineroJugador4.setText(cadenaDinero4);     
    
    }
     
    private void actualizarDinero(){
        
        if (turno == 1){                     
            cadenaDinero1 = String.valueOf(dineroJugadores[turno-1]); 
            txtDineroJugador1.setText(cadenaDinero1);
        }
        
        if (turno == 2){           
            cadenaDinero2 = String.valueOf(dineroJugadores[turno-1]); 
            txtDineroJugador2.setText(cadenaDinero2);
        }
        
        if (turno == 3){             
            cadenaDinero3 = String.valueOf(dineroJugadores[turno-1]); 
            txtDineroJugador3.setText(cadenaDinero3);
        }
        
        if (turno == 4){                     
            cadenaDinero4 = String.valueOf(dineroJugadores[turno-1]); 
            txtDineroJugador4.setText(cadenaDinero4);
        }    
    }
    
    
    
    
    private void comprarCalleAñil(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleAñil;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                               
        }
    }
    
    private void comprarCalleCeleste(int numCasilla){
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleCeleste;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCalleMorado(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleMorado;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCalleNaranja(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleNaranja;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCalleRojo(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleRojo;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCalleAmarillo(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleAmarillo;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCalleVerde(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleVerde;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCalleAzul(int numCasilla){
    int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCalleAzul;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarEstacion(int numCasilla){
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorEstacion;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    private void comprarCompañia(int numCasilla){
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar esta casilla?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCompañia;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casilla
                actualizarDinero();
            }                                                              
        }
    }
    
    
    
    
    
      
    
    private void pagarCalleAñil(int numCasilla){
        
        JOptionPane.showMessageDialog(this, "soy Pagar Añil");
        System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleAñil < 2) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleAñil;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleAñil;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAñil == 2) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleAñil*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleAñil*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAñil == 2) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAñil);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAñil);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAñil == 2) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAñil*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAñil*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAñil == 2) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAñil*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAñil*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAñil == 2) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Añil);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Añil);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAñil == 2) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelAñil);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelAñil);
                    PagarActualizar();
                }
            }          
    }
    
    private void pagarCalleCeleste(int numCasilla){
            JOptionPane.showMessageDialog(this, "soy Pagar Celeste");
            System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleCeleste < 3) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleCeleste;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleCeleste;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleCeleste*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleCeleste*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaCeleste);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaCeleste);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaCeleste*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaCeleste*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaCeleste*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaCeleste*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Celeste);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Celeste);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelCeleste);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelCeleste);
                    PagarActualizar();
                }
            }
            
    }
    
    private void pagarCalleMorado(int numCasilla){
            JOptionPane.showMessageDialog(this, "soy Pagar Morado");
            System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleMorado < 3) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleMorado;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleMorado;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleMorado == 3) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleMorado*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleMorado*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleMorado == 3) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaMorado);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaMorado);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleMorado == 3) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaMorado*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaMorado*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleMorado == 3) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaMorado*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaMorado*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleMorado == 3) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaMorado);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Morado);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleMorado == 3) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelMorado);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelMorado);
                    PagarActualizar();
                }
            }
            
    }

    private void pagarCalleNaranja(int numCasilla){
            JOptionPane.showMessageDialog(this, "soy Pagar Naranja");
            System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleNaranja < 3) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleNaranja;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleNaranja;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleNaranja == 3) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleNaranja*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleNaranja*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleNaranja == 3) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaNaranja);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaNaranja);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleNaranja == 3) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaNaranja*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaNaranja*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleNaranja == 3) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaNaranja*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaNaranja*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleNaranja == 3) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Naranja);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Naranja);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleCeleste == 3) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelCeleste);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelCeleste);
                    PagarActualizar();
                }
            }
            
    }
    
    private void pagarCalleRojo(int numCasilla){
            JOptionPane.showMessageDialog(this, "soy Pagar Rojo");
            System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleRojo < 3) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleRojo;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleRojo;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleRojo == 3) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleRojo*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleRojo*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleRojo == 3) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaRojo);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaRojo);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleRojo == 3) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaRojo*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaRojo*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleRojo == 3) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaRojo*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaRojo*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleRojo == 3) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Rojo);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Rojo);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleRojo == 3) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelRojo);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelRojo);
                    PagarActualizar();
                }
            }
            
    }
    
    private void pagarCalleAmarillo(int numCasilla){
            JOptionPane.showMessageDialog(this, "soy Pagar Amarillo");
            System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleAmarillo < 3) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleAmarillo;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleAmarillo;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAmarillo == 3) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleAmarillo*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleAmarillo*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAmarillo == 3) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAmarillo);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAmarillo);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAmarillo == 3) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAmarillo*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAmarillo*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAmarillo == 3) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAmarillo*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAmarillo*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAmarillo == 3) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Amarillo);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Amarillo);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAmarillo == 3) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelAmarillo);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelAmarillo);
                    PagarActualizar();
                }
            }
            
    }
    
    private void pagarCalleVerde(int numCasilla){
            JOptionPane.showMessageDialog(this, "soy Pagar Verde");
            System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleVerde < 3) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleVerde;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleVerde;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleVerde == 3) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleVerde*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleVerde*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleVerde == 3) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaVerde);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaVerde);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleVerde == 3) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaVerde*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaVerde*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleVerde == 3) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaVerde*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaVerde*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 3 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleVerde == 3) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Verde);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Verde);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleVerde == 3) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelVerde);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelVerde);
                    PagarActualizar();
                }
            }
            
    }
    
    private void pagarCalleAzul(int numCasilla){
        
        JOptionPane.showMessageDialog(this, "soy Pagar Azul");
        System.out.println("el jugador " + turno + " le paga a jugador " + propiedadCompradaPor[numCasilla]);
            
            // pago normal
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCalleAzul < 2) {
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarCalleAzul;
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarCalleAzul;
                    PagarActualizar();
                }
            }  
            //pago doble por tener las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAzul == 2) && (casa == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (pagarCalleAzul*2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (pagarCalleAzul*2);
                    PagarActualizar();
                }
            }
            //pago con una casa y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAzul == 2) && (casa == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAzul);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAzul);
                    PagarActualizar();
                }
            }
            // pago con dos casas y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAzul == 2) && (casa == 2)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAzul*aumentoValorCasa2);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAzul*aumentoValorCasa2);
                    PagarActualizar();
                }
            }
            // Pago con 3 casas y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAzul == 2) && (casa == 3)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasaAzul*aumentoValorCasa3);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasaAzul*aumentoValorCasa3);
                    PagarActualizar();
                }
            }
            // Pago con 4 casas y las 2 calles
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAzul == 2) && (casa == 4) && (hotel == 0)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorCasa4Azul);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorCasa4Azul);
                    PagarActualizar();
                }
            }
            //Pago de Hotel
            if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCalleAzul == 2) && (casa == 4) && (hotel == 1)){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - (valorHotelAzul);
                
                if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                    dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + (valorHotelAzul);
                    PagarActualizar();
                }
            }          
    }
    
    private void pagarEstacion(int numCasilla){
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numEstacion == 1) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarPorEstacion;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarPorEstacion;
                PagarActualizar();
            }
        }
        
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numEstacion == 2) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarPorEstacion*2;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarPorEstacion*2;
                PagarActualizar();
            }
        }
        
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numEstacion == 3) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarPorEstacion*4;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarPorEstacion*4;
                PagarActualizar();
            }
        }
        
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numEstacion == 4) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - pagarPorEstacion*8;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + pagarPorEstacion*8;
                PagarActualizar();
            }
        }
    }
    
    private void pagarCompañia(int numCasilla){
        
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCompañia == 1) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - avanzarCasillas*4;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + avanzarCasillas*4;
                PagarActualizar();
            }
        }
        
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCompañia == 2) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - avanzarCasillas*10;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + avanzarCasillas*10;
                PagarActualizar();
            }
        }
    }
    
    private void pagarImpuesto(int numCasilla){
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCasilla == 38)) {
            JOptionPane.showMessageDialog(this, " Impuesto Cobrado ");
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - impuesto;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + impuesto;
                PagarActualizar();
            }
        }
        
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && (numCasilla == 4)) {
            JOptionPane.showMessageDialog(this, " Impuesto Cobrado ");
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - impuesto*2;
                
            if (propiedadCompradaPor[numCasilla] == 1 || propiedadCompradaPor[numCasilla] == 2 || propiedadCompradaPor[numCasilla] == 3 || propiedadCompradaPor[numCasilla] == 4 ){
                dineroJugadores[propiedadCompradaPor[numCasilla]-1] = dineroJugadores[propiedadCompradaPor[numCasilla]-1] + impuesto*2;
                PagarActualizar();
            }
        }
    }
    
    
    
    
    
    private void mostrarTarjeta(int numCasilla) {
        int opcion;
        
        //Inicio Del Sector Añil
        if(numCasilla==1){           
            comprarCalleAñil(numCasilla);
        }else{
            if(numCasilla==1 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAñil(numCasilla);
                JOptionPane.showMessageDialog(this, "Paga");
            }
        }
              
        if(numCasilla==3 && propiedadCompradaPor[numCasilla] == 0){           
            comprarCalleAñil(numCasilla);          
        }else{
            if(numCasilla==3 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAñil(numCasilla);
                JOptionPane.showMessageDialog(this, "Paga");
            }
        }      
        //fin Del Sector Añil
        
        
        // Inicio Del Sector Celeste
        if(numCasilla==6 && propiedadCompradaPor[numCasilla] == 0){           
            comprarCalleCeleste(numCasilla);
        }else{
            if(numCasilla==6 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleCeleste(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==8 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleCeleste(numCasilla);
        }else{
            if(numCasilla==8 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleCeleste(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==9 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleCeleste(numCasilla);
        }else{
            if(numCasilla==9 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleCeleste(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Celeste
        
        
        // Inicio Del Sector Morado
        if(numCasilla==11 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleMorado(numCasilla);
        }else{
            if(numCasilla==11 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleMorado(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==13 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleMorado(numCasilla);
        }else{
            if(numCasilla==13 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleMorado(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==14 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleMorado(numCasilla);
        }else{
            if(numCasilla==14 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleMorado(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Morado
        
        
        // Inicio Del Sector Naranja
        if(numCasilla==16 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleNaranja(numCasilla);
        }else{
            if(numCasilla==16 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleNaranja(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==18 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleNaranja(numCasilla);
        }else{
            if(numCasilla==18 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleNaranja(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==19 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleNaranja(numCasilla);
        }else{
            if(numCasilla==19 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleNaranja(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Naranja
        
        
        // Inicio Del Sector Rojo
        if(numCasilla==21 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleRojo(numCasilla);
        }else{
            if(numCasilla==21 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleRojo(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==23 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleRojo(numCasilla);
        }else{
            if(numCasilla==23 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleRojo(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==24 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleRojo(numCasilla);
        }else{
            if(numCasilla==24 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleRojo(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Rojo
        
        
        //Inicio Del Sector Amarillo        
        if(numCasilla==26 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleAmarillo(numCasilla);
        }else{
            if(numCasilla==26 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAmarillo(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==27 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleAmarillo(numCasilla);
        }else{
            if(numCasilla==27 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAmarillo(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==29 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleAmarillo(numCasilla);
        }else{
            if(numCasilla==29 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAmarillo(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Amarillo
        
        
        // Inicio Del Sector Verde
        if(numCasilla==31 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleVerde(numCasilla);
        }else{
            if(numCasilla==31 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleVerde(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==32 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleVerde(numCasilla);
        }else{
            if(numCasilla==32 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleVerde(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==34 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleVerde(numCasilla);
        }else{
            if(numCasilla==34 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleVerde(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Verde
        
        
        // Inicio Del Sector Azul
        if(numCasilla==37 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleAzul(numCasilla);
        }else{
            if(numCasilla==37 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAzul(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==39 && propiedadCompradaPor[numCasilla] == 0){
            comprarCalleAzul(numCasilla);
        }else{
            if(numCasilla==39 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAzul(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        // Fin Del Sector Azul
        
        
        // Inicio de Estaciones
        if(numCasilla==5 && propiedadCompradaPor[numCasilla] == 0){
            comprarEstacion(numCasilla);
        }else{
            if(numCasilla==5 && propiedadCompradaPor[numCasilla] != 0){
                pagarEstacion(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==15 && propiedadCompradaPor[numCasilla] == 0){
            comprarEstacion(numCasilla);
        }else{
            if(numCasilla==15 && propiedadCompradaPor[numCasilla] != 0){
                pagarEstacion(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==25 && propiedadCompradaPor[numCasilla] == 0){
            comprarEstacion(numCasilla);
        }else{
            if(numCasilla==25 && propiedadCompradaPor[numCasilla] != 0){
                pagarEstacion(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==35 && propiedadCompradaPor[numCasilla] == 0){
            comprarEstacion(numCasilla);
        }else{
            if(numCasilla==35 && propiedadCompradaPor[numCasilla] != 0){
                pagarEstacion(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        //Fin de estaciones
        
        
        //Inicio de Compañias
        if(numCasilla==12 && propiedadCompradaPor[numCasilla] == 0){
            comprarCompañia(numCasilla);
        }else{
            if(numCasilla==12 && propiedadCompradaPor[numCasilla] != 0){
                pagarCompañia(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        
        if(numCasilla==28 && propiedadCompradaPor[numCasilla] == 0){
            comprarCompañia(numCasilla);
        }else{
            if(numCasilla==28 && propiedadCompradaPor[numCasilla] != 0){
                pagarCompañia(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
        //Fin de compañias
        
        
        //inicio De Suerte 
        if(numCasilla==7){          
            JOptionPane.showMessageDialog(this, "Casilla De Suerte");
        }
        
        if(numCasilla==22){          
            JOptionPane.showMessageDialog(this, "Casilla De Suerte");
        }
        
        if(numCasilla==36){          
            JOptionPane.showMessageDialog(this, "Casilla De Suerte");
        }
        //Fin de Suerte 
        
        
        //Inicio de Caja Comunal
        if(numCasilla==2){          
            JOptionPane.showMessageDialog(this, "Caja Comunal");
        }
        
        if(numCasilla==17){          
            JOptionPane.showMessageDialog(this, "Caja Comunal");
        }
        
        if(numCasilla==33){          
            JOptionPane.showMessageDialog(this, "Caja Comunal");
        }
        //Fin Caja Comunal
        
        
        //Inicio Casillas Especiales
        if(numCasilla==30){
            int opcion2;
            JOptionPane.showMessageDialog(this, "Has Sido Enviado A La Carcel");
            opcion2 = JOptionPane.showConfirmDialog(this, "Si quieres Salie de la Carcel Debes esperar un Turno y pagar 500Bs");
            
            if (opcion2 == JOptionPane.YES_NO_OPTION){
                if (turno == 1){
                    jLabelFicha1.setLocation(35, 635);
                    mover1 = 0;
                    
                }
                if (turno == 2){
                    jLabelFicha2.setLocation(35, 635);
                    mover2 = 0;
                }
                if (turno == 3){
                    jLabelFicha3.setLocation(35, 635);
                    mover3 = 0;
                }
                if (turno == 4){
                    jLabelFicha4.setLocation(35, 635);
                    mover4 = 0;
                }          
            }
            
            if (opcion2 == JOptionPane.NO_OPTION){
                if (turno == 1){
                    jLabelFicha1.setLocation(35, 635);
                    mover1 = -3;
                }
                if (turno == 2){
                    jLabelFicha2.setLocation(35, 635);
                    mover2 = -3;
                }
                if (turno == 3){
                    jLabelFicha3.setLocation(35, 635);
                    mover3 = -3;
                }
                if (turno == 4){
                    jLabelFicha4.setLocation(35, 635);
                    mover4 = -3;
                }
            }
            
        }       
        //Fin Casillas Especiales
    }
    
    
    
    
    private void inicializar(int vector[]){
        int i;
        for(i = 0; i<40; i++){
            vector[i] = 0;
        }
    }
    
    private void inicializarDinero(int vector[]){
        int i;
        for(i = 0; i<4; i++){
            vector[i] = 15000;
        }
    }
    
    private void mostrar(int vector[]){
        int i;
        for(i = 0; i<40; i++){
            System.out.println(vector[i]);
        }
    }
    
    private void mostrarDinero(int vector[]){
        int i;
        for(i = 0; i<4; i++){
            System.out.println(vector[i]);
        }
    }
    
    private void recibeBonus(){
        if (numCasilla1 >= 40){
            numCasilla1 = numCasilla1 - 40;
            dineroJugadores[0] = dineroJugadores[0] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000");
        }
        if (numCasilla2 >= 40){
            numCasilla2 = numCasilla2 - 40;
            dineroJugadores[1] = dineroJugadores[1] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000");
        }
        if (numCasilla3 >= 40){
            numCasilla3 = numCasilla3 - 40;
            dineroJugadores[2] = dineroJugadores[2] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000");
        }
        if (numCasilla4 >= 40){
            numCasilla4 = numCasilla4 - 40;
            dineroJugadores[3] = dineroJugadores[3] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000");
        }
    }
    
}
