package gui_db;

import java.lang.reflect.Method;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class ChangePrice extends javax.swing.JFrame {
  DefaultTableModel model =new DefaultTableModel();
    Object[]data=new Object[0];
     private static ChangePrice cpFrame = new ChangePrice();
    
    public ChangePrice() {
        initComponents();
        model = (DefaultTableModel)tbchange.getModel();
        TableColumnModel tcm = tbchange.getColumnModel();
        tcm.removeColumn( tcm.getColumn(6) );
    }
    public void openChangePriceFrame(){
        cpFrame.clearRow();
        cpFrame.showDataRecord();
        cpFrame.enableButtonCheck();
        cpFrame.setVisible(true);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        checkAllButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbchange = new javax.swing.JTable();
        DeleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(224, 130, 131));

        checkAllButton.setBackground(new java.awt.Color(44, 62, 80));
        checkAllButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        checkAllButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAllButton.setText("เลือกทั้งหมด");
        checkAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllButtonActionPerformed(evt);
            }
        });

        tbchange.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        tbchange.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "วันที่", "วัสดุ", "ราคา", "ผู้ขาย", "MPC_ID"
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
        tbchange.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbchange.getTableHeader().setReorderingAllowed(false);
        tbchange.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbchangeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbchange);
        if (tbchange.getColumnModel().getColumnCount() > 0) {
            tbchange.getColumnModel().getColumn(0).setResizable(false);
            tbchange.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbchange.getColumnModel().getColumn(1).setResizable(false);
            tbchange.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbchange.getColumnModel().getColumn(2).setResizable(false);
            tbchange.getColumnModel().getColumn(2).setPreferredWidth(100);
            tbchange.getColumnModel().getColumn(3).setResizable(false);
            tbchange.getColumnModel().getColumn(3).setPreferredWidth(100);
            tbchange.getColumnModel().getColumn(4).setResizable(false);
            tbchange.getColumnModel().getColumn(4).setPreferredWidth(100);
            tbchange.getColumnModel().getColumn(5).setResizable(false);
            tbchange.getColumnModel().getColumn(5).setPreferredWidth(600);
            tbchange.getColumnModel().getColumn(6).setResizable(false);
        }

        DeleteBTN.setBackground(new java.awt.Color(218, 223, 225));
        DeleteBTN.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        DeleteBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        DeleteBTN.setText(" ลบ");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("ประวัติการเปลี่ยนแปลงราคา");

        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jButton1.setText("ย้อนกลับ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jButton2.setText("เมนูหลัก");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(376, 376, 376))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                        .addGap(28, 28, 28)
                        .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(93, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
       if(checkAllButton.getText().equals("เลือกทั้งหมด")){
           for(int i=0; i<tbchange.getRowCount(); i++)
               model.setValueAt(true, i, 0);//กำหนดค่าให้กับแถวที่ i คอลัมที่ 0 
           checkAllButton.setText("ยกเลิกการเลือก");
       }else{
           for(int i=0; i<tbchange.getRowCount(); i++)
               model.setValueAt(false,i,0);
            checkAllButton.setText("เลือกทั้งหมด");             
       }
       enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        String checkRow = getCheckName();
        String[] s = checkRow.split("', ");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        
        if(reply == JOptionPane.YES_OPTION){
          String sql =  "delete  from material_price_change where MPC_ID in ("+ checkRow.substring(0, checkRow.length()-2) +");";
          System.out.print(sql);
          
            try{
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                 stmt.executeUpdate(sql);            
                } catch(SQLException ex){
                  System.out.println(ex.getMessage());
        }       
            cpFrame.clearRow();
            cpFrame.showDataRecord();
            cpFrame.enableButtonCheck();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            
      }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void tbchangeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbchangeMouseClicked
        cpFrame.enableButtonCheck();
    }//GEN-LAST:event_tbchangeMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       new MainFrame().setVisible(true);
        cpFrame.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       new MaterialMenu().setVisible(true);
        cpFrame.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed
    
     public void showDataRecord() { //เม็ดตอด 

            String sql= "select MPC_DATE, MAT_NAME, MPC_PRICE, V_NAME, MPC_ID "
                      + "from material_price_change natural join produce "
                      + "natural join vendor natural join material order by MPC_DATE"; 
            try (Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)) {
                int row=0;
                while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                    model.addRow(data);//เพิ่มแถว
                    model.setValueAt(false,row,0); //คอลัมที่ 0 (แรก) 
                    model.setValueAt(row +1, row, 1); //คอลัมที 1 (สอง)
                    model.setValueAt(rs.getString(1),row,2);
                    model.setValueAt(rs.getString(2),row,3); //คอลัมที 2 (สาม) 
                    model.setValueAt(rs.getString(3),row,4); //คอลัมที ... ก็ว่ากันไป
                    model.setValueAt(rs.getString(4),row,5);
                    model.setValueAt(rs.getString(5),row,6);
                    row++;
                }
             
         } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                  
        }
     
     
     public void clearRow(){ //การลบแถวทั้งหมด
        int row = model.getRowCount()-1;
        while (row>-1) {
            model.removeRow(row);
            row--;
            
        }
    }
     
     public String getCheckName(){
        String checkRow = ""; 
        for(int i=0; i<tbchange.getRowCount(); i++){
            if(Boolean.valueOf(tbchange.getValueAt(i, 0).toString())){
                checkRow +=  tbchange.getModel().getValueAt(i, 6).toString()+ ", ";
                
            }
        }
        return checkRow;
    }
     
     public void enableButtonCheck(){
        String check = getCheckName();
        String[] s = check.split(", ");      //เก็บชื่อสินค้าที่เราลบ ตัวนี้ออกไปแล้ว ,
        if(tbchange.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if(s.length == 1 && s[0].equals("")){
            DeleteBTN.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");           
        }
        
        else if (s.length == 1){
            DeleteBTN.setEnabled(true);         
            checkAllButton.setText("ยกเลิกการเลือก"); 
        }
        
        else{
            DeleteBTN.setEnabled(true);          
        }
    }
     
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbchange;
    // End of variables declaration//GEN-END:variables
}
