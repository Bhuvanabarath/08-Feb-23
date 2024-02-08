package com.university;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();

		WebElement fromTextBox = driver.findElement(By.id("src"));
		fromTextBox.sendKeys("Chennai");

		WebElement toTextBox = driver.findElement(By.id("dest"));
		toTextBox.sendKeys("Madurai");

		WebElement dateTextBox = driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']"));
		dateTextBox.click();
		
		dateTextBox.sendKeys("24-NOV-2023");
		
//		driver.findElement(By.xpath("//text[text()='24 Nov']")).click();
		

		

		WebElement searchButton = driver.findElement(By.id("search_button"));
		searchButton.click();

	}
}
