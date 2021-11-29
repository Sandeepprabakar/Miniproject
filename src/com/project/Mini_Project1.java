package com.project;

import java.io.File;
import java.util.List;

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

public class Mini_Project1 {

	public static void main(String[] args) throws Throwable {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://automationpractice.com/index.php");

		Thread.sleep(3000);

		driver.manage().window().maximize();

		String a = driver.getCurrentUrl();
		System.out.println("Current Url = " + a);

		String b = driver.getTitle();
		System.out.println("Tittle of the Page = " + b);

		System.out.println("Findelement using class name");

		WebElement c = driver.findElement(By.className("login"));
		String d = c.getText();
		System.out.println("getting the text using Gettext Method = " + d);
		c.click();
		Thread.sleep(3000);

		System.out.println("E-mail id has given using absolute X-Path(index) by Send Keys Method");

		WebElement e = driver.findElement(By.xpath("(/html/body/div/div/div/div/div/div/div/form/div/div/input)[1]"));
		e.sendKeys("sandeep99999@gmail.com");
		String f = e.getAttribute("value");
		System.out.println("E-mail id using getattribute method = " + f);

		System.out.println("Create account by using absolute X-Path");

		WebElement g = driver
				.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/div/div/button/span/i"));
		g.click();
		Thread.sleep(5000);

		System.out.println("Findelement using Xpath(text type)");
		Thread.sleep(10000);

		WebElement h = driver.findElement(By.xpath("//h1[text()='Create an account']"));
		String i = h.getText();
		System.out.println("Header of page using gettext = " + i);

		System.out.println("Findelement using Xpath(contains text type)");

		WebElement j = driver.findElement(By.xpath("//h3[contains(text(),'Your personal information')]"));
		String k = j.getText();
		System.out.println("Title of page = " + k);

		Thread.sleep(5000);

		System.out.println("Findelement using Basic Xpath (index)");

		WebElement s = driver.findElement(By.xpath("//label[text()='Title']"));
		System.out.println(s.getText());

		WebElement l = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		System.out.println("Boolean method");
		System.out.println(l.isSelected());
		System.out.println(l.isEnabled());
		System.out.println(l.isDisplayed());
		l.click();

		System.out.println("After selection ");

		System.out.println(l.isSelected());
		System.out.println(l.isEnabled());
		System.out.println(l.isDisplayed());

		WebElement t = driver.findElement(By.xpath("(//label[contains(text(),'name')])[1]"));
		System.out.println(t.getText());

		WebElement m = driver.findElement(By.id("customer_firstname"));
		m.sendKeys("Sandeep");
		String n = m.getAttribute("value");
		System.out.println(n);

		System.out.println("Findelement using basic name method");

		WebElement u = driver.findElement(By.xpath("(//label[contains(text(),'name')])[2]"));
		System.out.println(u.getText());

		WebElement o = driver.findElement(By.name("customer_lastname"));
		o.sendKeys("prabakaran");
		String p = o.getAttribute("value");
		System.out.println(p);

		System.out.println("Findelement using basic X-Path");

		WebElement v = driver.findElement(By.xpath("//label[contains(text(),'Email ')]"));
		System.out.println(v.getText());

		WebElement q = driver.findElement(By.xpath("(//input[@name='email'])[1]"));
		String r = q.getAttribute("value");
		System.out.println("E-mail id = " + r);

		System.out.println("findelement using Basic X-Path ");

		WebElement w = driver.findElement(By.xpath("//label[text()='Password ']"));
		System.out.println(w.getText());

		WebElement x = driver.findElement(By.xpath("//input[@type='password']"));
		x.sendKeys("Autom@tiontesting99");
		System.out.println(x.getAttribute("value"));

		WebElement y = driver.findElement(By.id("days"));
		Select z = new Select(y);
		z.selectByIndex(8);

		WebElement aa = driver.findElement(By.id("months"));
		Select bb = new Select(aa);
		bb.selectByVisibleText("December ");

		WebElement cc = driver.findElement(By.id("years"));
		Select dd = new Select(cc);
		dd.selectByValue("1995");

		System.out.println("Multiple Drop Box Checking Using Boolean = " + dd.isMultiple());

		WebElement ee = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
		ee.click();

		WebElement ff = driver.findElement(By.xpath("//h3[text()='Your address']"));
		System.out.println(ff.getText());

		WebElement gg = driver.findElement(By.xpath("(//label[text()='First name '])[2]"));
		System.out.println(gg.getText());

		WebElement hh = driver.findElement(By.id("firstname"));
		System.out.println(hh.getAttribute("value"));

		WebElement ii = driver.findElement(By.xpath("(//label[text()='Last name '])[2]"));
		System.out.println(ii.getText());

		WebElement jj = driver.findElement(By.id("lastname"));
		System.out.println(jj.getAttribute("value"));

		WebElement kk = driver.findElement(By.xpath("//label[text()='Company']"));
		System.out.println(kk.getText());

		WebElement ll = driver.findElement(By.id("company"));
		ll.sendKeys("Automation");
		System.out.println(ll.getAttribute("value"));

		WebElement mm = driver.findElement(By.xpath("//label[text()='Address ']"));
		System.out.println(mm.getText());

		WebElement nn = driver.findElement(By.xpath("(//input[@type='text'])[8]"));
		nn.sendKeys("kovil street");
		System.out.println(nn.getAttribute("value"));

		WebElement oo = driver.findElement(By.xpath("(//input[@type='text'])[9]"));
		oo.sendKeys("Arakkonam");
		System.out.println(oo.getAttribute("value"));

		WebElement pp = driver.findElement(By.xpath("//label[text()='City ']"));
		System.out.println(pp.getText());

		WebElement xy = driver.findElement(By.id("city"));
		xy.sendKeys("Chennai");
		System.out.println(xy.getAttribute("value"));

		WebElement ss = driver.findElement(By.xpath("//label[text()='State ']"));
		System.out.println(ss.getText());

		WebElement qq = driver.findElement(By.id("id_state"));
		Select rr = new Select(qq);
		rr.selectByVisibleText("Georgia");
		WebElement fs = rr.getFirstSelectedOption();
		String te = fs.getText();
		System.out.println(te);

		List<WebElement> options = rr.getOptions();
		// System.out.println(options);

		for (WebElement sq : options) {
			if (sq.getText().equalsIgnoreCase("Georgia")) {

				System.out.println("Selected state is Georgia");

			} else {
				// System.out.println("Selected state is invalid");
			}

		}

		if (ss.getText().equalsIgnoreCase("State *")) {
			System.out.println("It's a match");

		} else {
			System.out.println("It's not a match");
		}

		WebElement tt = driver.findElement(By.xpath("//label[text()='Zip/Postal Code ']"));
		System.out.println(tt.getText());

		WebElement uu = driver.findElement(By.id("postcode"));
		uu.sendKeys("60003");
		System.out.println(uu.getAttribute("value"));

		WebElement vv = driver.findElement(By.xpath("//label[text()='Country ']"));
		System.out.println(vv.getText());

		WebElement ww = driver.findElement(By.xpath("//label[text()='Additional information']"));
		System.out.println(ww.getText());

		WebElement xx = driver.findElement(By.id("other"));
		xx.sendKeys("Selenium automation tester");
		System.out.println(xx.getAttribute("value"));

		WebElement yy = driver.findElement(By.xpath("//label[text()='Home phone']"));
		System.out.println(yy.getText());

		WebElement zz = driver.findElement(By.id("phone"));
		zz.sendKeys("987654321");
		System.out.println(zz.getAttribute("value"));

		WebElement ab = driver
				.findElement(By.xpath("//label[text()='Assign an address alias for future reference. ']"));
		System.out.println(ab.getText());

		WebElement bc = driver.findElement(By.id("alias"));
		bc.sendKeys("Address");
		System.out.println(bc.getAttribute("value"));

		WebElement cd = driver.findElement(By.xpath("//span[text()='Register']"));
		cd.click();

		Thread.sleep(6000);

		TakesScreenshot za = (TakesScreenshot) driver;

		File zs = za.getScreenshotAs(OutputType.FILE);
		File qw = new File("C:\\Users\\SIRISA B S\\eclipse-workspace\\Selenium_Basic\\screenshot\\mini-project2.png");
		FileHandler.copy(zs, qw);

	}

}
