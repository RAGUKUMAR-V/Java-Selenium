package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonpractice {
public WebDriver driver;
	
	@Test
	public void amazontest() throws InterruptedException {
	
			WebDriverManager.chromiumdriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);	
			

			driver.get("https://www.amazon.ca/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			Actions action=new Actions(driver);
			WebElement option=driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
			action.moveToElement(option).build().perform();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Find a Gift']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[text()='Kids 8-12']")).click();
			driver.findElement(By.xpath("//span[text()='All prices']")).click();
			driver.findElement(By.xpath("//div[text()='Up to $20']")).click();
			driver.findElement(By.xpath("//i[@class='a-icon a-icon-checkbox']")).click();
			
			
	}
	
	
	
	
	
}
