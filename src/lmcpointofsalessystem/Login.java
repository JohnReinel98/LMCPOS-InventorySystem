package lmcpointofsalessystem;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import static lmcpointofsalessystem.LMCPointofSalesSystem.con;
import static lmcpointofsalessystem.LMCPointofSalesSystem.s;

/**
 *
 * @author JohnReinel
 */
public class Login extends javax.swing.JFrame {
public static int type = 0;
    public static String pass;
    public static String userName ;
    public String id, name;
    public int block = 0;
    public String block_stat;
    ResultSet rs;
    
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
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
        LMCPointofSalesSystem lmc = new LMCPointofSalesSystem();
        s=lmc.s;
        con=lmc.con;
        Clock();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        txtUsername = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnAbout = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        lblAM = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LMC Point of Sale System");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 255, 153));

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        btnLogin.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password: ");

        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Username: ");

        btnAbout.setText("About Devs");
        btnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAboutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(btnAbout))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(159, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(217, 217, 217))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(216, 216, 216))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnExit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(btnAbout)
                .addContainerGap())
        );

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/LMCIcon.jpg"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 153));
        jLabel5.setText("LMC");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Point of Sale");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("System");

        lblTime.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblTime.setForeground(new java.awt.Color(0, 255, 153));
        lblTime.setText("jLabel7");

        lblAM.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblAM.setForeground(new java.awt.Color(0, 255, 153));
        lblAM.setText("jLabel7");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addGap(29, 29, 29))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5)
                                        .addGap(49, 49, 49)))
                                .addGap(92, 92, 92)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblTime)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblAM, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(17, 17, 17)))))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTime)
                            .addComponent(lblAM))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3)))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String c;
    String d;
    boolean flag;
    void name(){
        try {
            s = con.createStatement();
            s.executeQuery("SELECT * FROM Employees WHERE empID ='" + txtUsername.getText()+"'");
            rs = s.getResultSet();
            while(rs.next()){
                c = rs.getString("fname");
                d = rs.getString("lname");
                flag = rs.getBoolean("admin");
            }
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    String ID;
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
                
    String U;
    U = txtUsername.getText();
        if (txtUsername.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Username !");
        } 
        else if (txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Password !");
        } 
        else
        {
            try {
            rs = s.executeQuery(
          "SELECT * FROM Employees where Username ='" + U + 
          "' and Password ='" + txtPassword.getText() + "'");

            if(rs.next()) {
            String Username = rs.getString("Username");
            String Password = rs.getString("Password");
            String Admin = rs.getString("Type");

        if (Username.equals(U) & Password.equals(txtPassword.getText()) &
            Admin.equals("0")) 
        {
          final JOptionPane optionPane = new JOptionPane("Welcome " + U + "!!!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                    final JDialog dialog = new JDialog();
                   dialog.setSize(200,200);
                   dialog.setLocation(550,350);
                   dialog.setTitle("Welcome");
                   dialog.setModal(true);

                    dialog.setContentPane(optionPane);

                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.pack();

                    Timer timer = new Timer(2000, new AbstractAction() {
                        public void actionPerformed(ActionEvent ae) {
                            dialog.dispose();
                        }
                    });
                    timer.setRepeats(false);

                    timer.start();

                    dialog.setVisible(true);
                    EmployeePanel ep = new EmployeePanel();
            ep.setVisible(true);
            this.setVisible(false);

        } 
        else if (Username.equals(U) & 
            Password.equals(txtPassword.getText()) & Admin.equals("1"))
        {
            final JOptionPane optionPane = new JOptionPane("Welcome " + U + "!!!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                final JDialog dialog = new JDialog();
                    dialog.setSize(200,200);
                    dialog.setLocation(550,350);
                    dialog.setTitle("Welcome");
                    dialog.setModal(true);

                    dialog.setContentPane(optionPane);

                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.pack();

                    Timer timer = new Timer(2000, new AbstractAction() {
                        public void actionPerformed(ActionEvent ae) {
                            dialog.dispose();
                        }
                    });
                    timer.setRepeats(false);

                    timer.start();

                    dialog.setVisible(true);
                    AdminPanel ap = new AdminPanel();
                    ap.setVisible(true);
                    this.setVisible(false);
        }
      }else 
        {
            JOptionPane.showMessageDialog(this, "User not found!");
        }
    } 
    catch (Exception e)
    {
        System.out.println("error"+e);
    }
  }

    }//GEN-LAST:event_btnLoginActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
       JFrame msg = new JFrame();
        int f = JOptionPane.showConfirmDialog(msg, "Are you sure you want to exit?", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (f==0){
            System.exit(0);
        }
    }//GEN-LAST:event_btnExitActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Login log = new Login();
        
        String U;
    U = txtUsername.getText();
        if (txtUsername.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Username !");
        } 
        else if (txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Password !");
        } 
        else
        {
            try {
            rs = s.executeQuery(
          "SELECT * FROM Employees where Username ='" + U + 
          "' and Password ='" + txtPassword.getText() + "'");

            if(rs.next()) {
            String Username = rs.getString("Username");
            String Password = rs.getString("Password");
            String Admin = rs.getString("Type");

        if (Username.equals(U) & Password.equals(txtPassword.getText()) &
            Admin.equals("0")) 
        {
          final JOptionPane optionPane = new JOptionPane("Welcome " + U + "!!!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                    final JDialog dialog = new JDialog();
                   dialog.setSize(200,200);
                   dialog.setLocation(550,350);
                   dialog.setTitle("Welcome");
                   dialog.setModal(true);

                    dialog.setContentPane(optionPane);

                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.pack();

                    Timer timer = new Timer(2000, new AbstractAction() {
                        public void actionPerformed(ActionEvent ae) {
                            dialog.dispose();
                        }
                    });
                    timer.setRepeats(false);

                    timer.start();

                    dialog.setVisible(true);
                    EmployeePanel ep = new EmployeePanel();
            ep.setVisible(true);
            this.setVisible(false);

        } 
        else if (Username.equals(U) & 
            Password.equals(txtPassword.getText()) & Admin.equals("1"))
        {
            final JOptionPane optionPane = new JOptionPane("Welcome " + U + "!!!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                final JDialog dialog = new JDialog();
                    dialog.setSize(200,200);
                    dialog.setLocation(550,350);
                    dialog.setTitle("Welcome");
                    dialog.setModal(true);

                    dialog.setContentPane(optionPane);

                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.pack();

                    Timer timer = new Timer(2000, new AbstractAction() {
                        public void actionPerformed(ActionEvent ae) {
                            dialog.dispose();
                        }
                    });
                    timer.setRepeats(false);

                    timer.start();

                    dialog.setVisible(true);
                    AdminPanel ap = new AdminPanel();
                    ap.setVisible(true);
                    this.setVisible(false);
        }
      }else 
        {
            JOptionPane.showMessageDialog(this, "User not found!");
        }
    } 
    catch (Exception e)
    {
        System.out.println("error"+e);
    }
  }
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
        Login log = new Login();
        
        String U;
    U = txtUsername.getText();
        if (txtUsername.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Username !");
        } 
        else if (txtPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Password !");
        } 
        else
        {
            try {
            rs = s.executeQuery(
          "SELECT * FROM Employees where Username ='" + U + 
          "' and Password ='" + txtPassword.getText() + "'");

            if(rs.next()) {
            String Username = rs.getString("Username");
            String Password = rs.getString("Password");
            String Admin = rs.getString("Type");

        if (Username.equals(U) & Password.equals(txtPassword.getText()) &
            Admin.equals("0")) 
        {
          final JOptionPane optionPane = new JOptionPane("Welcome " + U + "!!!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                    final JDialog dialog = new JDialog();
                   dialog.setSize(200,200);
                   dialog.setLocation(550,350);
                   dialog.setTitle("Welcome");
                   dialog.setModal(true);

                    dialog.setContentPane(optionPane);

                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.pack();

                    Timer timer = new Timer(2000, new AbstractAction() {
                        public void actionPerformed(ActionEvent ae) {
                            dialog.dispose();
                        }
                    });
                    timer.setRepeats(false);

                    timer.start();

                    dialog.setVisible(true);
                    EmployeePanel ep = new EmployeePanel();
            ep.setVisible(true);
            this.setVisible(false);

        } 
        else if (Username.equals(U) & 
            Password.equals(txtPassword.getText()) & Admin.equals("1"))
        {
            final JOptionPane optionPane = new JOptionPane("Welcome " + U + "!!!", JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null, new Object[]{}, null);

                final JDialog dialog = new JDialog();
                    dialog.setSize(200,200);
                    dialog.setLocation(550,350);
                    dialog.setTitle("Welcome");
                    dialog.setModal(true);

                    dialog.setContentPane(optionPane);

                    dialog.setDefaultCloseOperation(JDialog.DO_NOTHING_ON_CLOSE);
                    dialog.pack();

                    Timer timer = new Timer(2000, new AbstractAction() {
                        public void actionPerformed(ActionEvent ae) {
                            dialog.dispose();
                        }
                    });
                    timer.setRepeats(false);

                    timer.start();

                    dialog.setVisible(true);
                    AdminPanel ap = new AdminPanel();
                    ap.setVisible(true);
                    this.setVisible(false);
        }
      }else 
        {
            JOptionPane.showMessageDialog(this, "User not found!");
        }
    } 
    catch (Exception e)
    {
        System.out.println("error"+e);
    }
  }
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void btnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAboutActionPerformed
        AboutDevs devs = new AboutDevs();
        devs.setVisible(true);
        this.hide();
    }//GEN-LAST:event_btnAboutActionPerformed

    public boolean checkLogin(String username, String password){
        
        boolean check = false;
        try {
            s = con.createStatement();
        String query = "Select empNo, Fname, Lname from admin where username='"+username+"' and password ='"+password+"'";
            rs = s.executeQuery(query);
            while(rs.next()){
                check = true;
                id = rs.getString(1);
                name = rs.getString(2) + " " + rs.getString(3);
                block_stat = rs.getString(4);
            }
            
            if(check == false){
                JOptionPane.showMessageDialog(rootPane, "Invalid Username or Password", "Invalid", JOptionPane.OK_OPTION);
                block += 1;
            }
            
            if(block == 3){
                String sql = "update admin set block = 'true' where empNo = '"+id+"'";
                s.executeUpdate(sql);
                JOptionPane.showMessageDialog(rootPane, "Invalid Username or Password", "Warning", JOptionPane.OK_OPTION);
            }
            
            
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        return check;
    }
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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAbout;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
