package com.projectclass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatePicker {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		driver.findElement(By.id("datepicker")).click();
		WebElement month = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']"));
		String text = month.getText();
		System.out.println(text);
				
		while(!(text.equals("June 2024")))
				{
				WebElement btnNext = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
				btnNext.click();
				text = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
				System.out.println(text);
				}
			
		driver.findElement(By.xpath("//a[text()='10']")).click();
		
	}

}
