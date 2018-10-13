/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZDO
 */
public class MaterialTable extends javax.swing.JFrame {

    DefaultTableModel model =new DefaultTableModel();
    Object[]data=new Object[0];
    private static MaterialTable pdt = new MaterialTable();
    
    public MaterialTable() {
        initComponents();
        model=(DefaultTableModel)productTable.getModel();
    } 
    
    public void openFrame() {
        pdt.clearRow();
        pdt.showDataRecord();
        pdt.enableButtonCheck();
        pdt.setVisible(true);
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        checkAllButton = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Btn_back = new javax.swing.JButton();
        Btn_MainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(241, 169, 160));

        productTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ชื่อ", "รายละเอียด", "จำนวน", "ราคาต่อหน่วย", "หน่วย"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        productTable.getTableHeader().setReorderingAllowed(false);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setResizable(false);
            productTable.getColumnModel().getColumn(1).setResizable(false);
            productTable.getColumnModel().getColumn(2).setResizable(false);
            productTable.getColumnModel().getColumn(3).setResizable(false);
            productTable.getColumnModel().getColumn(4).setResizable(false);
            productTable.getColumnModel().getColumn(5).setResizable(false);
            productTable.getColumnModel().getColumn(6).setResizable(false);
        }

        checkAllButton.setBackground(new java.awt.Color(44, 62, 80));
        checkAllButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        checkAllButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAllButton.setText("เลือกทั้งหมด");
        checkAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllButtonActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(236, 240, 241));
        btnAdd.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        btnAdd.setText(" เพิ่ม");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(236, 240, 241));
        editButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        editButton.setText("แก้ไข");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        DeleteBTN.setBackground(new java.awt.Color(236, 240, 241));
        DeleteBTN.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        DeleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        DeleteBTN.setText(" ลบ");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ข้อมูลวัสดุ");

        Btn_back.setBackground(new java.awt.Color(236, 240, 241));
        Btn_back.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_back.setText("ย้อนกลับ");
        Btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_backActionPerformed(evt);
            }
        });

        Btn_MainMenu.setBackground(new java.awt.Color(236, 240, 241));
        Btn_MainMenu.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_MainMenu.setText("หน้าหลัก");
        Btn_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_MainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 815, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(DeleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(393, 393, 393)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170)
                        .addComponent(Btn_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if(checkAllButton.getText().equals("เลือกทั้งหมด")){
           for(int i=0; i<productTable.getRowCount(); i++)
               model.setValueAt(true, i, 0);//กำหนดค่าให้กับแถวที่ i คอลัมที่ 0 
           checkAllButton.setText("ยกเลิกการเลือก");
       }else{
           for(int i=0; i<productTable.getRowCount(); i++)
               model.setValueAt(false,i,0);
            checkAllButton.setText("เลือกทั้งหมด");             
       }
       enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
       MaterialForm pd = new MaterialForm();
       pd.openFrame();
       pd.setUpddateFlag(false);
    }//GEN-LAST:event_btnAddActionPerformed

    private void Btn_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_MainMenuActionPerformed
        new MainFrame().setVisible(true);
        pdt.setVisible(false);
    }//GEN-LAST:event_Btn_MainMenuActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        String checkRow = getCheckName();
        String[] s = checkRow.split(", ");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        
        if(reply == JOptionPane.YES_OPTION){
          String sql =  "delete from material where MAT_NAME in ("+ checkRow +");";
          System.out.print(sql);
          
            try{
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                 stmt.executeUpdate(sql);            
                } catch(SQLException ex){
                  System.out.println(ex.getMessage());
        }       
            callClearRow();
            ShowData();
            enableButtonCheck();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            
      }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
        MaterialForm PF = new MaterialForm();
     
        String checkName = getCheckName();
        String[] sp = checkName.split(", ");
        String sql = "select MAT_NAME, MAT_DESCRIPTION, MAT_UNIT from material WHERE MAT_NAME = '" + s[0]+ "'";
     //  System.out.print(sql); //เอาไว้ดู
 
        try(Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()){
                //s[0] = ตัวที่ถูกติ๊กมันเป็นชื่อ(productname)
                PF.setUpdateForm(rs.getString(1), rs.getString(2),rs.getString(3));
                PF.setUpddateFlag(true);
            }
            
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_productTableMouseClicked

    private void Btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_backActionPerformed
        new MaterialMenu().setVisible(true);
        pdt.setVisible(false);
    }//GEN-LAST:event_Btn_backActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MaterialTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MaterialTable().openFrame();
            }
        });
    }
    
    public String getCheckRow(){
        String checkRow = ""; 
        for(int i=0; i<productTable.getRowCount(); i++){
            if(Boolean.valueOf(productTable.getValueAt(i, 0).toString())){
                checkRow +=  productTable.getValueAt(i,2).toString()+ ", ";
                
            }
        }
        return checkRow;
    }
    
    public void showDataRecord() { //เม็ดตอด 
            String sql="Select mat_name, mat_description, mat_amount, mat_unit_cost, mat_unit from material"; 
            try {
             Connection c=Gui_db.getConnection(); //เชื่อมจ่อกับฐานข้อมูล
             ResultSet rs=c.createStatement().executeQuery(sql); //ส่งคำสั่ง sql ไปทำงาน
             int row=0;//ควบคุมแถวแถว
                while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                    model.addRow(data);//เพิ่มแถว
                    model.setValueAt(false,row,0); //คอลัมที่ 0 (แรก) 
                    model.setValueAt(row+1,row,1); //คอลัมที 1 (สอง)
                    model.setValueAt(rs.getString(1),row,2); //คอลัมที 2 (สาม) 
                    model.setValueAt(rs.getString(2),row,3); //คอลัมที ... ก็ว่ากันไป
                    model.setValueAt(rs.getString(3),row,4);
                    model.setValueAt(rs.getString(4),row,5);
                    model.setValueAt(rs.getString(5),row,6);
                    row++;
                }
             
         } catch (Exception e) {
             e.printStackTrace();
         }
                  
        }
    
    public void clearRow(){
        
        int row = model.getRowCount()-1;
        
        while(row>-1){
            model.removeRow(row);
            row--;
            
        }
    }
    
    public String getCheckName(){
        String checkRow = ""; 
        for(int i=0; i<productTable.getRowCount(); i++){
            if(Boolean.valueOf(productTable.getValueAt(i, 0).toString())){
                checkRow +=  "'" + productTable.getValueAt(i,2).toString()+ "', ";
                
            }
        }
        
        if(checkRow.equals(""))
            return "''";
        return checkRow.substring(0,checkRow.length()-2);
    }
    
    public void enableButtonCheck(){
        String check = getCheckRow();
        String[] s = check.split(", ");      //เก็บชื่อสินค้าที่เราลบ ตัวนี้ออกไปแล้ว ,
        if(productTable.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if(s.length == 1 && s[0].equals("")){
            editButton.setEnabled(false);
            DeleteBTN.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");           
        }
        
        else if (s.length == 1){
            editButton.setEnabled(true);
            DeleteBTN.setEnabled(true);         
            checkAllButton.setText("ยกเลิกการเลือก"); 
        }
        
        else{
            DeleteBTN.setEnabled(true);
            editButton.setEnabled(false);          
        }
    }
    
    public void ShowData(){
       pdt.showDataRecord();
    }
    
    public void callClearRow(){
       pdt.clearRow();
    }
    
    public void callEnableButtonCheck(){
       pdt.enableButtonCheck();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_MainMenu;
    private javax.swing.JButton Btn_back;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
