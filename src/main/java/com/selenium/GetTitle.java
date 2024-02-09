package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GetTitle {

	public void getTitle() {

		// set path
		System.getProperty("webdriver.edge.driver", "./user.dir" + "msedgedriver.exe");

		// create object of webDriver
		WebDriver driver = new EdgeDriver();

		// maximize window
		driver.manage().window().maximize();

		// open url
		driver.get("https://www.jiocinema.com/");

		// get title of webpage
		String title = driver.getTitle();

		// print Title
		System.out.println("Page title is :" + title);

		// close page
		driver.close();

	}

	public static void main(String[] args) {
		// create object of class
		GetTitle gt = new GetTitle();
		gt.getTitle();

	}

}
