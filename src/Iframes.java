

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Iframes {
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		
		List<WebElement> iframeCount = driver.findElements(By.tagName("iframe"));
		System.out.println("The total number of iframes are : "+iframeCount.size());
		
		driver.switchTo().frame(0);
		driver.switchTo().frame("iframe2");
		driver.switchTo().frame("ID3");
		driver.switchTo().defaultContent();
	}

}
