package TestCase;

import org.testng.annotations.Test;
import java.util.Set;

import org.testng.annotations.Test;

import Common.ScreenShot;
import Common.Video;
import TestNG_Package.Base_Class;

import org.testng.annotations.Test;

public class TestCase_4 extends Base_Class {

	
	@Test
	public void TestCase4()
	{
		Video v = new Video(driver,pr);
		ScreenShot s = new ScreenShot(driver, pr);
		v.video_count();
		v.video_click();
		
		String parent_window = driver.getWindowHandle();
		Set<String> all_windows= driver.getWindowHandles();
		
		for(String s1: all_windows)
		{
			driver.switchTo().window(s1);
		}
		
		v.video_PlayPause();
	}
	
}
