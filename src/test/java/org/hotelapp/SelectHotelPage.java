package org.hotelapp;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {
	public SelectHotelPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement selectButton;
	@FindBy(id="continue")
	private WebElement continueButton;
	
	public WebElement getSelectButton() {
		return selectButton;
	}
	
	public WebElement getContinueButton() {
		return continueButton;
	}
	
}
