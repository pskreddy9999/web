package Data;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginAndCaptch {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		
		
		
		
		File screen =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		WebElement elem = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[30]/td[2]/img"));
        int width = elem.getSize().getWidth();
		
		int height = elem.getSize().getHeight();
		BufferedImage img = ImageIO.read(screen);
		
		
		FileUtils.copyFile(screen, new File("E:\\screenshot\\CaptchascreenShot3.png"));
		//BufferedImage dest=img.getSubimage(Image.getLocation().getX(), Image.getLocation().getY(), width, height)
//		BufferedImage dst = img.getSubimage(Image, y, w, h)
		
		System.out.println(elem.getText());
		//driver.close();
	}

}
