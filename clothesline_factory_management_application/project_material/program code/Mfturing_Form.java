/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Supawadee Tamo
 */
public class Mfturing_Form extends javax.swing.JFrame {

    private static Mfturing_Form pdf_insert = new Mfturing_Form();
    private static Mfturing_Form pdf_update = new Mfturing_Form();
    private static String OmanuId = "";
    private static String productId = "";
    private static String manufacId = "";
    private static boolean updateFlag = false;
    private static String setdate;

    /**
     * Creates new form Product_Form
     */
    public Mfturing_Form() {
        initComponents();
    }

    public void setManuFacId(String id) {
        manufacId = id;
    }

    public void setOmanuId(String id) {
        OmanuId = id;
    }

    public void setProductId(String id) {
        productId = id;
    }

    public void setUpdateForm(Date date1, String amount, String amountQc) {
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) pdf_update.dayDate.getDateEditor();
        editor1.setEditable(false);

        pdf_update.addData.setText("แก้ไขข้อมูลสินค้า");
        pdf_update.amountTxt.setText(amount);
        pdf_update.amountQcTxt.setText(amountQc);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate1 = df.format(date1);
        setdate = reportDate1;
        pdf_update.setVisible(true);
        pdf_update.dayDate.setDate(date1);

    }

    public void setUpddateFlag(boolean value) {
        pdf_update.updateFlag = value;
    }

    public void openInsertFrame() {
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) pdf_insert.dayDate.getDateEditor();
        editor1.setEditable(false);
        pdf_insert.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        addData = new javax.swing.JLabel();
        productNameLb = new javax.swing.JLabel();
        dayDate = new com.toedter.calendar.JDateChooser();
        decriptionLb = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        productCapCostLb = new javax.swing.JLabel();
        amountQcTxt = new javax.swing.JTextField();
        commit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(220, 198, 224));

        addData.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        addData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addData.setText("เพิ่มข้อมูลการผลิตสินค้ารายวัน");

        productNameLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productNameLb.setText("*วันที่");

        dayDate.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dayDate.setMaxSelectableDate(new java.util.Date(253370743295000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dayDate.setDate(c.getTime());

        decriptionLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        decriptionLb.setText("จำนวนที่ผลิตได้");

        amountTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        productCapCostLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productCapCostLb.setText("จำนวนที่ไม่ผ่านQC");

        amountQcTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        commit.setBackground(new java.awt.Color(236, 240, 241));
        commit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        commit.setText("บันทึก");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(93, 93, 93)
                        .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productCapCostLb, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(amountQcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(productNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dayDate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(productCapCostLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(amountQcTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
        Mfturing_Table MF = new Mfturing_Table();
        if (updateFlag) {
            editData();
            MF.callEnableButtonCheck();
        } else {
            insertData();
            MF.callEnableButtonCheck();
        }
    }//GEN-LAST:event_commitActionPerformed
    private void ShowDataAgain() {
        Mfturing_Table MF = new Mfturing_Table();
        MF.ShowData();
    }

    private void clearRow() {
        Mfturing_Table MF = new Mfturing_Table();
        MF.callClearRow();
    }

    public void insertData() {
        if (checkDataInForm()) {
            Date date = dayDate.getDate();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String reportDate1 = df.format(date);
            String amountpd = amountTxt.getText();
            String amountQc = amountQcTxt.getText();
            if (amountpd.equals("")) {
                amountpd = null;
            }
            if (amountQc.equals("")) {
                amountQc = null;
            }

            String sql = "insert into manufacturing ( OMANU_ID, MAFAC_DATE, MAFAC_AMOUNT, MAFAC_QC)\n"
                    + "values( " + OmanuId + " ,'" + reportDate1 + "', " + amountpd + ", " + amountQc + ")";

            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            sql = "{ call update_product_amount(?,?) }";

            try (Connection conn = Gui_db.getConnection();
                    CallableStatement stmt = conn.prepareCall(sql)) {

                stmt.setString(1, productId);
                stmt.setString(2, amountpd);
                stmt.executeQuery();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            updateAfterEvent();
            clearTextBox();
            clearRow();
            ShowDataAgain();
            JOptionPane.showMessageDialog(this, "เพิ่มข้อมูลเรียบร้อย");
        }
    }

    public void editData() {
        if (checkDataInForm()) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            Date date = dayDate.getDate();
            String reportDate1 = df.format(date);
            String amountpd = amountTxt.getText();
            String amountQc = amountQcTxt.getText();
            String oldAmount = "";
            if (amountpd.equals("")) {
                amountpd = null;
            }
            if (amountQc.equals("")) {
                amountQc = null;
            }
            String sql = "select MAFAC_AMOUNT from manufacturing where MAFAC_ID = " + manufacId;
            System.out.println(sql);
            try (Connection conn = Gui_db.getConnection();
                    Statement stmt = conn.createStatement();
                    ResultSet rs = stmt.executeQuery(sql)) {

                while (rs.next()) {
                    oldAmount = rs.getString(1);
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            sql = "{ call update_product_amount(?,?) }";

            try (Connection conn = Gui_db.getConnection();
                    CallableStatement stmt = conn.prepareCall(sql)) {
                System.out.println(amountpd + " " + oldAmount);
                stmt.setString(1, productId);
                stmt.setInt(2, Integer.parseInt(amountpd) - Integer.parseInt(oldAmount));
                stmt.executeQuery();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            sql = "update manufacturing "
                    + " set MAFAC_DATE = '" + reportDate1 + "', "
                    + "MAFAC_AMOUNT = " + amountpd
                    + ", MAFAC_QC = " + amountQc
                    + " where MAFAC_ID = " + manufacId;
            System.out.print(sql);
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            updateAfterEvent();
            Mfturing_Table FT = new Mfturing_Table();
            FT.callClearRow();
            FT.ShowData();
            JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
            pdf_update.dispose();

        }
    }

    public void updateAfterEvent() {
        String sql = "{ call update_order_manufacture_status_qc(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, OmanuId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_order_manufacture_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, OmanuId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        sql = "{ call update_product_cost(?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {

            stmt.setString(1, OmanuId);
            stmt.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void clearTextBox() {
        amountQcTxt.setText("");

    }

    public boolean checkDataInForm() {
        if (!isNumeric(amountTxt.getText()) && !isNumeric(amountQcTxt.getText())) {
            String message = "กรุณากรอกจำนวนที่ผลิตได้และจำนวนที่ไม่ผ่านQC";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }

        return true;
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addData;
    private javax.swing.JTextField amountQcTxt;
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton commit;
    private com.toedter.calendar.JDateChooser dayDate;
    private javax.swing.JLabel decriptionLb;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel productCapCostLb;
    private javax.swing.JLabel productNameLb;
    // End of variables declaration//GEN-END:variables
}
