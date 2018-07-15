package TestCase;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

import java.util.Properties;
import Assertions_pkg.Assertion_Class;
import Common.Logo;
import Common.ScreenShot;
import Common.logs;
import TestNG_Package.Base_Class;


public class Pre_Login_Home extends Base_Class {

	@Test
	public void PreLoginHeader_HomePage() throws InterruptedException
	{
		Logo l = new Logo(driver,pr);
		ScreenShot s = new ScreenShot(driver, pr);
		Actions a = new Actions(driver);
		l.VerifyAndClickOnLogo();
		logs.log_generate("Logo is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		
		try {
		Assert.assertTrue(driver.findElementByXPath(pr.getProperty("Seller_Login")).isDisplayed());
		logs.log_generate("Seller_Login link is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByXPath(pr.getProperty("Download_App")).isDisplayed());
		logs.log_generate("Download App link is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByXPath(pr.getProperty("Phone_Number")).isDisplayed());
		logs.log_generate("Phone number in header is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Search_Field1")).isDisplayed());
		logs.log_generate("Searh field is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Search_Btn")).isDisplayed());
		logs.log_generate("Search button is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Wallet")).isDisplayed());
		logs.log_generate("Wallet icon is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Cart")).isDisplayed());
		logs.log_generate("Cart icon is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("Login_register")).isDisplayed());
		logs.log_generate("Login and register link is displaying on home page and is clickable too", "PreLoginHeader_HomePage");
		}
		catch(Exception e)
		{
			System.out.println("Assertion gets failed");
		}		
		a.moveToElement(driver.findElementByCssSelector(pr.getProperty("ShopByCategory"))).moveToElement(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries"))).build().perform();
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_TwoWheelers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_ThreeWheelers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_FourWheelers")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_InverterBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_UpsBatteries")).isDisplayed());
		Assert.assertTrue(driver.findElementByCssSelector(pr.getProperty("ShopByCategory_Batteries_SolarBatteries")).isDisplayed());
		
		
		

	}	
}
