package com.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_Desk {
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver a = new ChromeDriver();

		a.get("http://demo.automationtesting.in/Register.html");

		a.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("sandeep");

		a.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("prabakaran");

		// a.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("166a.pandurangan");

		a.findElement(By.xpath("//textarea[contains(@class,'form-control')]")).sendKeys("arakkonam");

		a.findElement(By.xpath("//input[@type='email']")).sendKeys("imsandeeep@gmail");

		a.findElement(By.xpath("//input[@type='tel']")).sendKeys("987654321");

		a.findElement(By.xpath("(//input[@type='radio'])[1]")).click();

		a.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();

		a.findElement(By.xpath("(//input[@id='firstpassword'])[1]")).sendKeys("000000");

		a.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("000000");

		a.findElement(By.xpath("//button[@id='submitbtn']")).click();

		Thread.sleep(3000);

		TakesScreenshot b = (TakesScreenshot) a;

		File c = b.getScreenshotAs(OutputType.FILE);

		File d = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\demo.png");

		FileUtils.copyFile(c, d);

	}
}
