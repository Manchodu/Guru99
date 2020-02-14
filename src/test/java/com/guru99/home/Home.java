package com.guru99.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.guru99.helper.*;
import com.guru99.pages.*;

public class Home {
	WebDriver driver;

	WebDriverWait wait;
	
	@Test(priority=1)
	public void register() throws Exception
	{
	// This will launch browser and specific url 
	WebDriver driver=Browser.startBrowser("chrome", "http://demo.guru99.com/");
	wait = new WebDriverWait(driver, 10);
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
	
	Register reg=PageFactory.initElements(driver, Register.class);
	Login l=PageFactory.initElements(driver, Login.class);
	Update u=PageFactory.initElements(driver, Update.class);
	RequestQtation rq=PageFactory.initElements(driver, RequestQtation.class);
	
	reg.cus_reg("Jeevan", "v", "7569999751", "madiwala", "bangalore", "India", "560036", "jeevan.icfi0@gmail.com", "Test@123", "Test@123");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='submit']")));
	l.customer_login("jeevan.icfi@gmail.com", "Test@123");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='editprofile']/a")));
	u.cus_update("Jeevan", "v", "7569999751", "madiwala", "bangalore", "India", "560036");
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='newquote']")));
	rq.request_Quote("Acci", "ap03k1234", "100000", "10000");
	
	}
}
