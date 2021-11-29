package com.project;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project2 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://practice.automationtesting.in/");

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[1]")).click();

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[2]")).click();

		driver.findElement(By.xpath("(//a[@rel='nofollow'])[3]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//a[@title='View Basket']")).click();

		Thread.sleep(5000);

		WebElement a = driver.findElement(By.xpath("//input[@type='number']"));

		a.clear();
		a.sendKeys("5");

		driver.findElement(By.name("update_cart")).click();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//a[contains(text(),'Proceed to Checkout')]")).click();

		WebElement b = driver.findElement(By.id("billing_first_name"));
		b.sendKeys("sandeep");

		WebElement c = driver.findElement(By.id("billing_last_name"));
		c.sendKeys("saran");

		WebElement d = driver.findElement(By.id("billing_company"));
		d.sendKeys("Greeves");

		WebElement e = driver.findElement(By.id("billing_email"));
		e.sendKeys("sandan99@gmail.com");

		WebElement f = driver.findElement(By.id("billing_phone"));
		f.sendKeys("123456789");

		WebElement g = driver.findElement(By.xpath("(//b[@role='presentation'])[1]"));
		g.click();
		WebElement h = driver.findElement(By.xpath("(//input[@role='combobox'])[2]"));

		h.sendKeys("India");
		WebElement i = driver.findElement(By.xpath("(//div[@role='option'])[2]"));
		i.click();

		driver.findElement(By.xpath("(//input[@type='text'])[8]")).sendKeys("anna nagar");
		driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Sastha");

		driver.findElement(By.xpath("(//b[@role='presentation'])[2]")).click();

		driver.findElement(By.xpath("(//input[@aria-expanded='true'])[2]")).sendKeys("mil Nadu");
		driver.findElement(By.xpath("//div[@role='option']")).click();

		driver.findElement(By.id("billing_city")).sendKeys("chennai");
		driver.findElement(By.id("billing_postcode")).sendKeys("60003");

		driver.manage().window().maximize();

		WebElement j = driver.findElement(By.id("payment_method_cod"));
		j.click();

		Thread.sleep(3000);

		driver.findElement(By.id("place_order")).click();
		
		Thread.sleep(3000);

		TakesScreenshot k = (TakesScreenshot) driver;
		File l = k.getScreenshotAs(OutputType.FILE);
		File m = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\miniproject2.png");
		FileHandler.copy(l, m);
		
	}

}
