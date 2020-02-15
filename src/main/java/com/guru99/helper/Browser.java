package com.guru99.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {
	
	static WebDriver driver;
	public static WebDriver startBrowser(String browsername, String url) {
		
		if(browsername.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver","D:\\Java\\Projects\\Gearbox\\Drivers\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.chrome.driver","Drivers/geckodriver");
			driver=new FirefoxDriver();
		}
		driver.get(url);
		return driver;
		
	}

}
