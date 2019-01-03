import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileInputStream fi;
		
		try {
			fi = new FileInputStream("E:\\FirstExcel.xlsx");
			
			XSSFWorkbook wb = new XSSFWorkbook(fi);
			
			XSSFSheet sheet = wb.getSheet("First");
			
			String expcol = "First-Name";
			
			HashMap<String, Integer> colHeaders = new HashMap<>();
			
			int totcols = sheet.getRow(0).getPhysicalNumberOfCells();
			XSSFRow row = sheet.getRow(0);
			for(int cellNum=0;cellNum<totcols;cellNum++) {
				XSSFCell cell = row.getCell(cellNum);
				if(cell!=null) {
					String colHeader = cell.getStringCellValue();
					colHeaders.put(colHeader, cellNum);
				}
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
