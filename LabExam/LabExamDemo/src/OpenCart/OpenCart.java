package OpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class OpenCart {
	public static WebDriver d;

//	@Parameters({"us"})
	@Test(priority = 1)
	public void login() {
		d.findElement(By.xpath("//input[@id='input-username']")).sendKeys("Manish123");
		d.findElement(By.xpath("//input[@id='input-firstname']")).sendKeys("Manish");
		d.findElement(By.xpath("//input[@id='input-lastname']")).sendKeys("Nikam");
		d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Manish@gmail.com");
		Select skill = new Select(d.findElement(By.xpath("//select[@id='input-country']")));
		skill.selectByVisibleText("india");
		d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234");

	}

	@Test(priority = 2)
	public void Redirect() {
		d.findElement(By.xpath("//header/nav[1]/div[1]/div[2]/div[1]/a[1]")).click();
		d.findElement(By.xpath("//input[@id='input-email']")).sendKeys("Manish@gmail.com");
		String str = d.findElement(By.xpath("//input[@id='input-email']")).getAttribute("value");
		System.out.println(str);

		d.findElement(By.xpath("//input[@id='input-password']")).sendKeys("1234");
		String str1 = d.findElement(By.xpath("//input[@id='input-password']")).getAttribute("value");
		System.out.println(str1);

		d.findElement(By.xpath("//body/div[@id='account-login']/div[2]/div[1]/div[1]/form[1]/div[3]/div[1]/button[1]"))
				.click();

	}

	@Test
	public void reg() {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium Data\\chromedriver-win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://www.opencart.com/index.php?route=account/register");
		System.out.println("current URL" + d.getCurrentUrl());
	}
}
