package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	
	public WebDriver driver;

	@FindBy(xpath = "(//a[@title='Proceed to checkout'])[2]")
	private WebElement chekout_Btn;

	public Summary_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getChekout_Btn() {
		return chekout_Btn;
	}
	
}
