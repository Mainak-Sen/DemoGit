package testNGPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class GlobalEnvVraiblesSetup {
	
	public WebDriver driver=null;

	@Test
	public void loginsetup() throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\MAINAK SEN\\eclipse-workspace\\testNG\\src\\testNGPackage\\DataDriven.properties");
		prop.load(fis); 
		//System.out.println(prop.getProperty("username"));
		if(prop.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(prop.getProperty("browser").equals("firefox"))
		{
			System.setProperty("webdriver.Firefox.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else
		{
			System.setProperty("webdriver.Firefox.driver", "C:\\Users\\MAINAK SEN\\Webdrivers\\geckodriver.exe");
			driver = new InternetExplorerDriver();
		}
		
		driver.get(prop.getProperty("url"));
		driver.quit();
	}
}
