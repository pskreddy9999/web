import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oldversion {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.google.com/");
		
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle().toUpperCase());
		
//		driver.findElement(By.cssSelector("css=a.gb_P")).click();
		
		WebElement ele = driver.findElement(By.xpath("//*[@class='gb_P'][contains(text(),'Gmail')]"));
		ele.click();
		
		WebElement elm =driver.findElement(By.xpath("//*[@class='vdE7Oc f3GIQ']/p[contains(text(),'Use another account')]"));
		elm.click();
		
		if(ele.isSelected()) {
			System.out.println(elm.getTagName());
		}
		
		driver.close();
		
	}

}
