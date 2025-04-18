package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {

	public static void main(String[] args) throws IOException  {

		FileInputStream file = new FileInputStream("D:\\eclipse\\Seleniumproject\\Test Data\\Login1.xlsx");
	
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		//XSSFRow row = sheet.getRow(0);
		//XSSFCell cell = row.getCell(1);
		
		//System.out.println(cell.getStringCellValue());
		
		//total no of rows & cells 
		
		int totalRows = sheet.getLastRowNum();
		int totalCells = sheet.getRow(1).getLastCellNum();
		
		System.out.println("Number of Rows"+ totalRows);
		System.out.println("Number of Cells"+ totalCells);
		

		
	}

}
