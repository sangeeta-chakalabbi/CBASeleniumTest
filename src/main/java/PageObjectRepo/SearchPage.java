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
	
	@FindBy(id="search-button")
	private WebElement searchButton;

	@FindBy(id="error-empty-query")
	private WebElement emptyQueryErrorMessage;
	
	
	
	public WebElement getEmptyQueryErrorMessage() {
		return emptyQueryErrorMessage;
	}




	public void setEmptyQueryErrorMessage(WebElement emptyQueryErrorMessage) {
		this.emptyQueryErrorMessage = emptyQueryErrorMessage;
	}




	public WebElement getSearchButton() {
    	wait.until(ExpectedConditions.elementToBeClickable(searchButton));

		return searchButton;
	}
	
	


	public void setSearchButton(WebElement searchButton) {
		this.searchButton = searchButton;
	}


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
