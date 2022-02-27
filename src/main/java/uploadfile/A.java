package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.dev2qa.com/demo/upload/uploadFileTest.html");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		String CurrentUrl= driver.getCurrentUrl();
		 System.out.println(CurrentUrl);
		 Thread.sleep(3000);
		String getTitle=driver.getTitle();
		System.out.println(getTitle);
	 int count=	driver.findElements(By.tagName( "a")).size();
	 System.out.println(count);
	  
	// String getText = driver.findElement(By.xpath("//input[@type='file']")).getText();
	// System.out.println(getText);
	// Thread.sleep(3000);
	 driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\GRP\\Downloads");
	 Thread.sleep(3000);
	 driver.close();
	}
}
