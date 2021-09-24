package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_Page {

	public WebDriver driver;
	
	@FindBy(id = "cgv")
	private WebElement terms_CheckBox;
	
	@FindBy(name = "processCarrier")
	private WebElement checkout_Btn;

	public Shipping_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getTerms_CheckBox() {
		return terms_CheckBox;
	}

	public WebElement getCheckout_Btn() {
		return checkout_Btn;
	}
	
	
}
