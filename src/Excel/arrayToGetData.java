package Excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class arrayToGetData {

	public static void main(String[] args) {
		
      getDataArray();
//      getDataFromArray("first[1]", "VAL1" , 3);
	}
	
	public static String getDataFromArray(String[][] dataArray,String columName, int rowNum){
		int totalCols = dataArray[0].length;
		
		String strVal = "";
		boolean blnColFound = false;
		for (int colNum = 0; colNum < totalCols; colNum++){
			
			String actColName = dataArray[0][colNum];
			if (actColName.equalsIgnoreCase(columName)){
				strVal = dataArray[rowNum][colNum];
				blnColFound = true;
				break;
			}
			
		}
		
		return strVal;
		
	}

	
	public static void getDataArray(){
		String[][] dataArray = null;
		
		try {
			FileInputStream file = new FileInputStream("WebDriver\\Book1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(file);
			int sheetIndex = wb.getSheetIndex("Sheet1");
			if (sheetIndex>=0){
				XSSFSheet sheet = wb.getSheetAt(sheetIndex);
				int lastRowNum = sheet.getLastRowNum();
				dataArray = new String[lastRowNum+1][];
				
				for (int i =0 ; i<= lastRowNum; i++){
					XSSFRow row = sheet.getRow(i);
					int colCount = row.getLastCellNum();
					dataArray[i] = new String[colCount];
					for (int j = 0; j< colCount; j++){
						XSSFCell oCell = row.getCell(j);
						dataArray[i][j] = oCell.getStringCellValue();						
					}
				}
			} else {
				
			}			
			
			wb.close();
			file.close();
		} catch (IOException | NullPointerException e) {
			
			System.out.println("Exception came");
		}	
	}
	
}
