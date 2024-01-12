package testng;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataProviderDemo {
	public static WebDriver d;

	@Test(dataProvider = "dp")
	public void f(String us, String pw) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver-win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://demo.guru99.com/v4/");
		d.findElement(By.xpath("//tbody/tr[1]/td[2]/input[1]")).sendKeys(us);
		d.findElement(By.xpath("//tbody/tr[2]/td[2]/input[1]")).sendKeys(pw);
		Thread.sleep(1000);

	}

	@DataProvider
	public Object[][] dp() {
		return new Object[][] 
				{ new Object[] { "manu", "1234" }
			//new Object[] { "123", "b" }, 
				};
	}
}
