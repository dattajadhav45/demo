package Getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A
{
   public static void main(String[] args) throws InterruptedException 
   {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.naukri.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.linkText("Companies")).click();
	Thread.sleep(3000);
	
	Set<String> s=driver.getWindowHandles();
	System.out.println(s);
	
	for(String x:s)
	{
		driver.switchTo().window(x).getTitle().contains("Naukri.com, India’s No.1 Job Site");
	}
	
	driver.findElement(By.xpath("//div[@id='skill']/div/div[2]/input")).sendKeys("Capgemini");
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	
	driver.findElement(By.xpath("(//input[@class='suggestor-input '])[2]")).sendKeys("pune");
	Thread.sleep(3000);
	
	driver.quit();
	
	
	
   }
}
