import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class webDriverdemo3 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = null;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Browser Name: ");
//		String browser = in.next();
		String sc = null;
		if(in.hasNextLine()){
			sc = in.nextLine();
			}
			switch(sc.toLowerCase()){
			
		
			case "chrome":
			System.setProperty("webdriver.ie.driver","$Path/chromedriver.exe");
			driver = new ChromeDriver();
			break;
			
			case "firefox":
			driver = new FirefoxDriver();
			break;
	
			default:
			System.out.println("Invalid Choice");
			System.exit(0);
			break;
			}
			driver.get("https://accounts.google.com/");
			
	
			
	}
}
