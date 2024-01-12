package org.hotelapp;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookedItineraryPage extends BaseClass{
	
	public BookedItineraryPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="ids[]")
	private WebElement cancelOrder;
	@FindBy(name="cancelall")
	private WebElement cancelButton;
	@FindBy(id="logout")
	private WebElement logOut;
	
	public WebElement getCancelOrder() {
		return cancelOrder;
	}
	
	public WebElement getCancelButton() {
		return cancelButton;
	}
	
	public WebElement getLogOut() {
		return logOut;
	}
	
	
}
