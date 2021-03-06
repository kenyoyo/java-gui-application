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
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZDO
 */
public class OrderProductForm extends javax.swing.JFrame {
    private static OrderProductForm INSERT_FRAME = new OrderProductForm();
    private static OrderProductForm UPDATE_FRAME = new OrderProductForm();
    private static boolean updateFlag = false;
    private static String updateId = "";
    private static String cusId = "";
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
    /**
     * Creates new form OrderProductForm
     */
    public OrderProductForm() {
        initComponents();      
        setSelectedComponent();
    }
    
    public void setUpdateForm(String id, String payment, Date date, String empName) {
        JTextFieldDateEditor editor = (JTextFieldDateEditor) UPDATE_FRAME.orderDatePicker.getDateEditor();
        editor.setEditable(false);
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลออเดอร์สินค้า");
        UPDATE_FRAME.orderDatePicker.setDate(date);
        UPDATE_FRAME.employeeCbb.setSelectedItem(empName);
        UPDATE_FRAME.billTypeCBB.setVisible(false);
        UPDATE_FRAME.jLabel8.setVisible(false);
        //UPDATE_FRAME.jLabel9.setVisible(false);
        UPDATE_FRAME.updateId = id;
        UPDATE_FRAME.setVisible(true);
    }
    
    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }
    
    public void setCusId(String id) {
        cusId = id;
    }
    
    public void openInsertFrame() {
        JTextFieldDateEditor editor = (JTextFieldDateEditor) INSERT_FRAME.orderDatePicker.getDateEditor();
        editor.setEditable(false);
        INSERT_FRAME.setVisible(true);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        employeeCbb = new javax.swing.JComboBox<>();
        orderDatePicker = new com.toedter.calendar.JDateChooser();
        billTypeCBB = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(171, 183, 183));

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("*วันที่ออเดอร์");

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel5.setText("*พนักงาน");

        employeeCbb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        employeeCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        orderDatePicker.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        orderDatePicker.setMaxSelectableDate(new java.util.Date(253370743311000L));
        orderDatePicker.setMinSelectableDate(new java.util.Date(-62135791089000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        orderDatePicker.setDate(c.getTime());

        billTypeCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        billTypeCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "บิลรายงวด", "บิลรวมงวด" }));

        jLabel8.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel8.setText("*ประเภทวางบิล");

        submitBtn.setBackground(new java.awt.Color(236, 240, 241));
        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("เพิ่มข้อมูลออเดอร์สินค้า");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(billTypeCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addComponent(employeeCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orderDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(142, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(billTypeCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        OrderProductTable OPT = new OrderProductTable();
        if(updateFlag) {
            editData();
            OPT.callEnableButtonCheck();
        }
        else {
            insertData();
            OPT.callEnableButtonCheck();
        }
    }//GEN-LAST:event_submitBtnActionPerformed
    
    public void insertData() {
        Date date = orderDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate = df.format(date);
        String employee = employeeCbb.getSelectedItem().toString();
        String billType = billTypeCBB.getSelectedItem().toString();
        String[] splitName = employee.split(" ");

        String convertBillType = "";
            if(billType.equals("บิลรายงวด")){
                convertBillType = "1";
            }else if(billType.equals("บิลรวมงวด")){
                convertBillType = "2";
            }
        
        String sql = "INSERT INTO product_order(PORDER_DATE, PORDER_DOWN_PAYMENT,PORDER_BILL_TYPE, CUS_ID, EMP_ID)\n" +
                     "VALUES(" + "'" + reportDate+ "'" + ", 0, " + convertBillType + ", " +
                     cusId + ", " + "(select EMP_ID from employee where " + 
                     "EMP_FNAME = '" + splitName[0] + "' and EMP_LNAME = '" + splitName[1] +"')" + ")";
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        OrderProductTable opt = new OrderProductTable();
        opt.callClearRow();
        opt.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
        clearTextBox();

    }
    
    public void editData() {
        Date date = orderDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String reportDate = df.format(date);
        String employee = employeeCbb.getSelectedItem().toString();
        String[] splitName = employee.split(" ");
        String sql = "UPDATE product_order " + 
                     "SET PORDER_DATE = '" + reportDate + "', EMP_ID = (select EMP_ID from employee where " + 
                     "EMP_FNAME = '" + splitName[0] + "' and EMP_LNAME = '" + splitName[1] +"') " +
                     "WHERE PORDER_ID = " + updateId;
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        OrderProductTable opt = new OrderProductTable();
        opt.callClearRow();
        opt.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
        UPDATE_FRAME.dispose();

    } 
    
    public void clearTextBox() {
        employeeCbb.setSelectedItem(0);
    }
    
    private void setSelectedComponent() {
        String sql = "select EMP_FNAME, EMP_LNAME from employee";
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                cbModel.addElement(rs.getString(1) + " " + rs.getString(2));
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        employeeCbb.setModel(cbModel);
    }
    
    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> billTypeCBB;
    private javax.swing.JComboBox<String> employeeCbb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser orderDatePicker;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
