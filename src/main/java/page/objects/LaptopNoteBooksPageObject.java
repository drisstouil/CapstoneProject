package page.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class LaptopNoteBooksPageObject extends Base{
	public LaptopNoteBooksPageObject() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/a")
	private WebElement LaptopNoteBookTab ;
	public void UserClickOnLaptopNoteBookTab() {
		LaptopNoteBookTab.click();
	}
	
	@FindBy(xpath = "//*[@id=\"menu\"]/div[2]/ul/li[2]/div/a")
	private WebElement showAllLaptopNoteBook ;
	
	public void UserClickOnShowAllLaptopNoteBookOption() {
		showAllLaptopNoteBook.click();
	}
	
	//Scenario-->1
	@FindBy(xpath = "//*[@id=\"content\"]/div[4]/div[2]/div/div[1]/a/img")
	private WebElement clickOnMacBookItem;
	public void UserClickOnMacBookItem() {
		clickOnMacBookItem.click();
	}
	
	@FindBy(xpath = "//*[@id=\"button-cart\"]")
	private WebElement MacBookaddToCartButton;
	public void UserClickAddToCartbutton() {
		MacBookaddToCartButton.click();
	}
	
	@FindBy(xpath="//div[@class='alert alert-success alert-dismissible']")
    private WebElement MacBookToShoppingCartMessage;
	
	public boolean AddedMacBookToyourShoppingCart() {
		boolean outcomeMessageMacBookCart = MacBookToShoppingCartMessage.isDisplayed();
		return outcomeMessageMacBookCart;
		}
	@FindBy(xpath="//*[@id=\"cart\"]/button")
    private WebElement oneItemShowedToCart ;
	public boolean UserShouldSee1ItemsShowedToTheCart() {
		boolean Item1ShowedToThecartMessage = oneItemShowedToCart.isDisplayed();
		return Item1ShowedToThecartMessage;
		}
	@FindBy(id="cart")
	private WebElement clickOnCartOptionForMacBook;
	
	public void ClickOnCartOptionForMacItem() {
		clickOnCartOptionForMacBook.click();
	}
	
	@FindBy(xpath="//*[@id=\"cart\"]/ul/li[1]/table/tbody/tr/td[5]/button")
    private WebElement clickRedXButtonToRemoveTheItem ;
	
	public void clickOnRedXButtonToRemoveIheItem() {
		clickRedXButtonToRemoveTheItem.click();
	}
	@FindBy(xpath="//*[@id=\"cart-total\"]")
	private WebElement itemShouldBeRemovedMessage;
	public boolean itemShouldBeRemovedAndCartShouldShow0() {
		boolean ItemRemoveMessageShowed0 = itemShouldBeRemovedMessage.isDisplayed();
		return ItemRemoveMessageShowed0;
		}
	
	
	//Scenarior--> 2
	@FindBy(xpath = "//body[1]/div[2]/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[3]")
    private WebElement comparisonIconOnMacBook;
	public void clickOnProductComparisonIconOnMacBook() {
		comparisonIconOnMacBook.click();
	}
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[3]/div/div[2]/div[2]/button[3]")
    private WebElement comparisonIconOnMacBookAir ;
	public void clickOnProductComparisonIconOnMacBookAir() {
		comparisonIconOnMacBookAir.click();
	}
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
    private WebElement  MacBookAirToProductComparisonMessage;
	public boolean MacBookAndMacBookAirProductComparison() {
		boolean productComparisonMessage = MacBookAirToProductComparisonMessage.isDisplayed();
		return productComparisonMessage;
		}
	
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]/a[2]")
    private WebElement clickOnProductComparisonLink ;
   public void ProductComparisonLink() {
	   clickOnProductComparisonLink.click();
   }
	@FindBy(xpath="//div//h1[text()='Product Comparison']")
    private WebElement userProductComparisonChart;
	public boolean productComparisonChart() {
		boolean productComparisonChartMsg = userProductComparisonChart.isDisplayed();
		return productComparisonChartMsg;
		}
	//Scenario-->3
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[5]/div/div[2]/div[2]/button[2]")
    private WebElement addSonyVaIOLaptopToWishList;
   public void clickOnHeartIconToAddSonyVaIO () {
	   addSonyVaIOLaptopToWishList.click();
   }
	@FindBy(xpath="//*[@id=\"product-category\"]/div[1]")
    private WebElement logInToAddSonyToWishListMessage;
	public boolean createAccountToSaveSonyVAIO() {
		boolean SonyWishListMessage = logInToAddSonyToWishListMessage.isDisplayed();
		return SonyWishListMessage;
}
	//Scenario-->4
	
	@FindBy(xpath="//*[@id=\"content\"]/div[4]/div[4]/div/div[1]/a/img")
    private WebElement clickOnMacProItem;
   public void clickOnMacBookProItem() {
	   clickOnMacProItem.click();
   }
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/ul[2]/li[1]/h2")
    private WebElement PriceTagPresentOnUI;


	public boolean macProPricePresentOnUI() {
		boolean macProPriceTagMessage = PriceTagPresentOnUI.isDisplayed();
		return macProPriceTagMessage;






	}
}
