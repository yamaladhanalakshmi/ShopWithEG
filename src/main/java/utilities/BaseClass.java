package utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public void init()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\reddy\\OneDrive\\Desktop\\DHANA TESTING PRACTICE\\java\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver=new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 driver.manage().window().maximize();
	}
	
	
}
