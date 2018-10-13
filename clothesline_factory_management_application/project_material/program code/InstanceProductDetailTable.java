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
public class InstanceProductDetailTable extends javax.swing.JFrame {
    private static InstanceProductDetailTable MY_FRAME = new InstanceProductDetailTable();
    private static String updateInstanceID = "";
    private static String updateProductName = "";
    private static String updatePorderID = "";
    private static int rowCountS;
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    /**
     * Creates new form InstanceProductTable
     */
    public InstanceProductDetailTable() {
        initComponents();
        
        
        model = (DefaultTableModel) instanceDetailTable.getModel();
        enableButtonCheck();

    }
    
    public void setInstanceID(String instance_ID) {
       updateInstanceID = instance_ID;
      
    }
    
    public void setPorderID(String porder_id){
        updatePorderID = porder_id;
    }
    
    public void openFrame() {
     
        MY_FRAME.setVisible(true);
        MY_FRAME.showDataRecord();
        //System.out.println(MY_FRAME.instanceDetailTable.getRowCount());
        MY_FRAME.enableButtonCheck();
        MY_FRAME.sentGetNameToComboBox();
        new InstanceProductDetailForm().setComboBox();
       // MY_FRAME.checkRowSetDisableInsertButton();
        
   
    }
    
    /*public void checkRowSetDisableInsertButton(){ // เทียบจำนวนแถวใน sql และ แถวในโปรแกรม หากเท่ากันใน insertButton.setEnable(false);
        String sql = "select PROD_ID  from PRODUCT;";
        try{
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql); 
            
            int rowPROD_SQL = 0;
            while(rs.next()){
                rowPROD_SQL++;
                
            }
            System.out.println(rowCountS +  " " + rowPROD_SQL);  
            if( rowCountS == rowPROD_SQL){
                MY_FRAME.insertButton.setEnabled(false);
            }
            
            
        
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
    }*/

    
 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        instanceDetailTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(244, 179, 80));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("ข้อมูลรายละเอียดงวด");

        instanceDetailTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        instanceDetailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ประเภทสินค้า", "จำนวนสินค้า"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        instanceDetailTable.getTableHeader().setReorderingAllowed(false);
        instanceDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instanceDetailTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(instanceDetailTable);
        if (instanceDetailTable.getColumnModel().getColumnCount() > 0) {
            instanceDetailTable.getColumnModel().getColumn(0).setResizable(false);
            instanceDetailTable.getColumnModel().getColumn(0).setPreferredWidth(1);
            instanceDetailTable.getColumnModel().getColumn(1).setResizable(false);
            instanceDetailTable.getColumnModel().getColumn(1).setPreferredWidth(15);
            instanceDetailTable.getColumnModel().getColumn(2).setResizable(false);
            instanceDetailTable.getColumnModel().getColumn(2).setPreferredWidth(250);
            instanceDetailTable.getColumnModel().getColumn(3).setResizable(false);
            instanceDetailTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        }

        jPanel1.setBackground(new java.awt.Color(244, 179, 80));

        insertButton.setBackground(new java.awt.Color(236, 240, 241));
        insertButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        insertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        insertButton.setText(" เพิ่ม");
        insertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertButtonActionPerformed(evt);
            }
        });

        updateButton.setBackground(new java.awt.Color(236, 240, 241));
        updateButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        updateButton.setText("แก้ไข");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(236, 240, 241));
        deleteButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        deleteButton.setText(" ลบ");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(insertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        checkAllButton.setBackground(new java.awt.Color(44, 62, 80));
        checkAllButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        checkAllButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAllButton.setText("เลือกทั้งหมด");
        checkAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllButtonActionPerformed(evt);
            }
        });

        mainMenuButton.setBackground(new java.awt.Color(236, 240, 241));
        mainMenuButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        mainMenuButton.setText("เมนูหลัก");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1))
                    .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)))
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        
        InstanceProductDetailForm IPF = new InstanceProductDetailForm();
        IPF.setUpdateFlag(false);
        //IPF.setOrderProductId(orderProductId);
        MY_FRAME.sentGetNameToComboBox();
        IPF.openInsertFrame();
        
     
      

        
        
        
    }//GEN-LAST:event_insertButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
      
        InstanceProductDetailForm IPDF = new InstanceProductDetailForm();
        String checkName = getCheckName();
        String checkAmount = getCheckAmount();
        String[] s = checkName.split(", ");
        String[] s1 = checkAmount.split(", ");
        IPDF.setUpdateForm(s[0], s1[0]);
        callgetNOTCheckNameSQL();
        
        IPDF.setUpdateFlag(true);
               
        
         String sql1 = "select PROD_ID from PRODUCT where PROD_NAME = '" + s[0] + "';";
                try (   Connection conn1 = Gui_db.getConnection();
                        Statement stmt1 = conn1.createStatement();
                        ResultSet rs1 = stmt1.executeQuery(sql1)) {
                        int row=0;
                        while (rs1.next()) {
                               
                        IPDF.setUpdatePROD_ID(rs1.getString(1));
                        row++;        
                    }
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
        
             
     
    }//GEN-LAST:event_updateButtonActionPerformed

    
    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        InstanceProductDetailForm IPDF = new InstanceProductDetailForm();
        InstanceProductTable IPT = new InstanceProductTable();
        String checkName = getCheckName();
        String[] s = checkName.split(", ");
       
            checkName = checkName.substring(0, checkName.length()-2);
            int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
            
            if(reply == JOptionPane.YES_OPTION) {
                for(int i = 0; i<s.length; i++){
                    deleteData(s[i]);
                   
                }
                 
                IPDF.callUpdateINDE(Integer.parseInt(updateInstanceID));  //update_inde_amount by store procedure
                IPDF.callUpdatePODER_DOWN_PAYMENT(Integer.parseInt(updatePorderID)); // update_product_order_down_payment by store procedure 
                IPDF.callUpdateBill_PRICCE(Integer.parseInt(updateInstanceID)); //update_bill_price by store procedure
                clearRow();
                showDataRecord();
                enableButtonCheck();
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
                
                
            }
          
            if(s.length > 0){ 
                MY_FRAME.insertButton.setEnabled(true);
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if(checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for(int i=0; i<instanceDetailTable.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for(int i=0; i<instanceDetailTable.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new InstanceProductTable().openFrame();
        MY_FRAME.dispose();
      
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void instanceDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instanceDetailTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_instanceDetailTableMouseClicked
    
    public void showDataRecord() {
           
            String sql = "select PROD_NAME, INDE_AMOUNT from instance_detail natural join product where instance_id = " + updateInstanceID;
           
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int rowCount=0;
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, rowCount, 0);
                model.setValueAt(rowCount+1, rowCount, 1);
                model.setValueAt(rs.getString(1), rowCount, 2);
                model.setValueAt(rs.getString(2), rowCount, 3);
    
         
          
                rowCount++;
            }
            rowCountS = rowCount;
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
            

            
            
            
    }
    
    
  
    
    
    public void deleteData(String prod_name) {
        
   
        String sql1 = "delete from instance_detail where INSTANCE_ID = " + updateInstanceID + 
                              " AND PROD_ID = (select PROD_ID from PRODUCT where PROD_NAME = '" + prod_name  +"');"; 
                
                try {
                            Connection conn1 = Gui_db.getConnection();
                            Statement stmt1 = conn1.createStatement();
                            stmt1.executeUpdate(sql1);
                           
                            
                } catch (SQLException ex) {
                            System.out.println(ex.getMessage());
                 
                }
        
        
    }
    
    public String getCheckRow() {
        
        String checkRow="";
        for(int i=0; i<instanceDetailTable.getRowCount(); i++) {
            if(Boolean.valueOf(instanceDetailTable.getValueAt(i, 0).toString())) {
                checkRow += instanceDetailTable.getValueAt(i, 1).toString() + ", ";
            }
        }
        
        return checkRow;
    }
    
   
    public String getCheckName(){
      
        String checkName = "";
        for(int i=0; i<instanceDetailTable.getRowCount(); i++){
            if(Boolean.valueOf(instanceDetailTable.getValueAt(i, 0).toString())){
                checkName += instanceDetailTable.getValueAt(i, 2).toString() + ", ";
             
            }
        }
        return checkName;
    }
    /*debug selected product*/
    public String getNotCheckName(){
        String notCheckName = "";
        for(int i=0; i<instanceDetailTable.getRowCount(); i++){
            if(!Boolean.valueOf(instanceDetailTable.getValueAt(i, 0).toString())){
                notCheckName += "'" + instanceDetailTable.getValueAt(i, 2).toString() + "', ";
            }
        }
        
        if(notCheckName.equals(""))
            return "('')";
        
        return notCheckName.substring(0, notCheckName.length()-2);
    }
     
    public int countNotCheckName(){
        int count = 0;
        for(int i=0; i<instanceDetailTable.getRowCount(); i++){
            count++;
        }
        return count;
    }
   
    public String getCheckAmount(){
        
        String checkAmount = "";
        for(int i=0; i<instanceDetailTable.getRowCount(); i++){
            if(Boolean.valueOf(instanceDetailTable.getValueAt(i, 0).toString())){
                checkAmount += instanceDetailTable.getValueAt(i, 3).toString() + ", ";
            }
        }
        return checkAmount;
    }
    
    public String getNameToComboBox(){
        
        String get = "";
     
        for(int i=0; i<instanceDetailTable.getRowCount(); i++){
            get = get + "'" + instanceDetailTable.getValueAt(i, 2).toString() + "', ";
            
        }
        
        if (get.equals(""))
            return "''";
        
       return get.substring(0, get.length()-2);
        
    }
    
    /*debug selected product*/
    public void sentGetNameToComboBox(){
        String s = getNameToComboBox();
        InstanceProductDetailForm IPDF = new InstanceProductDetailForm();
        IPDF.setProductName(s);    
    }
       
    public void getNOTCheckNameSQL(){
        InstanceProductDetailForm  IPDF = new InstanceProductDetailForm();
        String check = getCheckName();
        String[] s = check.split(", ");
        //String sql = "select PROD_NAME from PRODUCT where PROD_NAME not in ('" + s[0] + "'," + notcheckS + ");";
        String sql = "select PROD_NAME from PRODUCT where PROD_NAME not in (" + getNotCheckName() + ");";
       
         try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs1 = stmt.executeQuery(sql);
            
            String get = "";
            int row = 0; 
            while(rs1.next()){

                get += "'" + rs1.getString(1) + "', ";
                row++;
            }
           
            String substringGet = get.substring(0, get.length()-2);
            IPDF.setComboBoxUPDATE_FRAME(substringGet, s[0]);
            //System.out.println("subStringGet = " + substringGet);
            
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        
        
        
        
    }// เช็คชื่อที่ไม่ได้เลือก เพื่อนำส่งไปใน comboBox ตอน แก้ไขข้อมูล
            
    public void callgetNOTCheckNameSQL(){
        MY_FRAME.getNOTCheckNameSQL();
    }
     
    
    
  
    
    
    public void callSentGetNameToComboBox(){
        MY_FRAME.sentGetNameToComboBox();
    }
    
    public void callgetNameToComboBox(){
        MY_FRAME.getNameToComboBox();
    }

    
    
    public void clearRow() {
        int row = model.getRowCount()-1;
        while(row > -1) {
            model.removeRow(row);
            row--;
        }
    }
    
    public void enableButtonCheck() {
        String check = getCheckRow();
        String[] s = check.split(", ");
      
        if(instanceDetailTable.getRowCount()> 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if (s.length == 1 && s[0].equals("")) {
            updateButton.setEnabled(false);
            deleteButton.setEnabled(false);
            
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        else if (s.length == 1) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
          
            checkAllButton.setText("ยกเลิกการเลือก");
        }
        
        else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(false);
            
        }
    }
    
    public void callClearRow() {
        MY_FRAME.clearRow();
    }
    
    public void callShowDataRecord() {
        MY_FRAME.showDataRecord();
    }
    
    public void callEnableButtonCheck() {
        MY_FRAME.enableButtonCheck();
    }
    
    public void callSetEnableInsertButton(Boolean value){
        MY_FRAME.insertButton.setEnabled(value);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JTable instanceDetailTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}