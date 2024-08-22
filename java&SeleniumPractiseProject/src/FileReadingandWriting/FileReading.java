package FileReadingandWriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class FileReading {

	@Test
	public void reading() throws IOException {
		
		String filepath="E://New.txt/";
		FileReader reader=new FileReader(filepath);
		BufferedReader read=new BufferedReader(reader);
		String data;
		while((data=read.readLine())!=null) {
			System.out.println(data);
		}}
		
		@Test(groups= "sanity")
		public void writing() throws IOException {
			
			String filepath="E://New.txt/";
			String content="addign from selenium using file writer using buffered";
			FileWriter write=new FileWriter(filepath);
			
			  BufferedWriter writer=new BufferedWriter(write);
			  writer.write(content);
			  writer.close();
			  System.out.println("sanity groups");
			 
	}
	
		@Test(dependsOnMethods="writing")
		public void readingconfig() throws IOException {
			FileInputStream stream =new FileInputStream("config.properties");
			Properties property=new Properties();
			property.load(stream);
			String browser=property.getProperty("Browser");
			if (browser.equalsIgnoreCase("CHROME")) {
				WebDriver driver =new ChromeDriver();
				driver.quit();
			}else if(browser.equalsIgnoreCase("INTERNETEXPLORER")){
				WebDriver driver =new InternetExplorerDriver();
				driver.quit();
			}else if(browser.equalsIgnoreCase("FIREFOX")){
				WebDriver driver =new FirefoxDriver();
				driver.quit();
			}
			
			
			}
		
	

	
	
}
