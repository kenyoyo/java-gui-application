/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

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
public class DeliveryTable extends javax.swing.JFrame {
    private static DeliveryTable MY_FRAME = new DeliveryTable();
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String startDate = "";
    private static String finishDate = "";
    /**
     * Creates new form InstanceProductTable
     */
    public DeliveryTable() {
        initComponents();
        model = (DefaultTableModel) myTable.getModel();
    }
    
    public void openFrame() {
        MY_FRAME.clearRow();
        MY_FRAME.showDataRecord();
        MY_FRAME.enableButtonCheck();
        MY_FRAME.setVisible(true);
    }
     public void openSeacrh() {
        MY_FRAME.clearRow();
        MY_FRAME.showSearch();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        updateButton = new javax.swing.JButton();
        insertButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        myTable = new javax.swing.JTable();
        deliTaskButton = new javax.swing.JButton();
        mainMenuButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(63, 195, 128));

        updateButton.setBackground(new java.awt.Color(236, 240, 241));
        updateButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        updateButton.setText("แก้ไข");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
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

        deleteButton.setBackground(new java.awt.Color(236, 240, 241));
        deleteButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        deleteButton.setText(" ลบ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        myTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        myTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "วันที่ขนส่ง", "ค่าใช้จ่าย", "จำนวน"
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

        deliTaskButton.setBackground(new java.awt.Color(236, 240, 241));
        deliTaskButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        deliTaskButton.setText("จัดรอบการขนส่ง");
        deliTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliTaskButtonActionPerformed(evt);
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

        jButton2.setBackground(new java.awt.Color(236, 240, 241));
        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton2.setText("รีเซ็ต");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(236, 240, 241));
        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton1.setText("ระบุเงื่อนไข");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("ข้อมูลการขนส่ง");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 31, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(32, 32, 32)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel1)
                                .addGap(209, 209, 209)))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(updateButton)
                            .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deliTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(387, 387, 387))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(124, 124, 124))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(189, 189, 189)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(deliTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)))
                .addComponent(mainMenuButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
        DeliveryForm DF = new DeliveryForm();
        
        String sql = "select DELI_ID, DELI_DATE from delivery WHERE DELI_DATE = " + s[0];
        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            // loop through the result set
            while (rs.next()) {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format.parse(rs.getString(2));
                DF.setUpdateFlage(true);
                DF.setUpdateForm(rs.getString(1), date);
                
            }
            
        } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(DeliveryTable.class.getName()).log(Level.SEVERE, null, ex);
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
        new OrderMenu().setVisible(true);
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
        DeliveryForm delif = new DeliveryForm();
        delif.setUpdateFlage(false);
        delif.setInsertForm();
    }//GEN-LAST:event_insertButtonActionPerformed

    private void deliTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliTaskButtonActionPerformed
        String id = "";
        String date = getCheckRow();
        String sql = "select DELI_ID from delivery WHERE DELI_DATE = " + date;
        System.out.println(getCheckRow());
        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            // loop through the result set
            while (rs.next()) {
                id = rs.getString(1);
            }
            
        } catch (SQLException ex) { 
                    System.out.println(ex.getMessage());
        }
        new DeliveryTaskTable().openFrame(id, date.substring(1, date.length()-1));
        MY_FRAME.dispose();
    }//GEN-LAST:event_deliTaskButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         DeliverySearch DS = new DeliverySearch();
         DS.openInsertFrame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       MY_FRAME.openFrame();
    }//GEN-LAST:event_jButton2ActionPerformed
    
    public void showDataRecord() {
            String sql = "select DELI_DATE, DELI_COST, DELI_AMOUNT from delivery order by DELI_DATE DESC";
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
    
    public void showSearch(){
        
           String sql = "select DELI_DATE, DELI_COST, DELI_AMOUNT from delivery where DELI_DATE >= '" + startDate + "' and DELI_DATE <= '" + finishDate + "'" + "order by DELI_DATE DESC";
           System.out.println(sql); 
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
    
    public void setDate1(String date1) {
         startDate = date1;
    }

    public void setDate2(String date2) {
         finishDate = date2;
    }
    
    public void deleteData(String date) {
        String sql = "delete from delivery where DELI_DATE in (" + date + ")";
        
        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public String getCheckRow() {
        String checkRow="";
        for(int i=0; i<myTable.getRowCount(); i++) {
            if(Boolean.valueOf(myTable.getValueAt(i, 0).toString())) {
                checkRow += "'" + myTable.getValueAt(i, 2).toString() + "', ";
            }
        }
        
        if (checkRow.equals(""))
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
            deliTaskButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        else if (s.length == 1) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            deliTaskButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        }
        
        else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(false);
            deliTaskButton.setEnabled(false);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton deliTaskButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton1;
    private javax.swing.JTable myTable;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}