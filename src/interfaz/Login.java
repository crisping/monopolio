/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import clases.DataBase;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author soul
 */
public class Login extends JFrame implements ActionListener{
    //Atributos
    private final JLabel aliasT;
    private final JLabel contraseñaT;
    private final JLabel logo;
    public JTextField alias;
    public JPasswordField contraseña;
    public JPanel panel;
    public JButton acceder;
    public JButton registrarse;
    
    //Metodos
    public Login(){
        super();
        
        logo = new JLabel();
        logo.setLocation(55,20);
        logo.setSize(200,133);
        logo.setIcon(new ImageIcon(getClass().getResource("/recursos/login.logo.png")));
        
        aliasT = new JLabel("Nombre de usuario: ");
        aliasT.setLocation(50,150);
        aliasT.setSize(200,25);
        
        
        alias = new JTextField();
        alias.setLocation(50,178);
        alias.setSize(200,25);
        
        contraseñaT = new JLabel("Contraseña: ");
        contraseñaT.setLocation(50,210);
        contraseñaT.setSize(2300,25);
        
        contraseña = new JPasswordField();
        contraseña.setLocation(50,235);
        contraseña.setSize(200,25);
        
        acceder = new JButton("Acceder");
        acceder.setLocation(98,300);
        acceder.setSize(100,25);
        acceder.addActionListener(this);
        
        registrarse = new JButton("Registro");
        registrarse.setLocation(98,330);
        registrarse.setSize(100,25);
        registrarse.addActionListener(this);
        
        
        panel = new JPanel();
        panel.setLayout(null);
        panel.add(logo);
        panel.add(aliasT);
        panel.add(contraseñaT);
        panel.add(alias);
        panel.add(contraseña);
        panel.add(acceder);
        panel.add(registrarse);
        
        add(panel);
        setTitle("Login Monopolio UNEG");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,400);
        setResizable(false);
        setVisible(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == acceder){
            if(alias.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese  el alias");
                return;
            }
            
            if(contraseña.getText().isEmpty()){
                JOptionPane.showMessageDialog(this, "Ingrese  la contraseña");
                return;
            }
            
            DataBase db = new DataBase();
            if(db.conexion()){
                if(db.autenticarUsuario(alias.getText(), contraseña.getText())){
                    Perfil.main(null);
                }else{
                    JOptionPane.showMessageDialog(this, "La combinacion de Alias/Contraseña inválida");
                }
            }else
                JOptionPane.showMessageDialog(this, "No se pudo conectar a la BD");
        }
        
        if (e.getSource() == registrarse){
            Registro.main(null);
            this.dispose();
        }
    }
    
    public static void main(String[] args) {
        new Login();
    }
}
