import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import com.gargoylesoftware.htmlunit.javascript.background.JavaScriptExecutor;

import net.sourceforge.htmlunit.corejs.javascript.ast.SwitchCase;

public class Proper {

	static WebDriver driver;

	public static void main(String[] args) {

		Properties pro = null;
		FileReader fr = null;

		try {
			pro = new Properties();
			fr = new FileReader("D:\\workspace\\WebDriver\\src\\or.properties");
			pro.load(fr);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		String url = pro.getProperty("URL");

		// driver.get(pro.getProperty(url));
		System.out.println(url);

		String browserName = pro.getProperty("browser");
		System.out.println(browserName);

		switch (browserName.toUpperCase()) {
		case "CHROME":
			driver = new ChromeDriver();
			break;
		case "FIREFOX":
			driver = new FirefoxDriver();
			break;
		case "IEDRIVER":
			driver = new InternetExplorerDriver();

		default:
			System.out.println("Invalid browser");
			System.exit(0);
			break;
		}

		driver.manage().window().maximize();

		driver.get(url);
		
//		driver.findElement(By.xpath((pro.getProperty("signUp")))).click();

		if (driver.findElement(By.xpath((pro.getProperty("signUp")))) != null) {

			System.out.println("Element is enabled");
		} else {
			System.out.println("Element is disabled");
		}
		if (driver.findElement(By.xpath(pro.getProperty("signUp"))).isDisplayed()) {
			System.out.println("Element is visible");
		} else {
			System.out.println("Element is not visible");
		}

	}

}
