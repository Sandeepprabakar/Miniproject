package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Adactin_Project8 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions AA = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Robot ro = new Robot();

		driver.get("https://adactinhotelapp.com/");

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement user = driver.findElement(By.id("username"));
		user.click();
		user.sendKeys("Rabbanis");

		WebElement pass = driver.findElement(By.id("password"));
		pass.click();
		pass.sendKeys("Buyadactin@1");

		WebElement log = driver.findElement(By.id("login"));
		log.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se = driver.findElement(By.id("location"));
		Select rt = new Select(se);
		rt.selectByIndex(5);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se1 = driver.findElement(By.id("hotels"));
		Select rt1 = new Select(se1);
		rt1.selectByValue("Hotel Sunshine");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se2 = driver.findElement(By.id("room_type"));
		Select rt2 = new Select(se2);
		rt2.selectByVisibleText("Deluxe");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se3 = driver.findElement(By.id("room_nos"));
		Select rt3 = new Select(se3);
		rt3.selectByValue("2");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se4 = driver.findElement(By.id("adult_room"));
		Select rt4 = new Select(se4);
		rt4.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se5 = driver.findElement(By.id("child_room"));
		Select rt5 = new Select(se5);
		rt5.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se6 = driver.findElement(By.id("Submit"));
		se6.click();

		WebElement se7 = driver.findElement(By.id("radiobutton_0"));
		se7.click();

		WebElement se8 = driver.findElement(By.id("continue"));
		se8.click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement se9 = driver.findElement(By.id("first_name"));
		se9.click();
		se9.sendKeys("Sandeeep");

		WebElement se10 = driver.findElement(By.id("last_name"));
		se10.click();
		se10.sendKeys("Prabakaran");

		WebElement se11 = driver.findElement(By.id("address"));
		se11.click();
		se11.sendKeys("Chennai");

		WebElement se12 = driver.findElement(By.id("cc_num"));
		se12.click();
		se12.sendKeys("1234567893214567");

		WebElement se13 = driver.findElement(By.id("cc_type"));
		Select rt6 = new Select(se13);
		rt6.selectByIndex(2);

		WebElement se14 = driver.findElement(By.id("cc_exp_month"));
		Select rt7 = new Select(se14);
		rt7.selectByIndex(11);

		WebElement se15 = driver.findElement(By.id("cc_exp_year"));
		Select rt8 = new Select(se15);
		rt8.selectByIndex(5);

		driver.findElement(By.id("cc_cvv")).sendKeys("555");

		driver.findElement(By.id("book_now")).click();
		
		Thread.sleep(10000);

		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		
		driver.findElement(By.id("my_itinerary")).click();
		
		Thread.sleep(5000);

		TakesScreenshot rp = (TakesScreenshot) driver;

		File rq = rp.getScreenshotAs(OutputType.FILE);

		File rr = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\adactin1.png");

		FileUtils.copyFile(rq, rr);
		
		Thread.sleep(5000);


		driver.findElement(By.id("logout")).click();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		

		TakesScreenshot rp1 = (TakesScreenshot) driver;

		File rq1 = rp1.getScreenshotAs(OutputType.FILE);

		File rr1 = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\adactin2.png");

		FileUtils.copyFile(rq1, rr1);

	}

}
