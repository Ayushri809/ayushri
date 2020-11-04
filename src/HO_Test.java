import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HO_Test {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","");
    	WebDriver driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
    	driver.get("https://test.gpa.driscolls.com/");
    	System.out.println("url loaded");
    	driver.findElement(By.name("username")).sendKeys("alternatesa@gmail.com");
    	Thread.sleep(2000);
    	System.out.println("after un");
    	driver.findElement(By.name("password")).sendKeys("Carbon14");
    	Thread.sleep(2000);
    	System.out.println("pwd");
    	driver.findElement(By.id("okta-signin-submit")).submit();
    	
    	// driver.findElement(By.xpath("//label[@id='2']//input[@class='jss270']")).click();
    	
	}}