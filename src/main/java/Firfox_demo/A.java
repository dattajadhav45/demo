package Firfox_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class A 
{
   
	  WebDriver driver;
	  
	
	
@BeforeSuite
public void openbrowser()
{
	System.out.println("openbrowser");
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\geckodriver-v0.30.0-win32");
	driver =new FirefoxDriver();
}

@BeforeTest
public void enterurl()
{
	
}

	
	
		
	
  

 
	

}
