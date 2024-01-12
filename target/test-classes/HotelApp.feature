Feature: HotelApp EndtoEnd functionality

Scenario: To validate the entire scenario
Given User navigates to Adactin application "https://adactinhotelapp.com/"
When User enters the valid username and password in the corresponding fields
And User clicks on the login button
When User enters the details of location, hotels, room type, Number of Rooms, Check In Date, Check Out Date, Adults per Room and Children per Room
And User clicks the search button
When User selects the hotel
And User clicks on continue button
When User enters the details of First Name, Last Name, Billing Address, Credit Card No, Credit Card Type, Expiry Date month, Expiry Date year, CVV Number and clicks the Booknow button
Then User clicks on My itinerary button



