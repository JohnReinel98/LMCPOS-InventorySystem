
package lmcpointofsalessystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.UIManager;

/**
 *
 * @author JohnReinel
 */
public class LMCPointofSalesSystem {
        public static Statement s;
        public static String dataSourceName;
        public static Connection con;
        public LMCPointofSalesSystem(){
    dataSourceName = "LMCPOSDB1";
        
        String url = "jdbc:odbc:" + dataSourceName;
        
        try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con = DriverManager.getConnection(url,"","");
            System.out.println("Success");
            s = (Statement) con.createStatement();
        }catch(Exception e){
            System.out.println("Error" + e);
        }
}
    public static void main(String[] args) {
        LMCPointofSalesSystem connect = new LMCPointofSalesSystem();
         new Thread(){
        public void run() {
                
                try {
                    Thread.sleep(3500);
                    System.out.println("Good");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                
                new Login().setVisible(true);
            }
       
    }.start();
        try {
            
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            
        } catch (Exception ex) {
            
        }
    }
    
}
