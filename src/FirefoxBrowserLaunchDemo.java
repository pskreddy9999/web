import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserLaunchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		
		System.setProperty("WebDriver.gecko.driver","$Path/geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.get("https://intellipaat.com/");
//		List<WebElement> byclass = driver.findElements(By.className("smallimg iplogin"));
		WebElement username = driver.findElement(By.className("smallimg iplogin"));
		username.sendKeys("admin");
//		driver.findElement(By.name("Login"));
		
	}

}
