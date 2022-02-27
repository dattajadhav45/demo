package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class C 
{
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.mercurytravels.co.in/");
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
 	   
 	  driver.findElement(By.xpath("(//input[@type='text'])[24]")).sendKeys("mumbai");
	    Thread.sleep(2000);
	//    driver.findElement(By.id("holiday_category_id")).sendKeys("pune");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//a[@class='font14'])[10]")).click();
	 //  driver.findElement(By.xpath("(//a[@class='font14'])[10]")).sendKeys(Keys.ENTER);
	    Thread.sleep(3000);
	    driver.findElement(By.xpath(" //input[@id='holiday_category_id']")).clear();
	   Thread.sleep(2000);
	   driver.close();  
	  
	
		
		
	

}
}
