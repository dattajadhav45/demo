package windowsbasedpopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",  "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
	}
}
