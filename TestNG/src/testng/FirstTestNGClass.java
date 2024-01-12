package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class  FirstTestNGClass  {
 
	public static WebDriver d;

	@Test
	public void f() {
	System.out.println("i am in test");
	d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys("abcd");
	d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys("abcd@123");
	d.findElement(By.xpath("//tbody/tr[3]/td[2]/input[1]")).click();
	}

	@Test
	public void f2() {
	System.out.println("i am in test2");
	}

	@BeforeMethod
	public void beforeMethod() {
	System.out.println("i am in before method");
	}

	@AfterSuite
	public void afterMethod() {
	System.out.println("i am in after method");
	}

	@BeforeClass
	public void beforeClass() {
	System.out.println("i am in before class");
	}

	@AfterClass
	public void afterClass() {
	System.out.println("i am in after class");
	}

	@BeforeTest
	public void beforeTest() {
	System.out.println("i am in before test");
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver-win32\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demo.guru99.com/v4/");
	d.manage().window().maximize();
	}

	@AfterClass
	public void afterTest() {
	System.out.println("i am in after test");
	}

	@BeforeClass
	public void beforeSuite() {
	System.out.println("i am in before suite");
	}

	@AfterSuite
	public void afterSuite() {
	System.out.println("i am in after suite");
	}

}
