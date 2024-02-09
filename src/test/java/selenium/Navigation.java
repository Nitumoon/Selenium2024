package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation {

	public static void main(String[] args) throws InterruptedException {
		// create object of webdriver
		WebDriver driver = new ChromeDriver();

		// open url
		driver.get("https://www.clickbank.com/");

		String title = driver.getTitle();

		if (title.contains("Selenium")) {
			System.out.println("Test case passs");
		} else {
			System.out.println("Test case failed");
		}
		Thread.sleep(2000);
		// navigate to another page
		driver.navigate().to("https://www.selenium.dev/");

		// back to previous page
		driver.navigate().back();

		// forword back
		driver.navigate().forward();

		// refresh page
		driver.navigate().refresh();

		// get url
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// close window
		driver.close();
	}

}
