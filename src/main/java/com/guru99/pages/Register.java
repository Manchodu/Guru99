package com.guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Register {
	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Register')]")
	WebElement register;
	
	@FindBy(how = How.XPATH, using = "//select[@id='user_title']")
	WebElement gender;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_firstname']")
	WebElement fname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_surname']")
	WebElement sname;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_phone']")
	WebElement uphone;
	
	@FindBy(how = How.XPATH, using = "//select[@id='user_dateofbirth_1i']")
	WebElement year;
	
	@FindBy(how = How.XPATH, using = "//select[@id='user_dateofbirth_2i']")
	WebElement mon;
	
	@FindBy(how = How.XPATH, using = "//select[@id='user_dateofbirth_3i']")
	WebElement day;
	
	@FindBy(how = How.XPATH, using = "//input[@id='licencetype_f']")
	WebElement ltype;

	@FindBy(how = How.XPATH, using = "//select[@id='user_licenceperiod']")
	WebElement duration;
	
	@FindBy(how = How.XPATH, using = "//select[@id='user_occupation_id']")
	WebElement occu;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_address_attributes_street']")
	WebElement addr1;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_address_attributes_city']")
	WebElement city;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_address_attributes_county']")
	WebElement country;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_address_attributes_postcode']")
	WebElement pcode;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_user_detail_attributes_email']")
	WebElement email;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_user_detail_attributes_password']")
	WebElement pwd;
	
	@FindBy(how = How.XPATH, using = "//input[@id='user_user_detail_attributes_password_confirmation']")
	WebElement cpwd;
	
	@FindBy(how = How.XPATH, using = "//input[@id='resetform']")
	WebElement reset;
	
	@FindBy(how = How.XPATH, using = "//input[@id='resetform']/following::input")
	WebElement create;
	
	public  void gender() {
	      Select s = new Select(gender);
	      s.selectByVisibleText("Mrs");  
	}
	
	public  void year() {
		year.click();
		WebElement yer=year;
	      Select s = new Select(yer);
	      s.selectByVisibleText("1940");
	}
	public  void mon() {
		mon.click();
		WebElement month=mon;
	      Select s = new Select(month);
	      s.selectByVisibleText("June");
	}
	public  void day() {
		day.click();
		WebElement day1=day;
	      Select s = new Select(day1);
	      s.selectByVisibleText("17");
	}
	public  void duration() {
	      Select s = new Select(duration);
	      s.selectByVisibleText("5");  
	}
	public  void occu() {
	      Select s = new Select(occu);
	      s.selectByVisibleText("Engineer");  
	}
	
	public void cus_reg(String fname, String sname, String uphone, String addr1, String city,
						String country, String pcode, String email, String pwd, String cpwd) throws Exception {
		register.click();
		gender();
		this.fname.sendKeys(fname);
		this.sname.sendKeys(sname);
		this.uphone.sendKeys(uphone);
		year();
		mon();
		day();
		ltype.click();
		duration();
		occu();
		this.addr1.sendKeys(addr1);
		this.city.sendKeys(city);
		this.country.sendKeys(country);
		this.pcode.sendKeys(pcode);
		this.email.sendKeys(email);
		this.pwd.sendKeys(pwd);
		this.cpwd.sendKeys(cpwd);
//		reset.click();
		create.click();
	}


}
