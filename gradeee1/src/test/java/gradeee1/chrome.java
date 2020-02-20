package gradeee1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class chrome {
	@Test
	public void log()
	{	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\BLTuser.BLT1220\\Desktop\\Selenium\\Selenium\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
	}
}
