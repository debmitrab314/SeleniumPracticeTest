package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public BaseClass() 
	{
		WebDriver driver;
		System.setProperty("Webdriver.Chrome.Driver","C:\\Users\\debmitra\\chromedriver_win32");
		driver = new ChromeDriver();
		driver.get("https://www.kantimehospice.net/");
	}


}
