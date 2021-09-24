package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bank_Wire_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement confirm_Btn;

	public Bank_Wire_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getConfirm_Btn() {
		return confirm_Btn;
	}
}
