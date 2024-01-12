package org.hotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingConfirmationPage extends BaseClass{
	
	public BookingConfirmationPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="my_itinerary")
	private WebElement itinerary;
	
	public WebElement getItinerary() {
		return itinerary;
	}
	
	
}
