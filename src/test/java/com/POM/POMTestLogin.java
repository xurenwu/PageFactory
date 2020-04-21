package com.POM;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class POMTestLogin {
	
	private static WebDriver driver;
	private static HomePage objHomePages;
	private static Login objLogin;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.setProperty("webdriver.chrome.driver", "E:/tools/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://www.testfire.net/login.jsp");
	}

	@Test
	public void test_home_page() {
		objHomePages = new HomePage(driver); 
		objLogin = new Login(driver);
		objLogin.login("admin","admin");
		System.out.println(objHomePages.titleText());
		assertEquals(objHomePages.titleText(), "Congratulations!");
	}

}
