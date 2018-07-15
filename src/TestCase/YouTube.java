package TestCase;

import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Assertions_pkg.Assertion_Class;
import Common.Login_Class;
import Common.ScreenShot;
import Common.Video;
import Common.logs;
import TestNG_Package.Base_Class;
//import org.automationtesting.excelreport.*;

public class YouTube extends Base_Class {

	@Test
	public void TestCase2() throws InterruptedException, IOException
	{ 
		
		Video v = new Video(driver,pr);
		ScreenShot s = new ScreenShot(driver, pr);
		v.video_count();
		logs.log_generate("Video cont log 1", "TestCase2");
		v.video_click();
		logs.log_generate("Clicked on video", "TestCase2");
		String parent_window = driver.getWindowHandle();
		Set<String> all_windows= driver.getWindowHandles();
		
		for(String s1: all_windows)
		{
			driver.switchTo().window(s1);
		}
		
		v.video_PlayPause();
		s.ScreenShot();
		v.video_like();
		s.ScreenShot();
		
		v.video_subscribe();
		s.ScreenShot();
		Login_Class L = new Login_Class(driver,pr);
		L.LoginFromPopUp();
		
		/*driver.switchTo().window(parent_window);
		System.out.println("parent window");
		driver.navigate().refresh();*/
		driver.findElement(By.cssSelector("button#avatar-btn")).click();
		String actual = (driver.findElement(By.cssSelector("yt-formatted-string#account-name"))).getText();
		System.out.println("You are logged into the account whose account name is :"+actual);
		String expected = "Lokesh Kumar";
		
		Assertion_Class.Assert_String_Compare(actual, expected);
		
		
	}
	
/*	@AfterSuite
	
	public void generate_report() throws Exception
	{
		//System.out.println("===============================================================");
		Xl.generateReport(".\\SuiteReport.xlsx");
	}*/

}