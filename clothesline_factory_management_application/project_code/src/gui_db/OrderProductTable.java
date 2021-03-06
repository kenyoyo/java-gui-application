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
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author KAZDO
 */
public class OrderProductTable extends javax.swing.JFrame {
    private static OrderProductTable OPT_FRAME = new OrderProductTable();
    private static String customerId = "";
    private String empName = "";
    private static String startDate = "";
    private static String finishDate = "";
    private String billType = "";
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    
    public OrderProductTable() {
        initComponents();
        model = (DefaultTableModel) poTable.getModel();
    }
    
    public void openFrame() {
        String cusName = getCusName();
        OPT_FRAME.customerLabel.setText(cusName);
        OPT_FRAME.clearRow();
        OPT_FRAME.showDataRecord();
        OPT_FRAME.enableButtonCheck();
        OPT_FRAME.setVisible(true);
    }
    
    public void openSeacrh() {
        OPT_FRAME.clearRow();
        OPT_FRAME.showSearch();
        OPT_FRAME.setVisible(true);
    }
    
    public void setCustomerId(String id) {
        customerId = id;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        poTable = new javax.swing.JTable();
        checkAllButton = new javax.swing.JButton();
        MainMenuButton = new javax.swing.JButton();
        instanceManageButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        customerLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_search = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        poInsertButton = new javax.swing.JButton();
        poEditButton = new javax.swing.JButton();
        poDeleteButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(189, 195, 199));

        poTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        poTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "หมายเลขออเดอร์", "ค่าวางมัดจำ", "ประเภทบิล", "วันที่ออเดอร์", "พนักงานรับออเดอร์"
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
        poTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        poTable.getTableHeader().setReorderingAllowed(false);
        poTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                poTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(poTable);
        if (poTable.getColumnModel().getColumnCount() > 0) {
            poTable.getColumnModel().getColumn(0).setResizable(false);
            poTable.getColumnModel().getColumn(0).setPreferredWidth(55);
            poTable.getColumnModel().getColumn(1).setResizable(false);
            poTable.getColumnModel().getColumn(1).setPreferredWidth(55);
            poTable.getColumnModel().getColumn(2).setResizable(false);
            poTable.getColumnModel().getColumn(2).setPreferredWidth(135);
            poTable.getColumnModel().getColumn(3).setResizable(false);
            poTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            poTable.getColumnModel().getColumn(4).setResizable(false);
            poTable.getColumnModel().getColumn(4).setPreferredWidth(110);
            poTable.getColumnModel().getColumn(5).setResizable(false);
            poTable.getColumnModel().getColumn(5).setPreferredWidth(120);
            poTable.getColumnModel().getColumn(6).setResizable(false);
            poTable.getColumnModel().getColumn(6).setPreferredWidth(200);
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

        MainMenuButton.setBackground(new java.awt.Color(236, 240, 241));
        MainMenuButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        MainMenuButton.setText("เมนูหลัก");
        MainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MainMenuButtonActionPerformed(evt);
            }
        });

        instanceManageButton.setBackground(new java.awt.Color(236, 240, 241));
        instanceManageButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        instanceManageButton.setText("จัดการงวดสินค้า");
        instanceManageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                instanceManageButtonActionPerformed(evt);
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

        customerLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        customerLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerLabel.setText("ชื่อลูกค้า");

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ออเดอร์สินค้า");

        btn_search.setBackground(new java.awt.Color(236, 240, 241));
        btn_search.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        btn_search.setText("ระบุเงื่อนไข");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        btn_reset.setBackground(new java.awt.Color(236, 240, 241));
        btn_reset.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        btn_reset.setText("รีเซ็ต");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(189, 195, 199));

        jPanel2.setBackground(new java.awt.Color(189, 195, 199));

        poInsertButton.setBackground(new java.awt.Color(236, 240, 241));
        poInsertButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        poInsertButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/add (1).png"))); // NOI18N
        poInsertButton.setText(" เพิ่ม");
        poInsertButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poInsertButtonActionPerformed(evt);
            }
        });

        poEditButton.setBackground(new java.awt.Color(236, 240, 241));
        poEditButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        poEditButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/tools.png"))); // NOI18N
        poEditButton.setText("แก้ไข");
        poEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poEditButtonActionPerformed(evt);
            }
        });

        poDeleteButton.setBackground(new java.awt.Color(236, 240, 241));
        poDeleteButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        poDeleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/delete (1).png"))); // NOI18N
        poDeleteButton.setText(" ลบ");
        poDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                poDeleteButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(poInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poEditButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(poDeleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(poInsertButton, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(poEditButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(poDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(364, 364, 364)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 21, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btn_reset)
                                .addGap(9, 9, 9))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(36, 36, 36)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(414, 414, 414)
                        .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(501, 501, 501)
                        .addComponent(instanceManageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(175, 175, 175))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_reset, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18))))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(customerLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(instanceManageButton, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(MainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void poInsertButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poInsertButtonActionPerformed
        OrderProductForm OF = new OrderProductForm();
        OF.setUpdateFlag(false);
        OF.setCusId(customerId);
        OF.openInsertFrame();
    }//GEN-LAST:event_poInsertButtonActionPerformed

    private void poDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poDeleteButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
            checkRow = checkRow.substring(0, checkRow.length()-2);
            int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length +" แถว?", 
                                                      "แจ้งเตือน", JOptionPane.YES_NO_OPTION);
            if(reply == JOptionPane.YES_OPTION) {
                for(int i = 0; i<s.length; i++)
                    deleteData(s[i]);
                clearRow();
                showDataRecord();
                enableButtonCheck();
                JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");
            }
    }//GEN-LAST:event_poDeleteButtonActionPerformed

    private void poEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_poEditButtonActionPerformed
        String checkRow = getCheckRow();
        String[] s = checkRow.split(", ");
        OrderProductForm OPF = new OrderProductForm();
        String sql = "select PORDER_DOWN_PAYMENT, PORDER_DATE from product_order WHERE PORDER_ID = " + s[0];
        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date = format.parse(rs.getString(2));
                   
                OPF.setUpdateForm(s[0], rs.getString(1), date, empName);
                OPF.setUpdateFlag(true);
            }
            
        } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(OrderProductTable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_poEditButtonActionPerformed

    private void poTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_poTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_poTableMouseClicked

    private void MainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MainMenuButtonActionPerformed
        new MainFrame().setVisible(true);
        OPT_FRAME.dispose();
    }//GEN-LAST:event_MainMenuButtonActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if(checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for(int i=0; i<poTable.getRowCount(); i++)
                model.setValueAt(true, i, 0);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for(int i=0; i<poTable.getRowCount(); i++)
                model.setValueAt(false, i, 0);
            checkAllButton.setText("เลือกทั้งหมด");
        }

        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void instanceManageButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_instanceManageButtonActionPerformed
        String check = getCheckRow();
        String[] s = check.split(", ");
        InstanceProductTable IPT = new InstanceProductTable();
        InstanceProductForm IPF = new InstanceProductForm();
        
        IPT.sentBillTypeName(billType);
        IPF.sentBillTypeName(billType);
        
        IPT.setOrderProductId(s[0]);
        IPT.openFrame();
        OPT_FRAME.dispose();
    }//GEN-LAST:event_instanceManageButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        CustomerTable ct = new CustomerTable();
        ct.openFrame();
        OPT_FRAME.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        OPT_FRAME.openFrame();
    }//GEN-LAST:event_btn_resetActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
       Search_OrderProd SF = new Search_OrderProd();
        SF.openInsertFrame();
    }//GEN-LAST:event_btn_searchActionPerformed
     
    public void showDataRecord() {
            String sql = "select PORDER_ID, PORDER_DOWN_PAYMENT, PORDER_BILL_TYPE, PORDER_DATE, EMP_FNAME, EMP_LNAME " + 
                         "from product_order natural join employee where CUS_ID = "+ customerId +" order by PORDER_ID DESC;";
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            int row=0;
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row+1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                String convertToName = "";
                if(rs.getString(3).equals("1")){
                    convertToName = "บิลรายงวด";
                }else if(rs.getString(3).equals("2")){
                    convertToName = "บิลรวมงวด";
                }
    
                model.setValueAt(convertToName, row, 4);
                model.setValueAt(rs.getString(4), row, 5);
                model.setValueAt(rs.getString(5)+ " " +rs.getString(6),row, 6);
                
                row++;
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
    }
    
    public void showSearch() {
        String sql = "select PORDER_ID, PORDER_DOWN_PAYMENT, PORDER_BILL_TYPE, PORDER_DATE, EMP_FNAME, EMP_LNAME"
                + " from product_order natural join employee where PORDER_DATE >= '" + startDate + "' and PORDER_DATE <= '" + finishDate + "'"
                + " and CUS_ID = " + customerId + " order by PORDER_ID DESC;";
        System.out.print(sql);
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            int row = 0;
            // loop through the result set
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row+1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                String convertToName = "";
                if(rs.getString(3).equals("1")){
                    convertToName = "บิลรายงวด";
                }else if(rs.getString(3).equals("2")){
                    convertToName = "บิลรวมงวด";
                }
    
                model.setValueAt(convertToName, row, 4);
                model.setValueAt(rs.getString(4), row, 5);
                model.setValueAt(rs.getString(5)+ " " +rs.getString(6),row, 6);
                
                row++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

     public String setDate1(String date1) {
        return startDate = date1;
    }

    public String setDate2(String date2) {
        return finishDate = date2;
    }
    
    public void deleteData(String id) {
        String sql = "delete from product_order where PORDER_ID = " + id  ;
        
        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public String getCheckRow() {
        String checkRow="";
        for(int i=0; i<poTable.getRowCount(); i++) {
            if(Boolean.valueOf(poTable.getValueAt(i, 0).toString())) {
                checkRow += poTable.getValueAt(i, 2).toString() + ", ";
                empName = poTable.getValueAt(i, 5).toString();
                billType = poTable.getValueAt(i, 4).toString();
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
        if(poTable.getRowCount() > 0)
            checkAllButton.setEnabled(true);
        else
            checkAllButton.setEnabled(false);
        
        if (s.length == 1 && s[0].equals("")) {
            poEditButton.setEnabled(false);
            poDeleteButton.setEnabled(false);
            instanceManageButton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        }
        
        else if (s.length == 1) {
            poEditButton.setEnabled(true);
            poDeleteButton.setEnabled(true);
            instanceManageButton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        }
        
        else {
            poDeleteButton.setEnabled(true);
            poEditButton.setEnabled(false);
            instanceManageButton.setEnabled(false);
        }
    }
    
    public String getCusName() {
        String cusName = "";
        String sql = "select cus_name from customer where cus_id = " + customerId;
        try{   
                 Connection conn = Gui_db.getConnection();
                 Statement stmt  = conn.createStatement();
                 ResultSet rs = stmt.executeQuery(sql);
                 
                 while(rs.next()){
                    cusName = rs.getString(1);
                 }
                 
                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }
        return cusName;
    }
    
    public void callClearRow() {
        OPT_FRAME.clearRow();
    }
    
    public void callShowDataRecord() {
        OPT_FRAME.showDataRecord();
    }
    
    public void callEnableButtonCheck() {
        OPT_FRAME.enableButtonCheck();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MainMenuButton;
    private javax.swing.JButton backButton;
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JLabel customerLabel;
    private javax.swing.JButton instanceManageButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton poDeleteButton;
    private javax.swing.JButton poEditButton;
    private javax.swing.JButton poInsertButton;
    private javax.swing.JTable poTable;
    // End of variables declaration//GEN-END:variables

}