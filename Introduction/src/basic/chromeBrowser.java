package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {
	
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/musabgusbi/Documents/workspace/drivers/chromedriver");
		
		//open Chrome browser
		WebDriver driverChrome=new ChromeDriver();
		
		//go to facebook site
		driverChrome.get("https://www.facebook.com");
		
		//look for email field and type text
		
		driverChrome.findElement(By.id("email")).sendKeys("This is my first code!");
		driverChrome.findElement(By.name("pass")).sendKeys("123456");
		driverChrome.findElement(By.linkText("Forgotten account?")).click();
		
		//close current browser session
		driverChrome.close();
		
		
	}

}
