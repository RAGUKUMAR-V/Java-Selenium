package practisepage;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class amazon {
@Test
	public void amazonflow() throws InterruptedException {
	
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);	

		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		/*
		 * driver.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]")).click();
		 * Thread.sleep(2000);
		 * driver.findElement(By.id("ap_email")).sendKeys("8098676092");
		 * driver.findElement(By.id("continue")).click(); Thread.sleep(2000);
		 * driver.findElement(By.id("ap_password")).sendKeys("Ragukumar@1463");
		 * driver.findElement(By.id("signInSubmit")).click();
		 */
		  
		  
		 
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Apple iPhone 13 (128GB) - (Product) RED']")).click();
		Thread.sleep(2000);
		String parentwindow=driver.getWindowHandle();
		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
		String childwindow=	it.next();
		driver.switchTo().window(childwindow);
		}
		
		
	
		driver.findElement(By.xpath("//div[@id='buyNow']")).click();
		
		
		 Thread.sleep(2000);
		  driver.findElement(By.id("ap_email")).sendKeys("8098676092");
		  driver.findElement(By.id("continue")).click(); Thread.sleep(2000);
		  driver.findElement(By.id("ap_password")).sendKeys("Ragukumar@1463");
		  driver.findElement(By.id("signInSubmit")).click(); 
		
		
		driver.close();
		
		
		

	}

}
