package com.selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CarListName {

//	public void carName() {
//		//create object of class
//		WebDriver driver = new ChromeDriver();
//
//	}

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("file:///C:/Users/nites/OneDrive/Desktop/carr.html");

		List<WebElement> carElements = driver.findElements(By.className("cars"));

		List<String> lessThanThreeChars = new ArrayList<>();
		List<String> moreThanThreeChars = new ArrayList<>();

		for (WebElement carElement : carElements) {
			System.out.println(carElement);
			String carName = carElement.getText().trim();
			if (carName.length() <= 3) {
				lessThanThreeChars.add(carName);
			} else {
				moreThanThreeChars.add(carName);
			}
		}

		System.out.println("Cars with names less than 3 characters:");
		for (String car : lessThanThreeChars) {
			System.out.println(car);
		}

		System.out.println("\nCars with names more than 3 characters:");
		for (String car : moreThanThreeChars) {
			System.out.println(car);
		}

		driver.close();
	}
}
