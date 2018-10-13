package gui_db;

import java.lang.reflect.Method;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class VendorForm extends javax.swing.JFrame {
    private static VendorForm myFrame = new VendorForm();
    private static VendorForm updateFrame = new VendorForm();
    private static String vId;
    DefaultTableModel model =new DefaultTableModel();
    Object[]data=new Object[0];
    private static boolean updateFlag;
    
    
    public VendorForm() {
        initComponents();
    }
    
    public void setUpdateFlag(boolean value) {
        updateFlag = value;
    }
    
    public void setVId(String vId) {
        this.vId = vId; 
    }
    
    public void openUpdateFrame() {
        updateFrame.clearData();
        VendorForm vf = new VendorForm();
        vf.Label_title.setText("แก้ไขผู้จำหน่ายวัสดุ");
        String sql="select v_name, v_phone, v_address, v_contact from vendor where v_id = " + vId;
        System.out.println(sql);
            try (Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)) {
                while (rs.next()) { 
                    updateFrame.AV1.setText(rs.getString(1));
                    updateFrame.AV2.setText(rs.getString(2));
                    updateFrame.AV3.setText(rs.getString(3));
                    updateFrame.AV4.setText(rs.getString(4));
                }
             
         } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        updateFrame.setVisible(true);
    }
    
    public void openFrame(){
        myFrame.clearData();
        myFrame.setVisible(true);
    }
    
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AV1 = new javax.swing.JTextField();
        AV3 = new javax.swing.JTextField();
        AV4 = new javax.swing.JTextField();
        AV2 = new javax.swing.JTextField();
        BtnSave = new javax.swing.JButton();
        Label_title = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("หจก. วช.วัชรภัณฑ์ จำกัด");

        jPanel1.setBackground(new java.awt.Color(226, 106, 106));
        jPanel1.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("*ชื่อ");

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("*เบอร์โทรศัพท์");

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("*ที่อยู่");

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("*ติดต่อ");

        AV1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        AV1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AV1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AV1ActionPerformed(evt);
            }
        });

        AV3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        AV3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AV3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AV3ActionPerformed(evt);
            }
        });

        AV4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        AV4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AV4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AV4ActionPerformed(evt);
            }
        });

        AV2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        AV2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        AV2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AV2ActionPerformed(evt);
            }
        });

        BtnSave.setBackground(new java.awt.Color(236, 240, 241));
        BtnSave.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnSave.setText("บันทึก");
        BtnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSaveActionPerformed(evt);
            }
        });

        Label_title.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        Label_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_title.setText("เพิ่มผู้จำหน่ายวัสดุ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(AV3, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(AV2, javax.swing.GroupLayout.DEFAULT_SIZE, 448, Short.MAX_VALUE)
                            .addComponent(AV1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AV4)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(290, 290, 290)
                        .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 171, Short.MAX_VALUE)
                .addComponent(Label_title, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(Label_title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(AV1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(AV2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(AV3, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(AV4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(BtnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.getAccessibleContext().setAccessibleName("สามารถ");
        jPanel1.getAccessibleContext().setAccessibleParent(jPanel1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AV1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AV1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AV1ActionPerformed

    private void AV3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AV3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AV3ActionPerformed

    private void AV4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AV4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AV4ActionPerformed

    private void AV2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AV2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AV2ActionPerformed

    private void BtnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSaveActionPerformed
        VendorTable vt = new VendorTable();
        if(updateFlag){
            updateData();
            vt.callEnableButtonCheck();
        }else{
            insertData();
            vt.callEnableButtonCheck();
        }
        
    }//GEN-LAST:event_BtnSaveActionPerformed

    
    public void insertData(){
        VendorTable vd = new VendorTable();
           // String ID        = AV1.getText();
            String NAME      = AV1.getText();
            String PHONE     = AV2.getText();
            String ADRESS    = AV3.getText();
            String CONTRACT  = AV4.getText();
         
         // คำสั่ง SQL 
         String sql = "insert into vendor(V_NAME, V_PHONE, V_ADDRESS, V_CONTACT)" + "VALUES("+"'" + NAME + "','" + PHONE + "','" + ADRESS + "','" + CONTRACT + "')" ;
         
         
     
          try{    Connection conn = Gui_db.getConnection();
                   Statement stmt  = conn.createStatement();
                stmt.executeUpdate(sql, Statement.RETURN_GENERATED_KEYS);
                
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
           
           
        VendorTable vendortable = new VendorTable();
        vendortable.callClearRow();
        vendortable.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "บันทึกข้อมูลเรียบร้อยแล้ว");
        clearData();
    }
    
    public void updateData() {
        String NAME      = updateFrame.AV1.getText();
            String PHONE     = updateFrame.AV2.getText();
            String ADRESS    = updateFrame.AV3.getText();
            String CONTRACT  = updateFrame.AV4.getText();
        
        String sql = "update vendor set V_NAME = '" + NAME + "', V_ADDRESS = '" + ADRESS + "', V_PHONE = '" + PHONE +"', V_CONTACT = '" + CONTRACT + "' " 
                + "WHERE V_ID = " + vId ;
        System.out.println(sql);
        try{    Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                stmt.executeUpdate(sql);
        } catch (SQLException ex) {
                System.out.println(ex.getMessage());
        }
        
        VendorTable ctb = new VendorTable();
        ctb.callClearRow();
        ctb.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
        clearData();
        updateFrame.setVisible(false);
    }
    
   public void clearData(){
        
         AV1.setText("");
         AV2.setText("");
         AV3.setText("");
         AV4.setText("");
        
        
        
    }
    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AV1;
    private javax.swing.JTextField AV2;
    private javax.swing.JTextField AV3;
    private javax.swing.JTextField AV4;
    private javax.swing.JButton BtnSave;
    private javax.swing.JLabel Label_title;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
