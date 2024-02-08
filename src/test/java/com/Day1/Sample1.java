package com.Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		WebElement btnClink = driver.findElement(By.xpath("//a[text()='Conditions of Use & Sale']"));
//		WebElement btnClink1 = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
//		js.executeScript("argument[0].scrollIntoView(true)", btnClink);
//		btnClink.click();
		js.executeScript("argument[0].scrollIntoView();", btnClink);
			
//		Actions a=new Actions(driver);
//		a.moveToElement(target);
//		a.doubleClick();
//		a.contextClick();

		
		
			
	}

}
