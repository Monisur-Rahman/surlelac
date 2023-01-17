package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.Status;

import Utilities.Base_test;
import Utilities.ExtentReport;
import Utilities.TestUtil;

public class Form_Data {
	public WebDriver driver = null;
	
// info
	
	@FindBy(xpath = "//input[@name='email']")
	private WebElement mail1;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement mail2;
	
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox1;
	
	@FindBy(xpath = "//input[@type='checkbox']")
	private WebElement checkBox2;
	
	@FindBy(xpath = "//input[@placeholder='First name (optional)']")
	private WebElement firstName1;
	
	@FindBy(xpath = "//input[@id=\"TextField9\"]")
	private WebElement firstName2;
	
	@FindBy(xpath = "//input[@id='TextField2']")
	private WebElement lastName1;
	
	@FindBy(xpath = "//input[@id='TextField10']")
	private WebElement lastName2;
	
	@FindBy(xpath = "//input[@placeholder='Address']")
	private WebElement scroll_address1;
	
	@FindBy(xpath = "//h2[text()='Shipping address']")
	private WebElement scroll_address2;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement enter_Address1;
	
	@FindBy(xpath = "//input[@id='address1']")
	private WebElement enter_Address2;
	
	@FindBy(xpath = "//input[@id='TextField4']")
	private WebElement apartment1;
	
//	@FindBy(xpath = "//input[@id='TextField11']")
//	private WebElement apartment2;
	
	@FindBy(xpath = "//div//input[@name='city']")
	private WebElement city1;
	
	@FindBy(xpath = "//div//input[@placeholder='City']")
	private WebElement city2;
	
	@FindBy(xpath ="//select[@id='Select1']")
	private WebElement state1;
	
//	@FindBy(xpath ="//select[@id='Select1']")
//	private WebElement state2;
	
	@FindBy(xpath = "//input[@id='TextField17']")
	private WebElement zipcode1;
	
	@FindBy(xpath = "//input[@name='postalCode']")
	private WebElement zipcode2;
	
	@FindBy(xpath = "//div[@class='_3oHx1 wJzc6']")
	//button[@aria-label='Close']
	private WebElement popUp;
	
	@FindBy(xpath = "//div//button[contains(@class,'_2pOWh uWTUp ')]")
	//div//span[text()='Continue to shipping']
	//div//span[text()='Continue to shipping']
	//button[@type='submit']//span[text()='Continue to shipping']
	private WebElement continuetoshipping;
	
	@FindBy(xpath = "//a[@href='https://surlelac.co/']")
	private WebElement surlelac;


                                                       // constructor
	
	public Form_Data(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	
//info                                         //Methods with try-catch


public boolean enterEmail()
{ 
	boolean result = false;
	try 
	{
		mail1.click();
	  	mail1.sendKeys(TestUtil.getPropertiesData("email"));
	  	TestUtil.log().info("click on mail");
		ExtentReport.test.log(Status.PASS," Click on mail");
	  	result = true;
	}
	catch(Exception e) 	
	{
		mail2.click();
	  	mail2.sendKeys(TestUtil.getPropertiesData("email"));
	  	TestUtil.log().info("click on mail");
		ExtentReport.test.log(Status.PASS," Click on mail");
	  	result = true;
	}
	
	return result;
		
}

public boolean clickCheckBox()
{	
	boolean result = false;
	try 
	{
		checkBox1.click();
		TestUtil.log().info("click on checkbox");
		ExtentReport.test.log(Status.PASS," Click on checkbox");
		result = true;
	}
	catch(Exception e) 	
	{
		checkBox2.click();
		TestUtil.log().info("click on checkbox");
		ExtentReport.test.log(Status.PASS," Click on checkbox");
		result = true;
	}
	
	return result;
}

public boolean entefirstName()
{	
	boolean result = false;
	try 
	{
		firstName1.click();
		firstName1.sendKeys(TestUtil.getPropertiesData("firstName"));
		TestUtil.log().info("click on firstName");
		ExtentReport.test.log(Status.PASS," Click on firstName");
		result = true;
	}
	catch(Exception e) 	
	{
		firstName2.click();
		firstName2.sendKeys(TestUtil.getPropertiesData("firstName"));
		TestUtil.log().info("click on firstName2");
		ExtentReport.test.log(Status.PASS," Click on firstName2");
		result = true;
	}
	
	return result;
}

public boolean enterlastName()
{
	boolean result = false;
	try 
	{
		lastName1.click();
		lastName1.sendKeys(TestUtil.getPropertiesData("lastName"));
		TestUtil.log().info("click on lastName");
		ExtentReport.test.log(Status.PASS," Click on lastName");
		result = true;
	}
	catch(Exception e) 	
	{
		lastName2.click();
		lastName2.sendKeys(TestUtil.getPropertiesData("lastName"));
		TestUtil.log().info("click on lastName2");
		ExtentReport.test.log(Status.PASS," Click on lastName2");
		result = true;
	}
	 return result;
}

public boolean scrollAddress() throws InterruptedException
{
	boolean result = false;
	try 
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll_address1);
		Thread.sleep(4000);
		TestUtil.log().info("scrollToAddress");
		ExtentReport.test.log(Status.PASS," scrollToAddress");
		result = true;
	}
	catch(Exception e) 	
	{
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll_address2);
		Thread.sleep(4000);
		TestUtil.log().info("scrollToAddress2");
		ExtentReport.test.log(Status.PASS," scrollToAddress2");
		result = true;
	}
	return result;
}

public boolean enterAddress() 
{
	boolean result = false;
	try 
	{
		enter_Address1.click();
		enter_Address1.sendKeys(TestUtil.getPropertiesData("address"));
		TestUtil.log().info("click on address");
		ExtentReport.test.log(Status.PASS," Click on address");
		result = true;
	}
	catch(Exception e) 	
	{
		enter_Address2.click();
		enter_Address2.sendKeys(TestUtil.getPropertiesData("address"));
		TestUtil.log().info("click on address");
		ExtentReport.test.log(Status.PASS," Click on address");
		result = true;
	}
	return result;
}	

public boolean enterApartment() 
{
	boolean result = false;
	try 
	{
		apartment1.click();
		apartment1.sendKeys(TestUtil.getPropertiesData("apartment"));
		TestUtil.log().info("click on apartment");
		ExtentReport.test.log(Status.PASS," Click on apartment");
		result = true;
		Base_test.waitExplicitMethod(driver, apartment1);
	}
	catch(Exception e) 	
	{
//		apartment2.click();
//		apartment2.sendKeys(TestUtil.getPropertiesData("apartment"));
//		result = true;
//		Base_test.waitExplicitMethod(driver, apartment2);
	}
	return result;
}

public boolean enterCity() 
{
	boolean result = false;
	try 
	{
		city1.click();
		city1.sendKeys(TestUtil.getPropertiesData("city"));
		TestUtil.log().info("click on city");
		ExtentReport.test.log(Status.PASS," Click on city");
		result = true;
	}
	catch(Exception e) 	
	{
		city2.click();
		city2.sendKeys(TestUtil.getPropertiesData("city"));
		TestUtil.log().info("click on city2");
		ExtentReport.test.log(Status.PASS," Click on city2");
		result = true;
	}
	return result;
}

public boolean selectState()
{
	boolean result = false;
	try 
	{
		state1.click();
		Select st = new Select(state1);
		st.selectByValue("AK");
		TestUtil.log().info("state selected");
		ExtentReport.test.log(Status.PASS," state selected");
		result = true;
	}
	catch(Exception e) 	
	{
		System.out.println(e);
	}
	return result;
	
}

public boolean enterZipcodet() throws InterruptedException
{
	boolean result = false;
	try 
	{
		zipcode1.click();
		zipcode1.sendKeys(TestUtil.getPropertiesData("Zip"));
		Base_test.waitExplicitMethod(driver, zipcode1);
		TestUtil.log().info("click on zip");
		ExtentReport.test.log(Status.PASS," Click on zip");
		result = true;
	}
	catch(Exception e) 	
	{
		zipcode2.click();
		zipcode2.sendKeys(TestUtil.getPropertiesData("Zip"));
		Base_test.waitExplicitMethod(driver, zipcode2);
		TestUtil.log().info("click on zip2");
		ExtentReport.test.log(Status.PASS," Click on zip2");
		result = true;
	}
	return result;
}

public void closePopUp() 
{
	
	try 
	{ 
		popUp.click();
		TestUtil.log().info("click on closePopUp");
		ExtentReport.test.log(Status.PASS," Click on closepopUp");
		
	}
	catch(Exception e) 	
	{
//		popUp.click();
//		System.out.println("PopUp not Display");
//		System.out.println(e);
		TestUtil.log().error(e);
		ExtentReport.test.log(Status.FAIL,"Failed to click on closepopUp");
	}
	
}

public boolean cilckContinue() throws InterruptedException
{
	boolean result = false;
	try 
	{
		continuetoshipping.click();
		TestUtil.log().info("click on continue");
		ExtentReport.test.log(Status.PASS," Click on continue");
		result = true;
		Base_test.waitExplicitMethod(driver, continuetoshipping);
	}
	catch(Exception e) 	
	{
//		System.out.println(e);
		TestUtil.log().error(e);
		ExtentReport.test.log(Status.FAIL,"Failed to click on continue to shopping");
	}
	return result;
	
}

public boolean clickSurlelac() throws InterruptedException
{	
	boolean result = false;
	try 
	{
		surlelac.click();
		TestUtil.log().info("click on surlelac");
		ExtentReport.test.log(Status.PASS," Click on surlelac");
		result = true;
		Thread.sleep(5000);
	}
	catch(Exception e) 	 
	{
//		System.out.println(e);
		TestUtil.log().error(e);
		ExtentReport.test.log(Status.FAIL,"Failed to click on surlelac");
	}
	return result;
}

}

