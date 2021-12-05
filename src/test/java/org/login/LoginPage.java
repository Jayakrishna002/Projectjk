package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Libgobal;

public class LoginPage extends Libgobal {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement entUsername;
	
	@FindBy(id = "password")
	private WebElement entpass;
	
	@FindBy(id = "login")
	private WebElement btnlogin;

	public WebElement getEntUsername() {
		return entUsername;
	}

	public WebElement getEntpass() {
		return entpass;
	}

	public WebElement getBtnlogin() {
		return btnlogin;
	}

	public void setEntUsername(WebElement entUsername) {
		this.entUsername = entUsername;
	}


	
	
    
}
