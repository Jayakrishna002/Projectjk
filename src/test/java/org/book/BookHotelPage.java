package org.book;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Libgobal;

public class BookHotelPage extends Libgobal{
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "first_name")
	private WebElement firstname;
	
	@FindBy (name ="last_name")
	private WebElement lastname;
	
	@FindBy(name ="address")
	private WebElement address;
	
	@FindBy(name ="cc_num")
	private WebElement cardNum;
	
	@FindBy (name = "cc_type")
	private WebElement cardType;
	
	@FindBy (name = "cc_exp_month")
	private WebElement month;
	
	@FindBy(name = "cc_exp_year")
	private WebElement year;
	
	@FindBy (name ="cc_cvv")
	private WebElement cvvnumber;
	
	@FindBy (name ="book_now")
	private WebElement booknow;
	
	@FindBy (name = "order_no")
	private WebElement ordernum;

	public WebElement getFirstname() {
		return firstname;
	}

	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public void setAddress(WebElement address) {
		this.address = address;
	}

	public WebElement getCardNum() {
		return cardNum;
	}

	public void setCardNum(WebElement cardNum) {
		this.cardNum = cardNum;
	}

	public WebElement getCardType() {
		return cardType;
	}

	public void setCardType(WebElement cardType) {
		this.cardType = cardType;
	}

	public WebElement getMonth() {
		return month;
	}

	public void setMonth(WebElement month) {
		this.month = month;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvvnumber() {
		return cvvnumber;
	}

	public void setCvvnumber(WebElement cvvnumber) {
		this.cvvnumber = cvvnumber;
	}

	public WebElement getBooknow() {
		return booknow;
	}

	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}

	public WebElement getOrdernum() {
		return ordernum;
	}

	public void setOrdernum(WebElement ordernum) {
		this.ordernum = ordernum;
	}

}
