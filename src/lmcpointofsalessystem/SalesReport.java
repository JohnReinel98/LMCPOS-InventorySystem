package lmcpointofsalessystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author JohnReinel
 */
public class SalesReport extends javax.swing.JFrame {
    public static Statement s;
    public static Connection con;
    ResultSet rs;
    public SalesReport() {
        initComponents();
        this.setLocationRelativeTo(null);
        LMCPointofSalesSystem connect = new LMCPointofSalesSystem();
        s=connect.s;
        con=connect.con;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnDailyProfits = new javax.swing.JButton();
        btnDailyItems = new javax.swing.JButton();
        btnPieChart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Profits");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sales Report");

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));

        btnDailyProfits.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/ic_profits.png"))); // NOI18N
        btnDailyProfits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyProfitsActionPerformed(evt);
            }
        });

        btnDailyItems.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/ic_dailyitems.png"))); // NOI18N
        btnDailyItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyItemsActionPerformed(evt);
            }
        });

        btnPieChart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/ic_pie.png"))); // NOI18N
        btnPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPieChartActionPerformed(evt);
            }
        });

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/lmcpointofsalessystem/Assets/Small Icons/ic_back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Items Sold");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Pie Chart");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Profits");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(btnDailyProfits, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnDailyItems, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1)))
                .addGap(63, 63, 63)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel2))
                    .addComponent(btnPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(btnDailyProfits, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPieChart, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDailyItems, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
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

    private void btnDailyItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyItemsActionPerformed
        String sql = "SELECT * FROM Sales";
        
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        
        try{
            
            rs =s.executeQuery(sql);
            
            Map<String,Integer> m =new TreeMap<String,Integer>();
            
            int quantity=0;
            //float sp=0;
            //float bp=0;
            String qua="",sprice="",bprice="";
            String date = "";
            while(rs.next()){
                
               qua = rs.getString(5);
               /*sprice = rs.getString(4);
               bprice = rs.getString(5);*/
               date = rs.getString("Date");
               date= date.substring(0, 7);
               
               //quantity=quantity+Integer.parseInt(qua);
               
               /*sp = sp + Float.parseFloat(sprice);
               bp = bp + Float.parseFloat(bprice);*/
               
               Integer oldVal = m.get(date);
               
               if(oldVal == null)
                {
                    m.put(date,Integer.parseInt(qua));
                }
                else
                {
                    m.put(date,oldVal+Integer.parseInt(qua));
                }
               
               
               
               
            }
            
            for(Map.Entry ma:m.entrySet()){  
            //System.out.println(m.getKey()+" "+m.getValue());
                
                dataset.setValue(Float.parseFloat(ma.getValue()+""),"Items Sold", ma.getKey()+"");
            }     
            
        }catch(Exception e){
                    e.printStackTrace();
        }
        
        /*dataset.setValue(50, "Date","Amount1");
        dataset.setValue(25, "Date","Amount2");
        dataset.setValue(30, "Date","Amount3");
        dataset.setValue(45, "Date","Amount4");*/
        JFreeChart chart = ChartFactory.createBarChart3D("SOLD BARCHART", "DATE", "PROFIT", dataset,PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setForegroundAlpha(0.5f);
        ChartFrame frame = new ChartFrame("Bar Chart", chart);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(750,600);
    }//GEN-LAST:event_btnDailyItemsActionPerformed

    private void btnDailyProfitsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDailyProfitsActionPerformed
        String sql = "SELECT * FROM Sales";
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        
        try{
            
            rs =s.executeQuery(sql);
            
            Map<String,Float> m =new TreeMap<String,Float>();
            
            //int quantity=0;
            //float sp=0;
            //float bp=0;
            String qua="",sprice="",bprice="",date="";
            while(rs.next()){
                
               //qua = rs.getString(3);
               sprice = rs.getString("UnitPrice");
               date = rs.getString("Date");
               date= date.substring(0, 7);
               bprice = rs.getString("OrigPrice");
               
               //quantity=quantity+Integer.parseInt(qua);
               
               /*sp = sp + Float.parseFloat(sprice);
               bp = bp + Float.parseFloat(bprice);*/
               
               Float oldVal = m.get(date);
               
               if(oldVal == null)
                {
                    m.put(date,Float.parseFloat(sprice)-Float.parseFloat(bprice)); //gawa ng column sa database na original price
                }
                else
                {
                    m.put(date,oldVal+Float.parseFloat(sprice)-Float.parseFloat(bprice)); //gawa ng column sa database na original price
                }
               
               
               
               
            }
            
            for(Map.Entry ma:m.entrySet()){  
            //System.out.println(m.getKey()+" "+m.getValue());
                
           dataset.setValue(Float.parseFloat(ma.getValue()+""),"Profit", ma.getKey()+"");
            }     
            
        }catch(Exception e){
                    e.printStackTrace();
        }
        
        /*dataset.setValue(50, "Date","Amount1");
        dataset.setValue(25, "Date","Amount2");
        dataset.setValue(30, "Date","Amount3");
        dataset.setValue(45, "Date","Amount4");*/
        JFreeChart chart = ChartFactory.createBarChart3D("PROFIT BARCHART", "DATE", "PROFIT", dataset,PlotOrientation.VERTICAL, false, true, false);
        CategoryPlot p = chart.getCategoryPlot();
        p.setForegroundAlpha(0.5f);
        ChartFrame frame = new ChartFrame("Bar Chart", chart);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setSize(750,600);
    }//GEN-LAST:event_btnDailyProfitsActionPerformed

    private void btnPieChartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPieChartActionPerformed
        DefaultPieDataset pieDataset = new DefaultPieDataset();
        
        String sql = "SELECT * FROM Sales";
        
        try{
            
            rs =s.executeQuery(sql);
            
            HashMap<String,Integer> map =new HashMap<String,Integer>();
            
            while(rs.next()){
                
                String name = rs.getString(2);
                String type = rs.getString("Type");
                String stock = rs.getString("Quantity");
                
                
                
                
                Integer oldVal = map.get(type);
                
                //System.out.println(oldVal);
                
                if(oldVal == null)
                {
                    map.put(type,Integer.parseInt(stock));
                }
                else
                {
                    map.put(type,oldVal+Integer.parseInt(stock));
                }
                
                
            }
            
            for(Map.Entry m:map.entrySet()){  
            //System.out.println(m.getKey()+" "+m.getValue());  
            pieDataset.setValue(m.getKey()+"", Integer.parseInt(m.getValue()+""));
  }     
            
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
        
        
        
        JFreeChart chart = ChartFactory.createPieChart3D("pie chart", pieDataset, true, true, false);
        PiePlot3D p = (PiePlot3D) chart.getPlot();
        p.setStartAngle(0);
        p.setDirection(Rotation.CLOCKWISE);
        p.setForegroundAlpha(0.5f);
        p.getBackgroundPaint();
        
        ChartFrame frame = new ChartFrame("Pie Chart", chart);
        frame.setLocationByPlatform(true);

        frame.setVisible(true);
        frame.setSize(750,600);
    }//GEN-LAST:event_btnPieChartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
         AdminPanel adm = new AdminPanel();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackActionPerformed

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
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SalesReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SalesReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDailyItems;
    private javax.swing.JButton btnDailyProfits;
    private javax.swing.JButton btnPieChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
