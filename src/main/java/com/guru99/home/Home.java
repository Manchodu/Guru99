package com.guru99.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;

import com.guru99.helper.*;
import com.guru99.pages.*;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Home {
	WebDriver driver;
	
	@BeforeClass()
	public void setup() throws Exception{
	
//	WebDriverManager.chromedriver().setup();
	// This will launch browser and specific url 
	WebDriver driver=Browser.startBrowser("chrome", "http://demo.guru99.com/");
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//a[contains(text(),'Insurance Project')]")).click();
	
	Register reg=PageFactory.initElements(driver, Register.class);
	Login l=PageFactory.initElements(driver, Login.class);
	Update u=PageFactory.initElements(driver, Update.class);
	RequestQtation rq=PageFactory.initElements(driver, RequestQtation.class);
	Read rd=PageFactory.initElements(driver, Read.class);
	Waits wt=PageFactory.initElements(driver, Waits.class);
	
	rd.openFile("D:\\Java\\Projects\\Guru99\\File\\Guru99_Insurance.xlsx", "Sheet1");
	rd.resetRowCounter(1);
		
//	String[] cells = rd.getNextRow();
//	customerRegister(reg, rd, cells);
//	customerLogin(l, rd);
//	cells = customerUpdate(u, rd);
////	cells = rd.getNextRow().toArray(new String[0]);
//	rq.request_Quote(cells[0], cells[1], cells[2], cells[3]);
	
	
	reg.cus_reg("Jeevan", "v", "7569999751", "madiwala", "bangalore", "India", "560036", "jeevan.icfi0@gmail.com", "Test@123", "Test@123");
	wt.elementToBeClickable("//*[@name='submit']");
	l.customer_login("jeevan.icfi@gmail.com", "Test@123");
	wt.elementToBeClickable("//li[@id='editprofile']/a");
	u.cus_update("Jeevan", "v", "7569999751", "madiwala", "bangalore", "India", "560036");
	wt.elementToBeClickable("//*[@id='newquote']");
	rq.request_Quote("Acci", "ap03k1234", "100000", "10000");
	
	}

//	private String[] customerUpdate(Update u, Read rd) {
//		String[] cells;
//		cells = rd.getNextRow();
//		u.cus_update(cells[0], cells[1], cells[2], cells[3], cells[4], cells[5], cells[6]);
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='newquote']")));
//		wt.elementToBeClickable("//*[@id='newquote']");
//		return cells;
//	}
//
//	private void customerLogin(Login l, Read rd) {
//		String[] cells;
//		cells = rd.getNextRow();
//		l.customer_login(cells[0], cells[1]);
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@id='editprofile']/a")));
//	}
//
//	private void customerRegister(Register reg, Read rd, String[] cells) throws Exception {
//		reg.cus_reg(cells[0], cells[1], cells[2], cells[3], cells[4], cells[5], cells[6], cells[7], cells[8], cells[9]);
//		cells = rd.getNextRow();
//		wt.elementToBeClickable("//*[@id='newquote']");
////		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@name='submit']")));
//	}
}
