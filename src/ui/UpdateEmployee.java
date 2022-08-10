
package ui;
import com.mysql.cj.protocol.Resultset;
import java.util.*;
import hms.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class UpdateEmployee extends javax.swing.JFrame {

      
    public UpdateEmployee() {
        initComponents();
    }
    
    
    public void clear(){       
       txt_eId.setEditable(true);
       txt_eId.setText("");
       txt_eName.setText("");       
       txt_eAddress.setText("");       
       txt_eMobile.setText("");
       txt_eAge.setText("");
       txt_ePosition.setText("");
       txt_eSalary.setText("");      
       cb_status.removeAllItems();
       
   }
    
    
    void updateAction(){
        
        if(txt_eName.getText().length()!=0 && txt_eAge.getText().length()!=0 && txt_eMobile.getText().length()!=0 &&
                txt_ePosition.getText().length()!=0 && txt_eSalary.getText().length()!=0
                 && txt_eAddress.getText().length()!=0){
            
                int e_id = Integer.parseInt(txt_eId.getText());
                String name = txt_eName.getText();     
                int age = Integer.parseInt(txt_eAge.getText());
                String address = txt_eAddress.getText();          
                long mobileNO = Long.parseLong(txt_eMobile.getText());
                String position = txt_ePosition.getText();
                double salary = Double.parseDouble(txt_eSalary.getText());
                String status = (String)cb_status.getSelectedItem();

                try {
                    Connection con = ConnectionProvider.getCon();
                    Statement st = con.createStatement();



                    PreparedStatement ps = con.prepareStatement("update employee set e_name=?, e_age=?,e_address=?,e_mobile=?,e_position=?,e_salary=?, e_status=? where e_id=?");
                    ps.setString(1, name);
                    ps.setInt(2, age);
                    ps.setString(3, address);
                    ps.setLong(4, mobileNO);
                    ps.setString(5, position);
                    ps.setDouble(6, salary);               
                    ps.setString(7, status);
                    ps.setInt(8, e_id);       

                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this,"Sucessfully Updated");
                    clear();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,e);
                }
        
            
            
            
        }
        else{
            JOptionPane.showMessageDialog(this, "Invalid Data!");
        }
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        txt_eId = new javax.swing.JTextField();
        btn_Search = new javax.swing.JButton();
        btnU_update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txt_eName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txt_eAge = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_eAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        txt_eMobile = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_ePosition = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txt_eSalary = new javax.swing.JTextField();
        cb_status = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Employee ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 40, 184, -1));

        txt_eId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_eId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 300, 35));

        btn_Search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_Search.setText("Search");
        btn_Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SearchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, 35));

        btnU_update.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnU_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update2.png"))); // NOI18N
        btnU_update.setText("Update");
        btnU_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU_updateActionPerformed(evt);
            }
        });
        jPanel1.add(btnU_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 170, 35));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        jButton4.setText("Clear");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 150, 35));

        jButton5.setBackground(new java.awt.Color(207, 41, 103));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close2.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee  Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 184, 50));

        txt_eName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 450, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 184, 50));

        txt_eAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eAgeActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 450, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parmanent Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 80));

        txt_eAddress.setColumns(20);
        txt_eAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eAddress.setRows(5);
        jScrollPane1.setViewportView(txt_eAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 450, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, 30));

        txt_eMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_eMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 350, 450, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Position:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 420, 184, 50));

        txt_ePosition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_ePosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_ePositionActionPerformed(evt);
            }
        });
        jPanel1.add(txt_ePosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 450, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salary:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 500, 184, 50));

        txt_eSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eSalaryActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 500, 210, 50));

        cb_status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 500, 130, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Status");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 510, 80, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SearchActionPerformed
        if(txt_eId.getText().length()!=0){
            int e_id = Integer.parseInt(txt_eId.getText());
            
            
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from employee where e_id="+e_id);
                if(rs.next()){
                    
                    txt_eId.setEditable(false);
                    txt_eName.setText(rs.getString(2));
                    txt_eAge.setText(String.valueOf(rs.getInt(3)));
                    txt_eAddress.setText(rs.getString(4));
                    txt_eMobile.setText(String.valueOf(rs.getLong(5)));
                    txt_ePosition.setText(rs.getString(6));
                    txt_eSalary.setText(String.valueOf(rs.getDouble(7)));
                    
                    if(rs.getString(8).equals("Active")){
                        cb_status.removeAllItems();
                        cb_status.addItem("Active");
                        cb_status.setSelectedIndex(0);
                        cb_status.addItem("Leaved");
                    }
                    else{
                        cb_status.removeAllItems();                        
                        cb_status.addItem("Leaved");
                        cb_status.setSelectedIndex(0);
                        cb_status.addItem("Active");
                       
                    }
                    
  
                }
                else{
                    JOptionPane.showMessageDialog(this,"Employee not found!");
                    clear();
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_btn_SearchActionPerformed

    private void btnU_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU_updateActionPerformed
        updateAction();
    }//GEN-LAST:event_btnU_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txt_eNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eNameActionPerformed

    private void txt_eAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eAgeActionPerformed

    private void txt_ePositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_ePositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_ePositionActionPerformed

    private void txt_eSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eSalaryActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnU_update;
    private javax.swing.JButton btn_Search;
    private javax.swing.JComboBox<String> cb_status;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextArea txt_eAddress;
    private javax.swing.JTextField txt_eAge;
    private javax.swing.JTextField txt_eId;
    private javax.swing.JTextField txt_eMobile;
    private javax.swing.JTextField txt_eName;
    private javax.swing.JTextField txt_ePosition;
    private javax.swing.JTextField txt_eSalary;
    // End of variables declaration//GEN-END:variables
}
