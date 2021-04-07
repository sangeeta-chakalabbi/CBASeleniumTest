package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjectRepo.*;
import init.SetUp;

public class SearchTest extends SetUp {
	SearchPage searchPage = new SearchPage(SetUp.driver);


	
	@BeforeMethod
	public void start() {
		SetUp.readEnvironmentVariables();
		SetUp.initWebDriver();
		String url = SetUp.prop.getProperty("url");
		
		SetUp.driver.get(url);
	}
	
	
	@Test
	public void test_queryInputFieldIsPresent() {
		Assert.assertTrue(searchPage.getSearchInputField().isDisplayed());
	}
	
	
	
	@AfterMethod
	public void end() {
		
		
		SetUp.driver.close();
		
	}

}
