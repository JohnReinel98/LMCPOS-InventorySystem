package lmcpointofsalessystem;

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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static lmcpointofsalessystem.ManageCustomers.con;
import static lmcpointofsalessystem.ManageCustomers.s;

/**
 *
 * @author JohnReinel
 */
public class ManipulateStocks extends javax.swing.JFrame {
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
                    lblPM.setText(sdf.format(cal.getTime()));
                    lblTimes.setText("Time "+month+"/"+day+"/"+year+" "+hour+":"+minute+":"+second+"");
                    sleep(1000);
                    }
                } catch (InterruptedException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        };
        clock.start();
    }
    public void criticalStock(){
    int qua;
    String itemName;
    try {
        String sql = ("select * from Stocks");
        rs = s.executeQuery(sql);
        while(rs.next()){              
            itemName = rs.getString("ItemName");
            qua = rs.getInt("Quantity");
       
                 if(qua<=10){
           
                    JOptionPane.showMessageDialog(null,"Stocks are low (Below 10pcs): "+itemName);
                }
                 if(qua <= 0){
                     JOptionPane.showMessageDialog(null,"Insufficient stock (0 pc): "+itemName);
                 }
        }
        } catch (SQLException ex) {
        Logger.getLogger(ManipulateStocks.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    public ManipulateStocks() {
        initComponents();
        this.setLocationRelativeTo(null);
        LMCPointofSalesSystem connect = new LMCPointofSalesSystem();
        s=connect.s;
        con=connect.con;
        fillTable();
        displayID();
        Clock();
        criticalStock();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jSpinner1 = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        spnQty = new javax.swing.JSpinner();
        cmbType = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        lblItemNo = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnUpdate = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtuItemNo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtuName = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        spnuQty = new javax.swing.JSpinner();
        cmbuType = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtuPrice = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtitemno1 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblStocks = new javax.swing.JTable();
        btnrefresh4 = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        lblPM = new javax.swing.JLabel();
        lblTimes = new javax.swing.JLabel();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Stocks");

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(0, 255, 153));
        jPanel3.setForeground(new java.awt.Color(0, 255, 153));

        jPanel1.setForeground(new java.awt.Color(153, 153, 153));

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLabel1.setText("Item No.:");

        jLabel2.setText("Type:");

        jLabel3.setText("Name:");

        txtName.setName("txtName"); // NOI18N

        jLabel10.setText("Quantity: ");

        spnQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000, 1));

        cmbType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Part", "Accessory" }));
        cmbType.setName(""); // NOI18N

        jLabel8.setText("Price:");

        txtPrice.setText("0");

        lblItemNo.setText("jLabel9");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblItemNo)
                                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(spnQty)
                                    .addComponent(txtPrice)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblItemNo))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cmbType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(spnQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add Stock", jPanel1);

        btnUpdate.setBackground(new java.awt.Color(51, 255, 255));
        btnUpdate.setForeground(new java.awt.Color(0, 0, 102));
        btnUpdate.setText("Update");
        btnUpdate.setName("btnedit"); // NOI18N
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Item No.:");

        txtuItemNo.setEnabled(false);

        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Type:");

        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Name:");

        txtuName.setEnabled(false);

        jLabel11.setForeground(new java.awt.Color(0, 0, 102));
        jLabel11.setText("Quantity: ");

        spnuQty.setModel(new javax.swing.SpinnerNumberModel(0, 0, 1000000, 1));
        spnuQty.setEnabled(false);

        cmbuType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Part", "Accessory" }));
        cmbuType.setEnabled(false);

        jLabel9.setText("Price:");

        txtuPrice.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtuName)
                            .addComponent(txtuItemNo)
                            .addComponent(cmbuType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(spnuQty)
                            .addComponent(txtuPrice))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtuItemNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cmbuType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtuName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(spnuQty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtuPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addComponent(btnUpdate)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Update Stock", jPanel4);

        btnDelete.setBackground(new java.awt.Color(51, 255, 255));
        btnDelete.setForeground(new java.awt.Color(0, 0, 102));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Item No.:");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtitemno1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDelete))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtitemno1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(235, 235, 235)
                .addComponent(btnDelete)
                .addGap(0, 67, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Delete Stock", jPanel6);

        tblStocks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item Number", "Type", "Name", "Quantity", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Integer.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblStocks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblStocksMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblStocks);

        btnrefresh4.setText("Refresh");
        btnrefresh4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrefresh4ActionPerformed(evt);
            }
        });

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnrefresh4)
                        .addGap(18, 18, 18)
                        .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnback))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrefresh4)
                    .addComponent(btnback)
                    .addComponent(btnClear))
                .addContainerGap())
        );

        lblPM.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblPM.setForeground(new java.awt.Color(0, 255, 153));
        lblPM.setText("jLabel12");

        lblTimes.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblTimes.setForeground(new java.awt.Color(0, 255, 153));
        lblTimes.setText("jLabel13");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(lblTimes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblPM, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPM)
                    .addComponent(lblTimes))
                .addGap(7, 7, 7)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
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

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String type= cmbType.getSelectedItem().toString();
        String name= txtName.getText();
        Object qty = spnQty.getValue().toString();
        float price = Float.parseFloat(txtPrice.getText().toString());
        
        if (txtName.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please Input a Name !");
        } 
        else if (spnQty.getValue().equals(0))
        {
            JOptionPane.showMessageDialog(this, "Invalid Quantity (0) !");
        } 
        else if (price == 0)
        {
            JOptionPane.showMessageDialog(this, "Please Input a Price !");
        } 
        else{
        try {
            s.executeUpdate("insert into Stocks(Type,itemName,Quantity,Price) values('"+type+"','"+name+"',"+qty+","+price+")");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Successfully Added");
        fillTable();
        clear();
        try {
            String sql = "select ItemNo from Stocks";
            rs=s.executeQuery(sql);
            while(rs.next()){

                int uo = rs.getInt("ItemNo");
                int uo1 = uo + 1;
                lblItemNo.setText(String.valueOf(uo1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ManipulateStocks.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        String itemno= txtuItemNo.getText();
        String type= cmbuType.getSelectedItem().toString();
        String name= txtuName.getText();
        Object qty = Integer.parseInt(spnuQty.getValue().toString());
        float price = Float.parseFloat(txtuPrice.getText());
        //Object typ1 =  cmbuType.getSelectedItem();
        int qty1 = Integer.parseInt(spnuQty.getValue().toString());
        
        try {
            if(qty1>0){
            s.executeUpdate("Update Stocks Set Type  = '"+type+"',itemName = '"+name+"',Quantity = "+qty+", Price = "+price+" where itemNo =('"+itemno+"')");
        JOptionPane.showMessageDialog(rootPane, "Successfully Updated!");
        fillTable();
        clear();
            }
            else{
                JOptionPane.showMessageDialog(rootPane, "Out of Stock!");
            }
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        
    }//GEN-LAST:event_btnUpdateActionPerformed

    
    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        String itemno = txtitemno1.getText();

        try {
            s.executeUpdate("delete from Stocks where itemNo= ('"+itemno+"')");
        }
        catch (SQLException ex) {
            System.out.println(ex);
        }
        JOptionPane.showMessageDialog(rootPane, "Successfully Deleted!");
        fillTable();

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void tblStocksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblStocksMouseClicked
        try{
            int row = tblStocks.getSelectedRow();
            String table_click = (tblStocks.getModel().getValueAt(row, 0).toString());
            String sql = "select * from Stocks where ItemNo='"+table_click+"'";
            rs=s.executeQuery(sql);
            if(rs.next()){
                String up1 = rs.getString("ItemNo");
                txtuItemNo.setText(up1);
                txtitemno1.setText(up1);
                String up2 = rs.getString("Type");
                cmbuType.setSelectedItem(up2);
                String up3 = rs.getString("ItemName");
                txtuName.setText(up3);
                int up4 = rs.getInt("Quantity");
                spnuQty.setValue(up4);
                float up5 = rs.getFloat("Price");
                txtuPrice.setText(String.valueOf(up5));
                editables();
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tblStocksMouseClicked

    private void btnrefresh4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrefresh4ActionPerformed
        fillTable();
    }//GEN-LAST:event_btnrefresh4ActionPerformed

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        EmployeePanel ep = new EmployeePanel();
        ep.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clear();
    }//GEN-LAST:event_btnClearActionPerformed

    
    void fillTable(){
        try {
            tblModel = (DefaultTableModel)tblStocks.getModel();
            rs = s.executeQuery("Select * from  Stocks" );
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
            System.out.println("Error");
        }
       
    }
        void displayID (){
        try {
                  String sql = "select ItemNo from Stocks";
                     rs=s.executeQuery(sql);
                 while(rs.next()){
                     int uo = rs.getInt("ItemNo");
                     int uo1 = uo + 1;
                     lblItemNo.setText(String.valueOf(uo1));
                 }
             } catch (SQLException ex) {
                 Logger.getLogger(ManageEmployee.class.getName()).log(Level.SEVERE, null, ex);
             }
    }
    void editables (){
        cmbuType.setEnabled(true);
        txtuName.setEnabled(true);
        spnuQty.setEnabled(true);
        txtuPrice.setEnabled(true);
    }
    void clear(){
        cmbType.setSelectedIndex(0);
        txtName.setText("");
        spnQty.setValue(0);
        txtPrice.setText("");
        cmbuType.setSelectedIndex(0);
        txtuItemNo.setText("");
        txtuName.setText("");
        spnuQty.setValue(0);
        txtuPrice.setText("");
        cmbuType.setEnabled(false);
        txtuName.setEnabled(false);
        spnuQty.setEnabled(false);
        txtuPrice.setEnabled(false);
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
            java.util.logging.Logger.getLogger(ManipulateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManipulateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManipulateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManipulateStocks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 
                new ManipulateStocks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnrefresh4;
    private javax.swing.JComboBox<String> cmbType;
    private javax.swing.JComboBox<String> cmbuType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblItemNo;
    private javax.swing.JLabel lblPM;
    private javax.swing.JLabel lblTimes;
    private javax.swing.JSpinner spnQty;
    private javax.swing.JSpinner spnuQty;
    private javax.swing.JTable tblStocks;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtitemno1;
    private javax.swing.JTextField txtuItemNo;
    private javax.swing.JTextField txtuName;
    private javax.swing.JTextField txtuPrice;
    // End of variables declaration//GEN-END:variables
}
