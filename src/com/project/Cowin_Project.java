package com.project;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Cowin_Project {
	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.cowin.gov.in/");

		driver.manage().window().maximize();

		Thread.sleep(20000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement b = driver.findElement(By.xpath("//label[text()='By District']"));
		js.executeScript("arguments[0].scrollIntoView();", b);
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-500);");

		Thread.sleep(3000);
		WebElement c = driver.findElement(By.xpath("//label[text()='By District']"));

		js.executeScript("arguments[0].click();", c);

		WebElement d = driver.findElement(By.xpath("//label[text()='By PIN']"));
		js.executeScript("arguments[0].click();", d);
		Thread.sleep(3000);
		js.executeScript("arguments[0].click();", c);

		driver.findElement(By.xpath("(//div[contains(@Class,'mat-select-arrow')])[2]")).click();

		driver.findElement(By.xpath("//span[text()=' Tamil Nadu ']")).click();

		driver.findElement(By.xpath("(//div[contains(@Class,'mat-select-arrow')])[3]")).click();

		driver.findElement(By.xpath("//span[text()=' Ranipet ']")).click();

		driver.findElement(By.xpath("//button[text()='Search']")).click();

		Thread.sleep(2000);

		WebElement e = driver.findElement(By.xpath("(//label[@class='accessibility-plugin-ac'])[1]"));
		e.click();
		String text = e.getText();
		System.out.println(text);

		WebElement f = driver.findElement(By.xpath("//label[text()='Free']"));
		f.click();
		String text2 = f.getText();
		System.out.println(text2);

		WebElement g = driver.findElement(By.xpath("//label[text()='Covishield']"));
		g.click();
		String text3 = g.getText();
		System.out.println(text3);

		js.executeScript("window.scrollBy(0,600);");
		
		Thread.sleep(3000);
		
		WebElement l = driver.findElement(By.xpath("(//h5[contains(text(),' Arakkonam GH ')])[2]"));
		String text4 = l.getText();
		System.out.println(text4);

		TakesScreenshot i = (TakesScreenshot) driver;
		File j = i.getScreenshotAs(OutputType.FILE);
		File k = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\cowin.png");
		FileHandler.copy(j, k);
		
		List<WebElement> n = driver.findElements(By.tagName("p"));
		System.out.println(n);
		
		

	}

}
