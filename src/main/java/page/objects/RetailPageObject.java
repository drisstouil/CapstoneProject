package page.objects;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import core.Base;
import utilities.Utils;

public class RetailPageObject extends Base {
	public RetailPageObject() {
		PageFactory.initElements(driver, this);
	}
//background
	@FindBy(xpath = "//a[text() ='TEST ENVIRONMENT']")
	private WebElement testEnviromentText;
	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement myAccountButton;
	@FindBy(xpath = "//a[text() ='Login']")
	private WebElement longinlink;
	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement enterEmailAdress;
	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordFiled;
	@FindBy(xpath = "//input [@value='Login']")
	private WebElement loginButton;
	@FindBy(xpath = "//div[@id=\"content\"]//h2[text()='My Account']")
	private WebElement MyAccountdashboard;
	// Scenario -> 1
	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement clickToRegesterForAffiliateAccount;
	@FindBy(xpath ="//input[@name='company']")
	private WebElement UserCompanyName;
	@FindBy(xpath= "//input[@name='website']")
	private WebElement UserWebSite;
	@FindBy(xpath = "//input[@name='tax']")
	private WebElement UserTaxId;
	@FindBy(xpath = "//label[normalize-space()='Cheque']")
	private WebElement UserPaymentMethod;
//	@FindBy(xpath = "//input[@name='cheque']")
//	private WebElement chequePayeeName;
	@FindBy(id = "input-cheque")
	private WebElement chequepayeeName;
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement clickOncheckButton;
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement UserClickOnContinueButton;
	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
    private WebElement UserShouldSeeASuccessMessage;
// scenario -> 2 Edit your affiliate information from Cheque payment method to Bank Transfer
	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EdityourAffiliateInformationlink;
	@FindBy(xpath = "//input[@value='bank']")
	private WebElement clickOnBankTransferRadioButton;
	@FindBy(xpath = "//*[@id=\"input-bank-name\"]")
	private WebElement userBankName;
	@FindBy(xpath = "//*[@id=\"input-bank-branch-number\"]")
	private WebElement userAbaNumber;
	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement userSwiftCode;
	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement userAccountName;
	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement userAccountNumber;
	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement UserClickonContinueButtonEditAcc;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible'][1]")
	private WebElement UserShouldSeeaSuccessMessage;
	// Scenario -> 3
	@FindBy(xpath="//a[text()='Edit your account information']")
	private WebElement UserClickOnEditYourAccountInformationlink;
	@FindBy(xpath="//*[@id=\"input-firstname\"]")
	private WebElement firstNameField;
	@FindBy(xpath = "//*[@id=\"input-lastname\"]")
	private WebElement lastNameField;
	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement emailAddressField;
	@FindBy(xpath="//*[@id=\"input-telephone\"]")
	private WebElement phoneNumberField;
	@FindBy(xpath="//input[@value='Continue']")
	private WebElement continueButtonEditAccountInfo;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement SuccessMessageOnAccountEditInfo;

	public String getTextEnvironmentText() {
		String UIText = testEnviromentText.getText();
		return UIText;
	}

	public void ClickmyAccountButton() {
		myAccountButton.click();
	}

	public void ClickOnlonginlink() {
		longinlink.click();
	}

	public void enterEmailAdress(String email) {
		enterEmailAdress.sendKeys(email);
	}

	public void enterPassword(String password) {
		passwordFiled.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	public String loggedInToMyAccountDashBoardText() {
		String DashBoardText = MyAccountdashboard.getText();
		return DashBoardText;
	}

//Scenario -> 1
	public void clickOnRegisterforAffiliateAccount() {
		clickToRegesterForAffiliateAccount.click();
	}

	public void enterCompanyName(String company) {
		UserCompanyName.clear();
		UserCompanyName.sendKeys(company);

	}

	public void enterCompanyWebSite(String website) {
		UserWebSite.clear();
		UserWebSite.sendKeys(website);
	}

	public void enterUserTaxId(String TaxID) {
		UserTaxId.clear();
		UserTaxId.sendKeys(TaxID);

	}

    public void PaymentMethodBox(String paymentMethod) {
    	//UserPaymentMethod.clear();
    	UserPaymentMethod.sendKeys(paymentMethod);

}
	public void payeename(String PayeeNameInput) {
		//chequepayeeName.sendKeys(PayeeNameInput);
Utils.sendKeys(chequepayeeName, PayeeNameInput);
	}


	
	public void UserCheckOnAboutUsCheckBox() {

		clickOncheckButton.click();
	}

	public void clickOncontinueButton() {
		UserClickOnContinueButton.click();

	}

	public String UserShouldseeASuccessMessage() {
		String SuccessMessageOnAffiliatedAccount = UserShouldSeeASuccessMessage.getText();
		return SuccessMessageOnAffiliatedAccount;
	}

	// Scenario ->2
	public void EditYourAffiliateInformationtoBankTransfer() {
		EdityourAffiliateInformationlink.click();
	}

	public void userClickOnBankTransferRadioButton() {
		clickOnBankTransferRadioButton.click();
	}

	public void enterbankName(String bankName) {
		userBankName.clear();
		userBankName.sendKeys(bankName);

	}

	public void enterAbaNumber(String abaNumber) {
		userAbaNumber.clear();
		userAbaNumber.sendKeys(abaNumber);
	}

	public void enterswiftCode(String swiftCode) {
		userSwiftCode.clear();
		userSwiftCode.sendKeys(swiftCode);
	}

	public void enteraccountName(String accountName) {
		userAccountName.clear();
		userAccountName.sendKeys(accountName);
	}

	public void enteraccountNumber(String accountNumber) {
		userAccountNumber.clear();
		userAccountNumber.sendKeys(accountNumber);
	}

	public void UserClicKOnContinueButtonForEditAffilited() {
		EdityourAffiliateInformationlink.click();

	}

	public String UserShouldSeeASuccessMessageForEditAffliated() {
		String SuccessMessageOnAffiliatedDispaly = SuccessMessageOnAccountEditInfo.getText();
		return SuccessMessageOnAffiliatedDispaly;

	}

//Scenario ->3
	public void UserClickOnEditYourAccountInformation() {
		//UserClickOnEditYourAccountInformationlink.click();
		Utils.clickWithJSE(UserClickOnEditYourAccountInformationlink);
	}

	public void editFirstName(String firstName) {
		firstNameField.clear();
		firstNameField.sendKeys(firstName);
	}

	public void editLastName(String lastName) {
		lastNameField.clear();
		lastNameField.sendKeys(lastName);
	}

	public void editEmailAddress(String email) {
		emailAddressField.clear();
		emailAddressField.sendKeys(email);

	}

	public void editPhoneNumber(String telephone) {
		phoneNumberField.clear();
		phoneNumberField.sendKeys(telephone);

	}

	public void clickOntinueButtonToEditAccountInformation() {
		Utils.clickWithJSE(continueButtonEditAccountInfo);
		//continueButtonEditAccountInfo.click();
	}

	public String getSuccessMessageFromEditAccountInfos() {
		String textMessageOnEditAccountInfo = SuccessMessageOnAccountEditInfo.getText();
		return textMessageOnEditAccountInfo;
	}

}
