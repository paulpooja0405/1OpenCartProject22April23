package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.Homepage;
import com.opencart.pageLayer.Registerpage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class RegisterAccountTest extends TestBase {
	
	@Test
	public void validateRegisterAccountbyprovidingonlyMandatoryFields() throws InterruptedException
	{
		String expected_result ="Your Account Has Been Created!";
		Homepage homepage_obj = new Homepage(driver);
		Registerpage registerpage_obj = new Registerpage(driver);
		UtilClass util_obj = new UtilClass(driver);
		homepage_obj.clickOnMyAccountLink();
		Thread.sleep(2000);
		homepage_obj.clickOnRegisterLink();
		Thread.sleep(2000);
		
		registerpage_obj.enterFirstName("David");
		registerpage_obj.enterLastName("Miller3");
		registerpage_obj.enterEmail("davidmiller3@gmail.com");
		registerpage_obj.entertelephone("1234567890");
		registerpage_obj.enterPassword("Test@1234");
		registerpage_obj.enterConfirmPassword("Test@1234");
		registerpage_obj.clickOnPrivacyPolicyCheckbox();
		registerpage_obj.clickOnContinueButton();
		
		Assert.assertEquals(util_obj.getTitleOfPage(), expected_result);	
	}
}
