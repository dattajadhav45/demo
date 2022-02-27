package Task;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{
public static void main(String[] args) throws InterruptedException 
{
  System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		String parent=driver.getWindowHandle();
		System.out.println(parent);
		
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input")).sendKeys("9970963037");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("jadhav@9243");
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[@class='_1D1L_j']/button")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iphone12");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
		Thread.sleep(3000);
		
	   String a=driver.findElement(By.xpath("(//div[@class='_30jeq3 _1_WHN1'])[24]")).getText();
    	System.out.println(a);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
		Thread.sleep(3000);

		Set<String> s=driver.getWindowHandles();
		System.out.println(s);
		
		for(String x:s)
		{
	 		driver.switchTo().window(x).getTitle().contains("Flipkart\r\n"
	 				+ "Explore Plus");
	 	}
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
		Thread.sleep(3000);
		
	//	 JavascriptExecutor js= (JavascriptExecutor)driver;
	//	 js.executeScript("window.scrollBy(0,350)", "");
	//	 Thread.sleep(3000);
		
     //	String d=driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).getText(); 
	  //  System.out.println(d);
	 //   Thread.sleep(3000);
	
	    driver.switchTo().window(parent);
	    
		driver.findElement(By.xpath("//div[@class='YUhWwv']/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2ObVJD _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@class='_32l7f0'])[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='_1P2-0f']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("datta jadhav");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("9970963037");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("413527");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("renapur");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_1Y2dIb _1Jqgld'])[1]/textarea")).sendKeys("shivaji collage renapur");
		Thread.sleep(3000);
	 
		driver.findElement(By.xpath("(//input[@type='text'])[6]")).sendKeys("renapur chauk");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1JDhFS _3AWRsL']")).click();
		Thread.sleep(3000);
		 
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1seccl _3AWRsL']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _1uR9yB _3dESVI']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//div[@class='_3E8aIl gGqMBW'])[4]/h3/span[2]")).click();
		Thread.sleep(3000);
		driver.quit();
		
		}
}
