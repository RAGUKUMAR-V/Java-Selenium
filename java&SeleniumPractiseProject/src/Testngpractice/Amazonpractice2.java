package Testngpractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonpractice2 {
public WebDriver driver;
	
	@Test
	public void amazontest() throws InterruptedException {
	
			WebDriverManager.chromiumdriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);	
			
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.get("https://www.amazon.com/");
			driver.manage().window().maximize();
			
			Thread.sleep(2000);
			
			driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
			Thread.sleep(5000);
			
			
			driver.findElement(By.xpath("//div[text()='Computers']/parent::a")).click();
			Thread.sleep(2000);
			driver.findElement(By.linkText("Laptop Accessories")).click();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,2000)");
			
			driver.findElement(By.xpath("//span[text()='Amazon.com']/preceding-sibling::div")).click();
			WebElement sortdropdown=driver.findElement(By.xpath("//select[@id='s-result-sort-select']"));
			Thread.sleep(2000);
			Select select=new Select(sortdropdown);
			select.selectByVisibleText("Price: High to Low");
			Thread.sleep(2000);
			driver.findElement(By.partialLinkText("Raritan")).click();
			
			driver.close();
			
			
			
			
	}
	
	
	
	
	
}
