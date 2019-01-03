package Practice;

import java.sql.*;
import java.time.Duration;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.collections4.map.StaticBucketMap;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class OracleDB {
	public static WebDriver driver;
 
public static void readSql() {
		Connection connect;
		 
		try {
			
			connect  = DriverManager.getConnection(Parameterization.readProperty("url"), Parameterization.readProperty("username"), Parameterization.readProperty("password"));
			Statement statement = connect.createStatement();
			
			ResultSet rstl = statement.executeQuery(Parameterization.readProperty("queryForEntireTable"));
			System.out.println("records found");
			while(rstl.next()) {
				
				String name = rstl.getString(Parameterization.readProperty("name"));
				String email = rstl.getString(Parameterization.readProperty("email"));
				
				System.out.println("Name:- "+ name + " email:-" + email);
				
			   String empId = rstl.getString(1);
				System.out.println(empId);
				System.out.println(rstl.getString(2));
				
				 driver =  new ChromeDriver();
//				 System.setProperty("webdriver.chrome.driver", "Drivers\\chromedriver.exe");
				 driver.get("https://www.facebook.com/");
				 driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(empId);
                
			}
			connect.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
 public static void UsingAlter() {	 
	 
	 try {
		Connection connection = DriverManager.getConnection(Parameterization.readProperty("url"), "username", "password");
	   
		Statement statement = connection.createStatement();
		
		ResultSet rslt = statement.executeQuery(Parameterization.readProperty("usingAlter"));
		
		System.out.println("moblie column added to the table: "+ rslt);
	 } catch (SQLException e) {
		
		e.printStackTrace();
	}
 }

}
