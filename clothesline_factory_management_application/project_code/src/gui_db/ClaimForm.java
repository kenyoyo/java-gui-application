/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author KAZDO
 */
public class ClaimForm extends javax.swing.JFrame {

    private static ClaimForm INSERT_FRAME = new ClaimForm();
    private static ClaimForm UPDATE_FRAME = new ClaimForm();
    private static boolean updateFlag = false;
    private static String updateC_Claim = "";
    private static String currentDeliDateCBB = "";
    private static String currentPorderID = "";
    //private static String updateId = "";
    //private static String orderProductId = "";

    private static String updatePORDER_ID = "";

    private static String updateINSERT_INSTANCE_DELI_DATE = "";

    //private static String updateUPDATE_INSTANCE_DELI_DATE = "";
    public ClaimForm() {
        initComponents();
    }

    public void setINSTANCE_DELI_DATE(String id) {
        INSERT_FRAME.updateINSERT_INSTANCE_DELI_DATE = id;
    }

    /*
    public void setUPDATE_INSTANCE_DELI_DATE(String deliDate){
        //UPDATE_FRAME.updateUPDATE_INSTANCE_DELI_DATE = deliDate;
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        
        
        
    } 
     */
    public void addInsertClaimCombobox(ArrayList<String> instance_deli_date, ArrayList<Integer> arrList, Boolean value, String insertPorderID) {
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        int porder_id = Integer.parseInt(insertPorderID);
        String getInstance_deli_date = "";
        Boolean found = false;
        if (value == true) {
            for (int i = 0; i < arrList.size(); i++) {
                if (porder_id == arrList.get(i)) {
                    getInstance_deli_date += "'" + instance_deli_date.get(i) + "', ";
                    found = true; //พบข้อมูล
                }
            }

            if (found == true) {  //พบข้อมูล

                String sql = "select INSTANCE_DELI_DATE from INSTANCE where PORDER_ID = " + porder_id
                        + " and INSTANCE_DELI_DATE not in(" + getInstance_deli_date.substring(0, getInstance_deli_date.length() - 2) + ");";
                System.out.println("true = " + sql);
                try {
                    Connection con = Gui_db.getConnection();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    int row = 0;
                    while (rs.next()) {

                        cbModel.addElement(rs.getString(1));

                        row++;
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }

                INSERT_FRAME.InstanceDeliDateCBB.setModel(cbModel);
                if (INSERT_FRAME.InstanceDeliDateCBB.getItemCount() == 0) {

                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลวันที่ส่งงวด");
                    INSERT_FRAME.porderTxt.setText("");
                }

            } else { //ไม่พบข้อมูล

                String sql = "select INSTANCE_DELI_DATE from INSTANCE where PORDER_ID = " + porder_id
                        + " and INSTANCE_DELI_DATE not in('');";
                System.out.println("true = " + sql);
                try {
                    Connection con = Gui_db.getConnection();
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery(sql);

                    int row = 0;
                    while (rs.next()) {

                        cbModel.addElement(rs.getString(1));

                        row++;
                    }

                } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
                }

                INSERT_FRAME.InstanceDeliDateCBB.setModel(cbModel);
                if (INSERT_FRAME.InstanceDeliDateCBB.getItemCount() == 0) {

                    JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลวันที่ส่งงวด");
                    INSERT_FRAME.porderTxt.setText("");
                }

            }

        } else if (value == false) {

            String sql = "select INSTANCE_DELI_DATE from INSTANCE where PORDER_ID = " + porder_id
                    + " and INSTANCE_DELI_DATE not in('" + getInstance_deli_date + "');";
            System.out.println("false = " + sql);
            try {
                Connection con = Gui_db.getConnection();
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                int row = 0;
                while (rs.next()) {

                    cbModel.addElement(rs.getString(1));

                    row++;
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

            INSERT_FRAME.InstanceDeliDateCBB.setModel(cbModel);
            if (INSERT_FRAME.InstanceDeliDateCBB.getItemCount() == 0) {

                JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลวันที่ส่งงวด");
                INSERT_FRAME.porderTxt.setText("");
            }

        }

    }

    public void addUpdateClaimComboBox(String porderID, String current_Instance_deli_date, String instance_deli_date) {

        String sql = "select INSTANCE_DELI_DATE from INSTANCE where PORDER_ID = " + porderID + " and INSTANCE_DELI_DATE not in(" + instance_deli_date + ");";
        currentDeliDateCBB = current_Instance_deli_date;
        currentPorderID = porderID;
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        System.out.println("addUpdateClaimComboBox " + sql);

        try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            int row = 0;
            while (rs.next()) {

                cbModel.addElement(rs.getString(1));
                //CF.setUpdateFlag(true);
                row++;
            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        UPDATE_FRAME.InstanceDeliDateCBB.setModel(cbModel);
        UPDATE_FRAME.InstanceDeliDateCBB.setSelectedItem(currentDeliDateCBB);
        System.out.println("current =  " + current_Instance_deli_date);
    }

    public void setUpdateForm(String porderID, String c_date, String c_status, String c_repair) throws ParseException {
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลงวด");
        UPDATE_FRAME.porderTxt.setText(porderID);
        //Date date = claimDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date date = df.parse(c_date);
        updateC_Claim = c_date;
        UPDATE_FRAME.claimDatePicker.setDate(date);
        UPDATE_FRAME.ClaimRepairCBB.setSelectedItem(c_repair);
        //set disable
        JTextFieldDateEditor editor = (JTextFieldDateEditor) UPDATE_FRAME.claimDatePicker.getDateEditor();
        editor.setEditable(false);

        int c_statusNumber = 0;
        switch (c_status) {
            case "รับเรื่อง":
                c_statusNumber = 1;
                break;
            case "รับของ":
                c_statusNumber = 2;
                break;
            case "ตรวจสอบ":
                c_statusNumber = 3;
                break;
            case "ส่งเคลม":
                c_statusNumber = 4;
                break;
            default:
                break;
        }
        UPDATE_FRAME.claimStatusCBB.setSelectedIndex(c_statusNumber - 1);
        UPDATE_FRAME.setVisible(true);

    }

    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }

    public void openInsertFrame() {

        INSERT_FRAME.setVisible(true);
        INSERT_FRAME.porderTxt.setText("");
        INSERT_FRAME.InstanceDeliDateCBB.removeAllItems();
        INSERT_FRAME.ClaimRepairCBB.removeItem("ดำเนินการเสร็จสมบูรณ์");
        JTextFieldDateEditor editor = (JTextFieldDateEditor) INSERT_FRAME.claimDatePicker.getDateEditor();
        editor.setEditable(false);

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
        titleLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        claimDatePicker = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        porderTxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        claimStatusCBB = new javax.swing.JComboBox<>();
        InstanceDeliDateCBB = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        ClaimRepairCBB = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(149, 165, 166));

        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setText("เพิ่มข้อมูลการเคลม");

        jPanel1.setBackground(new java.awt.Color(149, 165, 166));

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("*วันที่แจ้งเคลม");

        claimDatePicker.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        claimDatePicker.setMaxSelectableDate(new java.util.Date(253370743311000L));
        claimDatePicker.setMinSelectableDate(new java.util.Date(-62135791089000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        claimDatePicker.setDate(c.getTime());

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("*หมายเลขออเดอร์");

        porderTxt.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        porderTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                porderTxtActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("*วันที่ส่งงวด");

        jLabel4.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel4.setText("*ขั้นตอนการเคลม");

        claimStatusCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        claimStatusCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "รับเรื่อง", "รับของ", "ตรวจสอบ", "ส่งเคลม" }));

        InstanceDeliDateCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        jLabel5.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel5.setText("(กรอกหมายเลขออเดอร์และกด Enter)");

        ClaimRepairCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        ClaimRepairCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "กำลังดำเนินการ", "ดำเนินการเสร็จสมบูรณ์" }));

        jLabel10.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel10.setText("สถานะการเคลม");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ClaimRepairCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(claimStatusCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(claimDatePicker, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(porderTxt)
                    .addComponent(InstanceDeliDateCBB, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(67, 67, 67))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(porderTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(InstanceDeliDateCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claimDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(claimStatusCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ClaimRepairCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        submitBtn.setBackground(new java.awt.Color(218, 223, 225));
        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(154, 154, 154))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(203, 203, 203))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        ClaimTable ct = new ClaimTable();
        if (updateFlag) {
            editData();
            ct.callEnableButtonCheck();
        } else {
            insertData();
            ct.callEnableButtonCheck();
        }
    }//GEN-LAST:event_submitBtnActionPerformed


    private void porderTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_porderTxtActionPerformed
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        ClaimTable CT = new ClaimTable();

        if (updateFlag) { // ตอน edit data

            String porderID = UPDATE_FRAME.porderTxt.getText();

            if (porderID.equals("")) {

                UPDATE_FRAME.InstanceDeliDateCBB.removeAllItems();
            } else {
                if (!isNumeric(porderID)) {
                    JOptionPane.showMessageDialog(null, "กรุณาใส่หมายเลขออเดอร์ให้ถูกต้อง");
                } else {

                    CT.setPORDER(porderID, true);
                    String sql = "select INSTANCE_DELI_DATE from INSTANCE where PORDER_ID = " + porderID + " and INSTANCE_DELI_DATE not in(" + updateINSERT_INSTANCE_DELI_DATE + ");";
                    System.out.println("sql inUpdateFlag = " + sql);
                    try {
                        Connection conn = Gui_db.getConnection();
                        Statement stmt = conn.createStatement();
                        ResultSet rs = stmt.executeQuery(sql);

                        int row = 0;
                        while (rs.next()) {
                            cbModel.addElement(rs.getString(1));
                            row++;
                        }

                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }

                    UPDATE_FRAME.InstanceDeliDateCBB.setModel(cbModel);
                    UPDATE_FRAME.InstanceDeliDateCBB.setSelectedItem(currentDeliDateCBB);
                    if (UPDATE_FRAME.InstanceDeliDateCBB.getItemCount() == 0) {

                        JOptionPane.showMessageDialog(null, "ไม่พบข้อมูลวันที่ส่งงวด");
                        UPDATE_FRAME.porderTxt.setText("");
                    }
                }

            }

        } else { // ตอน insert 

            String porderID = INSERT_FRAME.porderTxt.getText();

            if (porderID.equals("")) {
                INSERT_FRAME.InstanceDeliDateCBB.removeAllItems();
            } else {
                if (!isNumeric(porderID)) {
                    JOptionPane.showMessageDialog(null, "กรุณาใส่ข้อมูลหมายเลขออเดอร์ให้ถูกต้อง");
                } else {

                    CT.setPORDER(porderID, false);

                    //CT.callTableContent();
                }

            }
        }


    }//GEN-LAST:event_porderTxtActionPerformed

    public void insertData() {
       
        String porder_id = INSERT_FRAME.porderTxt.getText();

        if (!isNumeric(porder_id)) {

            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล หมายเลขออเดอร์ให้ถูกต้อง");

        } else {
     
            String instanceDeliDateCBB = INSERT_FRAME.InstanceDeliDateCBB.getSelectedItem().toString();
            Date date = claimDatePicker.getDate();
            DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String claimDate = df.format(date);
            String claimStatus = claimStatusCBB.getSelectedItem().toString();
            String claimRepair = ClaimRepairCBB.getSelectedItem().toString();

            int cStatus = 0;
            switch (claimStatus) {
                case "รับเรื่อง":
                    cStatus = 1;
                    break;
                case "รับของ":
                    cStatus = 2;
                    break;
                case "ตรวจสอบ":
                    cStatus = 3;
                    break;
                case "ส่งเคลม":
                    cStatus = 4;
                    break;
                default:
                    break;
            }

            int cRepair = 0;
            switch (claimRepair) {
                case "กำลังดำเนินการ":
                    cRepair = 1;
                    break;
                case "ดำเนินการเสร็จสมบูรณ์":
                    cRepair = 2;
                    break;
                default:
                    break;

            }

            String sql = "select INSTANCE_ID from INSTANCE where PORDER_ID = " + porder_id + " AND INSTANCE_DELI_DATE = '" + instanceDeliDateCBB + "';";
            //System.out.println(sql);
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                int row = 0;
                while (rs.next()) {

                    String sql1 = "INSERT INTO CLAIM(C_COST, C_STATUS, C_DATE, C_REPAIR, INSTANCE_ID)\n"
                            + "VALUES(0.00, " + cStatus + ", '" + claimDate + "', " + cRepair + ", " + rs.getString(1) + ");";

                    try {
                        Connection conn1 = Gui_db.getConnection();
                        Statement stmt1 = conn1.createStatement();
                        stmt1.executeUpdate(sql1);

                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }
                    ClaimTable CT = new ClaimTable();
                    CT.callClearRow();
                    CT.callShowDataRecord();
                    CT.callEnableButtonCheck();
                    JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
                    clearTextBox();

                    row++;
                }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

    public void editData() {

        ClaimTable ct = new ClaimTable();
        String C_STATUS = UPDATE_FRAME.claimStatusCBB.getSelectedItem().toString();
        String PORDER_ID = UPDATE_FRAME.porderTxt.getText();
        String INSTANCE_DELI_DATE = UPDATE_FRAME.InstanceDeliDateCBB.getSelectedItem().toString();
        String claimRepair = ClaimRepairCBB.getSelectedItem().toString();

        Date date = claimDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        String C_DATE = df.format(date);

        System.out.println("c_date = " + C_DATE);

        if (!isNumeric(PORDER_ID)) {
            JOptionPane.showMessageDialog(null, "กรุณากรอกข้อมูล หมายเลขออเดอร์ให้ถูกต้อง");

        } else {

            int c_statusNumber = 0;
            switch (C_STATUS) {
                case "รับเรื่อง":
                    c_statusNumber = 1;
                    break;
                case "รับของ":
                    c_statusNumber = 2;
                    break;
                case "ตรวจสอบ":
                    c_statusNumber = 3;
                    break;
                case "ส่งเคลม":
                    c_statusNumber = 4;
                    break;
                default:
                    break;
            }

            int cRepair = 0;
            switch (claimRepair) {
                case "กำลังดำเนินการ":
                    cRepair = 1;
                    break;
                case "ดำเนินการเสร็จสมบูรณ์":
                    cRepair = 2;
                    break;
                default:
                    break;

            }

            //หา instance_id ที่จะทำการเปลี่ยน    rs.getString(1) คือ instance_id ตัวใหม่ที่ต้องการ update 
            //                               rs.getString(2) คือ instance_id ตัวเดิม เพื่อมากำหนดเงื่อนไขในการ update อีกทั้งหา C_ID ด้วย
            String sql = "SELECT (SELECT INSTANCE_ID from INSTANCE where PORDER_ID = " + PORDER_ID + " and INSTANCE_DELI_DATE = '" + INSTANCE_DELI_DATE + "'), "
                    + "(SELECT INSTANCE_ID from INSTANCE where PORDER_ID = " + currentPorderID + " and INSTANCE_DELI_DATE = '" + currentDeliDateCBB + "'), " +
                    "(SELECT C_ID FROM CLAIM WHERE INSTANCE_ID = (select INSTANCE_ID from INSTANCE where PORDER_ID = " + currentPorderID + " AND INSTANCE_DELI_DATE = '" + currentDeliDateCBB +"'))";
            System.out.println(sql);
           
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql);

                int row = 0;
                while (rs.next()) {
                    //System.out.println("claim_id -> " + rs.getString(3));
                    //System.out.println(rs.getString(1) + " " + rs.getString(2));
                    String sql1 = "UPDATE CLAIM "
                            + "SET C_STATUS = " + c_statusNumber + ", C_DATE = '" + C_DATE + "',  C_REPAIR  = " + cRepair + ", INSTANCE_ID = " + rs.getString(1) + " "
                            + "WHERE C_ID = (select C_ID where  INSTANCE_ID = " + rs.getString(2) + ") " + " and INSTANCE_ID = " + rs.getString(2) + ";";
                    System.out.println(sql1);
                  
                    try {
                        Connection conn1 = Gui_db.getConnection();
                        Statement stmt1 = conn1.createStatement();
                        stmt1.executeUpdate(sql1);
                        UPDATE_FRAME.updateClaimCost(Integer.parseInt(currentPorderID), Integer.parseInt(rs.getString(3)));
                    } catch (SQLException ex) {
                        System.out.println(ex.getMessage());
                    }

                    ct.callClearRow();
                    ct.callShowDataRecord();
                    JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
                    UPDATE_FRAME.dispose();

                }

                row++;
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }

        }

    }

    public void updateClaimCost(int porder_id, int claim_id) {

        String query = "{ call update_claim_repair_statusAndProduct_amount(?,?) }";

        try (Connection conn = Gui_db.getConnection();
                CallableStatement stmt = conn.prepareCall(query)) {
            stmt.setInt(1, porder_id);
            stmt.setInt(2, claim_id);
            stmt.executeUpdate();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

    }
    
    
    
    public void clearTextBox() {

        INSERT_FRAME.InstanceDeliDateCBB.removeItemAt(InstanceDeliDateCBB.getSelectedIndex());
        INSERT_FRAME.porderTxt.setText("");

    }

    public String getClaimID() {
        String PORDER_ID = UPDATE_FRAME.porderTxt.getText();
        String INSTANCE_DELI_DATE = UPDATE_FRAME.InstanceDeliDateCBB.getSelectedItem().toString();
        String getClaim_ID = "";
        String sql = "select C_ID from CLAIM where instance_id = (select instance_id from instance where PORDER_ID = " + PORDER_ID + " and INSTANCE_DELI_DATE = '" + INSTANCE_DELI_DATE + "');";

        try {
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {

                getClaim_ID += rs.getString(1);

            }

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }

        return getClaim_ID;
    }

    public static Boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ClaimRepairCBB;
    private javax.swing.JComboBox<String> InstanceDeliDateCBB;
    private com.toedter.calendar.JDateChooser claimDatePicker;
    private javax.swing.JComboBox<String> claimStatusCBB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField porderTxt;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

}
