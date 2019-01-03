package Data;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.or.ThreadGroupRenderer;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.AlertHandler;

public class HandlingWindow {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.icicibank.com/");

		driver.switchTo().frame("active");
		
		driver.findElement(By.xpath("//*[@class='active']/div")).click();

		// WebElement at = driver.findElement(By.xpath("//*[@class='noBg active']"));
		// at.click();

		String parentWinHand = driver.getWindowHandle();
		String childWinHand = null;

		Set<String> str = driver.getWindowHandles();
		Iterator<String> itr = str.iterator();
		while (itr.hasNext()) {
			childWinHand = itr.next();
			driver.switchTo().window(childWinHand);
			System.out.println(childWinHand);
		}

		

	}
}
