package com.project;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class Mini_Project22 {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php?id_category=10&controller=category");

		Thread.sleep(3000);
//	driver.findElement(By.xpath("//img[@alt='My Store']")).click();
//		
//		Thread.sleep(4000);
//
//		
//
//		Actions A = new Actions(driver);
//		WebElement de = driver.findElement(By.xpath("(//a[@title='Women'])[1]"));
//
//		A.moveToElement(de).perform();
//		
//		A.click();
//
//		WebElement ef = driver.findElement(By.xpath("(//a[@title='Evening Dresses'])[1]"));
//
//		A.moveToElement(ef).perform();
//
//		A.click().perform();
//		
//		System.out.println("image");

		driver.findElement(By.xpath("//a[@class='product_img_link']")).click();

		driver.findElement(By.xpath("//span[text()='View larger']")).click();
		Thread.sleep(8000);

		driver.findElement(By.xpath("//a[@title='Close']")).click();
		Thread.sleep(8000);

		WebElement loop = driver.findElement(By.xpath("//i[@class='icon-plus']"));
		for (int int1 = 0; int1 < 5; int1++) {

			loop.click();
		}

		WebElement fg = driver.findElement(By.xpath("//select[@class='form-control attribute_select no-print']"));

		Select sq = new Select(fg);

		sq.selectByIndex(1);

		driver.findElement(By.xpath("//a[@name='Pink']")).click();

		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();

		Thread.sleep(8000);

		TakesScreenshot gh = (TakesScreenshot) driver;

		File hi = gh.getScreenshotAs(OutputType.FILE);

		File ij = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\miniproject2.1.png");

		FileUtils.copyFile(hi, ij);

		Thread.sleep(8000);

		driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//span[(text()='Proceed to checkout')]")).click();

		WebElement wq = driver.findElement(By.xpath("//textarea[@name='message']"));

		wq.sendKeys("sandeep");

		Thread.sleep(5000);

		driver.findElement(By.id("email")).sendKeys("sandeep99@gmail.com");

		driver.findElement(By.id("passwd")).sendKeys("Autom@tiontesting99");

		driver.findElement(By.id("SubmitLogin")).click();

		Thread.sleep(4000);

		driver.findElement(By.xpath("//span[text()='Proceed to checkout']")).click();

		Thread.sleep(6000);

		driver.findElement(By.id("cgv")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("(//span[contains(text(),'Proceed to checkout')])[2]")).click();

		Thread.sleep(6000);

		driver.findElement(By.xpath("//a[contains(text(),'Pay by bank wire')]")).click();

		Thread.sleep(3000);

		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();

		TakesScreenshot za = (TakesScreenshot) driver;

		File zs = za.getScreenshotAs(OutputType.FILE);
		File qw = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\mini-project2.2.png");
		FileHandler.copy(zs, qw);

	}

}
