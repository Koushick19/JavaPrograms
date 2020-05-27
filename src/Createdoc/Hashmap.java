package Createdoc;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Hashmap 
{
	@Test(dataProvider="excelhashmap")
	public void getdata(Map hashdata)
	{
		System.out.println(hashdata.get("SEARCH_FIELD"));
	}
	
	@DataProvider(name="excelhashmap")
	public Object[][] setMapData() throws IOException {
		 
		   String path = "C:\\Users\\Hp\\workspace\\testngcucumberframework\\src\\test\\resources\\Datatable\\MasterTestdata.xlsx";	   
		   FileInputStream fis = new FileInputStream(path);	 
		   XSSFWorkbook workbook = new XSSFWorkbook(fis);	 
		   XSSFSheet sheet = workbook.getSheetAt(0); 
		   workbook.close();
		   int lastRow = sheet.getLastRowNum();
		   int lastcol = sheet.getRow(0).getLastCellNum();

		   //Defining the Object Array
		   Object[][] obj = new Object[lastRow][1];
		   
		   for(int i=0;i<lastRow;i++)
		   {
			   Map<Object, Object> dataprovider = new HashMap<Object, Object>();
			   for(int j=0;j<lastcol;j++)
			   {
				   dataprovider.put(sheet.getRow(0).getCell(j), sheet.getRow(i+1).getCell(j));
			   }
			   obj[i][0]= dataprovider;
		   }
		   
		 
		   
		return obj;
	}

}
