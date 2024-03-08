package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	// create method for car
	public void cardData() {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/nites/OneDrive/Desktop/car2.html");

		List<WebElement> carClassNameList = driver.findElements(By.className("cars"));

		System.out.println("Cars class Name size : " + carClassNameList.size());

		List<String> lessThanThree = new ArrayList<>();
		List<String> greaterThanThree = new ArrayList<>();

		System.out.println("----------------------------------");

		for (WebElement e : carClassNameList) {
			System.out.println(e.getText());

			String name = e.getText();

			if (name.length() <= 3) {
				lessThanThree.add(name);
			} else {
				greaterThanThree.add(name);
			}
		}

		// print the split list
		System.out.println("------------------------------------");
		System.out.println("Less Than Three Character : " + lessThanThree);
		System.out.println("Less Than Three Character : " + greaterThanThree);

		driver.close();

	}

	public static void main(String[] args) {
		// create object of CarInformation class
		Flipkart car = new Flipkart();

		// call method
		car.cardData();

	}

}
