package draganddrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A
{
public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://demoqa.com/droppable");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	String currentURL=driver.getCurrentUrl();
	System.out.println( currentURL);	
	
	String getTitle= driver.getTitle();
	System.out.println(getTitle);
	
	int count=driver.findElements(By.tagName("a")).size();
	System.out.println(count);
	
	WebElement drag=driver.findElement(By.id("draggable"));
	WebElement drop=driver.findElement(By.id("droppable"));
	Thread.sleep(1000);
	Actions a= new Actions(driver);
	a.dragAndDrop(drag, drop).build().perform();
	Thread.sleep(1000);
	driver.close();
	  
	 
}
}
