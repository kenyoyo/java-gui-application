/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import com.toedter.calendar.JTextFieldDateEditor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author KAZDO
 */
public class BringMaterialForm extends javax.swing.JFrame {
    private static BringMaterialForm INSERT_FRAME = new BringMaterialForm();
    private static BringMaterialForm UPDATE_FRAME = new BringMaterialForm();
    private static String brId;
    private static boolean updateFlag = false;
    DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
    /**
     * Creates new form OrderProductForm
     */
    public BringMaterialForm() {
        initComponents();
        setSelectedComponent();
    }
    
    public void setUpdateForm(Date date, Time time, String empName, String brId) {
        JTextFieldDateEditor editor = (JTextFieldDateEditor) UPDATE_FRAME.bringMatDatePicker.getDateEditor();
        editor.setEditable(false);
        this.brId = brId;
        UPDATE_FRAME.titleLabel.setText("แก้ไขข้อมูลการเบิกวัสดุ");
        UPDATE_FRAME.bringMatDatePicker.setDate(date);
        UPDATE_FRAME.employeeCbb.setSelectedItem(empName);
        UPDATE_FRAME.bringMatTimePicker.setValue(time);
        UPDATE_FRAME.setVisible(true);
    }
    
    public void setUpdateFlag(boolean value) {
        UPDATE_FRAME.updateFlag = value;
    }
    
    public void openInsertFrame() {
        JTextFieldDateEditor editor = (JTextFieldDateEditor) INSERT_FRAME.bringMatDatePicker.getDateEditor();
        editor.setEditable(false);
        JFormattedTextField tf = ((JSpinner.DefaultEditor)INSERT_FRAME.bringMatTimePicker.getEditor()).getTextField();
        tf.setEditable(false);
        INSERT_FRAME.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        bringMatTimePicker = new javax.swing.JSpinner(sm);
        jLabel2 = new javax.swing.JLabel();
        employeeCbb = new javax.swing.JComboBox<>();
        bringMatDatePicker = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        submitBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(102, 204, 153));

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("เวลา");

        JSpinner.DateEditor de = new JSpinner.DateEditor(bringMatTimePicker, "HH:mm:ss");
        bringMatTimePicker.setEditor(de);
        bringMatTimePicker.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("พนักงาน");

        employeeCbb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        employeeCbb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        bringMatDatePicker.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        bringMatDatePicker.setMaxSelectableDate(new java.util.Date(253370743301000L));
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        bringMatDatePicker.setDate(c.getTime());

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("วันที่");

        titleLabel.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        titleLabel.setText("เพิ่มข้อมูลการเบิกวัสดุ");

        submitBtn.setBackground(new java.awt.Color(236, 240, 241));
        submitBtn.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        submitBtn.setText("บันทึก");
        submitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(employeeCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bringMatTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(titleLabel)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(bringMatDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(104, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bringMatDatePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bringMatTimePicker, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(employeeCbb, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(submitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
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

    private void submitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitBtnActionPerformed
        if(updateFlag) {
            editData();
        }
        else
            insertData();
    }//GEN-LAST:event_submitBtnActionPerformed
    
    public void insertData() {
        Date time = (Date) bringMatTimePicker.getValue();
        Date date = bringMatDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        String reportDate = df.format(date);
        String reportTime = tf.format(time);
        String employee = employeeCbb.getSelectedItem().toString();
        String[] splitName = employee.split(" ");
        String sql = "insert into bring_material(BR_COST,BR_DATE_TIME,EMP_ID,MAFAC_ID)\n" +
                     "value(0,'" + reportDate + " " + reportTime + "', "
                     + "(select EMP_ID from employee "
                     + "where EMP_FNAME = '" + splitName[0] + "' and EMP_LNAME = '" + splitName[1] +"'),"
                     + "(select MAFAC_ID from manufacturing where MAFAC_DATE = '" + reportDate + "'));";
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        BringMaterialTable bmt = new BringMaterialTable();
        bmt.callClearRow();
        bmt.callShowDataRecord();
        bmt.callEnableButtonCheck();
        JOptionPane.showMessageDialog(null, "เพิ่มข้อมูลเรียบร้อยแล้ว");
        clearTextBox();
    }
    
    public void editData() {
        Date time = (Date) bringMatTimePicker.getValue();
        Date date = bringMatDatePicker.getDate();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        DateFormat tf = new SimpleDateFormat("HH:mm:ss");
        String reportDate = df.format(date);
        String reportTime = tf.format(time);
        String employee = employeeCbb.getSelectedItem().toString();
        String[] splitName = employee.split(" ");
        String sql = "UPDATE bring_material " + 
                     "SET BR_DATE_TIME = '" + reportDate + " " + reportTime + "', "
                     + "OMANU_ID = (select OMANU_ID from manufacturing where MAFAC_DATE = '" + reportDate + "'), "
                     + "EMP_ID = (select EMP_ID from employee "
                     + "where EMP_FNAME = '" + splitName[0] + "' and EMP_LNAME = '" + splitName[1] +"') " 
                     + "where BR_ID = " + brId;
            try {
                Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                stmt.executeUpdate(sql);
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        BringMaterialTable bmt = new BringMaterialTable();
        bmt.callClearRow();
        bmt.callShowDataRecord();
        JOptionPane.showMessageDialog(null, "แก้ไขข้อมูลเรียบร้อยแล้ว");
        UPDATE_FRAME.dispose();
    }
    
    public void clearTextBox() {
        
        employeeCbb.setSelectedIndex(0);
    }
    
    private void setSelectedComponent() {
        String sql = "select EMP_FNAME, EMP_LNAME from employee";
            try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            // loop through the result set
            while (rs.next()) {
                cbModel.addElement(rs.getString(1) + " " + rs.getString(2));
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }
        employeeCbb.setModel(cbModel);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bringMatDatePicker;
    private javax.swing.JSpinner bringMatTimePicker;
    private javax.swing.JComboBox<String> employeeCbb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton submitBtn;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
