/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZDO
 */
public class BillForm extends javax.swing.JFrame {
    private static BillForm INSERT_FRAME = new BillForm();
    private static BillForm UPDATE_FRAME = new BillForm();
    private static boolean updateFlag = false;
    private static String updateBillId = "";

    /**
     * Creates new form OrderProductForm
     */
    public BillForm() {
        initComponents();
    }
    public void disposeInsertBill(){
        INSERT_FRAME.dispose();
    }
    
   
    public void setUpdateForm(String billID, String billDate, String billRemDate, String billStatus) throws ParseException {
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลบิล");
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date billdate = df.parse(billDate);
        Date billremdate = df.parse(billRemDate);
        UPDATE_FRAME.BilllDatePicker.setDate(billdate);
        UPDATE_FRAME.BilllRemDatePicker.setDate(billremdate);
        UPDATE_FRAME.updateBillId = billID;
        UPDATE_FRAME.billStatusCBB.setSelectedItem(billStatus);
        UPDATE_FRAME.setVisible(true);
    }
    
    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }
    
    public void openInsertFrame() {
        INSERT_FRAME.billStatusCBB.setSelectedIndex(1);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        BilllDatePicker = new com.toedter.calendar.JDateChooser();
        BilllRemDatePicker = new com.toedter.calendar.JDateChooser();
        billStatusCBB = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(137, 196, 244));

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("วันวางบิล");

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("วันรับเงิน");

        BilllDatePicker.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        BilllDatePicker.setMaxSelectableDate(new java.util.Date(253370743311000L));
        BilllDatePicker.setMinSelectableDate(new java.util.Date(-62135791089000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        BilllDatePicker.setDate(c.getTime());

        BilllRemDatePicker.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        BilllRemDatePicker.setMaxSelectableDate(new java.util.Date(253370743311000L));
        BilllRemDatePicker.setMinSelectableDate(new java.util.Date(-62135791089000L));
        Date date1 = new Date();
        Calendar c1 = Calendar.getInstance();
        c1.setTime(date1);
        c1.set(Calendar.YEAR, 2017);
        BilllRemDatePicker.setDate(c1.getTime());

        billStatusCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        billStatusCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ชำระเงินเรียบร้อย", "ยังไม่ได้ชำระเงิน" }));
        billStatusCBB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                billStatusCBBActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("สถานะบิล");

        submitBtn.setBackground(new java.awt.Color(218, 223, 225));
        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setText("เพิ่มข้อมูลบิล");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(BilllRemDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BilllDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(billStatusCBB, 0, 370, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(titleLabel)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 75, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(titleLabel)
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BilllDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BilllRemDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(billStatusCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void setDisableCloseButton(){
        INSERT_FRAME.setDefaultCloseOperation(BillForm.DO_NOTHING_ON_CLOSE);
    }
    
    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        BillTable BT = new BillTable();
        if(updateFlag) {
            editData();
            BT.callEnableButtonCheck();
        }
        else{
            
            insertData();
            InstanceProductTable IPDT  = new InstanceProductTable();
            IPDT.setInstance_idUpdateBill_id(); 
            
            INSERT_FRAME.dispose();
            BT.callEnableButtonCheck();
        }
    }//GEN-LAST:event_submitBtnActionPerformed

    private void billStatusCBBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_billStatusCBBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_billStatusCBBActionPerformed

    
    public void insertData() {
        Date billDate = BilllDatePicker.getDate();
        DateFormat bd = new SimpleDateFormat("yyyy-MM-dd");
        String BillDate = bd.format(billDate);
        
        Date billRemDate = BilllRemDatePicker.getDate();
        DateFormat brd = new SimpleDateFormat("yyyy-MM-dd");
        String BillRemDate = brd.format(billRemDate);
        
        
        String statusBillComboBox = billStatusCBB.getSelectedItem().toString();
        String SstatusbillComboBox = "";
        switch (statusBillComboBox) {
            case "ชำระเงินเรียบร้อย":
                SstatusbillComboBox = "1";
                break;
            case "ยังไม่ได้ชำระเงิน":
                SstatusbillComboBox = "2";
                break;
           
            default:
                break;
        }
        
        String sql = "INSERT INTO BILLS(BILL_STATUS, BILL_DATE, BILL_REM_DATE, BILL_PRICE)\n" +
                     "VALUES(" + SstatusbillComboBox + ", '" + BillDate + "', '" + BillRemDate + "', 0.00);";
       
        try{
            
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            
            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
       
        BillTable BT = new BillTable();
        BT.callClearRow();
        BT.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
        
        

    }
    
    public void editData() {
      
        Date date = BilllDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String billDate = df.format(date);
        
        Date date1 = BilllRemDatePicker.getDate();
        DateFormat df1 = new SimpleDateFormat("yyyy-MM-dd");
        String billRemDate = df1.format(date1);
        
        String statusBillComboBox = billStatusCBB.getSelectedItem().toString();
        System.out.println(statusBillComboBox);
        String SstatusbillComboBox = "";
        if(statusBillComboBox.equals("ชำระเงินเรียบร้อย")){
            SstatusbillComboBox = "1";
        }else if(statusBillComboBox.equals("ยังไม่ได้ชำระเงิน")){
            SstatusbillComboBox = "2";
        }
        System.out.println(SstatusbillComboBox);
        String sql = "UPDATE BILLS " + 
                     "SET BILL_STATUS = " + SstatusbillComboBox + ", BILL_DATE = '" +  billDate  + "', BILL_REM_DATE = '" + billRemDate + "', BILL_PRICE = 0.0 " +
                     "WHERE Bill_id = " + updateBillId + ";";
       
        System.out.println(sql);           
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        BillTable bt = new BillTable();
        bt.callClearRow();
        bt.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
        UPDATE_FRAME.dispose();
        
        
        
    
    }
    
    
    
    
    public void callClearText(){
        billStatusCBB.removeAllItems();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser BilllDatePicker;
    private com.toedter.calendar.JDateChooser BilllRemDatePicker;
    private javax.swing.JComboBox<String> billStatusCBB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}