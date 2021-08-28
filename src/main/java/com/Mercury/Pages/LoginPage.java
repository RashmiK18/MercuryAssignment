package com.Mercury.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(name="userName")
	private WebElement username;
	@FindBy(name ="password")
	private WebElement passwordInput;
	@FindBy(name="submit")
	private WebElement submitButton;
	@FindBy(xpath="//h3[text()='Login Successfully']")
	private WebElement loginText;
	
	public void login(String userName, String password) throws Exception {
		username.sendKeys(userName);
		passwordInput.sendKeys(password);
		
		submitButton.click();
		Thread.sleep(4000);
	}
	public String LoginMsg() {
		return loginText.getText();
	}
	
	
	
	
	
	
}
