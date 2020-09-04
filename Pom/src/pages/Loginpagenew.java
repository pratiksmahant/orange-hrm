/**
 * 
 */
package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.seleniumhq.jetty9.server.Authentication.User;
import org.testng.Assert;

/**
 * @author pratik
 *
 */
public class Loginpagenew 
{
WebDriver driver;	
public Loginpagenew(WebDriver driver)
{ 
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	
@FindBy(how=How.XPATH,using="//input[@id='txtUsername']")@CacheLookup WebElement username;
@FindBy(how=How.XPATH,using="//input[@id='txtPassword']")@CacheLookup WebElement password;
@FindBy(how=How.XPATH,using="//input[@id='btnLogin']")@CacheLookup WebElement submit;
//OR
@FindBy(xpath="//a[.='Logout']") WebElement logout;
@FindBy(xpath="//span[@id='spanMessage']") WebElement errormessage; 

public void login(String username1,String password1)
{
	username.sendKeys(username1);
	password.sendKeys(password1);
	submit.click();
	
	
	}
public void gettitle()
{
	String title=driver.getTitle();
	System.out.println("title is"+title);
	
	
}
public void geturl()
{
	String url=driver.getCurrentUrl();
	System.out.println("url is:"+url);
	}
public void logout()
{
logout.click();	
}
public void errormess()
{
	String error=errormessage.getText();
	System.out.println("error message is"+error);
	
	}
}
