package org.tcs.baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	public static WebDriver driver;
	
	public static void browserlaunch() {
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\HP 15\\Desktop\\Documents\\Selenium JAR\\Chrome\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
}
