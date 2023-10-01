package com.opencart.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.opencart.pageLayer.AddressBookpage;
import com.opencart.pageLayer.Homepage;
import com.opencart.pageLayer.Loginpage;
import com.opencart.pageLayer.MyAccountpage;
import com.opencart.testBase.TestBase;
import com.opencart.utilities.UtilClass;

public class AddressTest extends TestBase {
	
	@Test
	public void validateAddingNewAddressbyProvidingOnlyMandatoryfields() throws InterruptedException
	{
		
		String expected_output = "Your address has been successfully added";
		Homepage homepage_obj = new Homepage(driver);
		Loginpage login_obj = new Loginpage(driver);
		MyAccountpage myaccount_obj = new MyAccountpage(driver);
		AddressBookpage address_obj = new AddressBookpage(driver);
		UtilClass util_obj = new UtilClass(driver);
		
		homepage_obj.clickOnMyAccountLink();
		homepage_obj.clickOnLoginLink();
		
		Thread.sleep(2000);
		login_obj.enterEmail("davidmiller1@gmail.com");
		login_obj.enterPassword("Test@1234");
		login_obj.clickOnLoginButton();
		
		//----------------------------------------
		myaccount_obj.clickOnAddressBookLink();
		address_obj.clickOnNewAddressButton();
//		address_obj.enterFirstName("david");
//		address_obj.enterLastname("Miller");
//		address_obj.enterCompany("Wipro");
//		address_obj.enterAddress1("Aakurdi");
//		address_obj.enterAddress2("PC");
//		address_obj.enterCity("Pune");
//		address_obj.enterPostcode("413521");
		
		address_obj.enterAllDetailsInAddressForm("david", "miller", "Infosys", "Pimpri", "PC", "Pune", "413521");
		address_obj.selectOptionFromCountryDropdown("India");
		address_obj.selectOptionFromRegionDropdown("Maharashtra");
		
		Thread.sleep(2000);
		address_obj.clickOnContinueButton();
		
		Assert.assertEquals(address_obj.getStatusMessage(), expected_output);	
	}
}
