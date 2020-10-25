package newtestproject.newtest;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Excel {
	
	public ArrayList<String> datadriven(String testcasename) throws IOException
	{
		//FileInput Stream arguement
		        ArrayList<String> a= new ArrayList<String>();
				FileInputStream fis=new FileInputStream("/Users/swethareddy/Downloads/orders(2).xlsx");
				XSSFWorkbook workbook=new XSSFWorkbook(fis);
				int sheets=workbook.getNumberOfSheets();
				for(int i=0;i<sheets;i++)
				{
					if(workbook.getSheetName(i).equalsIgnoreCase("Orders1")) 
					{
					XSSFSheet sheet=workbook.getSheetAt(i); 
					//identify the order id column by scanning the entire first row
					Iterator<Row> rows=sheet.iterator(); //Sheet is collection of rows
					Row firstrow=rows.next();
			        Row secondrow=rows.next();
			        Row thirdrow=rows.next();
					Iterator<Cell> cell=secondrow.cellIterator();   //row is collection of cells
				    int k=0;
				    int column = 0;
					while(cell.hasNext())
					{
						Cell value=cell.next();
						if(value.getStringCellValue().equalsIgnoreCase("STORE NAME"))
						{
							//desired column
							column=k;
						}
						k++;
					}
					System.out.println(column);
				    //once column is identified then scan the entire order id column to identify 2781 row
					while(rows.hasNext())
					{
						Row r=rows.next();
						if(r.getCell(column).getStringCellValue().equalsIgnoreCase(testcasename))
						{
							//after that you grab order id testcase row=pull all the data of that row  and feed into test 
							Iterator<Cell> orderid=r.cellIterator(); 
							while(orderid.hasNext())
							{
								Cell c=orderid.next();
								if(c.getCellType()==CellType.STRING)
								{
								a.add(c.getStringCellValue());
								}
//								else if(c.getCellType()==CellType.NUMERIC)
//								{
//								a.add(c.getNumericCellValue());
//								}
								else
								{
								a.add(NumberToTextConverter.toText(c.getNumericCellValue()));
								}
									
							}
						}
					}
		       	}
					
				}
				return a;
				
	}
	
	public static void main(String[] args) throws IOException 
	{
	    //identify the order id column by scanning the entire first row
		//once column is identified then scan the entire order id column to identify 2781 row
		//after that you grab order id testcase row=pull all the data of that row  and feed into test 
	    //FileInput Stream arguement
		Excel e=new Excel();
		ArrayList<String> data=e.datadriven("RATNADEEP,Gachibowli -2");
		// g vSystem.out.println(data.toArray());
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		System.out.println(data.get(4));
		System.out.println(data.get(5));
		System.out.println(data.get(6));
      
	}

}
