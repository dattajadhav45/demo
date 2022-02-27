package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A
{
  public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.mercurytravels.co.in/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	 driver.findElement(By.id("holiday_category_id")).sendKeys("mumbai");
	  	Thread.sleep(3000);
	  	
		 	String currentURL=driver.getCurrentUrl();
		     System.out.println(currentURL);
			
			String pagesource=driver.getPageSource();
		 //	 System.out.println(pagesource);
			
			String gettitle=driver.getTitle();
		   	System.out.println(gettitle);
			
		  	int count=driver.findElements(By.tagName("a")).size();
		  	System.out.println(count);
		  	
		  	WebElement select_duration=driver.findElement(By.id("duration_d"));
			 	Thread.sleep(3000);
	     	Select s= new Select(select_duration);
	 	 	s.selectByIndex(4);
	 	 	Thread.sleep(3000);
			
		 	String val=driver.findElement(By.xpath("(//div[@class='collapse navbar-collapse']/ul/li/a)[1]")).getText();
		  	System.out.println(val);
		  	String dropdown_val=select_duration.getText();
		  	System.out.println(dropdown_val);
		  
			
			driver.close();
			
			
}
}
