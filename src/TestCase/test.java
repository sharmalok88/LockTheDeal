package TestCase;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class test {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		List<WebElement> video = driver.findElements(By.cssSelector("img[class='style-scope yt-img-shadow']"));
		int video_count = driver.findElements(By.cssSelector("img[class='style-scope yt-img-shadow']")).size();
		System.out.println("Count of Video on YouTube Home page is : "+video_count);
		System.out.println(video.get(2));
		
		Actions keys = new Actions(driver);
		keys.keyDown(Keys.CONTROL).click(video.get(2)).keyUp(Keys.CONTROL).build().perform();
		
		String parent_window = driver.getWindowHandle();
		Set<String> all_windows= driver.getWindowHandles();
		
		for(String s1: all_windows)
		{
			driver.switchTo().window(s1);
		}
		
		WebElement play_pause_btn = driver.findElement(By.cssSelector("button[class='ytp-play-button ytp-button']"));
		WebElement like_btn = driver.findElement(By.cssSelector("yt-icon[class='style-scope ytd-toggle-button-renderer']"));
		WebElement subscribe_btn = driver.findElement(By.xpath(".//yt-formatted-string[contains(text(),'Subscribe')]"));
		WebElement signin_from_popup = driver.findElement(By.xpath(".//yt-formatted-string[contains(text(),'Sign in')]"));
		
		Thread.sleep(2000L);
		play_pause_btn.click();
		like_btn.click();
		System.out.println("video is liked by the user");
		subscribe_btn.click();
		System.out.println("channel is subscribed by the user");
		signin_from_popup.click();
		System.out.println("Clicking on sign in link from popup");
		WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
		email.sendKeys("lokeshk@wiziq.com");
		WebElement next_btn = driver.findElement(By.xpath(".//span[contains(text(),'Next')]"));
		next_btn.click();
		Thread.sleep(2000L);
		WebElement password = driver.findElement(By.cssSelector("input[type='password']"));
		password.sendKeys("Auth@Lokesh1@");
		WebElement next_btn2 = driver.findElement(By.xpath(".//span[contains(text(),'Next')]"));
		next_btn2.click();
		/*Thread.sleep(4000L);
		WebElement okies = driver.findElement(By.cssSelector("paper-ripple[class='style-scope yt-icon-button circle']"));
		okies.click();
		System.out.println("video is liked by the user");*/
			
		driver.quit();
	}

}
