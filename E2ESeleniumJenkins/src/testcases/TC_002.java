package testcases;

import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002 {

	@Test
	@org.testng.annotations.Test
	public void testCase1() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/Cellar/chromedriver/2.30/bin/chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		driver.findElementById("email").sendKeys("Hello");
		driver.findElementById("pass").sendKeys("Hello");
		driver.quit();

	}

}
