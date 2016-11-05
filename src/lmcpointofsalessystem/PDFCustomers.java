/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lmcpointofsalessystem;

import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static lmcpointofsalessystem.ManageCustomers.s;

/**
 *
 * @author JohnReinel
 */
public class PDFCustomers {
Connection con;
    String dataSourceName;
    Statement st;
    ResultSet rs;


public PdfPTable getDatas(String tblName)
    {
        PdfPTable headerTable= new PdfPTable(1);
        String newT=tblName.toString();
        try  {
            rs = s.executeQuery("select C.CustomerID, C.FirstName, C.LastName, C.Address, C.ContactNumber from Customers C" ); //alias lang ung "E"
            String columnExe="";
            columnExe="CustomerID,FirstName,LastName,Address,ContactNumber";//pdf column names
            String [] colH=columnExe.split(",");
            int colL=0;
            colL=columnExe.split(",").length;
            headerTable= new PdfPTable(colL);
            
            for (int x=0;x<colL;x++)
            {
                if(colH[x].toString().equals("C.CustomerID"))
                {
                    colH[x]="OrderNo1";
                }
                else if(colH[x].toString().equals("C.FirstName"))
                {
                    colH[x]="O.CustNo";
                }
                else if(colH[x].toString().equals("C.LastName"))
                {
                    colH[x]="OrderDate";
                }
                else if(colH[x].toString().equals("C.Address"))
                {
                    colH[x]="ItemDesc";
                }
                else if(colH[x].toString().equals("C.ContactNumber"))
                {
                    colH[x]="Unit";
                }
                
                PdfPCell newHeader = new PdfPCell();
                newHeader.addElement(new Paragraph(colH[x]));
                headerTable.addCell(newHeader);
            }
            
            //System.out.println(""+columnExe);
            rs = st.executeQuery("Select "+columnExe+" from Customers C");
            int colNums = colH.length;
            int colCount = 0;
            while(rs.next()==true)
            {
                for(int x=1;x<=colL;x++)
                {
                    colCount+=1;
                    
                    PdfPCell newCell = new PdfPCell();
                    newCell.addElement(new Paragraph(rs.getString(x)));
                    headerTable.setWidthPercentage(90);
                    headerTable.addCell(newCell);
                }
            }
            
          float [] widths2=new float[colNums];
            
            for (int i=0;i<colNums;i++)
            {
                widths2[i] = 150;
            }
            try {
                headerTable.setWidths(widths2);
            } catch (DocumentException ex) {
                Logger.getLogger(PDFCustomers.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PDFCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return headerTable;
    }
public void connectToDatabase() {
        dataSourceName = "LMCPOSDB1";//must be same name set in ODBC
        String dbSource = "jdbc:odbc:" + dataSourceName;
        try { 
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");//fixed for java odbc
            con = DriverManager.getConnection(dbSource, "","");
            //in con statement, last two parameters represent username and password
            //which is being set upon SQL nstallation
            System.out.println("SUCCESS!");
            st = con.createStatement();//makes your dbase ready to accept statement
            }
        catch (Exception err) {
            System.out.println( "Error: " + err );
         }
 }
public PDFCustomers (String tblName) throws IOException{
        try {
            LMCPointofSalesSystem connect = new LMCPointofSalesSystem();
            con=connect.con;
            st = connect.s;
            Document document = new Document(PageSize.A4.rotate(),0,0,0,0);
            
            PdfWriter.getInstance(document,new FileOutputStream(tblName+".pdf"));
            document.open();
            Image image = Image.getInstance ("src/lmcpointofsalessystem/Assets/header3.png");  
            document.add(image);
            document.setMarginMirroring(true);
            
            
            PdfPTable newheaderTable;
            newheaderTable=getDatas(tblName);
            newheaderTable.setHorizontalAlignment(Element.ALIGN_CENTER);
            document.add(newheaderTable);
            document.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PDFCustomers.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PDFCustomers.class.getName()).log(Level.SEVERE, null, ex);
        }
        }    
}
