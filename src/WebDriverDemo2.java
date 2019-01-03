import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;
//import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchStatement;

public class WebDriverDemo2 {

//	static WebDriver  driver= null;
	public static void main(String[] args) {

//		 WebDriver  driver;
		Scanner si = new Scanner(System.in);
		System.out.println("Enter The browser Name: ");
		
		String browser = si.next();
		WebDriver driver = null;
		
		switch (browser.toUpperCase()) {
		case "CHROME":
			  System.setProperty("webdriver.chrome.driver","E:\\eclipse\\Drivers\\chromedriver.exe");

			  driver = new ChromeDriver();
			break;
			
		case "FIREFOX":	
			System.setProperty("webdriver.gecko.driver", "E:\\eclipse\\Drivers\\geckodriver.exe");
               driver = new FirefoxDriver();
			break;

		default :
			 System.out.println("Invalid Browser");
			 System.exit(0);
			 break;
			
		}
		driver.get("https://www.facebook.com/");
		
		
		/*driver.findElement(By.id("u_0_j")).sendKeys("sathish");
		driver.findElement(By.id("u_0_l")).sendKeys("P");
		
		driver.findElement(By.id("u_0_o")).sendKeys("pskr0616@gmail.com");
		driver.findElement(By.id("u_0_r")).sendKeys("pskr0616@gmail.com");
		
		driver.findElement(By.id("u_0_v")).sendKeys("pskr9999");
		
		
		WebElement bday = driver.findElement(By.id("day"));
		Select day = new Select(bday);
		
//		day.selectByIndex(17);
//		day.selectByValue("18");
		day.selectByVisibleText("29");
		
		if(!day.isMultiple()) {
			List<WebElement> allday = day.getOptions();
			System.out.println("Total options in days drop down are: "+ allday.size());
			for(int i = 0;i<allday.size();i++) {
				String dayname = allday.get(i).getText();
				if(dayname.equals("29")) {
					day.selectByIndex(i);
					break;
				}
			}
		}
		
		
		
		
		
		WebElement bmonth = driver.findElement(By.name("birthday_month"));
		Select month = new Select(bmonth);
//		month.selectByIndex(8);
//		month.selectByValue("8");
		month.selectByVisibleText("Dec");
		
		if(!month.isMultiple()) {
			List<WebElement> allMonth = month.getOptions();
			System.out.println("Total options in Month drop down are: "+allMonth.size());
			for(int i = 0;i<allMonth.size();i++) {
				String monthName = allMonth.get(i).getText();
				if(monthName.equals("Dec")) {
					month.selectByIndex(i);
					break;
				}
				
			}
			
			
			WebElement byear = driver.findElement(By.id("year"));
			Select year =new Select(byear);
			
			if(!year.isMultiple()) {
				List<WebElement> allyear = year.getOptions();
				System.out.println("Total option to choose whiche year is: "+allyear.size());
				for(int i =0; i<allyear.size();i++) {
					String yearname = allyear.get(i).getText();
					if(yearname.equals("1994")) {
						year.selectByIndex(i);
						break;
					}
				}
			}
			
			driver.findElement(By.id("u_0_a")).click();
			
//			driver.findElement(By.id("u_0_9")).click();
			
			driver.findElement(By.id("u_0_11")).click();
			*/
			
			
			
			// For signing Up
			
			driver.findElement(By.id("email")).sendKeys("pskr0616@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("pskr9999");
			
			driver.findElement(By.id("loginbutton")).click();
			
			driver.findElement(By.id("checkpointSubmitButton")).click();
			
			/*driver.findElement(By.xpath("//input[@type='text']")).sendKeys("8880616026");
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.findElement(By.id("checkpointSubmitButton")).click();
			
			
			/*driver.findElement(By.id("u_0_a")).click();
			
			System.out.println("The Output of the IsSelecte"+
			driver.findElement(By.id("u_0_a")).isSelected());
			
			System.out.println("The output of the Enabled" +
			driver.findElement(By.id("u_0_a")).isEnabled());
			
			System.out.println("The output of the Displyed" +
			driver.findElement(By.id("u_0_a")).isDisplayed());*/
			
			//For Female
			
			/*driver.findElement(By.id("u_0_9")).click();
			
			System.out.println("The Output of the IsSelecte"+
					driver.findElement(By.id("u_0_9")).isSelected());
					
					System.out.println("The output of the Enabled" +
					driver.findElement(By.id("u_0_9")).isEnabled());
					
					System.out.println("The output of the Displyed" +
					driver.findElement(By.id("u_0_9")).isDisplayed());*/
			File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			//File  screenshot = (TakesScreenshot)driver.
					
				try {
					FileUtils.copyFile(screenshot, new File("E:\\screenshot\\screenshot1.jpg"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			driver.close();
	    	
    	}

	}


