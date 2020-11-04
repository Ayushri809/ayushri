package grower_portal;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Super_admin
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AyushriSahu\\Downloads\\chromedriver_win32 (A)\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
    	driver.get("https://dev.gpa.driscolls.com/");
    	System.out.println("url loaded");
    	driver.findElement(By.name("username")).sendKeys("alternatesa@gmail.com");
    	Thread.sleep(2000);
    	System.out.println("after un");
    	driver.findElement(By.name("password")).sendKeys("Carbon14");
    	Thread.sleep(2000);
    	System.out.println("pwd");
    	driver.findElement(By.id("okta-signin-submit")).submit();
    	Thread.sleep(2000);
        driver.findElement(By.xpath("//label[@id='2']//input[@class='jss270']")).click();
    	Thread.sleep(2000);
    	driver.findElement(By.id("outlined-required")).sendKeys("Ayushri");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[@class='jss149 jss185']//div[2]//div[1]//div[1]//div[1]//input[1] ")).sendKeys("sahu");
    	Thread.sleep(2000);
    	driver.findElement(By.xpath("//div[3]//div[1]//div[1]//div[1]//input[1]  ")).sendKeys("ayushri.sahuqq@driscolls.com");
    	Thread.sleep(2000);
    	System.out.println("gmail");
    	driver.findElement(By.xpath("//div[text()='Select Preferred Language']")).click();
    	Thread.sleep(2000);
    	System.out.println("dropdown1");
    	driver.findElement(By.xpath("//div[text()='Spanish']")).click();
    	Thread.sleep(2000);
    	System.out.println("lang");
    	driver.findElement(By.xpath("//div[text()='Select Country']")).click();
    	Thread.sleep(2000);
    	System.out.println("dropdown2");
    	driver.findElement(By.xpath("//div[text()='Australia']")).click();
    	System.out.println("country");
    	Thread.sleep(2000);
    	
    	driver.findElement(By.xpath("//span[text()='CREATE USER']")).click();
    	System.out.println("user created");
    	Thread.sleep(4000);
    	
    
    	String Handle=Super_admin.SwitchTopopups(driver); 
    	driver.findElement(By.xpath("//span[contains(text(),'Yes')]")).click();
    	Thread.sleep(2000);
    	SwitchBackToParent(Handle,driver);
    	Thread.sleep(2000);
    	System.out.println("Popup clicked");
    	
    	
  
    	driver.findElement(By.xpath("//div[text()='Select Districts']")).click();
    	System.out.println("district dropsdowm");
    	Thread.sleep(2000);
   	
    	driver.findElement(By.xpath("//div[text()='Northern California']")).click();
    	Thread.sleep(2000);
  
    	driver.findElement(By.xpath("//div[text()='Southern California']")).click();
    	System.out.println("Select Districts");
     	Thread.sleep(2000);
   	
    	driver.findElement(By.xpath("//p[text()='ADD']" )).click();
    	driver.findElement(By.xpath("//*[@class='jss87']" )).click();
    	System.out.println("add district");
    	Thread.sleep(2000);
   	
    	
    	
  	
   	driver.findElement(By.xpath("//span[text()='SAVE & SEND']" )).click();
  	System.out.println("send welcomeletter");    	
   	return;
    	
    	 
	}

	public static String SwitchTopopups(WebDriver driver1)
	{
		 System.out.println("inside methods");
			String parentWindowHandler = driver1.getWindowHandle(); // Store your parent window
			String subWindowHandler = null;
			
	
			Set<String> handles = driver1.getWindowHandles(); // get all window handles
			Iterator<String> iterator = handles.iterator();
			while (iterator.hasNext()){
			    subWindowHandler = iterator.next();
			}
			
			
			driver1.switchTo().window(subWindowHandler);
			
			
	  return parentWindowHandler;
	}
	
	public static  void SwitchBackToParent(String parentWindowHandler,WebDriver driver)
	{
		driver.switchTo().window(parentWindowHandler);  // switch 

	}

	
	

	}