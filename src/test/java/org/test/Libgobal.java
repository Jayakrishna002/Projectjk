package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Libgobal {
	
	public static WebDriver driver;
	
	public WebDriver launchBrowser() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	    return driver;
	}
	// WebDriver Methods Basic class:
	
	public void launchUrl(String url) {
		driver.get(url);
	}
	public String getCurrentUrl() {
		String pageUrl = driver.getCurrentUrl();
        return pageUrl;
	}
	public String pageTitle() {
		String title = driver.getTitle();
		return title;
	}
    public String windowId() {
    	String handle = driver.getWindowHandle();
    	return handle;
    }	
    public Set<String> windowIds() {
    	Set<String> windowHandles = driver.getWindowHandles();
    	return windowHandles;
    }
    public Options Windowsize() {
    	Options manage = driver.manage();
    	return manage;
    }
    public Navigation navigation() {
    	Navigation navigate = driver.navigate();
    	return navigate;	
    }
    public TargetLocator switchingUI(){
    	TargetLocator switchTo = driver.switchTo();
    	return switchTo;
    }
    public void quitBrowser() {
    	driver.quit();
    }
    public void closeBrowser() {
    	driver.close();
    }
    
    //WebElement method basic class;
    
    public void inputValues(WebElement e,String name) {
    	e.sendKeys(name);	
    }
    public void select(WebElement e) {
    	e.click();
    }
    public String printText(WebElement e) {
    	String text = e.getText();
    	return text;
    	
    }
    public String getContent(WebElement e, String name) {
    	String attribute = e.getAttribute(name);
    	return attribute;
    }
    public boolean optionIsSelected(WebElement e) {
    	boolean selected = e.isSelected();
    	return selected;
    }
    public boolean optionIsEnabled(WebElement e) {
    	boolean selected = e.isEnabled();
    	return selected;
    }
    public boolean optionIsDisplayed(WebElement e) {
    	boolean selected = e.isDisplayed();
    	return selected;
    }
    
    // Navigation method basic class:
    
    public void forward() {
    	navigation().forward();
    }
    public void to(String url) {
    	navigation().to(url);
    }
    public void refresh() {
    	navigation().refresh();
    }
    public void back() {
    	navigation().back();
    }
    
    //Select method basic class;
    public void selectByIndexvalue(WebElement j,int Index) {
    	Select s = new Select(j);
    	s.selectByIndex(Index);
    }
    public void selectByValue1(WebElement j,String url) {
    	Select s = new Select(j);
    	s.selectByValue(url);
    }
    public void selectByVisibleText(WebElement j,String text) {
    	Select s = new Select(j);
    	s.selectByVisibleText(text);
    }
    public void deselectByIndexvalue(WebElement j,int Index) {
    	Select s = new Select(j);
    	s.deselectByIndex(Index);
    }
    public void deselectByValue1(WebElement j,String url) {
    	Select s = new Select(j);
    	s.deselectByValue(url);
    }
    public void deSelectByVisibleText(WebElement j,String text) {
    	Select s = new Select(j);
    	s.deselectByValue(text);
    }
    public void deselectAll(WebElement j) {
    	Select s = new Select(j);
    	s.deselectAll();
    }
    public List<WebElement> getOptionsFromDropdown(WebElement j) {
    	Select s = new Select(j);
    	List<WebElement> options = s.getOptions();
    	return options;
    }
    public Boolean isMultiplecondition(WebElement j) {
    	Select s =new Select(j);
    	Boolean selected =s.isMultiple();
    	return selected;
    }
    public List<WebElement>  getAllSelectedOptions(WebElement j) {
    	Select s =new Select(j);
    	List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
    	return allSelectedOptions;
    }
    public WebElement  getFirstSelectedOptions(WebElement j) {
    	Select s =new Select(j);
    	WebElement firstSelectedOption = s.getFirstSelectedOption();
    	return firstSelectedOption;
    	
    }
    
    //Actions methods basic class;
    
    public Actions moveToElements(WebElement r ) {
    	Actions jk = new Actions(driver);
    	Actions moveToElement = jk.moveToElement(r);
    	return moveToElement;
    }
    public Actions dragAndDrop(WebElement source, WebElement destination) {
     Actions jk = new Actions(driver);
     Actions dragAndDrop = jk.dragAndDrop(source, destination);
     return dragAndDrop; 
     	}
    public Actions contextclick(WebElement e) {
        Actions jk = new Actions(driver);
        Actions contextClick = jk.contextClick(e);
        return contextClick;
    }
	public Actions doubleClick(WebElement e) {
        Actions jk = new Actions(driver);
        Actions contextClick = jk.doubleClick(e);
        return contextClick;
    }
    public void perform() {
    	Actions jk =new Actions(driver);
    	jk.perform();
    }
    // Alert method basic class;
    
    public Alert alerts() {
    	Alert alert = driver.switchTo().alert();
    	return alert;
    }
    public void accept() {
    	alerts().accept();
    }
    public void dismiss() {
    	alerts().dismiss();
    }
    public void sendKeys(String text) {
    	alerts().sendKeys(text);
    }
    public String getText() {
    	String text = alerts().getText();
    	return text;
    }
        public void UpdateDataInExcel(String sheet,int row,int cell,String data) throws IOException {
		
    	File excelLoc = new File("E:\\Java\\Framework\\BasicClass\\ExcelData\\Book1.xlsx");
    	FileInputStream stream = new FileInputStream(excelLoc);
    	Workbook w = new XSSFWorkbook(stream);
    	Sheet s =w.getSheet(sheet);
    	Row r =s.getRow(row);
    	Cell c = r.createCell(cell);
    	c.setCellValue(data);
    	FileOutputStream stream1=new FileOutputStream(excelLoc);
    	w.write(stream1);	
	}
    // To get the Data from the Excel basic class;
    public String getDataFromExcel(String name,int row,int cell) throws IOException {
    	String value = null;
    	
    	File excelLoc = new File("E:\\Java\\Framework\\BasicClass\\ExcelData\\Book1.xlsx");
    	FileInputStream stream = new FileInputStream(excelLoc);
    	Workbook book = new XSSFWorkbook(stream);
    	Sheet sheet = book.getSheet(name);
    	Row r = sheet.getRow(row);
    	Cell c = r.getCell(cell);
    	int type = c.getCellType();
    	if(type==1) {
    		 value =c.getStringCellValue();
    	}
    	if(type==0) {
    		if(DateUtil.isCellDateFormatted(c)) {
    			Date dateCellValue = c.getDateCellValue();
    			SimpleDateFormat dat = new SimpleDateFormat("m/d/y");
    			value = dat.format(dateCellValue);
    		}else {
    			double data = c.getNumericCellValue();
    			long j = (long)data;
    			 value = String.valueOf(j);
    		}
      }
    return value;
 }	
    //To updated the data in excel;
	
}
		



