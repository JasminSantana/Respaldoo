/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.AccessMySQL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Marco Antonio Mendiola Torres markochiva@gmail.com
 */
public class viewRegistro extends javax.swing.JFrame {
        String mensaje="";
           
    public viewRegistro() {
        initComponents();
            initCombos();
        
    }
    private void initCombos(){
       DefaultComboBoxModel modelDia=new DefaultComboBoxModel();
       DefaultComboBoxModel modelAnio=new DefaultComboBoxModel();
       
       modelDia.addElement("Día");
        modelAnio.addElement("Año");
        
        for (int i = 1; i < 32; i++) {
            modelDia.addElement(i);
            
        }for (int a = 2016; a >=1990; a--) {
            modelAnio.addElement(a);
            
        } cboDia.setModel(modelDia);
        cboAnio.setModel(modelAnio);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlFormulario = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        lblApellidoPaterno = new javax.swing.JLabel();
        lblApellidoMaterno = new javax.swing.JLabel();
        lblFechaNacimiento = new javax.swing.JLabel();
        lblCalle = new javax.swing.JLabel();
        lblNoCalle = new javax.swing.JLabel();
        lblContrasenia = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtCorreoElectronico = new javax.swing.JTextField();
        cboDia = new javax.swing.JComboBox<String>();
        cboMes = new javax.swing.JComboBox<String>();
        cboAnio = new javax.swing.JComboBox<String>();
        btnRegistrar = new javax.swing.JButton();
        lblContraseña = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtCalle = new javax.swing.JTextArea();
        txtNoCalle = new javax.swing.JTextField();
        txtPassword1 = new javax.swing.JPasswordField();
        lblConfContraseña = new javax.swing.JLabel();
        lblConfContraseña1 = new javax.swing.JLabel();
        cboTUs = new javax.swing.JComboBox();
        pnlLogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 700));

        pnlFormulario.setBackground(new java.awt.Color(223, 194, 141));
        pnlFormulario.setPreferredSize(new java.awt.Dimension(444, 350));

        lblNombre.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblNombre.setText("Nombre ");

        lblApellidoPaterno.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblApellidoPaterno.setText("Apellido Paterno");

        lblApellidoMaterno.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblApellidoMaterno.setText("Apellido Materno");

        lblFechaNacimiento.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblFechaNacimiento.setText("Fecha de Nacimiento");

        lblCalle.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblCalle.setText("Calle");

        lblNoCalle.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblNoCalle.setText("No. de Calle");

        lblContrasenia.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblContrasenia.setText("Correo Electronico");

        txtApellidoPaterno.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtApellidoPaterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoPaternoActionPerformed(evt);
            }
        });
        txtApellidoPaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoPaternoKeyTyped(evt);
            }
        });

        txtNombre.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtApellidoMaterno.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtApellidoMaterno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoMaternoKeyTyped(evt);
            }
        });

        txtCorreoElectronico.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N

        cboDia.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        cboDia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDiaActionPerformed(evt);
            }
        });

        cboMes.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        cboMes.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mes", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", " " }));

        cboAnio.setFont(new java.awt.Font("Sitka Text", 0, 10)); // NOI18N
        cboAnio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnRegistrar.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        lblContraseña.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblContraseña.setText("Contraseña");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        txtCalle.setColumns(20);
        txtCalle.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtCalle.setRows(5);
        txtCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCalleKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(txtCalle);

        txtNoCalle.setFont(new java.awt.Font("Sitka Text", 0, 12)); // NOI18N
        txtNoCalle.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNoCalleKeyTyped(evt);
            }
        });

        txtPassword1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPassword1KeyTyped(evt);
            }
        });

        lblConfContraseña.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblConfContraseña.setText("Confirmar contraseña");

        lblConfContraseña1.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N
        lblConfContraseña1.setText("Usuario");

        cboTUs.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo Usuario", "Adm", "Clien", "Prov" }));

        javax.swing.GroupLayout pnlFormularioLayout = new javax.swing.GroupLayout(pnlFormulario);
        pnlFormulario.setLayout(pnlFormularioLayout);
        pnlFormularioLayout.setHorizontalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblApellidoMaterno)
                                    .addComponent(lblNoCalle)
                                    .addComponent(lblCalle))
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtNombre)
                                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                                .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtApellidoPaterno)
                                            .addComponent(txtApellidoMaterno)))
                                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                                        .addGap(68, 68, 68)
                                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                            .addComponent(txtNoCalle)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlFormularioLayout.createSequentialGroup()
                                .addComponent(lblContrasenia)
                                .addGap(58, 58, 58)
                                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPassword)
                                    .addComponent(txtCorreoElectronico)
                                    .addComponent(txtPassword1)))
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnRegistrar)))
                        .addGap(86, 86, 86))
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFechaNacimiento)
                            .addComponent(lblNombre)
                            .addComponent(lblContraseña)
                            .addComponent(lblApellidoPaterno)
                            .addGroup(pnlFormularioLayout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblConfContraseña1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cboTUs, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblConfContraseña))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        pnlFormularioLayout.setVerticalGroup(
            pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlFormularioLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNombre))
                .addGap(13, 13, 13)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblApellidoPaterno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoMaterno)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaNacimiento)
                    .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cboMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cboAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlFormularioLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lblCalle)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlFormularioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNoCalle, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNoCalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContrasenia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblContraseña))
                .addGap(8, 8, 8)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfContraseña))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblConfContraseña1)
                    .addComponent(cboTUs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addComponent(btnRegistrar)
                .addGap(26, 26, 26))
        );

        getContentPane().add(pnlFormulario, java.awt.BorderLayout.CENTER);

        pnlLogo.setBackground(new java.awt.Color(122, 35, 35));

        jLabel1.setFont(new java.awt.Font("Vladimir Script", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(213, 194, 141));
        jLabel1.setText("Damayte Dulce Gourmet");

        jLabel3.setFont(new java.awt.Font("Perpetua", 0, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(213, 194, 141));
        jLabel3.setText("Formulario");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logodesktop.png"))); // NOI18N

        javax.swing.GroupLayout pnlLogoLayout = new javax.swing.GroupLayout(pnlLogo);
        pnlLogo.setLayout(pnlLogoLayout);
        pnlLogoLayout.setHorizontalGroup(
            pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlLogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLogoLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(jLabel1)
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(pnlLogoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addContainerGap(43, Short.MAX_VALUE))
        );

        getContentPane().add(pnlLogo, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
       txtNombre.transferFocus();
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
     
            try {
                AccessMySQL objCon = AccessMySQL.getInstance();
                //Paso 1 obtener la conexion
                Connection con=objCon.getConnection();
                //Paso 2 Crear un enunciado
               
                String nom,cont,ap,apm,email,nacimiento,coloni,num, tipou="";
                nom=txtNombre.getText();
                cont=txtPassword.getText();
                ap=txtApellidoPaterno.getText();
                apm=txtApellidoMaterno.getText();
                email=txtCorreoElectronico.getText();
                nacimiento=cboAnio.getSelectedItem()+"/"+cboMes.getSelectedItem()+ "/" +cboDia.getSelectedItem();
                
                coloni=txtCalle.getText();
                num=txtNoCalle.getText();
                
                if(cboTUs.getSelectedItem().equals("Adm")){
                tipou="1";
                }else if(cboTUs.getSelectedItem().equals("Clien")){
                    tipou="2";
                }else if(cboTUs.getSelectedItem().equals("Prov")){
                    tipou="3";
                }
                
                
               String insert="INSERT INTO USUARIO (NOMBREUSUARIO,CONTRASENIA, "+
                    "APPAT,APMAT,EMAIL,FECHANACIMIENTO,COLONIA,NUMERO,ClaveTipoUser) "+
                  " VALUES (?,?,?,?,?,?,?,?,?)";
              PreparedStatement stmt= con.prepareStatement(insert);
               
               stmt.setString(1,nom);
               stmt.setString(2, cont);
               stmt.setString(3, ap);
               stmt.setString(4, apm);
               stmt.setString(5, email);
               stmt.setString(6, nacimiento);
               stmt.setString(7,coloni);
               stmt.setString(8, num);
               stmt.setString(9, tipou);
             stmt.executeUpdate();
                
                
                
                
                if(validarCajas()){
                    JOptionPane.showMessageDialog(null, "Registrado Correctamente");
                    viewLogin login = new viewLogin();
                    login.setVisible(true);
                    this.setVisible(false);
                    
                }else{
                    
                    JOptionPane.showMessageDialog(null,mensaje,"Error al insertar un campo",
                            JOptionPane.ERROR_MESSAGE);
                }       } catch (SQLException ex) {
                Logger.getLogger(viewRegistro.class.getName()).log(Level.SEVERE, null, ex);
            }
                  
    }//GEN-LAST:event_btnRegistrarActionPerformed
private boolean validarCajas(){
     boolean isValido=true;
   mensaje="";
  //condicines para validar si los campos estan vacios
    if(txtNombre.getText().isEmpty()){
          mensaje="El nombre esta vacion \n";
        isValido=false;
    }else
     if(txtApellidoPaterno.getText().isEmpty()){
          mensaje="El apellido paterno esta vacio \n";
        isValido=false;
    }
    else
     if(txtApellidoMaterno.getText().isEmpty()){
          mensaje="El apellido materno esta vacio \n";
        isValido=false;
    }
    else
    if(cboDia.getSelectedItem().equals("Día")){
              mensaje="No se a seleccionado el dia \n";
        isValido=false;
         }else
if(cboMes.getSelectedItem().equals("Mes")){
              mensaje="No se a seleccionado el mes \n";
        isValido=false;
         }else
if(cboAnio.getSelectedItem().equals("Año")){
              mensaje="No se a seleccionado el año \n";
        isValido=false;
         }else
 if(txtCalle.getText().isEmpty()){
          mensaje="La calle esta vacia \n";
        isValido=false;
    }else 
    if(txtNoCalle.getText().isEmpty()){
         mensaje="El campo calle esta vacio \n";
         isValido=false;
    }else if(txtCorreoElectronico.getText().isEmpty()){
         mensaje="El campo correo esta vacio \n";
         isValido=false;
    }else if(txtPassword.getText().isEmpty()){
         mensaje="Ingresa la contarseña \n";
         isValido=false;
    }else if(txtPassword1.getText().isEmpty()){
         mensaje="Ingresa la contarseña \n";
         isValido=false;
    }/*else  if(txtPassword.getText().toString().equals(txtPassword1.getText().toString())){
           mensaje="Tú contrase no es la misma \n";
      }*/
    
    
    return isValido;
}
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        // TODO add your handling code here:
           char car=evt.getKeyChar();
        if (!Character.isLetter(car)){
            if (!Character.isSpaceChar(car) || txtNombre.getText().length()>30 ){
               getToolkit().beep();
               evt.consume();
            }
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtApellidoPaternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoPaternoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_txtApellidoPaternoActionPerformed

    private void txtApellidoPaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoPaternoKeyTyped
        // TODO add your handling code here:
         char car=evt.getKeyChar();
        if (!Character.isLetter(car)){
            if (!Character.isSpaceChar(car)){
               getToolkit().beep();
               evt.consume();
            }
        }
    }//GEN-LAST:event_txtApellidoPaternoKeyTyped

    private void txtApellidoMaternoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoMaternoKeyTyped
        // TODO add your handling code here:
          char car=evt.getKeyChar();
        if (!Character.isLetter(car)){
            if (!Character.isSpaceChar(car)){
               getToolkit().beep();
               evt.consume();
            }
        }
    }//GEN-LAST:event_txtApellidoMaternoKeyTyped

    private void txtNoCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNoCalleKeyTyped
        // TODO add your handling code here:
         char car=evt.getKeyChar();
        if (!(Character.isDigit(car)|| txtNoCalle.getText().length()>127)){
            evt.consume();
        }
    }//GEN-LAST:event_txtNoCalleKeyTyped

    private void txtCalleKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCalleKeyTyped
        // TODO add your handling code here:
         char car=evt.getKeyChar();
        if (!Character.isLetter(car)){
            if (!Character.isSpaceChar(car)){
               getToolkit().beep();
               evt.consume();
            }
        }
    }//GEN-LAST:event_txtCalleKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if (!(Character.isDigit(car)|| Character.isLetter(car)||txtPassword.getText().length()>18)){
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void txtPassword1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassword1KeyTyped
        // TODO add your handling code here:
        char car=evt.getKeyChar();
        if (!(Character.isDigit(car)||Character.isLetter(car)|| txtPassword1.getText().length()>18)){
            evt.consume();
        }
      
    }//GEN-LAST:event_txtPassword1KeyTyped

    private void cboDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDiaActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cboDiaActionPerformed

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
            java.util.logging.Logger.getLogger(viewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewRegistro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewRegistro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cboAnio;
    private javax.swing.JComboBox<String> cboDia;
    private javax.swing.JComboBox<String> cboMes;
    private javax.swing.JComboBox cboTUs;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblApellidoMaterno;
    private javax.swing.JLabel lblApellidoPaterno;
    private javax.swing.JLabel lblCalle;
    private javax.swing.JLabel lblConfContraseña;
    private javax.swing.JLabel lblConfContraseña1;
    private javax.swing.JLabel lblContrasenia;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblFechaNacimiento;
    private javax.swing.JLabel lblNoCalle;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel pnlFormulario;
    private javax.swing.JPanel pnlLogo;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextArea txtCalle;
    private javax.swing.JTextField txtCorreoElectronico;
    private javax.swing.JTextField txtNoCalle;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPassword1;
    // End of variables declaration//GEN-END:variables
}
