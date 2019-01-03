package Data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUpHand {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.goibibo.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.cssSelector(" #get_sign_up")).click();
		
	    driver.switchTo().frame("authiframe");
	    
	    WebElement elm = driver.findElement(By.id("authMobile"));
	    elm.sendKeys("9533374437");
	    System.out.println(elm);
	    driver.findElement(By.id("mobileSubmitBtn")).click();
	    driver.findElement(By.xpath("//*[@class='oh']")).click();
		
		
		//Thread.sleep(10);
		//driver.close();
	}

}
