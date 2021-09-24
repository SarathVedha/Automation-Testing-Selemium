package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Address_Page {

	public WebDriver driver;
	
	@FindBy(name = "message")
	private WebElement messg_TV;
	
	@FindBy(name = "processAddress")
	private WebElement checkout_Btn;

	public Address_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getMessg_TV() {
		return messg_TV;
	}

	public WebElement getCheckout_Btn() {
		return checkout_Btn;
	}
}
