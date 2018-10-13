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

public class Manufac_Table extends javax.swing.JFrame {

    private static String startDate = "";
    private static String finishDate = "";

    DefaultTableModel model = new DefaultTableModel();
    Object[] data = new Object[0];

    private static Manufac_Table mft = new Manufac_Table();

    public Manufac_Table() {
        initComponents();
        model = (DefaultTableModel) OrderProductTable.getModel();
        TableColumnModel tcm = OrderProductTable.getColumnModel();
        tcm.removeColumn(tcm.getColumn(8));
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderProductTable = new javax.swing.JTable();
        controlBotton = new javax.swing.JButton();
        checkAllButton = new javax.swing.JButton();
        btn_mainMenu = new javax.swing.JButton();
        btn_back = new javax.swing.JButton();
        addbuton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        DeleteBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchBotton = new javax.swing.JButton();
        resetButton = new javax.swing.JButton();

        jTextField1.setText("jTextField1");

        jToggleButton1.setText("jToggleButton1");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel3.setBackground(new java.awt.Color(220, 198, 224));

        OrderProductTable.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        OrderProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "เลือก", "ลำดับ", "วันออเดอร์", "ชื่อสินค้า", "จำนวนสั่งผลิต", "สถานะการผลิต", "ไม่ผ่าน QC", "ต้นทุนการผลิต", "OMANU_ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderProductTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        OrderProductTable.getTableHeader().setReorderingAllowed(false);
        OrderProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(OrderProductTable);
        if (OrderProductTable.getColumnModel().getColumnCount() > 0) {
            OrderProductTable.getColumnModel().getColumn(0).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            OrderProductTable.getColumnModel().getColumn(1).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(1).setPreferredWidth(50);
            OrderProductTable.getColumnModel().getColumn(2).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(2).setPreferredWidth(170);
            OrderProductTable.getColumnModel().getColumn(3).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(3).setPreferredWidth(170);
            OrderProductTable.getColumnModel().getColumn(4).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(4).setPreferredWidth(180);
            OrderProductTable.getColumnModel().getColumn(5).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(5).setPreferredWidth(170);
            OrderProductTable.getColumnModel().getColumn(6).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(6).setPreferredWidth(150);
            OrderProductTable.getColumnModel().getColumn(7).setResizable(false);
            OrderProductTable.getColumnModel().getColumn(7).setPreferredWidth(100);
            OrderProductTable.getColumnModel().getColumn(8).setResizable(false);
        }

        controlBotton.setBackground(new java.awt.Color(236, 240, 241));
        controlBotton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        controlBotton.setText("การผลิตรายวัน");
        controlBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                controlBottonActionPerformed(evt);
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

        btn_mainMenu.setBackground(new java.awt.Color(236, 240, 241));
        btn_mainMenu.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        btn_mainMenu.setText("เมนูหลัก");
        btn_mainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_mainMenuActionPerformed(evt);
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
        DeleteBTN.setText(" ลบ");
        DeleteBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ข้อมูลออร์เดอร์การผลิตสินค้า");

        searchBotton.setBackground(new java.awt.Color(236, 240, 241));
        searchBotton.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        searchBotton.setText("ระบุเงื่อนไข");
        searchBotton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBottonActionPerformed(evt);
            }
        });

        resetButton.setBackground(new java.awt.Color(236, 240, 241));
        resetButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        resetButton.setText("รีเซ็ต");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(controlBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(609, 609, 609))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(410, 410, 410)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1050, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(searchBotton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(resetButton)))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(addbuton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                            .addComponent(DeleteBTN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_back, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(checkAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(197, 197, 197)
                .addComponent(btn_mainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addbuton, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(DeleteBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(123, 123, 123)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(controlBotton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
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

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
        mft.callClearRow();
        mft.showRecord();
    }//GEN-LAST:event_resetButtonActionPerformed

    private void searchBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBottonActionPerformed
        Search_Manufacturing SF = new Search_Manufacturing();
        SF.openInsertFrame();
    }//GEN-LAST:event_searchBottonActionPerformed

    private void DeleteBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteBTNActionPerformed
        String checkId = getCheckId();
        String[] s = checkId.split(", ");
        int reply = JOptionPane.showConfirmDialog(null, "ลบข้อมูลทั้งหมดจำนวน " + s.length + " แถว?",
            "แจ้งเตือน", JOptionPane.YES_NO_OPTION);

        if (reply == JOptionPane.YES_OPTION) {
            String sql = "delete from order_manufacture where OMANU_ID in (" + checkId + ");";
            System.out.print(sql);

            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
            callClearRow();
            ShowData();
            enableButtonCheck();
            JOptionPane.showMessageDialog(this, "ลบข้อมูลเรียบร้อย");

        }
    }//GEN-LAST:event_DeleteBTNActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        Manufac_Form PF = new Manufac_Form();
        String id = getCheckId();

        String sql = "select PROD_NAME, OMANU_AMOUNT, OMANU_DATE from order_manufacture natural join product WHERE OMANU_ID = " + id;
        System.out.print(sql); //เอาไว้ดู

        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                //s[0] = ตัวที่ถูกติ๊กมันเป็นชื่อ(productname)
                DateFormat format = new SimpleDateFormat("yyyy-MM-dd");
                Date date1 = format.parse(rs.getString(3));

                PF.setComboBox();
                PF.setUpddateFlag(true);
                PF.setUpdateForm(id, rs.getString(1), rs.getString(2), date1);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } catch (ParseException ex) {
            Logger.getLogger(Manufac_Table.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void addbutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbutonActionPerformed
        Manufac_Form mff = new Manufac_Form();
        mff.setComboBox();
        mff.openInsertFrame();
        mff.setUpddateFlag(false);
    }//GEN-LAST:event_addbutonActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new Product_ManufactureMenu().setVisible(true);
        mft.setVisible(false);
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_mainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_mainMenuActionPerformed
        new MainFrame().setVisible(true);
        mft.setVisible(false);
    }//GEN-LAST:event_btn_mainMenuActionPerformed

    private void checkAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkAllButtonActionPerformed
        if (checkAllButton.getText().equals("เลือกทั้งหมด")) {
            for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
                model.setValueAt(true, i, 0);//กำหนดค่าให้กับแถวที่ i คอลัมที่ 0
            }
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
                model.setValueAt(false, i, 0);
            }
            checkAllButton.setText("เลือกทั้งหมด");
        }
        enableButtonCheck();
    }//GEN-LAST:event_checkAllButtonActionPerformed

    private void controlBottonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_controlBottonActionPerformed
        Mfturing_Table MFT = new Mfturing_Table();
        Mfturing_Form MFF = new Mfturing_Form();
        BringMatDetailTable bmdt = new BringMatDetailTable();
        BringMaterialDetailForm bmdf = new BringMaterialDetailForm();
        ReturnMatDetailTable rmdt = new ReturnMatDetailTable();
        ReturnMaterialDetailForm rmdf = new ReturnMaterialDetailForm();
        String omanuId = getCheckId();
        String productId = "";
        String sql = "SELECT PROD_ID from order_manufacture where OMANU_ID = " + getCheckId();

        try (Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql)) {
            // loop through the result set
            while (rs.next()) {
                productId = rs.getString(1);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        MFF.setProductId(productId);
        MFF.setOmanuId(omanuId);

        bmdt.setOmanuId(omanuId);
        bmdf.setOmanuId(omanuId);
        rmdt.setOmanuId(omanuId);
        rmdf.setOmanuId(omanuId);

        MFT.setOmanuId(omanuId);
        MFT.setProductId(productId);
        MFT.setTxtOrderAmount(getCheckAmount());
        MFT.setTxtProductName(getCheckName());
        MFT.openFrame();
        mft.setVisible(false);
    }//GEN-LAST:event_controlBottonActionPerformed

    private void OrderProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderProductTableMouseClicked
        enableButtonCheck();
    }//GEN-LAST:event_OrderProductTableMouseClicked
    public void openFrame() {
        mft.clearRow();
        mft.showRecord();
        mft.enableButtonCheck();
        mft.setVisible(true);
    }

    public void openSearchAllProductName() {
        mft.clearRow();
        mft.showSearchAllProName();
        mft.enableButtonCheck();
        mft.setVisible(true);
    }

    public void openSeachProductName(String prod_name) {
        mft.clearRow();
        mft.showSearchProName(prod_name);
        mft.enableButtonCheck();
        mft.setVisible(true);
    }


    public String getCheckAmount() {//
        String checkRow = "";
        for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
            if (Boolean.valueOf(OrderProductTable.getValueAt(i, 0).toString())) {//ตัวไหนที่จะถูกติ๊กก่อนแก้ไข
                checkRow += OrderProductTable.getValueAt(i, 4).toString() + ", ";//เอาค่าจากคอลัมที่ 2 ซึ่งเป็ยสตริงมาต่อใน cheak row

            }
        }

        if (checkRow.equals("")) {
            return "''";
        }

        return checkRow.substring(0, checkRow.length() - 2);
    }

    public String getCheckName() {
        String checkRow = "";
        for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
            if (Boolean.valueOf(OrderProductTable.getValueAt(i, 0).toString())) {
                checkRow += OrderProductTable.getValueAt(i, 3).toString() + ", ";
            }
        }
        if (checkRow.equals("")) {
            return "''";
        }

        return checkRow.substring(0, checkRow.length() - 2);
    }

    public String getStart() {
        String checkRow = "";
        for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
            if (Boolean.valueOf(OrderProductTable.getValueAt(i, 0).toString())) {
                checkRow += OrderProductTable.getValueAt(i, 4).toString() + ", ";

            }
        }
        return checkRow;
    }

    public String getFinish() {
        String checkRow = "";
        for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
            if (Boolean.valueOf(OrderProductTable.getValueAt(i, 0).toString())) {
                checkRow += OrderProductTable.getValueAt(i, 5).toString() + ", ";

            }
        }
        return checkRow;
    }

    public String getCheckId() {
        String checkRow = "";
        for (int i = 0; i < OrderProductTable.getRowCount(); i++) {
            if (Boolean.valueOf(OrderProductTable.getValueAt(i, 0).toString())) {
                checkRow += OrderProductTable.getModel().getValueAt(i, 8).toString() + ", ";
            }
        }
        System.out.println(checkRow);
        if (checkRow.equals("")) {
            return "''";
        }

        return checkRow.substring(0, checkRow.length() - 2);
    }

    public void showRecord() {
        String sql = "SELECT OMANU_DATE, PROD_NAME, OMANU_AMOUNT, OMANU_STATUS, OMANU_QC, OMANU_COST, OMANU_ID "
                + "FROM order_manufacture natural join PRODUCT order by OMANU_STATUS, OMANU_DATE desc";
        //System.out.print(sql);
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            int row = 0;
            // loop through the result set
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row + 1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                model.setValueAt(rs.getString(3), row, 4);
                if (rs.getString(4).equals("0")) {
                    model.setValueAt("อยู่ระหว่างการผลิต", row, 5);
                } else {
                    model.setValueAt("การผลิตเสร็จสิ้น", row, 5);
                }
                model.setValueAt(rs.getString(5), row, 6);
                model.setValueAt(rs.getString(6), row, 7);
                model.setValueAt(rs.getString(7), row, 8);
                row++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showSearchProName(String productName) {
        String sql = "select OMANU_DATE, PROD_NAME, OMANU_AMOUNT, OMANU_STATUS, OMANU_QC, OMANU_COST, OMANU_ID"
                + " from ORDER_MANUFACTURE natural join PRODUCT where OMANU_DATE >= '" + startDate + "' and"
                + " OMANU_DATE <= '" + finishDate + "' and PROD_NAME = '" + productName + "'"
                + " order by OMANU_STATUS, OMANU_DATE desc";

        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            int row = 0;
            // loop through the result set
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row + 1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                model.setValueAt(rs.getString(3), row, 4);
                if (rs.getString(4).equals("0")) {
                    model.setValueAt("อยู่ระหว่างการผลิต", row, 5);
                } else {
                    model.setValueAt("การผลิตเสร็จสิ้น", row, 5);
                }
                model.setValueAt(rs.getString(5), row, 6);
                model.setValueAt(rs.getString(6), row, 7);
                model.setValueAt(rs.getString(7), row, 8);

                row++;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void showSearchAllProName() {
        String sql = "select PROD_NAME, OMANU_AMOUNT, OMANU_DATE, OMANU_STATUS, OMANU_QC, OMANU_COST, OMANU_ID"
                + " from ORDER_MANUFACTURE NATURAL JOIN PRODUCT"
                + " where OMANU_DATE >= '" + startDate + "' and OMANU_DATE <= '" + finishDate + "'"
                + " order by OMANU_STATUS, OMANU_DATE desc";
        System.out.print(sql);
        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {
            int row = 0;
            // loop through the result set
            while (rs.next()) {
                model.addRow(data);
                model.setValueAt(false, row, 0);
                model.setValueAt(row + 1, row, 1);
                model.setValueAt(rs.getString(1), row, 2);
                model.setValueAt(rs.getString(2), row, 3);
                model.setValueAt(rs.getString(3), row, 4);
                if (rs.getString(4).equals("0")) {
                    model.setValueAt("อยู่ระหว่างการผลิต", row, 5);
                } else {
                    model.setValueAt("การผลิตเสร็จสิ้น", row, 5);
                }
                model.setValueAt(rs.getString(5), row, 6);
                model.setValueAt(rs.getString(6), row, 7);
                model.setValueAt(rs.getString(7), row, 8);

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

    public void clearRow() {

        int row = model.getRowCount() - 1;

        while (row > -1) {
            model.removeRow(row);
            row--;

        }
    }

    public void enableButtonCheck() {
        String check = getCheckName();
        String[] s = check.split(", ");      //เก็บชื่อสินค้าที่เราลบ ตัวนี้ออกไปแล้ว ,
        if (OrderProductTable.getRowCount() > 0) {
            checkAllButton.setEnabled(true);
            searchBotton.setEnabled(true);
        } else {
            checkAllButton.setEnabled(false);
            searchBotton.setEnabled(false);
        }

        if (s.length == 1 && s[0].equals("''")) {
            editButton.setEnabled(false);
            DeleteBTN.setEnabled(false);
            controlBotton.setEnabled(false);
            checkAllButton.setText("เลือกทั้งหมด");
        } else if (s.length == 1) {
            editButton.setEnabled(true);
            DeleteBTN.setEnabled(true);
            controlBotton.setEnabled(true);
            checkAllButton.setText("ยกเลิกการเลือก");
        } else {
            DeleteBTN.setEnabled(true);
            editButton.setEnabled(false);
            controlBotton.setEnabled(false);
        }
    }

    /*public String getProduct() {
        String proDuct = "";
        String sql = "select PROD_NAME from product where PROD_ID = " + productId;
        try {
            Connection conn = Gui_db.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                proDuct = rs.getString(1);
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return proDuct;
    }*/
    public void ShowData() {
        mft.showRecord();
    }

    public void callClearRow() {
        mft.clearRow();
    }

    public void callEnableButtonCheck() {
        mft.enableButtonCheck();
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteBTN;
    private javax.swing.JTable OrderProductTable;
    private javax.swing.JButton addbuton;
    private javax.swing.JButton btn_back;
    private javax.swing.JButton btn_mainMenu;
    private javax.swing.JButton checkAllButton;
    private javax.swing.JButton controlBotton;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JButton resetButton;
    private javax.swing.JButton searchBotton;
    // End of variables declaration//GEN-END:variables
}
