package seleniumfirst;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;



public class Excelread {

	 
		FileInputStream f;
		XSSFWorkbook w;
		XSSFSheet sh;
		static Cell cell;
		static String b=null;
		
  public void abcy() throws IOException
	{
	 
	FileInputStream f=new FileInputStream("C:\\Users\\sinju\\eclipse-workspace\\seleniumfirst\\src\\main\\resources\\Book1.xlsx");
		XSSFWorkbook w=new XSSFWorkbook(f);
		 XSSFSheet sh=w.getSheet("sheet1");
		int rowcount= sh.getLastRowNum()- sh.getFirstRowNum();
	    /* for(int i=1;i<=rowcount;i++)
		{
			int cellcount=sh.getRow(i).getLastCellNum();
			
			for(int j=0;j<cellcount;j++)
			{
				 b=sh.getRow(i).getCell(j).getStringCellValue();
				
				System.out.print(b);
			}
			
		}*/
		 DataFormatter formatter=new DataFormatter();
		 Iterator<Row>rowIter=sh.iterator();
		 while(rowIter.hasNext())
		 {
			 Row row=rowIter.next();
			 Iterator<Cell>cellIter=row.cellIterator();
			 while(cellIter.hasNext())
			 {
				  cell=cellIter.next();
				 switch(cell.getCellTypeEnum())
				 {
				 case NUMERIC:
					 cell.getNumericCellValue();
					 String value=formatter.formatCellValue(cell);
					 System.out.println(value+" ");
					 break;
				case BOOLEAN:
					 cell.getBooleanCellValue();
					 String value1=formatter.formatCellValue(cell);
					 System.out.println(value1);
					 break; 
				
					
					 
				 }
			 }
			 
		 }
	     
		
		
	}
  public static void main(String[] args) throws IOException
  {
	Excelread q=new Excelread();
	q.abcy();
	WebDriver driver; 
	System.setProperty("webdriver.chrome.driver", "C:\\selenium driver exe file\\chromedriver.exe"); 
	driver = new ChromeDriver();
	driver.get("https://selenium.qabible.in/table-pagination.php");
	int r=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr")).size();
	System.out.println("No Of Rows are :"+r);
	int c=driver.findElements(By.xpath("//table[@id='dtBasicExample']/thead/tr/th")).size();
	System.out.println("No Of Columns are :"+c);
	
	String m=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[3]")).getText();
	System.out.println(m+" ");
	if(b.trim().equals(m.trim()))
	{
		System.out.println("passed");
	}
		else
		{
			System.out.println("failed");
		}
	}
	}
  
	
	
	

	

	





	


