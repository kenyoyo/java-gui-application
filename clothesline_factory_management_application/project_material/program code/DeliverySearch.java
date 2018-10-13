/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui_db;

import com.toedter.calendar.JTextFieldDateEditor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Supawadee Tamo
 */
public class DeliverySearch extends javax.swing.JFrame {
private static String customerId = "";
    private static boolean updateFlag = false;  
    private static DeliverySearch DS = new DeliverySearch();
    private String sql;

    /**
     * Creates new form Product_Form
     */
    
    public DeliverySearch() {
        initComponents();
    }

    public void SearchData() {
        //if(checkDataInForm()){
      DeliveryTable DLV = new DeliveryTable();

       Date date = dateStart.getDate();
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       String reportDate1 = df.format(date);    
       
       date = dateFinish.getDate();
       String reportDate2 = df.format(date);
       
       DLV.setDate1(reportDate1);
       DLV.setDate2(reportDate2);
        //System.out.println(reportDate1 +" " +reportDate2);

        //}
    }

    public void openInsertFrame() {
        JTextFieldDateEditor editor1 = (JTextFieldDateEditor) DS.dateStart.getDateEditor();
        editor1.setEditable(false);
        JTextFieldDateEditor editor2 = (JTextFieldDateEditor) DS.dateFinish.getDateEditor();
        editor2.setEditable(false);
        DS.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        addData = new javax.swing.JLabel();
        decriptionLb = new javax.swing.JLabel();
        dateStart = new com.toedter.calendar.JDateChooser();
        productCapCostLb = new javax.swing.JLabel();
        dateFinish = new com.toedter.calendar.JDateChooser();
        commit = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(102, 204, 153));

        addData.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        addData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addData.setText("การค้นหาข้อมูลการส่ง");

        decriptionLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        decriptionLb.setText("ตั้งแต่วันที่");

        dateStart.setMaxSelectableDate(new java.util.Date(253370743295000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateStart.setDate(c.getTime());

        productCapCostLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productCapCostLb.setText("ถึง");

        dateFinish.setMaxSelectableDate(new java.util.Date(253370743277000L));
        dateFinish.setMinSelectableDate(new java.util.Date(-62135791122000L));
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateFinish.setDate(c.getTime());

        commit.setBackground(new java.awt.Color(236, 240, 241));
        commit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        commit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/research.png"))); // NOI18N
        commit.setText(" ค้นหา");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addData)
                .addGap(218, 218, 218))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(productCapCostLb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(commit)
                        .addGap(6, 6, 6)))
                .addComponent(dateFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(129, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(decriptionLb)
                            .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(productCapCostLb)
                        .addComponent(dateFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(48, 48, 48)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
        DeliveryTable DLV = new DeliveryTable();
        SearchData();
        DLV.openSeacrh();
        DS.dispose();
    }//GEN-LAST:event_commitActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        DeliveryTable DLV = new DeliveryTable();
        DLV.openFrame();
        DS.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    
    private void ShowDataAgain() {
      DeliveryTable DLV = new DeliveryTable();
       DLV.showDataRecord();
    }
    /**
     * @param args the command line arguments
     */
    private void clearRow() {
        DeliveryTable DLV = new DeliveryTable();
        DLV.callClearRow();
    }

    

    /* public boolean checkDataInForm() {
        if (!isNumeric(dateStart.getDateFormatString())&&!isNumeric(dateFinish.getDateFormatString())) {
            String message = "กรุณากรอกช่วงข้อมูลวันที่";
            JOptionPane.showMessageDialog(null, message);
            return false;
        }
        
        return true;
    }*/
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel productCapCostLb;
    // End of variables declaration//GEN-END:variables
}
