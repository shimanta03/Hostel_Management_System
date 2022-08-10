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


public class EmployeeList extends javax.swing.JFrame {

  
    public EmployeeList() {
        initComponents();
        loadEmployeeData("Active");      
        
    }

    private void loadEmployeeData(String status){
        
        DefaultTableModel tmodel = (DefaultTableModel) tblEmployee.getModel();
        tmodel.setRowCount(0);
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from employee where e_status='"+status+"'");
            
            while(rs.next()){
                tmodel.addRow(new Object[]{rs.getInt(1),rs.getString(2),rs.getInt(3),
                rs.getString(4),rs.getLong(5),rs.getString(6),rs.getDouble(7),rs.getString(8),
                });
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    
    
    private void getSearchedData(ResultSet rs){
        try {
            if(rs.next()){
                int id = rs.getInt("e_id");
                String name= rs.getString("e_name");
                int age = rs.getInt("e_age");                
                String address= rs.getString("e_address");                
                long mobileNo= rs.getLong("e_mobile");
                String position = rs.getString("e_position");
                double salary = rs.getDouble("e_salary");
                String status= rs.getString("e_status");
                
                
                DefaultTableModel DTM = (DefaultTableModel) tblEmployee.getModel();
                DTM.setRowCount(0);
                Vector rowData = new Vector();
                rowData.add(id);
                rowData.add(name);
                rowData.add(age);
                rowData.add(address);
                rowData.add(mobileNo);
                rowData.add(position);
                rowData.add(salary);
                rowData.add(status);                
                
                DTM.addRow(rowData);
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Employee Not Found!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
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
        tblEmployee = new javax.swing.JTable();
        btn_clear = new javax.swing.JButton();
        cb_status = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));

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

        tblEmployee.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age", "Address", "Mobile", "Position", "Salary", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmployee.setRowHeight(45);
        tblEmployee.setSelectionBackground(new java.awt.Color(207, 41, 103));
        jScrollPane1.setViewportView(tblEmployee);

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });

        cb_status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cb_status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Leaved" }));
        cb_status.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_statusActionPerformed(evt);
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 950, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtU_search)
                        .addGap(18, 18, 18)
                        .addComponent(btn_search)
                        .addGap(18, 18, 18)
                        .addComponent(btn_clear, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)))
                .addContainerGap())
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
                    .addComponent(cb_status, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 980, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
           if(txtU_search.getText().length()!=0){
               int e_id = Integer.parseInt(txtU_search.getText());
        
                Connection con = ConnectionProvider.getCon();
                Statement st;
                try {
                    st = con.createStatement();
                    String roomnumber = txtU_search.getText();
                    ResultSet rs = st.executeQuery("select * from employee where e_id="+e_id +" and e_status='"+cb_status.getSelectedItem().toString()+"'");
                    getSearchedData(rs);




                } catch (SQLException ex) {
                    Logger.getLogger(EmployeeList.class.getName()).log(Level.SEVERE, null, ex);
                }

                }
        else{
            loadEmployeeData("Active");
        }
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        txtU_search.setText("");
        tblEmployee.clearSelection();
        loadEmployeeData("Active");
        
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txtU_searchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtU_searchKeyTyped
        
       char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }  
    }//GEN-LAST:event_txtU_searchKeyTyped

    private void cb_statusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_statusActionPerformed
        if(cb_status.getSelectedIndex()>=0){
            loadEmployeeData(cb_status.getSelectedItem().toString());
        }
    }//GEN-LAST:event_cb_statusActionPerformed

    
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
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeList.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeList().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtU_search;
    // End of variables declaration//GEN-END:variables
}
