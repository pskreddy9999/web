import java.io.File;
import java.io.FileOutputStream;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.gargoylesoftware.htmlunit.javascript.host.Map;

public class PoiExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		//Blank work book
		XSSFWorkbook workbook = new XSSFWorkbook();
		
//		Create a Blank work sheet
		
		XSSFSheet sheet = workbook.createSheet("Employee Details");
		
//		This data need to written in sheet using Object[]
		
		TreeMap<String, Object[]> data = new TreeMap<String, Object[]>();
		
		data.put("1", new Object[] {"Emp Id", "First-Name", "Middle-Name", "Last-Name","Designation","Work-Location"});
		data.put("2", new Object[] {"11","sathish","reddy","pemmana"," ","Bangalore"});
		data.put("3", new Object[] {"12","yashwanth","reddy","","SASE","Mumbai"});
		data.put("4", new Object[] { " ","Lokesh","reddy","Chintha","SE","Hydrabad"});
		data.put("5", new Object[] {"14","Sandeep","Kumar"," ","ASE","Bangalore"});
		data.put("2", new Object[] {" ","Puru","Telugu","ASE"," "});
		
		Set<String> keyset = data.keySet();
        int rownum = 0;
        for (String key : keyset) {
            // this creates a new row in the sheet
            Row row = sheet.createRow(rownum++);
            Object[] objArr = data.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                // this line creates a cell in the next column of that row
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String)
                    cell.setCellValue((String)obj);
                else if (obj instanceof Integer)
                    cell.setCellValue((Integer)obj);
            }
        }
		
        try {
            // this Writes the workbook gfgcontribute
            FileOutputStream out = new FileOutputStream(new File("E:\\FirstExcel.xlsx"));
            workbook.write(out);
            out.close();
            System.out.println("FirstExcel.xlsx written successfully on disk.");
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

	}


