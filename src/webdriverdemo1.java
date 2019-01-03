import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webdriverdemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		System.setProperty("WebDriver.gecko.driver", "E:\\eclipse\\Drivers\\geckodriver.exe");
//		driver = new FirefoxDriver();
		
		driver.get("https://intellipaat.com/");
		
//		WebElement Login = driver.findElement(By.xpath("*[@class="hidden-xs"]"));
		 WebElement Login = driver.findElement(By.xpath("//*[@class='smallimg iplogin']"));
//		 WebElement Login = driver.findElement(By.xpath("//*[@href=\"#login\"]"));
		 
		 Login.click();
		 
		 driver.findElement(By.id("sidebar-rememberme")).click();
		 System.out.println("The Output of the IsSelected " +
		 driver.findElement(By.id("sidebar-rememberme")).isSelected());
		 
		 System.out.println("The Output of the Enabled"+
		 driver.findElement(By.id("sidebar-rememberme")).isEnabled());
		 
		 System.out.println("The Output of the Displayed" +
		 driver.findElement(By.id("sidebar-rememberme")).isDisplayed());
		 
		 
		 
		WebElement Signup = driver.findElement(By.xpath("//*[@id='vbp-login-form']/a"));
		Signup.click();
		
		driver.findElement(By.id("first_name")).sendKeys("Sathish Reddy");
		driver.findElement(By.id("last_name")).sendKeys("Pemmana");
		/*try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		WebElement coun = driver.findElement(By.xpath("//ul[@class='chosen-results']/li"));
		
		Select count = new Select(coun);
		
//		count.selectByIndex(5);
//		count.selectByValue("5");
		count.selectByVisibleText("American Samoa");
		
		if(!count.isMultiple()) {
			List<WebElement> allcount = count.getOptions();
			System.out.println("In Total options, choose one country "+allcount.size());
			for(int i = 0;i<allcount.size();i++){
				String countryname = allcount.get(i).getText();
				if(countryname.equals("American Samoa")) {
					count.selectByIndex(i);
					break;
				}
			}
			
		}

		
//		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='signup_form']/div[2]/div/div/ul/li[103]"))); 
//		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='signup_form']/div[2]/div/div/ul/li[103]")));
//		Select dropdown = new Select(driver.findElement(By.xpath("//*[@id='signup_form']/div[2]/div/div/ul/li[103]")));
		
//		dropdown.selectByVisibleText("India");
//		dropdown.selectByIndex(104);
//		dropdown.selectByValue("104");
		
		
//		driver.findElement(By.id("user_login")).sendKeys("pwrety@gmail.com");;
		//*[@name="user_email"]
		

		

	}

}
