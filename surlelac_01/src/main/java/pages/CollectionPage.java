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
	
	@FindBy(xpath="//button[contains(@class,'needsclick kla')]")
	private WebElement popup;

//	To find WebElement for first_Product
	
	@FindBy(xpath = "//a[@href='/products/101-t-shirt']")
	private WebElement firstProduct;
	
	//XL
	@FindBy(xpath = "//label[@title='XL']")
	private WebElement xlargeSize;
	
	@FindBy(xpath = "//li//label[@title='XXL']")
	private WebElement scrolToCart;
	
	@FindBy(xpath = "//button[contains(@class,'product-form__')]")
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
		PageFactory.initElements(this.driver,this);  
	}
	
	
												//	Methods for First_Product
	public void closePop() {
		popup.click();
	}
	
	public boolean clickFirstProduct() 
	{
		boolean result = false;
		try {
//			Base_test.waitExplicitMethod(driver, firstProduct);
			Base_test.isElementVisible(driver, firstProduct, "firstProduct is visible");
			firstProduct.click();
			TestUtil.log().info("click on firstproduct");
			ExtentReport.test.log(Status.PASS," Click first Product");
			result = true;
		}
		catch(Exception e) {
			ExtentReport.test.log(Status.FAIL,"Failed to click on first Product");
//			System.out.println(e);
			TestUtil.log().error(e);
		}
		return result;
	}
	
	
 
	
	
	                                      
	public boolean xlargeSizeProduct() 
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, xlargeSize);
//			js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", xlargeSize);
			xlargeSize.click();
			TestUtil.log().info("click on XL size");
			ExtentReport.test.log(Status.PASS," Click on XL Size");
			result = true;
		}
		catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().error(e);
			ExtentReport.test.log(Status.FAIL,"Failed to click on XL Size");
		}
		return result;
//		xlargeSize.click();
	}
	
	public void scrollAddtoCart1() throws InterruptedException {
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrolToCart);
		Base_test.isElementVisible(driver, scrolToCart, "Successfully scroll");
//		Base_test.waitExplicitMethod(driver, scrolToCart);
		TestUtil.log().info("click on scrollAddToCart");
		ExtentReport.test.log(Status.PASS," scroll to AddtoCart1");
	}
	
	
	
	public boolean addtoCart() throws InterruptedException
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, addtoCart);
//			System.out.println("Hi");
			addtoCart.click();
			TestUtil.log().info("click on addToCart");
			Base_test.waitExplicitMethod(driver, addtoCart);
			ExtentReport.test.log(Status.PASS," Click on addtoCart");
			result = true;
		}
		catch(Exception e) {
//			System.out.println(e);
			TestUtil.log().error(e);
			ExtentReport.test.log(Status.FAIL,"Failed to click on addtoCart");
		}
		return result;
	}
	
	
	public boolean clickview_myCart()
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, view_myCart);
			view_myCart.click();
			TestUtil.log().info("click on viewCart");
			ExtentReport.test.log(Status.PASS," Click on view myCart");
			result = true;
		}
		catch(Exception e)
		{
//			System.out.println(e);
			TestUtil.log().error(e);
			ExtentReport.test.log(Status.FAIL,"Failed to click on view myCart");
		}
		return result;
	}
	
	public void scrollCheckOut() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scrollToCheckOut);
		System.out.println("before");
		Base_test.waitExplicitMethod(driver, scrollToCheckOut);
		TestUtil.log().info("scroll to checkout");

		}
	
	
	
	public boolean checkOut() throws InterruptedException
	{
		boolean result = false;
		try {
			Base_test.waitExplicitMethod(driver, checkOut);
			checkOut.click();
//			System.out.println("checkout Clicked");
			TestUtil.log().info("click on checkout");
			ExtentReport.test.log(Status.PASS," Click on checkout");
			result = true;
		}
		catch(Exception e)
		{
//			System.out.println(e);
			TestUtil.log().error(e);
			ExtentReport.test.log(Status.FAIL,"Failed to click on checkout");
		}
		return result;
	}
	
	
													
	
}



