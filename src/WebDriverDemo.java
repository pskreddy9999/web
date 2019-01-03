import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

//import org.openqa.selenium.chrome.ChromeDriver;

//import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;
//import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchStatement;

public class WebDriverDemo {
	
	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Browser name: ");
		String browser;
		browser = in.next();
		
		//below should be class name and it is Interface bcoz we can chrome or firefox
		//browser and if we create with particular browser name that will run in same browser
		
		
		switch (browser.toUpperCase()) {
		case "CHROME": 
			System.setProperty("WebDriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver");
			driver = new ChromeDriver();
			break;
			
		case "FIREFOX":
			System.setProperty("WebDriver.gecko.driver","E:\\eclipse\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Entered Invalid Browser");
			System.exit(0);		
		}
		
		
//		driver.get("https://www.youtube.com");
		
//		driver.get("http://www.google.com");
//		or
		
		String URL = "https://www.facebook.com/";
		driver.get(URL);
		
//		WebElement dynElement = new WebDriverWait(driver, 20).until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
//		dynElement.sendKeys("sathish");
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		WebElement eme = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("email")));
		eme.sendKeys("pskredd");
		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
//		driver.getTitle();
		driver.close();
		
//		driver.getCurrentUrl();
		
	}

}
