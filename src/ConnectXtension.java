import java.util.Properties;

import org.openqa.selenium.By;

public class ConnectXtension extends ConnectProp{
	public static Properties prop;

	public static void main(String[] args) throws NullPointerException {
	
		
//        String url = null;
		
		ConnectProp.driver.get(url);
        
        driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("user_name"));
        
        driver.findElement(By.id(prop.getProperty("email_pass"))).sendKeys(prop.getProperty("password"));
        
        driver.findElement(By.id(prop.getProperty("login_btn"))).click();
		

	}

}
