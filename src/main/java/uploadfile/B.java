package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B
{
	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");	
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/upload/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\\\Users\\\\GRP\\\\Downloads");
	Thread.sleep(3000);
	driver.close();
	}
}
