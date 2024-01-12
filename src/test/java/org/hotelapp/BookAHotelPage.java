package org.hotelapp;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookAHotelPage extends BaseClass {
	
	public BookAHotelPage(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="first_name")
	private WebElement firstName;
	@FindBy(name="last_name")
	private WebElement lastName;
	@FindBy(name="address")
	private WebElement address;
	@FindBy(id="cc_num")
	private WebElement creditCardNo;
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	@FindBy(name="cc_exp_month")
	private WebElement expDateMonth;
	@FindBy(name="cc_exp_year")
	private WebElement expDateYear;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bookNow;
	
	public WebElement getFirstName() {
		return firstName;
	}
	
	public WebElement getLastName() {
		return lastName;
	}
	
	public WebElement getAddress() {
		return address;
	}
	
	public WebElement getCreditCardNo() {
		return creditCardNo;
	}
	
	public WebElement getCreditCardType() {
		return creditCardType;
	}
	
	public WebElement getExpDateMonth() {
		return expDateMonth;
	}
	
	public WebElement getExpDateYear() {
		return expDateYear;
	}
	
	public WebElement getCvv() {
		return cvv;
	}
	
	public WebElement getBookNow() {
		return bookNow;
	}
	
	
}


