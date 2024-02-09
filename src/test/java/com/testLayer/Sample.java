package com.testLayer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Sample {

	@Test
	public void launch() {
		// WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://stackoverflow.com/");

	}
}
