package elvee.TestRun;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SampleTest {
	@Test
	public void runner() {
		//Adding code here...
		System.setProperty("webdriver.chrome.driver", "src/main/java/elvee/selenium_drivers/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.yahoo.com");
		
		driver.findElement(By.cssSelector("input#header-search-input")).sendKeys("Hello", Keys.ENTER);
		
		driver.findElements(By.xpath("//div[@id='web']/child::ol/li/descendant::a[1]")).get(1).click();
	}
}
