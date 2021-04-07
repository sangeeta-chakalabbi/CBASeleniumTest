package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjectRepo.*;

public class SearchTest extends SetUp {
	
	
	@BeforeMethod
	public void start() {
		SetUp.readEnvironmentVariables();
		SetUp.initWebDriver();
		String url = SetUp.prop.getProperty("url");
		
		SetUp.driver.get(url);
	}
	
	
	@Test
	public void test1() {
		
	}
	
	@AfterMethod
	public void end() {
		
		
		SetUp.driver.close();
		
	}

}
