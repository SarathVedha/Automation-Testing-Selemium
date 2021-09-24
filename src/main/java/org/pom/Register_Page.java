package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register_Page {
	
	public WebDriver driver;
	
	public Register_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getMr_RadioBtn() {
		return mr_RadioBtn;
	}

	public WebElement getMrs_RadioBtn() {
		return mrs_RadioBtn;
	}

	public WebElement getFirst_TV() {
		return first_TV;
	}

	public WebElement getLast_TV() {
		return last_TV;
	}

	public WebElement getEmail_TV() {
		return email_TV;
	}

	public WebElement getPasswd_TV() {
		return passwd_TV;
	}

	public WebElement getDays_DD() {
		return days_DD;
	}

	public WebElement getMonths_DD() {
		return months_DD;
	}

	public WebElement getYears_DD() {
		return years_DD;
	}

	public WebElement getSignin_CheckBox() {
		return signin_CheckBox;
	}

	public WebElement getReceive_CheckBox() {
		return receive_CheckBox;
	}

	public WebElement getFristadd_TV() {
		return fristadd_TV;
	}

	public WebElement getLastadd_TV() {
		return lastadd_TV;
	}

	public WebElement getCompany_TV() {
		return company_TV;
	}

	public WebElement getAddress1_TV() {
		return address1_TV;
	}

	public WebElement getAddress2_TV() {
		return address2_TV;
	}

	public WebElement getCity_TV() {
		return city_TV;
	}

	public WebElement getState_DD() {
		return state_DD;
	}

	public WebElement getPostcode_TV() {
		return postcode_TV;
	}

	public WebElement getCountry_DD() {
		return country_DD;
	}

	public WebElement getOther_TV() {
		return other_TV;
	}

	public WebElement getPhone_TV() {
		return phone_TV;
	}

	public WebElement getMobile_TV() {
		return mobile_TV;
	}

	public WebElement getAlias_TV() {
		return alias_TV;
	}

	public WebElement getRegister_Btn() {
		return register_Btn;
	}
	
	@FindBy(id = "id_gender1")
	private WebElement mr_RadioBtn;

	@FindBy(id = "id_gender2")
	private WebElement mrs_RadioBtn;
	
	@FindBy(id = "customer_firstname")
	private WebElement first_TV;
	
	@FindBy(id = "customer_lastname")
	private WebElement last_TV;
	
	@FindBy(id = "email")
	private WebElement email_TV;
	
	@FindBy(id = "passwd")
	private WebElement passwd_TV;
	
	@FindBy(id = "days")
	private WebElement days_DD;
	
	@FindBy(id = "months")
	private WebElement months_DD;
	
	@FindBy(id = "years")
	private WebElement years_DD;
	
	@FindBy(id = "newsletter")
	private WebElement signin_CheckBox;
	
	@FindBy(id = "optin")
	private WebElement receive_CheckBox;
	
	@FindBy(id = "firstname")
	private WebElement fristadd_TV;
	
	@FindBy(id = "lastname")
	private WebElement lastadd_TV;
	
	@FindBy(id = "company")
	private WebElement company_TV;
	
	@FindBy(id = "address1")
	private WebElement address1_TV;
	
	@FindBy(id = "address2")
	private WebElement address2_TV;
	
	@FindBy(id = "city")
	private WebElement city_TV;
	
	@FindBy(id = "id_state")
	private WebElement state_DD;
	
	@FindBy(id = "postcode")
	private WebElement postcode_TV;
	
	@FindBy(id = "id_country")
	private WebElement country_DD;
	
	@FindBy(id = "other")
	private WebElement other_TV;
	
	@FindBy(id = "phone")
	private WebElement phone_TV;
	
	@FindBy(id = "phone_mobile")
	private WebElement mobile_TV;
	
	@FindBy(id = "alias")
	private WebElement alias_TV;
	
	@FindBy(id = "submitAccount")
	private WebElement register_Btn;
	
	@FindBy(xpath = "//img[@alt='My Store']")
	private WebElement home_Img;

	public WebElement getHome_Img() {
		return home_Img;
	}
	
}
