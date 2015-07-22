/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.Banca;
import clases.Hilo;
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
    public Hilo hilo;//---
    
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
    
    private boolean j1Eliminado = false;
    private boolean j2Eliminado = false;
    private boolean j3Eliminado = false;
    private boolean j4Eliminado = false;
    
    public Tablero() {
        
        initComponents();
        
        inicializar(propiedadCompradaPor);
        inicializarDinero(dineroJugadores);
        
        mostrar(propiedadCompradaPor);
        mostrarDinero(dineroJugadores);
        
        PagarActualizar();
        
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        //hilo = new Hilo();
        //hilo.run();//--
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
        jLabel9 = new javax.swing.JLabel();

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
        getContentPane().add(btnJugarDado, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 450, 100, -1));
        getContentPane().add(txtDado1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 410, 40, 30));
        getContentPane().add(txtDado2, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 410, 40, 30));
        getContentPane().add(txtAvanzarCasillas, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 500, 40, -1));

        jLabel1.setText("Avanzar Casillas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 530, -1, 10));

        jLabel2.setText("Turno Jugador");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 610, -1, -1));
        getContentPane().add(txtTurno, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 580, 50, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setText("Banco");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 90, -1, -1));

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

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setText("Monopolio");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 30, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelTableroKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabelTableroKeyPressed

    }//GEN-LAST:event_jLabelTableroKeyPressed

    private void jLabelTableroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelTableroMouseClicked

    }//GEN-LAST:event_jLabelTableroMouseClicked
   
    private void jLabelFicha1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha1MouseClicked
       
    }//GEN-LAST:event_jLabelFicha1MouseClicked

    private void btnJugarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarDadoActionPerformed
            
        jugarDados();
        obtenerTurno(); 

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
        eliminarJugador();
        if (turno == 1 && !j1Eliminado){
            numCasilla1 = numCasilla1 + avanzarCasillas;
            posicion_ficha1 = posicion_ficha1 + avanzarCasillas;
    
            recibeBonus();
            //eliminarJugador();
            if (mover1 == 1){
                
                //moverFicha1();
                MoverFicha1();
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
        
        if (turno == 2 && !j2Eliminado){
            numCasilla2 = numCasilla2 + avanzarCasillas;
            posicion_ficha2 = posicion_ficha2 + avanzarCasillas;       
            
            recibeBonus();
            //eliminarJugador();
            if (mover2 == 1){
                
                MoverFicha2();
                //moverFicha2();
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
        
        if (turno == 3 && !j3Eliminado){
            numCasilla3 = numCasilla3 + avanzarCasillas;
            posicion_ficha3 = posicion_ficha3 + avanzarCasillas;   
            
            recibeBonus();
            //eliminarJugador();
            if (mover3 == 1){               
                MoverFicha3();
                //moverFicha3();
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
        
        if (turno == 4 && !j4Eliminado){
            numCasilla4 = numCasilla4 + avanzarCasillas;
            posicion_ficha4 = posicion_ficha4 + avanzarCasillas;   
            
            recibeBonus();
            //eliminarJugador();
            if (mover4 == 1){               
                MoverFicha4();
                //moverFicha4();
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
        
    }//GEN-LAST:event_btnJugarDadoActionPerformed

    private void jLabelFicha2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha2MouseClicked
        
    }//GEN-LAST:event_jLabelFicha2MouseClicked

    private void jLabelFicha3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha3MouseClicked
     
    }//GEN-LAST:event_jLabelFicha3MouseClicked

    private void jLabelFicha4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelFicha4MouseClicked
            
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
    private javax.swing.JLabel jLabel9;
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
    
    private void MoverFicha1(){
        switch(numCasilla1){
            
            case 0:{
                jLabelFicha1.setLocation(620,635);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 1:{
                jLabelFicha1.setLocation(564,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 2:{
                jLabelFicha1.setLocation(508,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 3:{
                jLabelFicha1.setLocation(452,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 4:{
                jLabelFicha1.setLocation(396,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 5:{
                jLabelFicha1.setLocation(340,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 6:{
                jLabelFicha1.setLocation(284,635);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 7:{
                jLabelFicha1.setLocation(228,635);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 8:{
                jLabelFicha1.setLocation(172,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 9:{
                jLabelFicha1.setLocation(116,635);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 10:{
                jLabelFicha1.setLocation(30,635);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 11:{
                jLabelFicha1.setLocation(30,576);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 12:{
                jLabelFicha1.setLocation(30,517);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 13:{
                jLabelFicha1.setLocation(30,458);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 14:{
                jLabelFicha1.setLocation(30,399);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 15:{
                jLabelFicha1.setLocation(30,340);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 16:{
                jLabelFicha1.setLocation(30,281);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 17:{
                jLabelFicha1.setLocation(30,222);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 18:{
                jLabelFicha1.setLocation(30,163);
                mostrarTarjeta(numCasilla1);
            }break;    
            
            case 19:{
                jLabelFicha1.setLocation(30,104);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 20:{
                jLabelFicha1.setLocation(30,45);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 21:{
                jLabelFicha1.setLocation(115,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 22:{
                jLabelFicha1.setLocation(170,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 23:{
                jLabelFicha1.setLocation(225,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 24:{
                jLabelFicha1.setLocation(275,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 25:{
                jLabelFicha1.setLocation(330,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 26:{
                jLabelFicha1.setLocation(385,30);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 27:{
                jLabelFicha1.setLocation(440,30);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 28:{
                jLabelFicha1.setLocation(495,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 29:{
                jLabelFicha1.setLocation(550,30);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 30:{
                jLabelFicha1.setLocation(550,30);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 31:{
                jLabelFicha1.setLocation(635,115);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 32:{
                jLabelFicha1.setLocation(635,170);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 33:{
                jLabelFicha1.setLocation(635,225);
                mostrarTarjeta(numCasilla1);
            }break;
            
            case 34:{
                jLabelFicha1.setLocation(635,280);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 35:{
                jLabelFicha1.setLocation(635,335);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 36:{
                jLabelFicha1.setLocation(635,390);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 37:{
                jLabelFicha1.setLocation(635,445);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 38:{
                jLabelFicha1.setLocation(635,500);
                mostrarTarjeta(numCasilla1);
            }break;    
            
            case 39:{
                jLabelFicha1.setLocation(635,555);
                mostrarTarjeta(numCasilla1);
            }break;
                
            case 40:{
                jLabelFicha1.setLocation(635,610);
                mostrarTarjeta(numCasilla1);
            }break;  
        }
    }
    
    private void MoverFicha2(){
        switch(numCasilla2){
            
            case 0:{
                jLabelFicha2.setLocation(620,635);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 1:{
                jLabelFicha2.setLocation(564,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 2:{
                jLabelFicha2.setLocation(508,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 3:{
                jLabelFicha2.setLocation(452,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 4:{
                jLabelFicha2.setLocation(396,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 5:{
                jLabelFicha2.setLocation(340,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 6:{
                jLabelFicha2.setLocation(284,635);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 7:{
                jLabelFicha2.setLocation(228,635);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 8:{
                jLabelFicha2.setLocation(172,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 9:{
                jLabelFicha2.setLocation(116,635);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 10:{
                jLabelFicha2.setLocation(30,635);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 11:{
                jLabelFicha2.setLocation(30,576);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 12:{
                jLabelFicha2.setLocation(30,517);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 13:{
                jLabelFicha2.setLocation(30,458);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 14:{
                jLabelFicha2.setLocation(30,399);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 15:{
                jLabelFicha2.setLocation(30,340);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 16:{
                jLabelFicha2.setLocation(30,281);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 17:{
                jLabelFicha2.setLocation(30,222);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 18:{
                jLabelFicha2.setLocation(30,163);
                mostrarTarjeta(numCasilla2);
            }break;    
            
            case 19:{
                jLabelFicha2.setLocation(30,104);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 20:{
                jLabelFicha2.setLocation(30,45);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 21:{
                jLabelFicha2.setLocation(115,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 22:{
                jLabelFicha2.setLocation(170,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 23:{
                jLabelFicha2.setLocation(225,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 24:{
                jLabelFicha2.setLocation(275,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 25:{
                jLabelFicha2.setLocation(330,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 26:{
                jLabelFicha2.setLocation(385,30);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 27:{
                jLabelFicha2.setLocation(440,30);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 28:{
                jLabelFicha2.setLocation(495,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 29:{
                jLabelFicha2.setLocation(550,30);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 30:{
                jLabelFicha2.setLocation(550,30);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 31:{
                jLabelFicha2.setLocation(635,115);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 32:{
                jLabelFicha2.setLocation(635,170);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 33:{
                jLabelFicha2.setLocation(635,225);
                mostrarTarjeta(numCasilla2);
            }break;
            
            case 34:{
                jLabelFicha2.setLocation(635,280);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 35:{
                jLabelFicha2.setLocation(635,335);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 36:{
                jLabelFicha2.setLocation(635,390);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 37:{
                jLabelFicha2.setLocation(635,445);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 38:{
                jLabelFicha2.setLocation(635,500);
                mostrarTarjeta(numCasilla2);
            }break;    
            
            case 39:{
                jLabelFicha2.setLocation(635,555);
                mostrarTarjeta(numCasilla2);
            }break;
                
            case 40:{
                jLabelFicha2.setLocation(635,610);
                mostrarTarjeta(numCasilla2);
            }break;  
        }
    }
    
    private void MoverFicha3(){
        switch(numCasilla3){
            case 0:{
                jLabelFicha3.setLocation(620,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 1:{
                jLabelFicha3.setLocation(564,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 2:{
                jLabelFicha3.setLocation(508,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 3:{
                jLabelFicha3.setLocation(452,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 4:{
                jLabelFicha3.setLocation(396,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 5:{
                jLabelFicha3.setLocation(340,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 6:{
                jLabelFicha3.setLocation(284,635);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 7:{
                jLabelFicha3.setLocation(228,635);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 8:{
                jLabelFicha3.setLocation(172,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 9:{
                jLabelFicha3.setLocation(116,635);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 10:{
                jLabelFicha3.setLocation(30,635);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 11:{
                jLabelFicha3.setLocation(30,576);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 12:{
                jLabelFicha3.setLocation(30,517);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 13:{
                jLabelFicha3.setLocation(30,458);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 14:{
                jLabelFicha3.setLocation(30,399);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 15:{
                jLabelFicha3.setLocation(30,340);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 16:{
                jLabelFicha3.setLocation(30,281);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 17:{
                jLabelFicha3.setLocation(30,222);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 18:{
                jLabelFicha3.setLocation(30,163);
                mostrarTarjeta(numCasilla3);
            }break;    
            
            case 19:{
                jLabelFicha3.setLocation(30,104);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 20:{
                jLabelFicha3.setLocation(30,45);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 21:{
                jLabelFicha3.setLocation(115,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 22:{
                jLabelFicha3.setLocation(170,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 23:{
                jLabelFicha3.setLocation(225,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 24:{
                jLabelFicha3.setLocation(275,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 25:{
                jLabelFicha3.setLocation(330,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 26:{
                jLabelFicha3.setLocation(385,30);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 27:{
                jLabelFicha3.setLocation(440,30);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 28:{
                jLabelFicha3.setLocation(495,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 29:{
                jLabelFicha3.setLocation(550,30);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 30:{
                jLabelFicha3.setLocation(605,30);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 31:{
                jLabelFicha3.setLocation(635,115);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 32:{
                jLabelFicha3.setLocation(635,170);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 33:{
                jLabelFicha3.setLocation(635,225);
                mostrarTarjeta(numCasilla3);
            }break;
            
            case 34:{
                jLabelFicha3.setLocation(635,280);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 35:{
                jLabelFicha3.setLocation(635,335);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 36:{
                jLabelFicha3.setLocation(635,390);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 37:{
                jLabelFicha3.setLocation(635,445);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 38:{
                jLabelFicha3.setLocation(635,500);
                mostrarTarjeta(numCasilla3);
            }break;    
            
            case 39:{
                jLabelFicha3.setLocation(635,555);
                mostrarTarjeta(numCasilla3);
            }break;
                
            case 40:{
                jLabelFicha3.setLocation(635,610);
                mostrarTarjeta(numCasilla3);
            }break;  
        }
    }
    
    private void MoverFicha4(){
        switch(numCasilla4){
            
            case 0:{
                jLabelFicha4.setLocation(620,635);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 1:{
                jLabelFicha4.setLocation(564,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 2:{
                jLabelFicha4.setLocation(508,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 3:{
                jLabelFicha4.setLocation(452,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 4:{
                jLabelFicha4.setLocation(396,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 5:{
                jLabelFicha4.setLocation(340,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 6:{
                jLabelFicha4.setLocation(284,635);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 7:{
                jLabelFicha4.setLocation(228,635);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 8:{
                jLabelFicha4.setLocation(172,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 9:{
                jLabelFicha4.setLocation(116,635);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 10:{
                jLabelFicha4.setLocation(30,635);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 11:{
                jLabelFicha4.setLocation(30,576);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 12:{
                jLabelFicha4.setLocation(30,517);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 13:{
                jLabelFicha4.setLocation(30,458);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 14:{
                jLabelFicha4.setLocation(30,399);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 15:{
                jLabelFicha4.setLocation(30,340);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 16:{
                jLabelFicha4.setLocation(30,281);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 17:{
                jLabelFicha4.setLocation(30,222);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 18:{
                jLabelFicha4.setLocation(30,163);
                mostrarTarjeta(numCasilla4);
            }break;    
            
            case 19:{
                jLabelFicha4.setLocation(30,104);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 20:{
                jLabelFicha4.setLocation(30,45);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 21:{
                jLabelFicha4.setLocation(115,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 22:{
                jLabelFicha4.setLocation(170,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 23:{
                jLabelFicha4.setLocation(225,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 24:{
                jLabelFicha4.setLocation(275,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 25:{
                jLabelFicha4.setLocation(330,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 26:{
                jLabelFicha4.setLocation(385,30);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 27:{
                jLabelFicha4.setLocation(440,30);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 28:{
                jLabelFicha4.setLocation(495,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 29:{
                jLabelFicha4.setLocation(550,30);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 30:{
                jLabelFicha4.setLocation(550,30);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 31:{
                jLabelFicha4.setLocation(635,115);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 32:{
                jLabelFicha4.setLocation(635,170);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 33:{
                jLabelFicha4.setLocation(635,225);
                mostrarTarjeta(numCasilla4);
            }break;
            
            case 34:{
                jLabelFicha4.setLocation(635,280);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 35:{
                jLabelFicha4.setLocation(635,335);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 36:{
                jLabelFicha4.setLocation(635,390);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 37:{
                jLabelFicha4.setLocation(635,445);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 38:{
                jLabelFicha4.setLocation(635,500);
                mostrarTarjeta(numCasilla4);
            }break;    
            
            case 39:{
                jLabelFicha4.setLocation(635,555);
                mostrarTarjeta(numCasilla4);
            }break;
                
            case 40:{
                jLabelFicha4.setLocation(635,610);
                mostrarTarjeta(numCasilla4);
            }break;  
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
    
    
    
    private void comprarCasa(int numCasilla,int valorCasa){
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar una casa?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorCasa;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casa
                actualizarDinero();
            }                                                               
        }
    }
    
    private void comprarHotel(int numCasilla,int valorHotel){
        int opcion;
        opcion = JOptionPane.showConfirmDialog(this, "¿Desea comprar una casa?", "compra", JOptionPane.YES_NO_OPTION);
        if(opcion == JOptionPane.YES_OPTION){
            
            if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                dineroJugadores[turno-1] = dineroJugadores[turno-1] - valorHotel;
                propiedadCompradaPor[numCasilla] = turno; // Aqui Obtenemos al propietario de la casa
                actualizarDinero();
            }                                                               
        }
    }
    
    
    
    private void pagarCalleAñil(int numCasilla){
        
        JOptionPane.showMessageDialog(this, " Añil: Debes pagar una cuota por caer en esta casilla ");
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
            JOptionPane.showMessageDialog(this, " Celeste: Debes pagar una cuota por caer en esta casilla ");
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
            JOptionPane.showMessageDialog(this, " Morado: Debes pagar una cuota por caer en esta casilla ");
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
            JOptionPane.showMessageDialog(this, " Naranja: Debes pagar una cuota por caer en esta casilla ");
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
            JOptionPane.showMessageDialog(this, " Rojo: Debes pagar una cuota por caer en esta casilla ");
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
            JOptionPane.showMessageDialog(this, " Amarillo: Debes pagar una cuota por caer en esta casilla ");
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
            JOptionPane.showMessageDialog(this, " Verde: Debes pagar una cuota por caer en esta casilla ");
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
        
        JOptionPane.showMessageDialog(this, " Azul: Debes pagar una cuota por caer en esta casilla ");
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
        JOptionPane.showMessageDialog(this, " Estacion: Debes pagar una cuota por caer en esta casilla ");
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
        JOptionPane.showMessageDialog(this, " Compañia: Debes pagar una cuota por caer en esta casilla ");
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
        JOptionPane.showMessageDialog(this, " Impuesto: Debes pagar una cuota por caer en esta casilla ");       
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCasilla == 38) {           
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - impuesto;
            PagarActualizar(); 
        }       
        if ((turno == 1 || turno ==2 || turno == 3 || turno == 4) && numCasilla == 4) {
            dineroJugadores[turno-1] = dineroJugadores[turno-1] - impuesto*2;
            PagarActualizar();
        }
    }
    
    private void tarjetaCajaComunal(){
        
        Random r1 = new Random();
        int numMensaje = r1.nextInt(16)+1;
        
        switch(numMensaje){
            case 1:{
                JOptionPane.showMessageDialog(this, " Vaya A La Carcel ");
                if (turno == 1){
                    jLabelFicha1.setLocation(30,635);
                    numCasilla1 = 10;
                    JOptionPane.showMessageDialog(this, "Fuiste enviado a la carcel");
                }
                if (turno == 2){
                    jLabelFicha2.setLocation(30,635);
                    numCasilla2 = 10;
                    JOptionPane.showMessageDialog(this, "Fuiste enviado a la carcel");
                }
                if (turno == 3){
                    jLabelFicha3.setLocation(30,635);
                    numCasilla3 = 10;
                    JOptionPane.showMessageDialog(this, "Fuiste enviado a la carcel");
                }
                if (turno == 4){
                    jLabelFicha4.setLocation(30,635);
                    numCasilla4 = 10;
                    JOptionPane.showMessageDialog(this, "Fuiste enviado a la carcel");
                }
            }break;
            
                
            case 2:{
                JOptionPane.showMessageDialog(this, " Impuesto Pague 1000Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 1000;
                    actualizarDinero();
                }
            }break;
            
            case 3:{
                JOptionPane.showMessageDialog(this, " Pague al banco 400Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 400;
                    actualizarDinero();
                }
            }break;
            
            case 4:{
                JOptionPane.showMessageDialog(this, " Por Superar los limites de velocidad pague 500Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 500;
                    actualizarDinero();
                }
            }break;
            
            case 5:{
                JOptionPane.showMessageDialog(this, "Por colaborador Cobre 750Bs;");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 750;
                    actualizarDinero();
                }
            }break;
                
            case 6:{
                JOptionPane.showMessageDialog(this, " Error de la Banca Recibe 500Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 500;
                    actualizarDinero();
                }
            }break;
                
            case 7:{
                JOptionPane.showMessageDialog(this, " Has Recibido Un Regalo de 1000Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 1000;
                    actualizarDinero();
                }
            }break;
                    
            case 8:{
                JOptionPane.showMessageDialog(this, " Pague al banco 600Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 600;
                    actualizarDinero();
                }
                
            }break;
                
            case 9:{
                JOptionPane.showMessageDialog(this, " Pague al Institucion 250Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 250;
                    actualizarDinero();
                }
            }break;
                
            case 10:{
                JOptionPane.showMessageDialog(this, " Pague por gastos escolares 800Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 800;
                    actualizarDinero();
                }
            }break;
                
            case 11:{
                JOptionPane.showMessageDialog(this, " Por Buena Conducta Cobre 500Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 500;
                    actualizarDinero();
                }
            }break;
                
            case 12:{
                JOptionPane.showMessageDialog(this, " Usted Ha Recibido Un Regalo 600Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 600;
                    actualizarDinero();
                }
            }
            
            case 13:{
                JOptionPane.showMessageDialog(this, " Has Ganado El Concurso de Comida, Recibe 400Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 400;
                    actualizarDinero();
                }
            }break;
                
            case 14:{
                JOptionPane.showMessageDialog(this, " Por Reprobar Base De Datos Pague 500Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 500;
                    actualizarDinero();
                }
            }break;
             
            case 15:{
                JOptionPane.showMessageDialog(this, " Recibe Por Ganar El Torneo De Lucha 500Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 500;
                    actualizarDinero();
                }
            }break;
                
            case 16:{
                JOptionPane.showMessageDialog(this, " Felicitaciones Has Ganado Un Bonus De 800Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 800;
                    actualizarDinero();
                }
            }break;
        
        }
        
    }
    
    private void tarjetaSuerte(){
        Random r1 = new Random();

        int numMensaje = r1.nextInt(16)+1;
        
        switch(numMensaje){
            case 1:{
                JOptionPane.showMessageDialog(this, " Multado Por Exceso De Velocidad Pague 250Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 250;
                    actualizarDinero();
                }
            }break;
            
            case 2:{
                JOptionPane.showMessageDialog(this, " Usted Es Una Persona Con Mucha Suerte,  Recibe Un Bonus De 2000Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 2000;
                    actualizarDinero();
                }
            }break;
            
            case 3:{
                JOptionPane.showMessageDialog(this, " Usted Ha Ganado Un Concurso De Belleza, Recibe 500Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 500;
                    actualizarDinero();
                }
            }break;
            
            case 4:{
                JOptionPane.showMessageDialog(this, " Reciba un Premio De 1500Bs Por Buen Ciudadano ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 1500;
                    actualizarDinero();
                }                
            }break;
            
            case 5:{
                JOptionPane.showMessageDialog(this, " Has Ganado Un Concurso Musical, Recibe 600Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 600;
                    actualizarDinero();
                }
   
            }break;
                
            case 6:{
                JOptionPane.showMessageDialog(this, " Por No Lavar Los Platos Pague 100Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 100;
                    actualizarDinero();
                }
            }break;
                
            case 7:{
                JOptionPane.showMessageDialog(this, " Usted Ha Recibido Un Regalo De 400Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 400;
                    actualizarDinero();
                }
            }break;
                    
            case 8:{
                JOptionPane.showMessageDialog(this, " La Empresa Pepsi Te Ha Hecho Una Bonificacion De 1000Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 1000;
                    actualizarDinero();
                }
            }break;
                
            case 9:{
                JOptionPane.showMessageDialog(this, "Por Moroso Pague 250Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 250;
                    actualizarDinero();
                }
            }break;
                
            case 10:{
                JOptionPane.showMessageDialog(this, " Pague Impuesto 600Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] - 600;
                    actualizarDinero();
                }
            }break;
                
            case 11:{
                JOptionPane.showMessageDialog(this, "Por Ser Solidario, Recibe 300Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 300;
                    actualizarDinero();
                }
            }break;
                
            case 12:{
                JOptionPane.showMessageDialog(this, " El juego Lo Ha Premiado Con Un Bonus De 800Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 800;
                    actualizarDinero();
                }
            }
            
            case 13:{
                JOptionPane.showMessageDialog(this, "La Empresa Google Le Hizo Una Donacion De 900Bs ");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 900;
                    actualizarDinero();
                }
            }break;
                
            case 14:{
                JOptionPane.showMessageDialog(this, " Recibe un Premio Por Realizar El Proyecto De Sistemas De Bases De Datos, Recibe 1500Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 1500;
                    actualizarDinero();
                }
            }break;
             
            case 15:{
                JOptionPane.showMessageDialog(this, "Recibe 500");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 500;
                    actualizarDinero();
                }
            }break;
                
            case 16:{
                JOptionPane.showMessageDialog(this, "Feliz Dia Del Trabajador, Recibe 700Bs");
                if (turno == 1 || turno == 2 || turno == 3 || turno == 4){
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] + 700;
                    actualizarDinero();
                }
            }break;
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
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
            }
        }
              
        if(numCasilla==3 && propiedadCompradaPor[numCasilla] == 0){           
            comprarCalleAñil(numCasilla);          
        }else{
            if(numCasilla==3 && propiedadCompradaPor[numCasilla] != 0){
                pagarCalleAñil(numCasilla);
                JOptionPane.showMessageDialog(this, "Deuda Pagada");
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
        
        
        // inicio Impuestos      
        if(numCasilla==4){
            pagarImpuesto(numCasilla);
            JOptionPane.showMessageDialog(this, "Deuda Pagada");
        }
        
        
        if(numCasilla==38){
            pagarImpuesto(numCasilla);
            JOptionPane.showMessageDialog(this, "Deuda Pagada");
        }       
        //Fin impuestos
        
        
        //inicio De Suerte 
        if(numCasilla==7){   
            JOptionPane.showMessageDialog(this, " Tarjeta: Casilla De Suerte");
            tarjetaSuerte();
        }       
                       
        
        if(numCasilla==22){          
            JOptionPane.showMessageDialog(this, " Tarjeta: Casilla De Suerte");
            tarjetaSuerte();
        }
        
        if(numCasilla==36){          
            JOptionPane.showMessageDialog(this, " Tarjeta: Casilla De Suerte");
            tarjetaSuerte();
        }
        //Fin de Suerte 
        
        
        //Inicio de Caja Comunal
        if(numCasilla==2){          
            JOptionPane.showMessageDialog(this, "Tarjeta: Caja Comunal");
            tarjetaCajaComunal();
        }
        
        if(numCasilla==17){          
            JOptionPane.showMessageDialog(this, "Tarjeta: Caja Comunal");
            tarjetaCajaComunal();           
        }
        
        if(numCasilla==33){          
            JOptionPane.showMessageDialog(this, "Tarjeta: Caja Comunal");
            tarjetaCajaComunal();
        }
        //Fin Caja Comunal
        
        
        //Inicio Casillas Especiales
        if(numCasilla==30){
            int opcion2;
            JOptionPane.showMessageDialog(this, "Has Sido Enviado A La Carcel");
            opcion2 = JOptionPane.showConfirmDialog(this, "Si quieres Salie de la Carcel Debes esperar un Turno y pagar 500Bs");
            
            // Espera un turno y paga 500Bs
            if (opcion2 == JOptionPane.YES_NO_OPTION){
                if (turno == 1){
                    JOptionPane.showMessageDialog(this, "Esta en la Carcel");
                    jLabelFicha1.setLocation(35, 635);
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] -500;
                    actualizarDinero();
                    mover1 = 0;          
                }
                if (turno == 2){
                    JOptionPane.showMessageDialog(this, "Esta en la Carcel");
                    jLabelFicha2.setLocation(35, 635);
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] -500;
                    actualizarDinero();
                    mover2 = 0;
                }
                if (turno == 3){
                    JOptionPane.showMessageDialog(this, "Esta en la Carcel");
                    jLabelFicha3.setLocation(35, 635);
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] -500;
                    actualizarDinero();
                    mover3 = 0;
                }
                if (turno == 4){
                    JOptionPane.showMessageDialog(this, "Esta en la Carcel");
                    jLabelFicha4.setLocation(35, 635);
                    dineroJugadores[turno-1] = dineroJugadores[turno-1] -500;
                    actualizarDinero();
                    mover4 = 0;
                }          
            }
            
            // Espera 3 turnos, en el cuarto turno juega
            if (opcion2 == JOptionPane.NO_OPTION){
                JOptionPane.showMessageDialog(this, "Despueste de 3 turnos podras avanzar nuevamente y pagaras 500");
                if (turno == 1){
                    jLabelFicha1.setLocation(35, 635);
                    mover1 = -2;
                }
                if (turno == 2){
                    jLabelFicha2.setLocation(35, 635);
                    mover2 = -2;
                }
                if (turno == 3){
                    jLabelFicha3.setLocation(35, 635);
                    mover3 = -2;
                }
                if (turno == 4){
                    jLabelFicha4.setLocation(35, 635);
                    mover4 = -2;
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
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000 El jugador "+turno);
        }
        if (numCasilla2 >= 40){
            numCasilla2 = numCasilla2 - 40;
            dineroJugadores[1] = dineroJugadores[1] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000 El jugador "+turno);
        }
        if (numCasilla3 >= 40){
            numCasilla3 = numCasilla3 - 40;
            dineroJugadores[2] = dineroJugadores[2] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000 El jugador "+turno);
        }
        if (numCasilla4 >= 40){
            numCasilla4 = numCasilla4 - 40;
            dineroJugadores[3] = dineroJugadores[3] + 2000;
            PagarActualizar();
            JOptionPane.showMessageDialog(this, "Has Recibido un Bonus De 2000 El jugador "+turno );
        }
    }
    
    private void bancaRota(){
        if (dineroJugadores[turno-1] <= 0)
            if(turno == 1 && !j1Eliminado){
                JOptionPane.showMessageDialog(this," Jugador 1 Ha sido eliminado ");
                jLabelFicha1.setEnabled(false);
                jLabelFicha1.setSize(1, 1);
                j1Eliminado=true;
                //jLabelFicha1.setVisible(false);
               // jLabelFicha1.setLocation(1000,1000);
                numCasilla1 = 0;
                posicion_ficha1 = 0;
            }
            if(turno == 2 && !j2Eliminado){
                JOptionPane.showMessageDialog(this," Jugador 2 Ha sido eliminado ");
                jLabelFicha2.setEnabled(false);
                jLabelFicha2.setSize(1, 1);
                j2Eliminado=true;
                //jLabelFicha2.setVisible(false);                
               // jLabelFicha2.setLocation(1000,1000);
                numCasilla2 = 0;
                posicion_ficha2 = 0;
            }
            if(turno == 3 && !j3Eliminado){
                JOptionPane.showMessageDialog(this," Jugador 3 Ha sido eliminado ");
                jLabelFicha3.setEnabled(false);
                jLabelFicha3.setSize(1, 1);
                j3Eliminado=true;
                //jLabelFicha3.setVisible(false);
                //jLabelFicha3.setLocation(1000,1000);
                numCasilla3 = 0;
                posicion_ficha3 = 0;
            }
            if(turno == 4 && !j4Eliminado){
                JOptionPane.showMessageDialog(this," Jugador 4 Ha sido eliminado ");
                jLabelFicha4.setEnabled(false);
                jLabelFicha4.setSize(1, 1);
                j4Eliminado=true;
                //jLabelFicha4.setVisible(false);
               // jLabelFicha4.setLocation(1000,1000);
                numCasilla4 = 0;
                posicion_ficha4 = 0;
                
            }
    }
    
    private void jugarDados(){
        if (jugarDado >= 4){
            jugarDado = 1;           
        }else{
            jugarDado = jugarDado + 1;
        }
    }
    
    private void obtenerTurno(){
        if (turno >= 4){
            turno = 1;
        }else{
            turno = turno +1; 
        }
    }
    
    private void eliminarJugador(){
        if(dineroJugadores[turno-1] <= 0){
            bancaRota();
            //turno = turno + 1;
        }
    }
}
