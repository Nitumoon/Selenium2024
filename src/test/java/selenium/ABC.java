package selenium;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ABC {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		EdgeOptions eo = new EdgeOptions();

		WebDriver driver = new EdgeDriver(eo);

		driver.get("file:///C:/Users/nites/OneDrive/Desktop/car2.html");

		List<WebElement> carElements = driver.findElements(By.className("car"));
		System.out.println("--> " + carElements.size());
		List<String> shortCars = new ArrayList<>();
		List<String> longCars = new ArrayList<>();

		for (WebElement carElement : carElements) {

			System.out.println("--> " + carElement.getText());

			String carName = carElement.getText().trim();

			if (carName.length() <= 3) {
				shortCars.add(carName);
			} else {
				longCars.add(carName);
			}
		}

		// Now shortCars and longCars contain the split lists
		System.out.println("Cars with names less than 3 chars: " + shortCars);
		System.out.println("Cars with names more than 3 chars: " + longCars);

		driver.quit();
	}
}
