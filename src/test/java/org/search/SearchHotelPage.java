package org.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.test.Libgobal;

public class SearchHotelPage extends Libgobal{
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name = "location")
	private WebElement choloc;
	
	@FindBy(name = "hotels")
	private WebElement chohotel;
	
	@FindBy(name = "room_type")
	private WebElement choroom;
	
	@FindBy(name = "room_nos")
	private WebElement numOfRooms; 
	
	@FindBy (name = "datepick_in")
	private WebElement datePickIn;
	
	@FindBy (name = "datepick_out")
	private WebElement datePickOut;
	
	@FindBy (name = "adult_room")
	private WebElement adultRoom;
	
	@FindBy (name = "child_room")
	private WebElement childRoom;
	
	@FindBy(name = "Submit")
	private WebElement submit;

	public WebElement getCholoc() {
		return choloc;
	}

	public void setCholoc(WebElement choloc) {
		this.choloc = choloc;
	}

	public WebElement getChohotel() {
		return chohotel;
	}

	public void setChohotel(WebElement chohotel) {
		this.chohotel = chohotel;
	}

	public WebElement getChoroom() {
		return choroom;
	}

	public void setChoroom(WebElement choroom) {
		this.choroom = choroom;
	}

	public WebElement getNumOfRooms() {
		return numOfRooms;
	}

	public void setNumOfRooms(WebElement numOfRooms) {
		this.numOfRooms = numOfRooms;
	}

	public WebElement getDatePickIn() {
		return datePickIn;
	}

	public void setDatePickIn(WebElement datePickIn) {
		this.datePickIn = datePickIn;
	}

	public WebElement getDatePickOut() {
		return datePickOut;
	}

	public void setDatePickOut(WebElement datePickOut) {
		this.datePickOut = datePickOut;
	}

	public WebElement getAdultRoom() {
		return adultRoom;
	}

	public void setAdultRoom(WebElement adultRoom) {
		this.adultRoom = adultRoom;
	}

	public WebElement getChildRoom() {
		return childRoom;
	}

	public void setChildRoom(WebElement childRoom) {
		this.childRoom = childRoom;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public void setSubmit(WebElement submit) {
		this.submit = submit;
	}
	
	

}
