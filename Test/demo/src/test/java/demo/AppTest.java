package demo;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
//import org.junit.Test;
import org.testng.annotations.Test;

public class AppTest 
{
	//ChromeOptions chromeOptions = new ChromeOptions();
	WebDriver driver = null;
	@BeforeTest
	public void beforeTest() throws Exception {
		
		//driver = new RemoteWebDriver(new URL("http://localhost:4444"), chromeOptions);
        driver.get("https://flipkart.com/");
	}
	@Test(priority = 1)
	public void testcase_1() throws InterruptedException //Go to Ebay
	{
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
	    int count= allLinks.size();
        System.out.println(count);
	}
	@Test(priority = 2)
	public void testcase_2() throws InterruptedException 
      {
		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		for (WebElement link : allLinks) 
		{
			System.out.println("Link Text: " + link.getText() + " Link URL: " + link.getAttribute("href"));
		}	
	}	
	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}
