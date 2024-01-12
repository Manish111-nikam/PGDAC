package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AutomationParam {
	public static WebDriver d;
	@Parameters({"us"})
	
	@Test(priority = 1)
	public void Dropdown(String us)  {
	Select skill=new Select(d.findElement(By.xpath("//select[@id='Skills']")));
	skill.selectByValue(us);
	}
	
	@Test
public void Open(){
	System.setProperty("webdriver.chrome.driver","D:\\Selenium Data\\chromedriver-win32\\chromedriver.exe");
	d=new ChromeDriver();
	d.get("https://demo.automationtesting.in/Register.html");
}
}
