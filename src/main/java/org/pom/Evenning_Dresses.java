package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Evenning_Dresses {
	
	public WebDriver driver;

	@FindBy(xpath = "//img[@title='Printed Dress']")
	private WebElement img_printDresses;

	@FindBy(xpath = "//a[@class='quick-view']")
	private WebElement quick_View;
	
	@FindBy(xpath = "//iframe[@class='fancybox-iframe']")
	private WebElement frame;
	
	@FindBy(xpath = "//a[@class='btn btn-default button-plus product_quantity_up']")
	private WebElement incre_Btn;
	
	@FindBy(xpath = "//select[@id='group_1']")
	private WebElement size_DD;
	
	@FindBy(xpath = "//a[@id='color_24']")
	private WebElement colorPink_Btn;
	
	@FindBy(xpath = "//button[@class='exclusive']")
	private WebElement addtocart_Btn;
	
	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement checkout_Btn;
	
	public Evenning_Dresses(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getImg_printDresses() {
		return img_printDresses;
	}

	public WebElement getQuick_View() {
		return quick_View;
	}

	public WebElement getFrame() {
		return frame;
	}

	public WebElement getIncre_Btn() {
		return incre_Btn;
	}

	public WebElement getSize_DD() {
		return size_DD;
	}

	public WebElement getColorPink_Btn() {
		return colorPink_Btn;
	}

	public WebElement getAddtocart_Btn() {
		return addtocart_Btn;
	}

	public WebElement getCheckout_Btn() {
		return checkout_Btn;
	}
	
}
