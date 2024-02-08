package Org.JUnit;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;

public class AdactinHotelDB extends BaseClass{
	
	@Test
	public void tc01() {
		browserLaunch("chrome");
		launchUrl("http://adactinhotelapp.com/");
	
	}
	@Test
	public void tc02() {
		WebElement txtUserName = LocatingElement("id", "username");
		enterText(txtUserName, "BhuvanaM");
		WebElement txtPass = LocatingElement("id", "password");
		enterText(txtPass, "827E8V");
		WebElement btnLogin = LocatingElement("id", "login");
		btnClick(btnLogin);
	}
}
