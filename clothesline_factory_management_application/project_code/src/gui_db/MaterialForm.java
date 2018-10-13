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
import javax.swing.JOptionPane;

/**
 *
 * @author Supawadee Tamo
 */
public class MaterialForm extends javax.swing.JFrame {
   private static MaterialForm pdf_insert = new MaterialForm();
   private static MaterialForm pdf_update = new MaterialForm();
   private static boolean updateFlag = false;
   private static String setname;
    
    private String sql;

    /**
     * Creates new form Product_Form
     */
    public MaterialForm() {
        initComponents();
    }
    
    
    public void setUpdateForm(String name, String decripstion, String productUnit){
       pdf_update.addData.setText("แก้ไขข้อมูลวัสดุ");
       pdf_update.productNameTxt.setText(name);
       System.out.print(name);
       pdf_update.DecriptionTxt.setText(decripstion);
       pdf_update.Txt_matUnit.setText(productUnit);
       pdf_update.setVisible(true);
       
       pdf_update.setname = name;
    }
    
    public void openFrame() {
        pdf_insert.setVisible(true);
    }
   
    public void setUpddateFlag(boolean value){
        pdf_update.updateFlag = value;
    }
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        productNameLb = new javax.swing.JLabel();
        productNameTxt = new javax.swing.JTextField();
        decriptionLb = new javax.swing.JLabel();
        DecriptionTxt = new javax.swing.JTextField();
        procuctMinLb = new javax.swing.JLabel();
        Txt_matUnit = new javax.swing.JTextField();
        commit = new javax.swing.JButton();
        addData = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(210, 82, 127));

        productNameLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productNameLb.setText("*ชื่อวัสดุ");

        productNameTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        decriptionLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        decriptionLb.setText("รายละเอียด");

        DecriptionTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        DecriptionTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DecriptionTxtActionPerformed(evt);
            }
        });

        procuctMinLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        procuctMinLb.setText("*หน่วย");

        Txt_matUnit.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        Txt_matUnit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_matUnitActionPerformed(evt);
            }
        });

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
        addData.setText("เพิ่มข้อมูลวัสดุ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decriptionLb)
                            .addComponent(DecriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(procuctMinLb, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_matUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(118, 118, 118))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(208, 208, 208))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productNameLb, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(productNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(DecriptionTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(procuctMinLb)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Txt_matUnit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(423, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void DecriptionTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DecriptionTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DecriptionTxtActionPerformed

    private void Txt_matUnitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_matUnitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_matUnitActionPerformed

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
       MaterialTable pt = new MaterialTable();
       if(updateFlag){
           editData();
           pt.callEnableButtonCheck();
       }
       else{
           insertData();
           pt.callEnableButtonCheck();
       }

    }//GEN-LAST:event_commitActionPerformed

    private void ShowDataAgain(){
        new MaterialTable().ShowData();
    }
    
    private void clearRow(){
        new MaterialTable().callClearRow();
    }
     
    public void insertData(){
    if(checkDataInForm()){
       String MAT_NAME = productNameTxt.getText();
       String matUnit = Txt_matUnit.getText();
       String matDescript = DecriptionTxt.getText();
       
      String sql = "insert into material(MAT_NAME, MAT_UNIT_COST, MAT_UNIT, MAT_DESCRIPTION, MAT_AMOUNT, MAT_MIN, MAT_ORDER) " +
            "values('"+MAT_NAME+"', 0.00, '"+matUnit+"',"+ "'"+matDescript+"',0,null , null)";
     System.out.println(sql);
        try{
           Connection conn = Gui_db.getConnection();
             Statement stmt  = conn.createStatement();
             stmt.executeUpdate(sql);
             clearTextBox();
             clearRow();
             ShowDataAgain();
             JOptionPane.showMessageDialog(this, "เพิ่มข้อมูลเรียบร้อย");
        
       }
       catch(SQLException ex) {
            System.out.println(ex.getMessage());
          }
       }  
        System.out.println(productNameTxt.getText() +" "+ DecriptionTxt.getText());
    }
    
    
    public void editData(){
       if(checkDataInForm()){
       String PROD_NAME = pdf_update.productNameTxt.getText();
       String PROD_DESCRIPT = pdf_update.DecriptionTxt.getText();
       String PROD_MAT_UNIT = pdf_update.Txt_matUnit.getText();
     
       
       String sql = "update material "+
               "set MAT_NAME = '"+ PROD_NAME + 
               "', MAT_DESCRIPTION = '" +PROD_DESCRIPT+
               " ',MAT_UNIT = '" + PROD_MAT_UNIT +
               "' WHERE MAT_NAME = '" + pdf_update.setname+ "'";
        System.out.print(sql);       
        try{
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);            
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }       
        
        MaterialTable PT  = new MaterialTable();    
        PT.callClearRow();
        PT.ShowData();
        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
        pdf_update.dispose();
       }  
    }
    
    public void clearTextBox(){
        productNameTxt.setText("");
        Txt_matUnit.setText("");
        DecriptionTxt.setText("");
    }
    
    public boolean checkDataInForm() {
         if(productNameTxt.getText().equals("")){
            String message = "กรุณากรอกชื่อวัสดุ";
            JOptionPane.showMessageDialog(null, message);
            return false;
        } else if (Txt_matUnit.getText().equals("")) {
            String message = "กรุณากรอกข้อมูลหน่วยวัสดุ";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }
        return true;
    }
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField DecriptionTxt;
    private javax.swing.JTextField Txt_matUnit;
    private javax.swing.JLabel addData;
    private javax.swing.JButton commit;
    private javax.swing.JLabel decriptionLb;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel procuctMinLb;
    private javax.swing.JLabel productNameLb;
    private javax.swing.JTextField productNameTxt;
    // End of variables declaration//GEN-END:variables
}
