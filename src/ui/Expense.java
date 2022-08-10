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


public class Expense extends javax.swing.JFrame {

  
    public Expense() {
        initComponents();
        loadExpenseData();      
        
    }

    private void loadExpenseData(){
        
        DefaultTableModel tmodel = (DefaultTableModel) tbl_Expense.getModel();
        tmodel.setRowCount(0);
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from expense left join employee on(emp_id=employee.e_id)");
            
            while(rs.next()){
                tmodel.addRow(new Object[] {
                    rs.getInt("expense.e_id"),
                    rs.getDouble("amount"),
                    rs.getString("month"),
                    rs.getString("purpose"),
                    rs.getInt("emp_id"),
                    rs.getString("e_name")
                    
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    void clear(){
        txtU_search.setText("");
        txt_amount.setText("");
        txt_month.setText("");
        txt_purpose.setText("");
        tbl_Expense.clearSelection();
        cb_filter.setSelectedIndex(0);
        loadExpenseData();
    }
    
    private void getSearchedData(ResultSet rs){
        
        DefaultTableModel DTM = (DefaultTableModel) tbl_Expense.getModel();
        DTM.setRowCount(0);
        
        try {           
                
            
            while(rs.next()){         

                Vector rowData = new Vector();                
                              
                rowData.add(rs.getInt("expense.e_id"));
                rowData.add(rs.getDouble("amount"));
                rowData.add(rs.getString("month"));
                rowData.add(rs.getString("purpose"));
                rowData.add(rs.getInt("emp_id"));
                rowData.add(rs.getString("e_name"));
                
                

                DTM.addRow(rowData);              
                
                
            }           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
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
        tbl_Expense = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        cb_filter = new javax.swing.JComboBox<>();
        txt_amount = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_month = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_purpose = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();

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

        tbl_Expense.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_Expense.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Amount", "Month", "Purpose", "Emp ID", "Emp Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_Expense.setRowHeight(45);
        tbl_Expense.setSelectionBackground(new java.awt.Color(207, 41, 103));
        jScrollPane1.setViewportView(tbl_Expense);

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        cb_filter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_filter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Employee ID", "Month" }));
        cb_filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_filterActionPerformed(evt);
            }
        });

        txt_amount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_amount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_amountKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Amount:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Month:");

        txt_month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monthKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Purpose:");

        txt_purpose.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_purpose.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_purposeKeyTyped(evt);
            }
        });

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("ADD ");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
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
                    .addComponent(jScrollPane1)
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
                .addGap(46, 46, 46)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_purpose))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(374, 374, 374))
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_month, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_purpose, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
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
                    if(choice.equals("Employee ID")){
                        
                        ResultSet rs = st.executeQuery("select * from expense left join employee on(emp_id=employee.e_id) where emp_id="+text);
                        getSearchedData(rs);
                        
                    }
                    else{
                        ResultSet rs = st.executeQuery("select * from expense left join employee on(emp_id=employee.e_id) where month LIKE '%"+text+"%'");
                        getSearchedData(rs);
                    }
                    




                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "Invalid Search Query!");
                    Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
        else{
            loadExpenseData();
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txtU_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtU_searchKeyTyped
        
      
    }//GEN-LAST:event_txtU_searchKeyTyped

    private void cb_filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_filterActionPerformed
        if(cb_filter.getSelectedIndex()>=0){
            loadExpenseData();
        }
    }//GEN-LAST:event_cb_filterActionPerformed

    private void txt_amountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_amountKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_amountKeyTyped

    private void txt_monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monthKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_monthKeyTyped

    private void txt_purposeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_purposeKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_purposeKeyTyped

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       if(txt_amount.getText().length()!=0 && txt_month.getText().length()!=0 && txt_purpose.getText().length()!=0){
           
           try {
               double amount = Double.parseDouble(txt_amount.getText());
               String month = txt_month.getText();
               String purpose = txt_purpose.getText();
               
               
               Connection con3 = ConnectionProvider.getCon();
               PreparedStatement ps3 = con3.prepareStatement("insert into expense (amount,month,purpose) values(?,?,?)");
               ps3.setDouble(1, amount);
               ps3.setString(2, month);
               ps3.setString(3, purpose);
               
               ps3.executeUpdate();
               JOptionPane.showMessageDialog(this,"Expense Sucessfully Added !");
               clear();
           } catch (SQLException ex) {
               Logger.getLogger(Expense.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           
           
       }
       else{
           JOptionPane.showMessageDialog(this, "Please fill up all field!");
       }
    }//GEN-LAST:event_btn_addActionPerformed

    
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
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Expense.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Expense().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cb_filter;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_Expense;
    private javax.swing.JTextField txtU_search;
    private javax.swing.JTextField txt_amount;
    private javax.swing.JTextField txt_month;
    private javax.swing.JTextField txt_purpose;
    // End of variables declaration//GEN-END:variables
}
