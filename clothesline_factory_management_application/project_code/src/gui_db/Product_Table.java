
package gui_db;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class Product_Table extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Object[]data = new Object[0];
   
     private static Product_Table pdt = new Product_Table();
    
    
    
    public Product_Table() {
        initComponents();
        model = (DefaultTableModel)productTable.getModel(); 
        showRecord();
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addbuton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        productTable = new javax.swing.JTable();
        checkAllButton = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        btn_MainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(174, 168, 211));

        addbuton.setBackground(new java.awt.Color(236, 240, 241));
        addbuton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        addbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        addbuton.setText(" เพิ่ม");
        addbuton.setAlignmentX(0.5F);
        addbuton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbutonActionPerformed(evt);
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
        DeleteBTN.setText("ลบ");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(236, 240, 241));
        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("สินค้า ");

        productTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "ชื่อสินค้า", "รายละเอียด", "ราคาขายต่อชิ้น", "ต้นทุนต่อชิ้น", "จำนวนคงเหลือ", "จำนวนต่ำสุด"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        productTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        productTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                productTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(productTable);
        if (productTable.getColumnModel().getColumnCount() > 0) {
            productTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            productTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            productTable.getColumnModel().getColumn(2).setPreferredWidth(200);
            productTable.getColumnModel().getColumn(3).setPreferredWidth(250);
            productTable.getColumnModel().getColumn(4).setPreferredWidth(110);
            productTable.getColumnModel().getColumn(6).setPreferredWidth(110);
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

        btn_back.setBackground(new java.awt.Color(236, 240, 241));
        btn_back.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btn_back.setText("ย้อนกลับ");
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });

        btn_MainMenu.setBackground(new java.awt.Color(236, 240, 241));
        btn_MainMenu.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btn_MainMenu.setText("เมนูหลัก");
        btn_MainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_back)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(581, 581, 581))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_MainMenu)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(addbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(DeleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(35, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(addbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(187, 187, 187)))
                .addComponent(btn_MainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(81, Short.MAX_VALUE))
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
      public void openFrame() {
    
        pdt.clearRow();
        pdt.showRecord();
        pdt.enableButtonCheck();
        pdt.setVisible(true);
    }
    
    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Product_ManufactureMenu().setVisible(true);
        pdt.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void addbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutonActionPerformed
       Product_Form pd = new Product_Form();
       pd.openFrame();
       pd.setUpddateFlag(false);           
    }//GEN-LAST:event_addbutonActionPerformed

    private void productTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_productTableMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
        Product_Form PF = new Product_Form();
     
        String checkName = getCheckName();
        String[] sp = checkName.split(", ");
        String sql = "select  PROD_DESCRIPT, PROD_SALE_PRICE, PROD_AMOUNT from product WHERE PROD_NAME = " + s[0]+ "";
     //  System.out.print(sql); //เอาไว้ดู
 
        try(Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()){
                //s[0] = ตัวที่ถูกติ๊กมันเป็นชื่อ(productname)
                PF.setUpdateForm(sp[0], rs.getString(1), rs.getString(2),rs.getString(3));
                PF.setUpddateFlag(true);
            }
            
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
         
    }//GEN-LAST:event_editButtonActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split("', ");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        
        if(reply == JOptionPane.YES_OPTION){
          String sql =  "delete  from product where PROD_NAME in ("+ checkRow +");";
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

    private void btn_MainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MainMenuActionPerformed
        new MainFrame().setVisible(true);
        pdt.setVisible(false);
    }//GEN-LAST:event_btn_MainMenuActionPerformed

    
    public String getCheckRow(){
        String checkRow = ""; 
        for(int i=0; i<productTable.getRowCount(); i++){
            if(Boolean.valueOf(productTable.getValueAt(i, 0).toString())){
                checkRow += "'" + productTable.getValueAt(i,2).toString()+ "', ";
                
            }
        }
        return checkRow.substring(0, checkRow.length()-2);
    }
    
    
    
    public String getCheckName(){
        String checkRow = ""; 
        for(int i=0; i<productTable.getRowCount(); i++){
            if(Boolean.valueOf(productTable.getValueAt(i, 0).toString())){
                checkRow +=  productTable.getValueAt(i,2).toString()+ ", ";
                
            }
        }
        return checkRow;
    }
   
    public void showRecord(){
            String sql = "SELECT PROD_NAME, PROD_DESCRIPT,PROD_SALE_PRICE, PROD_CAPITAL_COST, PROD_AMOUNT, PROD_MIN " +
                     "FROM product";
        
        try (Connection conn = Gui_db.getConnection();
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)) {
           int row = 0;
            // loop through the result set
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false,row, 0);
                model.setValueAt(row+1,row, 1);
                model.setValueAt(rs.getString(1),row, 2);
                model.setValueAt(rs.getString(2),row, 3);
                model.setValueAt(rs.getString(3),row, 4);
                model.setValueAt(rs.getString(4),row, 5);
                model.setValueAt(rs.getString(5),row, 6);
                model.setValueAt(rs.getString(6),row, 7);
               
                
                    row++;
            }
        }
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            }
        }
    
    public void clearRow(){
        
        int row = model.getRowCount()-1;
        
        while(row>-1){
            model.removeRow(row);
            row--;
            
        }
    }
    
    public void enableButtonCheck(){
        String check = getCheckName();
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
       pdt.showRecord();
    }
    
    public void callClearRow(){
       pdt.clearRow();
    }
    
    public void callEnableButtonCheck(){
       pdt.enableButtonCheck();
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JButton addbuton;
    private javax.swing.JButton btn_MainMenu;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable productTable;
    // End of variables declaration//GEN-END:variables
}
