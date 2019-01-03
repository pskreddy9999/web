import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MyWebDriver {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner si= new Scanner(System.in);
		System.out.println("Enter Browser name: ");
		String browser = si.next();
		
		//WebDriver here also i can use but only for this class or package 
//		WebDriver driver;
		
		//WebDriver i can give null and i can use 
//		WebDriver driver = null;
		
		switch (browser.toUpperCase()) {
		//here which case sensitive mean that .toUpperCase means case="CHROME": and .toLowerCase means case "chrome";
		//it work case in case sensitive are not gonna work careful about it
//		case "chrome": not work bcoz of lower case
		
		case "CHROME":
			System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			System.setProperty("webdriver.gecko.driver","E:\\eclipse\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;

		default:
			System.out.println("Entered Invalid Browser");
			System.exit(1);
//			break;
		}
		driver.get("https://intellipaat.com/");
		WebElement Login = driver.findElement(By.xpath("//*[@class='smallimg iplogin']"));
		Login.click();
		
		WebElement Signup = driver.findElement(By.xpath("//*[@id='vbp-login-form']/a"));
		Signup.click();
		
//		driver.findElement(By.id("first_name")).sendKeys("Sathish Reddy");
		driver.findElement(By.xpath("//*[@name='first_name']")).sendKeys("sathish");
		
		driver.findElement(By.xpath("//*[@name='last_name']")).sendKeys("pemmana");
//		driver.findElement(By.id("last_name")).sendKeys("Pemmana");
		
		
//	   List<WebElement> opt = (List<WebElement>) driver.findElements(By.xpath("//div[@title='Select your Country']/descendant::ul/li[text()='India']"));
		     
	   Select ket= new Select(driver.findElement(By.xpath("//select[@title='Select your Country']/option")));
	   ket.selectByIndex(4);
//	   ket.selectByValue("Albania");
//	   ket.selectByVisibleText("India");
	   
//	
//	   Select opt = new Select(driver.findElement(By.xpath("//div[@title='Select your Country']/descendant::ul/li")));
	   
	   
//	   opt.selectByIndex(1);
//	   opt.selectByValue("India");
	   
//	   opt.selectByVisibleText("India");
		        //div[@title='Select your Country']/descendant::ul/li[text()='India']
	 //div[@title='Select your Country']/descendant::ul/li
//		          opt.get(1 );
		        		 
//		          
		       }
		}
	


