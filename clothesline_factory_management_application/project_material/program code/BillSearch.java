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
public class BillSearch extends javax.swing.JFrame {

   private static String customerId = "";
    private static boolean updateFlag = false;  
    private static BillSearch DS = new BillSearch();
    private String sql;

    /**
     * Creates new form Product_Form
     */
    
    public BillSearch() {
        initComponents();
    }

    public void SearchData() {
        //if(checkDataInForm()){
       BillTable Bill = new BillTable();

       Date date = dateStart.getDate();
       DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
       String reportDate1 = df.format(date);    
       
       date = dateFinish.getDate();
       String reportDate2 = df.format(date);
       
       Bill.setDate1(reportDate1);
       Bill.setDate2(reportDate2);
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

        jPanel1 = new javax.swing.JPanel();
        commit = new javax.swing.JButton();
        dateStart = new com.toedter.calendar.JDateChooser();
        decriptionLb = new javax.swing.JLabel();
        dateFinish = new com.toedter.calendar.JDateChooser();
        productCapCostLb = new javax.swing.JLabel();
        addData = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(228, 241, 254));

        commit.setBackground(new java.awt.Color(236, 240, 241));
        commit.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        commit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/research.png"))); // NOI18N
        commit.setText(" ค้นหา");
        commit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commitActionPerformed(evt);
            }
        });

        dateStart.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dateStart.setMaxSelectableDate(new java.util.Date(253370743295000L));
        Date date = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateStart.setDate(c.getTime());

        decriptionLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        decriptionLb.setText("ตั้งแต่วันที่");

        dateFinish.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        dateFinish.setMaxSelectableDate(new java.util.Date(253370743277000L));
        dateFinish.setMinSelectableDate(new java.util.Date(-62135791122000L));
        c.setTime(date);
        c.set(Calendar.YEAR, 2017);
        dateFinish.setDate(c.getTime());

        productCapCostLb.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        productCapCostLb.setText("ถึง");

        addData.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        addData.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addData.setText("การค้นหาข้อมูลบิล");

        backButton.setBackground(new java.awt.Color(236, 240, 241));
        backButton.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        backButton.setText("ย้อนกลับ");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(decriptionLb, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(productCapCostLb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dateFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addData)
                        .addGap(193, 193, 193))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(commit)
                        .addGap(239, 239, 239))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(addData, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateFinish, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(decriptionLb)
                        .addComponent(dateStart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productCapCostLb, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(33, 33, 33)
                .addComponent(commit, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 344, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void commitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commitActionPerformed
        BillTable Bill = new BillTable();
        SearchData();
        Bill.openSeacrh();
        DS.dispose();
    }//GEN-LAST:event_commitActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        BillTable Bill = new BillTable();
        Bill.openFrame();
        DS.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

  private void ShowDataAgain() {
     BillTable Bill = new BillTable();
        Bill.showDataRecord();
    }
    

    private void clearRow() {
      BillTable Bill = new BillTable();
        Bill.callClearRow();
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel productCapCostLb;
    // End of variables declaration//GEN-END:variables
}
