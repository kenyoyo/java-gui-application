package gui_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZDO
 */
public class ClaimTable extends javax.swing.JFrame {

    private static ClaimTable CLAIM_FRAME = new ClaimTable();
    private static String CLAIM_ID = "";

    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String startDate = "";
    private static String finishDate = "";
    

    public ClaimTable() {
        initComponents();
        model = (DefaultTableModel) ClaimTable.getModel();

        //showDataRecord();
        //enableButtonCheck();
    }
      public void openSeacrh() {
        CLAIM_FRAME.clearRow();
        CLAIM_FRAME.showSearch();
        CLAIM_FRAME.setVisible(true);
    }
    public void openFrame() {
        CLAIM_FRAME.clearRow();
        CLAIM_FRAME.showDataRecord();
        CLAIM_FRAME.enableButtonCheck();
        CLAIM_FRAME.setVisible(true);
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
        MainMenuButton = new javax.swing.JButton();
        instanceManageButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ClaimTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        poInsertButton = new javax.swing.JButton();
        poEditButton = new javax.swing.JButton();
        poDeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(171, 183, 183));

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

        MainMenuButton.setBackground(new java.awt.Color(236, 240, 241));
        MainMenuButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        MainMenuButton.setText("เมนูหลัก");
        MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtonActionPerformed(evt);
            }
        });

        instanceManageButton.setBackground(new java.awt.Color(236, 240, 241));
        instanceManageButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        instanceManageButton.setText("รายละเอียดข้อมูลการเคลม");
        instanceManageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instanceManageButtonActionPerformed(evt);
            }
        });

        ClaimTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        ClaimTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "หมายเลขออเดอร์", "วันที่ส่งงวด", "วันที่แจ้ง", "ขั้นตอนการเคลม", "สถานะการเคลม", "รวมเงินขาดทุน"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ClaimTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        ClaimTable.getTableHeader().setReorderingAllowed(false);
        ClaimTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClaimTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ClaimTable);
        if (ClaimTable.getColumnModel().getColumnCount() > 0) {
            ClaimTable.getColumnModel().getColumn(0).setResizable(false);
            ClaimTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            ClaimTable.getColumnModel().getColumn(1).setResizable(false);
            ClaimTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            ClaimTable.getColumnModel().getColumn(2).setResizable(false);
            ClaimTable.getColumnModel().getColumn(2).setPreferredWidth(125);
            ClaimTable.getColumnModel().getColumn(3).setResizable(false);
            ClaimTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            ClaimTable.getColumnModel().getColumn(4).setResizable(false);
            ClaimTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            ClaimTable.getColumnModel().getColumn(5).setResizable(false);
            ClaimTable.getColumnModel().getColumn(5).setPreferredWidth(130);
            ClaimTable.getColumnModel().getColumn(6).setResizable(false);
            ClaimTable.getColumnModel().getColumn(6).setPreferredWidth(145);
            ClaimTable.getColumnModel().getColumn(7).setResizable(false);
            ClaimTable.getColumnModel().getColumn(7).setPreferredWidth(150);
        }

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("เคลม");

        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton1.setText("ระบุเงื่อนไข");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jButton2.setText("รีเซ็ต");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(171, 183, 183));

        poInsertButton.setBackground(new java.awt.Color(236, 240, 241));
        poInsertButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        poInsertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        poInsertButton.setText(" เพิ่ม");
        poInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poInsertButtonActionPerformed(evt);
            }
        });

        poEditButton.setBackground(new java.awt.Color(236, 240, 241));
        poEditButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        poEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        poEditButton.setText("แก้ไข");
        poEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poEditButtonActionPerformed(evt);
            }
        });

        poDeleteButton.setBackground(new java.awt.Color(236, 240, 241));
        poDeleteButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        poDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        poDeleteButton.setText(" ลบ");
        poDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(poInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, 108, Short.MAX_VALUE)
                    .addComponent(poDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(poInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(poDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(475, 475, 475)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 805, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(instanceManageButton)
                .addGap(498, 498, 498))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(41, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(30, 30, 30)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(28, 28, 28)
                        .addComponent(instanceManageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(268, 268, 268)
                        .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void poInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poInsertButtonActionPerformed
        ClaimForm CF = new ClaimForm();
        CF.setUpdateFlag(false);
        CF.openInsertFrame();

    }//GEN-LAST:event_poInsertButtonActionPerformed

    private void poDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poDeleteButtonActionPerformed
        String checkPorderID = getCheckRow_PORDER_ID();
        String[] s = checkPorderID.split(", ");
        String checkInstance_deli_date = getCheckROW_INSTANCE_DELI_DATE();
        String[] s1 = checkInstance_deli_date.split(", ");
        checkPorderID = checkPorderID.substring(0, checkPorderID.length() - 2);
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length + " แถว?",
                "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        if (reply == JOptionPane.YES_OPTION) {

            for (int i = 0; i < s.length; i++) {
                deleteData(s[i], s1[i]);
            }

            clearRow();
            showDataRecord();
            enableButtonCheck();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
        }
    }//GEN-LAST:event_poDeleteButtonActionPerformed


    private void poEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poEditButtonActionPerformed

        ClaimForm CF = new ClaimForm();
        CF.setUpdateFlag(true);

        String[] getAll = new String[5];
        String getDeliDate = "";
        for (int i = 0; i < ClaimTable.getRowCount(); i++) {
            if (Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                getAll[0] = ClaimTable.getValueAt(i, 2).toString(); // porderID
                getAll[1] = ClaimTable.getValueAt(i, 3).toString(); // instance_deli_date
                getAll[2] = ClaimTable.getValueAt(i, 4).toString(); // c_claim
                getAll[3] = ClaimTable.getValueAt(i, 5).toString(); // c_statu
                getAll[4] = ClaimTable.getValueAt(i, 6).toString(); // c_repair
            }
        }

        try {
            CF.setUpdateForm(getAll[0], getAll[2], getAll[3], getAll[4]);

        } catch (ParseException ex) {
            Logger.getLogger(ClaimTable.class.getName()).log(Level.SEVERE, null, ex);
        }

        for (int i = 0; i < ClaimTable.getRowCount(); i++) { //เช็คว่า porderId ที่ใส่ค่าเข้ามามีไหม ถ้ามีให้ เก็บ Instance_deli_date เพื่อไป not in
            if (!Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString()) || Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {

                if (getAll[0].equals(ClaimTable.getValueAt(i, 2).toString()) && !Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                    getDeliDate += "'" + ClaimTable.getValueAt(i, 3).toString() + "', ";
                }

            }

        }

        String getDeli = getDeliDate;

        if (getDeliDate.equals("")) {
            System.out.println("empty");
            getDeliDate = "''";
            CF.addUpdateClaimComboBox(getAll[0], getAll[1], getDeliDate);
        } else {
            System.out.println("not empty");
            String subDeli = getDeli.substring(0, getDeli.length() - 2);
            CF.addUpdateClaimComboBox(getAll[0], getAll[1], subDeli);
        }

    }//GEN-LAST:event_poEditButtonActionPerformed

    private void ClaimTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClaimTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_ClaimTableMouseClicked

    private void MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MainMenuButtonActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if (checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for (int i = 0; i < ClaimTable.getRowCount(); i++) {
                model.setValueAt(true, i, 0);
            }
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for (int i = 0; i < ClaimTable.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
            checkAllButton.setText("เลือกทั้งหมด");
        }

        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void instanceManageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instanceManageButtonActionPerformed

        ClaimDetailTable CDT = new ClaimDetailTable();
        ClaimDetailForm CDF = new ClaimDetailForm();
        String check1 = getCheckRow_PORDER_ID();
        String[] s1 = check1.split(", ");

        String check2 = getCheckROW_INSTANCE_DELI_DATE();
        String[] s2 = check2.split(", ");

        String check3 = getCheckRow_C_RERAIR();
        String[] s3 = check3.split(", ");

        String sql = "SELECT C_ID FROM CLAIM WHERE INSTANCE_ID = (select INSTANCE_ID from INSTANCE where PORDER_ID = " + s1[0] + " AND INSTANCE_DELI_DATE = " + s2[0] + ")";

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int row = 0;
            while (rs.next()) {

                CDT.setClaim_IDtoCDT(rs.getString(1));
                CDF.setClaim_IDtoCDF(rs.getString(1));

                System.out.println("C_ID = " + rs.getString(1));

                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
       
        if (s3[0].equals("กำลังดำเนินการ")) {
            CDT.openFrame(false);
        } else if (s3[0].equals("ดำเนินการเสร็จสมบูรณ์")) {
            CDT.openFrame(true);
        }

        //CDT.callClearRow();
        //CDT.callShowDataRecord();
        CLAIM_FRAME.dispose();


    }//GEN-LAST:event_instanceManageButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new OrderMenu().setVisible(true);
        
        CLAIM_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        ClaimSearch CS = new ClaimSearch();
        CS.openInsertFrame();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      CLAIM_FRAME.openFrame();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(ClaimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaimTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                CLAIM_FRAME.setVisible(true);
            }
        });
    }

    public void showDataRecord() {
        String sql = "select PORDER_ID, INSTANCE_DELI_DATE, C_DATE, C_STATUS, C_REPAIR, C_COST "
                + "from CLAIM natural join INSTANCE order by INSTANCE_DELI_DATE DESC;";
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

                String c_statusName = "";
                switch (rs.getString(4)) {
                    case "1":
                        c_statusName = "รับเรื่อง";
                        break;
                    case "2":
                        c_statusName = "รับของ";
                        break;
                    case "3":
                        c_statusName = "ตรวจสอบ";
                        break;
                    case "4":
                        c_statusName = "ส่งเคลม";
                        break;
                    default:
                        break;
                }

                model.setValueAt(c_statusName, row, 5);

                String c_repairName = "";
                if (rs.getString(5).equals("1")) {
                    c_repairName = "กำลังดำเนินการ";
                } else if (rs.getString(5).equals("2")) {
                    c_repairName = "ดำเนินการเสร็จสมบูรณ์";
                }
                model.setValueAt(c_repairName, row, 6);
                model.setValueAt(rs.getString(6), row, 7);

                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void showSearch(){
        String sql = "select PORDER_ID, INSTANCE_DELI_DATE, C_DATE, C_STATUS, C_REPAIR, C_COST "
                + "from CLAIM natural join INSTANCE where C_DATE >= '" + startDate + "' and C_DATE <= '" + finishDate + "'"+ "order by INSTANCE_DELI_DATE DESC;";
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

                String c_statusName = "";
                switch (rs.getString(4)) {
                    case "1":
                        c_statusName = "รับเรื่อง";
                        break;
                    case "2":
                        c_statusName = "รับของ";
                        break;
                    case "3":
                        c_statusName = "ตรวจสอบ";
                        break;
                    case "4":
                        c_statusName = "ส่งเคลม";
                        break;
                    default:
                        break;
                }

                model.setValueAt(c_statusName, row, 5);

                String c_repairName = "";
                if (rs.getString(5).equals("1")) {
                    c_repairName = "กำลังดำเนินการ";
                } else if (rs.getString(5).equals("2")) {
                    c_repairName = "ดำเนินการเสร็จสมบูรณ์";
                }
                model.setValueAt(c_repairName, row, 6);
                model.setValueAt(rs.getString(6), row, 7);

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
    public void deleteData(String porderID, String IndeliDate) {

        String sql = "DELETE FROM CLAIM WHERE C_ID = (SELECT C_ID WHERE INSTANCE_ID = (SELECT INSTANCE_ID FROM INSTANCE WHERE PORDER_ID = " + porderID + " AND INSTANCE_DELI_DATE = " + IndeliDate + ") "
                + "AND INSTANCE_ID = (SELECT INSTANCE_ID FROM INSTANCE WHERE PORDER_ID = " + porderID + " AND INSTANCE_DELI_DATE = " + IndeliDate + "))";

        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public String getCheckRow_C_RERAIR() {
        String checkRow_C_REPAIR = "";
        for (int i = 0; i < ClaimTable.getRowCount(); i++) {
            if (Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                checkRow_C_REPAIR += ClaimTable.getValueAt(i, 6).toString() + ", ";
            }
        }

        return checkRow_C_REPAIR;

    }

    public String getCheckRow_PORDER_ID() {
        String checkRowPORDER = "";
        for (int i = 0; i < ClaimTable.getRowCount(); i++) {
            if (Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                checkRowPORDER += ClaimTable.getValueAt(i, 2).toString() + ", ";
            }
        }

        return checkRowPORDER;
    }

    public String getCheckROW_INSTANCE_DELI_DATE() {
        String checkRowInDeliDate = "";
        for (int i = 0; i < ClaimTable.getRowCount(); i++) {
            if (Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                checkRowInDeliDate += "'" + ClaimTable.getValueAt(i, 3).toString() + "', ";
            }
        }
        return checkRowInDeliDate;
    }

    public String getPorder_idINrow() {

        String porder_idINrow = "";
        for (int i = 0; i < ClaimTable.getRowCount(); i++) {
            if (!Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString()) || Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                porder_idINrow += ClaimTable.getValueAt(i, 2).toString() + ", ";
            }
        }

        return porder_idINrow;

    }

    public String getInstance_Deli_DateINrow() {
        String instance_deli_dateINrow = "";
        for (int i = 0; i < ClaimTable.getRowCount(); i++) {
            if (!Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString()) || Boolean.valueOf(ClaimTable.getValueAt(i, 0).toString())) {
                instance_deli_dateINrow += "'" + ClaimTable.getValueAt(i, 3).toString() + "', ";
            }
        }

        return instance_deli_dateINrow;
    }

    public void setPORDER(String porderIdTxt, Boolean value) {
        ClaimForm CF = new ClaimForm();
        String instance_deli_date = "";

        if (value == true) { //edit data

            for (int i = 0; i < CLAIM_FRAME.ClaimTable.getRowCount(); i++) {
                if (Boolean.valueOf(CLAIM_FRAME.ClaimTable.getValueAt(i, 0).toString())
                        && porderIdTxt.equals(CLAIM_FRAME.ClaimTable.getValueAt(i, 2).toString())) {
                    instance_deli_date += "";

                } else if (!Boolean.valueOf(CLAIM_FRAME.ClaimTable.getValueAt(i, 0).toString())
                        && porderIdTxt.equals(CLAIM_FRAME.ClaimTable.getValueAt(i, 2).toString())) {
                    instance_deli_date += "'" + CLAIM_FRAME.ClaimTable.getValueAt(i, 3).toString() + "', ";
                }
            }

            if (instance_deli_date.equals("")) {
                CF.setINSTANCE_DELI_DATE("''");
            } else {

                String s = instance_deli_date;
                String sub = s.substring(0, s.length() - 2);
                CF.setINSTANCE_DELI_DATE(sub);
            }

        } else if (value == false) { // insert data

            int sizeTable = CLAIM_FRAME.ClaimTable.getRowCount();
            ArrayList<Integer> arrList = new ArrayList<>(sizeTable);
            ArrayList<String> instance_deli_dateArr = new ArrayList<>(sizeTable);

            for (int i = 0; i < CLAIM_FRAME.ClaimTable.getRowCount(); i++) { //เช็คว่า porderId ที่ใส่ค่าเข้ามามีไหม ถ้ามีให้ เก็บ Instance_deli_date เพื่อไป not in
                if (!Boolean.valueOf(CLAIM_FRAME.ClaimTable.getValueAt(i, 0).toString()) || Boolean.valueOf(CLAIM_FRAME.ClaimTable.getValueAt(i, 0).toString())) {

                    arrList.add(Integer.parseInt(CLAIM_FRAME.ClaimTable.getValueAt(i, 2).toString()));
                    instance_deli_dateArr.add(CLAIM_FRAME.ClaimTable.getValueAt(i, 3).toString());
                }

            }

            System.out.println("size = " + sizeTable);
            if (sizeTable == 0) {
                System.out.println("empty");

                instance_deli_dateArr.removeAll(instance_deli_dateArr);
                instance_deli_dateArr.add("''");

                System.out.println(" ->  " + instance_deli_dateArr);
                CF.addInsertClaimCombobox(instance_deli_dateArr, arrList, false, porderIdTxt);
            } else {
                System.out.println("not empty");
                System.out.println("pordertxt = " + porderIdTxt + " " + instance_deli_dateArr + " " + arrList);
                CF.addInsertClaimCombobox(instance_deli_dateArr, arrList, true, porderIdTxt);
            }

        }

    }

    public void clearRow() {
        int row = model.getRowCount() - 1;
        while (row > -1) {
            model.removeRow(row);
            row--;
        }
    }

    public void enableButtonCheck() {
        String check = getCheckRow_PORDER_ID();
        String[] s = check.split(", ");

        if (ClaimTable.getRowCount() > 0) {
            checkAllButton.setEnabled(true);
        } else {
            checkAllButton.setEnabled(false);
        }

        if (s.length == 1 && s[0].equals("")) {
            poEditButton.setEnabled(false);
            poDeleteButton.setEnabled(false);
            instanceManageButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        } else if (s.length == 1) {
            poEditButton.setEnabled(true);
            poDeleteButton.setEnabled(true);
            instanceManageButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            poDeleteButton.setEnabled(true);
            poEditButton.setEnabled(false);
            instanceManageButton.setEnabled(false);
        }
    }

    public void callClearRow() {
        CLAIM_FRAME.clearRow();
    }

    public void callShowDataRecord() {
        CLAIM_FRAME.showDataRecord();
    }

    public void callEnableButtonCheck() {
        CLAIM_FRAME.enableButtonCheck();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ClaimTable;
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton instanceManageButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton poDeleteButton;
    private javax.swing.JButton poEditButton;
    private javax.swing.JButton poInsertButton;
    // End of variables declaration//GEN-END:variables

}
