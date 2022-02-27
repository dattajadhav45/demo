package windowsbasedpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver",  "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Automation");
	Thread.sleep(3000);
//	driver.findElement(By.xpath("//input[@type='submit']")).click();
//	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@type='submit']")).sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	
	driver.switchTo().alert().accept();
	Thread.sleep(3000);
	
	 driver.switchTo().alert().dismiss(); 
	Thread.sleep(3000);
	 
	String val=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[4]/a")).getText();
	System.out.println(val);
	
	String va=driver.findElement(By.xpath("//ul[@class='nav navbar-nav']/li[6]/a")).getText();
	System.out.println(va);
	
	driver.switchTo().alert().sendKeys(val);
	Thread.sleep(1000);
	
	driver.close();

	}
}
