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
public class ClaimDetailForm extends javax.swing.JFrame {

    private static ClaimDetailForm INSERT_FRAME = new ClaimDetailForm();
    private static ClaimDetailForm UPDATE_FRAME = new ClaimDetailForm();
    private static boolean updateFlag = false;
    private static String CLAIM_ID = "";
    private static String PROD_NAME = "";
    private static int CT_ID = 0;

    public ClaimDetailForm() {
        initComponents();
    }

    public void setClaim_IDtoCDF(String claim_ID) {
        CLAIM_ID = claim_ID;
    }

    public void setUpdateForm(String prod_name, String cd_type, String cd_amount, String cd_repair) {
        PROD_NAME = prod_name;

        int ct_id = 0;
        if (cd_type.equals("สินค้าเสียหาย")) {
            ct_id = 1;
        } else if (cd_type.equals("สินค้าผิดสเปค")) {
            ct_id = 2;
        }

        CT_ID = ct_id;

        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลงวด");
        UPDATE_FRAME.getPROD_NAMEtoCBB();
        UPDATE_FRAME.ClaimDetailNameCBB.setSelectedItem(prod_name);
        UPDATE_FRAME.ClaimTypeCBB.setSelectedItem(cd_type);
        UPDATE_FRAME.CD_AMOUNTtxt.setText(cd_amount);
        UPDATE_FRAME.CD_REPAIRtxt.setText(cd_repair);
        UPDATE_FRAME.setVisible(true);

    }

    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }

    public void openInsertFrame() {
        getPROD_NAMEtoCBB();
        INSERT_FRAME.CD_AMOUNTtxt.setText("");
        INSERT_FRAME.CD_REPAIRtxt.setText("");
        INSERT_FRAME.setVisible(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        ClaimCount = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CD_REPAIRtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        ClaimRepair = new javax.swing.JLabel();
        ClaimTypeCBB = new javax.swing.JComboBox<>();
        ClaimDetailNameCBB = new javax.swing.JComboBox<>();
        CD_AMOUNTtxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(191, 191, 191));

        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setText("เพิ่มข้อมูลรายละเอียดการเคลม");

        jPanel1.setBackground(new java.awt.Color(191, 191, 191));

        ClaimCount.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        ClaimCount.setText("*จำนวนสินค้าเคลม");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("*ชื่อสินค้า");

        CD_REPAIRtxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("*ประเภทเคลม");

        ClaimRepair.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        ClaimRepair.setText("*จำนวนสินค้าเคลมซ่อมแล้ว");

        ClaimTypeCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        ClaimTypeCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "สินค้าเสียหาย", "สินค้าผิดสเปค" }));
        ClaimTypeCBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClaimTypeCBBActionPerformed(evt);
            }
        });

        ClaimDetailNameCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        CD_AMOUNTtxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        submitBtn.setBackground(new java.awt.Color(218, 223, 225));
        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClaimRepair)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CD_REPAIRtxt, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ClaimTypeCBB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClaimCount, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClaimDetailNameCBB, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CD_AMOUNTtxt, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(39, 39, 39))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 150, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClaimDetailNameCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ClaimTypeCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClaimCount, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CD_AMOUNTtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ClaimRepair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CD_REPAIRtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(93, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(titleLabel)
                        .addGap(96, 96, 96))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(titleLabel)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        ClaimDetailTable CDT = new ClaimDetailTable();
        if (updateFlag) {
            editData();
            CDT.callEnableButtonCheck();
        } else {
            insertData();
            CDT.callEnableButtonCheck();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void ClaimTypeCBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClaimTypeCBBActionPerformed
        String nameCbb = ClaimTypeCBB.getSelectedItem().toString();
        if (nameCbb.equals("สินค้าผิดสเปค")) {
            ClaimRepair.setVisible(false);
            CD_REPAIRtxt.setVisible(false);
           
        } else if (nameCbb.equals("สินค้าเสียหาย")) {
            ClaimRepair.setVisible(true);
            CD_REPAIRtxt.setVisible(true);
           
        }


    }//GEN-LAST:event_ClaimTypeCBBActionPerformed

    public void getPROD_NAMEtoCBB() {

        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql = "SELECT PROD_NAME FROM PRODUCT;";

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

        if (updateFlag) {
            UPDATE_FRAME.ClaimDetailNameCBB.setModel(cbModel);
        } else {
            INSERT_FRAME.ClaimDetailNameCBB.setModel(cbModel);
        }

    }

    public void insertData() {

        String prod_nameCBB = INSERT_FRAME.ClaimDetailNameCBB.getSelectedItem().toString();
        String claim_type = INSERT_FRAME.ClaimTypeCBB.getSelectedItem().toString();
        String cd_amount = INSERT_FRAME.CD_AMOUNTtxt.getText();
        String cd_repair = INSERT_FRAME.CD_REPAIRtxt.getText();

        if (claim_type.equals("สินค้าเสียหาย")) {

            if (!isNumeric(cd_amount) && !isNumeric(cd_repair)) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลมและจำนวนสินค้าซ่อมแล้ว ให้ถูกต้อง");
            } else if (!isNumeric(cd_amount)) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม ให้ถูกต้อง");
            } else if (!isNumeric(cd_repair)) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าซ่อมแล้ว ให้ถูกต้อง");
            } else {

                if (cd_amount.equals("") && cd_repair.equals("")) {
                    JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม และ จำนวนสินค้าซ่อมแล้ว");
                } else if (cd_amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม");

                } else if (cd_repair.equals("")) {
                    JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าซ่อมแล้ว");
                } else {

                    int s = 0;
                    if (claim_type.equals("สินค้าเสียหาย")) {
                        s = 1;
                    }

                    if (Integer.parseInt(cd_amount) - Integer.parseInt(cd_repair) < 0) {
                        JOptionPane.showMessageDialog(null, "กรอกจำนวนสินค้าซ่อมแล้วมากกว่าจำนวนสินค้าเคลม");
                    } else {
                      
                        
                        String sql = "INSERT INTO CLAIM_DETAIL(C_ID, CT_ID, PROD_ID, CD_AMOUNT, CD_REPAIR, CD_UNIT_COST) "
                                + "VALUES(" + CLAIM_ID + ", " + s + ",  (SELECT PROD_ID from PRODUCT where PROD_NAME = '" + prod_nameCBB + "'), "
                                + cd_amount + ", " + cd_repair + ", (SELECT ( PROD_SALE_PRICE * (" + cd_amount + " - " + cd_repair + ")) from PRODUCT where PROD_NAME = '" + prod_nameCBB + "'))";
                        System.out.println(sql);
                        try {
                            Connection con = Gui_db.getConnection();
                            Statement stmt = con.createStatement();
                            stmt.executeUpdate(sql);
                            updateClaimCost(Integer.parseInt(CLAIM_ID), prod_nameCBB);
                            ClaimDetailTable CDT = new ClaimDetailTable();
                            CDT.callClearRow();
                            CDT.callShowDataRecord();
                            CDT.callEnableButtonCheck();
                            clearTextBox();
                            JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");

                        } catch (SQLException ex) {
                            JOptionPane.showMessageDialog(null, "มีข้อมูลรายละเอียดการเคลมแล้ว");
                            clearTextBox();
                            System.out.println(ex.getMessage());

                        }
                    }
                }
            }

        } else if (claim_type.equals("สินค้าผิดสเปค")) {
            if (!isNumeric(cd_amount)) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม ให้ถูกต้อง");
            } else {

                if (cd_amount.equals("")) {
                    JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม ");
                } else {

                    int s = 0;
                    if (claim_type.equals("สินค้าผิดสเปค")) {
                        s = 2;
                    }

                    String sql = "INSERT INTO CLAIM_DETAIL(C_ID, CT_ID, PROD_ID, CD_AMOUNT, CD_REPAIR, CD_UNIT_COST) "
                            + "VALUES(" + CLAIM_ID + ", " + s + ",  (SELECT PROD_ID from PRODUCT where PROD_NAME = '" + prod_nameCBB + "'), "
                            + cd_amount + ", " + cd_amount + ", 0.00);";
                    System.out.println(sql);

                    try {
                        Connection con = Gui_db.getConnection();
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        updateClaimCost(Integer.parseInt(CLAIM_ID), prod_nameCBB);
                        ClaimDetailTable CDT = new ClaimDetailTable();
                        CDT.callClearRow();
                        CDT.callShowDataRecord();
                        CDT.callEnableButtonCheck();
                        clearTextBox();
                        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "มีข้อมูลรายละเอียดการเคลมแล้ว");
                        clearTextBox();
                        System.out.println(ex.getMessage());

                    }
                }
            }
        }

    }

    public void editData() {

        String prod_nameCBB = UPDATE_FRAME.ClaimDetailNameCBB.getSelectedItem().toString();
        String claim_type = UPDATE_FRAME.ClaimTypeCBB.getSelectedItem().toString();
        String cd_amount = UPDATE_FRAME.CD_AMOUNTtxt.getText();
        String cd_repair = UPDATE_FRAME.CD_REPAIRtxt.getText();

        if (!isNumeric(cd_amount) && !isNumeric(cd_repair)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลมและจำนวนสินค้าซ่อมแล้ว ให้ถูกต้อง");
        } else if (!isNumeric(cd_amount)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม ให้ถูกต้อง");
        } else if (!isNumeric(cd_repair)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าซ่อมแล้ว ให้ถูกต้อง");
        } else {

            if (cd_amount.equals("") && cd_repair.equals("")) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม และ จำนวนสินค้าซ่อมแล้ว");
            } else if (cd_amount.equals("")) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าเคลม");

            } else if (cd_repair.equals("")) {
                JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล จำนวนสินค้าซ่อมแล้ว");
            } else {

                int claim_typeNum = 0;
                if (claim_type.equals("สินค้าเสียหาย")) {
                    claim_typeNum = 1;
                } else if (claim_type.equals("สินค้าผิดสเปค")) {
                    claim_typeNum = 2;
                }

                if (Integer.parseInt(cd_amount) - Integer.parseInt(cd_repair) < 0) {
                    JOptionPane.showMessageDialog(null, "กรอกจำนวนสินค้าซ่อมแล้วมากกว่าจำนวนสินค้าเคลม");
                } else {
                    String sql = "UPDATE CLAIM_DETAIL "
                            + "SET CT_ID = " + claim_typeNum + ", PROD_ID = (SELECT PROD_ID FROM PRODUCT WHERE PROD_NAME = '" + prod_nameCBB + "'), "
                            + "CD_AMOUNT = " + cd_amount + ", CD_REPAIR = " + cd_repair + ", CD_UNIT_COST = (SELECT ( PROD_SALE_PRICE * (" + cd_amount + " - " + cd_repair + ")) from PRODUCT where PROD_NAME = '" + prod_nameCBB + "') "
                            + "WHERE C_ID = " + CLAIM_ID + " AND PROD_ID = (SELECT PROD_ID FROM PRODUCT WHERE PROD_NAME = '" + PROD_NAME + "') AND CT_ID = " + CT_ID + ";";

                    System.out.println(sql);
                    try {
                        Connection con = Gui_db.getConnection();
                        Statement stmt = con.createStatement();
                        stmt.executeUpdate(sql);
                        updateClaimCost(Integer.parseInt(CLAIM_ID), prod_nameCBB);
                        ClaimDetailTable CDT = new ClaimDetailTable();
                        CDT.callClearRow();
                        CDT.callShowDataRecord();
                        CDT.callEnableButtonCheck();
                        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว ");
                        UPDATE_FRAME.dispose();

                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "มีข้อมูลรายละเอียดการเคลมแล้ว");
                        System.out.println(ex.getMessage());

                    }

                }
            }
        }

    }

    public void callUpdateClaimCost(int claim_id, String product_name) {
        new ClaimDetailForm().updateClaimCost(claim_id, product_name);
    }

    public void updateClaimCost(int claim_id, String product_name) {

        String query = "{ call update_claim_cost(?,?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(query)) {
            stmt.setInt(1, claim_id);
            stmt.setString(2, product_name);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }

    public void clearTextBox() {

        INSERT_FRAME.CD_AMOUNTtxt.setText("");
        INSERT_FRAME.CD_REPAIRtxt.setText("");

    }

    public static Boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?") && Integer.parseInt(str) >= 0 && Integer.parseInt(str) - Integer.parseInt(str) >= 0;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CD_AMOUNTtxt;
    private javax.swing.JTextField CD_REPAIRtxt;
    private javax.swing.JLabel ClaimCount;
    private javax.swing.JComboBox<String> ClaimDetailNameCBB;
    private javax.swing.JLabel ClaimRepair;
    private javax.swing.JComboBox<String> ClaimTypeCBB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
