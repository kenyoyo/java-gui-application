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
public class BringMaterialTable extends javax.swing.JFrame {
    private static BringMaterialTable MY_FRAME = new BringMaterialTable();
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String manufacId = "";
    private static String date = "";
    private static String time = "";
    private static String empName = "";
    /**
     * Creates new form InstanceProductTable
     */
    public BringMaterialTable() {
        initComponents();
        model = (DefaultTableModel) bringMatTable.getModel();
    }
    
    public void setManufacId(String id) {
        manufacId = id;
    }
    
    public void openFrame() {
        MY_FRAME.clearRow();
        MY_FRAME.showDataRecord();
        MY_FRAME.enableButtonCheck();
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

        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        BringMatDetailButton = new javax.swing.JButton();
        orderIdLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bringMatTable = new javax.swing.JTable();
        checkAllButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jLabel1.setText("ข้อมูลการจัดการงวด");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(200, 247, 197));

        jPanel1.setBackground(new java.awt.Color(200, 247, 197));

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
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
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        BringMatDetailButton.setBackground(new java.awt.Color(236, 240, 241));
        BringMatDetailButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BringMatDetailButton.setText("รายละเอียดการเบิก");
        BringMatDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BringMatDetailButtonActionPerformed(evt);
            }
        });

        orderIdLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        orderIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderIdLabel.setText("การเบิกวัสดุ");

        bringMatTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        bringMatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "วันที่", "เวลา", "พนักงาน"
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
        bringMatTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        bringMatTable.getTableHeader().setReorderingAllowed(false);
        bringMatTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bringMatTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bringMatTable);
        if (bringMatTable.getColumnModel().getColumnCount() > 0) {
            bringMatTable.getColumnModel().getColumn(0).setResizable(false);
            bringMatTable.getColumnModel().getColumn(0).setPreferredWidth(55);
            bringMatTable.getColumnModel().getColumn(1).setResizable(false);
            bringMatTable.getColumnModel().getColumn(1).setPreferredWidth(55);
            bringMatTable.getColumnModel().getColumn(2).setResizable(false);
            bringMatTable.getColumnModel().getColumn(2).setPreferredWidth(100);
            bringMatTable.getColumnModel().getColumn(3).setResizable(false);
            bringMatTable.getColumnModel().getColumn(3).setPreferredWidth(110);
            bringMatTable.getColumnModel().getColumn(4).setResizable(false);
            bringMatTable.getColumnModel().getColumn(4).setPreferredWidth(200);
        }

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

        mainMenuButton.setBackground(new java.awt.Color(236, 240, 241));
        mainMenuButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        mainMenuButton.setText("เมนูหลัก");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 518, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(387, 387, 387)
                        .addComponent(BringMatDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(orderIdLabel)
                .addGap(407, 407, 407))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(217, 217, 217)
                        .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(orderIdLabel)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)))
                        .addComponent(BringMatDetailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        BringMaterialForm bmf = new BringMaterialForm();
        bmf.setUpdateFlag(false);
        bmf.openInsertFrame();
    }//GEN-LAST:event_insertButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        int check = getCheckRow();
        BringMaterialForm bmf = new BringMaterialForm();
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat formatter = new SimpleDateFormat("HH:mm:ss");
        
        try {
            java.sql.Time timer = new java.sql.Time(formatter.parse(time).getTime());
            Date reportDate = format.parse(date);
            bmf.setUpdateFlag(true);
            bmf.setUpdateForm(reportDate, timer, empName, getBrId());
        } catch (ParseException ex) {
            Logger.getLogger(BringMaterialTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int totalCheck = getCheckRow();
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + totalCheck +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        if(reply == JOptionPane.YES_OPTION) {
            deleteData();
            clearRow();
            showDataRecord();
            enableButtonCheck();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if(checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for(int i=0; i<bringMatTable.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for(int i=0; i<bringMatTable.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new Mfturing_Table().openFrame();
        MY_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        new MainFrame().setVisible(true);
        MY_FRAME.dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void bringMatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bringMatTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_bringMatTableMouseClicked

    private void BringMatDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BringMatDetailButtonActionPerformed
        BringMatDetailTable bmdt = new BringMatDetailTable();
        bmdt.openFrame(getBrId());
        MY_FRAME.setVisible(false);
    }//GEN-LAST:event_BringMatDetailButtonActionPerformed
    
    public String getBrId() {
        getCheckRow();
        String brId = "";
        String[] cutEmp = empName.split(" ");
        String getBrId = "select BR_ID from bring_material where BR_DATE_TIME = '" + date + " " + time + "' and "
                       + "EMP_ID = (select EMP_ID from employee where EMP_FNAME = '" + cutEmp[0] + "' and EMP_LNAME = '" + cutEmp[1] + "');";
            System.out.println(getBrId);    
            try (Connection conn = Gui_db.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(getBrId)) {

                while (rs.next()) {
                    brId = rs.getString(1);
                }

                } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                }
        return brId;
    }
    
    public void showDataRecord() {
            String sql = "select BR_DATE_TIME, EMP_FNAME, EMP_LNAME from manufacturing natural join bring_material natural join employee "
                         + "where MAFAC_ID = "+ manufacId +" order by BR_DATE_TIME DESC";
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int row=0;
            while (rs.next()) {
                String[] datetime = rs.getString(1).split(" ");
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row+1, row, 1);
                model.setValueAt(datetime[0], row, 2);
                model.setValueAt(datetime[1], row, 3);
                model.setValueAt(rs.getString(2) + " " + rs.getString(3), row, 4);
            
                row++;
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
    }
    
    public void deleteData() {
        for(int i=0; i<bringMatTable.getRowCount(); i++) {
            if(Boolean.valueOf(bringMatTable.getValueAt(i, 0).toString())) {
                date = bringMatTable.getValueAt(i, 2).toString();
                time = bringMatTable.getValueAt(i, 3).toString();
                empName = bringMatTable.getValueAt(i, 4).toString();
                String[] cutEmp = empName.split(" ");
                String sql = "delete from bring_material where BR_DATE_TIME = '" + date + " " + time + "' and "
                     + "EMP_ID = (select EMP_ID from employee where EMP_FNAME = '" + cutEmp[0] + "' and EMP_LNAME = '" + cutEmp[1] + "');";
                        
                try {
                    Connection conn = Gui_db.getConnection();
                    Statement stmt = conn.createStatement();
                    stmt.executeUpdate(sql);
                } catch (SQLException ex) {
                System.out.println(ex.getMessage());
                }
            }
        }
    }
    
    public int getCheckRow() {
        int checkRow=0;
        for(int i=0; i<bringMatTable.getRowCount(); i++) {
            if(Boolean.valueOf(bringMatTable.getValueAt(i, 0).toString())) {
                checkRow++;
                time = bringMatTable.getValueAt(i, 3).toString();
                date = bringMatTable.getValueAt(i, 2).toString();
                empName = bringMatTable.getValueAt(i, 4).toString();
            }
        }
        
        return checkRow;
    }
    
    public void clearRow() {
        int row = model.getRowCount()-1;
        while(row > -1) {
            model.removeRow(row);
            row--;
        }
    }
    
    public void enableButtonCheck() {
        int totalCheck = getCheckRow();
        if(bringMatTable.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if (totalCheck == 0) {
            updateButton.setEnabled(false);
            deleteButton.setEnabled(false);
            BringMatDetailButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        else if (totalCheck == 1) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            BringMatDetailButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        }
        
        else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(false);
            BringMatDetailButton.setEnabled(false);
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
    private javax.swing.JButton BringMatDetailButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTable bringMatTable;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
