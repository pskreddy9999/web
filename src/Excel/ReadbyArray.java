package Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadbyArray {
	
	public static void main(String[] args) {
		 readData("Book1.xlsx", "Book1.xlsx", "Sheet1");
		
	}

	
	public static String readData(String filepath, String filename,String sheetName) {
		
		
		File fi = new File(filepath);
		FileInputStream fis;
		String [][] dataarray =null;
		try {
			 fis = new FileInputStream(fi);
			XSSFWorkbook wb = new XSSFWorkbook();
			int sheetIndex = wb.getSheetIndex("Sheet1");
			if(sheetIndex>=0) {
				XSSFSheet sheet = wb.getSheetAt(sheetIndex);
				int lastRownum = sheet.getLastRowNum();
				dataarray = new String[lastRownum][];
				for(int i=0;i<=lastRownum;i++) {
					XSSFRow row = sheet.getRow(i);
					int colcount = row.getLastCellNum();
					dataarray[i] = new String[colcount];
					for(int j=0;j<colcount;j++) {
						XSSFCell ocell = row.getCell(j);
						dataarray[i][j]= ocell.getStringCellValue();
					}
				}
			}
			
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		return sheetName;	
	}
  }



