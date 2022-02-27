package TESTNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PriorityGivenNotgiven {
	 WebDriver driver;
	  
	  @BeforeSuite
	  public void openbrowser()
	  {
		 System.out.println("open browser");
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
		 driver= new ChromeDriver();
	      
	  }
	  
	  @BeforeTest
	   public void enterURL()
	   {
		  System.out.println("enter url");
		  driver.get("https://www.mercurytravels.co.in/");	
	   }
	  
	  @BeforeClass
	  public void maxbrowser()
	  {  System.out.println("maximazie browser");
		  driver.manage().window().maximize();
	  }
	  
	  @BeforeMethod
	  public void getcookies()
	  {
		  System.out.println("get cookies");
	  }
	  
	  @Test (priority=1)
	  public void login() throws InterruptedException
	  {
		  System.out.println("login");
		  Thread.sleep(3000);
		  Actions a= new Actions(driver);
		  a.moveToElement(driver.findElement(By.xpath("(//ul[@class='nav navbar-nav navbar-right margin-right-logo']/li/a)[1]"))).build().perform();
		  Thread.sleep(3000);
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
	  @Test(priority=-2)
	  public void login_two() throws InterruptedException
	  {
		  System.out.println("login_two");
		  driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		  Thread.sleep(3000);
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
	  
	  @Test 
	  public void login_three() throws InterruptedException
	  {
		  System.out.println("login_three");
		  driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]")).click();
		  Thread.sleep(3000);
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
	  public void getscreenshot()
	  {
		  System.out.println("get screen shot");
	  }
	  
	  @AfterClass
	  public void deletecookies()
	  {
		  System.out.println("delete cookies");
	  }
	  
	  @AfterTest
	  public void dbconnectionclosed()
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
}
