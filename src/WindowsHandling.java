import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.naukri.com/");
		
		String curHandle = driver.getWindowHandle();
		Object[] allHandles = driver.getWindowHandles().toArray();
		
		for(Object handle:allHandles) {
			if(!handle.toString().equals(curHandle)) {
				driver.switchTo().window(handle.toString());
				
				
				driver.close();
			}
			 
		
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//			driver.findElement(By.xpath("//*[@alt='RBS']")).click();
//			driver.switchTo().window(allHandles[0].toString());
			
		
		}

	}
}


