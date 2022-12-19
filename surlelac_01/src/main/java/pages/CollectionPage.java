package pages;

import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import Utilities.Base_test;
import Utilities.ExtentReport;
import Utilities.TestUtil;

public class CollectionPage {
	public WebDriver driver = null;
	public static JavascriptExecutor js;

//	To find WebElement for first_Product
	
	@FindBy(xpath = "//a[@href='/products/101-t-shirt']")
	private WebElement firstProduct;
	
	//XL
	@FindBy(xpath = "//label[@for='template--15566425686190__main-2-3']")
	private WebElement xlargeSize;
	
	@FindBy(xpath = "//li//label[@title='XXL']")
	private WebElement scrolToCart;
	
	@FindBy(xpath = "//div//button[@name='add']")
	private WebElement addtoCart;
	
	@FindBy(xpath = "//a[@id='cart-notification-button']")
	private WebElement view_myCart;
	
	@FindBy(xpath = "//h3[text()='Subtotal']")
	private WebElement scrollToCheckOut;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement checkOut;
	
		
//	WebElement for 6th Product
	
	
	@FindBy(xpath = "//p[text()='Premium cotton, Made in U.S.A.']")
	private WebElement sixthProduct;
	
	@FindBy(xpath = "//input[@id='template--15566425686190__main-2-2']")
	private WebElement sixthLargeSize;
	
	@FindBy(xpath = "//button[@name='add']")
	private WebElement sixthAddtoCart;
	
	@FindBy(xpath = "//a[@id='cart-notification-button']")
	private WebElement sixthViewMyCart;
//	
//	@FindBy(xpath = "//th[@class='small-hide right caption-with-letter-spacing']")
//	private WebElement scrollTotal;
	
	@FindBy(xpath = "//button[@id='checkout']")
	private WebElement sixthCheckOut;
	
//	info
	
	@FindBy(xpath = "//input[@id='TextField1']")
	private WebElement sixthEmail;
	
	@FindBy(xpath = "//input[@id='TextField2']")
	private WebElement sixthFirstName;
	
	@FindBy(xpath = "//input[@id='TextField3']")
	private WebElement sixthLastName;
	
	@FindBy(xpath = "//input[@id='TextField4']")
	private WebElement sixthAddress1;
	
	@FindBy(xpath = "//input[@id='TextField5']")
	private WebElement sixthScrollAddress2;
	
	@FindBy(xpath = "//input[@id='TextField5']")
	private WebElement sixthAddress2;
	
	@FindBy(xpath = "//input[@id='TextField6']")
	private WebElement sixthCity;
	
	@FindBy(xpath = "//input[@id='TextField7']")
	private WebElement sixthZipcode;
	
	@FindBy(xpath = "//button[@class='_2pOWh uWTUp _1Kqoj _2tVwl _3MrgP _10zXD sd4hU']")
	private WebElement sixthContinue;
	
	
//	constructor
	public CollectionPage(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver,this);  // D
	}
	
	
												//	Methods for First_Product
	
	public boolean clickFirstProduct() 
	{
		boolean result = false;
		try {
//			Base_test.waitExplicitMethod(driver, firstProduct);
			Base_test.isElementVisible(driver, firstProduct, "firstProduct is visible");
			firstProduct.click();
			TestUtil.log().info("firstProduct is clicked");
			result = true;
			ExtentReport.test.log(Status.PASS," Click first Product");
		}
		catch(Exception e) {
			ExtentReport.test.log(Status.FAIL,"Failed to click on first Product");
//			System.out.println(e);
			TestUtil.log().error(e);
		}
		return result;
	}
	
	
//	public void scrollAddtoCart() throws InterruptedException
//	{
////		boolean result = false;
//		try {
//			js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].scrollIntoView(true);", scrolToCart);
//			System.out.println("before");
//			Thread.sleep(2000);
////			result = true;
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
////		return result;
//	} 
	
	
	                                      
	public boolean xlargeSizeProduct() 
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, xlargeSize);
//			js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", xlargeSize);
			xlargeSize.click();
			result = true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
//		xlargeSize.click();
	}
	
//	public void scrollAddtoCart1() throws InterruptedException {
//		js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", scrolToCart);
//		Base_test.isElementVisible(driver, scrolToCart, "Successfully scroll");
////		Base_test.waitExplicitMethod(driver, scrolToCart);
//	}
	
	
	
	public boolean addtoCart() throws InterruptedException
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, addtoCart);
//			System.out.println("Hi");
			addtoCart.click();
//			System.out.println("Method Called");
			Base_test.waitExplicitMethod(driver, addtoCart);
			result = true;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return result;
	}
	
	
	public boolean clickview_myCart()
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, view_myCart);
			view_myCart.click();
			result = true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	
	public void scrollCheckOut() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollToCheckOut);
		System.out.println("before");
		Base_test.waitExplicitMethod(driver, scrollToCheckOut);
		}
	
	
	
	public boolean checkOut() throws InterruptedException
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, checkOut);
			checkOut.click();
			System.out.println("checkout Clicked");
			result = true;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return result;
	}
	
	
												//	Methods for Sixth_Product
	
//	public void scrollSixthProduct() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", sixthProduct);
//	}
//	
//	public void clickSixthProduct() {
//		sixthProduct.click();
//	}
//	
//	public void clickSixthLargeSize() {
//		sixthLargeSize.click();
//	}
//
//	public void clickSixthAddtoCart() {
//		sixthAddtoCart.click();
//	}
//
//	public void clickSixthViewMyCart() {
//		sixthViewMyCart.click();
//	}
//
//	public void scrolltoCheckOut() throws InterruptedException {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].scrollIntoView(true);", sixthCheckOut);
//		Thread.sleep(4000);
//	}

//	public void clickSixthCheckOut() {
//		sixthCheckOut.click();
//	}
	    											
	
												// Info
	
//	public void enterSixthEmail() {	
//		sixthEmail.click();
//		sixthEmail.sendKeys("test@test.com");	
//	}
//	
//	public void enteSixthfirstName() {	
//		sixthFirstName.click();
//		sixthFirstName.sendKeys("Monisur");
//	}
//	
//	public void enterSixthlastName() {
//		sixthLastName.click();
//		sixthLastName.sendKeys("Rahman");
//	}
//	
//	
//	public void enterSixthAddress() {
//		sixthAddress1.click();
//		sixthAddress1.sendKeys("kamptee");
//	}	
//	
//	public void scrollAddress2() throws InterruptedException {
//	JavascriptExecutor js = (JavascriptExecutor) driver;
//	js.executeScript("arguments[0].scrollIntoView(true);", sixthScrollAddress2);
//	Thread.sleep(4000);
//	}
//	
//	public void enterSixthApartment() {
//		sixthAddress2.click();
//		sixthAddress2.sendKeys("Utkarsh");
//	}
	
//	public void enterSixthCity() {
//		sixthCity.click();
//		sixthCity.sendKeys("Anchorage");
//	}
//	
//	public void enterSixthZipcodet() throws InterruptedException {
//		sixthZipcode.click();
//		sixthZipcode.sendKeys("99501");
//		Thread.sleep(5000);
//	}
//	
//	public void cilckSixthContinue() throws InterruptedException {
//		System.out.println("Pre-Clicked");
//		sixthContinue.click();
//		System.out.println("Clicked");
//		Thread.sleep(10000);
//		
//	}
//	
//	public void clickSurlelacAgain() throws InterruptedException {	
//		surlelac.click();
//		Thread.sleep(10000);
//	}	
	
	
	
	
	
}



