package com.Mercury.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightDetailPage {

public WebDriver driver;
	
	public FlightDetailPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy (linkText="Flights")
	private WebElement flight;
	@FindBy (name="fromPort")
	private WebElement departureCity;
	@FindBy (name="toPort")
	private WebElement arrivalCity;
	@FindBy (name="passCount")
	private WebElement noOfPassangers;
	@FindBy (xpath="//input[@value='Business']")
	private WebElement serviceClass;
	@FindBy (xpath="//input[@value='oneway']")
	private WebElement Type;
	private WebElement WebElement;


public void clickOnFlight() {
	flight.click();
}


public String depaturingPort() {
	Select select = new Select(departureCity) ;
	select.selectByVisibleText("London");
	WebElement DepCity = select.getFirstSelectedOption();
	return DepCity.getText();
		}

public String arrivalPort() {
	Select select =new Select(arrivalCity);
	select.selectByVisibleText("New York");
	WebElement cityName = select.getFirstSelectedOption();
	 String arrivalcity = cityName.getText();
	
	return arrivalcity;
}

public String passangerCount() {
	Select select =new Select(noOfPassangers);
	select.selectByVisibleText("2");
	WebElement noOfPassanger= select.getFirstSelectedOption();
	return noOfPassanger.getText();
}
public String serviceClassSelection() {
	Select select1 = new Select(serviceClass);
	select1.selectByVisibleText("Business class");
	WebElement serviceClass= select1.getFirstSelectedOption();
	return serviceClass.getText();
}
public void Trip() {
	Select select2= new Select (Type);
	select2.selectByVisibleText("oneway");
}
}
