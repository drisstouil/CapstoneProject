package step.definition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.DesktopPageObject;
import utilities.Utils;

public class DesktopPageStepDefinition extends Base {

	DesktopPageObject desktopPageObject = new DesktopPageObject();

	@When("User click on Desktops tab")
	public void user_click_on_desktops_tab() {
		desktopPageObject.clickOnDeskTops();
		logger.info("User clicked On Desktops tab successfully ");
		// Utils.takeScreenshotForStep();
	}

	@When("User click on Show all desktops")
	public void user_click_on_show_all_desktops() throws InterruptedException {
		desktopPageObject.clickShowAllDeskTops();
		logger.info("User clicked on Show all desktops  successfully");
		Thread.sleep(2000);
		Utils.takeScreenShot();

	}

//Scenario1
	@Then("User should see all items are present in Desktop page")
	public void user_should_see_all_items_are_present_in_desktop_page() throws InterruptedException {
		List<WebElement> deskTopElements = desktopPageObject.itemsDeskTops();

		for (WebElement element : deskTopElements) {
			Assert.assertTrue(element.isDisplayed());
			logger.info(element.getAttribute("title") + " is presnt");
			Thread.sleep(2000);
			Utils.takeScreenShot();
		}
		
	}

//Scenario-> 2
	@When("User click  ADD TO CART option on HP LP3065item")
	public void user_click_add_to_cart_option_on_hp_lp3065item() {
		desktopPageObject.clickOnHpl3065();
		logger.info("User clicked  ADD TO CART option on HP LP3065 item successfully ");
	}

	@When("User select 	Quantity {int}")
	public void user_select_Quantity(int a) {
		desktopPageObject.selectQuantity(a);
	}

	@When("User click add to Cart button1")
	public void user_click_add_to_cart_button1() {
		desktopPageObject.clickOnAddToCartButton();
		logger.info("User click add to Cart button");
		
	}

	@Then("User should see a message2 {string}")
	public void user_should_see_a_message2(String string) throws InterruptedException {
//		String hpexpectedMessage = "Success: you have added HP LP 3065 to your Shopping cart!";
//	    String hpactualMessage = desktopPageObject.UserShouldSeeThankYOUMessage();
//		Assert.assertEquals(hpexpectedMessage, hpactualMessage);
		Assert.assertTrue(desktopPageObject.reviewMessage());
		logger.info("Success: You have added HP LP3065 to your shopping cart!");
		Thread.sleep(2000);
		Utils.takeScreenShot();
	
	
	}
	

	// Scenario->3
	@When("User click  ADD TO CART option on Canon EOS 5Ditem")
	public void user_click_add_to_cart_option_on_canon_eos_5ditem() {
		desktopPageObject.clickonCanonEOS5DCamera();
		logger.info("User Added Canon EOS 5D To Cart Successfully");

	}

	@When("User select color from dropdown Red")
	public void user_select_color_from_dropdown_red() {
		desktopPageObject.CanonEOS5DCameraChooseColor();
		logger.info("User select color from dropdown Red");
		Utils.takeScreenShot();
	}

	@When("User select quantity {string}")
	public void user_select_quantity(String string) {
		desktopPageObject.CanonEOS5DCameraSelectQuantity(string);
	}

	@When("User click add to Cart button2")
	public void user_click_add_to_cart_button2() {
		desktopPageObject.CanonEOS5DCameraclickAddingCart();
		logger.info("canon camera added");
	}

	@Then("User should see a Message1 {string}")
	public void user_should_see_a_Message1() throws InterruptedException {
//		String expectedMessage = "Success: You have added Canon EOS 5D Camera to your shopping cart!";
//		String actualMessage = desktopPageObject.UserShouldSeeThankYOUMessage();
//		Assert.assertEquals(expectedMessage, actualMessage);
		Assert.assertTrue(desktopPageObject.reviewMessage());
		logger.info("Success: You have added Canon EOS 5D to your shopping cart!'");
		Thread.sleep(2000);
		Utils.takeScreenShot();
	
	}
// Scenario-> 4
	@When("User click on Canon EOS 5D item")
	public void user_click_on_canon_eos_5d_item() {
		desktopPageObject.clickonCanonEOS5DCamera();
	logger.info("User click on Canon EOS 5D item sucessfully");
	
	}



	@When("User click on write a review link")
	public void user_click_on_write_a_review_link() {
		desktopPageObject.clickOnWriteReviewLink();
	logger.info("User click on write a review link  suceesfully");
	}

	@When("user fill the review information with below information")
	public void user_fill_the_review_information_with_below_information(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> reviewInfos = dataTable.asMaps(String.class, String.class);
		desktopPageObject.enterYourName(reviewInfos.get(0).get("yourname"));
		desktopPageObject.enteryourReview(reviewInfos.get(0).get("yourReview"));
		desktopPageObject.selectRating(reviewInfos.get(0).get("Rating"));
		logger.info("user fill the review information with below information");
	}

	@When("User Click on Continue Button")
	public void user_click_on_continue_button() {
		desktopPageObject.clickReviewcontinueButton();
		logger.info("User click on Continue button");

	}



	@Then("User should see a message with {string}")
	public void user_should_see_a_message_with(String string) throws InterruptedException {
	
		Assert.assertTrue(desktopPageObject.reviewMessage());
		Thread.sleep(2000);
		Utils.takeScreenShot();
		}

}
