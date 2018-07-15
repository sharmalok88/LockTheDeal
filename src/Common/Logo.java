package Common;

import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

import Assertions_pkg.Assertion_Class;

public class Logo {
	ChromeDriver driver;
	Properties pr;

	public Logo(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;
	}

	public void verify_Logo() {
		driver.findElementByXPath(pr.getProperty("Logo")).isDisplayed();
	}

	public void VerifyAndClickOnLogo() {
		driver.findElementByXPath(pr.getProperty("Logo")).isDisplayed();
		driver.findElementByXPath(pr.getProperty("Logo")).click();
		String Home_page_title = driver.getTitle();

		System.out.println("messags " + pr.getProperty("HomePageTitle"));

		Assertion_Class.Assert_String_Compare(Home_page_title, pr.getProperty("HomePageTitle"));
	}
}
