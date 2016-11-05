
package lmcpointofsalessystem;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Element;
import com.lowagie.text.HeaderFooter;
import com.lowagie.text.Image;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.Phrase;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import static lmcpointofsalessystem.ManipulateStocksAdmin.s;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JohnReinel
 */
public class PDFStocks {
    Connection con;
    String dataSourceName;
    Statement st;
    ResultSet rs;


public PdfPTable getDatas(String tblName)
    {
        PdfPTable headerTable= new PdfPTable(1);
        String newT=tblName.toString();
        try  {
            rs = s.executeQuery("SELECT S.ItemNo,S.Type,S.ItemName,S.Quantity,Price from Stocks S" ); //alias lang ung "E", di pede naka alias ung Float data types
            String columnExe="";
            columnExe="ItemNo,Type,ItemName,Quantity,Price";//pdf column names
            String [] colH=columnExe.split(",");
            int colL=0;
            colL=columnExe.split(",").length;
            headerTable= new PdfPTable(colL);
            
            for (int x=0;x<colL;x++)
            {
                if(colH[x].toString().equals("S.ItemNo"))
                {
                    colH[x]="ItemNo";
                }
                else if(colH[x].toString().equals("S.Type"))
                {
                    colH[x]="Type";
                }
                else if(colH[x].toString().equals("S.ItemName"))
                {
                    colH[x]="ItemName";
                }
                else if(colH[x].toString().equals("S.Quantity"))
                {
                    colH[x]="Quantity";
                }
                else if(colH[x].toString().equals("Price"))
                {
                    colH[x]="Price";
                }
                
                PdfPCell newHeader = new PdfPCell();
                newHeader.addElement(new Paragraph(colH[x]));
                headerTable.addCell(newHeader);
            }
            
            //System.out.println(""+columnExe);
            rs = st.executeQuery("Select "+columnExe+" from Stocks");
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
                Logger.getLogger(PDFStocks.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PDFStocks.class.getName()).log(Level.SEVERE, null, ex);
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
    public PDFStocks (String tblName) throws IOException{
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
            Logger.getLogger(PDFStocks.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PDFStocks.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
}
