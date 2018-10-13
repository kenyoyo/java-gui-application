/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Admin
 */
public class CustomerForm extends javax.swing.JFrame {

    private static CustomerForm fInsertCustomer = new CustomerForm();
    private static CustomerForm fUpdateCustomer = new CustomerForm();
    private static boolean updateFlag = false;
    private static String updateCUS_ID = "";
    public CustomerForm() {
        
       initComponents();
   
    }
    
    
    public void setUpdateForm(String cus_name, String cus_address, String cus_phone){
    
        fUpdateCustomer.jLabel2.setText("แก้ไขข้อมูลลูกค้า");
        fUpdateCustomer.nameCustxt.setText(cus_name);
        fUpdateCustomer.addressCusTxt.setText(cus_address);
        fUpdateCustomer.telephoneCusTxt.setText(cus_phone);
        fUpdateCustomer.setVisible(true);
        
        
    }
    
    
    public void setUpdateFormID(String cus_id){
        fUpdateCustomer.updateCUS_ID = cus_id;
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
        nameCus = new javax.swing.JLabel();
        nameCustxt = new javax.swing.JTextField();
        addressCusTxt = new javax.swing.JTextField();
        addCus = new javax.swing.JLabel();
        telephoneCusTxt = new javax.swing.JTextField();
        phoneCus = new javax.swing.JLabel();
        BtnRecord = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));

        nameCus.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        nameCus.setText("*นามลูกค้า");

        nameCustxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        nameCustxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameCustxtActionPerformed(evt);
            }
        });

        addressCusTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        addCus.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        addCus.setText("*ที่อยู่ลูกค้า");

        telephoneCusTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        phoneCus.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        phoneCus.setText("*เบอร์โทรศัพท์ติดต่อ");

        BtnRecord.setBackground(new java.awt.Color(236, 240, 241));
        BtnRecord.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnRecord.setText("บันทึก");
        BtnRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRecordActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel2.setText("เพิ่มข้อมูลลูกค้า");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(222, 222, 222)
                .addComponent(BtnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(114, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameCus)
                            .addComponent(nameCustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addCus)
                            .addComponent(addressCusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phoneCus)
                            .addComponent(telephoneCusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 257, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(105, 105, 105))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(195, 195, 195))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addGap(18, 27, Short.MAX_VALUE)
                .addComponent(nameCus)
                .addGap(18, 18, 18)
                .addComponent(nameCustxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(addCus)
                .addGap(15, 15, 15)
                .addComponent(addressCusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(phoneCus)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telephoneCusTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(BtnRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
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

    public void setUpdateFlag(boolean value){
        fUpdateCustomer.updateFlag = value;
    }

    private void nameCustxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameCustxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameCustxtActionPerformed

    private void BtnRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRecordActionPerformed
        CustomerTable CT = new CustomerTable();
        if(updateFlag){
            updateData();
            CT.callEnableButtonCheck();
        }else{
            insertData();
            CT.callEnableButtonCheck();
        }
        
        new CustomerTable().callEnableButtonCheck();
    }//GEN-LAST:event_BtnRecordActionPerformed
        
    public void insertData(){
        
        String nameCust = nameCustxt.getText();
        String addCust = addressCusTxt.getText();
        String telephoneCus = telephoneCusTxt.getText();
        
        
       if(checkDataInForm()){
       
        String sql = "insert into customer(CUS_NAME, CUS_ADDRESS, CUS_TELEPHONE)" + "VALUES("+"'" + nameCust + "','" + addCust + "','" + telephoneCus + "')" ; 
        
        try{    Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
                
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
        
        CustomerTable ctb = new CustomerTable();
        ctb.callClearRow();
        ctb.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "บันทึกข้อมูลเรียบร้อยแล้ว");
        clearData();
        
        }
        
        
    }
    
    
    public void updateData(){
        
       
        String nameCust = nameCustxt.getText();
        String addCust = addressCusTxt.getText();
        String telephoneCus = telephoneCusTxt.getText();
        
        
       
        String sql = "update customer set CUS_NAME = '" + nameCust + "', CUS_ADDRESS = '" + addCust + "', CUS_TELEPHONE = '" + telephoneCus +"' " + "WHERE CUS_ID = " + updateCUS_ID ;
        try{    Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                stmt.executeUpdate(sql);
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
        
        CustomerTable ctb = new CustomerTable();
        ctb.callClearRow();
        ctb.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "บันทึกข้อมูลเรียบร้อยแล้ว");
        clearData();
        fUpdateCustomer.dispose();
        
        
    }
    
    public void openInsertFrame() {
         fInsertCustomer.setVisible(true);
    }
    
   
    
    public void clearData(){
        
         nameCustxt.setText("");
         addressCusTxt.setText("");
         telephoneCusTxt.setText("");
        
        
        
    }
   
    
    public boolean checkDataInForm() {
        
        if(!isNumeric(nameCustxt.getText()) && !isNumeric(addressCusTxt.getText()) && !isNumeric(telephoneCusTxt.getText()) ){
            String message = "กรุณากรอกข้อมูลชื่อลูกค้า, ข้อมูลที่อยู่ลูกค้า, ข้อมูลเบอร์โทรศัพท์ติดต่อลูกค้า ให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }else if(!isNumeric(nameCustxt.getText()) && !isNumeric(addressCusTxt.getText())){
            String message = "กรุณากรอกข้อมูลชื่อลูกค้า, ข้อมูลที่อยู่ลูกค้า ให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }else if(!isNumeric(nameCustxt.getText()) && !isNumeric(telephoneCusTxt.getText())){
            String message = "กรุณากรอกข้อมูลชื่อลูกค้า, ข้อมูลเบอร์โทรศัพท์ติดต่อลูกค้า ให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }else if(!isNumeric(addressCusTxt.getText()) && !isNumeric(telephoneCusTxt.getText())){
            String message = "กรุณากรอกข้อมูลที่อยู่ลูกค้า, ข้อมูลเบอร์โทรศัพท์ติดต่อลูกค้า ให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }else if (!isNumeric(nameCustxt.getText())) {
            String message = "กรุณากรอกข้อมูลชื่อลูกค้าให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }else if(!isNumeric(addressCusTxt.getText())){
            String message = "กรุณากรอกข้อมูลที่อยู่ลูกค้าให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }else if(!isNumeric(telephoneCusTxt.getText())){
            String message = "กรุณากรอกข้อมูลเบอร์โทรศัพท์ติดต่อลูกค้าให้ถูกต้อง";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }   
        
        return true;
    }
    
    

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnRecord;
    private javax.swing.JLabel addCus;
    private javax.swing.JTextField addressCusTxt;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel nameCus;
    private javax.swing.JTextField nameCustxt;
    private javax.swing.JLabel phoneCus;
    private javax.swing.JTextField telephoneCusTxt;
    // End of variables declaration//GEN-END:variables
}