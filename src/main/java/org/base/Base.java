package org.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base {
	
	public static WebDriver driver;

	private static Workbook wb;
	
	public static WebDriver setBrowser(String driverName, String url) {

		if (driverName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
			
		} else if (driverName.equalsIgnoreCase("edge")) {
			
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "\\driver\\msedgedriver.exe");
			driver = new EdgeDriver();
			
		} else if (driverName.equalsIgnoreCase("firefox")){
			
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\driver\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		} else {
			
			System.out.println(" Enter Chrome, Edge or Firefox For Driver.");
			
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		
		return driver;
	}
	
	public static void close() {

		driver.close();
	}
	
	public static void implicitlyWait(int seconds) {

		driver.manage().timeouts().implicitlyWait(seconds, TimeUnit.SECONDS);
	}
	
	public static void sleep(int seconds) throws Throwable {

		seconds = seconds * 1000;
		
		Thread.sleep(seconds);
	}
	
	public static void isDisplayed(WebElement element) {

		System.out.println("Element isDisplayed : " + element.isDisplayed());
	}
	
	public static void isEnabled(WebElement element) {

		System.out.println("Element isEnabled : " + element.isEnabled());
	}
	
	public static void isSelected(WebElement element) {

		System.out.println("Element isSelected : " + element.isSelected());
	}
	
	public static void clickOnElement(WebElement element) {

		element.click();
	}
	
	public static void sendInputElement(WebElement element, String value) {

		element.sendKeys(value);
	}
	
	public static void getUrl(String url) {

		driver.get(url);
	}
	
	public static void getCurrentUrl() {

		System.out.println("Current Url : " + driver.getCurrentUrl());
	}
	
	public static void getTitle() {

		System.out.println("Current Title : " + driver.getTitle());
	}
	
	public static void navigateTo(String Url) {

		driver.navigate().to(Url);
	}
	
	public static void navigateBack() {

		driver.navigate().back();
	}
	
	public static void navigateForward() {

		driver.navigate().forward();
	}
	
	public static void navigateRefresh() {

		driver.navigate().refresh();
	}
	
	public static void selectByValue(WebElement element, String value) {

		Select select = new Select(element);
		select.selectByValue(value);
	}
	
	public static void selectByIndex(WebElement element, int index) {

		Select select = new Select(element);
		select.selectByIndex(index);
	}
	
	public static void selectByVisibleText(WebElement element, String value) {
		
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}
	
	public static void dropDown(WebElement element, String type, String value) {

		Select select = new Select(element);
		
		if (type.equalsIgnoreCase("value")) {
			
			select.selectByValue(value);
			
		}else if (type.equalsIgnoreCase("index")) {
			
			int index = Integer.parseInt(value);
			
			select.selectByIndex(index);
			
		}else if (type.equalsIgnoreCase("visibletext")) {
			
			select.selectByVisibleText(type);
			
		}else {
		
			System.out.println("Enter Valid Types Index, Value, Visibletext : " + type);
		}
	}
	
	public static void getScreenShot(String destination) throws Throwable {

		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		File descFile = new File(destination);
		FileUtils.copyFile(sourceFile, descFile);
	}
	
	public static void quit() {

		driver.quit();;
	}
	
	public static void moveToElement(WebElement element) {

		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}
	
	public static void mouseClick() {

		Actions actions = new Actions(driver);
		actions.click().perform();
	}
	
	public static void mouseClickIteration(WebElement element, int iterateValue) {

		for (int i = 0; i < iterateValue; i++) {
			
			Actions actions = new Actions(driver);
			actions.click(element).perform();
		}
	}
	
	public static void getAttributes(WebElement element, String value) {

		String attrValue = element.getAttribute(value);
		System.out.println(attrValue);
	}
	
	public static void iterationSend(List<WebElement> elements, List<String> values) {

		int size = elements.size();
		for (int i = 0; i < size; i++) {
			
			WebElement temp = elements.get(i);
			temp.sendKeys(values.get(i));
		}
	}
	
	public static void switchFrame(WebElement element) {

		driver.switchTo().frame(element);
	}
	
	public static void switchDefault() {
		
		driver.switchTo().defaultContent();
	}
	
	public static String particular_Data_From_Excel(String path, int row_Index, int column_Index) throws Throwable {

		String value = null;
		
		File f = new File(path);
		
		FileInputStream fis = new FileInputStream(f);
		
		wb = new XSSFWorkbook(fis);
		
		Sheet sheet = wb.getSheetAt(0);
		
		Row row = sheet.getRow(row_Index);
		
		Cell cell = row.getCell(column_Index);
		
		CellType cellType = cell.getCellType();
		
		if (cellType.equals(CellType.STRING)) {
			
			value = cell.getStringCellValue();
			
		} else if (cellType.equals(CellType.NUMERIC)) {
			
			double numericCellValue = cell.getNumericCellValue();
			
			value = Double.toString(numericCellValue);
		}
		
		return value;
	}
}