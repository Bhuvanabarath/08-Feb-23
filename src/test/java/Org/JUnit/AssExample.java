package Org.JUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class AssExample {
static WebDriver driver;

@Test
public void tc01() {
	WebDriverManager.chromedriver().setup();
	driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement txtuser = driver.findElement(By.id("email"));
	txtuser.sendKeys("bhuvana");
	String username = txtuser.getAttribute("value");
	Assert.assertEquals("validate username", "bhuvana",username );

	
	
}
}
