package Day1;

import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pom.AdactinLoginpage;
import com.pom.BookHotelPage;
import com.pom.OrderConfirmationPage;
import com.pom.SearchHoltelPage;
import com.pom.SelectHotelPage;

public class AdactinHotel extends BaseClass {

	public static void main(String[] args) {
		browserLaunch("chrome");
		launchUrl("http://adactinhotelapp.com/");

		AdactinLoginpage a = new AdactinLoginpage();
		WebElement username = a.getUsername();
		enterText(username, "BhuvanaM");

		WebElement password = a.getPassword();
		enterText(password, "827E8V");

		WebElement login = a.getLogin();
		btnClick(login);

		SearchHoltelPage s = new SearchHoltelPage();
		WebElement location = s.getLocation();
		selectByIndex(location, 8);

		WebElement hotels = s.getHotels();
		selectByValue(hotels, "Hotel Sunshine");

		WebElement roomType = s.getRoomType();
		selectByText(roomType, "Deluxe");

		WebElement roomNos = s.getRoomNos();
		selectByIndex(roomNos, 1);

		WebElement checkindate = s.getCheckindate();
		enterText(checkindate, "08/08/2023");

		WebElement checkoutdate = s.getCheckoutdate();
		enterText(checkoutdate, "09/08/2023");

		WebElement adultPerRoom = s.getAdultPerRoom();
		selectByIndex(adultPerRoom, 1);

		WebElement childPerRoom = s.getChildPerRoom();
		selectByIndex(childPerRoom, 0);

		WebElement search = s.getSearch();
		btnClick(search);

		SelectHotelPage s1 = new SelectHotelPage();

		WebElement select = s1.getSelect();
		btnClick(select);

		WebElement continue1 = s1.getContinue();
		btnClick(continue1);

		BookHotelPage b = new BookHotelPage();
		WebElement firstName = b.getFirstName();
		enterText(firstName, "Bhuvana");

		WebElement lastName = b.getLastName();
		enterText(lastName, "Barath");

		WebElement address = b.getAddress();
		enterText(address, "Chennai");

		WebElement ccno = b.getCcno();
		enterText(ccno, "1234123412341234");
		WebElement cctype = b.getCctype();
		selectByIndex(cctype, 2);
		WebElement expmonth = b.getExpmonth();
		selectByIndex(expmonth, 10);
		
		WebElement expyear = b.getExpyear();
		selectByIndex(expyear, 15);
		
		WebElement ccvno = b.getCcvno();
		enterText(ccvno, "372");
		
		WebElement booknow = b.getBooknow();
		btnClick(booknow);
		
		OrderConfirmationPage o=new OrderConfirmationPage();
		WebElement orderID = o.getOrderID();
		String value = getAttributeValue(orderID);
		System.out.println("Order confrimation id: "+value);
		
	}
}
