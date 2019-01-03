package Data;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.geodatasource.com/");
		//https://register.rediff.com/
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Demo")).click();
		
		//Below is for selecting the one value from drop down options
		
//		WebElement elm = driver.findElement(By.xpath("//*[@name='countryCode']/option[contains(text(),'India')]"));
//		elm.click();
		
		Select dropDwn = new Select(driver.findElement(By.id("countryCode")));
		
//		dropDwn.selectByVisibleText("India");
		
//		dropDwn.selectByIndex(3);
		
//		dropDwn.selectByValue("India");
		
		// below is for getting all option from drop down options and print in console
		
		List<WebElement> values = dropDwn.getOptions();
		
		System.out.println(values.size());
		
		for(int i = 0; i< values.size();i++) {
			
			System.out.println(values.get(i).getText());
		}
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//*[@id='city-lookup']/form/div[1]/label")));
		//*[@id="city-lookup"]/form/div[1]/label
		 
		driver.close();
		
	}

}
