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
public class UpdateStudent extends javax.swing.JFrame {
    
    private String oldRoom =null;

   public void clear(){
       
       txtU_stId.setEditable(true);
       txtU_stId.setText("");
       txtU_studentName.setText("");
       txtU_motherName.setText("");
       txtU_fatherName.setText("");
       txtU_email.setText("");
       txtU_address.setText("");
       txtU_institute.setText("");
       txtU_nbid.setText("");
       txtU_mobileno.setText("");
       cmdboxRoom.removeAllItems();
       cmbU_status.removeAllItems();
   }
    public UpdateStudent() {
        initComponents();
    }

    void loadUnbookedRoomID(String oldId){
       try {
           Connection con = ConnectionProvider.getCon();
           Statement st = con.createStatement();
           ResultSet rs = st.executeQuery("select * from room where Activate='Yes'and RoomStatus ='Not Booked'");
           while(rs.next()){
               
               if(oldId.equals(rs.getString(1)))
                   continue;
               
               cmdboxRoom.addItem(rs.getString(1));
           }
       } catch (SQLException ex) {
           Logger.getLogger(UpdateStudent.class.getName()).log(Level.SEVERE, null, ex);
       }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField10 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtU_studentName = new javax.swing.JTextField();
        txtU_motherName = new javax.swing.JTextField();
        txtU_fatherName = new javax.swing.JTextField();
        txtU_email = new javax.swing.JTextField();
        txtU_institute = new javax.swing.JTextField();
        txtU_nbid = new javax.swing.JTextField();
        txtU_mobileno = new javax.swing.JTextField();
        cmbU_status = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        txtU_stId = new javax.swing.JTextField();
        btnU_search = new javax.swing.JButton();
        btnU_update = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtU_address = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cmdboxRoom = new javax.swing.JComboBox<>();

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
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 184, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Mother's Name:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Father's Name:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 210, 150, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Email:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 260, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Parmanent Address:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Institute Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 370, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("NID/Birthcertificate No:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 430, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Room No:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 550, -1, -1));

        txtU_studentName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtU_studentName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtU_studentNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtU_studentName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 450, 35));

        txtU_motherName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtU_motherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 150, 450, 35));

        txtU_fatherName.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtU_fatherName, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 200, 450, 35));

        txtU_email.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtU_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 450, 35));

        txtU_institute.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtU_institute, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 370, 450, 35));

        txtU_nbid.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtU_nbid, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 420, 450, 35));

        txtU_mobileno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(txtU_mobileno, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 480, 450, 35));

        cmbU_status.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel1.add(cmbU_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 540, 170, 35));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Student ID:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 184, -1));

        txtU_stId.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel1.add(txtU_stId, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 50, 300, 35));

        btnU_search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnU_search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnU_search.setText("Search");
        btnU_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnU_searchActionPerformed(evt);
            }
        });
        jPanel1.add(btnU_search, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 50, -1, 35));

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

        txtU_address.setColumns(20);
        txtU_address.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtU_address.setRows(5);
        jScrollPane1.setViewportView(txtU_address);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 450, 50));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Mobile No:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Living Status:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 550, -1, -1));

        jPanel1.add(cmdboxRoom, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 160, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtU_studentNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtU_studentNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtU_studentNameActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnU_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU_searchActionPerformed
        if(txtU_stId.getText().length()!=0){
            int st_id = Integer.parseInt(txtU_stId.getText());
            
            cmdboxRoom.removeAllItems();
            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select *from student where s_id="+st_id);
                if(rs.next()){
                    txtU_stId.setEditable(false);
                    txtU_studentName.setText(rs.getString(2));
                    txtU_motherName.setText(rs.getString(3));
                    txtU_fatherName.setText(rs.getString(4));
                    txtU_email.setText(rs.getString(5));
                    txtU_address.setText(rs.getString(6));
                    txtU_institute.setText(rs.getString(7));
                    txtU_nbid.setText(rs.getString(8));
                    txtU_mobileno.setText(String.valueOf(rs.getLong(9)));
                    cmdboxRoom.addItem(rs.getString(10));
                    oldRoom = rs.getString(10);
                    
                    if(rs.getString(11).equals("Living")){
                        cmbU_status.addItem("Living");
                        cmbU_status.addItem("Leaved");
                    }
                    else{
                        cmbU_status.addItem("Leaved");
                        //cmbU_status.addItem("Living");
                    }
                    
                    
                    loadUnbookedRoomID(oldRoom);
                    cmdboxRoom.setSelectedIndex(0);
                    
                    
                }
                else{
                    JOptionPane.showMessageDialog(this,"Student does not exist!");
                    clear();
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_btnU_searchActionPerformed

    private void btnU_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnU_updateActionPerformed
        int st_id = Integer.parseInt(txtU_stId.getText());
        String name = txtU_studentName.getText();
        String motherName = txtU_motherName.getText();
        String fatherName = txtU_fatherName.getText();
        String email = txtU_email.getText();
        String address = txtU_address.getText();
        String institue = txtU_institute.getText();
        String nbid = txtU_nbid.getText();
        long mobileNO = Long.parseLong(txtU_mobileno.getText());
        String status = (String)cmbU_status.getSelectedItem();
        String roomNo = (String)cmdboxRoom.getSelectedItem();
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            
            if (status.equals("Leaved")) {
                st.executeUpdate("update room set RoomStatus ='Not Booked' where Number = '"+roomNo+"' ");
            }
            if(!roomNo.equals(oldRoom)){
                System.out.println(oldRoom);
                System.out.println(roomNo);
                 st.executeUpdate("update room set RoomStatus ='Booked' where Number = '"+roomNo+"' ");
                 st.executeUpdate("update room set RoomStatus ='Not Booked' where Number = '"+oldRoom+"' ");
            }
            
            
            PreparedStatement ps = con.prepareStatement("update student set student_name=?, mother_name=?, father_name=?, email=?, address=?,institue=?,n_bid=?,mobile_no=?,roomno=?,status=? where s_id=?");
            ps.setString(1, name);
            ps.setString(2, motherName);
            ps.setString(3, fatherName);
            ps.setString(4, email);
            ps.setString(5, address);
            ps.setString(6, institue);
            ps.setString(7, nbid);
            ps.setLong(8, mobileNO);
            
            
            ps.setString(9, roomNo);
                      
            ps.setString(10, status);
            ps.setInt(11, st_id);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Sucessfully Updated");
            clear();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,e);
        }
        
    }//GEN-LAST:event_btnU_updateActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnU_search;
    private javax.swing.JButton btnU_update;
    private javax.swing.JComboBox<String> cmbU_status;
    private javax.swing.JComboBox<String> cmdboxRoom;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextArea txtU_address;
    private javax.swing.JTextField txtU_email;
    private javax.swing.JTextField txtU_fatherName;
    private javax.swing.JTextField txtU_institute;
    private javax.swing.JTextField txtU_mobileno;
    private javax.swing.JTextField txtU_motherName;
    private javax.swing.JTextField txtU_nbid;
    private javax.swing.JTextField txtU_stId;
    private javax.swing.JTextField txtU_studentName;
    // End of variables declaration//GEN-END:variables
}
