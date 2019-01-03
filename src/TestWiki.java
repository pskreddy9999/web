import java.util.List;
import java.util.Scanner;

import org.apache.xml.serializer.utils.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestWiki {
//	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner si= new Scanner(System.in);
		System.out.println("Enter Browser name: ");
		String browser = si.next();
		
		//WebDriver here also i can use but only for this class or package 
//		WebDriver driver;
		
		//WebDriver i can give null and i can use 
		WebDriver driver = null;
		
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

		driver.get("https://www.orangehrm.com/");
		
		WebElement free = driver.findElement(By.xpath("//*[@class='hero__btns']//a[contains(text(),'Free 30 Day Trial')]"));
		free.click();
		
		driver.findElement(By.name("subdomain")).sendKeys("pskreddy9999");
//		driver.findElement(By.name("subdomain")).sendKeys("sathish");
		
//	class	orhrm-notif tips-messages-container error
//	class orhrm-notif tips-messages-container success
		
		WebElement check = driver.findElement(By.name("action_CheckAvb"));
		check.click();
		
//		List<WebElement> vfy = driver.findElements(By.id("tips-messages"));
		
//		if(vfy.size) > 0) {
//			System.out.println("You Entered Name is Avaliable "+ vfy);
//		}else {
//			System.out.println("You Entered Name is not Avaliable "+vfy);
		  
		   driver.findElement(By.name("FirstName")).sendKeys("sathish reddy");
		   driver.findElement(By.name("LastName")).sendKeys("Pemmana");
		   driver.findElement(By.name("CompanyName")).sendKeys("Mindlogic PVT ltd");
		   driver.findElement(By.name("Email")).sendKeys("psathishkr@gmail.com");
		   driver.findElement(By.name("Contact")).sendKeys("9533374437");
		   
//		   Select opti = new Select(driver.findElement(By.xpath("//select[@name='NoOfEmployees']/option[2]")));
		   
		   
//		   opti.selectByVisibleText("0 - 10");
		   
//		List<WebElement> emp =   driver.findElements(By.xpath("//select[@name='NoOfEmployees']/option"));
		
//		   Select emp = new Select(driver.findElement(By.xpath("//*[@id=\"Form_submitForm_NoOfEmployees\"]/option[2]")));
//		   Select emp = new Select(driver.findElement(By.xpath("//*[@name='NoOfEmployees']/option//contains")));
//		   emp.selectByIndex(3);
//		   emp.selectByValue("11 - 15");
//		   emp.selectByVisibleText("0 - 10");
		   
//		   List<WebElement> emp = driver.findElements(By.xpath("//*[@name='NoOfEmployees']/option[contains(text(),'11 - 15')]"));
//		  emp.get(0);
		   
		   /*List<WebElement> opt = driver.findElements(By.xpath("//select[@name='NoOfEmployees']/option[contains(text()]"));
		   for(WebElement name : opt) {
			   String optname = name.getText();
			   boolean isSelected = name.isSelected();
			   if(optname.equalsIgnoreCase("0 - 10")) {
				   name.click();
			   }
		   }
		   */
		   WebDriverWait wait = new WebDriverWait(driver, 20);
		   	   
//		   WebElement emp = driver.findElement(By.xpath("//*[@name='NoOfEmployees']"));
		   WebElement emp = driver.findElement(By.xpath("//*[@name='NoOfEmployees']"));
		   
		    wait.until(ExpectedConditions.elementToBeClickable(emp));
		   Select listEmp1 = new Select(emp);
		   
		   listEmp1.selectByIndex(3);
//		   listEmp.selectByValue("3");
//		   listEmp.selectByVisibleText("10 - 15");
		   
		   if(!listEmp1.isMultiple()) {
			   List<WebElement> allList = listEmp1.getOptions();
			   System.out.println("Total emp in office: "+allList.size());
			   for(int i =0;i<allList.size();i++) {
				   String empName = allList.get(i).getText();
				   listEmp1.selectByIndex(i);
				   break;
			   }
		   }
		}
	}

