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
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Supawadee Tamo
 */
public class Manufac_Form extends javax.swing.JFrame {

    private static Manufac_Form pdf_insert = new Manufac_Form();
    private static Manufac_Form pdf_update = new Manufac_Form();
    private static boolean updateFlag = false;
    private static String setdate;
    private static String omanuId;

    /**
     * Creates new form Product_Form
     */
    public Manufac_Form() {
        initComponents();
    }

    public void setUpdateForm(String omanuId, String nameProduct, String amount, Date date1) {
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) pdf_update.dateStart.getDateEditor();
        editor1.setEditable(false);
        this.omanuId = omanuId;
        pdf_update.addData.setText("แก้ไขข้อมูลสินค้า");
        pdf_update.amountTxt.setText(amount);
        pdf_update.dateStart.setDate(date1);
        pdf_update.listProduct.setSelectedItem(nameProduct);
        System.out.println(nameProduct);

        pdf_update.setVisible(true);
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate1 = df.format(date1);
        pdf_update.setdate = reportDate1;

    }

    public void setUpddateFlag(boolean value) {
        pdf_update.updateFlag = value;
    }

    public void openInsertFrame() {
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) pdf_insert.dateStart.getDateEditor();
        editor1.setEditable(false);
        pdf_insert.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        listProduct = new javax.swing.JComboBox<>();
        productNameLb = new javax.swing.JLabel();
        amountTxt = new javax.swing.JTextField();
        decriptionLb = new javax.swing.JLabel();
        dateStart = new com.toedter.calendar.JDateChooser();
        commit = new javax.swing.JButton();
        addData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 198, 224));
        jPanel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("*สินค้า");

        listProduct.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        listProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        productNameLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productNameLb.setText("*จำนวนการผลิต");

        amountTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        decriptionLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        decriptionLb.setText("*วันที่ออเดอร์");

        dateStart.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dateStart.setMaxSelectableDate(new java.util.Date(253370743295000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateStart.setDate(c.getTime());

        commit.setBackground(new java.awt.Color(236, 240, 241));
        commit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        commit.setText("บันทึก");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
            }
        });

        addData.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        addData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addData.setText("เพิ่มข้อมูลออเดอร์การผลิตสินค้า");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decriptionLb)
                    .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(226, 226, 226))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(listProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(productNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(amountTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(472, 472, 472)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
        Manufac_Table pt = new Manufac_Table();
        if (updateFlag) {
            editData();
            pt.callEnableButtonCheck();
        } else {
            insertData();
            pt.callEnableButtonCheck();
        }

    }//GEN-LAST:event_commitActionPerformed

    public void setComboBox() {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql = "select prod_name from product ;";
        System.out.print("ProductName = " + sql);
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            int row = 0;
            while (rs.next()) {

                cbModel.addElement(rs.getString(1));

                //System.out.println("rs.1 = " + rs.getString(1));
                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        pdf_insert.listProduct.setModel(cbModel);
        pdf_update.listProduct.setModel(cbModel);
    }

    public void callsetComBox() {
        pdf_insert.setComboBox();
    }

    private void ShowDataAgain() {
        Manufac_Table pft = new Manufac_Table();
        pft.ShowData();
    }

    private void clearRow() {
        Manufac_Table pft = new Manufac_Table();
        pft.callClearRow();
    }


    public void insertData() {
        if (checkDataInForm()) {
            Date date = dateStart.getDate();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

            String reportDate1 = df.format(date);
            String amountpd = amountTxt.getText();
            double omanucost = 0;
            int omanu_qc = 0;
            String productName = listProduct.getSelectedItem().toString();

            String sql = "insert into order_manufacture (OMANU_AMOUNT, OMANU_DATE, OMANU_STATUS, OMANU_COST, OMANU_QC,PROD_ID )\n"
                    + "values(" + amountpd + ", '" + reportDate1 + "', '" + "0" + "'," + omanucost + ", " + omanu_qc + ",(select prod_id from product where prod_name = '" + productName + "' ))";

            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
                clearTextBox();
                clearRow();
                ShowDataAgain();
                JOptionPane.showMessageDialog(this, "เพิ่มข้อมูลเรียบร้อย");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public void editData() {
        if (checkDataInForm()) {
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String amountpd = amountTxt.getText();
            Date date = dateStart.getDate();
            String reportDate1 = df.format(date);
            String productName = listProduct.getSelectedItem().toString();

            String sql = "update order_manufacture natural join product " + "set OMANU_AMOUNT = " + amountpd + ", OMANU_DATE = '" + reportDate1 + "', PROD_ID = (select PROD_ID from product where PROD_NAME = '"+ productName + "') "
                    + "where OMANU_ID = " + omanuId; 
            System.out.println(sql);
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
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

            Manufac_Table PT = new Manufac_Table();
            PT.callClearRow();
            PT.ShowData();
            JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
            pdf_update.dispose();
        }
    }

    public void clearTextBox() {
        amountTxt.setText("");

    }

    public boolean checkDataInForm() {
        if (!isNumeric(amountTxt.getText())) {
            String message = "กรุณากรอกข้อมูลจำนวนการผลิต";
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
    private javax.swing.JTextField amountTxt;
    private javax.swing.JButton commit;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JLabel decriptionLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JComboBox<String> listProduct;
    private javax.swing.JLabel productNameLb;
    // End of variables declaration//GEN-END:variables
}
