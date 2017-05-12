package lmcpointofsalessystem;

import java.io.IOException;
import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static lmcpointofsalessystem.ManipulateStocks.con;
import static lmcpointofsalessystem.ManipulateStocks.s;

/**
 *
 * @author JohnReinel
 */
public class PoweruserBlockUnblock extends javax.swing.JFrame {
public static Statement s;
    public static Connection con;
    ResultSet rs;
    DefaultTableModel tblModel = new DefaultTableModel();
    
    public void Clock (){
        Thread clock = new Thread(){
            public void run(){
                try {
                    while(true){
                    Calendar cal = new GregorianCalendar();
                    int day=cal.get(Calendar.DAY_OF_MONTH);
                    int month=cal.get(Calendar.MONTH);
                    int year=cal.get(Calendar.YEAR);
        
                    int second=cal.get(Calendar.SECOND);
                    int minute=cal.get(Calendar.MINUTE);
                    int hour=cal.get(Calendar.HOUR);
                    SimpleDateFormat sdf = new SimpleDateFormat("a");
                    lblAM.setText(sdf.format(cal.getTime()));
                    lblTime.setText("Time "+month+"/"+day+"/"+year+" "+hour+":"+minute+":"+second+"");
                    sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
    }

    public PoweruserBlockUnblock() {
        LMCPointofSalesSystem connect = new LMCPointofSalesSystem();
        s=connect.s;
        con=connect.con;
        initComponents();
        this.setLocationRelativeTo(null);
        fillTable();
        Clock();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jtpEmployee = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        cmbbuYN = new javax.swing.JComboBox<>();
        btnbuSave = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        txtbuID = new javax.swing.JTextField();
        txtbuUser = new javax.swing.JTextField();
        txtSearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnGo = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnrefresh = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblAM = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        jlabelsisiw = new javax.swing.JLabel();
        lblUsern = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Manage Employees");
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel6.setBackground(new java.awt.Color(0, 255, 153));

        tblEmp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee ID", "First Name", "Last Name", "Username", "Password", "Address", "Contact Number", "Type", "Block Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmpMouseClicked(evt);
            }
        });
        jScrollPane5.setViewportView(tblEmp);
        if (tblEmp.getColumnModel().getColumnCount() > 0) {
            tblEmp.getColumnModel().getColumn(0).setResizable(false);
            tblEmp.getColumnModel().getColumn(1).setResizable(false);
            tblEmp.getColumnModel().getColumn(2).setResizable(false);
            tblEmp.getColumnModel().getColumn(3).setResizable(false);
            tblEmp.getColumnModel().getColumn(4).setResizable(false);
            tblEmp.getColumnModel().getColumn(5).setResizable(false);
            tblEmp.getColumnModel().getColumn(6).setResizable(false);
            tblEmp.getColumnModel().getColumn(7).setResizable(false);
            tblEmp.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel19.setText("Block:");

        cmbbuYN.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No", "Yes" }));

        btnbuSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_edit.png"))); // NOI18N
        btnbuSave.setText("Save");
        btnbuSave.setToolTipText("Blocks or Unblocks Employee");
        btnbuSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbuSaveActionPerformed(evt);
            }
        });

        jLabel20.setText("Employee ID:");

        jLabel22.setText("Username:");

        txtbuID.setEnabled(false);

        txtbuUser.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbuSave)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel22)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtbuID)
                            .addComponent(txtbuUser, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE)
                            .addComponent(cmbbuYN, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(66, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtbuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtbuUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(cmbbuYN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnbuSave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(284, Short.MAX_VALUE))
        );

        jtpEmployee.addTab("Block or Unblock", jPanel2);

        jLabel1.setText("Search Employee ID:");

        btnGo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_view.png"))); // NOI18N
        btnGo.setText("Search");
        btnGo.setToolTipText("Search one Employee");
        btnGo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoActionPerformed(evt);
            }
        });

        btnViewAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_view.png"))); // NOI18N
        btnViewAll.setText("View All");
        btnViewAll.setToolTipText("View All Employees");
        btnViewAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllActionPerformed(evt);
            }
        });

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_back.png"))); // NOI18N
        btnback.setText("Back");
        btnback.setToolTipText("Back to Admin Panel");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnrefresh.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_refresh.png"))); // NOI18N
        btnrefresh.setText("Refresh");
        btnrefresh.setToolTipText("Refreshes the Table");
        btnrefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefreshActionPerformed(evt);
            }
        });

        btnClear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_clear.png"))); // NOI18N
        btnClear.setText("Clear");
        btnClear.setToolTipText("Clears the fields");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnback)
                        .addGap(34, 34, 34)
                        .addComponent(btnrefresh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtpEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnGo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnViewAll))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtpEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblAM.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblAM.setForeground(new java.awt.Color(0, 255, 153));
        lblAM.setText("jLabel1");

        lblTime.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 255, 153));
        lblTime.setText("jLabel19");

        jlabelsisiw.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jlabelsisiw.setForeground(new java.awt.Color(255, 255, 255));
        jlabelsisiw.setText("Login in as:");

        lblUsern.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblUsern.setForeground(new java.awt.Color(0, 255, 153));
        lblUsern.setText("Power User");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jlabelsisiw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsern)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAM)))
                .addGap(0, 45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlabelsisiw)
                    .addComponent(lblUsern)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblAM)
                        .addComponent(lblTime)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        fillTable();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        try{
            int row = tblEmp.getSelectedRow();
            String table_click = (tblEmp.getModel().getValueAt(row, 0).toString());
            
            String sql = "select * from Employees where empID='"+table_click+"'";
            rs=s.executeQuery(sql);
            
             if(rs.next()){
                String up1 = rs.getString("empID");
                String up2 = rs.getString("Username");
                String up8 = rs.getString("BlockStatus");
                txtbuID.setText(up1);
                txtbuUser.setText(up2);
                cmbbuYN.setSelectedItem(up8);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        JFrame msg = new JFrame();
        int f = JOptionPane.showConfirmDialog(msg, "Do you want to logout?", "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (f==0){
            Login lg = new Login();
            lg.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnGoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoActionPerformed
        String search = txtSearch.getText();
        String ID="";
        if(search.trim().equals("")){
            JOptionPane.showMessageDialog(null, "Input a valid Employee ID!");
            txtSearch.setText("");
        }
        if(Pattern.matches("[a-zA-Z]+",search)==true && search.length() >= 1){
            JOptionPane.showMessageDialog(null, "Input a valid Employee ID!");
            txtSearch.setText("");
        }
        else{
            try {
                String sql = "select * from Employees where empID='"+search+"'";
                rs=s.executeQuery(sql);
                if(rs.next()){
                    ID = rs.getString("empID");
                    tblModel = (DefaultTableModel)tblEmp.getModel();
                    rs = s.executeQuery("select * from Employees where empID='"+search+"'" );
                    ResultSetMetaData md = rs.getMetaData();
                    int row = tblModel.getRowCount();
                    while(row>0)
                    {
                        row--;
                        tblModel.removeRow(row);
                    }
                    int colcount = md.getColumnCount();
                    Object[] data = new Object[colcount];
                    while(rs.next()){
                    for(int i=1;i<=colcount;i++){
                    data[i-1] = rs.getString(i);
                    }
                    tblModel.addRow(data);
                    }
                    txtSearch.setText("");
                }
                    else{
                    JOptionPane.showMessageDialog(null, "ID doesn't exist");
                    fillTable();
                    }
                
            } catch (SQLException ex) {
                Logger.getLogger(ManageEmployee.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   

        
    }//GEN-LAST:event_btnGoActionPerformed

    private void btnbuSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbuSaveActionPerformed
        String bu = cmbbuYN.getSelectedItem().toString();
        String id = txtbuID.getText();
    try {
        if(txtbuID.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please select one employee from the table");
        }
        else if(txtbuUser.getText().trim().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Please select one employee from the table");
        }
        else{
            if(cmbbuYN.getSelectedItem().equals("Yes")){
                s.executeUpdate("update Employees set BlockStatus = '"+bu+"' where empID = "+id+"");
                JOptionPane.showMessageDialog(rootPane, "Successfully Blocked!");
                fillTable();
                txtbuID.setText("");
                txtbuUser.setText("");
                cmbbuYN.setSelectedItem("No");
            }else if(cmbbuYN.getSelectedItem().equals("No")){
                s.executeUpdate("update Employees set BlockStatus = '"+bu+"' where empID = "+id+"");
                JOptionPane.showMessageDialog(rootPane, "Successfully Unblocked!");
                fillTable();
                txtbuID.setText("");
                txtbuUser.setText("");
                cmbbuYN.setSelectedItem("No");
            }
        }
    } catch (SQLException ex) {
        Logger.getLogger(ManageEmployee.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_btnbuSaveActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        fillTable();
    }//GEN-LAST:event_btnViewAllActionPerformed

    
     void fillTable(){
        try {
            String tmpID = Login.tmpID;
            tblModel = (DefaultTableModel)tblEmp.getModel();
            rs = s.executeQuery("Select * from  Employees");
            
            ResultSetMetaData md = rs.getMetaData();
            int row = tblModel.getRowCount();
            while(row>0)
            {
                row--;
                tblModel.removeRow(row);
            }
            int colcount = md.getColumnCount();
            Object[] data = new Object[colcount];
            while(rs.next()){
                for(int i=1;i<=colcount;i++){
                    data[i-1] = rs.getString(i);
                }
                tblModel.addRow(data);
            }
        } catch (SQLException ex) {
            System.out.println("Error"+ex);
        }
    }
    
    void clear(){
        txtbuID.setText("");
        txtbuUser.setText("");
    }

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
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
   
                new PoweruserBlockUnblock().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbuSave;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JComboBox<String> cmbbuYN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jlabelsisiw;
    private javax.swing.JTabbedPane jtpEmployee;
    private javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUsern;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtbuID;
    private javax.swing.JTextField txtbuUser;
    // End of variables declaration//GEN-END:variables
}
