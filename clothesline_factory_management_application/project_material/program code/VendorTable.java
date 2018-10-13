package gui_db;

import java.lang.reflect.Method;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
public class VendorTable extends javax.swing.JFrame {
    
    DefaultTableModel model =new DefaultTableModel();
    Object[]data=new Object[0];
    TextAreaRenderer textAreaRenderer = new TextAreaRenderer();
    TextAreaEditor textAreaEditor = new TextAreaEditor();
    private static VendorTable VendorFrame = new VendorTable();    //private boolean ture;
    public VendorTable() {
        initComponents();
        model = (DefaultTableModel)tbvendor.getModel(); 
        TableColumnModel cmodel = tbvendor.getColumnModel();
        for(int i=1; i<6; i++){
            cmodel.getColumn(i).setCellRenderer(textAreaRenderer);
            cmodel.getColumn(i).setCellEditor(textAreaEditor);
        }
    }
    
    
     public void openFrame() {
        VendorFrame.clearRow();
        VendorFrame.showDataRecord();
        VendorFrame.enableButtonCheck();
        VendorFrame.setVisible(true);
    }

  //  public void setTabel(){
       // BtnInsert.setEnabled(true);
       
    //    model = (DefaultTableModel)tbvendor.getModel(); 
        
      //  TableColumnModel cmodel = tbvendor.getColumnModel();
        //for(int i=1; i<5; i++){
          //  cmodel.getColumn(i).setCellRenderer(textAreaRenderer);
            //cmodel.getColumn(i).setCellEditor(textAreaEditor);
        //}
        
        
   // }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbvendor = new javax.swing.JTable();
        btnchAll = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        LinkVendorSale = new javax.swing.JButton();
        Addddd = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btDel = new javax.swing.JButton();
        Btn_back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("หจก. วช.วัชรภัณฑ์ จำกัด");
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(241, 169, 160));

        tbvendor.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        tbvendor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ชื่อ", "โทรศัพท์", "ที่อยู่", "ผู้ติดต่อ"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbvendor.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tbvendor.getTableHeader().setReorderingAllowed(false);
        tbvendor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbvendorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbvendor);
        if (tbvendor.getColumnModel().getColumnCount() > 0) {
            tbvendor.getColumnModel().getColumn(0).setResizable(false);
            tbvendor.getColumnModel().getColumn(0).setPreferredWidth(50);
            tbvendor.getColumnModel().getColumn(1).setResizable(false);
            tbvendor.getColumnModel().getColumn(1).setPreferredWidth(50);
            tbvendor.getColumnModel().getColumn(2).setResizable(false);
            tbvendor.getColumnModel().getColumn(2).setPreferredWidth(230);
            tbvendor.getColumnModel().getColumn(3).setResizable(false);
            tbvendor.getColumnModel().getColumn(3).setPreferredWidth(125);
            tbvendor.getColumnModel().getColumn(4).setResizable(false);
            tbvendor.getColumnModel().getColumn(4).setPreferredWidth(400);
            tbvendor.getColumnModel().getColumn(5).setResizable(false);
            tbvendor.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        btnchAll.setBackground(new java.awt.Color(44, 62, 80));
        btnchAll.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btnchAll.setForeground(new java.awt.Color(255, 255, 255));
        btnchAll.setText("เลือกทั้งหมด");
        btnchAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchAllActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(236, 240, 241));
        jButton1.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        jButton1.setText("เมนูหลัก");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        LinkVendorSale.setBackground(new java.awt.Color(236, 240, 241));
        LinkVendorSale.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        LinkVendorSale.setText("วัสดุที่ขายให้");
        LinkVendorSale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LinkVendorSaleActionPerformed(evt);
            }
        });

        Addddd.setBackground(new java.awt.Color(236, 240, 241));
        Addddd.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Addddd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        Addddd.setText(" เพิ่ม");
        Addddd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdddddActionPerformed(evt);
            }
        });

        btEdit.setBackground(new java.awt.Color(236, 240, 241));
        btEdit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        btEdit.setText("แก้ไข");
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });

        btDel.setBackground(new java.awt.Color(236, 240, 241));
        btDel.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btDel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        btDel.setText(" ลบ");
        btDel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btDelActionPerformed(evt);
            }
        });

        Btn_back.setBackground(new java.awt.Color(236, 240, 241));
        Btn_back.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_back.setText("ย้อนกลับ");
        Btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ผู้จำหน่ายวัสดุ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(431, 431, 431)
                                .addComponent(LinkVendorSale))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(357, 357, 357)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(417, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnchAll, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 756, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btEdit, javax.swing.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)
                            .addComponent(Addddd, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(179, 179, 179)
                                .addComponent(Addddd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(btDel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnchAll, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(219, 219, 219)))
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 26, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LinkVendorSale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AdddddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdddddActionPerformed
        VendorForm vendortable = new VendorForm();
        vendortable.setUpdateFlag(false);
        vendortable.openFrame();
       
    }//GEN-LAST:event_AdddddActionPerformed

    private void tbvendorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbvendorMouseClicked
        VendorFrame.enableButtonCheck();
    }//GEN-LAST:event_tbvendorMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
      // v1.setEnabled(true);
    }//GEN-LAST:event_formMouseClicked

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        VendorForm vf = new VendorForm();
        vf.setUpdateFlag(true);
        String vName = getCheckVendor_Name();
            clearRow();
            String sql="Select v_id from vendor where v_name = '" + vName.substring(0,vName.length()-2) + "'"; 
            System.out.println(sql);
            try (Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)) {
                while (rs.next()) { 
                    vf.setVId(rs.getString(1));
                    vf.openUpdateFrame();
                }
             
         } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btEditActionPerformed

    private void btDelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btDelActionPerformed
      //  deleteRecord();
       
      
      String r = getCheckVendor_Name();
        String[] sp = r.split(", ");
        if(r.length() > 1){
              r = r.substring(0, r.length()-2);
              
              int YesOrNo = JOptionPane.showConfirmDialog(null,"ลบข้อมูลทั้งหมดจำนวน " + sp.length + " แถว","คำเตือนในการลบ", JOptionPane.YES_NO_OPTION);
                if(YesOrNo == JOptionPane.YES_NO_OPTION){
                  for (String sp1 : sp) {
                      deleteData(sp1);
                  }
                    showDataRecord();
                    enableButtonCheck();
                    JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อยแล้ว ");
         
                }
       
        } 
      
    }//GEN-LAST:event_btDelActionPerformed

    private void LinkVendorSaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LinkVendorSaleActionPerformed
                VendorSaleTable vs = new VendorSaleTable();
                String r = getCheckVendor_Name();
                String[] s = r.split(", ");
                String sql="Select V_ID from vendor where V_NAME = '" + s[0] + "'"; 
            try (Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)) {
                while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                    vs.setVendorId(rs.getString(1));
                }
             
         } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
                vs.openVendorSaleFrame();
                VendorFrame.setVisible(false);
    }//GEN-LAST:event_LinkVendorSaleActionPerformed

    private void btnchAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchAllActionPerformed
        if(btnchAll.getText().equals("เลือกทั้งหมด")){
            for(int i=0; i<tbvendor.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            btnchAll.setText("ยกเลิกการเลือก");
            btEdit.setEnabled(false);
            btDel.setEnabled(true);
            
        }else {
            for(int i=0; i<tbvendor.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            btnchAll.setText("เลือกทั้งหมด");
            btDel.setEnabled(false);
           
            
        }
        
      //  enableButtonCheck();
                      
    }//GEN-LAST:event_btnchAllActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                new MainFrame().setVisible(true);
                VendorFrame.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_backActionPerformed
                new MaterialMenu().setVisible(true);
                VendorFrame.setVisible(false);
    }//GEN-LAST:event_Btn_backActionPerformed
    
    
    
    public String getCheckVendor_Name(){
        
        String vendor_name = "";
        
        for(int i=0; i<tbvendor.getRowCount(); i++){
            
            if(Boolean.valueOf(tbvendor.getValueAt(i, 0).toString()))
                vendor_name += model.getValueAt(i, 2).toString() + ", "; 
        }
        
        return vendor_name;
        
    }
    public void deleteData(String v_name){
           
   
            String sql = "delete from vendor where V_NAME = '" + v_name + "'";
       
            try{    Connection conn = Gui_db.getConnection();
                    Statement stmt  = conn.createStatement();
                    stmt.executeUpdate(sql);      
                              
                          
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
                              
  
    }
    
    public void enableButtonCheck(){
        
           
        String check = getCheckRow();
        String[] s = check.split(", ");
        
        if(tbvendor.getRowCount() > 0)
            btnchAll.setEnabled(true);
        else
            btnchAll.setEnabled(false);
       
        
        
        
        if (s.length == 1 && !s[0].equals(" ")) {
            btEdit.setEnabled(true);
            btDel.setEnabled(true);
            LinkVendorSale.setEnabled(true);
            btnchAll.setText("ยกเลิกการเลือก");
            
        }
        
        else if (s.length == 1) {
            btEdit.setEnabled(false);
            btDel.setEnabled(false);
            LinkVendorSale.setEnabled(false);
            btnchAll.setText("เลือกทั้งหมด");
         
        }
        
        else {
            btEdit.setEnabled(false);
            btDel.setEnabled(true);
            LinkVendorSale.setEnabled(false);
            
        } 
        
    }
    
    
    
     public void showDataRecord() { //เม็ดตอด 
         
            clearRow();
            String sql="Select * from vendor"; 
            try (Connection conn = Gui_db.getConnection();
                Statement stmt  = conn.createStatement();
                ResultSet rs    = stmt.executeQuery(sql)) {
                int row=0;//ควบคุมแถวแถว
                while (rs.next()) { //ก็ดูว่ามีอีกไหม ถ้ามีก็เพิ่ม..    
                    model.addRow(data);//เพิ่มแถว
                    model.setValueAt(false,row,0); //คอลัมที่ 0 (แรก) 
                  //  model.setValueAt(row +1, row, 1); //คอลัมที 1 (สอง)
                   model.setValueAt(rs.getString(1),row,1);
                  model.setValueAt(rs.getString(2),row,2); //คอลัมที 2 (สาม) 
                    model.setValueAt(rs.getString(3),row,3); //คอลัมที ... ก็ว่ากันไป
                    model.setValueAt(rs.getString(4),row,4);
                    model.setValueAt(rs.getString(5),row,5);
                    
                    row++;
                }
             
         } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                  
    }
     
     
       public String getCheckRow(){
        
        String row = " ";
        
        for(int i=0; i<tbvendor.getRowCount(); i++){
            
            if(Boolean.valueOf(tbvendor.getValueAt(i, 0).toString()))
                row += model.getValueAt(i, 1).toString() + ", ";

        }
        
        return row;
        
        
       
    }
       
     public int getNumRow(){
        int row=0;
        String sql = "SELECT * FROM vendor Order by V_ID DESC";
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
    public void clearRow(){ //การลบแถวทั้งหมด
        int row = model.getRowCount()-1;
        while (row>-1) {
            model.removeRow(row);
            row--;
            
        }
    }
    public void callClearRow(){
        VendorFrame.clearRow();
        
    }
     
    public void callShowDataRecord(){
        VendorFrame.showDataRecord();
        
    }
    
    public void callEnableButtonCheck() {
        VendorFrame.enableButtonCheck();
    }
    
    
   
       
    
   /* public void updateRecord(){
         String ID        = v1.getText();
         String NAME      = v2.getText();
         String PHONE     = v3.getText();
         String ADRESS    = v4.getText();
         String CONTRACT  = v5.getText();
        String sql = "update tbvendor"
                + "set V_NAME='"+ NAME+"',V_PHONE='"+PHONE+"',V_ADDRESS='"+ADRESS+"',V_CONTACT='"+CONTRACT+"'" 
                +"WHERE V_ID='"+ID+"'";
                
        try {
            Connection c=Database01.getConnection();
            Statement stm=c.createStatement();
            if(stm.executeUpdate(sql)!=-1){
                JOptionPane.showMessageDialog(this,"อัพเดตข้อมูลเรียบร้อย");
                showDataRecord();
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 
    
    
  */  
    
    
     
    
    public String checkBox(){
        String checkRow="";
        for(int i=0;i<tbvendor.getRowCount();i++){
            if(Boolean.valueOf(tbvendor.getValueAt(i, 0).toString())){
            
                checkRow += tbvendor.getValueAt(i, 2).toString() + " ";
                
                       
        }
        }return checkRow;
    }
    
 public void deleteRecord(){
       // String checkRow;
       this.checkBox();
       
       
        //String sql = "delete from vendor where " + "V_NAME  = '"
                  //   + checkBox()+ "' ";
              
         
         String sql = "select V_Name "
                 + "from vendor "
                 + "where V_NAME in (SELECT STATEMENT)";
                 
        try {
             Connection c=Gui_db.getConnection();
             Statement stm=c.createStatement();
             //stm.executeUpdate(sql);
            // System.out.println(""+stm);
             if(stm.executeUpdate(sql)!=-1){
                JOptionPane.showMessageDialog(this,"ลบข้อมูลเรียบร้อย");
                showDataRecord();
                            

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    } 
 
 
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addddd;
    private javax.swing.JButton Btn_back;
    private javax.swing.JButton LinkVendorSale;
    private javax.swing.JButton btDel;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btnchAll;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbvendor;
    // End of variables declaration//GEN-END:variables

    

    
}
