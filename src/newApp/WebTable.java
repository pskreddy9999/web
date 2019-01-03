package newApp;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WebTable {
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	    driver.findElement(By.id("btnLogin")).click();
		WebElement elm = driver.findElement(By.id("menu_pim_viewPimModule"));
		Actions act = new Actions(driver);
		act.moveToElement(elm).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("menu_pim_viewEmployeeList")).click();
		
		/*List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		int rowcount = rows.size();
		System.out.println("Row count of web table " +rowcount);*/
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
		String beforexpath = "//*[@id='resultTable']/tbody/tr[";
		String afterxpath = "]/td[2]/a";
		
		for(int i=1; i<=11;i++) {
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
			String actxpath = beforexpath+i+afterxpath;
			WebElement elem = driver.findElement(By.xpath(actxpath));
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
			System.out.println(elem.getText());
			if(elem.getText().equals("0009")) {
				System.out.println("Id number : "+ elem.getText() + " at position number : " + (i-1));
				break;
			}
		}
		System.out.println("**********************************");
		String afterxpathFirst = "]/td[3]/a";
		for(int i=1; i<=11;i++) {
			String actaaxpath = beforexpath+i+afterxpathFirst;
			WebElement elem = driver.findElement(By.xpath(actaaxpath));
			System.out.println(elem.getText());
		}
	}

}
