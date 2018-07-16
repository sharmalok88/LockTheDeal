package TestCase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test12 {

	@Test
	public void getFirefox()
	{
                //System.setProperty("webdriver.gecko.driver", "geckodriver.exe path");
		System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.17.0-win64\\geckodriver-v0.19.1-win64\\geckodriver.exe");
                System.out.println("GetFirefox Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();
	}
	
	@Test
	public void getChorme()
	{
                //System.setProperty("webdriver.chrome.driver", "chromedriver.exe path");
		System.setProperty("webdriver.chrome.driver", "D:\\\\chromedriver.exe");
                System.out.println("GetChrome Method is running on Thread : " + Thread.currentThread().getId());
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.SoftwareTestingMaterial.com");
		driver.close();

	}
}
