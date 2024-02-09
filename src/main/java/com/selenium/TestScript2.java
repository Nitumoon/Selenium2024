package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestScript2 {

	public static void main(String args[]) {

		// set Property
		System.getProperty("webdriver.edge.driver", "./user.dir" + "msedgedriver.exe");

		// create object of webdriver
		WebDriver driver = new EdgeDriver();
		System.out.println("object creation sucessfull");

		// maximize window
		driver.manage().window().maximize();
		System.out.println("Maximize window sucessfull");

		// open url
		driver.get("https://www.google.com");
		System.out.println("Url open sucessfull");

		// navigate to other webpage
		driver.navigate().to("https://www.makemytrip.com/");
		System.out.println("navigate sucessfull");

		// jump to previous page
		driver.navigate().forward();
		System.out.println("forword navigate sucessfull");

		// back to previous page
		driver.navigate().back();
		System.out.println("Back to prevoius page sucessfull");

		// refresh page
		driver.navigate().refresh();
		System.out.println("page refresh sucessfull");

		// close page
		driver.close();
		System.out.println("close webPage sucessfull");
	}

}
