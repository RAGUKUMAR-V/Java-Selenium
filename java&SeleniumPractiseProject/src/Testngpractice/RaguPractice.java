package Testngpractice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class RaguPractice {
	WebDriver driver=new FirefoxDriver();
	
	@Test(priority = 0)
	public void close_browser() {
		System.out.println("Last execute this");
		driver.quit();
	}
	
	@Test(priority = -1)
	public void get_suggested_options_from_googlesearch() throws InterruptedException {
		
		driver=new FirefoxDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("q")).sendKeys("royal enfield classic 350");
		Thread.sleep(5000);
		List<WebElement> options=driver.findElements(By.xpath("//ul[@role='listbox'] //following ::li // div[@role='option']"));
		Thread.sleep(5000);
		for(WebElement elements:options) {
			String searchoptions=elements.getText();
			System.out.println(searchoptions);
			
		}
	
		
	}
	
	@Test(priority = -3)
	public void testing_testng_annotations() {
		
		System.out.println("First execute this method");
	}
	
	
	

}
