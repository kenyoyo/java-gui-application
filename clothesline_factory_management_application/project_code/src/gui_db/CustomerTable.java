package gui_db;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;


public class CustomerTable extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Object[] data = new Object[0];
    TextAreaRenderer textAreaRenderer = new TextAreaRenderer();
    TextAreaEditor textAreaEditor = new TextAreaEditor();
    private static CustomerTable customerFrame = new CustomerTable();

    public CustomerTable() {
        initComponents();
        setTabel();
        showDataRecordCus();
        enableButtonCheck();
    }
    
    public void openFrame() {
        customerFrame.clearRow();
        customerFrame.showDataRecordCus();
        customerFrame.callEnableButtonCheck();
        customerFrame.searchCustomerNameTXt.setText("");
        customerFrame.setVisible(true);
    }

    public void setTabel(){
       // BtnInsert.setEnabled(true);
       
        model = (DefaultTableModel)TBCustomer.getModel(); 
        
        TableColumnModel cmodel = TBCustomer.getColumnModel();
        for(int i=1; i<5; i++){
            cmodel.getColumn(i).setCellRenderer(textAreaRenderer);
            cmodel.getColumn(i).setCellEditor(textAreaEditor);
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBCustomer = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        BtnInsert = new javax.swing.JButton();
        BtnEdit = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        BtnOrder = new javax.swing.JButton();
        BtnCheckAll = new javax.swing.JButton();
        mainMenuButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        searchCustomerNameTXt = new javax.swing.JTextField();
        searchCustomerNameBTN = new javax.swing.JButton();
        resetCustomerNameBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Test");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(149, 165, 166));
        jPanel1.setToolTipText("");
        jPanel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel1.setName("ข้อมูลลูกค้า"); // NOI18N

        TBCustomer.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        TBCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "หมายเลขลูกค้า", "ชื่อลูกค้า", "ที่อยู่", "เบอร์โทรศัพท์"
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
        TBCustomer.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TBCustomer.getTableHeader().setReorderingAllowed(false);
        TBCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBCustomer);
        if (TBCustomer.getColumnModel().getColumnCount() > 0) {
            TBCustomer.getColumnModel().getColumn(0).setResizable(false);
            TBCustomer.getColumnModel().getColumn(0).setPreferredWidth(55);
            TBCustomer.getColumnModel().getColumn(1).setResizable(false);
            TBCustomer.getColumnModel().getColumn(1).setPreferredWidth(90);
            TBCustomer.getColumnModel().getColumn(2).setResizable(false);
            TBCustomer.getColumnModel().getColumn(2).setPreferredWidth(250);
            TBCustomer.getColumnModel().getColumn(3).setResizable(false);
            TBCustomer.getColumnModel().getColumn(3).setPreferredWidth(380);
            TBCustomer.getColumnModel().getColumn(4).setResizable(false);
            TBCustomer.getColumnModel().getColumn(4).setPreferredWidth(150);
        }

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));

        BtnInsert.setBackground(new java.awt.Color(236, 240, 241));
        BtnInsert.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnInsert.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        BtnInsert.setText(" เพิ่ม");
        BtnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnInsertActionPerformed(evt);
            }
        });

        BtnEdit.setBackground(new java.awt.Color(236, 240, 241));
        BtnEdit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        BtnEdit.setText("แก้ไข");
        BtnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditActionPerformed(evt);
            }
        });

        BtnDelete.setBackground(new java.awt.Color(236, 240, 241));
        BtnDelete.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        BtnDelete.setText(" ลบ");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(BtnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(BtnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addComponent(BtnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        BtnOrder.setBackground(new java.awt.Color(236, 240, 241));
        BtnOrder.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnOrder.setText("ออเดอร์สินค้า");
        BtnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnOrderActionPerformed(evt);
            }
        });

        BtnCheckAll.setBackground(new java.awt.Color(44, 62, 80));
        BtnCheckAll.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        BtnCheckAll.setForeground(new java.awt.Color(255, 255, 255));
        BtnCheckAll.setText("เลือกทั้งหมด");
        BtnCheckAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCheckAllActionPerformed(evt);
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

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        searchCustomerNameTXt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        searchCustomerNameTXt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerNameTXtActionPerformed(evt);
            }
        });

        searchCustomerNameBTN.setBackground(new java.awt.Color(236, 240, 241));
        searchCustomerNameBTN.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        searchCustomerNameBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/research.png"))); // NOI18N
        searchCustomerNameBTN.setText(" ค้นหา");
        searchCustomerNameBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchCustomerNameBTNActionPerformed(evt);
            }
        });

        resetCustomerNameBTN.setBackground(new java.awt.Color(236, 240, 241));
        resetCustomerNameBTN.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        resetCustomerNameBTN.setText("รีเซ็ต");
        resetCustomerNameBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetCustomerNameBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("ข้อมูลลูกค้า");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(41, 41, 41)
                            .addComponent(BtnCheckAll, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(32, 32, 32)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(searchCustomerNameTXt, javax.swing.GroupLayout.PREFERRED_SIZE, 466, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(searchCustomerNameBTN)
                                    .addGap(21, 21, 21)
                                    .addComponent(resetCustomerNameBTN))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backButton)
                            .addGap(425, 425, 425)
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(mainMenuButton)))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(438, 438, 438))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchCustomerNameBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetCustomerNameBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchCustomerNameTXt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(BtnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(240, 240, 240)
                .addComponent(BtnCheckAll, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void BtnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnInsertActionPerformed
        CustomerForm customerForm = new CustomerForm();
        customerForm.setUpdateFlag(false);
        customerForm.openInsertFrame();
      
   
    }//GEN-LAST:event_BtnInsertActionPerformed

    private void BtnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditActionPerformed
            String r = getCheckCus_Name();
            String[] s = r.split(", ");
  
       
            if(!s[0].equals("") && s.length == 1){
            
                CustomerForm cusForm = new CustomerForm();
                String sql = "select * from customer where cus_name = '" + s[0] + "'" ; 
                String sql1 = "select cus_id from customer where cus_name = '" + s[0] + "'";
                //System.out.println("s[0] = " + s[0]);
                try{
                    
                 Connection conn = Gui_db.getConnection();
                 Statement stmt  = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 
                 int row = 0; 
                 while(rs.next()){
                    
                       
                       cusForm.setUpdateForm(rs.getString(2), rs.getString(3), rs.getString(4));
                       cusForm.setUpdateFlag(true);
                      
                       
                       row++;
                     
                 }
                 
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                
                
                try{
                    
                 Connection conn = Gui_db.getConnection();
                 Statement stmt  = conn.createStatement();
                 ResultSet rs1 = stmt.executeQuery(sql1);
                 int row = 0; 
                 while(rs1.next()){
                    
                       //System.out.println("ID = " + rs1.getString(1) );
                       cusForm.setUpdateFormID(rs1.getString(1));
                       cusForm.setUpdateFlag(true);
                      
                       
                       row++;
                     
                 }
                 
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
                enableButtonCheck();
                    
                
            
                
                
            }/*else if(r.equals("")){
                 JOptionPane.showMessageDialog(null, "กรุณาเลือกแถวที่ต้องการแก้ไข");
            }    
        */
        
        
    }//GEN-LAST:event_BtnEditActionPerformed

    private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
        
        String r = getCheckCus_Name();
        String[] sp = r.split(", ");
        if(r.length() > 1){
              r = r.substring(0, r.length()-2);
              
              int YesOrNo = JOptionPane.showConfirmDialog(null,"ลบข้อมูลทั้งหมดจำนวน " + sp.length + " แถว","คำเตือนในการลบ", JOptionPane.YES_NO_OPTION);
                if(YesOrNo == JOptionPane.YES_NO_OPTION){
                  for (String sp1 : sp) {
                      deleteData(sp1);
                  }
                    showDataRecordCus();
                    JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อยแล้ว ");
                    
                    
                    enableButtonCheck();
                    
                  
                    
                }
       
        } 
      
       
            
        
        
        
    }//GEN-LAST:event_BtnDeleteActionPerformed
    
    private void BtnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnOrderActionPerformed
        String check = getCheckCus_Name();
        String[] s = check.split(", ");
        OrderProductTable OPT = new OrderProductTable();
        String sql = "select cus_id from customer where cus_name = '" + s[0] + "'";
        try{   
                 Connection conn = Gui_db.getConnection();
                 Statement stmt  = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 
                 while(rs.next()){
                     OPT.setCustomerId(rs.getString(1));
                 }
                 
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
        OPT.openFrame();
        customerFrame.dispose();
    }//GEN-LAST:event_BtnOrderActionPerformed

    private void BtnCheckAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCheckAllActionPerformed
        if(BtnCheckAll.getText().equals("เลือกทั้งหมด")){
            for(int i=0; i<TBCustomer.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            BtnCheckAll.setText("ยกเลิกการเลือก");
            BtnEdit.setEnabled(false);
            BtnDelete.setEnabled(true);
            
        }else {
            for(int i=0; i<TBCustomer.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            BtnCheckAll.setText("เลือกทั้งหมด");
            BtnDelete.setEnabled(false);
           
            
        }
        
        enableButtonCheck();
    }//GEN-LAST:event_BtnCheckAllActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        new OrderMenu().setVisible(true);
        customerFrame.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void mainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainMenuButtonActionPerformed
        new MainFrame().setVisible(true);
        customerFrame.dispose();
    }//GEN-LAST:event_mainMenuButtonActionPerformed
    // เพิ่มโดย A   line 434-490
    private void searchCustomerNameBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerNameBTNActionPerformed
        
        showSearchCustomerName();
    }//GEN-LAST:event_searchCustomerNameBTNActionPerformed

    private void searchCustomerNameTXtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchCustomerNameTXtActionPerformed
        showSearchCustomerName();
    }//GEN-LAST:event_searchCustomerNameTXtActionPerformed

    private void resetCustomerNameBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetCustomerNameBTNActionPerformed
        customerFrame.searchCustomerNameTXt.setText("");
        openFrame();
    }//GEN-LAST:event_resetCustomerNameBTNActionPerformed

    private void TBCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBCustomerMouseClicked
        enableButtonCheck();

    }//GEN-LAST:event_TBCustomerMouseClicked
    
    
    public void showSearchCustomerName(){
        customerFrame.clearRow();
        customerFrame.searchCustomerName();
        customerFrame.callEnableButtonCheck();
        customerFrame.setVisible(true);
        
        
    }
    
    
    public void searchCustomerName(){
        
        String searchCusName = searchCustomerNameTXt.getText();
        String sql = "select cus_name, cus_address, cus_telephone from customer where cus_name like '%" + searchCusName + "%';";
        try{
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            int row = 0;
            while(rs.next()){
                
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row+1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                model.setValueAt(rs.getString(3), row, 4);
  
                row++;
            }
            
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
        }
        
  
    }
    
    // เพิ่มโดย A ตั้งแต่ line   434 to 490
    
    
    public void showDataRecordCus(){
        
         clearRow();
        String sql = "SELECT * FROM Customer Order by CUS_ID DESC";
        
        try (Connection conn = Gui_db.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {
           
            // loop through the result set
            int row = 0;
           
            while (rs.next()) {
                
                model.addRow(data);
                model.setValueAt(false, row, 0);
                //model.setValueAt(rs.getString(1), row, 1);
                model.setValueAt(row +1, row, 1);
                model.setValueAt(rs.getString(2), row, 2);
                model.setValueAt(rs.getString(3), row, 3); 
                model.setValueAt(rs.getString(4), row, 4);
 
                row++;
             
            }
     
           
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void deleteData(String cus_name){
           
   
            String sql = "delete from customer where cus_name = '" + cus_name + "'";
       
            try{    Connection conn = Gui_db.getConnection();
                    Statement stmt  = conn.createStatement();
                    stmt.executeUpdate(sql);      
                              
                          
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
                              
  
    }
    
    public String getCheckRow(){
        
        String row = " ";
        
        for(int i=0; i<TBCustomer.getRowCount(); i++){
            
            if(Boolean.valueOf(TBCustomer.getValueAt(i, 0).toString()))
                row += model.getValueAt(i, 1).toString() + ", ";

        }
        
        return row;
        
        
       
    }
   
    
    public String getCheckCus_Name(){
        
        String cus_name = "";
        
        for(int i=0; i<TBCustomer.getRowCount(); i++){
            
            if(Boolean.valueOf(TBCustomer.getValueAt(i, 0).toString()))
                cus_name += model.getValueAt(i, 2).toString() + ", ";
          
            
            
        }
        
        return cus_name;
        
    }
    
    public int getNumRow(){
        int row=0;
        String sql = "SELECT * FROM Customer Order by CUS_ID DESC";
          try (Connection conn = Gui_db.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {
    
            int r = 0;
           
            while (rs.next()) {
                
                r++;
             
            }
     
           row = r;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
          
       
       return row;
            
    
}
        
    
    
    public void clearRow(){
        
        int row = model.getRowCount()-1;
        
        while(row>-1){
            model.removeRow(row);
            row--;
            
        }
        
        
    }
    
    public void callClearRow(){
        customerFrame.clearRow();
    }
     
    public void callShowDataRecord(){
        customerFrame.showDataRecordCus();
        
    }
    
    public void callEnableButtonCheck() {
        customerFrame.enableButtonCheck();
    }
    
    public void enableButtonCheck(){
        
           
        String check = getCheckRow();
        String[] s = check.split(", ");
        
        if(TBCustomer.getRowCount() > 0)
            BtnCheckAll.setEnabled(true);
        else
            BtnCheckAll.setEnabled(false);
       
        
        
        
        if (s.length == 1 && !s[0].equals(" ")) {
            BtnEdit.setEnabled(true);
            BtnDelete.setEnabled(true);
            BtnOrder.setEnabled(true);
            BtnCheckAll.setText("ยกเลิกการเลือก");
            
        }
        
        else if (s.length == 1) {
            BtnEdit.setEnabled(false);
            BtnDelete.setEnabled(false);
            BtnOrder.setEnabled(false);
            BtnCheckAll.setText("เลือกทั้งหมด");
         
        }
        
        else {
            BtnEdit.setEnabled(false);
            BtnDelete.setEnabled(true);
            BtnOrder.setEnabled(false);
            
        } 
    }    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCheckAll;
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEdit;
    private javax.swing.JButton BtnInsert;
    private javax.swing.JButton BtnOrder;
    private javax.swing.JTable TBCustomer;
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton mainMenuButton;
    private javax.swing.JButton resetCustomerNameBTN;
    private javax.swing.JButton searchCustomerNameBTN;
    private javax.swing.JTextField searchCustomerNameTXt;
    // End of variables declaration//GEN-END:variables
}


