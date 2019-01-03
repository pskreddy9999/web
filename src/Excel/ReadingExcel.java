package Excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		try {
			FileInputStream fi = new FileInputStream("D:\\workspace\\WebDriver\\src\\Excel\\Employee.xlsx");			
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			XSSFSheet sheet = wb.getSheet("Create");
			
			HashMap<String, Integer> allColumns = getColumnPositions(sheet);
			readData(sheet,allColumns.get("LAST_NAME"));
			try {
				wb.close();
				fi.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}	
	public static HashMap<String, Integer> getColumnPositions(XSSFSheet sheet){
		HashMap<String, Integer> colHolders = new HashMap<>();
		int totalCols = sheet.getRow(0).getLastCellNum();
//		int totalCols = sheet.getRow(0).getPhysicalNumberOfCells();
		XSSFRow row = sheet.getRow(0);
		int colNum = -1;
		for(int cellNum =0;cellNum<totalCols;cellNum++) {
			XSSFCell cell = row.getCell(cellNum);
			if(cell!=null) {
				String colHeader = cell.getStringCellValue();
				String colHolder = null;
				colHolders.put(colHolder, cellNum);
				
	          }
			}
			return colHolders;
		 }
	public static void readData(XSSFSheet sheet,int CelNum) {
		XSSFRow row = sheet.getRow(2);
		XSSFCell cell = row.getCell(CelNum);
		// if cell is not have a value then we get nullpointException to avoid this exception we use the... 
		//--if condition like below 
		String strFirstName = " ";
		if(cell!=null) {
		int type=cell.getCellType();
		switch (type) {
		case Cell.CELL_TYPE_STRING:
			strFirstName = cell.getStringCellValue();
			break;
		case Cell.CELL_TYPE_NUMERIC:
			strFirstName = String.valueOf(cell.getNumericCellValue());				
			break;
		}
//		String strval = cell.getStringCellValue();
//			System.out.println(strval);
		
		}else {
//			System.out.println("Cell is empty");
			strFirstName = " ";
		}		
		System.out.println(strFirstName);
	}
	
}
