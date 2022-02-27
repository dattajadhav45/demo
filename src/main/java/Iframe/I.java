package Iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class I
{
public static void main(String[] args) throws InterruptedException 
{
 System.setProperty("webdriver.chrome.driver",   "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFame");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	int count= driver.findElements(By.tagName("iframe")).size();
	 System.out.println(count);
	 
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,-350)",  "");
	Thread.sleep(3000);
	
	driver.findElement(By.id("iFrame")).click();
	Thread.sleep(3000);
	
	WebElement wb=driver.findElement(By.xpath("//*[@id=\"post-2632\"]/div[2]/div/div/div[3]/p/iframe"));
	driver.switchTo().frame(wb);
	Thread.sleep(3000);
	
	driver.findElement(By.id("s")).sendKeys("java");
	Thread.sleep(3000);
	
	 driver.switchTo().defaultContent();
 	js.executeScript("window.scrollBy(0,350)", "");
	 Thread.sleep(3000);
	
 	driver.findElement(By.xpath("//div[@id='menu']/ul/li[2]/a")).click();
 	Thread.sleep(3000);
	driver.close();
}
}
