package Data;

import javax.swing.plaf.synth.SynthSplitPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class WebTable {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.cricbuzz.com/");

		WebElement ele = driver.findElement(By.xpath(
				"//*[@class=' cb-ovr-flo cb-text-complete']" + "[contains(text(),'Derbyshire won by 31 runs')]"));

		ele.click();

		driver.findElement(By.linkText("Scorecard")).click();

		String xp_start = "//*[@id='innings_1']/div[1]/div[";
		String xp_end = "]/div[1]/a";

		Thread.sleep(30);

		int row_num = 0;
		for (int i = 1; i <=4; i=i+1) {

			String x = driver.findElement(By.xpath(xp_start + i + xp_end)).getText();
			row_num++;

			System.out.println(x);
		}

		System.out.println("Number of rows : " + row_num);
		driver.close();

	}
}
