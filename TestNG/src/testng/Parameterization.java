package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization  {
	public static WebDriver d;
	@Parameters({ "us", "ow" })
	@Test(priority = 1)
	public void login(String us, String ow) throws InterruptedException {
	d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(us);
	Thread.sleep(1000);
	d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(ow);
	Thread.sleep(1000);

	d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).clear();
	d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).clear();

	//d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();

	}
	@Parameters({ "us1", "ow1" })
	@Test(priority = 2)
	public void logins(String us1, String ow1) throws InterruptedException {
	d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(us1);
	d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(ow1);
	}

	@Test
	public void reg() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver-win32\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demo.guru99.com/v4/");
	}
}
