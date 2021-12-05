package org.junit;

import java.io.IOException;
import java.util.Date;

import org.book.BookHotelPage;
import org.login.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.search.SearchHotelPage;
import org.select.SelectHotelPage;
import org.test.Libgobal;

public class Junit {
	
	     static Libgobal jk;
	
		@BeforeClass	
		public static void launchBrowser() {
			 jk = new Libgobal();
			 WebDriver driver = jk.launchBrowser();
			 jk.launchUrl("https://adactinhotelapp.com/");
//			 String currentUrl = driver.getCurrentUrl();
//			 boolean contains = currentUrl.contains("xyz");
//			 Assert.assertTrue("Verify Url", contains);
			 
		}
		
		@Before
		public void startTime() {
			Date date = new Date();
			System.out.println(date);
		}
		
		@Test //Login page
		public void  tc1() throws IOException {
			LoginPage loginpage = new LoginPage();
			
			 WebElement entUsername =loginpage.getEntUsername();
			 jk.inputValues(entUsername, jk.getDataFromExcel("Sheet1", 1, 0));
			 
			    
			 WebElement  entpass =loginpage.getEntpass();
			 jk.inputValues(entpass, jk.getDataFromExcel("Sheet1", 1, 1));
			 
			 String attribute = entpass.getAttribute("value");
			 
//			 Assert.assertEquals("Verify pass", "elcome@2021", attribute);
			    
			 WebElement btnlogin = loginpage.getBtnlogin();
			 jk.select(btnlogin);	    
		}
		
		@Test //Search HotelPage
		public void tc2() throws IOException {
			SearchHotelPage searchHotelPage = new SearchHotelPage();
			
			WebElement choloc = searchHotelPage.getCholoc();
		    jk.UpdateDataInExcel("Sheet1", 0, 2, "Location");
		    jk.UpdateDataInExcel("Sheet1", 1, 2, "Paris");
	        jk.selectByVisibleText(choloc,jk.getDataFromExcel("Sheet1", 1, 2));
	         
		    WebElement chohotel = searchHotelPage.getChohotel();
		    jk.UpdateDataInExcel("Sheet1", 0, 3, "Hotels");
		    jk.UpdateDataInExcel("Sheet1", 1, 3, "Hotel Sunshine");
		    jk.selectByVisibleText(chohotel, jk.getDataFromExcel("Sheet1", 1, 3));
		    
		    WebElement choroom = searchHotelPage.getChoroom();
		    jk.UpdateDataInExcel("Sheet1", 0, 4, "Room Type");
		    jk.UpdateDataInExcel("Sheet1", 1, 4, "Super Deluxe");
		    jk.selectByVisibleText(choroom,jk.getDataFromExcel("Sheet1", 1, 4));
		    
		    WebElement numOfRooms = searchHotelPage.getNumOfRooms();
		    jk.UpdateDataInExcel("Sheet1", 0, 5, "Number of Rooms");
		    jk.UpdateDataInExcel("Sheet1", 1, 5, "2");
		    jk.selectByValue1(numOfRooms, jk.getDataFromExcel("Sheet1", 1, 5));
		    
		    WebElement datePickIn = searchHotelPage.getDatePickIn();
		    datePickIn.clear();
		    jk.UpdateDataInExcel("Sheet1", 0, 6, "Date In");
		    jk.UpdateDataInExcel("Sheet1", 1, 6, "11/11/2021");
		    jk.inputValues(datePickIn, jk.getDataFromExcel("Sheet1", 1, 6));
		    
		    WebElement datePickOut = searchHotelPage.getDatePickOut();
		    datePickOut.clear();
		    jk.UpdateDataInExcel("Sheet1", 0, 7, "Date Out");
		    jk.UpdateDataInExcel("Sheet1", 1, 7, "14/11/2021");
		    jk.inputValues(datePickOut, jk.getDataFromExcel("Sheet1", 1, 7));
		    
		    WebElement adultRoom = searchHotelPage.getAdultRoom();
		    jk.UpdateDataInExcel("Sheet1", 0, 8, "Check Out Date");
		    jk.UpdateDataInExcel("Sheet1", 1, 8, "2 - Two");
		    jk.selectByVisibleText(adultRoom, jk.getDataFromExcel("Sheet1", 1, 8)); 
		  
		    WebElement childRoom = searchHotelPage.getChildRoom();
		    jk.UpdateDataInExcel("Sheet1", 0, 9, "Children per Date");
		    jk.UpdateDataInExcel("Sheet1", 1, 9, "0 - None");
		    jk.selectByVisibleText(childRoom, jk.getDataFromExcel("Sheet1", 1, 9));
		    
		    WebElement submit = searchHotelPage.getSubmit();
		    jk.select(submit);
		}
		    
		    @Test //select Hotel Page
		    public void  tc3() {
		    SelectHotelPage selectHotelPage = new SelectHotelPage();
		    
		    WebElement click = selectHotelPage.getClick();
		    jk.select(click);
		   
		    WebElement cotinue = selectHotelPage.getCotinue();
		    jk.select(cotinue);
		    
		}
		    
		   @Test
		   public void tc4() throws IOException {
		   BookHotelPage bookHotelPage = new BookHotelPage();
		    

		    WebElement firstname = bookHotelPage.getFirstname();
		    jk.UpdateDataInExcel("Sheet1", 0, 10, "first_name");
		    jk.UpdateDataInExcel("Sheet1", 1, 10, "Krishna");
		    jk.inputValues(firstname, jk.getDataFromExcel("Sheet1", 1, 10));
		    
		    WebElement lastname = bookHotelPage.getLastname();
		    jk.UpdateDataInExcel("Sheet1", 0, 11, "Last_name");
		    jk.UpdateDataInExcel("Sheet1", 1, 11, "innovation");
		    jk.inputValues(lastname, jk.getDataFromExcel("Sheet1", 1, 11));
		   
		    WebElement address = bookHotelPage.getAddress();
		    jk.UpdateDataInExcel("Sheet1", 0, 12, "address");
		    jk.UpdateDataInExcel("Sheet1", 1, 12, "2/1, 1 Floor, 1st Main Road, Palace Gutta Halli");
		    jk.inputValues(address, jk.getDataFromExcel("Sheet1", 1, 12));
		   
		    WebElement cardNum = bookHotelPage.getCardNum();
		    jk.UpdateDataInExcel("Sheet1", 0, 13, "cc_num");
		    jk.UpdateDataInExcel("Sheet1", 1, 13, "1234567891234560");
		    jk.inputValues(cardNum, jk.getDataFromExcel("Sheet1", 1, 13));
		   
		    WebElement cardType = bookHotelPage.getCardType();
		    jk.UpdateDataInExcel("Sheet1", 0, 14, "cerdit card type");
		    jk.UpdateDataInExcel("Sheet1", 1, 14, "VISA");
		    jk.inputValues(cardType, jk.getDataFromExcel("Sheet1", 1, 14));
		   
		    WebElement month = bookHotelPage.getMonth();
		    jk.UpdateDataInExcel("Sheet1", 0, 15, "Expiry Month");
		    jk.UpdateDataInExcel("Sheet1", 1, 15, "October");
		    jk.inputValues(month, jk.getDataFromExcel("Sheet1", 1, 15));
		   
		    WebElement year = bookHotelPage.getYear(); 
		    jk.UpdateDataInExcel("Sheet1", 0, 16, "Expiry Year");
		    jk.UpdateDataInExcel("Sheet1", 1, 16, "2021");
		    jk.inputValues(year, jk.getDataFromExcel("Sheet1", 1, 16));
		  
		    WebElement cvvnumber = bookHotelPage.getCvvnumber();
		    jk.UpdateDataInExcel("Sheet1", 0, 17, "CCV number");
		    jk.UpdateDataInExcel("Sheet1", 1, 17, "202");
		    jk.inputValues(cvvnumber, jk.getDataFromExcel("Sheet1", 1, 17));
		   
		    WebElement booknow = bookHotelPage.getBooknow();
		    jk.select(booknow);
		    
		    WebElement ordernum = bookHotelPage.getOrdernum();
		    String attribute = ordernum.getAttribute("value");
		    System.out.println(attribute);
		    jk.UpdateDataInExcel("Sheet1", 0, 18, "order no");
		    jk.UpdateDataInExcel("Sheet1", 1, 18, attribute);
		   }
		   
		   @After
		   public  void endTime() {
			   Date date = new Date();
			   System.out.println(date);
		   }
		   
		   @AfterClass
		   public static void quitBrowser() {
		   jk.quitBrowser();
		   }

	

}
