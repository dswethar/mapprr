package newtestproject.newtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class WriteDataOnExcel   {
	
    public void WriteData(String[] dataToWrite) throws IOException
    {
	FileInputStream fis=new FileInputStream("/Users/swethareddy/Downloads/orders(2).xlsx");
//	@SuppressWarnings("resource")
	XSSFWorkbook workbook=new XSSFWorkbook(fis);
	int sheets=workbook.getNumberOfSheets();
	for(int i=0;i<sheets;i++)
	{
		if(workbook.getSheetName(i).equalsIgnoreCase("Orders1")) 
		{
		XSSFSheet sheet=workbook.getSheetAt(i); 
		//identify the order id column by scanning the entire first row
		Iterator<Row> rows=sheet.iterator();
		int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
	    Row row = sheet.getRow(0);  //Get the first row from the sheet
	    Row newRow = sheet.createRow(rowCount+1); //Create a new row and append it at last of sheet
	    Iterator<Cell> cells=newRow.cellIterator();
        for(int j = 0; j < row.getLastCellNum(); j++)
        {    //Create a loop over the cell of newly created Row
        	Cell cell = newRow.createCell(j);   //Fill data in row
        	cell.setCellValue(dataToWrite[j]);  
	    }
        fis.close();
        FileOutputStream fos = new FileOutputStream("/Users/swethareddy/Downloads/orders(2).xlsx");
        workbook.write(fos);
        fos.close();
		}
	}
        
	}
	public static void main(String[] args) throws IOException 
	{
        String[] valueToWrite = {"2019-07-26 15:28:52 +0530","2807","25678","RATNADEEP,Gachibowli -2","driver_assigned","325.0","10.0"};
        WriteDataOnExcel wde=  new WriteDataOnExcel();
        wde.WriteData(valueToWrite);
		
		
	}
}