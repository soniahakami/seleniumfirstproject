package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver",
				"/Users/soniasaber/Documents/selenium dependencies/drivers/chromedriver");
	
	WebDriver driver = new ChromeDriver();
	driver.get("http://www.ebay.com");
		
		System.setProperty("webdriver.gecko.driver",
				"/Users/soniasaber/Documents/selenium dependencies/drivers/geckodriver");
	
		WebDriver driver2 = new FirefoxDriver();
		
		driver2.get("http://www.amazon.com/");
	
		
		
	}
	
}
	