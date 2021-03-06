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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZDO
 */
public class DeliveryTaskTable extends javax.swing.JFrame {
    private static DeliveryTaskTable MY_FRAME = new DeliveryTaskTable();
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String deliveryId;
    private static String deliveryDate;
    /**
     * Creates new form InstanceProductTable
     */
    public DeliveryTaskTable() {
        initComponents();
        model = (DefaultTableModel) myTable.getModel();
    }
    
    public void openFrame(String id, String date) {
        deliveryId = id;
        MY_FRAME.clearRow();
        MY_FRAME.showDataRecord();
        MY_FRAME.enableButtonCheck();
        deliveryDate = date;
        String[] d = date.split("-");
        MY_FRAME.dateLabel.setText("วันที่ " + d[2] + "/" + d[1] + "/" + d[0]);
        MY_FRAME.setVisible(true);
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
        backButton = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        mainMenuButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dateLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        taskDetailButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(135, 211, 124));

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

        mainMenuButton1.setBackground(new java.awt.Color(236, 240, 241));
        mainMenuButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        mainMenuButton1.setText("เมนูหลัก");
        mainMenuButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ข้อมูลรอบการขนส่ง");

        dateLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dateLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dateLabel.setText("วันที่");

        myTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ค่าใช้จ่าย", "จำนวนสินค้า", "เวลาออกรอบ"
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
        myTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                myTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(myTable);
        if (myTable.getColumnModel().getColumnCount() > 0) {
            myTable.getColumnModel().getColumn(0).setResizable(false);
            myTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            myTable.getColumnModel().getColumn(1).setResizable(false);
            myTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            myTable.getColumnModel().getColumn(2).setResizable(false);
            myTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            myTable.getColumnModel().getColumn(3).setResizable(false);
            myTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            myTable.getColumnModel().getColumn(4).setResizable(false);
            myTable.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        taskDetailButton.setBackground(new java.awt.Color(236, 240, 241));
        taskDetailButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        taskDetailButton.setText("รายละเอียดรอบขนส่ง");
        taskDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskDetailButtonActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(135, 211, 124));

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
        deleteButton.setActionCommand(" ลบ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        insertButton.setBackground(new java.awt.Color(236, 240, 241));
        insertButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        insertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        insertButton.setText(" เพิ่ม");
        insertButton.setActionCommand(" เพิ่ม");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
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
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(backButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(169, 169, 169))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(dateLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 31, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(mainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(taskDetailButton)
                .addGap(390, 390, 390))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(dateLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(taskDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(mainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String checkRow = getCheckRow();
        DeliveryTaskForm dtf = new DeliveryTaskForm();
        
        String sql = "select DTASK_ID, DTASK_TIME, EMP_FNAME, EMP_LNAME, DTASK_COST from deli_task natural join employee WHERE DELI_ID = " + deliveryId + " and DTASK_TIME = " + checkRow;
        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            // loop through the result set
            while (rs.next()) {
                dtf.setUpdateFlag(true);
                dtf.setUpdateForm(rs.getString(1), rs.getString(2), rs.getString(3) + " " + rs.getString(4), rs.getString(5));
            }
            
        } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(DeliveryTaskTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
            int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION) {
                deleteData(checkRow);
                clearRow();
                showDataRecord();
                enableButtonCheck();
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if(checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for(int i=0; i<myTable.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for(int i=0; i<myTable.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new DeliveryTable().openFrame();
        MY_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void myTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_myTableMouseClicked

    private void mainMenuButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButton1ActionPerformed
        new MainFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_mainMenuButton1ActionPerformed

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        DeliveryTaskForm dtf = new DeliveryTaskForm();
        dtf.setUpdateFlag(false);
        dtf.setInsertForm(deliveryId);
    }//GEN-LAST:event_insertButtonActionPerformed

    private void taskDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskDetailButtonActionPerformed
        String sql = "select DTASK_ID from deli_task where DELI_ID = " + deliveryId + " and DTASK_TIME = " + getCheckRow();
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                new TaskDetailTable().openFrame(deliveryId, rs.getString(1), deliveryDate);
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        MY_FRAME.dispose();
    }//GEN-LAST:event_taskDetailButtonActionPerformed
    
    public void showDataRecord() {
            String sql = "select DTASK_COST, DTASK_AMOUNT, DTASK_TIME from deli_task where DELI_ID = " + deliveryId;
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int row=0;
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row+1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                model.setValueAt(rs.getString(3), row, 4);
                row++;
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
    }
    
    public void deleteData(String time) {
        String sql = "delete from deli_task where DELI_ID = " + deliveryId + " and DTASK_TIME in (" + time + ")";
        
        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        String query = "{ call update_delivery_amount_cost(?) }";
 
                try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(query)) {
                stmt.setString(1, deliveryId);
                stmt.executeQuery();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
        
    }
    
    public String getCheckRow() {
        String checkRow="";
        for(int i=0; i<myTable.getRowCount(); i++) {
            if(Boolean.valueOf(myTable.getValueAt(i, 0).toString())) {
                checkRow += "'" + myTable.getValueAt(i, 4).toString() + "', ";
            }
        }
        
        if(checkRow.equals(""))
            return "''";
        
        return checkRow.substring(0, checkRow.length()-2);
    }
    
    public void clearRow() {
        int row = model.getRowCount()-1;
        while(row > -1) {
            model.removeRow(row);
            row--;
        }
    }
    
    public void enableButtonCheck() {
        String check = getCheckRow();
        String[] s = check.split(", ");
        if(myTable.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if (s.length == 1 && s[0].equals("''")) {
            updateButton.setEnabled(false);
            deleteButton.setEnabled(false);
            taskDetailButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        else if (s.length == 1) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            taskDetailButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        }
        
        else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(false);
            taskDetailButton.setEnabled(false);
        }
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
    
    public void callOpenFrame() {
        MY_FRAME.openFrame(deliveryId, deliveryDate);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JLabel dateLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton1;
    private javax.swing.JTable myTable;
    private javax.swing.JButton taskDetailButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
