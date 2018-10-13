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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author KAZDO
 */
public class ReturnMatDetailTable extends javax.swing.JFrame {

    private static ReturnMatDetailTable MY_FRAME = new ReturnMatDetailTable();
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String amount;
    private static String mrId;
    private static String manufacId;
    private static String omanuId;

    /**
     * Creates new form InstanceProductTable
     */
    public ReturnMatDetailTable() {
        initComponents();
        model = (DefaultTableModel) returnMatDetailTable.getModel();
        TableColumnModel tcm = returnMatDetailTable.getColumnModel();
        tcm.removeColumn(tcm.getColumn(5));
    }

    public void openFrame(String mrId) {
        this.mrId = mrId;
        MY_FRAME.clearRow();
        MY_FRAME.showDataRecord();
        MY_FRAME.enableButtonCheck();
        new ReturnMaterialDetailForm().setSelectedComponent(MY_FRAME.getAllMat());
        MY_FRAME.setVisible(true);
    }

    public void setMafacId(String id) {
        manufacId = id;
    }

    public void setOmanuId(String id) {
        omanuId = id;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        backButton = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        returnMatDetailTable = new javax.swing.JTable();
        orderIdLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel1.setText("ข้อมูลการจัดการงวด");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(104, 195, 163));

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        checkAllButton.setBackground(new java.awt.Color(44, 62, 80));
        checkAllButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        checkAllButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAllButton.setText("เลือกทั้งหมด");
        checkAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setBackground(new java.awt.Color(236, 240, 241));
        mainMenuButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        mainMenuButton.setText("เมนูหลัก");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        returnMatDetailTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        returnMatDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "วัสดุ", "จำนวน", "หน่วย", "mat_id"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        returnMatDetailTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        returnMatDetailTable.getTableHeader().setReorderingAllowed(false);
        returnMatDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                returnMatDetailTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(returnMatDetailTable);
        if (returnMatDetailTable.getColumnModel().getColumnCount() > 0) {
            returnMatDetailTable.getColumnModel().getColumn(0).setResizable(false);
            returnMatDetailTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            returnMatDetailTable.getColumnModel().getColumn(1).setResizable(false);
            returnMatDetailTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            returnMatDetailTable.getColumnModel().getColumn(2).setResizable(false);
            returnMatDetailTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            returnMatDetailTable.getColumnModel().getColumn(3).setResizable(false);
            returnMatDetailTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            returnMatDetailTable.getColumnModel().getColumn(4).setResizable(false);
            returnMatDetailTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            returnMatDetailTable.getColumnModel().getColumn(5).setResizable(false);
        }

        orderIdLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        orderIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderIdLabel.setText("รายละเอียดการคืนวัสดุ");

        jPanel1.setBackground(new java.awt.Color(104, 195, 163));

        insertButton.setBackground(new java.awt.Color(236, 240, 241));
        insertButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        insertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        insertButton.setText(" เพิ่ม");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(236, 240, 241));
        updateButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        updateButton.setText("แก้ไข");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(236, 240, 241));
        deleteButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        deleteButton.setText(" ลบ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(114, 114, 114))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        ReturnMaterialDetailForm rmf = new ReturnMaterialDetailForm();
        rmf.openInsertFrame(mrId, getAllMat());
    }//GEN-LAST:event_insertButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String check = getCheckName();
        check = check.substring(0, check.length() - 2);
        ReturnMaterialDetailForm rmdf = new ReturnMaterialDetailForm();
        rmdf.setUpdateForm(mrId, check, amount, getAllMat());
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String totalCheck = getCheckName();
        String[] s = totalCheck.split(", ");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length + " แถว?",
                "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {
            deleteData();
            clearRow();
            showDataRecord();
            enableButtonCheck();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if (checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for (int i = 0; i < returnMatDetailTable.getRowCount(); i++) {
                model.setValueAt(true, i, 0);
            }
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for (int i = 0; i < returnMatDetailTable.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
            checkAllButton.setText("เลือกทั้งหมด");
        }

        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        ReturnMaterialTable rmt = new ReturnMaterialTable();
        rmt.openFrame();
        MY_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        new MainFrame().setVisible(true);
        MY_FRAME.dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void returnMatDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_returnMatDetailTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_returnMatDetailTableMouseClicked

    public void showDataRecord() {
        String sql = "select MAT_NAME, RMD_AMOUNT, MAT_UNIT, MAT_ID from return_mat_detail natural join material where MR_ID = " + mrId;
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int row = 0;
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row + 1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                model.setValueAt(rs.getString(3), row, 4);
                model.setValueAt(rs.getString(4), row, 5);
                row++;
            }

            ReturnMaterialDetailForm rmdf = new ReturnMaterialDetailForm();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public String getCheckMatId() {
        String selectMat = "";
        for (int i = 0; i < returnMatDetailTable.getRowCount(); i++) {
            if (Boolean.valueOf(returnMatDetailTable.getValueAt(i, 0).toString())) {
                selectMat += returnMatDetailTable.getModel().getValueAt(i, 5) + ", ";
            }
        }

        if (selectMat.equals("")) {
            return "''";
        }

        return selectMat.substring(0, selectMat.length() - 2);
    }

    public void deleteData() {
        String checkMatId = getCheckMatId();

        String sql = "select MAT_ID, RMD_AMOUNT from return_mat_detail natural join material "
                + "where MR_ID = " + mrId + " and MAT_ID in (" + checkMatId + ")";
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                sql = "{ call update_mat_amount(?,?) }";

                CallableStatement stmt1 = conn.prepareCall(sql);
                stmt1.setString(1, rs.getString(1));
                stmt1.setString(2, "-"+rs.getString(2));
                stmt1.executeQuery();
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "delete from return_mat_detail "
                + "where MR_ID = " + mrId + " and MAT_ID in (" + checkMatId + ")";

        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_return_mat_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, mrId);
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

        sql = "{ call update_order_manufacture_status_qc(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, omanuId);
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

        MY_FRAME.insertButton.setEnabled(true);
    }

    public String getCheckName() {
        String nameCheck = "";
        for (int i = 0; i < returnMatDetailTable.getRowCount(); i++) {
            if (Boolean.valueOf(returnMatDetailTable.getValueAt(i, 0).toString())) {
                nameCheck += returnMatDetailTable.getValueAt(i, 2).toString() + ", ";
                amount = returnMatDetailTable.getValueAt(i, 3).toString();
            }
        }

        return nameCheck;
    }

    public void clearRow() {
        int row = model.getRowCount() - 1;
        while (row > -1) {
            model.removeRow(row);
            row--;
        }
    }

    public void enableButtonCheck() {
        String totalCheck = getCheckName();
        String[] s = totalCheck.split(", ");

        if (returnMatDetailTable.getRowCount() > 0) {
            checkAllButton.setEnabled(true);
        } else {
            checkAllButton.setEnabled(false);
        }

        if (s.length == 1 && s[0].equals("")) {
            updateButton.setEnabled(false);
            deleteButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        } else if (s.length == 1) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(false);
        }
    }

    public String getAllMat() {
        String allMatInTable = "";
        for (int i = 0; i < returnMatDetailTable.getRowCount(); i++) {
            allMatInTable += "'" + returnMatDetailTable.getValueAt(i, 2) + "', ";
        }
        if (allMatInTable.equals("")) {
            allMatInTable = "''";
        } else {
            allMatInTable = allMatInTable.substring(0, allMatInTable.length() - 2);
        }

        return allMatInTable;
    }

    public void callClearRow() {
        MY_FRAME.clearRow();
    }

    public void callShowDataRecord() {
        MY_FRAME.showDataRecord();
    }

    public void callEnableButtonCheck() {
        MY_FRAME.enableButtonCheck();
    }

    public String callGetAllMat() {
        return MY_FRAME.getAllMat();
    }

    public int callGetRowCount() {
        return MY_FRAME.returnMatDetailTable.getRowCount();
    }

    public void setInsertButton(boolean bool) {
        MY_FRAME.insertButton.setEnabled(bool);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JTable returnMatDetailTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
