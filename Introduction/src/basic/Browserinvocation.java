package basic;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		//FireFox works. download latest geckoDriver for FireFox from https://github.com/mozilla/geckodriver/releases
		//store geckoDriver Unix executable  (double click file to test its running port with no error) in Workspace/drivers folder
		System.setProperty("webdriver.gecko.driver", "/Users/musabgusbi/Documents/workspace/drivers/geckodriver");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("https://uk.yahoo.com/?p=us");
	
		
		//CHROME works. download latest ChromeDriver from https://chromedriver.storage.googleapis.com/index.html
		//store chromeDriver Unix executable  (double click file to test its running port with no error) in Workspace/drivers folder
		System.setProperty("webdriver.chrome.driver", "/Users/musabgusbi/Documents/workspace/drivers/chromedriver");
		WebDriver driverChrome=new ChromeDriver();
		
		//go to goal site
		driverChrome.get("http://www.goal.com/en-gb");
		
		//get site title & page source in console
		System.out.println(driverChrome.getTitle());
		System.out.println(driverChrome.getCurrentUrl());
		
		//close current browser session
		driverChrome.close();
		
		
		//Safari browser download driver as Plugin onto Safari browser (no need for set property)
		WebDriver driverSafari=new SafariDriver();
		
		//go to BBC site
		driverSafari.get("https://www.bbc.co.uk/");
		
		//get site title
		System.out.println(driverSafari.getTitle());
			
		//close current browser session
		driverSafari.close();
		
	}

}
