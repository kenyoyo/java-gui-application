package gui_db;

import java.lang.reflect.Method;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

public class VendorSaleTable extends javax.swing.JFrame {

    DefaultTableModel model = new DefaultTableModel();
    Object[] data = new Object[0];
    private static VendorSaleTable myVSFrame = new VendorSaleTable();
    private static String vId = "";

    public VendorSaleTable() {
        initComponents();
        model = (DefaultTableModel) VDSaleTable.getModel();
        TableColumnModel tcm = VDSaleTable.getColumnModel();
        tcm.removeColumn(tcm.getColumn(6));
    }

    public void setVendorId(String id) {
        vId = id;
    }

    public void openVendorSaleFrame() {
        myVSFrame.clearRow();
        myVSFrame.showDataRecord();
        new VendorSaleForm().setComboBox(myVSFrame.getHaveMat());
        myVSFrame.enableButtonCheck();
        myVSFrame.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        VDSaleTable = new javax.swing.JTable();
        Btn_mainMenu = new javax.swing.JButton();
        selectall = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        Add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        Btn_edit = new javax.swing.JButton();
        Btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("หจก. วช.วัชรภัณฑ์ จำกัด");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(144, 198, 149));

        VDSaleTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        VDSaleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ชื่อวัสดุ", "รายละเอียด", "หน่วยวัสดุ", "ราคาต่อหน่วย", "P_ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        VDSaleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VDSaleTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(VDSaleTable);
        if (VDSaleTable.getColumnModel().getColumnCount() > 0) {
            VDSaleTable.getColumnModel().getColumn(0).setResizable(false);
            VDSaleTable.getColumnModel().getColumn(1).setResizable(false);
            VDSaleTable.getColumnModel().getColumn(2).setResizable(false);
            VDSaleTable.getColumnModel().getColumn(3).setResizable(false);
            VDSaleTable.getColumnModel().getColumn(4).setResizable(false);
            VDSaleTable.getColumnModel().getColumn(5).setResizable(false);
            VDSaleTable.getColumnModel().getColumn(6).setResizable(false);
        }

        Btn_mainMenu.setBackground(new java.awt.Color(236, 240, 241));
        Btn_mainMenu.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_mainMenu.setText("เมนูหลัก");

        selectall.setBackground(new java.awt.Color(44, 62, 80));
        selectall.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        selectall.setForeground(new java.awt.Color(255, 255, 255));
        selectall.setText("เลือกทั้งหมด");
        selectall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectallActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(144, 198, 149));

        Add.setBackground(new java.awt.Color(236, 240, 241));
        Add.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        Add.setText("เพิ่ม");
        Add.setActionCommand(" เพิ่ม");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        del.setBackground(new java.awt.Color(236, 240, 241));
        del.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        del.setText(" ลบ");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });

        Btn_edit.setBackground(new java.awt.Color(236, 240, 241));
        Btn_edit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        Btn_edit.setText("แก้ไข");
        Btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(del, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Btn_edit, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(del, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Btn_back.setBackground(new java.awt.Color(236, 240, 241));
        Btn_back.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_back.setText("ย้อนกลับ");
        Btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("วัสดุที่จำหน่าย");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(59, Short.MAX_VALUE)
                        .addComponent(selectall, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(348, 348, 348)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(167, 167, 167)
                        .addComponent(selectall, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(143, 143, 143)
                        .addComponent(Btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        VendorSaleForm avs = new VendorSaleForm();
        avs.setIsEdit(false);
        avs.setVendorId(vId);
        avs.setProduceId(getCheckId());
        avs.setComboBox(getHaveMat());
        avs.openInsertFrame();
    }//GEN-LAST:event_AddActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        String r = getCheckMAT_Name();
        String[] sp = r.split(", ");
        if (r.length() > 1) {
            r = r.substring(0, r.length() - 2);

            int YesOrNo = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + sp.length + " แถว", "คำเตือนในการลบ", JOptionPane.YES_NO_OPTION);
            if (YesOrNo == JOptionPane.YES_NO_OPTION) {
                deleteData();
                clearRow();
                showDataRecord();
                enableButtonCheck();
                Add.setEnabled(true);
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อยแล้ว ");
            }

        }
    }//GEN-LAST:event_delActionPerformed

    private void selectallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectallActionPerformed
        if (selectall.getText().equals("เลือกทั้งหมด")) {
            for (int i = 0; i < VDSaleTable.getRowCount(); i++) {
                model.setValueAt(true, i, 0);
            }
            selectall.setText("ยกเลิกการเลือก");

        } else {
            for (int i = 0; i < VDSaleTable.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
            selectall.setText("เลือกทั้งหมด");
        }
        enableButtonCheck();
    }//GEN-LAST:event_selectallActionPerformed

    private void VDSaleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VDSaleTableMouseClicked
        myVSFrame.enableButtonCheck();
    }//GEN-LAST:event_VDSaleTableMouseClicked

    private void Btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_backActionPerformed
        new VendorTable().openFrame();
        myVSFrame.setVisible(false);
    }//GEN-LAST:event_Btn_backActionPerformed

    private void Btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_editActionPerformed
        VendorSaleForm vdsf = new VendorSaleForm();
        vdsf.setIsEdit(true);
        vdsf.setVendorId(vId);
        vdsf.setProduceId(getCheckId());
        vdsf.setComboBox(getHaveMat());
        vdsf.openUpdateFrame();
    }//GEN-LAST:event_Btn_editActionPerformed
    public void showDataRecord() { //เม็ดตอด 

        clearRow();
        String sql = "Select MAT_NAME, MAT_DESCRIPTION, PRODUCE_PRICE, MAT_UNIT, P_ID from vendor natural join produce natural join material where V_ID = " + vId;
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            int row = 0;//ควบคุมแถวแถว
            while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                model.addRow(data);//เพิ่มแถว
                model.setValueAt(false, row, 0); //คอลัมที่ 0 (แรก) 
                model.setValueAt(row + 1, row, 1);
                model.setValueAt(rs.getString(1), row, 2); //คอลัมที 2 (สาม) 
                model.setValueAt(rs.getString(2), row, 3); //คอลัมที ... ก็ว่ากันไป
                model.setValueAt(rs.getString(3), row, 4);
                model.setValueAt(rs.getString(4), row, 5);
                model.setValueAt(rs.getString(5), row, 6);
                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deleteData() {

        String sql = "delete from produce where P_ID in (" + getCheckId() + ")";

        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public String getCheckId() {
        String pId = "";

        for (int i = 0; i < VDSaleTable.getRowCount(); i++) {
            if (Boolean.valueOf(VDSaleTable.getValueAt(i, 0).toString())) {
                pId += model.getValueAt(i, 6).toString() + ",";
            }
        }

        if (pId.equals("")) {
            return "''";
        }

        return pId.substring(0, pId.length() - 1);
    }

    public String getCheckMAT_Name() {

        String checkRow = "";
        for (int i = 0; i < VDSaleTable.getRowCount(); i++) {
            if (Boolean.valueOf(VDSaleTable.getValueAt(i, 0).toString())) {
                checkRow += VDSaleTable.getValueAt(i, 2).toString() + ", ";
            }
        }
        if (checkRow.equals("")) {
            return "''";
        }

        return checkRow.substring(0, checkRow.length() - 2);

    }

    public String getHaveMat() {
        String allMat = "";
        for (int i = 0; i < VDSaleTable.getRowCount(); i++) {
            allMat += "'" + VDSaleTable.getValueAt(i, 2).toString() + "', ";
        }
        if (allMat.equals("")) {
            return "''";
        }

        return allMat.substring(0, allMat.length() - 2);
    }

    public void enableButtonCheck() {
        String check = getCheckMAT_Name();
        String[] s = check.split(", ");      //เก็บชื่อสินค้าที่เราลบ ตัวนี้ออกไปแล้ว ,
        if (VDSaleTable.getRowCount() > 0) {
            selectall.setEnabled(true);
        } else {
            selectall.setEnabled(false);
        }

        if (s.length == 1 && s[0].equals("''")) {
            Btn_edit.setEnabled(false);
            del.setEnabled(false);
            selectall.setText("เลือกทั้งหมด");
        } else if (s.length == 1) {
            Btn_edit.setEnabled(true);
            del.setEnabled(true);
            selectall.setText("ยกเลิกการเลือก");
        } else {
            del.setEnabled(true);
            Btn_edit.setEnabled(false);
        }

    }

    public void clearRow() { //การลบแถวทั้งหมด
        int row = model.getRowCount() - 1;
        while (row > -1) {
            model.removeRow(row);
            row--;

        }
    }

    public void callClearRow() {
        myVSFrame.clearRow();
    }

    public void callShowDataRecord() {
        myVSFrame.showDataRecord();
    }

    public void callEnableButtonCheck() {
        myVSFrame.enableButtonCheck();
    }

    public void callSetEnableInsertButton(boolean value) {
        myVSFrame.Add.setEnabled(value);
    }
    
    public String callGetAllMat() {
        return myVSFrame.getHaveMat();
    }

    public String callGetCheckMatName() {
        return myVSFrame.getCheckMAT_Name();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Btn_back;
    private javax.swing.JButton Btn_edit;
    private javax.swing.JButton Btn_mainMenu;
    private javax.swing.JTable VDSaleTable;
    private javax.swing.JButton del;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton selectall;
    // End of variables declaration//GEN-END:variables
}
