package practisepage;

import org.testng.annotations.Test;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class redbus {

	@Test
	public void redbusflow() throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);	

		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//text[@class='placeHolderMainText'] /parent::div
		driver.findElement(By.id("src")).sendKeys("Madurai");
		List<WebElement> element=driver.findElements(By.xpath("//text[@class='placeHolderMainText'] /parent::div"));
		for(WebElement we:element) {
			if(we.equals("Madurai")) {
				we.click();
			}
		}
		
		
		  driver.findElement(By.id("dest")).sendKeys("chennai");
		  //driver.findElement(By.id("search_button")).click();
		 	
	}
	
	
	
	
	
}
