/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package libraryproject;

import SignIn.Admin_Register;
import SearchGui.*;
import edit.idbeforeedit;


public class Admin extends javax.swing.JFrame {

    
    public Admin() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonAdmin_Add = new javax.swing.JButton();
        jButtonAdmin_Dis = new javax.swing.JButton();
        jButtonAdmin_Edit = new javax.swing.JButton();
        jButtonAdmin_Delete = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonAdmin_logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin");

        jButtonAdmin_Add.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonAdmin_Add.setText("Add Book");
        jButtonAdmin_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_AddActionPerformed(evt);
            }
        });

        jButtonAdmin_Dis.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonAdmin_Dis.setText("Display Books");
        jButtonAdmin_Dis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_DisActionPerformed(evt);
            }
        });

        jButtonAdmin_Edit.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonAdmin_Edit.setText("Edit ");
        jButtonAdmin_Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_EditActionPerformed(evt);
            }
        });

        jButtonAdmin_Delete.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonAdmin_Delete.setForeground(java.awt.Color.red);
        jButtonAdmin_Delete.setText("Delete Book");
        jButtonAdmin_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_DeleteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("WELCOME ADMIN");

        jButtonAdmin_logout.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButtonAdmin_logout.setForeground(new java.awt.Color(0, 0, 255));
        jButtonAdmin_logout.setText("Log Out");
        jButtonAdmin_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdmin_logoutActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/libraryproject/4411472.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdmin_Add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonAdmin_Edit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonAdmin_Delete, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                    .addComponent(jButtonAdmin_Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAdmin_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonAdmin_Dis, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdmin_Add, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAdmin_Edit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAdmin_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonAdmin_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAdmin_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_AddActionPerformed
       AddBook a = new AddBook();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonAdmin_AddActionPerformed

    private void jButtonAdmin_DisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_DisActionPerformed
       searchgui s = new searchgui();
       s.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonAdmin_DisActionPerformed

    private void jButtonAdmin_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_DeleteActionPerformed
       DeleteBook a = new DeleteBook();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonAdmin_DeleteActionPerformed

    private void jButtonAdmin_EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_EditActionPerformed
       idbeforeedit a = new idbeforeedit();
       a.setVisible(true);
       this.setVisible(false);
    }//GEN-LAST:event_jButtonAdmin_EditActionPerformed

    private void jButtonAdmin_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdmin_logoutActionPerformed
        Admin_Register a = new Admin_Register();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonAdmin_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdmin_Add;
    private javax.swing.JButton jButtonAdmin_Delete;
    private javax.swing.JButton jButtonAdmin_Dis;
    private javax.swing.JButton jButtonAdmin_Edit;
    private javax.swing.JButton jButtonAdmin_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
