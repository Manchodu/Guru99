package com.guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Login {
	
	@FindBy(how = How.XPATH, using = "//input[@id='email']")
	WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='password']")
	WebElement pwd;
	
	@FindBy(how = How.XPATH, using = "//input[@name='submit']")
	WebElement login;
	
		public void customer_login(String email, String pwd) {
		this.email.sendKeys(email);
		this.pwd.sendKeys(pwd);
		login.click();
	}

	
}
