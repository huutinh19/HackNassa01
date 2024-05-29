/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package kiemTra27_11;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class QuanLySach extends javax.swing.JFrame {

    String user = "sa";
    String pass = "123";
    String url = "jdbc:sqlserver://;serverName=TUNPC;databaseName=Aglie";
    ArrayList<Sach> list = new ArrayList<>();
    DefaultTableModel model;

    public QuanLySach() {
        initComponents();
        loadDataList();
        loadData(list);
    }
int check(){
    for (Sach s : list) {
        if (s.getMa().equals(txtMa.getText())) {
            JOptionPane.showMessageDialog(this, "ma da ton tai");
            return 0;
        }
    }
    if (txtMa.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "khong de trong ma");
        return 0;
    }else if(txtTen.getText().equals("")){
         JOptionPane.showMessageDialog(this, "khong de trong ten");
        return 0;
    }else if (txtDonGia.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "khong de trong don gia");
        return 0; 
    }else if(Integer.valueOf(txtDonGia.getText())<=0){
         JOptionPane.showMessageDialog(this, "lon hon 0");
        return 0;
    }
    return 1;
}
    void loadData(ArrayList<Sach> list) {
        model = (DefaultTableModel) tblBang.getModel();
        model.setRowCount(0);
        for (Sach s : list) {
            model.addRow(new Object[]{
                s.getMa(), s.getTen(), s.getDonGia(), s.getTrangThai()
            });
        }
    }

    void loadDataList() {
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "select * from Sach1";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            list.clear();
            while (rs.next()) {
                String ma = rs.getString(2);
                String ten = rs.getString(3);
                String donGia = rs.getString(6);
                String trangThai = (rs.getInt(7)==1)?"con hang":"het hang";

                Sach s = new Sach(ma, ten, donGia, trangThai);
                list.add(s);

            }
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTen = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        cboTrangThai = new javax.swing.JComboBox<>();
        btnCapNhat = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBang = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quan Ly Sach");

        jLabel2.setText("ma");

        jLabel3.setText("ten");

        jLabel4.setText("don gia");

        jLabel5.setText("trang thai");

        cboTrangThai.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "het hang", "con hang", " " }));

        btnCapNhat.setText("cap nhat");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnXoa.setText("xoa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setText("thoat");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        tblBang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ma", "ten", "don gia", "trang thai"
            }
        ));
        tblBang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblBangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblBang);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cboTrangThai, 0, 148, Short.MAX_VALUE)
                            .addComponent(txtDonGia)
                            .addComponent(txtTen)
                            .addComponent(txtMa))
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCapNhat)
                            .addComponent(btnXoa)
                            .addComponent(btnThoat)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 525, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCapNhat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cboTrangThai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(253, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    private void tblBangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblBangMouseClicked
        // TODO add your handling code here:
        int i = tblBang.getSelectedRow();
        txtMa.setText((String) tblBang.getValueAt(i, 0));
        txtTen.setText((String) tblBang.getValueAt(i, 1));
        txtDonGia.setText((String) tblBang.getValueAt(i, 2));
cboTrangThai.setSelectedItem((String) tblBang.getValueAt(i, 3));
    }//GEN-LAST:event_tblBangMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int i= tblBang.getSelectedRow();
        String ma= (String) tblBang.getValueAt(i, 0);
         try {
            Connection con=DriverManager.getConnection(url, user, pass);
            String sql="delete Sach1 where Ma="+"'"+ma+"'";
            PreparedStatement ps=con.prepareStatement(sql);
            ps.execute();
            JOptionPane.showMessageDialog(this, "xoa thanh cong");
        } catch (Exception e) {
                        JOptionPane.showMessageDialog(this, "xoa that bai");
            e.printStackTrace();
        }
        loadDataList();
            loadData(list);
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
        if (check()==0) {
            return;
        }
        int i=tblBang.getSelectedRow();
        String ma=(String) tblBang.getValueAt(i, 0);
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            String sql = "update Sach1 set Ma=?,Ten=?,DonGia=?,TrangThai=? where Ma=?";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, txtMa.getText());
            ps.setString(2, txtTen.getText());
            ps.setString(3, txtDonGia.getText());
             ps.setInt(4, (cboTrangThai.getSelectedItem().equals("con hang"))?1:0);
             ps.setString(5, ma);
             ps.executeUpdate();
            JOptionPane.showMessageDialog(this, "update thanh cong");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi");
        }
        loadDataList();
        loadData(list);
    }//GEN-LAST:event_btnCapNhatActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLySach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLySach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cboTrangThai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblBang;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTen;
    // End of variables declaration//GEN-END:variables
}