package org.mini.projects;

import java.util.ArrayList;
import java.util.List;
import org.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Mini_Projects extends Base {
	
	public static String screenDesti = "C:\\Users\\sarat\\eclipse-workspace\\Maven_Projects\\screenshots";

	public static void main(String[] args) throws Throwable {

		setBrowser("chrome", "http://automationpractice.com/index.php");
		
		implicitlyWait(5);
		
		getCurrentUrl();
		
		getTitle();
		
		WebElement signin = driver.findElement(By.xpath("//a[@class='login']"));
		
		clickOnElement(signin);
		
		WebElement email = driver.findElement(By.id("email_create"));
		
		isDisplayed(driver.findElement(By.id("email")));
		
		isEnabled(driver.findElement(By.id("email")));
		
		sendInputElement(email, "testrockers124@gmail.com");
		
		clickOnElement(driver.findElement(By.id("SubmitCreate")));
		
		isSelected(driver.findElement(By.id("id_gender1")));

		clickOnElement(driver.findElement(By.xpath("//label[@for='id_gender1']")));
		
		sendInputElement(driver.findElement(By.id("customer_firstname")), "Test");

		sendInputElement(driver.findElement(By.id("customer_lastname")), "Maven");
		
		WebElement email_Reg = driver.findElement(By.id("email"));
		
		isEnabled(email_Reg);
		
		getAttributes(email_Reg, "value");
		
		sendInputElement(driver.findElement(By.id("passwd")), "Test$12");
		
		WebElement day = driver.findElement(By.id("days"));
		selectByValue(day, "12");
		
		WebElement months = driver.findElement(By.id("months"));
		selectByValue(months, "4");
		
		WebElement years = driver.findElement(By.id("years"));
		selectByValue(years, "2000");
		
		WebElement news = driver.findElement(By.id("newsletter"));
		isSelected(news);
		
		clickOnElement(driver.findElement(By.xpath("//label[@for='newsletter']")));
		
		WebElement firstName = driver.findElement(By.id("firstname"));
		
		WebElement lastName = driver.findElement(By.id("lastname"));
		
		WebElement companey = driver.findElement(By.id("company"));
		
		WebElement add1 = driver.findElement(By.id("address1"));
		
		WebElement add2 = driver.findElement(By.id("address2"));
		
		WebElement city = driver.findElement(By.id("city"));
		
		WebElement others = driver.findElement(By.id("other"));
		
		WebElement phone = driver.findElement(By.id("phone"));
		
		WebElement mobile = driver.findElement(By.id("phone_mobile"));
		
		List<WebElement> elements = new ArrayList<WebElement>();
		elements.add(firstName);
		elements.add(lastName);
		elements.add(companey);
		elements.add(add1);
		elements.add(add2);
		elements.add(city);
		elements.add(others);
		elements.add(phone);
		elements.add(mobile);
		
		System.out.println(elements);
		
		List<String> valStrings = new ArrayList<String>();
		valStrings.add("Test");
		valStrings.add("Testing");
		valStrings.add("Greens Tech");
		valStrings.add("Test");
		valStrings.add("Test2");
		valStrings.add("Test");
		valStrings.add("Testing");
		valStrings.add("1234567890");
		valStrings.add("1234567890");
		
		System.out.println(valStrings);
		
		iterationSend(elements, valStrings);
		
		WebElement state = driver.findElement(By.id("id_state"));
		selectByValue(state, "32");

		sendInputElement(driver.findElement(By.id("postcode")), "12345");
		
		WebElement country = driver.findElement(By.id("id_country"));
		isEnabled(country);
		getAttributes(country, "value");
		
		WebElement alais = driver.findElement(By.id("alias"));
		isEnabled(alais);
		getAttributes(alais, "value");
		
		clickOnElement(driver.findElement(By.id("submitAccount")));
		
		getScreenShot(screenDesti + "\\Register.png");
		
		close();
		
		quit();
		
		sleep(2);
		
		setBrowser("chrome", "http://automationpractice.com/index.php");
		
		implicitlyWait(5);
		
		WebElement women = driver.findElement(By.xpath("//a[.='Women']"));
		
		WebElement eveDress = driver.findElement(By.xpath("//a[.='Evening Dresses']"));
		
		moveToElement(women);
		
		moveToElement(eveDress);
		mouseClick();
		
		WebElement img = driver.findElement(By.xpath("//img[@title=\"Printed Dress\"]"));
		moveToElement(img);
		
		WebElement quickView = driver.findElement(By.xpath("//span[.=\"Quick view\"]"));
		moveToElement(quickView);
		mouseClick();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='fancybox-iframe']"));
		
		switchFrame(frame);
		
		WebElement qty_Plus = driver.findElement(By.xpath("//a[@class=\"btn btn-default button-plus product_quantity_up\"]"));
		moveToElement(qty_Plus);
		mouseClickIteration(qty_Plus, 4);
		
		WebElement select = driver.findElement(By.id("group_1"));
		selectByValue(select, "2");

		WebElement color = driver.findElement(By.id("color_24"));
		clickOnElement(color);
		
		clickOnElement(driver.findElement(By.xpath("//button[@class='exclusive']")));
		
		getScreenShot(screenDesti + "\\QuickView.png");
		
		switchDefault();

		getScreenShot(screenDesti + "\\Proced.png");
		
		WebElement checkOut = driver.findElement(By.xpath("//a[@title='Proceed to checkout']"));
		clickOnElement(checkOut);
		
		getScreenShot(screenDesti + "\\CheckOut.png");
		
		WebElement checkout = driver.findElement(By.xpath("//a[@class='button btn btn-default standard-checkout button-medium']"));
		
		getScreenShot(screenDesti + "//Summary.png");
		
		clickOnElement(checkout);
		
		WebElement emailid = driver.findElement(By.id("email"));
		sendInputElement(emailid, "testrockers124@gmail.com");
		sendInputElement(driver.findElement(By.id("passwd")), "Test$12");
		
		clickOnElement(driver.findElement(By.id("SubmitLogin")));
		
		sendInputElement(driver.findElement(By.xpath("//textarea[@name='message']")), "Hii, This Is Automation Testing.");
		
		getScreenShot(screenDesti + "\\Delivery.png");
		
		clickOnElement(driver.findElement(By.xpath("//button[@name='processAddress']")));
		
		WebElement checkTerms = driver.findElement(By.xpath("//input[@type='checkbox']"));
		moveToElement(checkTerms);
		mouseClick();
		
		getScreenShot(screenDesti + "\\DeliveryTo.png");
		
		clickOnElement(driver.findElement(By.xpath("//button[@name='processCarrier']")));
		
		WebElement payment = driver.findElement(By.xpath("//a[@title='Pay by bank wire']"));
		
		getScreenShot(screenDesti + "\\Payment.png");
		
		moveToElement(payment);
		mouseClick();
		
		WebElement confirmOrder = driver.findElement(By.xpath("//button[@class='button btn btn-default button-medium']"));
		
		getScreenShot(screenDesti + "\\ConfirmOrder.png");
		
		clickOnElement(confirmOrder);
		
		getScreenShot(screenDesti + "Final.png");
		
		sleep(2);
		
		close();
		
		quit();
		
	}

}