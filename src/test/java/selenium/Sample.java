package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
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
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// open url
		driver.get("https://www.nimblework.com/");
		driver.findElement(By.xpath("//div[@class=\"buttonWrapper\"]")).click();
//		driver.findElement(By.className("buttonWrapper")).click();

		driver.findElement(By.xpath("//input[@type=\"text\"]")).sendKeys("Hello");
//		driver.findElement(By.tagName("input")).sendKeys();
//		driver.findElement(By.xpath("//input[@class='msgInput-0-2-60 msgInput-d1-0-2-81']")).sendKeys("Hi");

		// close browser
//		Thread.sleep(2000);
//		driver.close();

	}

}
