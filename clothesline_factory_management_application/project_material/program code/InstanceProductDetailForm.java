/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class InstanceProductDetailForm extends javax.swing.JFrame {
   
    private static InstanceProductDetailForm INSERT_FRAME = new InstanceProductDetailForm();
    private static InstanceProductDetailForm UPDATE_FRAME = new InstanceProductDetailForm();
    private static boolean updateFlag = false;
    private static String updateProductIDNAME = "";
    private static String updateProductID = ""; 
    private static String updateProductName = "";
    private static String updateInstanceID = "";
    private static String updatePorderID = "";
    //private static String updateNameComboBoxUpdateFrame = ""; 
    /**
     * Creates new form OrderProductForm
     */
    public InstanceProductDetailForm() {
        initComponents();
        
    }
    /*
      public void setUpdateComboBoxInUPDATEframe(String setComboBoxName){
        updateNameComboBoxUpdateFrame = setComboBoxName;
    }
    */
  
    public void setUpdatePROD_ID(String prod_id){
        updateProductID = prod_id;
    }
    
    public void setProductName(String prod_name) {
        updateProductName = prod_name;
    }
    
    public void setPorderID(String porder_id){
        updatePorderID = porder_id;
    }
    
    public void setInstanceID(String instance_id){
        updateInstanceID = instance_id;
    }
    
    public void setUpdateForm(String name, String amount) {
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลงวด");
        UPDATE_FRAME.updateProductIDNAME = name;
        UPDATE_FRAME.numTxt.setText(amount);
        
     
    }
    
    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }
    
    public void openInsertFrame() {
        INSERT_FRAME.setComboBox();
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
        jLabel1 = new javax.swing.JLabel();
        prod_nameList = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        numTxt = new javax.swing.JTextField();
        submitBtn = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(233, 212, 96));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("*สินค้า");

        prod_nameList.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        prod_nameList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prod_nameListActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("*จำนวน");

        numTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        numTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numTxtActionPerformed(evt);
            }
        });

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
        titleLabel.setText("เพิ่มข้อมูลรายละเอียดงวด");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(prod_nameList, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(103, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(titleLabel)
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prod_nameList, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(numTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
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
        InstanceProductDetailTable IPDT = new InstanceProductDetailTable();
        if(updateFlag) {
            editData();
            IPDT.callEnableButtonCheck();
        }
        else
            insertData();
            IPDT.callEnableButtonCheck();
            
            
    }//GEN-LAST:event_submitBtnActionPerformed

    private void numTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numTxtActionPerformed

    private void prod_nameListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prod_nameListActionPerformed
       
    }//GEN-LAST:event_prod_nameListActionPerformed
    
    public void insertData() {
       
        String PROD_NAME = prod_nameList.getSelectedItem().toString();
        String INDE_AMOUNT = numTxt.getText();
   
        if(!isNumeric(INDE_AMOUNT)){
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลจำนวนสินค้าให้ถูกต้อง");
        }else{
            
            
            
           String sql = "INSERT INTO instance_detail(INSTANCE_ID, PROD_ID, INDE_AMOUNT, INDE_UNITS_PRICE)\n" +
                         "VALUES(" + updateInstanceID + ", "+ 
                         "(select PROD_ID from PRODUCT where PROD_NAME = '" + PROD_NAME + "'), " + INDE_AMOUNT  + ", " +
                         "(select PROD_SALE_PRICE from PRODUCT where PROD_ID = (select PROD_ID from PRODUCT where PROD_NAME = '" + PROD_NAME   + "')));";
            System.out.println(sql);
           try {  
               Connection conn = Gui_db.getConnection();
               Statement stmt = conn.createStatement();
               stmt.executeUpdate(sql);
               updateINDE_AMOUNT(Integer.parseInt(updateInstanceID)); //update_inde_amount by store procedure 
               updatePORDER_DOWN_PAYMENT(Integer.parseInt(updatePorderID)); // update_product_order_down_payment by store procedure                   
               updateBill_PRICE(Integer.parseInt(updateInstanceID)); // update_Bill_PRICE by store procedure
           } catch(SQLException ex){
                System.out.println(ex.getMessage());
           }
               
        InstanceProductDetailTable OPDT = new InstanceProductDetailTable();
        OPDT.callClearRow();
        OPDT.callShowDataRecord();
        OPDT.callEnableButtonCheck();
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
        callclearTextBox();
		OPDT.callSentGetNameToComboBox();
		INSERT_FRAME.setComboBox();
        
        /*if(INSERT_FRAME.prod_nameList.getItemCount() == 0){
            INSERT_FRAME.dispose();
            OPDT.callSetEnableInsertButton();
        }*/
   
        
       
        
        
        }
    }
    
    public void callUpdateINDE(int instance_id){
        new InstanceProductDetailForm().updateINDE_AMOUNT(instance_id);
    }
    
    public  void updateINDE_AMOUNT(int instance_id){
        
     
        String query = "{ call update_inde_amount(?) }";

 
        try (Connection conn = Gui_db.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
             stmt.setInt(1, instance_id);
             stmt.executeUpdate();
             
            
       
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
            
        }
        
   
        
    }
    
    
    public void callUpdatePODER_DOWN_PAYMENT(int porder_id){
        new InstanceProductDetailForm().updatePORDER_DOWN_PAYMENT(porder_id);
    }
    
    public void updatePORDER_DOWN_PAYMENT(int porder_id){
        
        String query = "{ call update_product_order_down_payment(?) }";

 
        try (Connection conn = Gui_db.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
             stmt.setInt(1, porder_id);
             stmt.executeUpdate();
             
            
       
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
            
        }
        
        
    }
    
    public void callUpdateBill_PRICCE(int instance_id){
        new InstanceProductDetailForm().updateBill_PRICE(instance_id);
    }
    
    public void updateBill_PRICE(int instance_id){
        
        String query = "{ call update_bill_price(?) }";
        
         try (Connection conn = Gui_db.getConnection();
             CallableStatement stmt = conn.prepareCall(query)) {
             stmt.setInt(1, instance_id);
             stmt.executeUpdate();
             
            
       
         
        } catch (SQLException ex) {
            System.out.println(ex.getMessage()); 
            
        }        
        
    }
    
    public void editData() {
        
        String PRODs = UPDATE_FRAME.prod_nameList.getSelectedItem().toString();
        String num = numTxt.getText();
        if(!isNumeric(num))
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูลจำนวนสินค้าให้ถูกต้อง");
        else { 
            String sql1 = "UPDATE instance_detail " + 
                         "SET PROD_ID = (select PROD_ID from PRODUCT where PROD_NAME = '" + PRODs + "'), INDE_AMOUNT = " + num + ", " +
                         "INDE_UNITS_PRICE = (select PROD_SALE_PRICE from PRODUCT where PROD_ID = (select PROD_ID from PRODUCT where PROD_NAME = '" + PRODs + "')) " + 
                         "WHERE INSTANCE_ID = " + updateInstanceID + " AND PROD_ID = " +  updateProductID; 
                  
                    try {
                            Connection conn1 = Gui_db.getConnection();
                            Statement stmt1 = conn1.createStatement();
                            stmt1.executeUpdate(sql1);
                            updateINDE_AMOUNT(Integer.parseInt(updateInstanceID)); //update_inde_amount by store procedure
                            updatePORDER_DOWN_PAYMENT(Integer.parseInt(updatePorderID)); // update_product_order_down_payment by store procedure                   
                            updateBill_PRICE(Integer.parseInt(updateInstanceID)); // update_Bill_PRICE by store procedure    
                    } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                    }
                        InstanceProductDetailTable IPDT = new InstanceProductDetailTable();
                        IPDT.callClearRow();
                        IPDT.callShowDataRecord();
                        IPDT.callEnableButtonCheck();
                        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
                        UPDATE_FRAME.dispose();
                    

        }
    }
    
    
    public void setComboBoxUPDATE_FRAME(String name, String sName){
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql1 = "select  PROD_NAME from PRODUCT where PROD_NAME in (" + name + ");";
        System.out.println("sql1 = " + sql1);
        try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql1);
                
                while(rs.next()){
                    
                     cbModel.addElement(rs.getString(1));
                     System.out.println(rs.getString(1));
                    
                }

            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
          
          UPDATE_FRAME.prod_nameList.setModel(cbModel);
          UPDATE_FRAME.prod_nameList.setSelectedItem(sName);
          UPDATE_FRAME.setVisible(true);
        
    }
    
    public void setComboBox(){
         DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
         String sql = "select prod_name from product where prod_name not in (" + updateProductName + ");";
         //System.out.print("ProductName = " + sql);
          try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                
                cbModel.addElement(rs.getString(1));
               
                //System.out.println("rs.1 = " + rs.getString(1));
                
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        InstanceProductDetailTable OPDT = new InstanceProductDetailTable();
        if (cbModel.getSize() == 0) {
              INSERT_FRAME.setVisible(false);
              OPDT.callSetEnableInsertButton(false);
        } else {
              OPDT.callSetEnableInsertButton(true);  
        }
        INSERT_FRAME.prod_nameList.setModel(cbModel);
    }
    
    
    public void callclearTextBox() {

        INSERT_FRAME.prod_nameList.removeItemAt(prod_nameList.getSelectedIndex());
        INSERT_FRAME.numTxt.setText("");
  
    }
 

    public void callRemoveComboBoxList(){
        INSERT_FRAME.prod_nameList.removeAllItems();
        INSERT_FRAME.numTxt.setText("");
        System.out.println("clear");
    }

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }   
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numTxt;
    private javax.swing.JComboBox<String> prod_nameList;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
