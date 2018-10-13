
package gui_db;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.TableColumnModel;
public class Mfturing_Table extends javax.swing.JFrame {
    DefaultTableModel model = new DefaultTableModel();
    Object[]data = new Object[0];
   
     private static Mfturing_Table mft = new Mfturing_Table();
     private static String OmanuId = "";
     private static String productId = "";
     
    public Mfturing_Table() {
        initComponents();
        model = (DefaultTableModel)MfturingTable.getModel();
        TableColumnModel tcm = MfturingTable.getColumnModel();
        tcm.removeColumn( tcm.getColumn(5) );
    }
    
    public void setTxtOrderAmount(String amount) {
        mft.Label_orderAmount.setText(amount);
    }
    
    public void setTxtProductName(String productName) {
        mft.Label_productName.setText(productName);
    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        addbuton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        MfturingTable = new javax.swing.JTable();
        Btn_returnMat = new javax.swing.JButton();
        Btn_bringMat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        Label_productName = new javax.swing.JLabel();
        Label_orderAmount = new javax.swing.JLabel();
        checkAllButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        btn_mainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(174, 168, 211));

        jPanel1.setBackground(new java.awt.Color(174, 168, 211));

        addbuton.setBackground(new java.awt.Color(236, 240, 241));
        addbuton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        addbuton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        addbuton.setText("เพิ่ม");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addbuton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DeleteBTN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(addbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        MfturingTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        MfturingTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "วันที่", "จำนวนที่ผลิตได้", "จำนวนสินค้าไม่ผ่าน QC", "MAFAC_ID"
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
        MfturingTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        MfturingTable.getTableHeader().setReorderingAllowed(false);
        MfturingTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MfturingTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(MfturingTable);
        if (MfturingTable.getColumnModel().getColumnCount() > 0) {
            MfturingTable.getColumnModel().getColumn(0).setResizable(false);
            MfturingTable.getColumnModel().getColumn(0).setPreferredWidth(75);
            MfturingTable.getColumnModel().getColumn(1).setResizable(false);
            MfturingTable.getColumnModel().getColumn(1).setPreferredWidth(75);
            MfturingTable.getColumnModel().getColumn(2).setResizable(false);
            MfturingTable.getColumnModel().getColumn(2).setPreferredWidth(170);
            MfturingTable.getColumnModel().getColumn(3).setResizable(false);
            MfturingTable.getColumnModel().getColumn(3).setPreferredWidth(180);
            MfturingTable.getColumnModel().getColumn(4).setResizable(false);
            MfturingTable.getColumnModel().getColumn(4).setPreferredWidth(170);
            MfturingTable.getColumnModel().getColumn(5).setResizable(false);
        }

        Btn_returnMat.setBackground(new java.awt.Color(236, 240, 241));
        Btn_returnMat.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_returnMat.setText("คืนวัสดุ");
        Btn_returnMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_returnMatActionPerformed(evt);
            }
        });

        Btn_bringMat.setBackground(new java.awt.Color(236, 240, 241));
        Btn_bringMat.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Btn_bringMat.setText("เบิกวัสดุ");
        Btn_bringMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_bringMatActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ข้อมูลการผลิตสินค้ารายวัน");

        Label_productName.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Label_productName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Label_productName.setText("ราวตากผ้าสีน้ำเงินไซต์เล็ก");

        Label_orderAmount.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        Label_orderAmount.setText("1000");

        checkAllButton.setBackground(new java.awt.Color(44, 62, 80));
        checkAllButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        checkAllButton.setForeground(new java.awt.Color(255, 255, 255));
        checkAllButton.setText("เลือกทั้งหมด");
        checkAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkAllButtonActionPerformed(evt);
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

        btn_mainMenu.setBackground(new java.awt.Color(236, 240, 241));
        btn_mainMenu.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btn_mainMenu.setText("เมนูหลัก");
        btn_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(387, 387, 387))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 676, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(435, 435, 435)
                                .addComponent(Label_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Label_orderAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(Btn_bringMat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(278, 278, 278)
                                .addComponent(Btn_returnMat, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(btn_mainMenu))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(282, 282, 282)
                        .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Label_productName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Label_orderAmount))
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 422, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Btn_bringMat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Btn_returnMat, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
    public void openFrame() {
        mft.clearRow();
        mft.showRecord();
        mft.enableButtonCheck();
        mft.setVisible(true);
    }
    //รับค่าจาก Manufactable
    public void setOmanuId(String pdn){
        OmanuId = pdn;
    }
    
    public void setProductId(String id) {
        productId = id;
    }
      
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
       Manufac_Table MT = new  Manufac_Table();
       MT.openFrame();
       mft.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutonActionPerformed
       Mfturing_Form mff = new Mfturing_Form ();      
       mff.setManuFacId(getCheckId());
       mff.openInsertFrame();
       mff.setUpddateFlag(false);
    }//GEN-LAST:event_addbutonActionPerformed

    private void MfturingTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MfturingTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_MfturingTableMouseClicked

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        String checkRow = getCheckId();
        String[] s = checkRow.split(", ");
        Mfturing_Form PF = new Mfturing_Form();
        PF.setManuFacId(checkRow);
        String checkName = getCheckName();
        String[] sp = checkName.split(", ");
        String sql = "select  MAFAC_DATE, MAFAC_AMOUNT, MAFAC_QC from manufacturing WHERE MAFAC_ID = " + checkRow;
        System.out.print(sql); //เอาไว้ดู
 
        try(Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)){
            
            while(rs.next()){
                //s[0] = ตัวที่ถูกติ๊กมันเป็นชื่อ(productname)
                
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = format.parse(rs.getString(1));
                
                
                PF.setUpddateFlag(true);
                PF.setUpdateForm(date1 , rs.getString(2), rs.getString(3));
            }
            
        }
        catch(SQLException ex){
            System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Mfturing_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }//GEN-LAST:event_editButtonActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        String checkRow = getCheckId();
        String[] s = checkRow.split(", ");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
        
        if(reply == JOptionPane.YES_OPTION){
            
            String sql = "select MAFAC_AMOUNT from manufacturing where MAFAC_ID in (" + checkRow + ")";
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            
            while (rs.next()) {
                String deleteAmount = "-"+rs.getString(1);
                
                sql = "{ call update_product_amount(?,?) }";
 
                try (
                CallableStatement stmt1 = conn.prepareCall(sql)) {
 
                stmt1.setString(1, productId);
                stmt1.setInt(2, Integer.parseInt(deleteAmount));
                stmt1.executeQuery();
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            }
            
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            
          sql =  "delete from manufacturing where MAFAC_ID in ("+ checkRow +");";
          System.out.print(sql);
          
            try{
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                 stmt.executeUpdate(sql);            
                } catch(SQLException ex){
                  System.out.println(ex.getMessage());
        }
            sql = "{ call update_order_manufacture_status_qc(?) }";
 
                try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(sql)) {
 
                stmt.setString(1, OmanuId);
                stmt.executeQuery();
                } catch (SQLException ex) {
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
           for(int i=0; i<MfturingTable.getRowCount(); i++)
               model.setValueAt(true, i, 0);//กำหนดค่าให้กับแถวที่ i คอลัมที่ 0 
           checkAllButton.setText("ยกเลิกการเลือก");
       }else{
           for(int i=0; i<MfturingTable.getRowCount(); i++)
               model.setValueAt(false,i,0);
            checkAllButton.setText("เลือกทั้งหมด");             
       }
       enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void btn_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainMenuActionPerformed
        new MainFrame().setVisible(true);
        mft.setVisible(false);
    }//GEN-LAST:event_btn_mainMenuActionPerformed

    private void Btn_bringMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_bringMatActionPerformed
        BringMaterialTable bmt = new BringMaterialTable();
        BringMatDetailTable bmdt = new BringMatDetailTable();
        BringMaterialDetailForm bmdf = new BringMaterialDetailForm();
        String manufacId = getCheckId();
        bmdt.setMafacId(manufacId);
        bmdf.setManufacId(manufacId);
        bmt.setManufacId(manufacId);
        bmt.openFrame();
        dispose();
    }//GEN-LAST:event_Btn_bringMatActionPerformed

    private void Btn_returnMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_returnMatActionPerformed
        ReturnMaterialTable rmt = new ReturnMaterialTable();
        ReturnMatDetailTable rmdt = new ReturnMatDetailTable();
        ReturnMaterialDetailForm rmdf = new ReturnMaterialDetailForm();
        String manufacId = getCheckId();
        rmdt.setMafacId(manufacId);
        rmdf.setMafacId(manufacId);
        rmt.setManufacId(manufacId);
        rmt.openFrame();
        dispose();
    }//GEN-LAST:event_Btn_returnMatActionPerformed

    
    public String getCheckId(){//
        String checkRow = ""; 
        for(int i=0; i<MfturingTable.getRowCount(); i++){
            if(Boolean.valueOf(MfturingTable.getValueAt(i, 0).toString())){//ตัวไหนที่จะถูกติ๊กก่อนแก้ไข
                checkRow += MfturingTable.getModel().getValueAt(i, 5).toString()+ ", ";//เอาค่าจากคอลัมที่ 2 ซึ่งเป็นตริงมาต่อใน cheak row
            }
        }
        
        if(checkRow.equals(""))
            return "''";
        
        return checkRow.substring(0, checkRow.length()-2);
    }
    
    
    
    public String getCheckName(){
        String checkRow = ""; 
        for(int i=0; i<MfturingTable.getRowCount(); i++){
            if(Boolean.valueOf(MfturingTable.getValueAt(i, 0).toString())){
                checkRow +=  MfturingTable.getValueAt(i,2).toString()+ ", ";
                
            }
        }
        return checkRow;
    }
   
    public void showRecord(){
            String sql = "SELECT MAFAC_DATE, MAFAC_AMOUNT, MAFAC_QC, MAFAC_ID " +
                     "FROM manufacturing where OMANU_ID = " + OmanuId + " order by  MAFAC_DATE";
        //System.out.print(sql);
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
                model.setValueAt(rs.getString(4), row, 5);                
                
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
        if(MfturingTable.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if(s.length == 1 && s[0].equals("")){
            editButton.setEnabled(false);
            DeleteBTN.setEnabled(false);
            Btn_returnMat.setEnabled(false);
            Btn_bringMat.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");           
        }
        
        else if (s.length == 1){
            editButton.setEnabled(true);
            DeleteBTN.setEnabled(true);
            Btn_returnMat.setEnabled(true);
            Btn_bringMat.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก"); 
        }
        
        else{
            DeleteBTN.setEnabled(true);
            editButton.setEnabled(false);
            Btn_returnMat.setEnabled(false);
            Btn_bringMat.setEnabled(false);
        }
    }
   
    
    public void ShowData(){
       mft.showRecord();
    }
    
    public void callClearRow(){
       mft.clearRow();
    }
    
    public void callEnableButtonCheck(){
       mft.enableButtonCheck();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_bringMat;
    private javax.swing.JButton Btn_returnMat;
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JLabel Label_orderAmount;
    private javax.swing.JLabel Label_productName;
    private javax.swing.JTable MfturingTable;
    private javax.swing.JButton addbuton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btn_mainMenu;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
