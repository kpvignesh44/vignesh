package testcase;

import org.junit.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import library.wrapperex;
import pages.linkedlogin;

public class loggingtestcase extends wrapperex{
	@BeforeClass
	public void startup()
	{
		launchapp("chrome","https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
	}
@Test
public void login()
{linkedlogin lpage=new linkedlogin(driver);
lpage. loginToapp_username("vignesh@gmail.com");
lpage.loginToapp_password("hygaghafh");
lpage.applogin();
}
@AfterClass
public void close()
{
	driver.close();
}


}
