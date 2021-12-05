package org.practice;

import java.io.File;
import java.io.FileInputStream;
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
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {
	
	static WebDriver driver;

	public WebDriver launchBrowser(){
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	return driver;
	}

	public void getUrl(String url){
	driver.get(url);
	}

	public String getCurrentUrl(){
	String currentUrl = driver.getCurrentUrl();
	return currentUrl;
	}

	public String getTitle(){
	String getTitle = driver.getTitle();
	return getTitle;
	}

	public String getWindowHandle(){
	String windowHandle = driver.getWindowHandle();
	return windowHandle;
	}

	public Set<String> getWindowHandles(){
	Set<String> windowHandles = driver.getWindowHandles();
	return windowHandles;
	}

	public Options manage(){
	Options manage = driver.manage();
	return manage;
	}

	public TargetLocator switchTo(){
	TargetLocator switchTo = driver.switchTo();
	return switchTo;
	}

	public Navigation navigate(){
	Navigation navigate= driver.navigate();
	return navigate;
	}

	public void quitBrowser(){
	driver.quit();
	}

	public void closeBrowser(){
	driver.close();
	}
	
	public void click(WebElement e){
		e.click();
		}

		public void sendKeys(WebElement e , String name){
		e.sendKeys(name);
		}

		public void clear(WebElement e){
		e.clear();
		}

		public String getText(WebElement e){
		String text = e.getText();
		return text;
		}

		public String getAttribute(WebElement e,String name){
		String txt = e.getAttribute(name);
		return txt;
		}

		public Boolean isDisplayed(WebElement e){
		Boolean txt1 = e.isDisplayed();
		return txt1;
		}

		public Boolean isSelected(WebElement e){
		Boolean txt2 = e.isSelected();
		return txt2;
		}

		public Boolean isEnabled(WebElement e){
		Boolean txt3 = e.isEnabled();
		return txt3;
		}

    public void to(String url){
			navigate().to(url);
			}

			public void forward(){
			navigate().forward();
			}

			public void back(){
			navigate().back();
			}

			public void refresh(){
			navigate().refresh();
			}
			public void selectByValue(WebElement j,String url){
				Select select = new Select(j);
				select.selectByValue(url);
				}

				public void selectByVisibleText(WebElement j, String text){
				Select select = new Select(j);
				select.selectByVisibleText(text);
				}

				public void selectByIndex(WebElement j,int i){
				Select select = new Select(j);
				select.selectByIndex(i);
				}

				public void deSelectByValue(WebElement j, String url){
				Select select = new Select(j);
				select.deselectByValue(url);
				}

				public void deSelectByIndex(WebElement j,int i){
				Select select = new Select(j);
				select.deselectByIndex(i);
				}

				public void deSelectByVisibleText(WebElement j, String text){
				Select select = new Select(j);
				select.deselectByVisibleText(text);
				}

				public void deSelectAll(WebElement j){
				Select select = new Select(j);
				select.deselectAll();
				}

				public List<WebElement> getOptions(WebElement j){
				Select select = new Select(j);
				List<WebElement>option = select.getOptions();
				return option;
				}

				public Boolean isMultiple(WebElement j){
				Select select = new Select(j);
				Boolean multiple = select.isMultiple();
				return multiple;
				}

				public List<WebElement>getAllSelectedOptions(WebElement j){
				Select select = new Select(j);
				List<WebElement> selectedoption =select.getAllSelectedOptions();
				return selectedoption;
				}

				public WebElement firstSelectedOption(WebElement j){
				Select select = new Select(j);
				WebElement firstSelected = select.getFirstSelectedOption();
				return firstSelected;
				}
				public Actions dragAndDrop(WebElement source,WebElement destination){
					Actions action = new Actions(driver);
					Actions dragAndDrop = action.dragAndDrop(source,destination);
					return dragAndDrop;
					}

					public Actions moveToElement(WebElement i){
					Actions action = new Actions(driver);
					Actions moveto = action.moveToElement(i);
					return moveto;
					}

					public Actions doubelClick(WebElement i){
					Actions action = new Actions(driver);
					Actions doubleclick = action.doubleClick();
					return doubleclick;
					}

					public Actions contextClick(WebElement j){
					Actions action = new Actions(driver);
					Actions contextclick = action.contextClick(j);
					return contextclick;
					}

					public void perform(WebElement k){
					Actions action = new Actions(driver);
					action.perform();
					}
					public Alert alert(){
						Alert alert = driver.switchTo().alert();
						return alert;
					}

						public void accept(){
						alert().accept();
						}

						public void dismiss(){
						alert().dismiss();
						}

						public String getText(){
						String text = alert().getText();
						return text;
						}

						public void sendKeys(String i){
						alert().sendKeys(i);
						}
						public String getDataFromExcel(String name,int row,int Cell) throws IOException{
							 String value = null;

							File file = new File("Path");
							FileInputStream stream = new FileInputStream(file);
							Workbook book = new XSSFWorkbook(stream);
							Sheet sheet = book.getSheet(name);					
							Row r = sheet.getRow(row);
							Cell c = r.getCell(Cell);
							int type = c.getCellType();
							if(type==1){
							    value = c.getStringCellValue();
							}
							if(type ==0){
							if(DateUtil.isCellDateFormatted(c)){
							      Date date = c.getDateCellValue();
							      SimpleDateFormat simple = new SimpleDateFormat("m/d/y");
							      value = simple.format(date);
							      }else{
							          double txt = c.getNumericCellValue();
							           long t = (long)txt;
							           value = String.valueOf(t);

							    }
							}
							  return value;
							     



						}






}
