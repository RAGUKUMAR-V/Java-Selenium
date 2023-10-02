package practisepage;

import java.io.File;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class justpractice {

	
	@Test
	public void startedtesting() throws InterruptedException {
	 WebDriver driver= new FirefoxDriver();
	 JavascriptExecutor js=(JavascriptExecutor)driver;
	 driver.get("https://www.flipkart.com/");
	 Thread.sleep(5000);
	 driver.manage().window().maximize();
	 Thread.sleep(5000);
	 
	 js.executeScript("window.scrollBy(0,5000)");
	 
	 File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	}
	
	
	
}
