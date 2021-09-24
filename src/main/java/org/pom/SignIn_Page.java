package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignIn_Page {

	public WebDriver driver;
	
	public SignIn_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getCreate_Email() {
		return create_Email;
	}

	public WebElement getEmail_Address() {
		return email_Address;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getCreate_Btn() {
		return create_Btn;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

	@FindBy(id = "email_create")
	private WebElement create_Email;
	
	@FindBy(name = "email")
	private WebElement email_Address;
	
	@FindBy(xpath = "//input[@id='passwd']")
	private WebElement passwd;
	
	@FindBy(name = "SubmitCreate")
	private WebElement create_Btn;
	
	@FindBy(id = "SubmitLogin")
	private WebElement signin_Btn;
	
}
