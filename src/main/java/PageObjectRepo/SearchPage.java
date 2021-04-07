package PageObjectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;




public class SearchPage {
	


	org.openqa.selenium.support.ui.WebDriverWait wait = new org.openqa.selenium.support.ui.WebDriverWait(SetUp.driver,30);


	@FindBy(id="search-input")
	private WebElement searchInputField;
	
	
	
	
	public SearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


	public WebElement getSearchInputField() {
    	wait.until(ExpectedConditions.elementToBeClickable(searchInputField));
		return searchInputField;
	}


	public void setSearchInputField(WebElement searchInputField) {
		this.searchInputField = searchInputField;
	}

}
