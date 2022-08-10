package ui;
import hms.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class EmployeeSalary extends javax.swing.JFrame {

  
    public EmployeeSalary() {
        initComponents();
        
    }
    
     public void clear(){       
       
       txt_eId.setText("");
       txt_paying.setText("");
       txt_eName.setText("");       
       txt_eMobile.setText("");
       txt_ePosition.setText("");
       txt_eSalary.setText("");
       txt_eMonth.setText("");
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
           Logger.getLogger(EmployeeSalary.class.getName()).log(Level.SEVERE, null, ex);
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
        txt_eName = new javax.swing.JTextField();
        txt_eMobile = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txt_eId = new javax.swing.JTextField();
        btn_search = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txt_ePosition = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txt_eSalary = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txt_paying = new javax.swing.JTextField();
        txt_eMonth = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 184, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Position:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, 40));

        txt_eName.setEditable(false);
        txt_eName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 600, 50));

        txt_eMobile.setEditable(false);
        txt_eMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_eMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 370, 600, 50));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Employee ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 184, 40));

        txt_eId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_eId, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 400, 50));

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btn_search.setText("Search");
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btn_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 230, 170, 50));

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 590, 170, 50));

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 595, 150, 50));

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
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, -1, 50));

        txt_ePosition.setEditable(false);
        txt_ePosition.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_ePosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, 240, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Month:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 440, 70, 50));

        txt_eSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_eSalaryKeyTyped(evt);
            }
        });
        jPanel1.add(txt_eSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 510, 240, 50));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Salary:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 520, -1, 40));

        txt_paying.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_paying.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_payingKeyTyped(evt);
            }
        });
        jPanel1.add(txt_paying, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 510, 230, 50));

        txt_eMonth.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txt_eMonth, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 440, 230, 50));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Paying:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 510, 70, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_eNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eNameActionPerformed
        
    }//GEN-LAST:event_txt_eNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        if(txt_eId.getText().length()!=0){
            int e_id = Integer.parseInt(txt_eId.getText());
            
            
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from employee where e_id="+e_id+" and e_status='Active'");
                if(rs.next()){             
                    
                    txt_eName.setText(rs.getString(2));                    
                    txt_eMobile.setText(String.valueOf(rs.getLong(5)));
                    txt_ePosition.setText(rs.getString(6));
                    txt_eSalary.setText(String.valueOf(rs.getDouble(7)));
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Employee not found!");
                    clear();                    
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_btn_searchActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        if(txt_eSalary.getText().length()!=0){
            double oldAmount = getBalance();
            double givenAmount = Double.parseDouble(txt_eSalary.getText());
            String month = txt_eMonth.getText();
            int emp_id = Integer.parseInt(txt_eId.getText());
            
           
                
                    double newBalance = oldAmount-givenAmount;

                    try {
                                          
                        
                        
                        Connection con3 = ConnectionProvider.getCon();
                        PreparedStatement ps3 = con3.prepareStatement("insert into expense (amount,month,purpose,emp_id) values(?,?,?,?)");
                        ps3.setDouble(1, givenAmount);
                        ps3.setString(2, month);
                        ps3.setString(3, "Salary");  
                        ps3.setInt(4, emp_id);
                        ps3.executeUpdate();
                        
                        JOptionPane.showMessageDialog(this,"Salary Paid Sucessfully !");

                        clear();                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(this,e);
                    }       
      
            }
            
        
        
        
        
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_eSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_eSalaryKeyTyped
         char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }  
    }//GEN-LAST:event_txt_eSalaryKeyTyped

    private void txt_payingKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_payingKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_payingKeyTyped

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
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeSalary.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeSalary().setVisible(true);
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
    private javax.swing.JTextField txt_eId;
    private javax.swing.JTextField txt_eMobile;
    private javax.swing.JTextField txt_eMonth;
    private javax.swing.JTextField txt_eName;
    private javax.swing.JTextField txt_ePosition;
    private javax.swing.JTextField txt_eSalary;
    private javax.swing.JTextField txt_paying;
    // End of variables declaration//GEN-END:variables
}
