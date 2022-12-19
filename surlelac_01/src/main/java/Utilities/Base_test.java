package Utilities;


import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_test {
	
	public static WebDriver driver = null;
	public static WebDriverWait wait;
	
	@BeforeClass
	public void display1() throws IOException
	{
		ExtentReport.setExtent();
	}
	
	@AfterClass
	public void display2()
	{
		ExtentReport.endReport();
	}
	
	@BeforeTest
	@Parameters("browserName")
	public void openBrowser(String browserName) throws InterruptedException {
		 if(browserName.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver = new ChromeDriver();
			 System.out.println("Testing on Chrome");
		 }
//		 else if (browserName.equals("MicrosoftEdge")) {
//			 WebDriverManager.edgedriver().setup();
//			 driver = new EdgeDriver();
//			 System.out.println("Testing on MicrosoftEdge");
//		 }
		 else {
			 System.out.println("No Browser Configured...");
		 }
//		 driver.get("https://surlelac.co/collections/all");
		 driver.get(TestUtil.getPropertiesData("url"));
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	}
		
	
	public static void waitExplicitMethod(WebDriver driver,WebElement element)
	{
		
		 wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		 wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	public static void isElementVisible(WebDriver driver,WebElement element,String msg)
	{
		
		Base_test.waitExplicitMethod(driver, element);
		element.isDisplayed();
		TestUtil.log().info(msg);
	}


	@AfterTest
	public void close() {
		driver.quit();
	}
	
}
