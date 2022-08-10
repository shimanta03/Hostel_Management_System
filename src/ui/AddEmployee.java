
package ui;
import com.mysql.cj.protocol.Resultset;
import java.util.*;
import hms.ConnectionProvider;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class AddEmployee extends javax.swing.JFrame {

   public void clear(){      
       
       
       txt_eName.setText("");       
       txt_eAddress.setText("");       
       txt_eMobile.setText("");
       txt_eAge.setText("");
       cb_ePosition.setSelectedIndex(-1);
       txt_eSalary.setText("");
       
       
   }
    public AddEmployee() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_eName = new javax.swing.JTextField();
        txt_eMobile = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_eAddress = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txt_eAge = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_eSalary = new javax.swing.JTextField();
        cb_ePosition = new javax.swing.JComboBox<>();

        jTextField10.setText("jTextField10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 220));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Employee  Name:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 72, 184, 50));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parmanent Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 240, -1, 80));

        txt_eName.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eNameActionPerformed(evt);
            }
        });
        jPanel1.add(txt_eName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 70, 450, 50));

        txt_eMobile.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eMobile.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_eMobileKeyTyped(evt);
            }
        });
        jPanel1.add(txt_eMobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 450, 50));

        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 610, 170, 35));

        btn_clear.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_clear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        jPanel1.add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 610, 150, 35));

        jButton5.setBackground(new java.awt.Color(207, 41, 103));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close2.png"))); // NOI18N
        jButton5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(937, 0, -1, -1));

        txt_eAddress.setColumns(20);
        txt_eAddress.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eAddress.setRows(5);
        jScrollPane1.setViewportView(txt_eAddress);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 450, 90));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Age:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 184, 50));

        txt_eAge.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eAgeActionPerformed(evt);
            }
        });
        txt_eAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_eAgeKeyTyped(evt);
            }
        });
        jPanel1.add(txt_eAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 450, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Position:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 440, 184, 50));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Salary:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 520, 184, 50));

        txt_eSalary.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txt_eSalary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_eSalaryActionPerformed(evt);
            }
        });
        txt_eSalary.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_eSalaryKeyTyped(evt);
            }
        });
        jPanel1.add(txt_eSalary, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 520, 450, 50));

        cb_ePosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Chef", "Pion", "Staff", "Manager", "Cashier", "Cleaner" }));
        jPanel1.add(cb_ePosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 440, 450, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_eNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        
        String name = txt_eName.getText();          
        String address = txt_eAddress.getText().trim();  
        int age = Integer.parseInt(txt_eAge.getText());
        long mobileNO = Long.parseLong(txt_eMobile.getText());
        String position = cb_ePosition.getSelectedItem().toString();
        double salary = Double.parseDouble(txt_eSalary.getText());
        
        try {
            Connection con = ConnectionProvider.getCon();          
            
            
            
            PreparedStatement ps = con.prepareStatement("insert into employee (e_name,e_age,e_address,e_mobile,e_position,e_salary,e_status) values(?,?,?,?,?,?,?)");
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, address);
            ps.setLong(4, mobileNO);
            ps.setString(5, position);
            ps.setDouble(6, salary);     
            ps.setString(7, "Active");
            
            
            
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Employee Added Sucessfully !");
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
        
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        clear();
    }//GEN-LAST:event_btn_clearActionPerformed

    private void txt_eAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eAgeActionPerformed

    private void txt_eSalaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_eSalaryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_eSalaryActionPerformed

    private void txt_eAgeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_eAgeKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }  
    }//GEN-LAST:event_txt_eAgeKeyTyped

    private void txt_eMobileKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_eMobileKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }  
    }//GEN-LAST:event_txt_eMobileKeyTyped

    private void txt_eSalaryKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_eSalaryKeyTyped
        char ch = evt.getKeyChar();
        if(!Character.isDigit(ch)){
            evt.consume();
        }  
    }//GEN-LAST:event_txt_eSalaryKeyTyped

    
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_clear;
    private javax.swing.JComboBox<String> cb_ePosition;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JTextField txt_eMobile;
    private javax.swing.JTextField txt_eName;
    private javax.swing.JTextField txt_eSalary;
    // End of variables declaration//GEN-END:variables
}
