package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaxmiHolidays {
	public static String text;

	// create methid for booking
	public static void laxmiBookingService() throws InterruptedException {

		// create object of Webdriver interface
		WebDriver driver = new ChromeDriver();

		// open WebPage
		driver.get("https://www.laxmiholidays.com/");
		System.out.println("Step 1-----passes");

		// maximize the window
		driver.manage().window().maximize();
		System.out.println("Step 2-----passes");

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Step 3-----passes");

		// click on the notification window
		driver.findElement(By.id("close")).click();
		System.out.println("Step 4----passes");

		// enter bus name into origin field
		WebElement origin = driver.findElement(By.xpath("//div[text()='Origin']"));
		origin.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-search__field'])[1]")).sendKeys("Gorakhpur");
		System.out.println("Step 5----passes");

		// Enter Bus name into Destination field
		WebElement destination = driver.findElement(By.xpath("//div[text()='Destination']"));
		destination.click();
		Thread.sleep(2000);
		WebElement cityname = driver.findElement(By.xpath("(//input[@class='ant-select-search__field'])[2]"));
		cityname.sendKeys("Delhi");
		cityname.sendKeys(Keys.ENTER);

		System.out.println("Step 6----passes");
		Thread.sleep(2000);
		// select date
		WebElement date = driver.findElement(By.xpath("//input[@class=\"ant-calendar-input \"]"));
		while (true) {
			WebElement monthYear = driver.findElement(By.xpath("//span[@class=\"ant-calendar-my-select\"]"));
			String text = monthYear.getText();
//			System.out.println(text);

			// check the month and year
			if (!text.equals("Apr2024")) {

				WebElement nextclik = driver.findElement(By.className("ant-calendar-next-month-btn"));
				nextclik.click();
			} else {
				break;
			}
			System.out.println("Step 7----passes");
		}

		driver.findElement(By.xpath("(//div[text()=\"1\"])[1]")).click();

		System.out.println("Step 8----passes");

		// click on search button
		driver.findElement(By.id("gt-search")).click();
		System.out.println("Step 9----passes");

		// get the list of available buses
		List<WebElement> availableBusList = driver
				.findElements(By.xpath("//div[@class=\"search-row normal-service \"]"));

		// get the total count of available list
		int totalBusesAvailable = availableBusList.size();
		System.out.println("Total Buses available on this date is : " + totalBusesAvailable);
		System.out.println("-------------------------------------------");

		// print all buses name and details
		for (WebElement e : availableBusList) {
			System.out.println(e.getText());
			text = e.getText();
			System.out.println("---------------------------------------");

		}

		List<WebElement> viewSeatButton = driver
				.findElements(By.xpath("//div[contains(@class,'ant-col-2 btn-block1')]//button"));
		int VBtnSize = viewSeatButton.size();

		System.out.println(VBtnSize);

		for (WebElement w : viewSeatButton) {
			w.click();
			/*
			 * 
			 * 
			 */

//			// click on VIEW SEAT Button
//			driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();

			// compair current seat vs actual seat availability
			List<WebElement> compair = driver.findElements(By.xpath("//div[@class=\"available_seat\"]"));
			int size = compair.size();
			String str = Integer.toString(size);

			if (text.contains(str)) {
				System.out.println(" Both seat availabity size are correct ");
				System.out.println("seat available = " + str);

			}
			System.out.println();
		}

//			

	}

	public static void main(String[] args) throws InterruptedException {
		// create object of class
		LaxmiHolidays l = new LaxmiHolidays();

		// call method
		l.laxmiBookingService();
	}

}
