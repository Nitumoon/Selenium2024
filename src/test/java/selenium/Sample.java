package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) throws InterruptedException {
		// set path required while creating driver
//		System.setProperty("webdriver.chrome.driver",
//				"D:\\Automation_Libraries-&-Driver\\Chrome 114\\chromedriver.exe");

		// create object of chrome driver
		WebDriver driver = new ChromeDriver();

		// maximize browser
		driver.manage().window().maximize();

		// open url
		driver.get("https://piratebayorg.net/");

		// close browser
		Thread.sleep(2000);
		driver.close();

	}

}
