package org.man;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.test.Libgobal;

public class Test {
public static void main(String[] args) throws IOException, AWTException {
		
	    Libgobal jk = new Libgobal();
	    WebDriver driver = jk.launchBrowser();
	    jk.launchUrl("https://adactinhotelapp.com/");
	    
	    WebElement entUsername = driver.findElement(By.id("username"));
	    
	    jk.inputValues(entUsername, jk.getDataFromExcel("Sheet1", 1, 0));
	    
	    WebElement entpass = driver.findElement(By.id("password"));
	    jk.inputValues(entpass, jk.getDataFromExcel("Sheet1", 1, 1));
	    
	    WebElement btnlogin = driver.findElement(By.id("login"));
	    jk.select(btnlogin);
	    
	    WebElement choLoc = driver.findElement(By.name("location"));
	    jk.selectByVisibleText(choLoc,jk.getDataFromExcel("Sheet1", 1, 2));
	    
	    WebElement chohotel = driver.findElement(By.name("hotels"));
	    jk.selectByVisibleText(chohotel, jk.getDataFromExcel("Sheet1", 1, 3));
	    
	    WebElement choroom = driver.findElement(By.name("room_type"));
	    jk.selectByVisibleText(choroom,jk.getDataFromExcel("Sheet1", 1, 4));
	    
	    WebElement numOfRooms = driver.findElement(By.name("room_nos"));
	    jk.selectByValue1(numOfRooms, jk.getDataFromExcel("Sheet1", 1, 5));
	    
	    WebElement dateIn = driver.findElement(By.name("datepick_in"));
	    jk.contextclick(dateIn).perform();
	    Robot t = new Robot();
	    t.keyPress(KeyEvent.VK_DOWN);
	    t.keyRelease(KeyEvent.VK_DOWN);
	    t.keyPress(KeyEvent.VK_DOWN);
        t.keyRelease(KeyEvent.VK_DOWN);
	    t.keyPress(KeyEvent.VK_DOWN);
	    t.keyRelease(KeyEvent.VK_DOWN);
	    t.keyPress(KeyEvent.VK_ENTER);
	    t.keyRelease(KeyEvent.VK_ENTER);
	    jk.inputValues(dateIn, jk.getDataFromExcel("Sheet1", 2, 0));
	    
	    WebElement dateOut = driver.findElement(By.name("datepick_out"));
	    jk.contextclick(dateOut).perform();
	    Robot robot1 = new Robot();
	    robot1.keyPress(KeyEvent.VK_DOWN);
	    robot1.keyRelease(KeyEvent.VK_DOWN);
	    robot1.keyPress(KeyEvent.VK_DOWN);
	    robot1.keyRelease(KeyEvent.VK_DOWN);
	    robot1.keyPress(KeyEvent.VK_DOWN);
	    robot1.keyRelease(KeyEvent.VK_DOWN);
	    robot1.keyPress(KeyEvent.VK_ENTER);
	    robot1.keyRelease(KeyEvent.VK_ENTER);
	    jk.inputValues(dateOut, jk.getDataFromExcel("Sheet1", 1, 7));
	    
}
}
