package step.definition;

import javax.rmi.CORBA.Util;

import org.junit.Assert;

import core.Base;
import io.cucumber.java.en.*;
import page.objects.LaptopNoteBooksPageObject;
import utilities.Utils;

public class LaptopNoteBooksStepDefinition extends Base{
	 public LaptopNoteBooksPageObject LaptopNoteBooksPageObj = new LaptopNoteBooksPageObject();
	
	 @When("User click on Laptop & NoteBook tab")
	 public void user_click_on_laptop_note_book_tab() {
		 LaptopNoteBooksPageObj.UserClickOnLaptopNoteBookTab();
	     logger.info("User click on Laptop & NoteBook tab");
	 }

	 @When("User click on Show all Laptop & NoteBook option")
	 public void user_click_on_show_all_laptop_note_book_option() {
		 LaptopNoteBooksPageObj.UserClickOnShowAllLaptopNoteBookOption();
	     logger.info("User click on Show all Laptop & NoteBook option");
	 
	 }
//Scenario-->1
	 @When("User click on MacBook item")
	 public void user_click_on_mac_book_item() {
		 LaptopNoteBooksPageObj.UserClickOnMacBookItem();
	 logger.info("User click on MacBook item");
	 }

	 @When("User click add to Cart button")
	 public void user_click_add_to_cart_button() {
		 LaptopNoteBooksPageObj.UserClickAddToCartbutton();
	 logger.info("User click add to Cart button");
	 }

	 @Then("User should see a message3 {string}")
	 public void user_should_see_a_message3(String string) {
		 Assert.assertTrue(LaptopNoteBooksPageObj.AddedMacBookToyourShoppingCart());
			logger.info("Success: You have added MacBook to your shopping cart!");
	 }

	 @Then("User should see {string} showed to the cart")
	 public void user_should_see_showed_to_the_cart(String string) {
		 Assert.assertTrue(LaptopNoteBooksPageObj.UserShouldSee1ItemsShowedToTheCart());
			logger.info(" 1 item(s) - $602.00");
	 }
	 

	 @Then("User click on cart option")
	 public void user_click_on_cart_option() {
	 
		 LaptopNoteBooksPageObj.ClickOnCartOptionForMacItem();
	 logger.info("User click on cart option");
	 }

	 @Then("user click on red X button to remove the item from cart")
	 public void user_click_on_red_x_button_to_remove_the_item_from_cart() {
		 LaptopNoteBooksPageObj.clickOnRedXButtonToRemoveIheItem();
	 logger.info("user click on red X button to remove the item from cart");
	 }

	 @Then("item should be removed and cart should show {string}")
	 public void item_should_be_removed_and_cart_should_show(String string) throws InterruptedException {
		 Assert.assertTrue(LaptopNoteBooksPageObj.itemShouldBeRemovedAndCartShouldShow0());
			logger.info(" 0 item(s) - $0.00");
			Thread.sleep(2000);
			Utils.takeScreenShot();
	
	 }
//Scenario-->2
	 @When("User click on product comparison icon on MacBook")
	 public void user_click_on_product_comparison_icon_on_mac_book() throws InterruptedException {
		 LaptopNoteBooksPageObj.clickOnProductComparisonIconOnMacBook();
	 logger.info("User click on product comparison icon on MacBook");
	 Thread.sleep(2000);
	
	 }

	 @When("User click on product comparison icon on MacBook Air")
	 public void user_click_on_product_comparison_icon_on_mac_book_air() throws InterruptedException {
		 LaptopNoteBooksPageObj.clickOnProductComparisonIconOnMacBookAir();
	 logger.info("User click on product comparison icon on MacBook Air");
	 Thread.sleep(2000);
	 Utils.takeScreenShot();
	 }

	 @Then("User Should see a message4 {string}")
	 public void user_should_see_a_message4(String string) throws InterruptedException {
		 Assert.assertTrue(LaptopNoteBooksPageObj.MacBookAndMacBookAirProductComparison());
			logger.info("Success: You have added MacBook Air to your product comparison!");
			Thread.sleep(2000);
	 Utils.takeScreenShot();
	 }

	 @Then("User click on Product comparison link")
	 public void user_click_on_product_comparison_link() throws InterruptedException {
		 LaptopNoteBooksPageObj.ProductComparisonLink();
	 logger.info("User click on Product comparison link");
	 Thread.sleep(2000);
	 }

	 @Then("User should see Product Comparison Chart")
	 public void user_should_see_product_comparison_chart() throws InterruptedException {
		 Assert.assertTrue(LaptopNoteBooksPageObj.productComparisonChart());
	 logger.info("User should see Product Comparison Chart");
	 Thread.sleep(2000);
		Utils.takeScreenShot();
	 }
//Scenario-->3
	 @When("User click on heart icon to add 'Sony VaIO'laptop to wish list")
	 public void user_click_on_heart_icon_to_add_sony_va_io_laptop_to_wish_list() {
		 LaptopNoteBooksPageObj.clickOnHeartIconToAddSonyVaIO();
	 logger.info("User click on heart icon to add 'Sony VaIO'laptop to wish list");
	
	 
	 }

	 @Then("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’")
	 public void user_should_get_a_message_you_must_login_or_create_an_account_to_save_sony_vaio_to_your_wish_list() throws InterruptedException {
	     Assert.assertTrue(LaptopNoteBooksPageObj.createAccountToSaveSonyVAIO());
	     logger.info("User should get a message ‘You must login or create an account to save Sony VAIO to your wish list");
	     Thread.sleep(2000);
			Utils.takeScreenShot();
	 
	 }
//Scenario-->4
	 @When("User click on {string} item")
	 public void user_click_on_item(String string) {
		 LaptopNoteBooksPageObj.clickOnMacBookProItem();
	 logger.info("User click on 'MacBook Pro' item");
	
	 }

	 @Then("User should see {string} price tag is present on UI.")
	 public void user_should_see_price_tag_is_present_on_ui(String string) throws InterruptedException {
	     
	     Assert.assertTrue(LaptopNoteBooksPageObj.macProPricePresentOnUI());

		 logger.info("User should see '$2,000.00' price tag is present on UI");
		 
		    Thread.sleep(2000);
			Utils.takeScreenShot();
		 
	 }
}