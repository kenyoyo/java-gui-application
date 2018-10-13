package gui_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author KAZDO
 */
public class VendorSaleForm extends javax.swing.JFrame {

    private static VendorSaleForm insertFrame = new VendorSaleForm();
    private static VendorSaleForm updateFrame = new VendorSaleForm();
    private static boolean flag;
    private static String vId;
    private static String pId;
    
    public VendorSaleForm() {
        initComponents();
    }

    public void setIsEdit(boolean value) {
        flag = value;
    }

    public void setVendorId(String id) {
        vId = id;
    }

    public void setProduceId(String id) {
        pId = id;
    }

    public void openInsertFrame() {
        insertFrame.setUnit();
        insertFrame.setVisible(true);
    }

    public void openUpdateFrame() {
        updateFrame.setUnit();
        updateFrame.Label_title.setText("แก้ไขข้อมูลวัสดุที่จำหน่าย");

        String sql = "Select MAT_NAME, PRODUCE_PRICE from vendor natural join produce natural join material where P_ID = " + pId;
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                updateFrame.CBB_mat.setSelectedItem(rs.getString(1));
                updateFrame.Txt_price.setText(rs.getString(2));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        updateFrame.setVisible(true);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Label_title = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        CBB_mat = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        Label_unit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_price = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(104, 195, 163));

        Label_title.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        Label_title.setText("เพิ่มข้อมูลวัสดุที่จำหน่าย");

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("*ชื่อวัสดุ");

        CBB_mat.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        CBB_mat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        CBB_mat.setToolTipText("");
        CBB_mat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CBB_matActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("หน่วย:");

        Label_unit.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        Label_unit.setText("ตัว");

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("*ราคาวัสดุ");

        Txt_price.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        jButton1.setBackground(new java.awt.Color(236, 240, 241));
        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jButton1.setText("บันทึก");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(Label_unit))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(67, 67, 67)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(Label_title)
                            .addComponent(CBB_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_price))
                        .addContainerGap(101, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(Label_title)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(CBB_mat, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Label_unit))
                .addGap(41, 41, 41)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (flag) {
            editData();
        } else {
            insertData();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CBB_matActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CBB_matActionPerformed
        insertFrame.setUnit();
        updateFrame.setUnit();
    }//GEN-LAST:event_CBB_matActionPerformed
    public void insertData() {
        if (checkDataInForm()) {
            String matPrice = Txt_price.getText();
            String matName = CBB_mat.getSelectedItem().toString();

            String sql = "insert into produce (PRODUCE_PRICE, V_ID, MAT_ID) "
                    + "values(" + matPrice + "," + vId + ",(select mat_id from material where mat_name = '" + matName + "' ))";
            System.out.println(sql);
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
            insertFrame.clearTextBox();
            insertFrame.clearRow();
            insertFrame.ShowDataAgain();
            insertFrame.callEnableButtonCheck();
            insertFrame.setComboBox(callHaveMat());
            JOptionPane.showMessageDialog(this, "เพิ่มข้อมูลเรียบร้อย");
            int YesOrNo = JOptionPane.showConfirmDialog(null, "ต้องการบันทึกเป็นประวัติการเปลี่ยนแปลงราคาหรือไม่", "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
            if (YesOrNo == JOptionPane.YES_NO_OPTION) {
            
            sql="Select max(p_id) from produce"; 
            try {
             Connection c=Gui_db.getConnection(); //เชื่อมจ่อกับฐานข้อมูล
             ResultSet rs=c.createStatement().executeQuery(sql); //ส่งคำสั่ง sql ไปทำงาน
                while (rs.next()) {
                    pId = rs.getString(1);
                }
             
         } catch (Exception e) {
             e.printStackTrace();
         }
                
                saveHist(matPrice);
            }
        }
    }

    public void editData() {
        if (checkDataInForm()) {
            String matPrice = Txt_price.getText();
            String matName = CBB_mat.getSelectedItem().toString();

            String sql = "update produce"
                    + " set produce_price =" + matPrice
                    + " , mat_id = (select mat_id from material where mat_name = '" + matName + "')"
                    + " where p_id = " + pId;
            System.out.println(sql);
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            updateFrame.clearRow();
            updateFrame.ShowDataAgain();
            updateFrame.callEnableButtonCheck();
            JOptionPane.showMessageDialog(this, "แก้ไขข้อมูลเรียบร้อย");
            updateFrame.clearTextBox();
            updateFrame.setVisible(false);
            int YesOrNo = JOptionPane.showConfirmDialog(null, "ต้องการบันทึกเป็นประวัติการเปลี่ยนแปลงราคาหรือไม่", "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
            if (YesOrNo == JOptionPane.YES_NO_OPTION) {
                saveHist(matPrice);
            }
        }
    }
    
    public void setUnit() {
        String matName = CBB_mat.getSelectedItem().toString();
        String sql = "Select MAT_UNIT from material where mat_name = '" + matName + "'";
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                insertFrame.Label_unit.setText(rs.getString(1));
                updateFrame.Label_unit.setText(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void saveHist(String matPrice) {
        //new VendorSaleAddDateForHistForm().openFrame(matPrice, pId);
    }

    public boolean checkDataInForm() {
        if (!isNumeric(Txt_price.getText())) {
            String message = "กรุณากรอกข้อมูลราคาขายให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }

        return true;
    }

    public void setComboBox(String haveMat) {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql = "select mat_name from material where mat_name not in (" + haveMat + ");";
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                cbModel.addElement(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        VendorSaleTable OPDT = new VendorSaleTable();
        if (cbModel.getSize() == 0) {
            OPDT.callSetEnableInsertButton(false);
            insertFrame.setVisible(false);
        } else {
            OPDT.callSetEnableInsertButton(true);
            insertFrame.CBB_mat.setModel(cbModel);
            insertFrame.setUnit();
        }
        if (flag) {
            String checkMat = new VendorSaleTable().callGetCheckMatName();
            updateFrame.CBB_mat.setModel(cbModel);
            updateFrame.CBB_mat.addItem(checkMat);
            updateFrame.CBB_mat.setSelectedItem(checkMat);
        }
    }

    public void clearTextBox() {
        Txt_price.setText("");
    }

    public String callHaveMat() {
        return new VendorSaleTable().callGetAllMat();
    }

    public void clearRow() {
        VendorSaleTable vs = new VendorSaleTable();
        vs.callClearRow();
    }

    public void ShowDataAgain() {
        VendorSaleTable vs = new VendorSaleTable();
        vs.callShowDataRecord();
    }
    
    public void callEnableButtonCheck() {
        new VendorSaleTable().callEnableButtonCheck();
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBB_mat;
    private javax.swing.JLabel Label_title;
    private javax.swing.JLabel Label_unit;
    private javax.swing.JTextField Txt_price;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
