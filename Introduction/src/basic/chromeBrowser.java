package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.commons.StaticInitMerger;

public class chromeBrowser {
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "/Users/musabgusbi/Documents/workspace/drivers/chromedriver");
		
		//open Chrome browser
		WebDriver driverChrome=new ChromeDriver();
		
		//go to goal site
		driverChrome.get("http://www.goal.com/en-gb");
		//TEST TO SEE GIT UPDATES MASTER!
		
	}

}
