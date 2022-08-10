package ui;

import com.formdev.flatlaf.FlatLightLaf;
import javax.swing.JButton;
import java.sql.*;
import hms.ConnectionProvider;
import java.awt.Color;
import java.awt.Font;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


public class ManageRoom extends javax.swing.JFrame {

    public void clear(){
        txtroomno1.setText("");
        txtroomno2.setText("");
        chk_rstatus1.setSelected(false);
        chk_rstatus.setSelected(false);
        txtroomno2.setBackground(new JButton().getBackground());
        txtroomno2.setForeground(new JButton().getForeground());
        txtroomno2.setEditable(true);
    }
    
    private void getSelectedRowData(){
        int sRow= tbl_room.getSelectedRow();
        DefaultTableModel tModel= (DefaultTableModel) tbl_room.getModel();
        
        if(sRow >= 0){
             
             txtroomno2.setText(tModel.getValueAt(sRow,0).toString());
             String activate =tModel.getValueAt(sRow, 1).toString();
             
             
             if(activate.toLowerCase().equals("yes")){
                chk_rstatus.setSelected(true);
             }
             else{
                 chk_rstatus.setSelected(false);
             }
        }
        
    } 
    
    
    private void getSearchedData(ResultSet rs){
        try {
            if(rs.next()){
                String roomNum = rs.getString("Number");
                String activate = rs.getString("Activate");
                String roomStatus = rs.getString("RoomStatus");
                
                DefaultTableModel DTM = (DefaultTableModel) tbl_room.getModel();
                DTM.setRowCount(0);
                Vector rowData = new Vector();
                rowData.add(roomNum);
                rowData.add(activate);
                rowData.add(roomStatus);
                
                DTM.addRow(rowData);
                
                
                
            }
            else{
                JOptionPane.showMessageDialog(this,"Room does not exist!!");
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void TableDetails(){
        
        DefaultTableModel DTM = (DefaultTableModel) tbl_room.getModel();
        DTM.setRowCount(0);
        
        try {
            Connection con = ConnectionProvider.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from room");
            
            while(rs.next()){
                DTM.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3)});
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public ManageRoom() {
        initComponents();
        TableDetails();
        
        tbl_room.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,18));
        tbl_room.getTableHeader().setOpaque(false);
        tbl_room.getTableHeader().setBackground(new Color(0,0,0));
        tbl_room.getTableHeader().setForeground(new Color(255,255,255));
        tbl_room.setRowHeight(40);
        tbl_room.setSelectionForeground(new Color(255,255,255));
        tbl_room.setFont(new Font("Segoe UI",Font.PLAIN,16));
   }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_room = new javax.swing.JTable();
        txtroomno1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        chk_rstatus1 = new javax.swing.JCheckBox();
        btnsave = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtroomno2 = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        chk_rstatus = new javax.swing.JCheckBox();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btn_reset = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(620, 230));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(207, 41, 103));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Add New Room");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 16, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Room Number:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 92, -1, -1));

        tbl_room.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tbl_room.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Number", "Activate", "Room Status"
            }
        ));
        tbl_room.setFocusable(false);
        tbl_room.setRowHeight(30);
        tbl_room.setSelectionBackground(new java.awt.Color(232, 57, 95));
        tbl_room.setShowVerticalLines(false);
        tbl_room.getTableHeader().setReorderingAllowed(false);
        tbl_room.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_roomMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_room);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 422, 917, 241));

        txtroomno1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtroomno1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 51)));
        txtroomno1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtroomno1KeyTyped(evt);
            }
        });
        jPanel1.add(txtroomno1, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 87, 118, 35));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Activate or Deactivate");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 92, -1, -1));

        chk_rstatus1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chk_rstatus1.setForeground(new java.awt.Color(255, 255, 255));
        chk_rstatus1.setText("Yes");
        chk_rstatus1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_rstatus1ActionPerformed(evt);
            }
        });
        jPanel1.add(chk_rstatus1, new org.netbeans.lib.awtextra.AbsoluteConstraints(599, 88, -1, -1));

        btnsave.setBackground(new java.awt.Color(255, 255, 255));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(51, 51, 51));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/save.png"))); // NOI18N
        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(836, 86, 117, 35));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 129, 988, 10));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Update & Delete Room");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 151, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Room Number:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 233, -1, -1));

        txtroomno2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtroomno2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtroomno2KeyTyped(evt);
            }
        });
        jPanel1.add(txtroomno2, new org.netbeans.lib.awtextra.AbsoluteConstraints(158, 225, 127, 40));

        btnsearch.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnsearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 224, -1, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Activate or Deactivate");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(535, 233, -1, -1));

        chk_rstatus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        chk_rstatus.setForeground(new java.awt.Color(255, 255, 255));
        chk_rstatus.setText("Yes");
        chk_rstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk_rstatusActionPerformed(evt);
            }
        });
        jPanel1.add(chk_rstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(745, 229, -1, -1));

        btnupdate.setBackground(new java.awt.Color(255, 255, 255));
        btnupdate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/update2.png"))); // NOI18N
        btnupdate.setText("Update");
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, 170, 40));

        btndelete.setBackground(new java.awt.Color(255, 255, 255));
        btndelete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(781, 286, 170, 40));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 337, 988, 10));

        jLabel7.setFont(new java.awt.Font("Tempus Sans ITC", 1, 28)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ROOMS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 356, -1, -1));

        jButton5.setBackground(new java.awt.Color(207, 41, 103));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close2.png"))); // NOI18N
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 0, -1, -1));

        btn_reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_reset.setText("Reset");
        btn_reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_resetActionPerformed(evt);
            }
        });
        jPanel1.add(btn_reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 170, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk_rstatus1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_rstatus1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_rstatus1ActionPerformed

    private void chk_rstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk_rstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chk_rstatusActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        if(txtroomno2.getText().length()!=0){
            
            String roomnumber = txtroomno2.getText();

            try {
                Connection con = ConnectionProvider.getCon();
                Statement st = con.createStatement();
                st.executeUpdate("delete from room where Number='"+roomnumber+"'");
                JOptionPane.showMessageDialog(null,"Successfully Deleted");
                TableDetails();
                clear();
            } catch (Exception e) {

                JOptionPane.showMessageDialog(null, e);
            }
        }
        else{
            JOptionPane.showMessageDialog(null,"No Record Selected!");
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        if(txtroomno1.getText().length()!=0){
            
                String roomnumber = txtroomno1.getText();
                String activate;
                String roomstatus = "Not Booked";

                if(chk_rstatus1.isSelected()){
                    activate= "Yes";
                }
                else{
                    activate ="No";
                }
                try {
                    Connection con = ConnectionProvider.getCon();
                    PreparedStatement ps = con.prepareStatement("insert into room values(?,?,?)");
                    ps.setString(1, roomnumber);
                    ps.setString(2, activate);
                    ps.setString(3, roomstatus);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Sucessfully Updated");
                    TableDetails();
                    clear();

                }
                catch (Exception e) 
                {
                    JOptionPane.showMessageDialog(null, "Room Already Exist!");
                }
        }
        else{
            JOptionPane.showMessageDialog(this, "Room Number Can not be Empty!");
        }
        
        
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        /*
        if(txtroomno2.getText().length()!=0){
                        String roomnumber = txtroomno2.getText();

                    int i = 0;
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        ResultSet rs = st.executeQuery("select *from room where Number ='"+roomnumber+"'");
                        while(rs.next()){
                            i= 1;
                            if(rs.getString(3).equals("Booked")){
                                JOptionPane.showMessageDialog(null,"This room is Booked");
                                clear();
                            }
                            else{
                                txtroomno2.setEditable(true);
                                txtroomno2.setForeground(Color.red);
                                txtroomno2.setBackground(Color.PINK);
                                if(rs.getString(2).equals("yes")){
                                    chk_rstatus.setSelected(true);
                                }
                                else{
                                    chk_rstatus.setSelected(false);
                                }
                            }
                        }
                        if(i==0){
                            JOptionPane.showMessageDialog(this, "Room doesnt Exit!");
                            clear();
                        }
                    } catch (Exception e) {
                }
                   
                    
        }
        else{
            JOptionPane.showMessageDialog(this,"Field is empty!");
        }*/
        
        if(txtroomno2.getText().length()!=0){
        
        Connection con = ConnectionProvider.getCon();
        Statement st;
        try {
            st = con.createStatement();
            String roomnumber = txtroomno2.getText();
            ResultSet rs = st.executeQuery("select *from room where Number ='"+roomnumber+"'");
            getSearchedData(rs);
            
           
            
            
        } catch (SQLException ex) {
            Logger.getLogger(ManageRoom.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        }
        else{
            TableDetails();
        }
        
   
        
        
    }//GEN-LAST:event_btnsearchActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if(txtroomno2.getText().length()!=0){


                    String roomnumber = txtroomno2.getText();
                    String activate;
                    if(chk_rstatus.isSelected()){
                        activate ="Yes";
                    }
                    else{
                        activate = "No";
                    }
                    try {
                        Connection con = ConnectionProvider.getCon();
                        Statement st = con.createStatement();
                        st.executeUpdate("update room set Activate = '"+activate+"' where Number ='"+roomnumber+"'");
                        JOptionPane.showMessageDialog(null,"Successfully Updated.");
                        TableDetails();
                        clear();
                    } catch (Exception e) {

                        JOptionPane.showMessageDialog(null, e);
                    }
        }
        else{
            JOptionPane.showMessageDialog(this,"No Record Selected!");
        }
  
    }//GEN-LAST:event_btnupdateActionPerformed

    private void txtroomno2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtroomno2KeyTyped
        char ch = evt.getKeyChar();
        if(Character.isAlphabetic(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_txtroomno2KeyTyped

    private void txtroomno1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtroomno1KeyTyped
        char ch = evt.getKeyChar();
        if(Character.isAlphabetic(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_txtroomno1KeyTyped

    private void tbl_roomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_roomMouseClicked
        getSelectedRowData();
    }//GEN-LAST:event_tbl_roomMouseClicked

    private void btn_resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_resetActionPerformed
        this.dispose();
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_btn_resetActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
         try {
    UIManager.setLookAndFeel( new FlatLightLaf() );
    } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageRoom().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_reset;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton btnupdate;
    private javax.swing.JCheckBox chk_rstatus;
    private javax.swing.JCheckBox chk_rstatus1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbl_room;
    private javax.swing.JTextField txtroomno1;
    private javax.swing.JTextField txtroomno2;
    // End of variables declaration//GEN-END:variables
}
