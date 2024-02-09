package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// set pah required
		System.setProperty("webdriver.edge.driver", "D:\\Automation_Libraries-&-Driver\\Edge 120\\msedgedriver.exe");

		// create Object of webdriver
		WebDriver driver = new EdgeDriver();

		// maximixe window
		driver.manage().window().maximize();

		// open Webpage
		driver.get("https://developer.microsoft.com/");

		// wait for 2 seconds
		Thread.sleep(2000);

		// close window
		driver.close();
		System.out.println("close window");

	}

}
