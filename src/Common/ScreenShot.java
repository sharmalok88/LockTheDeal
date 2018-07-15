package Common;

import java.io.File;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	ChromeDriver driver;
	Properties pr;
	
	public ScreenShot(ChromeDriver driver,Properties pr) {
		this.driver=driver;
		this.pr = pr;
	}
	
	public void ScreenShot() throws IOException
	{
		File f =driver.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("F:\\Scripts\\screenshots\\"+System.currentTimeMillis()+".png"));
	}
}
