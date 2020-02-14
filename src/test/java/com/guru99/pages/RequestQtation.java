package com.guru99.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class RequestQtation {
	
	@FindBy(how = How.XPATH, using = "//li[@id='newquote']")
	WebElement requestQuote;
	
	@FindBy(how = How.XPATH, using = "//select[@id='quotation_breakdowncover']")
	WebElement bdc;
	
	@FindBy(how = How.XPATH, using = "//input[@id='quotation_windscreenrepair_t']")
	WebElement wsr;
	
	@FindBy(how = How.XPATH, using = "//input[@id='quotation_incidents']")
	WebElement incidents;

	@FindBy(how = How.XPATH, using = "//input[@id='quotation_vehicle_attributes_registration']")
	WebElement registration;
	
	@FindBy(how = How.XPATH, using = "//input[@id='quotation_vehicle_attributes_mileage']")
	WebElement annualmillage;

	@FindBy(how = How.XPATH, using = "//input[@id='quotation_vehicle_attributes_value']")
	WebElement estval;

	@FindBy(how = How.XPATH, using = "//*[@id='quotation_vehicle_attributes_parkinglocation']")
	WebElement pLoc;
	
	@FindBy(how = How.XPATH, using = "//select[@id='quotation_vehicle_attributes_policystart_1i']")
	WebElement year;
	
	@FindBy(how = How.XPATH, using = "//select[@id='quotation_vehicle_attributes_policystart_2i']")
	WebElement month;
	
	@FindBy(how = How.XPATH, using = "//select[@id='quotation_vehicle_attributes_policystart_3i']")
	WebElement day;
	
	@FindBy(how = How.XPATH, using = "//input[@id='resetquote']")
	WebElement reset;

	@FindBy(how = How.XPATH, using = "//input[@id='resetquote']/../input[1]")
	WebElement calpre;

	@FindBy(how = How.XPATH, using = "//input[@id='resetquote']//following::input[1]")
	WebElement saveQutation;

		public void bdc(){
			bdc.click();
			Select s=new Select(bdc);
			s.selectByVisibleText("Roadside");
		}
		public void pLoc(){
			pLoc.click();
			Select s=new Select(pLoc);
			s.selectByVisibleText("Locked Garage");
		}
		public void year(){
			year.click();
			Select s=new Select(year);
			s.selectByVisibleText("2024");
		}
		public void month(){
			month.click();
			Select s=new Select(month);
			s.selectByVisibleText("June");
		}
		public void day(){
			day.click();
			Select s=new Select(day);
			s.selectByVisibleText("17");
		}
		
		public void request_Quote(String incidents, String registration, String annualmillage, String estval){
			bdc();
			wsr.click();
			this.incidents.sendKeys(incidents);
			this.registration.sendKeys(registration);
			this.annualmillage.sendKeys(annualmillage);
			this.estval.sendKeys(estval);
			pLoc();
			year();
			month();
			day();
			reset.click();
			calpre.click();
			saveQutation.click();
		}
		
		

}
