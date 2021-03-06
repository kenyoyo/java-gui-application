/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZDO
 */
public class BringMaterialDetailForm extends javax.swing.JFrame {

    private static BringMaterialDetailForm INSERT_FRAME = new BringMaterialDetailForm();
    private static BringMaterialDetailForm UPDATE_FRAME = new BringMaterialDetailForm();
    private static boolean updateFlag;
    private static String brId;
    private static String matName;
    private static String manufacId;
    private static String omanuId;
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();

    /**
     * Creates new form OrderProductForm
     */
    public BringMaterialDetailForm() {
        initComponents();
    }

    public void setOmanuId(String id) {
        omanuId = id;
    }

    public void setManufacId(String id) {
        manufacId = id;
    }

    public void setUpdateForm(String brId, String productName, String amount, String allMatInTable) {
        updateFlag = true;
        UPDATE_FRAME.brId = brId;
        UPDATE_FRAME.matName = productName;
        setSelectedComponent(allMatInTable);
        UPDATE_FRAME.materialCbb.addItem(UPDATE_FRAME.matName);
        UPDATE_FRAME.materialCbb.setSelectedItem(UPDATE_FRAME.matName);
        setUnitLabel();
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลวัสดุที่เบิก");
        UPDATE_FRAME.amountTxt.setText(amount);
        UPDATE_FRAME.setVisible(true);
    }

    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }

    public void openInsertFrame(String brId, String allMatInTable) {
        updateFlag = false;
        this.brId = brId;
        setSelectedComponent(allMatInTable);
        setUnitLabel();
        INSERT_FRAME.amountTxt.setText("");
        INSERT_FRAME.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        unitLabel = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        materialCbb = new javax.swing.JComboBox<>();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(134, 226, 213));

        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("เพิ่มวัสดุที่เบิก");

        jPanel1.setBackground(new java.awt.Color(134, 226, 213));

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("วัสดุ");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("จำนวน");

        unitLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        unitLabel.setText("หน่วย");

        amountTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        materialCbb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        materialCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        materialCbb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCbbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(materialCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(unitLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(materialCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(unitLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(titleLabel)
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if (updateFlag) {
            editData();
        } else {
            insertData();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void materialCbbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCbbActionPerformed
        setUnitLabel();
    }//GEN-LAST:event_materialCbbActionPerformed

    public void insertData() {
        String material = materialCbb.getSelectedItem().toString();
        String amount = amountTxt.getText().toString();
        if (!isNumeric(amount)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลจำนวนวัสดุให้ถูกต้อง");
        } else {
            String sql = "insert into bring_mat_detail(BR_ID,MAT_ID,BMD_AMOUNT,BMD_UNIT_COST)"
                    + "value(" + brId + ",(select MAT_ID from material where MAT_NAME = '" + material + "'),"
                    + amount + ", (select MAT_UNIT_COST from material where MAT_NAME = '" + material + "'))";
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            updateAfterEvent("-" + amount, material);

            BringMatDetailTable bmdt = new BringMatDetailTable();
            bmdt.callClearRow();
            bmdt.callShowDataRecord();
            bmdt.callEnableButtonCheck();
            setSelectedComponent(bmdt.callGetAllMat());
            JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
            clearTextBox();
        }
    }

    public void editData() {
        String material = materialCbb.getSelectedItem().toString();
        String amount = amountTxt.getText().toString();
        String oldAmount = "";
        if (!isNumeric(amount)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลจำนวนวัสดุให้ถูกต้อง");
        } else {
            String sql = "select bmd_amount from bring_mat_detail where br_id = " + brId
                    + " and MAT_ID = " + "(select MAT_ID from material where MAT_NAME = '" + UPDATE_FRAME.matName + "')";
            try (Connection conn = Gui_db.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    oldAmount = rs.getString(1);
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            sql = "update bring_mat_detail "
                    + "set BMD_AMOUNT = " + amount + ", MAT_ID = (select MAT_ID from material where MAT_NAME = '" + material + "'), "
                    + "BMD_UNIT_COST = (select MAT_UNIT_COST from material where MAT_NAME = '" + material + "') "
                    + "where BR_ID = " + brId + " and MAT_ID = " + "(select MAT_ID from material where MAT_NAME = '" + UPDATE_FRAME.matName + "');";
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println(amount + " " + oldAmount);
            updateAfterEvent(""+(Integer.parseInt(oldAmount)-Integer.parseInt(amount)), material);
            BringMatDetailTable bmdt = new BringMatDetailTable();
            bmdt.callClearRow();
            bmdt.callShowDataRecord();
            bmdt.callEnableButtonCheck();
            JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
            UPDATE_FRAME.dispose();
        }
    }

    public void clearTextBox() {
        amountTxt.setText("");
        materialCbb.setSelectedIndex(0);
    }

    public void setUnitLabel() {
        String material = materialCbb.getSelectedItem().toString();
        String sql = "select MAT_UNIT from material where MAT_NAME = '" + material + "'";
        try (
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                unitLabel.setText(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void updateAfterEvent(String amount, String material) {
        String sql = "{ call update_bring_mat_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, brId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_manufacturing_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, manufacId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_order_manufacture_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, omanuId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_product_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, omanuId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        String matId = "";
        sql = "select MAT_ID from material where MAT_NAME = '" + material + "'";
        try (
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                matId = rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_mat_amount(?,?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, matId);
            stmt.setString(2, amount);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void setSelectedComponent(String allMatInTable) {
        cbModel = new DefaultComboBoxModel();
        String sql = "select MAT_NAME from material where MAT_NAME not in (" + allMatInTable + ")";
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                cbModel.addElement(rs.getString(1));
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        if (updateFlag) {
            if (cbModel.getSize() == 0) {
                UPDATE_FRAME.materialCbb.setEnabled(false);
            } else {
                UPDATE_FRAME.materialCbb.setEnabled(true);
            }

            UPDATE_FRAME.materialCbb.setModel(cbModel);
        } else {
            if (cbModel.getSize() == 0) {
                INSERT_FRAME.setVisible(false);
                new BringMatDetailTable().setInsertButton(false);
            } else {
                new BringMatDetailTable().setInsertButton(true);
                INSERT_FRAME.materialCbb.setModel(cbModel);
                INSERT_FRAME.materialCbb.setSelectedIndex(0);
            }
        }
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amountTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> materialCbb;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel unitLabel;
    // End of variables declaration//GEN-END:variables
}
