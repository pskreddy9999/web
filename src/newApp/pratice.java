package newApp;

import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class pratice {
	
	public static HashMap<String, String> dataGet(String xLPath, String sheetname, int rowNum){
		
		HashMap<String, String> tcData = new HashMap<>();
		try {
			XSSFWorkbook wb = new XSSFWorkbook(xLPath);
			XSSFSheet sheet = wb.getSheet(sheetname);
			 int totalCols = sheet.getRow(0).getLastCellNum();
			 
			 for(int cellNum =0;cellNum<totalCols;cellNum++) {
				 String cellValue = " ";
				String header = sheet.getRow(0).getCell(cellNum).getStringCellValue();
				XSSFCell cell = sheet.getRow(rowNum).getCell(cellNum);
				
				int cellType = cell.getCellType();
				
				if(cellType == Cell.CELL_TYPE_STRING) {
					cellValue = cell.getStringCellValue();
				}else if(cellType == Cell.CELL_TYPE_NUMERIC) {
					cellValue = String.valueOf((int)cell.getNumericCellValue());
				}else if(cellType == Cell.CELL_TYPE_BLANK) {
					cellValue = "";
				}else if(DateUtil.isCellDateFormatted(cell)) {
					cellValue =String.valueOf(cell.getDateCellValue());
				}
				
				tcData.put(header, cellValue);
				System.out.println(header + " : " + cellValue);
			 }
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}	
		
		return tcData;
	}

}
