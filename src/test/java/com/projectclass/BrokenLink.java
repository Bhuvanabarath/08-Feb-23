package com.projectclass;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLink {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.facebook.com/");
		List<WebElement> ele = driver.findElements(By.tagName("a"));	
		System.out.println(ele.size());
		for (int i = 0; i < ele.size(); i++) {
			System.out.println(ele.get(i).getAttribute("href"));
		}                                                                                                      
//		int count=0;
//		for(int i=0;i<ele.size();i++)
//		{
//			WebElement webElement = ele.get(i);
//			String name = webElement.getAttribute("href");
//			URL url=new URL(name);
//			URLConnection con = url.openConnection();
//			HttpURLConnection c=(HttpURLConnection)con;
//			int responseCode = c.getResponseCode();
//			if (responseCode!=200) {
//				System.out.println("BorkenLink: "+name);
//				count++;
//			}
//			
//		}
//		System.out.println("Total no.of Broken link: " +count);
	}
}
