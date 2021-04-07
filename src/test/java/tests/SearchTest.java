package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import PageObjectRepo.*;

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
	
	@Test
	public void test_querySearchButtonIsPresent() {
		Assert.assertTrue(searchPage.getSearchButton().isDisplayed());
	}
	
	
	
	@AfterMethod
	public void end() {
		
		
		SetUp.driver.close();
		
	}

}
