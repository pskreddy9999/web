package Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmpDataPitch {

	public static void main(String[] args) {
		
		String str="";
		
		
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.get("D:\\workspace\\WebDriver\\src\\Excel\\EmpTable.html");
		
		WebElement empdata = driver.findElement(By.id("emptable"));
		
		List<WebElement> rows = empdata.findElements(By.tagName("tr"));
		boolean blnDataFound = false;
		System.out.println("Numer of rows: "+rows.size());
		for(int rowNum=0;rowNum<rows.size();rowNum++) {
			
			System.out.println(rows.get(rowNum).getText());
			List<WebElement> allCell = rows.get(rowNum).findElements(By.tagName("th"));
	
				System.out.println("Number of columns: "+allCell.size());
				for(int cellNum = 0;cellNum<allCell.size();cellNum++) {
					WebElement cell = allCell.get(cellNum);
					System.out.println(allCell.get(cellNum).getText());
				String cellValue = cell.getText();
				/*if(cellValue.equals(empdata)) {
					System.out.println("Emploee: "+empdata+" found in Row: "+rowNum+"columns number: "+cellNum);
					blnDataFound = true;
					break;
				}
			}
		if(blnDataFound) {
			break;
		}
	if(!blnDataFound) {
		System.out.println("Data not found in Table");
	}*/
        }
	 }
   }
}

	

