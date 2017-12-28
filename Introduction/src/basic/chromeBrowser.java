package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import net.bytebuddy.jar.asm.commons.StaticInitMerger;

public class chromeBrowser {
	
	static WebDriver driver = new ChromeDriver();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/musabgusbi/Documents/workspace/drivers/chromedriver");
		
		WebDriver driverChrome=new ChromeDriver();
		
		//go to goal site
		driverChrome.get("http://www.goal.com/en-gb");
		
		
	}

}
