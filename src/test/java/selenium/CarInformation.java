package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CarInformation {

	// create method for carData
	public void carData() {
		// create object of webdriver interface
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("//specify url as per your choice");// <-----specify url as per your choice

		// maximize window
		driver.manage().window().maximize();

		// find car className webElements
		List<WebElement> carClassNameList = driver.findElements(By.className("cars"));

		// get the size of car className
		System.out.println("size of car className : " + carClassNameList.size());
		System.out.println("------------------------------");

		// create empty Arraylist
		List<String> lessThanThree = new ArrayList<>();
		List<String> greaterThanThree = new ArrayList<>();

		// using for each loop we get the list
		for (WebElement e : carClassNameList) {
			System.out.println("Name of all car class List : " + e.getText());

			// store all names
			String name = e.getText();

			// check condition
			if (name.length() <= 3) {
				lessThanThree.add(name);

			} else {
				greaterThanThree.add(name);
			}

		}

		// print split names
		System.out.println("---------------------------------");
		System.out.println("Cars with name less than three : " + lessThanThree);
		System.out.println("Cars with name greater than three : " + greaterThanThree);

		// close driver
		driver.close();
	}

	public static void main(String[] args) {

		// create object of class
		CarInformation car = new CarInformation();
		// call methid
		car.carData();

	}

}
