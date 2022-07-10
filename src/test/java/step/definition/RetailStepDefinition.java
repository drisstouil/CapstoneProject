package step.definition;


import java.util.List;
import java.util.Map;

import org.junit.Assert;

import core.Base;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import page.objects.RetailPageObject;
import utilities.Utils;

public class RetailStepDefinition extends Base{
	
	RetailPageObject retailPageObject = new RetailPageObject();
	//Backgrond 
	@Given("User is on Retail website")
	public void user_is_on_retail_website() {
		String expectedText = "TEST ENVIRONMENT";
        String actualText = retailPageObject.getTextEnvironmentText();
        Assert.assertEquals(expectedText, actualText);
        logger.info("text test Environment was verified");

	}

	@And("User click  on MyAccount")
	public void user_click_on_my_account() throws InterruptedException {
		retailPageObject.ClickmyAccountButton();
        logger.info("My Account");
        //Thread.sleep(2000);
	}

	@When("User click on Login")
	public void user_click_on_login() {
		retailPageObject.ClickOnlonginlink();
        logger.info("link was successfully clicked");
	}

	@When("User enter username 'userName'and password {string}")
	public void user_enter_username_user_name_and_password(String string) throws InterruptedException {
		retailPageObject.enterEmailAdress("patrixdriss7000@gmail.com");
        retailPageObject.enterPassword("123456");
        logger.info("email And Password Were Entered Successfully");
       // Thread.sleep(4000);
	}

	@When("User click on Login button")
	public void user_click_on_login_button() {
		retailPageObject.clickOnLoginButton();
        logger.info("was able to click successfully on login button");
	}

	@Then("User should be logged in to MyAccount dashboard")
	public void user_should_be_logged_in_to_my_account_dashboard() throws InterruptedException {
		String expectedText = "My Account";
        String actualText = retailPageObject.loggedInToMyAccountDashBoardText();
        Assert.assertEquals(expectedText, actualText);
        logger.info("user on My Account dashboard ");
       // Thread.sleep(4000);
	}
// Scenario 1 -> Register as an Affiliate user with Cheque Payment Method
	@When("User click on 'Register for an Affiliate Account'link")
	public void user_click_on_register_for_an_affiliate_account_link() throws InterruptedException {
		retailPageObject.clickOnRegisterforAffiliateAccount();
	logger.info("successfully Register For  Affiliate Account ");
	//Thread.sleep(4000);
	
	}

	@And("User fill affiliate form with below information")
	public void user_fill_affiliate_form_with_below_information(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterCompanyName(data.get(0).get("company"));
		retailPageObject.enterCompanyWebSite(data.get(0).get("website"));
		retailPageObject.enterUserTaxId(data.get(0).get("taxID"));
		retailPageObject.PaymentMethodBox(data.get(0).get("paymentMethod"));
		retailPageObject.payeename(data.get(0).get("payeeName"));
	    logger.info("user was able to filled affiated account form");
	    Thread.sleep(4000);
	}

	@When("User check on About us check box")
	public void user_check_on_about_us_check_box() throws InterruptedException {
	retailPageObject.UserCheckOnAboutUsCheckBox();
	logger.info("User check on About us check box successfully ");
	Thread.sleep(4000);
	}
	

	@When("User click on Continue button")
	public void user_click_on_Continue_button() throws InterruptedException {
		retailPageObject.clickOncontinueButton();
	logger.info("User clicked on Continue button successfully ");
	Thread.sleep(4000);
	}
	@Then("User should see a success message")
	public void user_should_see_a_success_message() throws InterruptedException {
		String expectedText = "Success: Your account has been successfully updated.";
        String actualText = retailPageObject.UserShouldseeASuccessMessage();
        Assert.assertEquals(expectedText, actualText);
        logger.info("User was able to see the  success message ");
        Thread.sleep(2000);
		Utils.takeScreenShot();
	
	}
//Scenario -> 2
	@When("User click on Edit your affiliate information link")
	public void user_click_on_edit_your_affiliate_information_link() throws InterruptedException {
	   retailPageObject.EditYourAffiliateInformationtoBankTransfer();
	logger.info("User clicked on Edit  affiliate information link successfully ");
	//Thread.sleep(4000);
	}

	@When("user click on Bank Transfer radio button")
	public void user_click_on_bank_transfer_radio_button() {
		retailPageObject.userClickOnBankTransferRadioButton();
	logger.info("user clicked on Bank Transfer radio button successefully");
	}

	@When("User fill Bank information with below information")
	public void user_fill_bank_information_with_below_information(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.enterbankName(data.get(0).get("bankName"));
		retailPageObject.enterAbaNumber(data.get(0).get("abaNumber"));
		retailPageObject.enterswiftCode(data.get(0).get("swiftCode"));
		retailPageObject.enteraccountName(data.get(0).get("accountName"));
		retailPageObject.enteraccountNumber(data.get(0).get("accountNumber"));
		logger.info("user was able to edit  affiated account form successfully");
	
		Thread.sleep(2000);
		Utils.takeScreenShot();
	}
	//Scenario-> 3
	

	@When("User click on 'Edit your account information'link")
	public void user_click_on_edit_your_account_information_link() {
		retailPageObject.UserClickOnEditYourAccountInformation();
	logger.info("user clicked on Edit your account information link  successfully");
	}

	@When("User modify below information")
	public void user_modify_below_information_link(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		retailPageObject.editFirstName(data.get(0).get("firstName"));
		retailPageObject.editLastName(data.get(0).get("lastName"));
		retailPageObject.editEmailAddress(data.get(0).get("email"));
		retailPageObject.editPhoneNumber(data.get(0).get("telephone"));
	    logger.info("user was able to modify account information successfully");
	
	}
	@When("User click on continue button")
	public void user_click_on_continue_button() {
	retailPageObject.clickOntinueButtonToEditAccountInformation();
    logger.info("user clicked on edit acoount info continue button successfully");
}

	@Then("User should see a message {string}")
public void user_should_see_a_message(String string) throws InterruptedException {
	  String expectedMessage = "Success: Your account has been successfully updated.";
	String actualMessage =retailPageObject.getSuccessMessageFromEditAccountInfos();
	Assert.assertEquals(expectedMessage,actualMessage);
	logger.info("the user successfully get:  Success: Your account has been successfully updated");
	Thread.sleep(2000);
	Utils.takeScreenShot();
	
	}
	
	
	
	
}


