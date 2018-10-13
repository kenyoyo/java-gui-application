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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Supawadee Tamo
 */
public class Search_Manufacturing extends javax.swing.JFrame {
private static boolean updateFlag = false;
   private static String setdate;
   private static Search_Manufacturing SF = new Search_Manufacturing ();
   private static Manufac_Table MT = new Manufac_Table();
    
    private String sql;

    /**
     * Creates new form Product_Form
     */
    public Search_Manufacturing() {
        initComponents();
    }
    
    public void SearchData(){
      //if(checkDataInForm()){
      Manufac_Table MF = new  Manufac_Table();
       Date date = dateStart.getDate();
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
      
       String reportDate1 = df.format(date);      
       date = dateFinish.getDate();
       String reportDate2 = df.format(date);            
       
       MF.setDate1(reportDate1);
       MF.setDate2(reportDate2);
       
      
           
    //}
    }
    
    public void setComboBox(){
         DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
         String sql = "select prod_name from product ;";
         System.out.print("ProductName = " + sql);
          cbModel.addElement("สินค้าทุกตัว");
          try (Connection conn = Gui_db.getConnection();
                Statement stmt = conn.createStatement();
                ResultSet rs = stmt.executeQuery(sql)) {

            int row=0;
            while (rs.next()) {
                
                cbModel.addElement(rs.getString(1));
            }
            
            } catch (SQLException ex) {
                    System.out.println(ex.getMessage());
            }      
          SF.proSearchList.setModel(cbModel);
    }
    
   
    
    public void openInsertFrame() {
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) SF.dateStart.getDateEditor();
        editor1.setEditable(false);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) SF.dateFinish.getDateEditor();
        editor2.setEditable(false);
        SF.setComboBox();
        SF.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addData = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        proSearchList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        dateFinish = new com.toedter.calendar.JDateChooser();
        productCapCostLb = new javax.swing.JLabel();
        commit = new javax.swing.JButton();
        dateStart = new com.toedter.calendar.JDateChooser();
        decriptionLb = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(241, 169, 160));

        addData.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        addData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addData.setText("การค้นหาข้อมูลตามช่วงเวลาการผลิต");

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        proSearchList.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        proSearchList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        proSearchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proSearchListActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel1.setText("สินค้า");

        dateFinish.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dateFinish.setMaxSelectableDate(new java.util.Date(253370743277000L));
        dateFinish.setMinSelectableDate(new java.util.Date(-62135791122000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateFinish.setDate(c.getTime());

        productCapCostLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productCapCostLb.setText("ถึง");

        commit.setBackground(new java.awt.Color(236, 240, 241));
        commit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        commit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/research.png"))); // NOI18N
        commit.setText("ค้นหา");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
            }
        });

        dateStart.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dateStart.setMaxSelectableDate(new java.util.Date(253370743295000L));
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateStart.setDate(c.getTime());

        decriptionLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        decriptionLb.setText("ตั้งแต่วันที่");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 408, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(proSearchList, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(productCapCostLb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(dateFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(commit)))
                .addContainerGap(72, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(addData)
                .addGap(61, 61, 61)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(proSearchList, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateStart, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decriptionLb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dateFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(productCapCostLb))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        Manufac_Table MT = new  Manufac_Table();
        MT.openFrame();
        SF.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void proSearchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proSearchListActionPerformed

    }//GEN-LAST:event_proSearchListActionPerformed

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
        Manufac_Table MF = new Manufac_Table();
        SearchData();
        if(proSearchList.getSelectedItem().toString().equals("สินค้าทุกตัว"))
        {

            MF.openSearchAllProductName();
        }
        else{

            MF.openSeachProductName(proSearchList.getSelectedItem().toString());

        }
        SF.dispose();
    }//GEN-LAST:event_commitActionPerformed

    public static boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");  //match a number with optional '-' and decimal.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addData;
    private javax.swing.JButton backButton;
    private javax.swing.JButton commit;
    private com.toedter.calendar.JDateChooser dateFinish;
    private com.toedter.calendar.JDateChooser dateStart;
    private javax.swing.JLabel decriptionLb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> proSearchList;
    private javax.swing.JLabel productCapCostLb;
    // End of variables declaration//GEN-END:variables
}
