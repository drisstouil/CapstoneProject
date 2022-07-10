package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class HomePageObject extends Base {

	public HomePageObject() {
		PageFactory.initElements(driver, this);
	}

//Scenario 1
//	@FindBy(xpath = "//a[text() ='TEST ENVIRONMENT']")
//	private WebElement testEnviromentTextHomePage;
	@FindBy(xpath = "//span[text()='Currency']")
	private WebElement userClickOnCurrency;
	@FindBy(xpath = "//button[@name='EUR']")
	private WebElement EuroFromDropdown;
	@FindBy(xpath = "//*[@id=\"form-currency\"]/div/button/strong")
	private WebElement currencyValueChangeToEuro;
//Scenario 2
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement testEnviromentTextshoppingcart;
	@FindBy(xpath = "//a[@title='Shopping Cart']")
	private WebElement UserclicKOnShoppingCart;
	@FindBy(xpath = "//*[@id=\"content\"]/p")
	private WebElement emptyCartMessageShouldDisplay;

//	public String EnvironmentTextHomePage() {
//		String UITextCurrency = testEnviromentTextHomePage.getText();
//		return UITextCurrency;
//	}

	public void clickOnCurrency() {
		userClickOnCurrency.click();
	}

	
	public void UserChoseEuroFromDropdown() {
		EuroFromDropdown.click();
	}
	
	
	public String currencyToEuro() {
		String UITextCurrencyToEuro = currencyValueChangeToEuro.getText();
		return UITextCurrencyToEuro;
	}
	
	public String EnvironmentTextShoppingCart() {
		String UITextCart = testEnviromentTextshoppingcart.getText();
		return UITextCart;
	}
	public void UserClickOnShoppingCart() {
		
		UserclicKOnShoppingCart.click();
		
	}
	
	
	public String emptyCartMessageShouldDisplay() {
		String UITextEmptyCartDisplay = emptyCartMessageShouldDisplay.getText();
		return UITextEmptyCartDisplay;
	}
	
	
	
	
}