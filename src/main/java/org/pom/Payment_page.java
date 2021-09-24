package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payment_page {
	
	public WebDriver driver;

	@FindBy(xpath = "//a[@title='Pay by bank wire']")
	private WebElement pay_wire_Btn;

	public Payment_page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getPay_wire_Btn() {
		return pay_wire_Btn;
	}
	
	
}
