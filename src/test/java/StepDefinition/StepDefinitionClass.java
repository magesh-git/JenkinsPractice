package StepDefinition;

import java.io.IOException;

import org.hotelapp.BaseClass;
import org.hotelapp.BookAHotelPage;
import org.hotelapp.BookingConfirmationPage;
import org.hotelapp.LoginPage;
import org.hotelapp.SearchHotelPage;
import org.hotelapp.SelectHotelPage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionClass extends BaseClass {
	
	@Given("User navigates to Adactin application {string}")
	public void user_navigates_to_adactin_application(String string) throws IOException {
		driver.get(string);
	}
	@When("User enters the valid username and password in the corresponding fields")
	public void user_enters_the_valid_username_and_password_in_the_corresponding_fields() {
		LoginPage lp = new LoginPage();
		WebElement username = lp.getUsername();
		WebElement password = lp.getPassword();
		sendKeys(username, "Kumaresan123");
		sendKeys(password, "4C5014");
	}
	@When("User clicks on the login button")
	public void user_clicks_on_the_login_button() {
		LoginPage lp = new LoginPage();
		WebElement loginButton = lp.getLoginButton();
		click(loginButton);
	}
	@When("User enters the details of location, hotels, room type, Number of Rooms, Check In Date, Check Out Date, Adults per Room and Children per Room")
	public void user_enters_the_details_of_location_hotels_room_type_number_of_rooms_check_in_date_check_out_date_adults_per_room_and_children_per_room() {
		SearchHotelPage shp = new SearchHotelPage();
		WebElement location = shp.getLocation();
		WebElement hotels = shp.getHotels();
		WebElement roomType = shp.getRoomType();
		WebElement noOfRooms = shp.getNoOfRooms();
		WebElement checkIn = shp.getCheckIn();
		WebElement checkOut = shp.getCheckOut();
		WebElement adults = shp.getAdults();
		WebElement children = shp.getChildren();
		select(location, "Melbourne");
		select(hotels, "Hotel Cornice");
		select(roomType, "Deluxe");
		select(noOfRooms, "4");
		checkIn.clear();
		sendKeys(checkIn, "10/01/2024");
		sendKeys(checkOut, "12/01/2024");
		select(adults, "2");
		select(children, "2");
	}
	@When("User clicks the search button")
	public void user_clicks_the_search_button() {
		SearchHotelPage shp = new SearchHotelPage();
		WebElement search = shp.getSearch();
		click(search);
	}
	@When("User selects the hotel")
	public void user_selects_the_hotel() {
		SelectHotelPage sh = new SelectHotelPage();
		WebElement selectButton = sh.getSelectButton();
		click(selectButton);
	}
	@When("User clicks on continue button")
	public void user_clicks_on_continue_button() {
		SelectHotelPage sh = new SelectHotelPage();
		WebElement continueButton = sh.getContinueButton();
		click(continueButton);
	}
	@When("User enters the details of First Name, Last Name, Billing Address, Credit Card No, Credit Card Type, Expiry Date month, Expiry Date year, CVV Number and clicks the Booknow button")
	public void user_enters_the_details_of_first_name_last_name_billing_address_credit_card_no_credit_card_type_expiry_date_month_expiry_date_year_cvv_number_and_clicks_the_booknow_button() {
		BookAHotelPage bah = new BookAHotelPage();
		WebElement firstName = bah.getFirstName();
		WebElement lastName = bah.getLastName();
		WebElement address = bah.getAddress();
		WebElement creditCardNo = bah.getCreditCardNo();
		WebElement creditCardType = bah.getCreditCardType();
		WebElement expDateMonth = bah.getExpDateMonth();
		WebElement expDateYear = bah.getExpDateYear();
		WebElement cvv = bah.getCvv();
		WebElement bookNow = bah.getBookNow();
		sendKeys(firstName, "Kumaresan");
		sendKeys(lastName, "NS");
		sendKeys(address, "Bangalore");
		sendKeys(creditCardNo, "1234567891234567");
		select(creditCardType,"VISA");
		select(expDateMonth, "2");
		select(expDateYear, "2025");
		sendKeys(cvv, "1234");
		click(bookNow);
	}
	@Then("User clicks on My itinerary button")
	public void user_clicks_on_my_itinerary_button() {
		BookingConfirmationPage bcp = new BookingConfirmationPage();
		WebElement itinerary = bcp.getItinerary();
		waits();
		//Assert.assertTrue(false);
		click(itinerary);
		
	}
	




}
