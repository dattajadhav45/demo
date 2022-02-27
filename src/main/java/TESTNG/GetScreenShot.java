package TESTNG;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GetScreenShot 
{
   WebDriver driver;
   
   @BeforeSuite
   public void openbrowser()
   {
	   System.out.println("open browser");
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	   driver =new ChromeDriver();
   }
   
   @BeforeTest
   public void enterURL()
   {
	   System.out.println("enter url");
	   driver.get("https://www.mercurytravels.co.in/");
   }
   
   @BeforeClass
   public void maxbrowser()
   {
	   System.out.println("maximazie browser");
	   driver.manage().window().maximize();
   }
   
   @BeforeMethod
   public void getcookies()
   {
	   System.out.println("get cookies");
   }
   
   @Test
   public void login() throws InterruptedException
   {
	   System.out.println("login");
	   Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		driver.findElement(By.xpath("(//a[@data-toggle='modal'])[3]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='email'])[1]")).sendKeys("jadhavdatt45@gmail.com");
		driver.findElement(By.xpath("(//input[@type='password'])[1]")).sendKeys("jadhav@123");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='btn btn-lg btn-primary modal-btn ajax-submit'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='caret'])[6]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[@class='dropdown-menu user-login'])[4]/li[3]/a")).click();
		Thread.sleep(3000);
	 
   }
   
   @AfterMethod
   public void getscreenshot() throws IOException {
	   System.out.println("get screenshot");
	   File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   FileUtils.copyFileToDirectory(src, new File("C:\\Users\\GRP\\eclipse-workspace\\ABC\\AUTOMATION_TESTING_\\ss"));
   }
   
   @AfterClass
   public void deletecookies()
   {
	   System.out.println("deletecookies");
   }
   
   @AfterTest
   public void dbconnection()
   {
	   System.out.println("dbconnection");
   }
   
   @AfterSuite
   public void close()
   {
	   System.out.println("close");
	   driver.close();
   }
}
