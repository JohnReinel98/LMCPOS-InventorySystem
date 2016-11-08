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

        btnDailyItems = new javax.swing.JButton();
        btnDailyProfits = new javax.swing.JButton();
        btnPieChart = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnDailyItems.setText("Daily Items");
        btnDailyItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyItemsActionPerformed(evt);
            }
        });

        btnDailyProfits.setText("Daily Profits");
        btnDailyProfits.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDailyProfitsActionPerformed(evt);
            }
        });

        btnPieChart.setText("Items Sold Pie Chart");
        btnPieChart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPieChartActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(145, 145, 145)
                .addComponent(btnDailyItems)
                .addGap(36, 36, 36)
                .addComponent(btnDailyProfits)
                .addGap(18, 18, 18)
                .addComponent(btnPieChart)
                .addContainerGap(148, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDailyItems)
                    .addComponent(btnDailyProfits)
                    .addComponent(btnPieChart))
                .addContainerGap(297, Short.MAX_VALUE))
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
               date= date.substring(0, 10);
               bprice = rs.getString("Total");
               
               //quantity=quantity+Integer.parseInt(qua);
               
               /*sp = sp + Float.parseFloat(sprice);
               bp = bp + Float.parseFloat(bprice);*/
               
               Float oldVal = m.get(date);
               
               if(oldVal == null)
                {
                    m.put(date,Float.parseFloat(sprice)+Float.parseFloat(bprice));
                }
                else
                {
                    m.put(date,oldVal+Float.parseFloat(sprice)+Float.parseFloat(bprice));
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
    private javax.swing.JButton btnDailyItems;
    private javax.swing.JButton btnDailyProfits;
    private javax.swing.JButton btnPieChart;
    // End of variables declaration//GEN-END:variables
}
