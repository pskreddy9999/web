import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://www.tricentis.com/");
		
//		WebElement products = driver.findElement(By.linkText("Products"));
		
		WebElement products = wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Products")));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(products).build().perform();
		
//	  WebDriverWait wait1 = new WebDriverWait(driver, 30);
		
//       WebElement click = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(driver.findElement(By.linkText("Selenium Testing"))));
		
		WebElement click= driver.findElement(By.linkText("Selenium Testing"));
       
       click.click();
//       wait.pollingEvery(Duration.ofMillis(100));
       
      WebElement details = driver.findElement(By.xpath("//div[@class='wpb_wrapper']/a/span[contains(text(),'Get Migration Details')]"));
      details.click();
       
     //*[@class='wpb_wrapper']/a/span[contains(text(),'Get Migration Details')]
		
		driver.close();

	}

}
