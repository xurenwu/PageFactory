package com.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	WebDriver driver;
	By titleText = By.xpath("//*[@id=\"_ctl0__ctl0_Content_Main_promo\"]/table/tbody/tr[1]/td/h2");
	
	public HomePage() {}
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String titleText () {
		return	driver.findElement(titleText).getText();
	}
}
