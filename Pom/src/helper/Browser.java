package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browser
{
	static WebDriver driver;
	
public static WebDriver startbrowser(String Browsername)
{
	if(Browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chrome path\\chromedriver.exe");
     driver=new ChromeDriver();
		
	
	
	
	}
	else if(Browsername.equalsIgnoreCase("firefox"))
	{
		System.setProperty("webdriver.firefox.driver", "C:\\chrome path\\chromdriver.exe");
		 driver=new FirefoxDriver();
			
		
	}
	else if(Browsername.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.internetexplorer.driver", "C:\\chrome path\\chromdriver.exe");
	    driver=new InternetExplorerDriver();
			
		
	}
	driver.get("https://s2.demo.opensourcecms.com/orangehrm/symfony/web/index.php/auth/login");
	return driver;
	
}
}
