/*import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.server.Response.OutputType;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;*/
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        WebDriver driver = new FirefoxDriver();
        
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        
        driver.get("http://www.calculator.net/");
        
        driver.findElement(By.xpath("//*[@id='hl3']/li[3]")).click();
        
        driver.findElement(By.id("cpar1")).sendKeys("10");
        
        driver.findElement(By.id("cpar2")).sendKeys("50");
        
        driver.findElement(By.xpath("//*[@id=\"content\"]/table[1]/tbody/tr[2]/td/input[2]")).click();
//        String result =
//                driver.findElement(By.xpath(".//*[@id = 'content']/p[2]/span/font/b")).getText();
        
        File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        try {
			FileUtils.copyFile(screenshot, new File("D:\\screenshots\\screenshots1.jpg"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//        System.out.println(" The Result is " + result);
        driver.close();
        
	}

}
