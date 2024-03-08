package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GuestRegistrationForm {
	public static void form() {
		// create object of webDriver
		WebDriver driver = new EdgeDriver();

		// open url
		driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");

		// maximize the window
		driver.manage().window().maximize();

		// find element of first name
		driver.findElement(By.id("first_name")).sendKeys("Nitesh");

		// find elements for last name
		driver.findElement(By.id("last_name")).sendKeys("Moon");

		// email
		driver.findElement(By.id("user_email")).sendKeys("adnin@gmail.com");

		// password
		driver.findElement(By.id("user_pass")).sendKeys("Admin@123");

		// gender
		driver.findElement(By.xpath("(//input[@data-id='radio_1665627729'])[1]")).click();

		// Date of birth
		driver.findElement(By.xpath("(//input[contains(@class,'ur-flatpickr-field regular-text')])[1]"))
				.sendKeys("1-1-2003");
		// nationality
		driver.findElement(By.xpath("//input[@data-id='input_box_1665629217']")).sendKeys("Indian");

		// phone
		driver.findElement(By.xpath("//input[@data-id='phone_1665627880']")).sendKeys("9373941282");

		// country
		driver.findElement(By.xpath("//option[text()='India']")).click();
		driver.findElement(By.xpath("//input[@data-id='phone_1665627865']")).sendKeys("9023456122");
		driver.findElement(By.xpath("(//input[@data-id='date_box_1665629845'])[1]")).sendKeys("4-3-2024");
		driver.findElement(By.xpath("//input[@data-id='number_box_1665629930']")).sendKeys("2");
		driver.findElement(By.xpath("//input[@data-id='input_box_1665630010']")).sendKeys("101");
		driver.findElement(By.tagName("textarea")).sendKeys("Student");
		driver.findElement(By.xpath("(//input[@data-id='radio_1665627931'])[1]")).click();
		driver.findElement(By.xpath("(//input[@data-id='radio_1665627997'])[1]")).click();
		driver.findElement(By.xpath("(//input[@data-id='radio_1665628131'])[2]")).click();
		driver.findElement(By.xpath("//select[@data-id='select_1665628361']")).click();
		driver.findElement(By.xpath("//option[text()='Town Hall']")).click();
		driver.findElement(By.xpath("//input[@data-label='Terms and Conditions']")).click();
		driver.findElement(By.xpath("//button[text()[normalize-space()='Submit']]")).click();

		System.out.println("submitted successfully");

		driver.close();

	}

	public static void main(String[] args) {
		// craete object of class
		GuestRegistrationForm g = new GuestRegistrationForm();
		g.form();

	}

}
