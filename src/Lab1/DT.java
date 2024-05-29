/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Lab1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DT extends javax.swing.JFrame implements Runnable {

    public DT() {
        initComponents();
        fakeDate();
        showindex1();
        fillTable();
        
    }
    private DefaultTableModel dfModel;
    private List<DienThoai> lst_dt = new ArrayList<>();

    // fake data
    void fakeDate() {
        lst_dt.add(new DienThoai("samsung", 1, 20000));
        lst_dt.add(new DienThoai("nokia", 2, 50000));
        lst_dt.add(new DienThoai("samsung", 1, 40000));
        lst_dt.add(new DienThoai("iphone", 2, 10000));
    }
    //
    void them(){
        DienThoai dt = new DienThoai();
        dt.setTenDT(txt_tensp.getText());
        dt.setGiaDT(Float.parseFloat(txt_gia.getText()));
        if(dt.getHangDT() == 0){
            cbo_hang.setSelectedItem("samsung");
        }else{
            cbo_hang.setSelectedItem("nokia");
        }
        lst_dt.add(dt);
        fillTable();
    }

    // fill
    void fillTable() {
        dfModel = (DefaultTableModel) tbl_dienthoai.getModel();
        dfModel.setRowCount(0);
        for (DienThoai dt : lst_dt) {
            dfModel.addRow(new Object[]{dt.getTenDT(), dt.getHangDT() == 0 ? "samsung" : "nokia", dt.getGiaDT(), dt.status()});
        }
    }

    void showindex1() {
        DienThoai dt = lst_dt.get(0);
        txt_tensp.setText(dt.getTenDT());
        txt_gia.setText(String.valueOf(dt.getGiaDT()));
        cbo_hang.setSelectedItem(dt.getHangDT() == 1 ? "samsung" : "nokia");
    }

    DienThoai newDt() {
        return new DienThoai(txt_tensp.getText(), cbo_hang.getSelectedIndex() == 0 ? 1 : 2, Float.parseFloat(txt_gia.getText()));
    }

    void addDT() {
        lst_dt.add(newDt());
        fillTable();
        JOptionPane.showMessageDialog(this, "them thanh cong.");
    }

    //ghi file
    void writeFile() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showSaveDialog(null);
            if (chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileOutputStream fo = new FileOutputStream(path);
                ObjectOutputStream oo = new ObjectOutputStream(fo);
                oo.writeObject(lst_dt);
                oo.close();
                dfModel = (DefaultTableModel) tbl_dienthoai.getModel();
                dfModel.setRowCount(0);
                JOptionPane.showMessageDialog(this,"ghi thanh cong.");

            }else{
                JOptionPane.showMessageDialog(this,"ban chua chon file.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"loi ghi file.");
        }
    }
    void readFile() {
        try {
            JFileChooser fc = new JFileChooser();
            int chon = fc.showOpenDialog(null);
            if (chon == 0) {
                String path = fc.getSelectedFile().getPath();
                FileInputStream fi = new FileInputStream(path);
                ObjectInputStream oi = new ObjectInputStream(fi);
                lst_dt = (List<DienThoai>) oi.readObject();
                oi.close();
                fillTable();
                JOptionPane.showMessageDialog(this,"doc thanh cong.");

            }else{
                JOptionPane.showMessageDialog(this,"ban chua chon file.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,"loi doc file.");
        }
    }
    // show
    void showdt(){
       int index = tbl_dienthoai.getSelectedRow();
       DienThoai dt = lst_dt.get(index);
       txt_tensp.setText(dt.getTenDT());
       txt_gia.setText(String.valueOf(dt.getGiaDT()));
       cbo_hang.setSelectedItem(dt.getHangDT());
    }
// chạy 
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_dienthoai = new javax.swing.JTable();
        btn_them = new javax.swing.JButton();
        cbo_hang = new javax.swing.JComboBox<>();
        txt_tensp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_gia = new javax.swing.JTextField();
        btn_ghiFIle = new javax.swing.JButton();
        btn_docFIle = new javax.swing.JButton();
        txt_title = new javax.swing.JLabel();
        txt_time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Tên Sản Phẩm:");

        tbl_dienthoai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Ten san pham", "Hang", "Gia", "Tinh Trang"
            }
        ));
        tbl_dienthoai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_dienthoaiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_dienthoai);

        btn_them.setText("Thêm");
        btn_them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_themActionPerformed(evt);
            }
        });

        cbo_hang.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "samsung", "nokia" }));
        cbo_hang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_hangActionPerformed(evt);
            }
        });

        jLabel2.setText("Hãng");

        jLabel3.setText("Giá");

        btn_ghiFIle.setText("Ghi");
        btn_ghiFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ghiFIleActionPerformed(evt);
            }
        });

        btn_docFIle.setText("Mở");
        btn_docFIle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_docFIleActionPerformed(evt);
            }
        });

        txt_title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        txt_title.setText("QUẢN LÝ ĐIỆN THOẠI");

        txt_time.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txt_time.setText("00:00");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(66, 66, 66)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(77, 77, 77)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbo_hang, 0, 152, Short.MAX_VALUE)
                                .addComponent(txt_tensp))
                            .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_docFIle)
                            .addComponent(btn_them)
                            .addComponent(btn_ghiFIle)))
                    .addComponent(txt_title))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(txt_time, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_time)
                    .addComponent(txt_title))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txt_tensp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_them))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbo_hang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_ghiFIle))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_docFIle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tbl_dienthoai.setRowSelectionInterval(0, 0);
    }//GEN-LAST:event_formWindowOpened

    private void btn_themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_themActionPerformed
        them();
    }//GEN-LAST:event_btn_themActionPerformed

    private void btn_ghiFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ghiFIleActionPerformed
        writeFile();
    }//GEN-LAST:event_btn_ghiFIleActionPerformed

    private void btn_docFIleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_docFIleActionPerformed
        readFile();
    }//GEN-LAST:event_btn_docFIleActionPerformed

    private void tbl_dienthoaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_dienthoaiMouseClicked
        showdt();
    }//GEN-LAST:event_tbl_dienthoaiMouseClicked

    private void cbo_hangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_hangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_hangActionPerformed

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
            java.util.logging.Logger.getLogger(DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DT.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DT().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_docFIle;
    private javax.swing.JButton btn_ghiFIle;
    private javax.swing.JButton btn_them;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbo_hang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_dienthoai;
    private javax.swing.JTextField txt_gia;
    private javax.swing.JTextField txt_tensp;
    private javax.swing.JLabel txt_time;
    private javax.swing.JLabel txt_title;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
