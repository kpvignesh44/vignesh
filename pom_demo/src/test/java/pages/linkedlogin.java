package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class linkedlogin {
WebDriver driver;
By username=By.id("username");
By password=By.name("session_password");
By loginbutton=By.xpath("//*[@id=\"app__container\"]/main/div/form/div[3]/button");


public linkedlogin(WebDriver driver)
{
	this.driver=driver;
	
}

public void loginToapp_username(String userid)
{
	driver.findElement(username).sendKeys(userid);
}
public void loginToapp_password(String pwd)
{
	driver.findElement(password).sendKeys(pwd);
}


public void applogin()
{
	driver.findElement(loginbutton).click();
}
}
