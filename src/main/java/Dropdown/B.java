package Dropdown;

 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class B
{
 public static void main(String[] args) throws InterruptedException {
	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\GRP\\Downloads\\testing automation\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mercurytravels.co.in/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.findElement(By.id("holiday_category_id")).sendKeys("mumbai");
		  	Thread.sleep(3000);
		  WebElement select_holiday_type=driver.findElement(By.xpath("(//div[@class='controls'])[4]/select"));
		  Thread.sleep(3000);
		  	Select s= new Select(select_holiday_type);
		  	s.selectByIndex(2);
		  	Thread.sleep(3000);
		String val=driver.findElement(By.xpath("(//div[@class='controls'])[4]/select")).getText();	
		System.out.println(val);
		String dropdown_val=select_holiday_type.getText();
		System.out.println(dropdown_val);
		driver.close();
}
}
