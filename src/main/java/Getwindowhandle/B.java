package Getwindowhandle;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B
{
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486458755421&hvpos=&hvnetw=g&hvrand=13214771473883053282&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040233&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=CjwKCAiA6seQBhAfEiwAvPqu12jKbSSoj9EQDTLzUXKpVntmWKN66a6AuBoCwrAdkP9THJVB9YFQthoCG_YQAvD_BwE");
	Thread.sleep(3000);
	driver.manage().window().maximize();
	Thread.sleep(3000);
	String parent=driver.getWindowHandle();
	System.out.println(parent);
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	Thread.sleep(3000);
	driver.findElement(By.id("nav-search-submit-button")).click();
	Thread.sleep(3000);
	
	Set<String> s = driver.getWindowHandles();
	System.out.println(s);
	
	for(String x:s)
	{
		driver.switchTo().window(x).getTitle().contains("https://www.amazon.in/ref=nav_logo");
	}
	
	driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	Thread.sleep(3000);
	driver.switchTo().window(parent);
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a")).click();
	driver.quit();
}
}
