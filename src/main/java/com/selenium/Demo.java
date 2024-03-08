package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
	public static void main(String[] args) {
//		// set path require
//		WebDriverManager.edgedriver().setup();
//		EdgeOptions co = new EdgeOptions();
//		co.addArguments("--remote-allow-origins=*");
//
//		// create object of chromedriver
//		WebDriver driver = new EdgeDriver(co);
//		// maximize window

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		// open webpage
		driver.get("https://www.selenium.dev/downloads/");
	}

}
