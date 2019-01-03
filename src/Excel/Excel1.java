package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel1 {

	public static void main(String[] args) {
		
	 String str = readData("D:\\workspace\\WebDriver\\src\\Excel\\Employee.xlsx", "Employee.xlsx", "Create");
    
	}
	
	public static String readData(String filepath, String filename,String sheetName) {
		
		File f = new File(filepath);
		FileInputStream fis=null;
		XSSFWorkbook wb = null;
		try {
			fis = new FileInputStream(f);
			wb = new XSSFWorkbook();
			
			String fileExtensionName  = filename.substring(filename.indexOf("."));
			if(fileExtensionName.equals(".xlsx")) {
				wb = new XSSFWorkbook(fis);
			}else if(fileExtensionName.equals(".xlsx")) {
				wb = new XSSFWorkbook(fis);
			}
         XSSFSheet sheet = wb.getSheet(sheetName);
         int rowCount = sheet.getLastRowNum()-sheet.getFirstRowNum();
         for (int i = 0; i < rowCount+1; i++) {

             XSSFRow row = sheet.getRow(i);
             for (int j = 0; j < row.getLastCellNum(); j++) {
            	 System.out.print(row.getCell(j).getStringCellValue()+"|| ");

             }System.out.println();
         }
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return sheetName;
		
	}
}


