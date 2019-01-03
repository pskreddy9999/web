package Data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseOver {
	
	public static void main(String[] args){
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.geodatasource.com/");
		
		Actions action = new Actions(driver);
		
//		WebElement ele = driver.findElement(By.className("dropdown-toggle"));
//		action.moveToElement(ele).build().perform();
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement ele = driver.findElement(By.linkText("Products"));
		action.moveToElement(ele).build().perform();
		
		WebElement elm = driver.findElement(By.xpath("//li[@class='dropdown-submenu'] /a[contains(text(),'Software')]"));
		action.moveToElement(elm).build().perform();
		
		WebElement elu = driver.findElement(By.linkText("Country-Region Dropdown Menu (Free)"));
		action.moveToElement(elu).build().perform();
		elu.click();
		
		try {
			Thread.sleep(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
  driver.close();
  
	}

}
