package practisepage;

import org.testng.annotations.Test;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class NoBroker {
@Test
	public void nobrokerflow() throws InterruptedException {
	
		
		
		
		WebDriver driver=new FirefoxDriver();	
		

		driver.get("https://www.nobroker.in/mumbai/rent");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//div[@id='searchCity'])[1]")).click();
		Thread.sleep(2000);
		List<WebElement> cities=driver.findElements(By.xpath("//div[contains(@id,'react-select')]"));
		/*
		 * for(int i=0;i<cities.size();i++) {
		 * 
		 * System.out.println(cities.get(i).getText());
		 * 
		 * String city=cities.get(i).getText(); if(city.equals("Chennai")){
		 * cities.get(i).click(); } }
		 */
		for(WebElement city:cities) {
			String cityname=city.getText();
			if(cityname.equals("Greater Noida")) {
				city.click();
			}
		}
		
		

}}
