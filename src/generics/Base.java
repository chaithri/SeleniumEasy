package generics;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base {
	
	public WebDriver driver(String browser) {
		WebDriver driver;
		switch(browser.toLowerCase()) {
		case "chrome": 
			System.setProperty("webdriver.chrome.driver","D://Selenium//BrowserDrivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			driver = new FirefoxDriver();
			break;
		default: 	
			System.setProperty("webdriver.chrome.driver","D://Selenium//BrowserDrivers//chromedriver.exe");
			driver = new ChromeDriver();
			break;
		}
		return driver;
	}
	
	public void launchSite() {
		
		
	}
	

}
