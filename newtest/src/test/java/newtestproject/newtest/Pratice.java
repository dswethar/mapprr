package newtestproject.newtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Pratice {
   public void ReadData() throws IOException
   {
	   //create object of xssfbook class 
	   FileInputStream fis = new FileInputStream("/Users/Downloads/Order(2).xlsx");
	   XSSFWorkbook workbook= new XSSFWorkbook(fis);
	   int sheets=workbook.getNumberOfSheets();//get access to sheets
	   for(int i=0;i<sheets;i++)
	   {
		   //get access to rows of the sheet
		 if (workbook.getSheetName(i).equalsIgnoreCase("Orders1"))
		 {
		     XSSFSheet sheet=workbook.getSheetAt(i);
		     Iterator<Row> rows=sheet.iterator();   //get access to the row
		     Row FirstRow=rows.next();
		     Row SecondRow=rows.next();
		     Row ThirdRow=rows.next();  //get access to the specific row
		     Iterator<Cell> cells=ThirdRow.cellIterator();   //get access to cells of that row
		     int k=0;
		     int column=0;
		     while(cells.hasNext())        
		     {
	             Cell cell=cells.next();
	             if(cell.getStringCellValue().equalsIgnoreCase("STORE NAME"))
	             {
	            	 column=k;
	             }
	             k++;
		     }
		     
		 }
	   }
   }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
  
	}

}
