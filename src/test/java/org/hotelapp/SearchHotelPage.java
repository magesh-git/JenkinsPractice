package org.hotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotelPage extends BaseClass {
	public SearchHotelPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(name="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement noOfRooms;
	@FindBy(name="datepick_in")
	private WebElement checkIn;
	@FindBy(name="datepick_out")
	private WebElement checkOut;
	@FindBy(name="adult_room")
	private WebElement adults;
	@FindBy(name="child_room")
	private WebElement children;	
	@FindBy(id="Submit")
	private WebElement search;
	
	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoomType() {
		return roomType;
	}

	public WebElement getNoOfRooms() {
		return noOfRooms;
	}

	public WebElement getCheckIn() {
		return checkIn;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}

	public WebElement getAdults() {
		return adults;
	}

	public WebElement getChildren() {
		return children;
	}

	public WebElement getSearch() {
		return search;
	}

}
