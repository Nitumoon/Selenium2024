package com.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaxmiHolydaysBusses2 {
	public static String text;
	public static int LayOutBoxSeats;
	public static String LayOutSeats;

	public static void main(String[] args) throws InterruptedException {

		// create object of Webdriver interface
		WebDriver driver = new ChromeDriver();

		// open WebPage
		driver.get("https://www.laxmiholidays.com/");
		System.out.println("Step 1--open webpage");

		// maximize the window
		driver.manage().window().maximize();
		System.out.println("Step 2--maximize window");

		// add implicit wait
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// click on the notification window
		driver.findElement(By.id("close")).click();
		System.out.println("Step 3--click on popup window");

		// enter bus name into origin field
		WebElement origin = driver.findElement(By.xpath("//div[text()='Origin']"));
		origin.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//input[@class='ant-select-search__field'])[1]")).sendKeys("Gorakhpur");
		System.out.println("Step 4--Enter Data in source text box");

		// Enter Bus name into Destination field
		WebElement destination = driver.findElement(By.xpath("//div[text()='Destination']"));
		destination.click();
		Thread.sleep(2000);

		WebElement cityname = driver.findElement(By.xpath("(//input[@class='ant-select-search__field'])[2]"));
		cityname.sendKeys("Delhi");
		cityname.sendKeys(Keys.ENTER);
		System.out.println("Step 6--Enter data in destination textbox");
		Thread.sleep(2000);

		// select date
		WebElement date = driver.findElement(By.xpath("//input[@class=\"ant-calendar-input \"]"));
		while (true) {
			WebElement monthYear = driver.findElement(By.xpath("//span[@class=\"ant-calendar-my-select\"]"));
			String text = monthYear.getText();

			// check the month and year
			if (!text.equals("Apr2024")) {

				WebElement nextclik = driver.findElement(By.className("ant-calendar-next-month-btn"));
				nextclik.click();
			} else {
				break;
			}
			System.out.println("Step 7--date selected");
		}
		// click on date
		driver.findElement(By.xpath("(//div[text()=\"1\"])[1]")).click();

		// click on search button
		driver.findElement(By.id("gt-search")).click();
		System.out.println("Step 8--click on search button");

		// get the list of available buses
		List<WebElement> availableBusList = driver
				.findElements(By.xpath("//div[@class=\"search-row normal-service \"]"));

		// get the total count of available bus list
		int totalBusesAvailable = availableBusList.size();
		System.out.println("Step 9--Get the list of available Buses on this date ");
		System.out.println("Total Buses Available = " + "[" + totalBusesAvailable + "]");

		System.out.println("step 10--Print all Buses list available");
		System.out.println();

		// print all buses name and details
		for (WebElement e : availableBusList) {
			System.out.println("--------------------\n" + e.getText() + " \n--------------------");
			text = e.getText();

//			while (true) {
			if (text.contains("VIEW SEATS")) {

				// List of "VIEW SEATS" button
				List<WebElement> viewSeatButton = driver
						.findElements(By.xpath("//div[contains(@class,'ant-col-2 btn-block1')]//button"));
				int VBtnSize = viewSeatButton.size();

				List<WebElement> SeatButtonTxt = driver.findElements(By.xpath("//span[text()='VIEW SEATS']"));
//---------------	System.out.println("Total VIEW SEAT Buttons : " + VBtnSize);

				System.out.println();

				for (WebElement w : viewSeatButton) {

					Thread.sleep(1000);
					w.click();

					Thread.sleep(1000);
					// compair current seat vs actual seat availability
					List<WebElement> compair = driver.findElements(By.xpath("//div[@class=\"available_seat\"]"));
					LayOutBoxSeats = compair.size();
//					System.out.println("Layout Seats Available = " + LayOutBoxSeats);
					LayOutSeats = Integer.toString(LayOutBoxSeats);

					if (text.contains(LayOutSeats)) {
//						System.out.println("Current available seats And Layout seats are Matched ");

						System.out.println("Total Seats = " + LayOutSeats);
						System.out.println("Layout Seats Available = " + LayOutBoxSeats);

						System.out.println("Current available seats And Layout seats are Matched ");

						System.out.println("********************************");
						break;

					}

				}

			}

		}
		System.out.println("****************************");
		System.out.println("Validation Sucessfully done");
		System.out.println("****************************");
		// close browser
		driver.close();
	}
}
