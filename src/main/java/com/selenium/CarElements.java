package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CarElements {

	// create method
	public void java() {

		// create object of WebDrivr
		WebDriver driver = new EdgeDriver();

		// open url
		driver.get("file:///C:/Users/nites/OneDrive/Desktop/carr.html");

		// find the list of elements on webpage
		List<WebElement> carElement = driver.findElements(By.className("cars"));

		// store the list of elements in list
		List<String> lessThanThreeCharacter = new ArrayList<>();
		List<String> greaterThanThreeCharacter = new ArrayList<>();

		// use for each loop
		for (WebElement e : carElement) {

			// get the car element name and trim
			String carName = e.getText().trim();

			// check the cars characters length
			if (carName.length() < 3) {
				lessThanThreeCharacter.add(carName);
			} else {

				greaterThanThreeCharacter.add(carName);
			}

		}
		System.out.println("\n Cars with names less than 3 characters : ");
		// get the names for cars with less than 3 charsname
		for (String car : lessThanThreeCharacter) {
			System.out.println(car);
		}

		System.out.println("\n Cars with names more than 3 characters : ");
		// get the names for cars with less than 3 charsname

		for (String car : greaterThanThreeCharacter) {
			System.out.println(car);
		}
		// close webpage
		driver.close();

	}

	// write main method
	public static void main(String args[]) {

		// create object class
		CarElements sel = new CarElements();

		// call method
		sel.java();

	}

}
