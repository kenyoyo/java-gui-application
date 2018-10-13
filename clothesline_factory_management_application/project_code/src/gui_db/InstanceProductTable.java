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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZDO
 */
public class InstanceProductTable extends javax.swing.JFrame {
    private static InstanceProductTable MY_FRAME = new InstanceProductTable();
    private static String orderProductId = "1";
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    private static String billTypeName = "";

    public void sentBillTypeName(String billT){
        billTypeName = billT;
    }
    
    /**
     * Creates new form InstanceProductTable
     */
    public InstanceProductTable() {
        initComponents();
        model = (DefaultTableModel) instanceTable.getModel();
    }
    
     //นำ instance_idส่งไปใน InstanceProductDetail
    
    //เพิ่มโดย A 
    public void selectInstance_ID(){
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
        
        InstanceProductDetailTable IPDT = new InstanceProductDetailTable();
        InstanceProductDetailForm IPDF = new InstanceProductDetailForm();

        String sql = "select INSTANCE_ID from instance WHERE INSTANCE_DELI_DATE = '" + s[0] + "' and PORDER_ID = " + orderProductId;
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int row=0;
            while (rs.next()) {
                
        
                IPDT.setInstanceID(rs.getString(1));    // ส่ง instance_id
                IPDT.setPorderID(orderProductId);       // ส่ง porder_id
                IPDF.setInstanceID(rs.getString(1));    // ส่ง instance_id
                IPDF.setPorderID(orderProductId);       // ส่ง porder_id 
                //System.out.println("print selectInstane_ID");
                row++;
               
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        
        
        
        
        
    }
    
    // เพิ่มโดยเอ 
    
    public void setInstance_idUpdateBill_id(){
       

        InstanceProductForm IPF = new InstanceProductForm();
        System.out.println(IPF.getInstance_deli_date());
        String instance_deli_date = IPF.getInstance_deli_date();
     
        String sql = "select INSTANCE_ID from instance WHERE INSTANCE_DELI_DATE = '" + instance_deli_date + "' and PORDER_ID = " + orderProductId;
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            System.out.println("sql\n" + sql);
            int row=0;
            while (rs.next()) {
                
                IPF.updateInstanceByBill_ID(rs.getString(1));
                
    
                row++;
               
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        
       
        
        
        
    }
   
    
    //เพิ่มโดย A 
    public int checkDataInRow(){
        int countRow=0;
        for(int i=0; i<MY_FRAME.instanceTable.getRowCount(); i++){
           if(Boolean.valueOf(MY_FRAME.instanceTable.getValueAt(i, 0).toString()) ||  !Boolean.valueOf(MY_FRAME.instanceTable.getValueAt(i, 0).toString())){
            countRow++;
           }
        }
      
        return countRow;
       
        
    }
    
    public void setOrderProductId(String id) {
        orderProductId = id;
    }
    
    public void openFrame() {
        MY_FRAME.orderIdLabel.setText("ออเดอร์สินค้าหมายเลข " + orderProductId);
        MY_FRAME.clearRow();
        MY_FRAME.showDataRecord();
        MY_FRAME.enableButtonCheck();
        MY_FRAME.setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        mainMenuButton = new javax.swing.JButton();
        indeButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        instanceTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        insertButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        orderIdLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(233, 212, 96));

        mainMenuButton.setBackground(new java.awt.Color(236, 240, 241));
        mainMenuButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        mainMenuButton.setText("เมนูหลัก");
        mainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainMenuButtonActionPerformed(evt);
            }
        });

        indeButton.setBackground(new java.awt.Color(236, 240, 241));
        indeButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        indeButton.setText("รายละเอียดงวด");
        indeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                indeButtonActionPerformed(evt);
            }
        });

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

        instanceTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        instanceTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "จำนวนสินค้าทั้งหมด", "ยอดเงินรวม", "วันส่งงวด"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        instanceTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                instanceTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(instanceTable);
        if (instanceTable.getColumnModel().getColumnCount() > 0) {
            instanceTable.getColumnModel().getColumn(0).setResizable(false);
            instanceTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            instanceTable.getColumnModel().getColumn(1).setResizable(false);
            instanceTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            instanceTable.getColumnModel().getColumn(2).setResizable(false);
            instanceTable.getColumnModel().getColumn(2).setPreferredWidth(150);
            instanceTable.getColumnModel().getColumn(3).setResizable(false);
            instanceTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            instanceTable.getColumnModel().getColumn(4).setResizable(false);
            instanceTable.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jPanel1.setBackground(new java.awt.Color(233, 212, 96));

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
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updateButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
                    .addComponent(insertButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(insertButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        orderIdLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        orderIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        orderIdLabel.setText("หมายเลขออเดอร์สินค้า");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 40)); // NOI18N
        jLabel1.setText("ข้อมูลการจัดการงวด");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(backButton)
                        .addGap(284, 284, 284)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(orderIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 572, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(indeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(277, 277, 277)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(orderIdLabel)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(indeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(98, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void insertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertButtonActionPerformed
        InstanceProductForm IPF = new InstanceProductForm();
        IPF.setUpdateFlag(false);
        IPF.setOrderProductId(orderProductId);
        IPF.openInsertFrame();
    }//GEN-LAST:event_insertButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
        InstanceProductForm IPF = new InstanceProductForm();
        String sql = "select INSTANCE_ID from instance WHERE INSTANCE_DELI_DATE = '" + s[0] + "' and PORDER_ID = " + orderProductId;
        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            // loop through the result set
            while (rs.next()) {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format.parse(s[0]);
                
                IPF.setUpdateForm(rs.getString(1), date);
                IPF.setUpdateFlag(true);
            }
            
        } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(InstanceProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        String instance_id = getInstanceIdtoDelete();
            
         
   
       
            if(billTypeName.equals("บิลรายงวด")){
                InstanceProductDetailForm IPDF = new InstanceProductDetailForm();
                deleteBills(instance_id);
                deleteInstance(instance_id);
                IPDF.callUpdatePODER_DOWN_PAYMENT(Integer.parseInt(orderProductId));
            }else if(billTypeName.equals("บิลรวมงวด")){
                
                String getBillID = "";
                String sql = "select bill_id from bills natural join instance where instance_id in(" + instance_id + ");";
               
                try{
                    Connection con = Gui_db.getConnection();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);
                    
                    while(rs.next()){
                        getBillID = rs.getString(1);
                    }
                    
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());
                    
                }
                
                deleteInstance(instance_id);
                
                if(instanceTable.getRowCount() == 0){
                    deleteBill_ID(getBillID);
                }   
       
            }
    }//GEN-LAST:event_deleteButtonActionPerformed

    public void deleteInstance(String instance_id){
       
        String[] s = instance_id.split(",");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                  "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION) {
                deleteData(instance_id);
               
                clearRow();
                showDataRecord();
                enableButtonCheck();
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            }
        
        
        
    }
    
    
    public void deleteBill_ID(String bill_id){
        String sql = "delete bills from bills where bill_id = " + bill_id + ";";
        try{
            
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
           
        }catch(SQLException ex){
            
            System.out.println(ex.getMessage());
            
        }
        
        
    }
    
    
    
    
    public void deleteBills(String getInstanceID){
        
        String sql = "delete bills from bills natural join instance where instance_id in(" +  getInstanceID  +");";   
      
       
        try{
              
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate(sql);
            
    
        }catch(SQLException ex){
            System.out.print(ex.getMessage());
        }
   
      
    }
    
    public void deleteData(String getInstanceID) {
        String sql = "delete from instance where instance_id in(" + getInstanceID + ");";
        
        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
    public String getInstanceIdtoDelete(){
        String getInstance = "";
        String checkRow = getCheckRowMore();
        String scheckRow = checkRow.substring(0, getCheckRowMore().length()-2);
        
        
        String sql = "select instance_id from instance where instance_deli_date in(" +  scheckRow + ") and porder_id = " +  orderProductId  + ";";
     
     
            try{
            
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet  rs = stmt.executeQuery(sql);
             
            int row=0;
            while(rs.next()){
                
                getInstance += rs.getString(1) + ",";
                
                row++;
            }
            
           
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
               
            
        }
      
        
      return getInstance.substring(0, getInstance.length()-1);
        
    }
    
    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if(checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for(int i=0; i<instanceTable.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for(int i=0; i<instanceTable.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        OrderProductTable OPT = new OrderProductTable();
        OPT.openFrame();
        MY_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        new MainFrame().setVisible(true);
        MY_FRAME.dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed

    private void instanceTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_instanceTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_instanceTableMouseClicked

    private void indeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_indeButtonActionPerformed
        MY_FRAME.selectInstance_ID();
        InstanceProductDetailTable ipdt = new InstanceProductDetailTable();
        ipdt.callClearRow();
        ipdt.openFrame();
        ipdt.callgetNameToComboBox();
        MY_FRAME.dispose();
    }//GEN-LAST:event_indeButtonActionPerformed
    
    public void showDataRecord() {
            String sql = "select * from instance where PORDER_ID = "+ orderProductId +" order by INSTANCE_ID DESC";
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int row=0;
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row+1, row, 1);
                model.setValueAt(rs.getString(2), row, 2);
                model.setValueAt(rs.getString(3), row, 3);
                model.setValueAt(rs.getString(4), row, 4);
            
                row++;
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
    }
    
    public String getCheckRow() {
        String checkRow="";
        for(int i=0; i<instanceTable.getRowCount(); i++) {
            if(Boolean.valueOf(instanceTable.getValueAt(i, 0).toString())) {
                checkRow += instanceTable.getValueAt(i, 4).toString() + ", ";
            }
        }
        
        return checkRow;
    }
    
      public String getCheckRowMore() {
        String checkRow="";
        for(int i=0; i<instanceTable.getRowCount(); i++) {
            if(Boolean.valueOf(instanceTable.getValueAt(i, 0).toString())) {
                checkRow += "'" + instanceTable.getValueAt(i, 4).toString() + "', ";
            }
        }
        
        return checkRow;
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
        if(instanceTable.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if (s.length == 1 && s[0].equals("")) {
            updateButton.setEnabled(false);
            deleteButton.setEnabled(false);
            indeButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        else if (s.length == 1) {
            updateButton.setEnabled(true);
            deleteButton.setEnabled(true);
            indeButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        }
        
        else {
            deleteButton.setEnabled(true);
            updateButton.setEnabled(false);
            indeButton.setEnabled(false);
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton indeButton;
    private javax.swing.JButton insertButton;
    private javax.swing.JTable instanceTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JLabel orderIdLabel;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}