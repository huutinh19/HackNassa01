/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TessJdbc;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ADMIN
 */
public class QuanLyDiemSinhVien extends javax.swing.JFrame {

    /**
     * Creates new form QuanLyDiemSinhVien
     */
    ArrayList<DiemSinhVien> list = new ArrayList<>();
    DefaultTableModel model;
    ArrayList<DiemSinhVien> list2 = new ArrayList<>();

    public QuanLyDiemSinhVien() {
        initComponents();

        list2.add(new DiemSinhVien("PH01", "TUAN", "9", "10", "10"));
        list2.add(new DiemSinhVien("PH02", "LONG", "10", "9", "10"));
        list2.add(new DiemSinhVien("PH03", "HIEN", "10", "10", "9"));

        loadData(list);
    }

    void loadData(ArrayList<DiemSinhVien> list) {
        model = (DefaultTableModel) tblDiem.getModel();
        model.setRowCount(0);
        for (DiemSinhVien sv : list) {
            model.addRow(new Object[]{
                sv.getMa(), sv.getTen(), sv.getTiengAnh(), sv.getTinHoc(), sv.getGDTC(),
                sv.tb()
            });

        }
    }

    DiemSinhVien getForm() {
        DiemSinhVien diemSinhVien = new DiemSinhVien();
        String ten = lblHoTen.getText();
        String ma = txtMa.getText();
        String ta = txtTiengAnh.getText();
        String th = txtTinHoc.getText();
        String gd = txtGDTC.getText();
        String tb = ((Float.valueOf(ta) + Float.valueOf(th) + Float.valueOf(gd)) / 3) + "";

        return new DiemSinhVien(ma, ten, ta, th, gd);
    }

    void setForm(DiemSinhVien diemSinhVien, int i) {

        lblHoTen.setText((String) tblDiem.getValueAt(i, 1));
        txtMa.setText((String) tblDiem.getValueAt(i, 0));

        txtTiengAnh.setText((String) tblDiem.getValueAt(i, 2));
        txtTinHoc.setText((String) tblDiem.getValueAt(i, 3));
        txtGDTC.setText((String) tblDiem.getValueAt(i, 4));
        lblDiemTB.setText(tblDiem.getValueAt(i, 5) + "");
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
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtTimMa = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtMa = new javax.swing.JTextField();
        txtTiengAnh = new javax.swing.JTextField();
        txtTinHoc = new javax.swing.JTextField();
        txtGDTC = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblDiemTB = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        btnNew = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDiem = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Quan Ly Diem Sinh Vien");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tim Kiem"));

        jLabel2.setText("Ma SV");

        txtTimMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimMaFocusLost(evt);
            }
        });
        txtTimMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtTimMaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTimMaMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                txtTimMaMouseReleased(evt);
            }
        });
        txtTimMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTimMaActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSearch)
                .addGap(54, 54, 54))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtTimMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel3.setText("Ho ten SV");

        jLabel4.setText("Ma SV");

        jLabel5.setText("Tieng Anh");

        jLabel6.setText("Tin Hoc");

        jLabel7.setText("Giao Duc TC");

        txtMa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMaFocusLost(evt);
            }
        });
        txtMa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtMaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtMaMouseExited(evt);
            }
        });
        txtMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaActionPerformed(evt);
            }
        });
        txtMa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtMaKeyReleased(evt);
            }
        });

        txtTiengAnh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTiengAnhMousePressed(evt);
            }
        });
        txtTiengAnh.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTiengAnhKeyReleased(evt);
            }
        });

        txtTinHoc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTinHocKeyReleased(evt);
            }
        });

        txtGDTC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtGDTCMouseExited(evt);
            }
        });
        txtGDTC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtGDTCKeyReleased(evt);
            }
        });

        jLabel9.setText("Diem TB");

        lblDiemTB.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDiemTB.setForeground(new java.awt.Color(102, 102, 255));

        lblHoTen.setForeground(new java.awt.Color(51, 51, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtTinHoc, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                    .addComponent(txtGDTC, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMa)
                    .addComponent(txtTiengAnh)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(lblHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtTiengAnh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtTinHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(lblDiemTB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtGDTC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jButton6.setText("|<");

        jButton7.setText(">>");

        jButton8.setText("<<");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText(">|");

        jLabel8.setForeground(new java.awt.Color(102, 102, 255));
        jLabel8.setText("3 sinh vien co diem cao nhat");

        tblDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Ma SV", "Ho Ten SV", "Tieng anh", "Tin hoc", "GDTC", "Diem TB"
            }
        ));
        tblDiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDiemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDiem);
        if (tblDiem.getColumnModel().getColumnCount() > 0) {
            tblDiem.getColumnModel().getColumn(5).setResizable(false);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNew)
                                    .addComponent(btnSave)
                                    .addComponent(btnDelete)
                                    .addComponent(btnUpdate)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton6)
                                .addGap(18, 18, 18)
                                .addComponent(jButton7)
                                .addGap(18, 18, 18)
                                .addComponent(jButton8)
                                .addGap(18, 18, 18)
                                .addComponent(jButton9)))
                        .addGap(0, 46, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(156, 156, 156))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnNew)
                        .addGap(18, 18, 18)
                        .addComponent(btnSave)
                        .addGap(18, 18, 18)
                        .addComponent(btnDelete)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdate))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed
int check(){
    if (lblHoTen.getText().equals("")) {
        JOptionPane.showMessageDialog(this, "khong de trog ");
        return 1;
    }
    for (DiemSinhVien d : list) {
        if (txtMa.getText().endsWith(d.getMa())) {
            JOptionPane.showMessageDialog(this, "khong duoc trung ma");
            return 1;
        }
    }
    return 0;
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        if (check()==0) {
            list.add(getForm());
        loadData(list);
        }
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here
        txtTiengAnh.setText("");
        txtMa.setText("");
        lblHoTen.setText("");
        txtTinHoc.setText("");
        txtGDTC.setText("");
        lblDiemTB.setText("");

    }//GEN-LAST:event_btnNewActionPerformed

    private void tblDiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDiemMouseClicked
        // TODO add your handling code here:
        int i = tblDiem.getSelectedRow();
        setForm(list.get(i), i);
    }//GEN-LAST:event_tblDiemMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int i = tblDiem.getSelectedRow();
        list.remove(i);
        loadData(list);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int i = tblDiem.getSelectedRow();
        
        list.set(i, getForm());
        loadData(list);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void txtTimMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTimMaActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_txtTimMaActionPerformed
    ArrayList<DiemSinhVien> list1 = new ArrayList<>();
    private void txtTimMaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimMaMouseExited
        // TODO add your handling code here:
      
    }//GEN-LAST:event_txtTimMaMouseExited

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:

        list1.clear();
        for (DiemSinhVien d : list) {
            if (txtTimMa.getText().equals(d.getMa())) {
                list1.add(d);
            }
        }
        if (txtTimMa.getText().equals("")) {
            loadData(list);
        } else {
            loadData(list1);
            for (DiemSinhVien d : list1) {
                if (txtTimMa.getText().equals(d.getMa())) {

                    setForm(d, 0);
                }
            }
        }

        for (DiemSinhVien d : list) {
            if (txtMa.getText().equals(d.getMa())) {
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "ma khong hop le");

    }//GEN-LAST:event_btnSearchActionPerformed

    private void txtTimMaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimMaMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimMaMousePressed

    private void txtTimMaMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTimMaMouseReleased
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTimMaMouseReleased

    private void txtMaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaMouseEntered
        // TODO add your handling code here:

    }//GEN-LAST:event_txtMaMouseEntered

    private void txtMaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtMaMouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtMaMouseExited

    private void txtTiengAnhMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTiengAnhMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTiengAnhMousePressed

    private void txtGDTCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtGDTCMouseExited
        // TODO add your handling code here:


    }//GEN-LAST:event_txtGDTCMouseExited

    private void txtMaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMaKeyReleased
        // TODO add your handling code here:
        for (DiemSinhVien d : list2) {
            if (txtMa.getText().equals(d.getMa())) {
                lblHoTen.setText(d.getTen());
                break;
            } else {
                lblHoTen.setText("");
            }
        }

    }//GEN-LAST:event_txtMaKeyReleased

    private void txtTiengAnhKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTiengAnhKeyReleased
        // TODO add your handling code here:
        try {
            String ta = txtTiengAnh.getText();
            String th = txtTinHoc.getText();
            String gd = txtGDTC.getText();
            String tb = ((Float.valueOf(ta) + Float.valueOf(th) + Float.valueOf(gd)) / 3) + "";
            lblDiemTB.setText(tb);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtTiengAnhKeyReleased

    private void txtTinHocKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTinHocKeyReleased
        // TODO add your handling code here:
        try {
            String ta = txtTiengAnh.getText();
            String th = txtTinHoc.getText();
            String gd = txtGDTC.getText();
            String tb = ((Float.valueOf(ta) + Float.valueOf(th) + Float.valueOf(gd)) / 3) + "";
            lblDiemTB.setText(tb);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtTinHocKeyReleased

    private void txtGDTCKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtGDTCKeyReleased
        // TODO add your handling code here:
        try {
            String ta = txtTiengAnh.getText();
            String th = txtTinHoc.getText();
            String gd = txtGDTC.getText();
            String tb = ((Float.valueOf(ta) + Float.valueOf(th) + Float.valueOf(gd)) / 3) + "";
            lblDiemTB.setText(tb);
        } catch (Exception e) {
        }
    }//GEN-LAST:event_txtGDTCKeyReleased

    private void txtMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMaFocusLost
        // TODO add your handling code here:
        for (DiemSinhVien d : list2) {
            if (txtMa.getText().equals(d.getMa())) {
                return;
            }
        }
        JOptionPane.showMessageDialog(this, "ma khong hop le");

    }//GEN-LAST:event_txtMaFocusLost

    private void txtTimMaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimMaFocusLost
        // TODO add your handling code here:
          if (txtTimMa.getText().equals("")) {
            loadData(list);
        }
    }//GEN-LAST:event_txtTimMaFocusLost

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
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyDiemSinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyDiemSinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDiemTB;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JTable tblDiem;
    private javax.swing.JTextField txtGDTC;
    private javax.swing.JTextField txtMa;
    private javax.swing.JTextField txtTiengAnh;
    private javax.swing.JTextField txtTimMa;
    private javax.swing.JTextField txtTinHoc;
    // End of variables declaration//GEN-END:variables
}
