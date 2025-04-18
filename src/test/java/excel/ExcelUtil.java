package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	
	private static Workbook workbook;
	private static org.apache.poi.ss.usermodel.Sheet sheet;
	
	public static Object[][] loadExcel(String filePath,String SheetName) throws IOException{
		FileInputStream file = new FileInputStream(filePath);
		workbook = new XSSFWorkbook(file);
		sheet = workbook.getSheet(SheetName);
		int rowCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object[][] data = new Object[rowCount -1][colCount];
		
		for(int i=1;i<=rowCount;i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<colCount;j++) {
				data[i-1][j]=row.getCell(j).toString().trim();
				
				DataFormatter formatter = new DataFormatter();
				data[i-1][j]=formatter.formatCellValue(row.getCell(j));
			}
		}
		workbook.close();
		return data;
	}

}
