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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Supawadee Tamo
 */
public class TaskDetailTable extends javax.swing.JFrame {

    private static TaskDetailTable MY_FRAME = new TaskDetailTable();
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String deliTaskId;
    private static String deliveryDate;
    private static String deliveryId;

    /**
     * Creates new form InstanceProductTable
     */
    public TaskDetailTable() {
        initComponents();
        model = (DefaultTableModel) myTable.getModel();
    }

    public void openFrame(String deliveryId, String deliTaskId, String deliveryDate) {
        this.deliveryId = deliveryId;
        this.deliTaskId = deliTaskId;
        this.deliveryDate = deliveryDate;
        MY_FRAME.clearRow();
        MY_FRAME.showDataRecord();
        MY_FRAME.enableButtonCheck();
        MY_FRAME.setEmptyBlock();
        TaskDetailInsertForm tdf = new TaskDetailInsertForm();
        tdf.setIdAndDate(deliveryId, deliTaskId, deliveryDate);
        tdf.setSelectedComponent(MY_FRAME.getAllOrder());
        MY_FRAME.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        jPanel1 = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        btnManipulate = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        mainMenuButton1 = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        emptyBlockLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToolBar1.setRollover(true);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(200, 247, 197));

        deleteButton.setBackground(new java.awt.Color(236, 240, 241));
        deleteButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        deleteButton.setText(" ลบ");
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        insertButton.setBackground(new java.awt.Color(236, 240, 241));
        insertButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        insertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        insertButton.setText(" เพิ่ม");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        myTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ออเดอร์สินค้า", "จำนวนในรอบ", "จำนวนขาดส่ง"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        myTable.getTableHeader().setReorderingAllowed(false);
        myTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTable);

        btnManipulate.setBackground(new java.awt.Color(236, 240, 241));
        btnManipulate.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btnManipulate.setText("จัดการจำนวน");
        btnManipulate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManipulateActionPerformed(evt);
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

        mainMenuButton1.setBackground(new java.awt.Color(236, 240, 241));
        mainMenuButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        mainMenuButton1.setText("เมนูหลัก");
        mainMenuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButton1ActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("จำนวนที่ว่างในรอบการขนส่งนี้ :");

        emptyBlockLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        emptyBlockLabel.setText("450 ");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("รายละเอียดรอบการขนส่ง");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnManipulate)
                .addGap(352, 352, 352))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(emptyBlockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(275, 275, 275))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(291, 291, 291))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emptyBlockLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(btnManipulate, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 877, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 649, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 649, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String allCheckOrder = getCheckOrder();
        String[] f = getCheckIsFull().split(",");
        String instanceId = "";
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + f.length + " แถว?",
                "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            String sql = "select INSTANCE_ID from task_detail natural join instance"
                    + " where PORDER_ID in (" + allCheckOrder + ") and DTASK_ID = " + deliTaskId;
            try (Connection conn = Gui_db.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {
                int i = 0;
                while (rs.next()) {
                    if (f[i].equals("0")) {
                        sql = "select distinct PROD_ID, INDE_AMOUNT from instance natural join instance_detail where instance_id =" + rs.getString(1);
                        Statement stmt2 = conn.createStatement();
                        ResultSet rs2 = stmt2.executeQuery(sql);
                        CallableStatement cs = conn.prepareCall("{call update_product_amount(?,?)}");
                        while (rs2.next()) {
                            cs.setString(1, rs2.getString(1));
                            cs.setString(2, rs2.getString(2));
                            cs.executeQuery();
                        }
                    }
                    instanceId += rs.getString(1) + ",";
                    i++;
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            sql = "delete from task_detail"
                    + " where INSTANCE_ID in (" + instanceId.substring(0, instanceId.length() - 1) + ")"
                    + " and DTASK_ID = " + deliTaskId;
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            String query = "{ call update_deli_task_amount(?) }";

            try (Connection conn = Gui_db.getConnection();
                    CallableStatement stmt = conn.prepareCall(query)) {
                stmt.setString(1, deliTaskId);
                stmt.executeQuery();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            query = "{ call update_delivery_amount_cost(?) }";

            try (Connection conn = Gui_db.getConnection();
                    CallableStatement stmt = conn.prepareCall(query)) {
                stmt.setString(1, deliveryId);
                stmt.executeQuery();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            clearRow();
            showDataRecord();
            enableButtonCheck();
            TaskDetailInsertForm tdf = new TaskDetailInsertForm();
            tdf.setIdAndDate(deliveryId, deliTaskId, deliveryDate);
            tdf.setSelectedComponent(MY_FRAME.getAllOrder());
            MY_FRAME.setEmptyBlock();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        TaskDetailInsertForm tdf = new TaskDetailInsertForm();
        tdf.setIdAndDate(deliveryId, deliTaskId, deliveryDate);
        tdf.setInsertForm(MY_FRAME.getAllOrder());
    }//GEN-LAST:event_insertButtonActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_myTableMouseClicked

    private void btnManipulateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManipulateActionPerformed
        TaskDetailUpdateForm tduf = new TaskDetailUpdateForm();
        String order = getCheckOrder();
        String sql = "select INSTANCE_ID from instance where PORDER_ID = " + order
                + " and INSTANCE_DELI_DATE = '" + deliveryDate + "'";
        System.out.println(sql);
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                tduf.openFrame(deliveryId, deliTaskId, rs.getString(1), order);
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }//GEN-LAST:event_btnManipulateActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if (checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for (int i = 0; i < myTable.getRowCount(); i++) {
                model.setValueAt(true, i, 0);
            }
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for (int i = 0; i < myTable.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
            checkAllButton.setText("เลือกทั้งหมด");
        }

        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void mainMenuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButton1ActionPerformed
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_mainMenuButton1ActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new DeliveryTaskTable().callOpenFrame();
        MY_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    public void showDataRecord() {
        String sql = "select PORDER_ID, TD_AMOUNT, INSTANCE_TOTAL_AMOUNT"
                + " from task_detail natural join instance where DTASK_ID = " + deliTaskId;
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

                String sql2 = "select sum(TD_AMOUNT) from task_detail natural join instance where"
                        + " PORDER_ID = " + rs.getString(1)
                        + " and INSTANCE_DELI_DATE = '" + deliveryDate + "'";

                try (Statement stmt2 = conn.createStatement();
                        ResultSet rs2 = stmt2.executeQuery(sql2)) {
                    while (rs2.next()) {
                        int result = Integer.parseInt(rs.getString(3)) - Integer.parseInt(rs2.getString(1));
                        model.setValueAt(result, row, 4);
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(TaskDetailTable.class.getName()).log(Level.SEVERE, null, ex);
                }
                row++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TaskDetailTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void setEmptyBlock() {
        String sql = "select DTASK_AMOUNT from deli_task where DTASK_ID = " + deliTaskId;
        int total = 450;
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                total -= Integer.parseInt(rs.getString(1));
            }
            MY_FRAME.emptyBlockLabel.setText("" + total);
        } catch (SQLException ex) {
            Logger.getLogger(TaskDetailTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String getCheckOrder() {
        String checkRow = "";
        for (int i = 0; i < myTable.getRowCount(); i++) {
            if (Boolean.valueOf(myTable.getValueAt(i, 0).toString())) {
                checkRow += myTable.getValueAt(i, 2).toString() + ",";
            }
        }

        if (checkRow.equals("")) {
            return "''";
        }

        return checkRow.substring(0, checkRow.length() - 1);
    }

    public String getCheckIsFull() {
        String checkIsFull = "";
        for (int i = 0; i < myTable.getRowCount(); i++) {
            if (Boolean.valueOf(myTable.getValueAt(i, 0).toString())) {
                checkIsFull += myTable.getValueAt(i, 4).toString() + ",";
            }
        }
        return checkIsFull;
    }

    public void clearRow() {
        int row = model.getRowCount() - 1;
        while (row > -1) {
            model.removeRow(row);
            row--;
        }
    }

    public void enableButtonCheck() {
        String check = getCheckOrder();
        String[] s = check.split(",");
        if (myTable.getRowCount() > 0) {
            checkAllButton.setEnabled(true);
        } else {
            checkAllButton.setEnabled(false);
        }

        if (s.length == 1 && s[0].equals("''")) {
            btnManipulate.setEnabled(false);
            deleteButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        } else if (s.length == 1) {
            btnManipulate.setEnabled(true);
            deleteButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            deleteButton.setEnabled(true);
            btnManipulate.setEnabled(false);
        }
    }

    public String getAllOrder() {
        String allMatInTable = "";
        for (int i = 0; i < myTable.getRowCount(); i++) {
            allMatInTable += myTable.getValueAt(i, 2) + ",";
        }
        if (allMatInTable.equals("")) {
            return "''";
        }

        return allMatInTable.substring(0, allMatInTable.length() - 1);
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

    public void callsetEmptyBlock() {
        MY_FRAME.setEmptyBlock();
    }

    public String callGetAllOrder() {
        return MY_FRAME.getAllOrder();
    }

    public void setInsertButton(boolean bool) {
        MY_FRAME.insertButton.setEnabled(bool);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton btnManipulate;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel emptyBlockLabel;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton mainMenuButton1;
    private javax.swing.JTable myTable;
    // End of variables declaration//GEN-END:variables
}
