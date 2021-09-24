package org.mini.projects;

import java.util.ArrayList;
import java.util.List;
import org.base.Base;
import org.helper.File_Reader_Manager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.sdp.Page_Object_Manager;

public class Mini_Projects_DataDriven extends Base {

	public static WebDriver driver = setBrowser("chrome", "http://automationpractice.com/index.php");
	
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	public static String path = "C:\\Users\\sarat\\Documents\\Test.xlsx";
	
	public static void main(String[] args) throws Throwable {
		
		implicitlyWait(10);
		
		getCurrentUrl();
		
		getTitle();
		
		clickOnElement(pom.getHp().getSignin_Btn());
		
		isDisplayed(pom.getSp().getCreate_Email());
		
		isEnabled(pom.getSp().getCreate_Email());
		
//		String createEmail = File_Reader_Manager.getInstance().getInstanceCR().getCreateEmail();
		
		String email = particular_Data_From_Excel(path, 1, 0);
		
//		sendInputElement(pom.getSp().getCreate_Email(), File_Reader_Manager.getInstance().getInstanceCR().getCreateEmail());
		
		sendInputElement(pom.getSp().getCreate_Email(), email);
		
		clickOnElement(pom.getSp().getCreate_Btn());
		
		isSelected(pom.getRp().getMr_RadioBtn());
		
		moveToElement(pom.getRp().getMr_RadioBtn());
		
		mouseClick();
		
		sendInputElement(pom.getRp().getFristadd_TV(), File_Reader_Manager.getInstance().getInstanceCR().getFirstNameAdd());
		
		sendInputElement(pom.getRp().getLastadd_TV(), File_Reader_Manager.getInstance().getInstanceCR().getLastNameAdd());
		
		isEnabled(pom.getRp().getEmail_TV());
		
		getAttributes(pom.getRp().getEmail_TV(), File_Reader_Manager.getInstance().getInstanceCR().getAttributeValue());
		
		sendInputElement(pom.getRp().getPasswd_TV(), File_Reader_Manager.getInstance().getInstanceCR().getCreatePasswd());
		
		selectByValue(pom.getRp().getDays_DD(), File_Reader_Manager.getInstance().getInstanceCR().getSetDay());
		
		selectByValue(pom.getRp().getMonths_DD(), File_Reader_Manager.getInstance().getInstanceCR().getSetMonth());
		
		selectByValue(pom.getRp().getYears_DD(), File_Reader_Manager.getInstance().getInstanceCR().getSetYear());
		
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
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateFirstName());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateLastName());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateCompany());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateAddress1());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateAddress2());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateCity());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateOthers());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreatePhone());
		valStrings.add(File_Reader_Manager.getInstance().getInstanceCR().getCreateMobile());
		
		System.out.println(valStrings);
		
		iterationSend(elements, valStrings);
		
		selectByValue(pom.getRp().getState_DD(), File_Reader_Manager.getInstance().getInstanceCR().getSelectState());
		
		sendInputElement(pom.getRp().getPostcode_TV(), File_Reader_Manager.getInstance().getInstanceCR().getSendPostcode());
		
		isEnabled(pom.getRp().getCountry_DD());
		getAttributes(pom.getRp().getCountry_DD(), File_Reader_Manager.getInstance().getInstanceCR().getAttributeValue());
		
		isEnabled(pom.getRp().getAlias_TV());
		getAttributes(pom.getRp().getAlias_TV(), File_Reader_Manager.getInstance().getInstanceCR().getAttributeValue());
		
		clickOnElement(pom.getRp().getRegister_Btn());
		
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\Register.png");
		
		sleep(2);
		
//		navigateTo(File_Reader_Manager.getInstance().getInstanceCR().getUrl());
		
		moveToElement(pom.getRp().getHome_Img());
		mouseClick();
								
		moveToElement(pom.getHp().getWomen_Link());
		
		moveToElement(pom.getHp().getWom_eve_Link());
		mouseClick();
						
		moveToElement(pom.getEv().getImg_printDresses());
		
		moveToElement(pom.getEv().getQuick_View());
		
		mouseClick();
				
		switchFrame(pom.getEv().getFrame());
		
		moveToElement(pom.getEv().getIncre_Btn());
		
		mouseClickIteration(pom.getEv().getIncre_Btn(), 4);
		
		selectByValue(pom.getEv().getSize_DD(), File_Reader_Manager.getInstance().getInstanceCR().getSelectSize());

		clickOnElement(pom.getEv().getColorPink_Btn());
		
		clickOnElement(pom.getEv().getAddtocart_Btn());
		
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\QuickView.png");
		
		switchDefault();

		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\Proced.png");
				
		clickOnElement(pom.getEv().getCheckout_Btn());
		
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\CheckOut.png");
				
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "//Summary.png");
		
		clickOnElement(pom.getSup().getChekout_Btn());
				
		sendInputElement(pom.getAp().getMessg_TV(), File_Reader_Manager.getInstance().getInstanceCR().getSendMessage());
		
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\Delivery.png");
		
		clickOnElement(pom.getAp().getCheckout_Btn());
				
		moveToElement(pom.getShp().getTerms_CheckBox());
		
		mouseClick();
		
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\DeliveryTo.png");
		
		clickOnElement(pom.getShp().getCheckout_Btn());
				
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\Payment.png");
		
		moveToElement(pom.getPp().getPay_wire_Btn());
		
		mouseClick();
				
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "\\ConfirmOrder.png");
		
		clickOnElement(pom.getBp().getConfirm_Btn());
		
		getScreenShot(File_Reader_Manager.getInstance().getInstanceCR().getScreenShotDesti() + "Final.png");
		
		sleep(2);
		
		close();
		
		quit();
	}
	
}
