package org.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
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

public class Page_Object_Manager {

	public WebDriver driver;
	
	private Home_Page hp;
	
	private SignIn_Page sp;
	
	private Register_Page rp;
	
	private Evenning_Dresses ev;
	
	private Address_Page ap;
	
	private Bank_Wire_Page bp;
	
	private Order_SignIn_Page osp;
	
	private Payment_page pp;
	
	private Shipping_Page shp;
	
	private Summary_Page sup;
	

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}


	public Home_Page getHp() {
		
		this.hp = new Home_Page(driver);
		
		return hp;
	}


	public Register_Page getRp() {
		
		this.rp = new Register_Page(driver);
		
		return rp;
	}


	public Evenning_Dresses getEv() {
		
		this.ev = new Evenning_Dresses(driver);
		
		return ev;
	}


	public Address_Page getAp() {
		
		this.ap = new Address_Page(driver);
		
		return ap;
	}


	public Bank_Wire_Page getBp() {
		
		this.bp = new Bank_Wire_Page(driver);
		
		return bp;
	}


	public Order_SignIn_Page getOsp() {
		
		this.osp = new Order_SignIn_Page(driver);
		
		return osp;
	}


	public Payment_page getPp() {
		
		this.pp = new Payment_page(driver);
		
		return pp;
	}


	public Shipping_Page getShp() {
		
		this.shp = new Shipping_Page(driver);
		
		return shp;
	}


	public Summary_Page getSup() {
		
		this.sup = new Summary_Page(driver);
		
		return sup;
	}


	public SignIn_Page getSp() {
		
		this.sp = new SignIn_Page(driver);
		
		return sp;
	}
	
}
