/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;


import clases.DataBase;
import clases.PartidaGuardada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author christian
 */


public class PartidasGuardadas extends javax.swing.JFrame implements ActionListener{

    private DefaultTableModel modelo;
    public static DataBase db;
    public static String alias;
    
    public PartidasGuardadas() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        cargarPartidas();
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
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPartidasGuardadas = new javax.swing.JTable();
        btnCargar = new javax.swing.JButton();
        btnCargar.addActionListener(this);
        btnVolver = new javax.swing.JButton();
        btnVolver.addActionListener(this);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Partidas Guardadas");

        tblPartidasGuardadas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Partida", "Alias", "Alias J2", "Alias J3", "Alias J4", "Partida Activa"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPartidasGuardadas);

        btnCargar.setText("Cargar");

        btnVolver.setText("Volver");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(btnCargar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnVolver))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 534, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnVolver))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(PartidasGuardadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PartidasGuardadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PartidasGuardadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PartidasGuardadas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PartidasGuardadas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblPartidasGuardadas;
    // End of variables declaration//GEN-END:variables

    private void cargarPartidas() {
        
        ArrayList<PartidaGuardada> partidadsGuardadas = db.getPartidasGuardadas(alias);
        
        if(partidadsGuardadas!=null){
            
            Collections.sort(partidadsGuardadas, new Comparator<PartidaGuardada>(){
 
                @Override
		public int compare(PartidaGuardada pg1, PartidaGuardada pg2) {
                    return pg1.getId().compareTo(pg2.getId());
		}		
            });
            
            String datos[][]={};
            String columnas[]={"Id Partida", "AliasJ1", "Alias J2", "Alias J3", "Alias J4", "Partida Activa"};

             modelo = new DefaultTableModel(datos,columnas){
                //Se impide que el usuario pueda alterar los datos sobre la tabla directamente,
                //para obligarlo a usar los campos de texto en conjunto con los botones,
                //ya que se hace más fácil controlar las operaciones con estos componentes. 
                @Override
                public boolean isCellEditable(int row, int column) {
                    
                    return false;
                };
                
                
                Class[] types = new Class[]{String.class, String.class, String.class, String.class, String.class, Boolean.class};

                public Class getColumnClass(int columnIndex) {
                    return types[columnIndex];
                }    
            };
            
            
            this.tblPartidasGuardadas.setModel(modelo);
            
            for (PartidaGuardada partidaGuarada : partidadsGuardadas) {
                 addPartidasGuardas(partidaGuarada);
            }
        }
        
        
        
        
    }

    private void addPartidasGuardas(PartidaGuardada partidaGuarada) {
        
        int numFilas = this.tblPartidasGuardadas.getRowCount();
        
        modelo.insertRow(numFilas,new Object[]{});
        
        //Se añade el valor a los campos de la fila recién insertada
        //específicando el valor, el numero de la fila y el numero de la columna
        modelo.setValueAt(partidaGuarada.getId(),numFilas,0);
        modelo.setValueAt(partidaGuarada.getAlias(),numFilas,1);
        modelo.setValueAt(partidaGuarada.getAliasJ2(),numFilas,2);
        modelo.setValueAt(partidaGuarada.getAliasJ3(),numFilas,3);
        modelo.setValueAt(partidaGuarada.getAliasJ4(),numFilas,4);
        modelo.setValueAt(partidaGuarada.isPartidaActiva(),numFilas,5);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnCargar){
            if(tblPartidasGuardadas.getSelectedRow()==-1)
                return;
            Tablero.main(null);
            Tablero.alias = alias;
            Tablero.db= db;
            Tablero.idPartida= modelo.getValueAt(tblPartidasGuardadas.getSelectedRow(), 0).toString();
            this.dispose();
        }
        if (e.getSource() == btnVolver){
            Perfil.main(null);
            this.dispose();
        }
    }
}
