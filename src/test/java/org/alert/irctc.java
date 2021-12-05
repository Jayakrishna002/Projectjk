package org.alert;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.test.Libgobal;

import io.github.bonigarcia.wdm.WebDriverManager;

public class irctc {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("//button[text()='OK']")).click();
		
		
	     for(WebElement test:driver.findElements(By.xpath("(//input[@aria-autocomplete='list'])[1]"))){
	    	 System.out.println(test.getText());
	     }
		
//		driver.quit();
	}

}
