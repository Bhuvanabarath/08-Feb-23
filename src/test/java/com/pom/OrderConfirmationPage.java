package com.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class OrderConfirmationPage extends BaseClass {
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	@CacheLookup
	@FindAll({@FindBy(xpath="//input[@id='order_no']"),@FindBy(id="order_no")})
	private WebElement orderID;
	
	public WebElement getOrderID() {
		return orderID;
	}
}
