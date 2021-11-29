package com.project;

import java.awt.List;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
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
import org.openqa.selenium.io.FileHandler;

public class Mini_Project5 {
	public static void main(String[] args) throws InterruptedException, Throwable {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.airasia.co.in/home");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		// driver.manage().window().maximize();

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Actions AA = new Actions(driver);

		driver.findElement(By.id("One Way")).click();
		Thread.sleep(5000);

		WebElement A = driver.findElement(By.xpath("//div[text()='MAA']"));
		A.click();
		WebElement B = driver.findElement(By.xpath("//div[text()='BOM']"));
		String b = B.getText();
		System.out.println(b);

		B.click();

		// WebElement BB = driver.findElement(By.xpath("//div[text()='Fly to']"));
		// BB.click();
		Thread.sleep(3000);

		WebElement C = driver.findElement(By.xpath("//div[text()='CCU']"));
		String c = C.getText();
		System.out.println(c);

		C.click();

		WebElement D = driver.findElement(By.xpath("//div[@class='selected-date']"));
		D.click();

		WebElement E = driver.findElement(By.xpath("(//div[text()='31'])[1]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", E);
		// js.executeScript("window.scrollBy(0,-300);");
		driver.manage().window().maximize();
		WebElement F = driver.findElement(By.xpath("(//div[@class='calender-day'])[92]"));
		AA.moveToElement(F).perform();
		AA.click().perform();

		WebElement j = driver.findElement(By.xpath("//button[text()='Back']"));
		j.click();

		Thread.sleep(5000);

		WebElement k = driver.findElement(By.xpath("(//div[contains(@class,'-arrow-wrapper')])[1]"));
		k.click();

		WebElement l = driver.findElement(By.xpath("(//img[@alt='plus'])[1]"));
		for (int i = 0; i < 2; i++) {

			AA.click(l).perform();

		}
		WebElement m = driver.findElement(By.xpath("(//img[@alt='plus'])[4]"));
		m.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File save = ts.getScreenshotAs(OutputType.FILE);
		File path = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\minipojct6.png");
		FileUtils.copyFile(save, path);

		WebElement n = driver.findElement(By.xpath("//button[text()='Done']"));
		n.click();

		WebElement o = driver.findElement(By.xpath("//img[@class='flight-search-icon']"));
		o.click();

		Thread.sleep(5000);
		WebElement p = driver.findElement(By.xpath("(//input[@type='checkbox'])[3]"));
		p.click();

		WebElement q = driver.findElement(By.xpath("(//label[text()='After 6 PM'])[2]"));
		js.executeScript("arguments[0].scrollIntoView();", q);
		q.click();

		WebElement r = driver.findElement(By.xpath("//div[@class='fa-sd-source']"));
		String s1 = r.getText();
		System.out.println(s1);

		WebElement s = driver.findElement(By.xpath("//div[@class='fa-sd-destination']"));
		String t1 = s.getText();
		System.out.println(t1);

		if (s1.equalsIgnoreCase(b) && t1.equalsIgnoreCase(c)) {
			System.out.println("Validated successfully");

		} else {
			System.out.println("Invalid destination");

		}

		java.util.List<WebElement> x = driver.findElements(By.tagName("label"));
		int size = x.size();
		System.out.println(size);

		java.util.List<WebElement> y = driver.findElements(By.xpath("//label[@class='discounted-price']"));

		int siz = y.size();
		System.out.println(siz);
		ArrayList<Integer> aaa = new ArrayList<Integer>();

		ArrayList<String> li = new ArrayList<String>();
		for (WebElement u : y) {

			li.add(u.getText());
			System.out.println(u.getText());
			String v = u.getText().replaceAll(",", "");
			String w = v.substring(1);
			System.out.println(w);
			int z = Integer.parseInt(w);
			aaa.add(z);

		}
		Collections.sort(aaa);

		Integer k1 = aaa.get(0);

		System.out.println("The lowest value is " + k1);
		
		String z = k1.toString();
		System.out.println(z);

		//String z1 = String.valueOf(k1);
		//System.out.println(z);

		// String aa = z.substring(0, 1) + ","+ z.substring(1);

		String aa = z.substring(0, 1) + "," + z.substring(1);
		System.out.println(aa);

		WebElement bb = driver.findElement(By.xpath("//label[contains(text(),'" + aa + "')]"));
		String cc = bb.getText();
		System.out.println(cc);
		int dd;

		dd = li.indexOf(cc);
		System.out.println(dd);
		int ee = dd + 1;

		String ff = String.valueOf(ee);

		System.out.println(ff);
//	 WebElement parent = bb.findElement(By.xpath("./..")); 
//	 String dd1 = parent.getTagName();
//	 System.out.println(dd1);

//	WebElement dd= driver.findElement(By.xpath("//label[contains(text(),'" + aa + "')]//parent::span")); 
//	String ee1 = dd2.getTagName();
//	
		Thread.sleep(5000);

		WebElement gg = driver.findElement(By.xpath("(//input[@type='radio'])[" + ff + "]"));
		//js.executeScript("arguments[0].click();", gg);
		AA.moveToElement(gg).click().perform();
		

		Thread.sleep(5000);

		WebElement hh = driver.findElement(By.xpath("//button[text()='Continue']"));
		AA.moveToElement(hh).perform();
		AA.click().perform();

		Thread.sleep(5000);

		WebElement ii = driver.findElement(By.xpath("(//span[@class='city-code-info'])[1]"));
		String ss = ii.getText();
		System.out.println(ss);

		WebElement kk = driver.findElement(By.xpath("(//span[@class='city-code-info'])[2]"));
		String ss1 = kk.getText();
		System.out.println(ss1);

		if (s1.equalsIgnoreCase(ss) && t1.equalsIgnoreCase(ss1)) {
			System.out.println("Validated sucessfully");

		} else {
			System.out.println("Invalid Validation");

		}

		Thread.sleep(5000);

		TakesScreenshot mm = (TakesScreenshot) driver;
		File save1 = mm.getScreenshotAs(OutputType.FILE);
		File path1 = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\mniprject5.1.png");
		FileHandler.copy(save1, path1);

	}

}
