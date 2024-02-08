package Org.JUnit;


import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.base.BaseClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AdactinHotel extends BaseClass{
	static WebDriver driver;
	
	@BeforeClass
	public static void beforeClass() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		driver.manage().window().maximize();
		driver.get("http://adactinhotelapp.com/");
		
	}
	
	@Before
	public void before() {
		Date d=new Date();
		System.out.println(d);
	}
	
	@Test
	public void tc01() throws IOException {
		
		String userName = getDateFromExcel("Adactin", 0, 1);
		driver.findElement(By.id("username")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(getDateFromExcel("Adactin", 1, 1));
		driver.findElement(By.id("login")).click();
	
	}
	
	@Test
	public void tc02() throws IOException {
		driver.findElement(By.id("location")).sendKeys(getDateFromExcel("Adactin", 2, 1));
		driver.findElement(By.id("hotels")).sendKeys(getDateFromExcel("Adactin", 3, 1));
		driver.findElement(By.id("room_type")).sendKeys(getDateFromExcel("Adactin", 4, 3));
		driver.findElement(By.id("room_nos")).sendKeys(getDateFromExcel("Adactin", 5, 1));
		driver.findElement(By.id("datepick_in")).sendKeys(getDateFromExcel("Adactin", 6, 1));
		driver.findElement(By.id("datepick_out")).sendKeys(getDateFromExcel("Adactin", 7, 1));
		driver.findElement(By.id("adult_room")).sendKeys(getDateFromExcel("Adactin", 8, 1));
		driver.findElement(By.id("child_room")).sendKeys(getDateFromExcel("Adactin", 9, 1));
		driver.findElement(By.id("Submit")).click();
	}
	
	@Test
	public void tc03() {
		driver.findElement(By.id("radiobutton_0")).click();
		driver.findElement(By.id("continue")).click();
	}
	
	@Test
	public void tc04() throws IOException {
		driver.findElement(By.id("first_name")).sendKeys(getDateFromExcel("Adactin", 10, 1));
		driver.findElement(By.id("last_name")).sendKeys(getDateFromExcel("Adactin", 11, 1));
		driver.findElement(By.id("address")).sendKeys(getDateFromExcel("Adactin", 12, 1));
		driver.findElement(By.id("cc_num")).sendKeys(getDateFromExcel("Adactin", 13, 1));
		driver.findElement(By.id("cc_type")).sendKeys(getDateFromExcel("Adactin", 14, 2));
		driver.findElement(By.id("cc_exp_month")).sendKeys(getDateFromExcel("Adactin", 15, 1));
		driver.findElement(By.id("cc_exp_year")).sendKeys(getDateFromExcel("Adactin", 15, 2));
		driver.findElement(By.id("cc_cvv")).sendKeys(getDateFromExcel("Adactin", 16, 1));
		driver.findElement(By.id("book_now")).click();
	}
	
	@Test
	public void tc05()   {
		WebElement conf = driver.findElement(By.xpath("//td[text()='Booking Confirmation ']"));
		System.out.println(conf.getText());
		
		WebElement orderID = driver.findElement(By.xpath("//input[@id='order_no']"));
		String attribute = orderID.getAttribute("value");
		System.out.println(attribute);
		System.out.println("Order Done!!");
	}
	
	@After
	public void after() {
		Date d=new Date();
		System.out.println(d);
	}
	
	
}
