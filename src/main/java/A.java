import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.snapdeal.com/");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String url=driver.getCurrentUrl();
	System.out.println(url);
	Thread.sleep(3000);
	int count=driver.findElements(By.tagName("a")).size();
	System.out.println(count);
	Thread.sleep(3000);
	String title=driver.getTitle();
	System.out.println(title);
	Thread.sleep(3000);
	
	driver.findElement(By.name("keyword")).sendKeys("dress");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//button[@class='searchformButton col-xs-4 rippleGrey']")).click();
	Thread.sleep(3000);
	
	driver.navigate().back();
	Thread.sleep(3000);
	
	String text =driver.findElement(By.xpath("//span[@class='topHooks hooksContents dp-widget-link helpCentrDiv']/a")).getText();
	System.out.println(text);
	Thread.sleep(3000);
	
	driver.navigate().forward();
	Thread.sleep(3000);
	
	 JavascriptExecutor js= (JavascriptExecutor)driver;
	 js.executeScript("window.scrollBy(0,350)", "");
	 Thread.sleep(3000);
	 
	String val=driver.findElement(By.id("display-price-660774550876")).getText();
    System.out.println(val);
	Thread.sleep(3000);
	
	driver.close();
	 
}
}
