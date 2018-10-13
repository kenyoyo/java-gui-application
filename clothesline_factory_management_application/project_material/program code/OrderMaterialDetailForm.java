/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZDO
 */
public class OrderMaterialDetailForm extends javax.swing.JFrame {

    private static OrderMaterialDetailForm INSERT_FRAME = new OrderMaterialDetailForm();
    private static OrderMaterialDetailForm UPDATE_FRAME = new OrderMaterialDetailForm();
    private static boolean updateFlag = false;
    private static String mor_ID = "";
    private static String MAT_NAME = "";
    private static String P_ID = "";

    /**
     * Creates new form OrderProductForm
     */
    public OrderMaterialDetailForm() {
        initComponents();

    }

    public void setUpdateForm(String matname, String vname, String rdate, String amount) throws ParseException {

        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) INSERT_FRAME.recDate.getDateEditor();
        editor1.setEditable(false);
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        Date date = format.parse(rdate);
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลออเดอร์วัสดุ");
        UPDATE_FRAME.materialCBB.setSelectedItem(matname);
        UPDATE_FRAME.vendorCBB.setSelectedItem(vname);
        UPDATE_FRAME.mod_amountTxt.setText(amount);
        UPDATE_FRAME.recDate.setDate(date);
        UPDATE_FRAME.setVisible(true);

    }

    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }

    public void setMor_ID(String setMor_id) {
        mor_ID = setMor_id;
    }

    public void openInsertFrame() {

        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) INSERT_FRAME.recDate.getDateEditor();
        editor1.setEditable(false);

        INSERT_FRAME.clearTextBox();
        INSERT_FRAME.setVisible(true);
    }

    public void getMatName_AND_VName() {

        OrderMateriaDetaillTable OMDT = new OrderMateriaDetaillTable();
        INSERT_FRAME.setMatName(OMDT.getMatName(), OMDT.selectP_ID());
        System.out.println("ทำแล้ว");

    }

    public void setMatName(String mat_name, String p_id) {
        P_ID = p_id;
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql = "select distinct mat_name from produce natural join vendor natural join material where "
                + "p_id not in(" + p_id + ");";

        //System.out.println(sql);
        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                MAT_NAME = rs.getString(1);

                cbModel.addElement(MAT_NAME);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        if (updateFlag) {

        } else {

            if (cbModel.getSize() == 0) {
                INSERT_FRAME.setVisible(false);
                new OrderMateriaDetaillTable().callEnableAddBtn(false);
            } else {
                new OrderMateriaDetaillTable().callEnableAddBtn(true);
                INSERT_FRAME.materialCBB.setModel(cbModel);
                INSERT_FRAME.getVendorToCBB(INSERT_FRAME.materialCBB.getSelectedItem().toString());
            }
        }

    }

    public void getVendorToCBB(String matNameSelect) {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();

        String sql = "select V_NAME from VENDOR natural join PRODUCE natural join MATERIAL where "
                + "MAT_NAME = '" + matNameSelect + "' and P_ID not in(" + P_ID + ");";
        //System.out.println(sql);

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int row = 0;
            while (rs.next()) {

                cbModel.addElement(rs.getString(1));

                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        INSERT_FRAME.vendorCBB.setModel(cbModel);

    }

    public void getMatNameToCBB(String v_name) {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();

        String sql = "select MAT_NAME from VENDOR natural join PRODUCE natural join MATERIAL where "
                + "V_NAME = '" + v_name + "' and P_ID not in(" + P_ID + ");";
        //System.out.println(sql);

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int row = 0;
            while (rs.next()) {

                cbModel.addElement(rs.getString(1));

                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        INSERT_FRAME.materialCBB.setModel(cbModel);

    }

    public void setMatNameEDIT(String mat_name, String p_id) {
        P_ID = p_id;
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql = "select distinct mat_name from produce natural join vendor natural join material where "
                + "p_id not in(" + p_id + ");";

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                //MAT_NAME = rs.getString(1);

                cbModel.addElement(rs.getString(1));

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        if (cbModel.getSize() == 0) {
            UPDATE_FRAME.setVisible(false);
            new OrderMateriaDetaillTable().callEnableAddBtn(false);
        } else {
            new OrderMateriaDetaillTable().callEnableAddBtn(true);
            UPDATE_FRAME.materialCBB.setModel(cbModel);
            UPDATE_FRAME.getVendorToCBBEDIT(UPDATE_FRAME.materialCBB.getSelectedItem().toString());
        }

    }

    public void getVendorToCBBEDIT(String matNameSelect) {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();

        String sql = "select V_NAME from VENDOR natural join PRODUCE natural join MATERIAL where "
                + "MAT_NAME = '" + matNameSelect + "' and P_ID not in(" + P_ID + ");";
        //System.out.println(sql);

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int row = 0;
            while (rs.next()) {

                cbModel.addElement(rs.getString(1));

                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        UPDATE_FRAME.vendorCBB.setModel(cbModel);

    }

    public void getMatNameToCBBEDIT(String v_name) {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();

        String sql = "select MAT_NAME from VENDOR natural join PRODUCE natural join MATERIAL where "
                + "V_NAME = '" + v_name + "' and P_ID not in(" + P_ID + ");";
        //System.out.println(sql);

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            int row = 0;
            while (rs.next()) {

                cbModel.addElement(rs.getString(1));

                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        UPDATE_FRAME.materialCBB.setModel(cbModel);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        materialCBB = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        vendorCBB = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        recDate = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        mod_amountTxt = new javax.swing.JTextField();
        mod_unit_costTxt = new javax.swing.JLabel();
        unitCost = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(44, 62, 80));

        jPanel1.setBackground(new java.awt.Color(226, 106, 106));

        materialCBB.setBackground(new java.awt.Color(200, 247, 197));
        materialCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        materialCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        materialCBB.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                materialCBBAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        materialCBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCBBActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("* ชื่อวัสดุ");

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("* ชื่อผู้ขาย");

        vendorCBB.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                vendorCBBAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        vendorCBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vendorCBBActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("ราคา");

        recDate.setMaxSelectableDate(new java.util.Date(253370743311000L));

        recDate.setMinSelectableDate(new java.util.Date(-62135791089000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        recDate.setDate(c.getTime());

        jLabel6.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel6.setText("* วันที่ได้รับวัสดุ");

        jLabel7.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel7.setText("* จำนวน");

        mod_unit_costTxt.setFont(new java.awt.Font("TH SarabunPSK", 0, 24)); // NOI18N
        mod_unit_costTxt.setText("555");

        unitCost.setFont(new java.awt.Font("TH SarabunPSK", 0, 20)); // NOI18N
        unitCost.setText("666");

        submitBtn.setBackground(new java.awt.Color(236, 240, 241));
        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        titleLabel.setBackground(new java.awt.Color(44, 62, 80));
        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setText("เพิ่มรายละเอียดข้อมูลออเดอร์วัสดุ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(mod_unit_costTxt)
                        .addGap(72, 72, 72)
                        .addComponent(unitCost))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(vendorCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(materialCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mod_amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(recDate, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(materialCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(mod_unit_costTxt)
                            .addComponent(unitCost))
                        .addGap(29, 29, 29)
                        .addComponent(jLabel7))
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(vendorCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mod_amountTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(recDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        OrderMaterialTable OMT = new OrderMaterialTable();
        if (updateFlag) {
            editData();
            OMT.callEnableButtonCheck();
        } else {
            insertData();

            OMT.callEnableButtonCheck();
        }
    }//GEN-LAST:event_submitBtnActionPerformed


    private void materialCBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCBBActionPerformed

        if (updateFlag) {
            UPDATE_FRAME.getVendorToCBB(UPDATE_FRAME.materialCBB.getSelectedItem().toString());
            UPDATE_FRAME.getUnit_CostAndMat_Unit(UPDATE_FRAME.materialCBB.getSelectedItem().toString(), UPDATE_FRAME.vendorCBB.getSelectedItem().toString());

        } else {
            INSERT_FRAME.getVendorToCBB(INSERT_FRAME.materialCBB.getSelectedItem().toString());
            INSERT_FRAME.getUnit_CostAndMat_Unit(INSERT_FRAME.materialCBB.getSelectedItem().toString(), INSERT_FRAME.vendorCBB.getSelectedItem().toString());
        }


    }//GEN-LAST:event_materialCBBActionPerformed

    private void materialCBBAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_materialCBBAncestorAdded
        if (updateFlag) {
            UPDATE_FRAME.getVendorToCBB(UPDATE_FRAME.materialCBB.getSelectedItem().toString());
            UPDATE_FRAME.getUnit_CostAndMat_Unit(UPDATE_FRAME.materialCBB.getSelectedItem().toString(), UPDATE_FRAME.vendorCBB.getSelectedItem().toString());
        } else {
            INSERT_FRAME.getVendorToCBB(INSERT_FRAME.materialCBB.getSelectedItem().toString());
            INSERT_FRAME.getUnit_CostAndMat_Unit(INSERT_FRAME.materialCBB.getSelectedItem().toString(), INSERT_FRAME.vendorCBB.getSelectedItem().toString());
        }
    }//GEN-LAST:event_materialCBBAncestorAdded

    private void vendorCBBAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_vendorCBBAncestorAdded
        if (updateFlag) {

        } else {
            INSERT_FRAME.getUnit_CostAndMat_Unit(INSERT_FRAME.materialCBB.getSelectedItem().toString(), INSERT_FRAME.vendorCBB.getSelectedItem().toString());
        }
    }//GEN-LAST:event_vendorCBBAncestorAdded

    private void vendorCBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vendorCBBActionPerformed
        //INSERT_FRAME.getMatNameToCBB(INSERT_FRAME.materialCBB.getSelectedItem().toString());
    }//GEN-LAST:event_vendorCBBActionPerformed

    public void insertData() {

        Date date = recDate.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String orderRecDateTxt = df.format(date);

        String material = materialCBB.getSelectedItem().toString();
        String vendor = vendorCBB.getSelectedItem().toString();
        String mod_amount = mod_amountTxt.getText();
        String mod_unit_cost = mod_unit_costTxt.getText();

        if (!isNumeric(mod_amount)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกจำนวนให้ถูกต้อง");
        } else {

            String sql = "INSERT INTO MAT_ORDER_DETAIL(MOR_ID, P_ID, MOD_AMOUNT, MOD_UNIT_COST, MOD_REC_DATE ) "
                    + "VALUES(" + mor_ID + ", (select P_ID from PRODUCE natural join MATERIAL natural join VENDOR where MAT_NAME = '" + material + "' and V_NAME = '" + vendor + "') "
                    + ", " + mod_amount + ", " + mod_unit_cost + ", '" + orderRecDateTxt + "')";

            //System.out.println(sql);
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            OrderMateriaDetaillTable omdt = new OrderMateriaDetaillTable();
            omdt.callClearRow();
            omdt.callShowDataRecord();
            getMatName_AND_VName();
            JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
            clearTextBox();

        }

    }

    public void editData() {

        Date date = recDate.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String orderRecDateTxt = df.format(date);

        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            //stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        OrderMateriaDetaillTable omdt = new OrderMateriaDetaillTable();
        omdt.callClearRow();
        omdt.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
        clearTextBox();

    }

    public void getUnit_CostAndMat_Unit(String selectMaterial, String selectVendor) {

        String sql = "select distinct MAT_UNIT_COST, MAT_UNIT from MATERIAL natural join PRODUCE natural join VENDOR "
                + "where MAT_NAME = '" + selectMaterial + "' and V_NAME = '" + selectVendor + "';";

        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            int row = 0;
            while (rs.next()) {

                INSERT_FRAME.mod_unit_costTxt.setText(rs.getString(1));
                INSERT_FRAME.unitCost.setText("ต่อ" + rs.getString(2));
                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void clearTextBox() {
        INSERT_FRAME.mod_amountTxt.setText("");
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> materialCBB;
    private javax.swing.JTextField mod_amountTxt;
    private javax.swing.JLabel mod_unit_costTxt;
    private com.toedter.calendar.JDateChooser recDate;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel unitCost;
    private javax.swing.JComboBox<String> vendorCBB;
    // End of variables declaration//GEN-END:variables
}
