package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class base 

{		public WebDriver driver;
		public Properties prop;
		public WebDriver initilizeDriver() throws IOException
		
		{
			prop = new Properties();
			FileInputStream fis=new FileInputStream("D:\\selenium\\workspace\\E2EProject\\src\\main\\java\\resources\\data.properties");
			prop.load(fis);
			String browserName = prop.getProperty("browser");
			
			if(browserName.equals("chrome"))
			{
				//Execute in chrome driver
				System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver(); 
			}
			
			else if (browserName.equals("firefox"))
				
			{
				driver = new FirefoxDriver();
				//Execute in firefox driver
			}
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			return driver;
			
		}
}
