package Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("D:\\workspace\\WebDriver\\src\\Excel\\EmpTable.html");
//		WebElement mytable = driver.findElement(By.xpath(""));
		
	List<WebElement> rows = driver.findElements(By.tagName("tr"));
	
	int row_count = rows.size();
	for(int row=0;row<row_count;row++) {
		
		List<WebElement> Columns_row = rows.get(row).findElements(By.tagName("td")); //th
		
		int column_count =Columns_row.size(); 
		System.out.println("Number of cells in row: "+row+ " are " +column_count);
		for(int cell =0;cell<column_count;cell++) {
			
			String textcell = Columns_row.get(cell).getText();
			System.out.println("Cell Value Of row number " + row + " and column number " + cell + " Is " + textcell);
		}
	}

  }

}
