package newApp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Array2D {

	public static void main(String[] args) {
		Variable.evnArray = ReadToArray("Book1.xlsx", "Sheet1");
		String val = GetFromeArry("dsalkdjsa", "VAL3");
		System.out.println(val);
		String string= "njnj";
	}

	public static String[][] ReadToArray(String filePath, String SheetName) {

		String[][] allvals = null;
		try {
			FileInputStream fiStream = new FileInputStream(filePath);
			XSSFWorkbook workbook = new XSSFWorkbook(fiStream);
			XSSFSheet sheet = workbook.getSheet(SheetName);
			int lastRownum = sheet.getLastRowNum();
			allvals = new String[lastRownum + 1][];

			for (int i = 0; i < lastRownum + 1; i++) {
				// System.out.println("row num :"+i);
				int colNum = sheet.getRow(i).getPhysicalNumberOfCells();
				allvals[i] = new String[colNum];
				// System.out.println(colNum +"cols in row "+i);
				for (int j = 0; j < colNum; j++) {

					XSSFCell value = sheet.getRow(i).getCell(j);
					String val = value.getStringCellValue();
					allvals[i][j] = val;
				}
			}
			workbook.close();
			fiStream.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return allvals;
	}

	public static String GetFromeArry(String username, String property) {
		String cellval = "";
		String[][] Array = Variable.evnArray;
		int rows = Array.length;
		int matchedRow = -1;
		for (int i = 1; i < rows; i++) {
			String user = Array[i][0];
			if (user.equalsIgnoreCase(username)) {
				matchedRow = i;
			}
		}
		if (matchedRow != -1) {
			int cols = Array[0].length;
			for (int i = 1; i < cols - 1; i++) {
				String cloHeader = Array[0][i];
				try {
					if (cloHeader.equalsIgnoreCase(property)) {
						cellval = Array[matchedRow][i];
					}

				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("no property is for this username : ");
				}
			}
		}
		return cellval;
	}
}
