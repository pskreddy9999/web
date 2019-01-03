package Data;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class popUps {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.rediff.com/");
		WebElement sign = driver.findElement(By.xpath("//*[@id=\"signin_info\"]/a[1]"));
		sign.click();
		String parentWindowHandler = driver.getWindowHandle(); // Store your parent window
		String subWindowHandler = null;

		Set<String> windowId = driver.getWindowHandles(); // get window id of current window
		Iterator<String> itererator = windowId.iterator();

		while (itererator.hasNext()) {
			subWindowHandler = itererator.next();
		}
		//driver.switchTo().window(subWindowHandler); // switch to popup window

		// Now you are in the popup window, perform necessary actions here

		//driver.switchTo().window(parentWindowHandler); // switch back to parent window

		driver.switchTo().window(subWindowHandler);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.close();
		// Thread.sleep(2000);

		driver.switchTo().window(parentWindowHandler);
		//System.out.println(driver.getTitle());

		// Alert alert = driver.switchTo().alert();
		// alert.accept();
		WebElement eml = driver.findElement(By.xpath("//*[@type='submit']"));
		eml.click();
		Thread.sleep(5000);
		Alert alertOK = driver.switchTo().alert();
		alertOK.accept();

		// Alert alert = driver.switchTo().alert();
		// alert.dismiss();

		// driver.close();
		// driver.quit();

	}
}
