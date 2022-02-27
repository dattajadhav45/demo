package Scrollupndown;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
	public static void main(String[] args) throws InterruptedException 
	{
	 System.setProperty("webdriver.chrome.driver",   "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.globalsqa.com/demo-site/frames-and-windows/#iFame");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
	//	js.executeScript("window.scrollBy(0,-350)",  "");
	//	Thread.sleep(3000);
		
		js.executeScript("window.scrollBy(0,350)", "");
		 Thread.sleep(3000);
		
	}
}
