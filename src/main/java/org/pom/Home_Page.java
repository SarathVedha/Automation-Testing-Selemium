package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;

	public Home_Page(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}
	
	public WebElement getWomen_Link() {
		return women_Link;
	}

	public WebElement getDresses_Link() {
		return dresses_Link;
	}

	public WebElement getTshirts_Link() {
		return tshirts_Link;
	}

	public WebElement getWom_tshirts_Link() {
		return wom_tshirts_Link;
	}

	public WebElement getWom_blouses_Link() {
		return wom_blouses_Link;
	}

	public WebElement getWom_casual_Link() {
		return wom_casual_Link;
	}

	public WebElement getWom_eve_Link() {
		return wom_eve_Link;
	}

	public WebElement getWom_sum_Link() {
		return wom_sum_Link;
	}

	public WebElement getDre_casual_Link() {
		return dre_casual_Link;
	}

	public WebElement getDre_eve_Link() {
		return dre_eve_Link;
	}

	public WebElement getDre_sum_Link() {
		return dre_sum_Link;
	}
	
	@FindBy(xpath = "//a[@class='login']")
	private WebElement signin_Btn;
	
	@FindBy(xpath = "//a[.='Women']")
	private WebElement women_Link;
	
	@FindBy(xpath = "(//a[@title='Dresses'])[2]")
	private WebElement dresses_Link;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[2]")
	private WebElement tshirts_Link;
	
	@FindBy(xpath = "(//a[@title='T-shirts'])[1]")
	private WebElement wom_tshirts_Link;
	
	@FindBy(xpath = "//a[@title='Blouses']")
	private WebElement wom_blouses_Link;
	
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[1]")
	private WebElement wom_casual_Link;

	@FindBy(xpath = "//a[.='Evening Dresses']")
	private WebElement wom_eve_Link;
	
	@FindBy(xpath = "(//a[@title='Summer Dresses'])[1]")
	private WebElement wom_sum_Link;
	
	@FindBy(xpath = "(//a[@title='Casual Dresses'])[2]")
	private WebElement dre_casual_Link;
	
	@FindBy(xpath = "(//a[@title='Evening Dresses'])[2]")
	private WebElement dre_eve_Link;
	
	@FindBy(xpath = "(//a[@title='Summer Dresses'])[2]")
	private WebElement dre_sum_Link;
	
}
