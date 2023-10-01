package com.opencart.pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homepage {
	
	private WebDriver driver;
	public Homepage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	//----------- Obj repo --------------------
	private By my_account_link = By.xpath("//span[contains(text(),'My Account')]");
	private By register_link = By.xpath("//a[contains(text(),'Register')]");
	private By login_link = By.xpath("//a[contains(text(),'Login')]");
	
	//--------- Action methods ----------------

	public void clickOnMyAccountLink()
	{
		driver.findElement(my_account_link).click();
	}
	
	public void clickOnRegisterLink()
	{
		driver.findElement(register_link).click();
	}
	
	public void clickOnLoginLink()
	{
		driver.findElement(login_link).click();
	}
}
