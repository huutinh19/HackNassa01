/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class bai2View extends javax.swing.JFrame {

    /**
     * Creates new form bai2View
     */
    public bai2View() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txtK = new javax.swing.JTextField();
        btnC = new javax.swing.JToggleButton();
        btnT = new javax.swing.JToggleButton();
        btnN = new javax.swing.JToggleButton();
        btnCh = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("first number");

        jLabel2.setText("second number");

        jLabel3.setText("result");

        txt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt1ActionPerformed(evt);
            }
        });

        txt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt2ActionPerformed(evt);
            }
        });

        txtK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtKActionPerformed(evt);
            }
        });

        btnC.setText("+");
        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCMouseClicked(evt);
            }
        });

        btnT.setText("-");
        btnT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTMouseClicked(evt);
            }
        });

        btnN.setText("*");
        btnN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNMouseClicked(evt);
            }
        });

        btnCh.setText("/");
        btnCh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnC)
                        .addGap(18, 18, 18)
                        .addComponent(btnT)
                        .addGap(18, 18, 18)
                        .addComponent(btnN)
                        .addGap(18, 18, 18)
                        .addComponent(btnCh)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt1, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txt2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(65, 65, 65)
                        .addComponent(txtK)))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnC)
                    .addComponent(btnT)
                    .addComponent(btnN)
                    .addComponent(btnCh))
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt2ActionPerformed

    private void txt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt1ActionPerformed

    private void txtKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtKActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtKActionPerformed
    boolean checkInput(String s1, String s2) {
        if (s1.isEmpty()) {
            JOptionPane.showMessageDialog(this, "nhap s1");
            return false;
        }
        try {
            Double.valueOf(s1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "k nhap chu");
            return false;
        }
        if (s2.isEmpty()) {
            JOptionPane.showMessageDialog(this, "nhap s2");
            return false;
        }
        try {
            Double.valueOf(s2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "k nhap chu");
            return false;
        }
        return true;
    }
    private void btnCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseClicked
        // TODO add your handling code here:
        String s1 = txt1.getText();
        String s2 = txt2.getText();
        if (!checkInput(s1, s2)) {
            return;
        }
        Integer kq = Integer.parseInt(s1) + Integer.parseInt(s2);
        txtK.setText(kq.toString());
    }//GEN-LAST:event_btnCMouseClicked

    private void btnTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTMouseClicked
        // TODO add your handling code here:
        String s1 = txt1.getText();
        String s2 = txt2.getText();
        if (!checkInput(s1, s2)) {
            return;
        }
        Integer kq = Integer.valueOf(s1)-Integer.valueOf(s2);
        txtK.setText(kq.toString());
    }//GEN-LAST:event_btnTMouseClicked

    private void btnNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNMouseClicked
        // TODO add your handling code here:
        String s1 = txt1.getText();
        String s2 = txt2.getText();
        if (!checkInput(s1, s2)) {
            return;
        }
        Integer kq = Integer.parseInt(s1) * Integer.parseInt(s2);
        txtK.setText(kq.toString());
    }//GEN-LAST:event_btnNMouseClicked

    private void btnChMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChMouseClicked
        // TODO add your handling code here:
        String s1 = txt1.getText();
        String s2 = txt2.getText();
        if (!checkInput(s1, s2)) {
            return;
        }
        Integer kq = Integer.parseInt(s1) / Integer.parseInt(s2);
        txtK.setText(kq.toString());
    }//GEN-LAST:event_btnChMouseClicked

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
            java.util.logging.Logger.getLogger(bai2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(bai2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(bai2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(bai2View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new bai2View().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnC;
    private javax.swing.JToggleButton btnCh;
    private javax.swing.JToggleButton btnN;
    private javax.swing.JToggleButton btnT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txtK;
    // End of variables declaration//GEN-END:variables
}