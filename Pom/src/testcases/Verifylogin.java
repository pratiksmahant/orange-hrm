package testcases;

import java.io.IOException;
import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import helper.Browser;
import helper.Screenshot;
import pages.Loginpagenew;

public class Verifylogin
{
	WebDriver driver;
	Loginpagenew  loginp;
	@BeforeTest
	public void beforetest()
	{
		driver=Browser.startbrowser("chrome");
		
	}
@Test()
public void enterlogin() throws IOException
{

	//orr
	//Loginpagenew loginp=PageFactory.initElements(driver,Loginpagenew.class);
	 try {
		loginp=new Loginpagenew(driver);
		
		loginp.login("opensourcecms","opensourcecms");
		loginp.gettitle();
		loginp.logout();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
}
@Test()
public void vlip()
{
	 loginp=new Loginpagenew(driver);
	loginp.login("opensourcecms","opensourcecmp");
	loginp.errormess();
	}



@Test()
public void geturl()
{
	loginp.geturl();
	
	}
@AfterMethod
public void screenshot(ITestResult result) throws Exception
{
	if(ITestResult.FAILURE==result.getStatus())
       {
	     Screenshot.screenshot(driver,result.getName() );
	   }
	
}
@AfterTest
public void aftertest()
{
	driver.quit();
	}


}
