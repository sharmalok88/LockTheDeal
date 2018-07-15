package TestCase;

import org.testng.annotations.Test;

import Common.ScreenShot;
import Common.Video;
import TestNG_Package.Base_Class;

public class TestCase_3 extends Base_Class {


	@Test
	public void TestCase3()
	{
		Video v = new Video(driver,pr);
		ScreenShot s = new ScreenShot(driver, pr);
		v.video_count();
	
	}
	
}
