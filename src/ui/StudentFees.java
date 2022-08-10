package ui;
import com.mysql.cj.protocol.Resultset;
import java.util.*;
import hms.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class StudentFees extends javax.swing.JFrame {

  
    public StudentFees() {
        initComponents();
        
    }
    
     public void clear(){       
       txt_due.setText("");
       txt_month.setText("");
       txtU_stId.setText("");
       txtU_studentName.setText("");       
       txtU_mobileno.setText("");
       txt_roomNo.setText("");
       txt_feesAmount.setText("");
       
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
           Logger.getLogger(StudentFees.class.getName()).log(Level.SEVERE, null, ex);
           return 0;
       }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtU_studentName = new javax.swing.JTextField();
        txtU_mobileno = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtU_stId = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_roomNo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_feesAmount = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_month = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txt_due = new javax.swing.JTextField();

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Student's Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 184, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Month:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, -1, 50));

        txtU_studentName.setEditable(false);
        txtU_studentName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtU_studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtU_studentNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtU_studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 530, 50));

        txtU_mobileno.setEditable(false);
        txtU_mobileno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtU_mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 370, 530, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 184, 40));

        txtU_stId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtU_stId, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 230, 330, 50));

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 170, 50));

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 600, 170, 50));

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 600, 150, 50));

        jButton5.setBackground(new java.awt.Color(207, 41, 103));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close2.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, 40));

        txt_roomNo.setEditable(false);
        txt_roomNo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_roomNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, 200, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Fees Amount:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 520, -1, 40));

        txt_feesAmount.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_feesAmount.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_feesAmountKeyTyped(evt);
            }
        });
        jPanel1.add(txt_feesAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 510, 200, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Room No:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, 40));

        txt_month.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_month.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_monthKeyTyped(evt);
            }
        });
        jPanel1.add(txt_month, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 230, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Due:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 50, 50));

        txt_due.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_due.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_dueKeyTyped(evt);
            }
        });
        jPanel1.add(txt_due, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 510, 230, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtU_studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtU_studentNameActionPerformed
        
    }//GEN-LAST:event_txtU_studentNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        if(txtU_stId.getText().length()!=0){
            int st_id = Integer.parseInt(txtU_stId.getText());
            
            
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from student where s_id="+st_id+" and status='Living'");
                if(rs.next()){                    
                    txtU_studentName.setText(rs.getString(2));                    
                    txtU_mobileno.setText(String.valueOf(rs.getLong(9)));
                    txt_roomNo.setText(rs.getString(10));
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Student not found!");
                    clear();                    
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if(txt_feesAmount.getText().length()!=0 && txt_month.getText().length()!=0){
            double oldAmount = getBalance();
            double givenFees = Double.parseDouble(txt_feesAmount.getText());
            double newBalance = oldAmount+givenFees;
            
            String month = txt_month.getText();
            int st_id = Integer.parseInt(txtU_stId.getText());
            
            
                try {
                  
                    
                    
                    Connection con2 = ConnectionProvider.getCon();
                    PreparedStatement ps2 = con2.prepareStatement("insert into income (amount,st_id,month) values(?,?,?)");
                    ps2.setDouble(1, givenFees);
                    ps2.setInt(2, st_id);
                    ps2.setString(3, month);
                    
                    ps2.executeUpdate();
                    
                    if(txt_due.getText().length()!=0){
                        double due = Double.parseDouble(txt_due.getText());
                        
                        Connection con3 = ConnectionProvider.getCon();
                        PreparedStatement ps3 = con3.prepareStatement("insert into due (amount,st_id,month,status) values(?,?,?,?)");
                        ps3.setDouble(1, due);
                        ps3.setInt(2, st_id);
                        ps3.setString(3, month);
                        ps3.setString(4, "Unpaid");
                        
                        ps3.executeUpdate();
                    }
                    
                    

                    
                    JOptionPane.showMessageDialog(this,"Fees Received Sucessfully !");
                    
                    
                    
                    
                    
                    clear();
                    
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(this,e);
                }
            
        }
        
        
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_feesAmountKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_feesAmountKeyTyped
         char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }  
    }//GEN-LAST:event_txt_feesAmountKeyTyped

    private void txt_monthKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_monthKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_monthKeyTyped

    private void txt_dueKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_dueKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_dueKeyTyped

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
            java.util.logging.Logger.getLogger(StudentFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentFees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentFees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField txtU_mobileno;
    private javax.swing.JTextField txtU_stId;
    private javax.swing.JTextField txtU_studentName;
    private javax.swing.JTextField txt_due;
    private javax.swing.JTextField txt_feesAmount;
    private javax.swing.JTextField txt_month;
    private javax.swing.JTextField txt_roomNo;
    // End of variables declaration//GEN-END:variables
}
