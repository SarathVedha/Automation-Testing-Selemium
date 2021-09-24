package org.mini.projects;

import java.util.ArrayList;
import java.util.List;
import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sdp.Page_Object_Manager;

public class Mini_Projects_Sdp extends Base {
	
	public static String screenDesti = "C:\\Users\\sarat\\eclipse-workspace\\Maven_Projects\\screenshots";
	
	public static WebDriver driver = setBrowser("chrome", "http://automationpractice.com/index.php");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);

	public static void main(String[] args) throws Throwable {
		
		implicitlyWait(5);
		
		getCurrentUrl();
		
		getTitle();
		
		clickOnElement(pom.getHp().getSignin_Btn());
		
		isDisplayed(pom.getSp().getCreate_Email());
		
		isEnabled(pom.getSp().getCreate_Email());
		
		sendInputElement(pom.getSp().getCreate_Email(), "testsrockers12042000@gmail.com");
		
		clickOnElement(pom.getSp().getCreate_Btn());
		
		isSelected(pom.getRp().getMr_RadioBtn());
		
		moveToElement(pom.getRp().getMr_RadioBtn());
		
		mouseClick();
		
		sendInputElement(pom.getRp().getFristadd_TV(), "Test");
		
		sendInputElement(pom.getRp().getLastadd_TV(), "Maven");
		
		isEnabled(pom.getRp().getEmail_TV());
		
		getAttributes(pom.getRp().getEmail_TV(), "value");
		
		sendInputElement(pom.getRp().getPasswd_TV(), "Test$12");
		
		selectByValue(pom.getRp().getDays_DD(), "12");
		
		selectByValue(pom.getRp().getMonths_DD(), "4");
		
		selectByValue(pom.getRp().getYears_DD(), "2000");
		
		isSelected(pom.getRp().getReceive_CheckBox());
		
		moveToElement(pom.getRp().getReceive_CheckBox());
		
		mouseClick();
		
		moveToElement(pom.getRp().getSignin_CheckBox());
		
		mouseClick();
		
		List<WebElement> elements = new ArrayList<WebElement>();
		elements.add(pom.getRp().getFirst_TV());
		elements.add(pom.getRp().getLast_TV());
		elements.add(pom.getRp().getCompany_TV());
		elements.add(pom.getRp().getAddress1_TV());
		elements.add(pom.getRp().getAddress2_TV());
		elements.add(pom.getRp().getCity_TV());
		elements.add(pom.getRp().getOther_TV());
		elements.add(pom.getRp().getPhone_TV());
		elements.add(pom.getRp().getMobile_TV());
		
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
		
		selectByValue(pom.getRp().getState_DD(), "32");
		
		sendInputElement(pom.getRp().getPostcode_TV(), "12345");
		
		isEnabled(pom.getRp().getCountry_DD());
		getAttributes(pom.getRp().getCountry_DD(), "value");
		
		isEnabled(pom.getRp().getAlias_TV());
		getAttributes(pom.getRp().getAlias_TV(), "value");
		
		clickOnElement(pom.getRp().getRegister_Btn());
		
		getScreenShot(screenDesti + "\\Register.png");
		
		sleep(2);
		
		navigateTo("http://automationpractice.com/index.php");
								
		moveToElement(pom.getHp().getWomen_Link());
		
		moveToElement(pom.getHp().getWom_eve_Link());
		mouseClick();
						
		moveToElement(pom.getEv().getImg_printDresses());
		
		moveToElement(pom.getEv().getQuick_View());
		
		mouseClick();
				
		switchFrame(pom.getEv().getFrame());
		
		moveToElement(pom.getEv().getIncre_Btn());
		
		mouseClickIteration(pom.getEv().getIncre_Btn(), 4);
		
		selectByValue(pom.getEv().getSize_DD(), "2");

		clickOnElement(pom.getEv().getColorPink_Btn());
		
		clickOnElement(pom.getEv().getAddtocart_Btn());
		
		getScreenShot(screenDesti + "\\QuickView.png");
		
		switchDefault();

		getScreenShot(screenDesti + "\\Proced.png");
				
		clickOnElement(pom.getEv().getCheckout_Btn());
		
		getScreenShot(screenDesti + "\\CheckOut.png");
				
		getScreenShot(screenDesti + "//Summary.png");
		
		clickOnElement(pom.getSup().getChekout_Btn());
				
		sendInputElement(pom.getAp().getMessg_TV(), "Hii, This Is Automation Testing.");
		
		getScreenShot(screenDesti + "\\Delivery.png");
		
		clickOnElement(pom.getAp().getCheckout_Btn());
				
		moveToElement(pom.getShp().getTerms_CheckBox());
		
		mouseClick();
		
		getScreenShot(screenDesti + "\\DeliveryTo.png");
		
		clickOnElement(pom.getShp().getCheckout_Btn());
				
		getScreenShot(screenDesti + "\\Payment.png");
		
		moveToElement(pom.getPp().getPay_wire_Btn());
		
		mouseClick();
				
		getScreenShot(screenDesti + "\\ConfirmOrder.png");
		
		clickOnElement(pom.getBp().getConfirm_Btn());
		
		getScreenShot(screenDesti + "Final.png");
		
		sleep(2);
		
		close();
		
		quit();
	}
}
