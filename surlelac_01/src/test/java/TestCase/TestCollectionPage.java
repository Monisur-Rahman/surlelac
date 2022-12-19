package TestCase;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import Utilities.Base_test;
import Utilities.ExtentReport;
import pages.CollectionPage;
import pages.Form_Data;

public class TestCollectionPage extends Base_test 
{
	
	@Test(description="Test_Collection") 
	public void abc() throws Exception
	{
		
		CollectionPage cp = new CollectionPage(driver);
		Form_Data fd = new Form_Data(driver);
		
		 boolean checkClickFirstProduct = cp.clickFirstProduct();
		 Assert.assertEquals(checkClickFirstProduct, true,"failed  to click on firstProduct");
//		 ExtentReport.test.log(Status.PASS," Click first Product");
//		 Base_test.takeSnapShot(driver);
//		cp.mediumSizeProduct();
//		cp.largeSizeProduct();
//		cp.scrollAddtoCart();
		boolean selectXlSize = cp.xlargeSizeProduct();
		Assert.assertEquals(selectXlSize, true, "failed to click on XL size");
//		cp.scrollAddtoCart1();
		boolean checkAddToCart = cp.addtoCart();
//		Base_test.takeSnapShot(driver);
		Assert.assertEquals(checkAddToCart, true,"failed to click on AddToCart");
//		ExtentReport.test.log(Status.PASS," Click first Product");
		
		boolean checkClickViewMyCart = cp.clickview_myCart();
		Assert.assertEquals(checkClickViewMyCart, true,"failed to click on View My Cart");
		cp.scrollCheckOut();
		boolean checkClickCheckOut = cp.checkOut();
		Assert.assertEquals(checkClickCheckOut, true,"failed to click on Check Out");
//		Base_test.screenShot();
//		Base_test.takeSnapShot(driver);
		 
//	info
				fd.closePopUp();
				boolean clickEmail = fd.enterEmail();
				Assert.assertEquals(clickEmail, true,"failed to click on email");
				
				fd.closePopUp();
				boolean clickCheck = fd.clickCheckBox();
				Assert.assertEquals(clickCheck, true,"failed to click on checkBox");
				
				fd.closePopUp();
				boolean clickFirstName = fd.entefirstName();
				Assert.assertEquals(clickFirstName, true,"failed to click on firstName ");
				
				fd.closePopUp();
				boolean clickLastName = fd.enterlastName();
				Assert.assertEquals(clickLastName, true,"failed to click on lastName");
//				fd.closePopUp();
				
				fd.closePopUp();
				boolean checkScrollAddress = fd.scrollAddress();
				Assert.assertEquals(checkScrollAddress, true,"failed to click on scrollAddress");
				
				fd.closePopUp();
				boolean clickAddress = fd.enterAddress();
				Assert.assertEquals(clickAddress, true,"failed to click on Address");
				
				fd.closePopUp();
				boolean clickApartment = fd.enterApartment();
				Assert.assertEquals(clickApartment, true,"failed to click on Apartment");
				
				fd.closePopUp();
				boolean clickEntry = fd.enterCity();
				Assert.assertEquals(clickEntry, true,"failed to click on city");
				
//				fd.closePopUp();
//				boolean selectState = fd.selectState();
//				Assert.assertEquals(selectState, true,"failed to click on state");
				
				fd.closePopUp();
				boolean clickZipcode = fd.enterZipcodet();
				Assert.assertEquals(clickZipcode, true,"failed to click on zipCode");
				
				fd.closePopUp();
				boolean checkClickContinue = fd.cilckContinue();
				Assert.assertEquals(checkClickContinue, true,"failed to click on continueShipping");
				
				fd.closePopUp();
				boolean clickLogo = fd.clickSurlelac();
				Assert.assertEquals(clickLogo, true,"failed to click on logo");
		
		                                       
		
		
		
												//		For 6th Product
//		cp.scrollSixthProduct();
//		cp.clickSixthProduct();
//		cp.clickSixthLargeSize();
//		cp.clickSixthAddtoCart();
//		cp.clickview_myCart();
//		cp.scrolltoCheckOut();
//		cp.clickSixthCheckOut();
		
//		info
//		cp.enterSixthEmail();
//		cp.entefirstName();
//		cp.enterlastName();
//		cp.enterSixthAddress();
//		cp.enterSixthApartment();
//		cp.enterSixthCity();
//		cp.enterSixthZipcodet();
//		cp.cilckSixthContinue();
//		cp.clickSurlelacAgain();
		
		
	}
	

	
	
}
