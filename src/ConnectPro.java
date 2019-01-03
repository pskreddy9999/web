import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConnectPro {
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		FileInputStream fio = new FileInputStream("D:\\workspace\\WebDriver\\src\\or.properties");
		
		prop.load(fio);
        System.out.println(prop.getProperty("URL"));
		
        String url = prop.getProperty("URL");
		System.out.println(url);
		
		String browserName = prop.getProperty("browser");
		System.out.println(browserName);
	}

}
