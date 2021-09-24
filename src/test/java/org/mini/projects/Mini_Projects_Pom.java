package org.mini.projects;

import java.util.ArrayList;
import java.util.List;
import org.base.Base;
import org.openqa.selenium.WebElement;
import org.pom.Address_Page;
import org.pom.Bank_Wire_Page;
import org.pom.Evenning_Dresses;
import org.pom.Home_Page;
import org.pom.Order_SignIn_Page;
import org.pom.Payment_page;
import org.pom.Register_Page;
import org.pom.Shipping_Page;
import org.pom.SignIn_Page;
import org.pom.Summary_Page;

public class Mini_Projects_Pom extends Base {

	public static String screenDesti = "C:\\Users\\sarat\\eclipse-workspace\\Maven_Projects\\screenshots";

	public static void main(String[] args) throws Throwable {

		setBrowser("chrome", "http://automationpractice.com/index.php");
		
		implicitlyWait(5);
		
		getCurrentUrl();
		
		getTitle();
		
		Home_Page hp = new Home_Page(driver);
		
		clickOnElement(hp.getSignin_Btn());
		
		SignIn_Page sp = new SignIn_Page(driver);
		
		isDisplayed(sp.getCreate_Email());
		
		isEnabled(sp.getCreate_Email());
		
		sendInputElement(sp.getCreate_Email(), "testrocker121212@gmail.com");
		
		clickOnElement(sp.getCreate_Btn());
		
		Register_Page rp = new Register_Page(driver);
		
		isSelected(rp.getMr_RadioBtn());
		
		moveToElement(rp.getMr_RadioBtn());
		
		mouseClick();

		
		sendInputElement(rp.getFristadd_TV(), "Test");

		sendInputElement(rp.getLastadd_TV(), "Maven");
		
		
		isEnabled(rp.getEmail_TV());
		
		getAttributes(rp.getEmail_TV(), "value");
		
		sendInputElement(rp.getPasswd_TV(), "Test$12");
		
		selectByValue(rp.getDays_DD(), "12");
		
		selectByValue(rp.getMonths_DD(), "4");
		
		selectByValue(rp.getYears_DD(), "2000");
		
		isSelected(rp.getReceive_CheckBox());
		
		moveToElement(rp.getReceive_CheckBox());
		
		mouseClick();
		
		moveToElement(rp.getSignin_CheckBox());
		
		mouseClick();
		
		List<WebElement> elements = new ArrayList<WebElement>();
		elements.add(rp.getFirst_TV());
		elements.add(rp.getLast_TV());
		elements.add(rp.getCompany_TV());
		elements.add(rp.getAddress1_TV());
		elements.add(rp.getAddress2_TV());
		elements.add(rp.getCity_TV());
		elements.add(rp.getOther_TV());
		elements.add(rp.getPhone_TV());
		elements.add(rp.getMobile_TV());
		
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
		
		selectByValue(rp.getState_DD(), "32");

		sendInputElement(rp.getPostcode_TV(), "12345");
		
		isEnabled(rp.getCountry_DD());
		getAttributes(rp.getCountry_DD(), "value");
		
		isEnabled(rp.getAlias_TV());
		getAttributes(rp.getAlias_TV(), "value");
		
		clickOnElement(rp.getRegister_Btn());
		
		getScreenShot(screenDesti + "\\Register.png");
		
		close();
		
		quit();
		
		sleep(2);
		
		setBrowser("chrome", "http://automationpractice.com/index.php");
		
		implicitlyWait(5);
				
		Home_Page hp2 = new Home_Page(driver);
		
		moveToElement(hp2.getWomen_Link());
		
		moveToElement(hp2.getWom_eve_Link());
		mouseClick();
				
		Evenning_Dresses ep = new Evenning_Dresses(driver);
		
		moveToElement(ep.getImg_printDresses());
		
		moveToElement(ep.getQuick_View());
		
		mouseClick();
				
		switchFrame(ep.getFrame());
		
		moveToElement(ep.getIncre_Btn());
		
		mouseClickIteration(ep.getIncre_Btn(), 4);
		
		selectByValue(ep.getSize_DD(), "2");

		clickOnElement(ep.getColorPink_Btn());
		
		clickOnElement(ep.getAddtocart_Btn());
		
		getScreenShot(screenDesti + "\\QuickView.png");
		
		switchDefault();

		getScreenShot(screenDesti + "\\Proced.png");
				
		clickOnElement(ep.getCheckout_Btn());
		
		getScreenShot(screenDesti + "\\CheckOut.png");
		
		Summary_Page sup = new Summary_Page(driver);
		
		getScreenShot(screenDesti + "//Summary.png");
		
		clickOnElement(sup.getChekout_Btn());
		
		Order_SignIn_Page osp = new Order_SignIn_Page(driver);
		
		sendInputElement(osp.getEmail_TV(), "testrocker121212@gmail.com");
		
		sendInputElement(osp.getPasswd_TV(), "Test$12");
		
		clickOnElement(osp.getSignin_Btn());
		
		Address_Page ap = new Address_Page(driver);
		
		sendInputElement(ap.getMessg_TV(), "Hii, This Is Automation Testing.");
		
		getScreenShot(screenDesti + "\\Delivery.png");
		
		clickOnElement(ap.getCheckout_Btn());
		
		Shipping_Page shp =  new Shipping_Page(driver);
		
		moveToElement(shp.getTerms_CheckBox());
		
		mouseClick();
		
		getScreenShot(screenDesti + "\\DeliveryTo.png");
		
		clickOnElement(shp.getCheckout_Btn());
		
		Payment_page pp = new Payment_page(driver);
		
		getScreenShot(screenDesti + "\\Payment.png");
		
		moveToElement(pp.getPay_wire_Btn());
		
		mouseClick();
		
		Bank_Wire_Page bp = new Bank_Wire_Page(driver);
		
		getScreenShot(screenDesti + "\\ConfirmOrder.png");
		
		clickOnElement(bp.getConfirm_Btn());
		
		getScreenShot(screenDesti + "Final.png");
		
		sleep(2);
		
		close();
		
		quit();
		
	}
}
