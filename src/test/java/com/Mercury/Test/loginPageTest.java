package com.Mercury.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Mercury.BaseTest;
import com.Mercury.configReader;
import com.Mercury.Pages.LoginPage;



public class loginPageTest extends BaseTest {
	

	
	public WebDriver driver;
	public LoginPage loginpage;
	
	@BeforeTest
	public void setUp() throws IOException {
		driver = initializeDriver();
		driver.get(configReader.getConfig("url"));
		 loginpage = new LoginPage(driver);
		
	}
	
	@Test
	public void verifyLogin() throws Exception {
		loginpage.login(configReader.getConfig("username"),configReader.getConfig("password"));
		
	}
	
	@Test
	public void verifyLoginMessage() {
		String message = loginpage.LoginMsg();
		System.out.println(message);
		Assert.assertEquals(message,"Login Successfully");
	
		
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}
}
