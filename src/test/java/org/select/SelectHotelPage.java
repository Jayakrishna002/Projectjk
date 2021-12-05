package org.select;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Libgobal;

public class SelectHotelPage extends Libgobal{
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@type='radio']")
	private WebElement click;
	
	@FindBy (name = "continue")
	private WebElement cotinue;

	public WebElement getClick() {
		return click;
	}

	public void setClick(WebElement click) {
		this.click = click;
	}

	public WebElement getCotinue() {
		return cotinue;
	}

	public void setCotinue(WebElement cotinue) {
		this.cotinue = cotinue;
	}
	
	

}
