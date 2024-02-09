package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public void verifyTitle() throws InterruptedException {
		// create object of Webdriver
		WebDriver driver = new ChromeDriver();

		// maximize window
		driver.manage().window().maximize();
		// open url
		System.out.println("step 1 ..........");
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

		// enter First name
		WebElement fname = driver.findElement(By.name("firstname"));
		fname.sendKeys("Samir");
		System.out.println("step 2 ..........");

		// enter last name
		WebElement lname = driver.findElement(By.name("lastname"));
		lname.sendKeys("Patil");
		System.out.println("step 3 ..........");

		// select gender
		driver.findElement(By.id("sex-0")).click();
		System.out.println("step 4 ..........");

		// scroll down page
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,700)");

		// select year of experience
		driver.findElement(By.id("exp-2")).click();
		System.out.println("step 5 ..........");

		// enter date
		driver.findElement(By.id("datepicker")).sendKeys("18/05/1855");
		System.out.println("step 6 ..........");

		// select profession
		driver.findElement(By.id("profession-1")).click();
		System.out.println("step 7 ..........");

		// select automation tool
		driver.findElement(By.id("tool-2")).click();
		System.out.println("step 8 ..........");

		// select continents
		WebElement contients = driver.findElement(By.id("continents"));

		// using select class
		Select sel = new Select(contients);
		// use select methods
		sel.selectByVisibleText("Australia");
		System.out.println("step 9 ..........");

		Thread.sleep(3000);
		// close web page
		driver.close();
		System.out.println("step 10 ..........");

	}

	public static void main(String args[]) throws InterruptedException {
		// create object of test class
		Test t = new Test();
		// call method
		t.verifyTitle();

	}

}
