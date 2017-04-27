/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AccessMySQL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class viewLogin extends javax.swing.JFrame {

    /**
     * Creates new form viewLogin
     */
    public viewLogin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlIncioSesion = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        lblRecuperar = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnRegistro = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlLogo.setBackground(new java.awt.Color(122, 35, 35));

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 194, 141));
        jLabel1.setText("Damayte Dulce Gourmet");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 194, 141));
        jLabel3.setText("Bienvenido");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logodesktop.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap(11, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLogoLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jLabel3)
                        .addGap(166, 166, 166))))
        );
        pnlLogoLayout.setVerticalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlLogoLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLogo, java.awt.BorderLayout.PAGE_START);

        pnlIncioSesion.setBackground(new java.awt.Color(213, 194, 141));
        pnlIncioSesion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblUsuario.setText("Correo");
        pnlIncioSesion.add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        lblContrasenia.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblContrasenia.setText("Contraseña");
        pnlIncioSesion.add(lblContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));
        pnlIncioSesion.add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 110, -1));

        btnIngresar.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pnlIncioSesion.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, -1, -1));

        lblRecuperar.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblRecuperar.setText("¿Olvidaste tu contraseña?");
        pnlIncioSesion.add(lblRecuperar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        txtUsuario.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        pnlIncioSesion.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 110, -1));

        btnRegistro.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        btnRegistro.setText("Registrarse");
        btnRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistroActionPerformed(evt);
            }
        });
        pnlIncioSesion.add(btnRegistro, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 20, -1, -1));

        getContentPane().add(pnlIncioSesion, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        try {
            //        if (txtUsuario.getText().equals("") || txtContrasena.getText().equals("")) {
//            JOptionPane.showMessageDialog(null, "Usuario o contraseña invalida", "Error al ingresar", JOptionPane.ERROR_MESSAGE);
//
//        }
           AccessMySQL objCon = AccessMySQL.getInstance();
            //Paso 1 obtener la conexion
            Connection con=objCon.getConnection();
            //Paso 2 Crear un enunciado
            Statement stmt= con.createStatement();
            
            String query= "SELECT * "
            + "FROM usuario where email='"+txtUsuario.getText()+ " ' and contrasenia= '"+txtContrasena.getText() +"' ";
            ResultSet rsut = stmt.executeQuery(query);
            
            
            if (rsut.next()){
       
            
            viewRegistroMateriaPrima registro = new viewRegistroMateriaPrima();
            registro.setVisible(true);
            this.setVisible(false);
            }
       
        else {
            JOptionPane.showMessageDialog(null, "Usuario Incorrecto","Usuario no encontrado",JOptionPane.ERROR_MESSAGE);
            
        }
        } catch (SQLException ex) {
            Logger.getLogger(viewLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistroActionPerformed
        viewRegistro registrarse = new viewRegistro();
        registrarse.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnRegistroActionPerformed

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
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnRegistro;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblRecuperar;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pnlIncioSesion;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
