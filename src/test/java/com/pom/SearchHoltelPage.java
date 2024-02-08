package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchHoltelPage extends BaseClass{
		public SearchHoltelPage() {
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(id = "location")
		private WebElement location;
		@FindBy(id = "hotels")
		private WebElement hotels;
		@FindBy(id = "room_type")
		private WebElement roomType;
		@FindBy(id = "room_nos")
		private WebElement roomNos;
		@FindBy(id = "datepick_in")
		private WebElement checkindate;
		@FindBy(id = "datepick_out")
		private WebElement checkoutdate;
		@FindBy(id = "adult_room")
		private WebElement adultPerRoom;
		@FindBy(id = "child_room")
		private WebElement childPerRoom;
		@FindBy(id = "Submit")
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

		public WebElement getRoomNos() {
			return roomNos;
		}

		public WebElement getCheckindate() {
			return checkindate;
		}

		public WebElement getCheckoutdate() {
			return checkoutdate;
		}

		public WebElement getAdultPerRoom() {
			return adultPerRoom;
		}

		public WebElement getChildPerRoom() {
			return childPerRoom;
		}

		public WebElement getSearch() {
			return search;
		}
		
}
