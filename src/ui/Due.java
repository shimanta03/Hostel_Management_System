package ui;

import hms.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Due extends javax.swing.JFrame {

  
    public Due() {
        initComponents();
        loadDueData();      
        
    }
    
    
    double getBalance(){
       try {
           Connection con = ConnectionProvider.getCon();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select amount from accounts where acc_id=1");
           if(rs.next()){
               double balance = rs.getDouble("amount");
               return  balance;               
           }
           else{
               return 0;
           }
       } catch (SQLException ex) {
           Logger.getLogger(Due.class.getName()).log(Level.SEVERE, null, ex);
           return 0;
       }
    }

    private void loadDueData(){
        
        DefaultTableModel tmodel = (DefaultTableModel) tbl_Due.getModel();
        tmodel.setRowCount(0);
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from due left join student on(st_id=s_id) where due.status='Unpaid'");
            
            while(rs.next()){
                tmodel.addRow(new Object[] {
                    rs.getInt("d_id"),
                    rs.getDouble("amount"),
                    rs.getInt("st_id"),
                    rs.getString("student_name"),
                    rs.getString("month"),
                    rs.getString("due.status")
                    
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    private void getSearchedData(ResultSet rs){
        
        DefaultTableModel DTM = (DefaultTableModel) tbl_Due.getModel();
        DTM.setRowCount(0);
        
        try {           
                
            
            while(rs.next()){         

                Vector rowData = new Vector();                
                              
                rowData.add(rs.getInt("d_id"));
                rowData.add(rs.getDouble("amount"));
                rowData.add(rs.getInt("st_id"));
                rowData.add(rs.getString("student_name"));
                rowData.add(rs.getString("month"));
                rowData.add(rs.getString("due.status"));

                DTM.addRow(rowData);              
                
                
            }           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Due.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtU_search = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Due = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        cb_filter = new javax.swing.JComboBox<>();
        btn_pay = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));

        txtU_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtU_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtU_searchKeyTyped(evt);
            }
        });

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
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

        tbl_Due.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_Due.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Due ID", "Amount", "Student Id", "Student Name", "Month", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Due.setRowHeight(45);
        tbl_Due.setSelectionBackground(new java.awt.Color(207, 41, 103));
        jScrollPane1.setViewportView(tbl_Due);

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        cb_filter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Student ID", "Month" }));
        cb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_filterActionPerformed(evt);
            }
        });

        btn_pay.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_pay.setText("PAY");
        btn_pay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_payActionPerformed(evt);
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
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtU_search)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(326, 326, 326)
                .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jButton2)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtU_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_search, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cb_filter, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_pay, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
           if(txtU_search.getText().length()!=0){
               
               String choice = cb_filter.getSelectedItem().toString();
               
               String text  = txtU_search.getText();
                          
               try {
        
                    Connection con = ConnectionProvider.getCon();
                    Statement st;        
                    st = con.createStatement();
                    if(choice.equals("Student ID")){
                        
                        ResultSet rs = st.executeQuery("select * from due left join student on(st_id=s_id) where due.status='Unpaid' and st_id="+text);
                        getSearchedData(rs);
                        
                    }
                    else{
                        ResultSet rs = st.executeQuery("select * from due left join student on(st_id=s_id) where due.status='Unpaid' and month LIKE '%"+text+"%'");
                        getSearchedData(rs);
                    }
                    




                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid Search Query!");
                    Logger.getLogger(Due.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
        else{
            loadDueData();
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txtU_search.setText("");
        tbl_Due.clearSelection();
        loadDueData();
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txtU_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtU_searchKeyTyped
        
      
    }//GEN-LAST:event_txtU_searchKeyTyped

    private void cb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_filterActionPerformed
        if(cb_filter.getSelectedIndex()>=0){
            loadDueData();
        }
    }//GEN-LAST:event_cb_filterActionPerformed

    private void btn_payActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_payActionPerformed
       if(tbl_Due.getSelectedRow()>=0){
           
           try {
               int row = tbl_Due.getSelectedRow();
               int col = 1;
               double amount = Double.parseDouble(tbl_Due.getValueAt(row, col).toString());
               int d_id = Integer.parseInt(tbl_Due.getValueAt(row, 0).toString());
               int st_id = Integer.parseInt(tbl_Due.getValueAt(row, 2).toString());
               String month = tbl_Due.getValueAt(row, 4).toString();
               
               System.out.println(amount);
               
               double oldAmount = getBalance();
               double given = amount;
               double newBalance = oldAmount+given;
               
             
               
               Connection con2 = ConnectionProvider.getCon();
               
               PreparedStatement ps2 = con2.prepareStatement("update due set status='Paid' where d_id=?");
               ps2.setInt(1, d_id);
               ps2.executeUpdate();
               
               
               Connection con3 = ConnectionProvider.getCon();
               PreparedStatement ps3 = con3.prepareStatement("insert into income (amount,st_id,month) values(?,?,?)");
               ps3.setDouble(1, amount);
               ps3.setInt(2, st_id);
               ps3.setString(3, month);                    
               ps3.executeUpdate();
               
               
               
               JOptionPane.showMessageDialog(this, "Due has been Paid!");
               
               
               
               
               txtU_search.setText("");
                tbl_Due.clearSelection();
                loadDueData();
               
               
               
               
               
               
               
           } catch (SQLException ex) {
               Logger.getLogger(Due.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           
           
           
       }
       else{
           JOptionPane.showMessageDialog(this, "Select atleast one record!");
        
    }
    }//GEN-LAST:event_btn_payActionPerformed

    
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
            java.util.logging.Logger.getLogger(Due.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Due.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Due.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Due.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Due().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_pay;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cb_filter;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Due;
    private javax.swing.JTextField txtU_search;
    // End of variables declaration//GEN-END:variables
}
