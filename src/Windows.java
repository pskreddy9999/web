

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Windows {

	public static void main(String[] args) {
   
System.setProperty("webdriver.gecko.driver", "Drivers\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.gmail.com");
		
		Set<String> st =driver.getWindowHandles();
		
		Iterator<String> it = st.iterator();
		
		String mainwindow =it.next();
		String popUp =it.next();
		if(!mainwindow.equals(popUp)) {
			
//			driver.switchTo().window(popUp).close();
			System.out.println(popUp.length());
			
		}
		
		driver.switchTo().window(mainwindow);

	}
	
   
}
