import java.io.IOException;

import org.openqa.selenium.By;

public class Connectp extends ConnectProp {
	
public Connectp() throws IOException {
//		super();
		// TODO Auto-generated constructor stub
	}

public static void main(String[] args) throws IOException {
		
		
        ConnectProp.driver.get(url);
        
        ConnectProp.driver.findElement(By.id(prop.getProperty("email_id"))).sendKeys(prop.getProperty("user_name"));
        
        ConnectProp.driver.findElement(By.id(prop.getProperty("email_pass"))).sendKeys(prop.getProperty("password"));
        
        ConnectProp.driver.findElement(By.id(prop.getProperty("login_btn"))).click();
        
	}
  }


