package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
	
	WebDriver driver;
	By userName = By.name("uid");
	By password = By.name("passw");
	By login = By.name("btnSubmit");
	
	public Login(WebDriver driver) {
		this.driver = driver;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}
	public void setUserName(String userNameStr) {
		driver.findElement(userName).sendKeys(userNameStr);
	}
	public void setPassword(String passwordStr) {
		driver.findElement(password).sendKeys(passwordStr);
	}
	
	public void clickLogin() {
		driver.findElement(login).click();
	}
	
	public void login(String userNameStr,String passwordStr) {
		this.setUserName(userNameStr);
		this.setPassword(passwordStr);
		this.clickLogin();
	}
	
}
