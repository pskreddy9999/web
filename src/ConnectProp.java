import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class ConnectProp {
public static String ConnectPro;// = null;
public static WebDriver driver;
public static FileInputStream fio;
public static Properties prop = new Properties();
public static String url;


	public static void main(String[] args) throws IOException {
		
		prop = new Properties();
		
		fio = new FileInputStream("D:\\workspace\\WebDriver\\src\\or.properties");
		
		prop.load(fio);
		
		System.out.println(prop.getProperty("URL"));
		
        String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
		
		if(browserName.equals("chrome")){
		System.setProperty("Webdriver.chrome.driver", "E:\\eclipse\\Drivers\\chromedriver.exe");
		 driver = new ChromeDriver();
		}else if(browserName.equals("Firefox")) {
			System.setProperty("Webdriver.gecko.driver", "E:\\eclipse\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}else if(browserName.equals("IEbrowser")) {
			System.setProperty("Webdriver.iexplorer.driver","E:\\eclipse\\Drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}

		
        driver.get(url);
        
//        driver.close();
        
//        driver.findElement(By.id(pro.getProperty("email_id"))).sendKeys(pro.getProperty("user_name"));
        
//        driver.findElement(By.id(pro.getProperty("email_pass"))).sendKeys(pro.getProperty("password"));
        
//        driver.findElement(By.id(pro.getProperty("login_btn"))).click();
        driver.findElement(By.className(prop.getProperty("signup_class"))).click();
        
	}
  }

