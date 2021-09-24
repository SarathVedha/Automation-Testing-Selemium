package org.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;

	public Configuration_Reader() throws Throwable {

		File f = new File("C:\\Users\\sarat\\eclipse-workspace\\Maven_Projects\\src\\main\\java\\org\\properties\\Configuration.properties");
		
		FileInputStream fileReader = new FileInputStream(f);
		
		p = new Properties();    //---> Set Static 
		
		p.load(fileReader);
	}
	
	public String getBrowser() {

		String browser = p.getProperty("set_Browser");
		
		return browser;
	}
	
	public String getUrl() {

		String url = p.getProperty("set_Url");
		
		return url;
	}
	
	public String getCreateEmail() {

		String createEmail = p.getProperty("create_Email");
		
		return createEmail;
	}
	
	public String getFirstNameAdd() {

		String firstName = p.getProperty("create_First_Name_Add");
		
		return firstName;
	}
	
	public String getLastNameAdd() {

		String lastName = p.getProperty("create_Last_Name_Add");
		
		return lastName;
	}
	
	public String getAttributeValue() {

		String attribute = p.getProperty("attribute_Value");	
		
		return attribute;
	}
	
	public String getCreatePasswd() {

		String passwd = p.getProperty("create_Passwd");
		
		return passwd;
	}
	
	public String getSetDay() {

		String day = p.getProperty("select_Dob_Day");
		
		return day;
	}
	
	public String getSetMonth() {

		String month = p.getProperty("select_Dob_Month");
		
		return month;
	}
	
	public String getSetYear() {

		String year = p.getProperty("select_Dob_Year");
		
		return year;
	}
	
	public String getCreateFirstName() {

		String firstName = p.getProperty("create_First_Name");
		
		return firstName;
	}
	
	public String getCreateLastName() {

		String lastName = p.getProperty("create_Last_Name");
		
		return lastName;
	}
	
	public String getCreateCompany() {

		String company = p.getProperty("create_Company");
		
		return company;
	}
	
	public String getCreateAddress1() {

		String address1 = p.getProperty("create_Address1");
		
		return address1;
	}
	
	public String getCreateAddress2() {

		String address2 = p.getProperty("create_Address2");
		
		return address2;
	}
	
	public String getCreateCity() {

		String city = p.getProperty("create_City");
		
		return city;
	}
	
	public String getCreateOthers() {

		String others = p.getProperty("create_Other");
		
		return others;
	}
	
	public String getCreateMobile() {

		String mobile = p.getProperty("create_Mobile");
		
		return mobile;
	}
	
	public String getCreatePhone() {

		String phone = p.getProperty("create_Phone");
		
		return phone;
	}
	
	public String getSelectState() {

		String state = p.getProperty("select_State");
		
		return state;
	}
	
	public String getSendPostcode() {

		String postcode = p.getProperty("send_Postcode");
		
		return postcode;
	}
	
	public String getSelectSize() {

		String size = p.getProperty("select_Size");
		
		return size;
	}
	
	public String getSendMessage() {

		String message = p.getProperty("send_Message");
		
		return message;
	}
	
	public String getScreenShotDesti() {

		String screenshotdesti = p.getProperty("screenshot_Desti");
		
		return screenshotdesti;
	}
	
}
