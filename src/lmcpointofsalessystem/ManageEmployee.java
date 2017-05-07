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
public class ManageEmployee extends javax.swing.JFrame {
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

    public ManageEmployee() {
        LMCPointofSalesSystem connect = new LMCPointofSalesSystem();
        s=connect.s;
        con=connect.con;
        initComponents();
        this.setLocationRelativeTo(null);
        lblUsern.setText(Login.U);
        fillTable();
        Clock();
        displayID();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEmp = new javax.swing.JTable();
        jtpEmployee = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtaFname = new javax.swing.JTextField();
        txtaLname = new javax.swing.JTextField();
        txtaUsername = new javax.swing.JTextField();
        txtaAddress = new javax.swing.JTextField();
        txtaContact = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtaPassword = new javax.swing.JPasswordField();
        txtaConfPass = new javax.swing.JPasswordField();
        lblaID = new javax.swing.JLabel();
        cbShow = new javax.swing.JCheckBox();
        btnrefresh = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtuID = new javax.swing.JTextField();
        txtuFname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtuLname = new javax.swing.JTextField();
        txtuUsername = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtuPassword = new javax.swing.JPasswordField();
        txtuAddress = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtuContact = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        lblValid = new javax.swing.JLabel();
        txtuConfPass = new javax.swing.JPasswordField();
        cbuShow = new javax.swing.JCheckBox();
        jPanel5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        txtdDelete = new javax.swing.JTextField();
        btnDelete = new javax.swing.JButton();
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

        jLabel2.setText("Employee ID: ");

        jLabel3.setText("First Name: ");

        jLabel4.setText("Last Name: ");

        jLabel5.setText("Username: ");

        jLabel6.setText("Password: ");

        jLabel7.setText("Address: ");

        jLabel8.setText("Contact No.:");

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_add.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setToolTipText("Adds new Employee");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel18.setText("Confirm Password:");

        lblaID.setText("jLabel1");

        cbShow.setText("Show Password");
        cbShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbShowActionPerformed(evt);
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

        btnback.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_back.png"))); // NOI18N
        btnback.setText("Back");
        btnback.setToolTipText("Back to Admin Panel");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel17))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addGap(18, 18, 18)
                                .addComponent(btnrefresh)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnClear))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtaContact))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                                        .addComponent(txtaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtaLname))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtaFname))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(lblaID))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtaPassword)
                                            .addComponent(txtaUsername)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel18)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtaConfPass)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbShow))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnback)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblaID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtaFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtaLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtaUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtaPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtaConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbShow))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtaAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtaContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnrefresh, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnback, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        jtpEmployee.addTab("Add Employee", jPanel3);

        jLabel9.setText("Employee ID: ");

        txtuID.setEnabled(false);

        txtuFname.setEditable(false);
        txtuFname.setEnabled(false);

        jLabel10.setText("First Name: ");

        jLabel11.setText("Last Name: ");

        txtuLname.setEditable(false);
        txtuLname.setEnabled(false);

        txtuUsername.setEditable(false);
        txtuUsername.setEnabled(false);

        jLabel12.setText("Username: ");

        jLabel13.setText("Password: ");

        txtuPassword.setEditable(false);
        txtuPassword.setToolTipText("");
        txtuPassword.setEnabled(false);

        txtuAddress.setEditable(false);
        txtuAddress.setEnabled(false);

        jLabel14.setText("Address: ");

        jLabel15.setText("Contact Number: ");

        txtuContact.setEditable(false);
        txtuContact.setEnabled(false);

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_edit.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.setToolTipText("Updates Employee");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel21.setText("Confirm Password:");

        txtuConfPass.setEditable(false);
        txtuConfPass.setEnabled(false);

        cbuShow.setText("Show Password");
        cbuShow.setEnabled(false);
        cbuShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbuShowActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel9)
                .addGap(12, 12, 12)
                .addComponent(txtuID, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(txtuFname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(txtuLname, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(txtuUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel13)
                .addGap(19, 19, 19)
                .addComponent(txtuPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel21)
                .addGap(6, 6, 6)
                .addComponent(txtuConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbuShow))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(313, 313, 313)
                .addComponent(lblValid))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel14)
                .addGap(40, 40, 40)
                .addComponent(txtuAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(txtuContact, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnUpdate))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel9))
                    .addComponent(txtuID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(txtuFname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel11))
                    .addComponent(txtuLname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel12))
                    .addComponent(txtuUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel13))
                    .addComponent(txtuPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtuConfPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbuShow)))
                .addGap(3, 3, 3)
                .addComponent(lblValid)
                .addGap(6, 6, 6)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel14))
                    .addComponent(txtuAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jLabel15))
                    .addComponent(txtuContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jtpEmployee.addTab("Update Employee", jPanel4);

        jLabel16.setText("Employee ID: ");

        txtdDelete.setEnabled(false);

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_delete.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setToolTipText("Deletes one Employee");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDelete)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtdDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(364, Short.MAX_VALUE))
        );

        jtpEmployee.addTab("Delete Employee", jPanel5);

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
                .addContainerGap(279, Short.MAX_VALUE))
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

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtpEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(120, 120, 120)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnGo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnViewAll))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 712, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
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
                .addContainerGap(41, Short.MAX_VALUE))
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
        lblUsern.setText("jLabel24");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jlabelsisiw)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblUsern)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTime)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblAM)))
                .addGap(0, 38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAM)
                    .addComponent(lblTime)
                    .addComponent(jlabelsisiw)
                    .addComponent(lblUsern))
                .addGap(12, 12, 12)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String EmpId = lblaID.getText();
        String FName = txtaFname.getText();
        String LName = txtaLname.getText();
        String username = txtaUsername.getText();
        String password = txtaPassword.getText();
        String password1 = txtaConfPass.getText();
        String address = txtaAddress.getText();
        String contact = txtaContact.getText();
        //int contacts = Integer.parseInt(txtaContact.getText());
        String type = "0";
        String block = "no";
        if (txtaFname.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a First name !");
        } 
        else if (txtaLname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Last name !");
        } 
        else if (txtaUsername.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Username !");
        } 
        else if (txtaPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Password !");
        } 
        else if (txtaAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Address !");
        } 
        else if (txtaContact.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Contact !");
        }
        else if(Pattern.matches("[a-zA-Z]+",contact)==true&& contact.length() >= 1){
            JOptionPane.showMessageDialog(null, "Please Input a Phone Number!");
            txtaContact.setText("");
        }
        else if(contact.length()  <11 || contact.length() > 11){
            JOptionPane.showMessageDialog(null, "Please Input 11 Numbers");
        }
        else{
         try {
                s.executeUpdate("insert into Employees (FName,LName,Username,Password,Address,Contact,Type,BlockStatus) values ('"+FName+"','"+LName+"','"+username+"','"+password+"','"+address+"','"+contact+"','"+type+"','"+block+"')");
             
        }catch (SQLException ex) {
            System.out.println(ex);
        }
        if(!password.equals(password1)){
            JOptionPane.showMessageDialog(rootPane, "Password does not match!");
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "Employee ID: " + EmpId + "\n" + "Successfully Added");
        fillTable();
        clear();
             try {
                  String sql = "select empID from Employees";
                     rs=s.executeQuery(sql);
                 while(rs.next()){
                    
                     int uo = rs.getInt("empID");
                     int uo1 = uo + 1;
                     lblaID.setText(String.valueOf(uo1));
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(ManageEmployee.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnrefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefreshActionPerformed
        fillTable();
    }//GEN-LAST:event_btnrefreshActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String EmpId = txtuID.getText();
        String FName = txtuFname.getText();
        String LName = txtuLname.getText();
        String username = txtuUsername.getText();
        String password = txtuPassword.getText();
        String password1 = txtuConfPass.getText();
        String address = txtuAddress.getText();
        String contact = txtuContact.getText();
       
        if(txtuID.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input an ID !");
        }
        else if (txtuFname.getText().trim().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a First name !");
        } 
        else if (txtuLname.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Last name !");
        } 
        else if (txtuUsername.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Username !");
        } 
        else if (txtuPassword.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Password !");
        } 
        else if (txtuAddress.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Address !");
        } 
        else if (txtuContact.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Contact !");
        }
        else if(Pattern.matches("[a-zA-Z]+",contact)==true&& contact.length() >= 1){
            JOptionPane.showMessageDialog(null, "Please Input a Phone Number!");
            txtaContact.setText("");
        }
        else if(contact.length()  <11 || contact.length() > 11){
            JOptionPane.showMessageDialog(null, "Please Input 11 Numbers");
        }
        else{
        try {
            s.executeUpdate("Update Employees Set FName  = '"+FName+"',LName = '"+LName+"',Username = '"+username+"',Password = '"+password+"', Address = '"+address+"',Contact = '"+contact+"' where empID =('"+EmpId+"')");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        if(!password.equals(password1)){
            JOptionPane.showMessageDialog(rootPane, "Password does not match!");
        }
        else{
        JOptionPane.showMessageDialog(rootPane, "Employee ID: " + EmpId + "\n" + "Successfully Updated");
        fillTable();
        clear();
        }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
         String EmpId = txtdDelete.getText();
         
        JFrame msg = new JFrame();
        int f = JOptionPane.showConfirmDialog(msg, "Delete Record? This can not be undone!", "Delete", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (f==0){
           try {
            String sql = "select * from Employees where empID='"+EmpId+"'";
            rs=s.executeQuery(sql);
            if(rs.next()){
            String ID = rs.getString("empID");
            String Fname = rs.getString("Fname");
            String Lname = rs.getString("Lname");
            String Usern = rs.getString("Username");
            String Passw = rs.getString("Password");
            String Addr = rs.getString("Address");
            String Contact = rs.getString("Contact");
            int type = rs.getInt("Type");
            String BlockStatus = rs.getString("BlockStatus");
                if(EmpId.equals(ID)){
                    s.executeUpdate("insert into ArchivedEmployees values('"+ID+"','"+Fname+"','"+Lname+"','"+Usern+"','"+Passw+"','"+Addr+"','"+Contact+"',"+type+",'"+BlockStatus+"')");
                    s.executeUpdate("delete from Employees where empID= ('"+EmpId+"')");
                    JOptionPane.showMessageDialog(rootPane, "Employee ID: " + EmpId + "\n" + "Successfully Archived!");
                    clear();
                    fillTable();
                }
            }
            else{
            JOptionPane.showMessageDialog(rootPane, "ID not found!");
            }
        }catch (SQLException ex) {
            System.out.println(ex);
        }
        
        }  
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    private void tblEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmpMouseClicked
        try{
            int row = tblEmp.getSelectedRow();
            String table_click = (tblEmp.getModel().getValueAt(row, 0).toString());
            
            JFrame msg = new JFrame();
            String[] options = new String[3];
            options[0] = new String("Update");
            options[1] = new String("Delete");
            options[2] = new String("Block/Unblock");
            int f = JOptionPane.showOptionDialog(msg.getContentPane(), "Which operation you want?", "Choose", 0,JOptionPane.INFORMATION_MESSAGE,null, options, null);
            if (f==0){
                jtpEmployee.setSelectedIndex(1);
            }if(f==1){
                jtpEmployee.setSelectedIndex(2);
            }if(f==2){
                jtpEmployee.setSelectedIndex(3);
            }
            
            String sql = "select * from Employees where empID='"+table_click+"'";
            rs=s.executeQuery(sql);
            txtuID.enable(false);
             if(rs.next()){
                String up1 = rs.getString("empID");
                txtuID.setText(up1);
                txtbuID.setText(up1);
                txtdDelete.setText(up1);
                String up2 = rs.getString("Fname");
                txtuFname.setText(up2);
                String up3 = rs.getString("Lname");
                txtuLname.setText(up3);
                String up4 = rs.getString("Username");
                txtuUsername.setText(up4);
                txtbuUser.setText(up4);
                String up5 = rs.getString("Password");
                txtuPassword.setText(up5);
                String up6 = rs.getString("Address");
                txtuAddress.setText(up6);
                String up7 = rs.getString("Contact");
                txtuContact.setText(up7);
                String up8 = rs.getString("BlockStatus");
                cmbbuYN.setSelectedItem(up8);
                editables();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }//GEN-LAST:event_tblEmpMouseClicked

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        this.dispose();
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
                txtuID.enable(false);
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

    private void cbShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbShowActionPerformed
        if(cbShow.isSelected()){
            txtaPassword.setEchoChar((char)0);
            txtaConfPass.setEchoChar((char)0);
        }
        else{
            txtaPassword.setEchoChar('*');
            txtaConfPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cbShowActionPerformed

    private void cbuShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbuShowActionPerformed
        if(cbuShow.isSelected()){
            txtuPassword.setEchoChar((char)0);
            txtuConfPass.setEchoChar((char)0);
        }
        else{
            txtuPassword.setEchoChar('*');
            txtuConfPass.setEchoChar('*');
        }
    }//GEN-LAST:event_cbuShowActionPerformed

    
     void fillTable(){
        try {
            String tmpID = Login.tmpID;
            tblModel = (DefaultTableModel)tblEmp.getModel();
            rs = s.executeQuery("Select * from  Employees where empID!= "+tmpID+"" );
            //rs = s.executeQuery("Select * from  Employees" );
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
    
    
    void displayID (){
        try {
                  String sql = "select empID from Employees";
                     rs=s.executeQuery(sql);
                 while(rs.next()){
                     int uo = rs.getInt("empID");
                     int uo1 = uo + 1;
                     lblaID.setText(String.valueOf(uo1));
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(ManageEmployee.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
    void clear(){
        txtaFname.setText("");
        txtaLname.setText("");
        txtaUsername.setText("");
        txtaPassword.setText("");
        txtaConfPass.setText("");
        txtaContact.setText("");
        txtaAddress.setText("");
        txtuID.setText("");
        txtuFname.setText("");
        txtuLname.setText("");
        txtuUsername.setText("");
        txtuPassword.setText("");
        txtuConfPass.setText("");
        txtuContact.setText("");
        txtuAddress.setText("");
        txtdDelete.setText("");
        txtuFname.setEditable(false);
        txtuLname.setEditable(false);
        txtuUsername.setEditable(false);
        txtuPassword.setEditable(false);
        txtuConfPass.setEditable(false);
        txtuAddress.setEditable(false);
        txtuContact.setEditable(false);
        txtuFname.setEnabled(false);
        txtuLname.setEnabled(false);
        txtuUsername.setEnabled(false);
        txtuPassword.setEnabled(false);
        txtuConfPass.setEnabled(false);
        txtuAddress.setEnabled(false);
        txtuContact.setEnabled(false);
        //cbShow.setEnabled(false);
        cbuShow.setEnabled(false);
        txtbuID.setText("");
        txtbuUser.setText("");
    }
    
    void editables (){
        txtaFname.setEditable(true);
        txtaLname.setEditable(true);
        txtaUsername.setEditable(true);
        txtaPassword.setEditable(true);
        txtaConfPass.setEditable(true);
        txtaAddress.setEditable(true);
        txtaContact.setEditable(true);
        txtuID.setEditable(true);
        txtuFname.setEditable(true);
        txtuLname.setEditable(true);
        txtuUsername.setEditable(true);
        txtuPassword.setEditable(true);
        txtuConfPass.setEditable(true);
        txtuAddress.setEditable(true);
        txtuContact.setEditable(true);
        txtuFname.setEnabled(true);
        txtuLname.setEnabled(true);
        txtuUsername.setEnabled(true);
        txtuPassword.setEnabled(true);
        txtuConfPass.setEnabled(true);
        txtuAddress.setEnabled(true);
        txtuContact.setEnabled(true);
        cbShow.setEnabled(true);
        cbuShow.setEnabled(true);
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
                
   
                new ManageEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnGo;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnbuSave;
    private javax.swing.JButton btnrefresh;
    private javax.swing.JCheckBox cbShow;
    private javax.swing.JCheckBox cbuShow;
    private javax.swing.JComboBox<String> cmbbuYN;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel jlabelsisiw;
    private javax.swing.JTabbedPane jtpEmployee;
    private javax.swing.JLabel lblAM;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblUsern;
    private javax.swing.JLabel lblValid;
    private javax.swing.JLabel lblaID;
    private javax.swing.JTable tblEmp;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtaAddress;
    private javax.swing.JPasswordField txtaConfPass;
    private javax.swing.JTextField txtaContact;
    private javax.swing.JTextField txtaFname;
    private javax.swing.JTextField txtaLname;
    private javax.swing.JPasswordField txtaPassword;
    private javax.swing.JTextField txtaUsername;
    private javax.swing.JTextField txtbuID;
    private javax.swing.JTextField txtbuUser;
    private javax.swing.JTextField txtdDelete;
    private javax.swing.JTextField txtuAddress;
    private javax.swing.JPasswordField txtuConfPass;
    private javax.swing.JTextField txtuContact;
    private javax.swing.JTextField txtuFname;
    private javax.swing.JTextField txtuID;
    private javax.swing.JTextField txtuLname;
    private javax.swing.JPasswordField txtuPassword;
    private javax.swing.JTextField txtuUsername;
    // End of variables declaration//GEN-END:variables
}
