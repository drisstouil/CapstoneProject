package step.definition;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.HomePageObject;
import utilities.Utils;

public class HomePageStepDefinition extends Base {

	HomePageObject HomePageObject = new HomePageObject();

//	@Given("User is on Retail website")
//	public void user_is_on_retail_website() {
//
//		String expectedText = "TEST ENVIRONMENT";
//		String actualText = HomePageObject.EnvironmentTextHomePage();
//		Assert.assertEquals(expectedText, actualText);
//		logger.info("text test Environment was verified");
//
//	}

	@When("User click on Currency")
	public void user_click_on_currency() {

		HomePageObject.clickOnCurrency();
		logger.info("Currency");
	}

	@When("User Chose Euro from dropdown")
	public void user_chose_euro_from_dropdown() {
		HomePageObject.UserChoseEuroFromDropdown();
		logger.info("User Chose Euro from dropdown ");
	}

	@Then("currency value should change to Euro")
	public void currency_value_should_change_to_euro() {
		HomePageObject.currencyToEuro();
		logger.info("user was able to  change currency to Euro");
	}

	@When("User click on shopping cart")
	public void user_click_on_shopping_cart() throws InterruptedException {
		HomePageObject.UserClickOnShoppingCart();
		logger.info("User was able to click on shopping cart ");
		Thread.sleep(2000);
	}

	@Then("{string} message should display")
	public void message_should_display(String string) throws InterruptedException {
		String expectedText = "Your shopping cart is empty!";
		String actualText = HomePageObject.EnvironmentTextShoppingCart();
		Assert.assertEquals(expectedText, actualText);
		logger.info("Your shopping cart is empty");
		Thread.sleep(2000);
		Utils.takeScreenShot();
	}
}
