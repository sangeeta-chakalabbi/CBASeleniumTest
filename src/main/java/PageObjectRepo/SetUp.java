package PageObjectRepo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetUp {
	
	public static WebDriver driver;
	public static Properties prop;
	
	
	public static void readEnvironmentVariables() {
		
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(
					"./src/main/java/config/config.properties");

			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void initWebDriver() {
		String browserName = prop.getProperty("browser");
		if(browserName.equalsIgnoreCase("chrome"))
			System.setProperty("webdriver.chrome.driver","/Users/San/Downloads/chromedriver");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();

		}	
	

}
