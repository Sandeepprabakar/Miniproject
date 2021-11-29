package com.project;

import java.awt.AWTException;
import java.awt.Robot;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		Actions ac = new Actions(driver);
		Robot ro = new Robot();

		driver.get(
				"https://www.myntra.com/?utm_source=perf_google_search_brand&utm_medium=perf_google_search_brand&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=Cj0KCQiAhMOMBhDhARIsAPVml-HCUKuD8Hhs3upkrSpRU7IZU97A1O0M2n7RfiFoJCn7pDM0ZHMiQCUaAu6dEALw_wcB");

		Thread.sleep(10000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		// js.executeScript("arguments[0].scrollIntoView();", Dth);
		// js.executeScript("window.scrollBy(0,1500)");
		for (int i = 0; i < 4; i++) {
			js.executeScript("window.scrollBy(0,500)");
			Thread.sleep(2000);

		}

		WebElement bag = driver.findElement(By.xpath("(//img[@class='image-image undefined image-hand'])[26]"));

		ac.click(bag).perform();  
		Thread.sleep(4000);
		
		WebElement girls = driver.findElement(By.xpath("(//label[@class='common-customRadio gender-label'])[3]"));
        ac.moveToElement(girls).click(girls).perform();
    	Thread.sleep(4000);
    	
    	js.executeScript("window.scrollBy(0,400)");
    	Thread.sleep(4000);
        
        WebElement dis = driver.findElement(By.xpath("(//label[@class='common-customCheckbox vertical-filters-label'])[1]"));
        ac.moveToElement(dis).click(dis).perform();
        
         Thread.sleep(4000);
    	
    	js.executeScript("window.scrollBy(0,600)");
    	 Thread.sleep(4000);
        
        
        WebElement bla = driver.findElement(By.xpath("(//label[@class='common-customCheckbox'])[1]"));
        ac.moveToElement(bla).click(bla).perform();
        
      //  js.executeScript("window.scrollBy(0,-700)");
        Thread.sleep(4000);
        
        WebElement Pokory = driver.findElement(By.xpath("(//label[@class='vertical-filters-label common-customCheckbox'])[1]"));
        ac.moveToElement(Pokory).click(Pokory).perform();
        Thread.sleep(4000);
        
        WebElement Bag = driver.findElement(By.xpath("(//h3[text()='POKORY'])[1]"));
        ac.moveToElement(Bag).click(Bag).perform(); 
        Thread.sleep(4000);
        js.executeScript("window.scrollBy(0,200)");
        
        WebElement ba = driver.findElement(By.xpath("//h4[text()='Girls Tote Bag']"));
        js.executeScript("arguments[0].click();", ba);
        
        Thread.sleep(4000);
        String x = "Buy POKORY Girls Black";
		Set<String> cc = driver.getWindowHandles();

		for (String dd1 : cc) {
			String title2 = driver.switchTo().window(dd1).getTitle();
			System.out.println(title2);
			if (title2.contains(x)) {
				String t1 = driver.switchTo().window(dd1).getTitle();
				System.out.println(t1);
				System.out.println("Done");

			}
		}
		js.executeScript("window.scrollBy(0,500)");
		
		WebElement cl = driver.findElement(By.xpath("//input[@type='tel']"));
		cl.click();
		cl.sendKeys("631003");
		
		driver.findElement(By.xpath("//button[text()='CHECK']")).click();
		

        
        TakesScreenshot ts1 = (TakesScreenshot) driver;
		File save1 = ts1.getScreenshotAs(OutputType.FILE);
		File path1 = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\myntra.png");
		FileUtils.copyFile(save1, path1);

        
        
        
        
	}
}
