package Testngpractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testing {

	

	public WebDriver driver;
	
	
	@Test
	public void testing() throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);	
		

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//List<WebElement> login=driver.findElements(By.xpath("//div[@id='login_credentials']/child::br"));
		//div[@id='login_credentials']/text()[preceding-sibling::br]
		List<WebElement> login=driver.findElements(By.xpath("//div[@id='login_credentials']/text()[preceding-sibling::br]"));
		for(WebElement log:login) {
			String tagname=log.getText();
			System.out.println(tagname);
		
		}
		driver.close();
	
}}
