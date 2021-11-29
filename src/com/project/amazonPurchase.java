package com.project;
import java.io.File;

import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class amazonPurchase {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Workspace\\Selenium\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
JavascriptExecutor js = (JavascriptExecutor) driver; 		
driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c"
		+ "_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458712209&hvpos=&hvnetw=g&hvrand"
		+ "=2045285543949650870&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9299805&hvtarg"
		+ "id=kwd-10573980&hydadcr=14453_2154373&gclid=EAIaIQobChMIq5Chw7eN9AIVWjErCh3Mj"
		+ "QpoEAAYASAAEgKdNPD_BwE");
		Thread.sleep(2000);

		WebElement srch = driver.findElement(By.id("twotabsearchtextbox"));

		srch.sendKeys("earpods");

		srch.click();

		driver.findElement(By.id("nav-search-submit-button")).click();

		WebElement product = driver.findElement(By.xpath(
				"//span[text()='boAt Airdopes 121v2 TWS Earbuds with Bluetooth V5.0, Immersive Audio, Up to 14H Total Playback, Instant Voice Assistant, Easy Access Controls with Mic and Dual Tone Ergonomic Design(Active Black)']"));

		String vpro = product.getText();

		String par = driver.getWindowHandle();

		System.out.println("selected product:  " + vpro);
		product.click();

		Set<String> tabs = driver.getWindowHandles();

		for (String str : tabs) {
			if (!str.equals(par)) {
				driver.switchTo().window(str);
			}
		}

		String vpro1 = driver.findElement(By.id("productTitle")).getText();

		if (vpro.equals(vpro1)) {
			System.out.println("Product selected successfully");
		}
		Thread.sleep(10000);

		//driver.findElement(By.xpath("(//button[@type='button'])[13]")).click();
		js.executeScript("window.scrollBy(0,700)", "");
		
		WebElement ty = driver.findElement(By.xpath("(//img[@alt='Midnight Blue'])[1]"));
		
		js.executeScript("arguments[0].click();", ty);
		Thread.sleep(10000);
		
		WebElement co = driver.findElement(By.xpath("(//span[text()='Midnight Blue'])[1]"));
		
		String cot = co.getText();
		
		
		WebElement sel = driver.findElement(By.name("quantity"));

		Select s = new Select(sel);

		s.selectByValue("2");

		String qt = sel.getAttribute("value");
		
		//System.out.println(qt);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		
		WebElement cb = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		
		cb.click();
		
		boolean cbs = cb.isSelected();
		
		if (cbs==true) {
			System.out.println("gift checkbox selected..|" );
		}
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//a[contains(text(),'Cart')])[1]")).click();
	
	WebElement v1 = driver.findElement(By.xpath("//span[@class='a-button-text a-declarative']"));
	
	String v1t = v1.getText();
	
	System.out.println(v1t);
	
	if (v1t.contains(qt)) {
		System.out.println("quantity match ..|");
	}
	WebElement det = driver.findElement(By.xpath("//div[@class='a-row a-spacing-base a-spacing-top-base']"));
	
	String dett = det.getText();
	
	//System.out.println(dett);
	
	if (dett.contains("boAt Airdopes 121v2 TWS")) {
		System.out.println("product Match ..|");
	}
	
	if (dett.contains(cot)) {
		System.out.println("color match..|");
	}
	
	WebElement pri = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[3]"));
	String prit = pri.getText();
	System.out.println("price:  "+prit+" per piece");
	
	WebElement totpri = driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[4]"));
	String totprit = totpri.getText();
	System.out.println("total price:  "+totprit);
	
	TakesScreenshot ts =(TakesScreenshot) driver;
	File sr = ts.getScreenshotAs(OutputType.FILE);
	File de = new File("D:\\Selenium\\Workspace\\Selenium\\screenst\\boat.png");
	FileUtils.copyFile(sr, de);
	
	
		/*
		 * driver.findElement(By.name("proceedToRetailCheckout")).click();
		 * 
		 * driver.findElement(By.xpath("//input[@name='email']")).sendKeys("9551300144")
		 * ;
		 * 
		 * driver.findElement(By.xpath("//input[@type='submit']")).click();
		 * 
		 * driver.findElement(By.name("password")).sendKeys("Buyamazon@1");
		 * 
		 * driver.findElement(By.id("signInSubmit")).click();
		 * 
		 * driver.findElement(By.xpath("//a[contains(text(),'Deliver to this address')]"
		 * )).click();
		 * 
		 * driver.findElement(By.xpath("(//input[@class='a-button-input'])[1]")).click()
		 * ;
		 * 
		 * WebElement cod =
		 * driver.findElement(By.xpath("(//span[contains(text(),'Pay on Delivery')])[1]"
		 * ));
		 * 
		 * cod.click();
		 * 
		 * boolean codd = cod.isSelected();
		 * 
		 * if(codd==true) { System.out.println("pay on delivery selected"); }
		 */	
	
	}
	
}



