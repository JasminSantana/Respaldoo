
package view;

import java.util.Enumeration;
import java.util.Vector;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *Paso de articulos atravéz de listas.
 * @author Santana Mares Jasmin Aide sant.mar.1997@gmail.com
 * @version 1.1
 */
public class Listas extends javax.swing.JFrame {

  DefaultListModel modelo1=new DefaultListModel();
        DefaultListModel modelo2=new DefaultListModel();
    public Listas() {
        initComponents();
        init();
        
    }
    private void init(){
        
        modelo1.addElement("Azúcar");
        modelo1.addElement("Harina");
        modelo1.addElement("Huevo");
        modelo1.addElement("Mantequilla");
        modelo1.addElement("Betún");
        modelo1.addElement("Leche");
        
        lstArticulos1.setModel(modelo1);
        lstArticulos2.setModel(modelo2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        lstArticulos1 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstArticulos2 = new javax.swing.JList();
        btnIzq = new javax.swing.JButton();
        btnAllIzq = new javax.swing.JButton();
        btnDer = new javax.swing.JButton();
        btnAllDer = new javax.swing.JButton();
        chkDesabilitar = new javax.swing.JCheckBox();
        txtAgregar = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jScrollPane1.setViewportView(lstArticulos1);

        jScrollPane2.setViewportView(lstArticulos2);

        btnIzq.setText("<");
        btnIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIzqActionPerformed(evt);
            }
        });

        btnAllIzq.setText("<<");
        btnAllIzq.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllIzqActionPerformed(evt);
            }
        });

        btnDer.setText(">");
        btnDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDerActionPerformed(evt);
            }
        });

        btnAllDer.setText(">>");
        btnAllDer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAllDerActionPerformed(evt);
            }
        });

        chkDesabilitar.setText("Desactivar");
        chkDesabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkDesabilitarActionPerformed(evt);
            }
        });

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnAllIzq, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                            .addComponent(btnAllDer, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIzq, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chkDesabilitar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(btnDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAllDer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAllIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnIzq)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(chkDesabilitar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAgregar)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDerActionPerformed
        // TODO add your handling code here:
        
        String elemento=(String) lstArticulos1.getSelectedValue();
        if(lstArticulos1.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione el elemento");
        }else{
        
        modelo2.addElement(elemento);
        modelo1.removeElement(elemento);
        /* DefaultListModel eliminar=(DefaultListModel) lstArticulos1.getModel();
       eliminar.remove( lstArticulos1.getSelectedIndex());*/
        
        }
    }//GEN-LAST:event_btnDerActionPerformed

    private void btnAllDerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllDerActionPerformed
        // TODO add your handling code here:
  Enumeration datos=    modelo1.elements();
        while(datos.hasMoreElements()){
            Object next=datos.nextElement();//nextElemenete trae el elemento
            modelo2.addElement(next);//se agrega el elemento
                    }
        modelo1.removeAllElements();
    
    }//GEN-LAST:event_btnAllDerActionPerformed

    private void btnIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIzqActionPerformed
        // TODO add your handling code here:
          String elemento=(String) lstArticulos2.getSelectedValue();
        if(lstArticulos2.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione el elemento");
        }else{
        
        modelo1.addElement(elemento);
        modelo2.removeElement(elemento);
       
        
        }
    }//GEN-LAST:event_btnIzqActionPerformed

    private void btnAllIzqActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAllIzqActionPerformed
        // TODO add your handling code here:
       Enumeration datos=    modelo2.elements();
        while(datos.hasMoreElements()){
            Object next=datos.nextElement();//nextElemenete trae el elemento
            modelo1.addElement(next);//se agrega el elemento
                    }
        modelo2.removeAllElements();
        
    }//GEN-LAST:event_btnAllIzqActionPerformed

    private void chkDesabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkDesabilitarActionPerformed
        // TODO add your handling code here:
        if(chkDesabilitar.isSelected()){
            btnAllDer.setEnabled(false);
             btnAllIzq.setEnabled(false);
              btnDer.setEnabled(false);
               btnIzq.setEnabled(false);
        }else{
              btnAllDer.setEnabled(true);
             btnAllIzq.setEnabled(true);
              btnDer.setEnabled(true);
               btnIzq.setEnabled(true);
        }
    }//GEN-LAST:event_chkDesabilitarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
  
        if (txtAgregar.getText().toString().isEmpty()){
            JOptionPane.showMessageDialog(null,"No se ha agrgado nada");
            
        }else{
            if(modelo1.contains(txtAgregar.getText().toString())){
                JOptionPane.showMessageDialog(null,"Ya hay un articulo igual");
            }
                else{
            modelo1.addElement(txtAgregar.getText().toString());
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

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
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnAllDer;
    private javax.swing.JButton btnAllIzq;
    private javax.swing.JButton btnDer;
    private javax.swing.JButton btnIzq;
    private javax.swing.JCheckBox chkDesabilitar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList lstArticulos1;
    private javax.swing.JList lstArticulos2;
    private javax.swing.JTextField txtAgregar;
    // End of variables declaration//GEN-END:variables
}