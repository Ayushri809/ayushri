package grower_portal;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class youtube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\AyushriSahu\\Downloads\\chromedriver_win32 (A)\\chromedriver.exe");
    	WebDriver driver = new ChromeDriver(); 
    	driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS); 
    	driver.get("https://www.youtube.com/");
    	System.out.println("url loaded");
    	

	}

}
