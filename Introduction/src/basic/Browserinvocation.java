package basic;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Browserinvocation {

	public static void main(String[] args) {
		//FireFox works. download latest geckoDriver for firefox from https://github.com/mozilla/geckodriver/releases
		//store geckoDriver Unix executable  (double click file to test its running port with no error) in Workspace/drivers folder
		System.setProperty("webdriver.gecko.driver", "/Users/musabgusbi/Documents/workspace/drivers/geckodriver");
		WebDriver driverFirefox = new FirefoxDriver();
		driverFirefox.get("www.yahoo.com");
		
		//CHROME works. download latest ChromeDriver from https://chromedriver.storage.googleapis.com/index.html
		//store chromeDriver Unix executable  (double click file to test its running port with no error) in Workspace/drivers folder
		System.setProperty("webdriver.chrome.driver", "/Users/musabgusbi/Documents/workspace/drivers/chromedriver");
		WebDriver driverChrome=new ChromeDriver();
	

	
		
	}

}
