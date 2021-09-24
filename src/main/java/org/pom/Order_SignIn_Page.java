package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order_SignIn_Page {

	public WebDriver driver;
	
	@FindBy(xpath = "//input[@id='email']")
	private WebElement email_TV;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement passwd_TV;
	
	@FindBy(xpath = "//button[@id='SubmitLogin']")
	private WebElement signin_Btn;

	public Order_SignIn_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getEmail_TV() {
		return email_TV;
	}

	public WebElement getPasswd_TV() {
		return passwd_TV;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
	
	
}
