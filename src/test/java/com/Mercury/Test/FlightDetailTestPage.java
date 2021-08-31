package com.Mercury.Test;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mercury.BaseTest;
import com.Mercury.configReader;
import com.Mercury.Pages.FlightDetailPage;
import com.Mercury.Pages.LoginPage;

public class FlightDetailTestPage extends BaseTest {

	public WebDriver driver;
	public LoginPage loginpage;
	public FlightDetailPage flightDetail;
	
	@BeforeTest
	public void setUp() throws IOException {
		driver = initializeDriver();
		driver.get(configReader.getConfig("url"));
		 loginpage = new LoginPage(driver);
		flightDetail =new FlightDetailPage(driver);
	}
	@Test(priority=1)
	public void verifyFlightButton() {
		flightDetail.clickOnFlight();
		
	}
	@Test(priority=2)
	public void verifydepatureCity() {
		String deptcity= flightDetail.depaturingPort();
		Assert.assertEquals(deptcity,"London");
	}
	@Test(priority=3)
	public void verifyFlightDetail() {
		
		String city= flightDetail.arrivalPort();
		Assert.assertEquals(city,"New York");
		System.out.println("Right Selection");
		
	}
	@Test(priority =4)
	public void verifyPassangerCount() {
		String no = flightDetail.passangerCount();
		Assert.assertEquals(no,"2");
		System.out.println("passanger's count verified");
		
	}
	@Test(priority =5)
	public void classPreference() {
		String choice=flightDetail.serviceClassSelection();
		Assert.assertEquals(choice,"Business class");
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
