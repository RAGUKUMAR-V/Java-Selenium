package Testngpractice;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class soucelabpractice implements ITestListener  {
	


	public WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@Test
	public void testing() throws InterruptedException {
		
		WebDriverManager.chromiumdriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);	
		

		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(2000);
		WebElement dropdown=driver.findElement(By.xpath("//select[@class='product_sort_container']"));
		Select select=new Select(dropdown);
		Thread.sleep(2000);
		select.selectByVisibleText("Price (low to high)");
		Thread.sleep(2000);
		String productname=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
		driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']")).click();
		driver.findElement(By.xpath("//a[@class='shopping_cart_link']")).click();
		Thread.sleep(2000);
		String cartprodcut=driver.findElement(By.xpath("//div[text()='Sauce Labs Bike Light']")).getText();
		Assert.assertEquals(productname, cartprodcut);
		driver.findElement(By.xpath("//button[@id='checkout']")).click();
		driver.findElement(By.xpath("//input[@id='first-name']")).sendKeys("Ragu");
		driver.findElement(By.xpath("//input[@id='last-name']")).sendKeys("kumar");
		driver.findElement(By.xpath("//input[@id='postal-code']")).sendKeys("625701");
		driver.findElement(By.xpath("//input[@id='continue']")).click();

		String itemprice=driver.findElement(By.xpath("//div[@class='summary_subtotal_label']")).getText().split(" ")[2];
		System.out.println(itemprice);
		String newprice=itemprice.substring(1);
		
	
		float price1=Float.parseFloat(newprice);
		
		System.out.println(price1);



		String taxprice=driver.findElement(By.xpath("//div[@class='summary_tax_label']")).getText().split(" ")[1];
		System.out.println(taxprice);
		String newtaxprice=taxprice.substring(1);
		float price2=Float.parseFloat(newtaxprice);
		
		System.out.println(price2);
		float calculatedsum=price1+price2;
		System.out.println(calculatedsum);
		
		String pp=driver.findElement(By.xpath("//div[@class='summary_info_label summary_total_label']")).getText().split(" ")[1];
        String sumprice=pp.substring(1);
        float systemsum=Float.parseFloat(sumprice);
        System.out.println(systemsum);
        Assert.assertEquals(calculatedsum, systemsum);


		driver.findElement(By.xpath("//button[@id='finish']")).click();
		String submission=driver.findElement(By.xpath("//h2[@class='complete-header']")).getText();
		System.out.println(submission);
		Assert.assertEquals(submission, "Thank you for your order");
		
	
	
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(file,new File("C:\\Users\\Ragukumar\\eclipse-workspace\\practiseproject\\target\\screenshot.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}


	

}
