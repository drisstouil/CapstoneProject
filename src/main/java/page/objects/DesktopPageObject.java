package page.objects;

import java.util.Iterator;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.Utils;

public class DesktopPageObject extends Base {
	public DesktopPageObject() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='Desktops']")
	private WebElement desktops;

	public void clickOnDeskTops() {
		// Utils.moveToElement(desktops);
		desktops.click();
		// Utils.hoveMouseOverElement(desktops);

	}

	@FindBy(xpath = "//a[text()='Show All Desktops']")
	private WebElement showAllDesktops;

	public void clickShowAllDeskTops() {
		showAllDesktops.click();
	}

	// Scenario 1
	@FindBy(tagName = "img")
	private List<WebElement> items;

	public List<WebElement> itemsDeskTops() {
		List<WebElement> itemsOnDeskTop = items;
		return itemsOnDeskTop;

	}

//Scenario 2
	@FindBy(xpath = "//h4//a[text()='HP LP3065']")
	private WebElement addToCarthpLP3065;

	public void clickOnHpl3065() {
		addToCarthpLP3065.click();
	}

	@FindBy(id = "input-quantity")
	private WebElement quantity1;

	public void selectQuantity(int a) {
		quantity1.clear();
		quantity1.sendKeys("1");
	}

	@FindBy(xpath = "//button[@id='button-cart']")
	private WebElement addToCartButton;

//	@FindBy(xpath= "//button[@id='button-cart']")
//	private WebElement addToCartButton1;

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

//	@FindBy(xpath = "//*[@id=\"product-product\"]/div[1]")
//	private WebElement HPLPSuccessmesaage;
//
//	public String SuccessMesaagePresent() {
//		
//      String hpAddToCartSuccessMsg = HPLPSuccessmesaage.getText();
//
//	        return hpAddToCartSuccessMsg;

	// String actualMessageHP =HPLPSuccessmesaage.getText();
//		 return actualMessageHP;
	// "Success: You have added HP LP3065 to your shopping cart!";
	// if (HPLPSuccessmesaage.isDisplayed())
//			return true;
//		else
//			return false;

//Scenario-> 3

	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[2]/div[2]/button[1]")
	private WebElement addCanonEOS5DCamera;

	public void clickonCanonEOS5DCamera() {
		addCanonEOS5DCamera.click();
	}

	@FindBy(css = "#input-option226 > option:nth-child(2)")
	private WebElement CanonEOS5DCameraColor;

	public void CanonEOS5DCameraChooseColor() {
		CanonEOS5DCameraColor.click();
	}

	@FindBy(id = "input-quantity")
	private WebElement CanonEOS5DCameraQuantity;

	public void CanonEOS5DCameraSelectQuantity(String cameraQuantityValue) {
		CanonEOS5DCameraQuantity.click();
	}

	@FindBy(xpath = "//button[text()='Add to Cart']")
	private WebElement CanonEOS5DCameraAddToCart;

	public void CanonEOS5DCameraclickAddingCart() {
		CanonEOS5DCameraAddToCart.click();
	}

	@FindBy(xpath = "(//a[text()='Canon EOS 5D Camera'])[3]")
	private WebElement CanonEOS5DCameraSuccessMessage;

	public String SuccessMessageForCanon() {
		String CanonScessMessageText = "Success: You have added " + CanonEOS5DCameraSuccessMessage.getText()
				+ " to your shopping cart!";
		return CanonScessMessageText;
	}

	// Scenari4->
	@FindBy(xpath = "//a[text()='Canon EOS 5D Camera']")
	private WebElement UserclickOnCanonEOS5DItem;

	public void clickOnCanonEOS5DItem() {
		UserclickOnCanonEOS5DItem.click();
	}

	@FindBy(xpath = "//a[text()='Write a review']")
	private WebElement WriteReviewLink;

	public void clickOnWriteReviewLink() {
		WriteReviewLink.click();
	}

	@FindBy(id = "input-name")
	private WebElement yourNameFiled;

	public void enterYourName(String yourname) {
		yourNameFiled.sendKeys(yourname);
	}

	@FindBy(xpath = "//textarea[@name='text']")
	private WebElement yourReviewFiled;

	public void enteryourReview(String yourReview) {
		yourReviewFiled.sendKeys(yourReview);
		// Utils.clickWithJSE(yourReviewFiled);
	}

	@FindBy(xpath = "//input[@type='radio']")
	private List<WebElement> Rating;

	public void selectRating(String ratingValue) {
		List<WebElement> ratingElements = Rating;
		for (WebElement element : ratingElements) {
			if (element.getAttribute("value").equalsIgnoreCase(ratingValue.trim())) {
				element.click();
				break;
			}

		}
	}

	@FindBy(xpath = "//button[text()='Continue']")
	private WebElement reviewcontinueButton;

	public void clickReviewcontinueButton() {
		reviewcontinueButton.click();
		// Utils.clickWithJSE(reviewcontinueButton);
	}

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")

	private WebElement reviewRatingThankYouMessage;
	
	public boolean reviewMessage() {
	boolean outcomeMessage = reviewRatingThankYouMessage.isDisplayed();
	return outcomeMessage;
	}

//	 public String reviewMessagehasBeenSubmitted() {
//		String reviewRatingMesg = reviewRatingThankYouMessage.getText();
//return reviewRatingMesg;
//}
}