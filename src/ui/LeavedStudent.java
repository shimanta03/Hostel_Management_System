
package ui;

import hms.ConnectionProvider;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Shimanta
 */
public class LeavedStudent extends javax.swing.JFrame {

  
    public LeavedStudent() {
        initComponents();
        loadStudentData();
        
        
        
        
    }

    private void loadStudentData(){
        
        DefaultTableModel tmodel = (DefaultTableModel) tblStudent.getModel();
        tmodel.setRowCount(0);
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from student where status='Leaved'");
            
            while(rs.next()){
                tmodel.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),
                rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),
                rs.getString(9),rs.getString(10),rs.getString(11)});
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    private void getSearchedData(ResultSet rs){
        try {
            if(rs.next()){
                int id = rs.getInt("s_id");
                String name= rs.getString("student_name");
                String motherName = rs.getString("mother_name");
                String fathername= rs.getString("father_name");
                String email= rs.getString("email");
                String address= rs.getString("address");
                String institute= rs.getString("institue");
                String nbid= rs.getString("n_bid");
                String mobileNo= rs.getString("mobile_no");
                String roomNo = rs.getString("roomno");
                String status= rs.getString("status");
                
                DefaultTableModel DTM = (DefaultTableModel) tblStudent.getModel();
                DTM.setRowCount(0);
                Vector rowData = new Vector();
                rowData.add(id);
                rowData.add(name);
                rowData.add(motherName);
                rowData.add(fathername);
                rowData.add(email);
                rowData.add(address);
                rowData.add(institute);
                rowData.add(nbid);
                rowData.add(mobileNo);
                rowData.add(roomNo);
                rowData.add(status);
                
                DTM.addRow(rowData);
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Student Not Found!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(LeavedStudent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtU_search = new javax.swing.JTextField();
        btnU_search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblStudent = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));

        btnU_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnU_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnU_search.setText("Search");
        btnU_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU_searchActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(207, 41, 103));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close2.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblStudent.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblStudent.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Mother's Name", "Father's Name", "Email", "Address", "Institute", "N/BID", "Mobile Number", "Room No", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStudent.setRowHeight(35);
        tblStudent.setSelectionBackground(new java.awt.Color(207, 41, 103));
        jScrollPane1.setViewportView(tblStudent);

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 965, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(txtU_search, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnU_search)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtU_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnU_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnU_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU_searchActionPerformed
           if(txtU_search.getText().length()!=0){
               int s_id = Integer.parseInt(txtU_search.getText());
        
                Connection con = ConnectionProvider.getCon();
                Statement st;
                try {
                    st = con.createStatement();
                    String roomnumber = txtU_search.getText();
                    ResultSet rs = st.executeQuery("select * from student where s_id="+s_id +" and status='Leaved'");
                    getSearchedData(rs);




                } catch (SQLException ex) {
                    Logger.getLogger(LeavedStudent.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
        else{
            loadStudentData();
        }
    }//GEN-LAST:event_btnU_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txtU_search.setText("");
        tblStudent.clearSelection();
        loadStudentData();

    }//GEN-LAST:event_btn_clearActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LeavedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LeavedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LeavedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LeavedStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LeavedStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnU_search;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblStudent;
    private javax.swing.JTextField txtU_search;
    // End of variables declaration//GEN-END:variables
}
