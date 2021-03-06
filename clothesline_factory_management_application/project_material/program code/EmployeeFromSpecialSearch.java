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
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class EmployeeFromSpecialSearch extends javax.swing.JFrame {
    
    private static EmployeeFromSpecialSearch EFSS = new EmployeeFromSpecialSearch();
    private DefaultTableModel model = new DefaultTableModel();
    private Object[] data = new Object[0];
    /**
     * Creates new form searchSpecialFrom
     */
    public EmployeeFromSpecialSearch() {
        initComponents();
       
      
        
    }
    
    public void openFrame(){
        EFSS.setVisible(true);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        EmpGender = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmpPositionCBB = new javax.swing.JComboBox<>();
        searchSpecialBTN = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(253, 227, 167));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(253, 227, 167));

        EmpGender.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        EmpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ชาย", "หญิง" }));
        EmpGender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpGenderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel2.setText("เพศ");

        jLabel3.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        jLabel3.setText("ตำแหน่ง");

        EmpPositionCBB.setFont(new java.awt.Font("TH SarabunPSK", 1, 22)); // NOI18N
        EmpPositionCBB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        searchSpecialBTN.setBackground(new java.awt.Color(218, 223, 225));
        searchSpecialBTN.setFont(new java.awt.Font("TH SarabunPSK", 1, 24)); // NOI18N
        searchSpecialBTN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui_db/research.png"))); // NOI18N
        searchSpecialBTN.setText(" ค้นหา");
        searchSpecialBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchSpecialBTNActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("TH SarabunPSK", 1, 36)); // NOI18N
        jLabel1.setText("ค้นหาข้อมูลพนักงาน");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addContainerGap(503, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(EmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(52, 52, 52)
                                    .addComponent(jLabel1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(38, 38, 38)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(EmpPositionCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGap(69, 69, 69)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(searchSpecialBTN)
                        .addGap(234, 234, 234))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EmpPositionCBB, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(searchSpecialBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void searchSpecialBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchSpecialBTNActionPerformed
        EmployeeTable emp = new EmployeeTable();
        String empGender = EmpGender.getSelectedItem().toString();
        String empPosition = EmpPositionCBB.getSelectedItem().toString();
        emp.showGetSearch(empGender, empPosition);
    }//GEN-LAST:event_searchSpecialBTNActionPerformed
    
   
    
    
    
    
    
    private void EmpGenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpGenderActionPerformed
       String empGender = EmpGender.getSelectedItem().toString();
      
        
       if(empGender.equals("ชาย")){
           getDataEmployee("M");
           
       }else if(empGender.equals("หญิง")){
           getDataEmployee("F");
       }
    }//GEN-LAST:event_EmpGenderActionPerformed
    
   

    public void getDataEmployee(String empGender){
        DefaultComboBoxModel cbModel = new DefaultComboBoxModel();
        String sql = "select distinct EMP_POSITION from EMPLOYEE " +
                     "where EMP_GENDER = '" +  empGender  + "';";
        
        
        try{
            Connection con = Gui_db.getConnection();
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while(rs.next()){
                System.out.println(rs.getString(1));
                cbModel.addElement(rs.getString(1));

            }

        }catch(SQLException ex){
            System.out.println(ex.getMessage());
            
        }
        cbModel.addElement("ทุกตำแหน่ง");
        EFSS.EmpPositionCBB.setModel(cbModel);
        cbModel.setSelectedItem("ทุกตำแหน่ง");
        
        
    }
    
    
    
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> EmpGender;
    private javax.swing.JComboBox<String> EmpPositionCBB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton searchSpecialBTN;
    // End of variables declaration//GEN-END:variables
}
